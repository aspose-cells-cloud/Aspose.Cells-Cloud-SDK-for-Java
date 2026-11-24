/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="MarkdownSaveOptions.java">
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

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MarkdownSaveOptions extends SaveOptions {

    @SerializedName("Encoding")
    @JsonProperty("Encoding")
    private String encoding;

    public MarkdownSaveOptions encoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    @SerializedName("FormatStrategy")
    @JsonProperty("FormatStrategy")
    private String formatStrategy;

    public MarkdownSaveOptions formatStrategy(String formatStrategy) {
        this.formatStrategy = formatStrategy;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getFormatStrategy() {
        return formatStrategy;
    }

    public void setFormatStrategy(String formatStrategy) {
        this.formatStrategy = formatStrategy;
    }

    @SerializedName("LineSeparator")
    @JsonProperty("LineSeparator")
    private String lineSeparator;

    public MarkdownSaveOptions lineSeparator(String lineSeparator) {
        this.lineSeparator = lineSeparator;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getLineSeparator() {
        return lineSeparator;
    }

    public void setLineSeparator(String lineSeparator) {
        this.lineSeparator = lineSeparator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        MarkdownSaveOptions other = (MarkdownSaveOptions) o;
        return Objects.equals(this.encoding, other.encoding)
            && Objects.equals(this.formatStrategy, other.formatStrategy)
            && Objects.equals(this.lineSeparator, other.lineSeparator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encoding, formatStrategy, lineSeparator, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarkdownSaveOptions {\n");
        sb.append("    encoding: ").append(encoding).append("\n");
        sb.append("    formatStrategy: ").append(formatStrategy).append("\n");
        sb.append("    lineSeparator: ").append(lineSeparator).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
