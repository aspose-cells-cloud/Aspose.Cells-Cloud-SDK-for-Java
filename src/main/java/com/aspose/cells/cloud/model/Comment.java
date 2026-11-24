/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Comment.java">
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

public class Comment extends LinkElement {

    @SerializedName("CellName")
    @JsonProperty("CellName")
    private String cellName;

    public Comment cellName(String cellName) {
        this.cellName = cellName;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    @SerializedName("Author")
    @JsonProperty("Author")
    private String author;

    public Comment author(String author) {
        this.author = author;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @SerializedName("HtmlNote")
    @JsonProperty("HtmlNote")
    private String htmlNote;

    public Comment htmlNote(String htmlNote) {
        this.htmlNote = htmlNote;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getHtmlNote() {
        return htmlNote;
    }

    public void setHtmlNote(String htmlNote) {
        this.htmlNote = htmlNote;
    }

    @SerializedName("Note")
    @JsonProperty("Note")
    private String note;

    public Comment note(String note) {
        this.note = note;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @SerializedName("AutoSize")
    @JsonProperty("AutoSize")
    private Boolean autoSize;

    public Comment autoSize(Boolean autoSize) {
        this.autoSize = autoSize;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAutoSize() {
        return autoSize;
    }

    public void setAutoSize(Boolean autoSize) {
        this.autoSize = autoSize;
    }

    @SerializedName("IsVisible")
    @JsonProperty("IsVisible")
    private Boolean isVisible;

    public Comment isVisible(Boolean isVisible) {
        this.isVisible = isVisible;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    @SerializedName("Width")
    @JsonProperty("Width")
    private Integer width;

    public Comment width(Integer width) {
        this.width = width;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @SerializedName("Height")
    @JsonProperty("Height")
    private Integer height;

    public Comment height(Integer height) {
        this.height = height;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @SerializedName("TextHorizontalAlignment")
    @JsonProperty("TextHorizontalAlignment")
    private String textHorizontalAlignment;

    public Comment textHorizontalAlignment(String textHorizontalAlignment) {
        this.textHorizontalAlignment = textHorizontalAlignment;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTextHorizontalAlignment() {
        return textHorizontalAlignment;
    }

    public void setTextHorizontalAlignment(String textHorizontalAlignment) {
        this.textHorizontalAlignment = textHorizontalAlignment;
    }

    @SerializedName("TextOrientationType")
    @JsonProperty("TextOrientationType")
    private String textOrientationType;

    public Comment textOrientationType(String textOrientationType) {
        this.textOrientationType = textOrientationType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTextOrientationType() {
        return textOrientationType;
    }

    public void setTextOrientationType(String textOrientationType) {
        this.textOrientationType = textOrientationType;
    }

    @SerializedName("TextVerticalAlignment")
    @JsonProperty("TextVerticalAlignment")
    private String textVerticalAlignment;

    public Comment textVerticalAlignment(String textVerticalAlignment) {
        this.textVerticalAlignment = textVerticalAlignment;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTextVerticalAlignment() {
        return textVerticalAlignment;
    }

    public void setTextVerticalAlignment(String textVerticalAlignment) {
        this.textVerticalAlignment = textVerticalAlignment;
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
        Comment other = (Comment) o;
        return Objects.equals(this.cellName, other.cellName)
            && Objects.equals(this.author, other.author)
            && Objects.equals(this.htmlNote, other.htmlNote)
            && Objects.equals(this.note, other.note)
            && Objects.equals(this.autoSize, other.autoSize)
            && Objects.equals(this.isVisible, other.isVisible)
            && Objects.equals(this.width, other.width)
            && Objects.equals(this.height, other.height)
            && Objects.equals(this.textHorizontalAlignment, other.textHorizontalAlignment)
            && Objects.equals(this.textOrientationType, other.textOrientationType)
            && Objects.equals(this.textVerticalAlignment, other.textVerticalAlignment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cellName, author, htmlNote, note, autoSize, isVisible, width, height, textHorizontalAlignment, textOrientationType, textVerticalAlignment, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Comment {\n");
        sb.append("    cellName: ").append(cellName).append("\n");
        sb.append("    author: ").append(author).append("\n");
        sb.append("    htmlNote: ").append(htmlNote).append("\n");
        sb.append("    note: ").append(note).append("\n");
        sb.append("    autoSize: ").append(autoSize).append("\n");
        sb.append("    isVisible: ").append(isVisible).append("\n");
        sb.append("    width: ").append(width).append("\n");
        sb.append("    height: ").append(height).append("\n");
        sb.append("    textHorizontalAlignment: ").append(textHorizontalAlignment).append("\n");
        sb.append("    textOrientationType: ").append(textOrientationType).append("\n");
        sb.append("    textVerticalAlignment: ").append(textVerticalAlignment).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
