/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Worksheet.java">
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

package com.aspose.cells.cloud.editor;

import java.util.Objects;

/**
 * One worksheet returned by {@link Editor#listWorksheets}.
 */
public final class Worksheet {

    private final String name;
    private final String type;

    /**
     * @param name the worksheet name
     * @param type the sheet type (for example {@code "Worksheet"})
     */
    public Worksheet(String name, String type) {
        this.name = name == null ? "" : name;
        this.type = type == null ? "" : type;
    }

    /** @return the worksheet name. */
    public String getName() {
        return name;
    }

    /** @return the sheet type. */
    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Worksheet)) {
            return false;
        }
        Worksheet that = (Worksheet) other;
        return name.equals(that.name) && type.equals(that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    @Override
    public String toString() {
        return "Worksheet{name='" + name + "', type='" + type + "'}";
    }
}
