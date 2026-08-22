package com.aspose.cells.cloud;

import java.io.File;

/**
 * A file part source for {@code multipart/form-data} uploads.
 *
 * <p>Unifies the three ways a file can be supplied to a request: a local path ({@link String}), a
 * {@link File}, or in-memory bytes ({@code byte[]}). The generated request classes accept any of
 * these; when the request executes, {@link CellsCloudClient} reads the wrapped source and sends it
 * as a multipart file part.</p>
 *
 * <p>A {@code FormFile} is immutable. Use the static factories to create one; they validate the
 * input up front and throw {@link IllegalArgumentException} on a missing path, file name, or
 * data.</p>
 */
public final class FormFile {

    private final File file;            // null when data-based
    private final byte[] data;          // null when file-based
    private final String fileName;
    private final String contentType;

    private FormFile(File file, byte[] data, String fileName, String contentType) {
        this.file = file;
        this.data = data;
        this.fileName = fileName;
        this.contentType = contentType;
    }

    /** Wraps a local file path. The file is read when the request executes. */
    public static FormFile ofPath(String path) {
        if (path == null || path.isEmpty()) throw new IllegalArgumentException("path is required");
        return of(new File(path));
    }

    /** Wraps a {@link File}. The file is read when the request executes. */
    public static FormFile of(File file) {
        if (file == null) throw new IllegalArgumentException("file is required");
        return new FormFile(file, null, file.getName(), null);
    }

    /** Wraps in-memory bytes sent under the given file name. */
    public static FormFile of(byte[] data, String fileName) {
        if (data == null) throw new IllegalArgumentException("data is required");
        if (fileName == null || fileName.isEmpty()) throw new IllegalArgumentException("fileName is required");
        return new FormFile(null, data, fileName, null);
    }

    /** Wraps in-memory bytes with an explicit content type. */
    public static FormFile of(byte[] data, String fileName, String contentType) {
        FormFile base = of(data, fileName);
        return new FormFile(null, base.data, base.fileName, contentType);
    }

    /** @return the wrapped file, or {@code null} when this part is byte-based. */
    public File getFile() { return file; }

    /** @return the wrapped bytes, or {@code null} when this part is file-based. */
    public byte[] getData() { return data; }

    /**
     * @return the file name sent in the {@code Content-Disposition} header: the wrapped file's name,
     *         or the explicit name given for byte-based parts.
     */
    public String getFileName() {
        return fileName != null ? fileName : (file != null ? file.getName() : null);
    }

    /** @return the content type of the part, or {@code null} to fall back on the client default. */
    public String getContentType() { return contentType; }

    /** @return true when backed by a {@link File} on disk. */
    public boolean isFile() { return file != null; }

    /** @return true when backed by in-memory bytes. */
    public boolean isBytes() { return data != null; }
}
