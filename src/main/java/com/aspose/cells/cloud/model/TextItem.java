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

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TextItem {

    @SerializedName("Filename")
    @JsonProperty("Filename")
    private String filename;

    public TextItem filename(String filename) {
        this.filename = filename;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @SerializedName("Worksheet")
    @JsonProperty("Worksheet")
    private String worksheet;

    public TextItem worksheet(String worksheet) {
        this.worksheet = worksheet;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getWorksheet() {
        return worksheet;
    }

    public void setWorksheet(String worksheet) {
        this.worksheet = worksheet;
    }

    @SerializedName("Position")
    @JsonProperty("Position")
    private String position;

    public TextItem position(String position) {
        this.position = position;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @SerializedName("Content")
    @JsonProperty("Content")
    private String content;

    public TextItem content(String content) {
        this.content = content;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TextItem other = (TextItem) o;
        return Objects.equals(this.filename, other.filename)
            && Objects.equals(this.worksheet, other.worksheet)
            && Objects.equals(this.position, other.position)
            && Objects.equals(this.content, other.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filename, worksheet, position, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TextItem {\n");
        sb.append("    filename: ").append(filename).append("\n");
        sb.append("    worksheet: ").append(worksheet).append("\n");
        sb.append("    position: ").append(position).append("\n");
        sb.append("    content: ").append(content).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
