/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ImportPictureOption.java">
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

public class ImportPictureOption extends ImportOption {

    @SerializedName("UpperLeftRow")
    @JsonProperty("UpperLeftRow")
    private Integer upperLeftRow;

    public ImportPictureOption upperLeftRow(Integer upperLeftRow) {
        this.upperLeftRow = upperLeftRow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getUpperLeftRow() {
        return upperLeftRow;
    }

    public void setUpperLeftRow(Integer upperLeftRow) {
        this.upperLeftRow = upperLeftRow;
    }

    @SerializedName("UpperLeftColumn")
    @JsonProperty("UpperLeftColumn")
    private Integer upperLeftColumn;

    public ImportPictureOption upperLeftColumn(Integer upperLeftColumn) {
        this.upperLeftColumn = upperLeftColumn;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getUpperLeftColumn() {
        return upperLeftColumn;
    }

    public void setUpperLeftColumn(Integer upperLeftColumn) {
        this.upperLeftColumn = upperLeftColumn;
    }

    @SerializedName("LowerRightRow")
    @JsonProperty("LowerRightRow")
    private Integer lowerRightRow;

    public ImportPictureOption lowerRightRow(Integer lowerRightRow) {
        this.lowerRightRow = lowerRightRow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getLowerRightRow() {
        return lowerRightRow;
    }

    public void setLowerRightRow(Integer lowerRightRow) {
        this.lowerRightRow = lowerRightRow;
    }

    @SerializedName("LowerRightColumn")
    @JsonProperty("LowerRightColumn")
    private Integer lowerRightColumn;

    public ImportPictureOption lowerRightColumn(Integer lowerRightColumn) {
        this.lowerRightColumn = lowerRightColumn;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getLowerRightColumn() {
        return lowerRightColumn;
    }

    public void setLowerRightColumn(Integer lowerRightColumn) {
        this.lowerRightColumn = lowerRightColumn;
    }

    @SerializedName("Filename")
    @JsonProperty("Filename")
    private String filename;

    public ImportPictureOption filename(String filename) {
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

    @SerializedName("Data")
    @JsonProperty("Data")
    private String data;

    public ImportPictureOption data(String data) {
        this.data = data;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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
        ImportPictureOption other = (ImportPictureOption) o;
        return Objects.equals(this.upperLeftRow, other.upperLeftRow)
            && Objects.equals(this.upperLeftColumn, other.upperLeftColumn)
            && Objects.equals(this.lowerRightRow, other.lowerRightRow)
            && Objects.equals(this.lowerRightColumn, other.lowerRightColumn)
            && Objects.equals(this.filename, other.filename)
            && Objects.equals(this.data, other.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(upperLeftRow, upperLeftColumn, lowerRightRow, lowerRightColumn, filename, data, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportPictureOption {\n");
        sb.append("    upperLeftRow: ").append(upperLeftRow).append("\n");
        sb.append("    upperLeftColumn: ").append(upperLeftColumn).append("\n");
        sb.append("    lowerRightRow: ").append(lowerRightRow).append("\n");
        sb.append("    lowerRightColumn: ").append(lowerRightColumn).append("\n");
        sb.append("    filename: ").append(filename).append("\n");
        sb.append("    data: ").append(data).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
