/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="OleObject.java">
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

public class OleObject extends Shape {

    @SerializedName("DisplayAsIcon")
    @JsonProperty("DisplayAsIcon")
    private Boolean displayAsIcon;

    public OleObject displayAsIcon(Boolean displayAsIcon) {
        this.displayAsIcon = displayAsIcon;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getDisplayAsIcon() {
        return displayAsIcon;
    }

    public void setDisplayAsIcon(Boolean displayAsIcon) {
        this.displayAsIcon = displayAsIcon;
    }

    @SerializedName("FileFormatType")
    @JsonProperty("FileFormatType")
    private String fileFormatType;

    public OleObject fileFormatType(String fileFormatType) {
        this.fileFormatType = fileFormatType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getFileFormatType() {
        return fileFormatType;
    }

    public void setFileFormatType(String fileFormatType) {
        this.fileFormatType = fileFormatType;
    }

    @SerializedName("ImageSourceFullName")
    @JsonProperty("ImageSourceFullName")
    private String imageSourceFullName;

    public OleObject imageSourceFullName(String imageSourceFullName) {
        this.imageSourceFullName = imageSourceFullName;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getImageSourceFullName() {
        return imageSourceFullName;
    }

    public void setImageSourceFullName(String imageSourceFullName) {
        this.imageSourceFullName = imageSourceFullName;
    }

    @SerializedName("IsAutoSize")
    @JsonProperty("IsAutoSize")
    private Boolean isAutoSize;

    public OleObject isAutoSize(Boolean isAutoSize) {
        this.isAutoSize = isAutoSize;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsAutoSize() {
        return isAutoSize;
    }

    public void setIsAutoSize(Boolean isAutoSize) {
        this.isAutoSize = isAutoSize;
    }

    @SerializedName("IsLink")
    @JsonProperty("IsLink")
    private Boolean isLink;

    public OleObject isLink(Boolean isLink) {
        this.isLink = isLink;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsLink() {
        return isLink;
    }

    public void setIsLink(Boolean isLink) {
        this.isLink = isLink;
    }

    @SerializedName("ProgID")
    @JsonProperty("ProgID")
    private String progID;

    public OleObject progID(String progID) {
        this.progID = progID;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getProgID() {
        return progID;
    }

    public void setProgID(String progID) {
        this.progID = progID;
    }

    @SerializedName("SourceFullName")
    @JsonProperty("SourceFullName")
    private String sourceFullName;

    public OleObject sourceFullName(String sourceFullName) {
        this.sourceFullName = sourceFullName;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSourceFullName() {
        return sourceFullName;
    }

    public void setSourceFullName(String sourceFullName) {
        this.sourceFullName = sourceFullName;
    }

    @SerializedName("link")
    @JsonProperty("link")
    private Link link;

    public OleObject link(Link link) {
        this.link = link;
        return this;
    }

    @ApiModelProperty(value = "")
    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
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
        OleObject other = (OleObject) o;
        return Objects.equals(this.displayAsIcon, other.displayAsIcon)
            && Objects.equals(this.fileFormatType, other.fileFormatType)
            && Objects.equals(this.imageSourceFullName, other.imageSourceFullName)
            && Objects.equals(this.isAutoSize, other.isAutoSize)
            && Objects.equals(this.isLink, other.isLink)
            && Objects.equals(this.progID, other.progID)
            && Objects.equals(this.sourceFullName, other.sourceFullName)
            && Objects.equals(this.link, other.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayAsIcon, fileFormatType, imageSourceFullName, isAutoSize, isLink, progID, sourceFullName, link, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OleObject {\n");
        sb.append("    displayAsIcon: ").append(displayAsIcon).append("\n");
        sb.append("    fileFormatType: ").append(fileFormatType).append("\n");
        sb.append("    imageSourceFullName: ").append(imageSourceFullName).append("\n");
        sb.append("    isAutoSize: ").append(isAutoSize).append("\n");
        sb.append("    isLink: ").append(isLink).append("\n");
        sb.append("    progID: ").append(progID).append("\n");
        sb.append("    sourceFullName: ").append(sourceFullName).append("\n");
        sb.append("    link: ").append(link).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
