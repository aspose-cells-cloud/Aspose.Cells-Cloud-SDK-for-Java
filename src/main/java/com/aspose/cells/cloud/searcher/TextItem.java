/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TextItem.java">
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

package com.aspose.cells.cloud.searcher;

import java.util.Objects;

/**
 * A single text match returned by the search/content endpoints.
 */
public final class TextItem {

    private final String text;
    private final String worksheet;
    private final String position;

    /**
     * @param text      the matched text value
     * @param worksheet the worksheet that contains the match
     * @param position  the match location (for example {@code "Cell:E35"})
     */
    public TextItem(String text, String worksheet, String position) {
        this.text = text == null ? "" : text;
        this.worksheet = worksheet == null ? "" : worksheet;
        this.position = position == null ? "" : position;
    }

    /** @return the matched text value. */
    public String getText() {
        return text;
    }

    /** @return the worksheet that contains the match. */
    public String getWorksheet() {
        return worksheet;
    }

    /** @return the match location, for example {@code "Cell:E35"}. */
    public String getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextItem)) {
            return false;
        }
        TextItem that = (TextItem) other;
        return text.equals(that.text)
                && worksheet.equals(that.worksheet)
                && position.equals(that.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, worksheet, position);
    }

    @Override
    public String toString() {
        return "TextItem{text='" + text + "', worksheet='" + worksheet
                + "', position='" + position + "'}";
    }
}
