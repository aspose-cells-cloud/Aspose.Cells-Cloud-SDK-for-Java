/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="WorkbookRef.java">
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

package com.aspose.cells.cloud;

/**
 * Locates a workbook file in Aspose.Cells Cloud storage for the convenience
 * facade APIs.
 *
 * <p>{@code name} is required; {@code folder} and {@code storageName} are
 * optional. This is the Java equivalent of the Python/Go {@code WorkbookRef}
 * value type.</p>
 */
public final class WorkbookRef {

    private final String name;
    private final String folder;
    private final String storageName;

    /**
     * Creates a reference to a cloud workbook with no folder or storage name.
     *
     * @param name the workbook file name in cloud storage (required)
     */
    public WorkbookRef(String name) {
        this(name, "", "");
    }

    /**
     * Creates a reference to a cloud workbook.
     *
     * @param name        the workbook file name in cloud storage (required)
     * @param folder      the cloud folder that contains the file (optional)
     * @param storageName the cloud storage name (optional)
     */
    public WorkbookRef(String name, String folder, String storageName) {
        this.name = name == null ? "" : name;
        this.folder = folder == null ? "" : folder;
        this.storageName = storageName == null ? "" : storageName;
    }

    /** @return a reference to a cloud workbook with the given file name. */
    public static WorkbookRef of(String name) {
        return new WorkbookRef(name);
    }

    /** @return the workbook file name in cloud storage (required). */
    public String getName() {
        return name;
    }

    /** @return the cloud folder that contains the file, or an empty string. */
    public String getFolder() {
        return folder;
    }

    /** @return the cloud storage name, or an empty string. */
    public String getStorageName() {
        return storageName;
    }
}
