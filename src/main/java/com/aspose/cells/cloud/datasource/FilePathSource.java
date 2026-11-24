/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FilePathSource.java">
 *   Copyright (c) 2026 Aspose.Cells Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------
 */

package com.aspose.cells.cloud.datasource;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Reads a spreadsheet from a local file path.
 */
public final class FilePathSource implements DataSource {

    private final Path path;

    /**
     * @param path the local file path
     */
    public FilePathSource(String path) {
        if (path == null || path.isEmpty()) {
            throw new IllegalArgumentException("path is required");
        }
        this.path = Paths.get(path);
    }

    /**
     * @param path the local file path
     */
    public FilePathSource(Path path) {
        if (path == null) {
            throw new IllegalArgumentException("path is required");
        }
        this.path = path;
    }

    /** @return the wrapped path. */
    public Path getPath() {
        return path;
    }

    @Override
    public byte[] read() {
        try {
            return Files.readAllBytes(path);
        } catch (IOException e) {
            throw new UncheckedIOException("failed to read spreadsheet: " + path, e);
        }
    }
}
