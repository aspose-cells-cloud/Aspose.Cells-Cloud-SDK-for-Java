/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Workbook.java">
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

public class Workbook {

    @SerializedName("FileName")
    @JsonProperty("FileName")
    private String fileName;

    public Workbook fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @SerializedName("Links")
    @JsonProperty("Links")
    private List<Link> links;

    public Workbook links(List<Link> links) {
        this.links = links;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    @SerializedName("Worksheets")
    @JsonProperty("Worksheets")
    private LinkElement worksheets;

    public Workbook worksheets(LinkElement worksheets) {
        this.worksheets = worksheets;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getWorksheets() {
        return worksheets;
    }

    public void setWorksheets(LinkElement worksheets) {
        this.worksheets = worksheets;
    }

    @SerializedName("DefaultStyle")
    @JsonProperty("DefaultStyle")
    private LinkElement defaultStyle;

    public Workbook defaultStyle(LinkElement defaultStyle) {
        this.defaultStyle = defaultStyle;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getDefaultStyle() {
        return defaultStyle;
    }

    public void setDefaultStyle(LinkElement defaultStyle) {
        this.defaultStyle = defaultStyle;
    }

    @SerializedName("DocumentProperties")
    @JsonProperty("DocumentProperties")
    private LinkElement documentProperties;

    public Workbook documentProperties(LinkElement documentProperties) {
        this.documentProperties = documentProperties;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getDocumentProperties() {
        return documentProperties;
    }

    public void setDocumentProperties(LinkElement documentProperties) {
        this.documentProperties = documentProperties;
    }

    @SerializedName("Names")
    @JsonProperty("Names")
    private LinkElement names;

    public Workbook names(LinkElement names) {
        this.names = names;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getNames() {
        return names;
    }

    public void setNames(LinkElement names) {
        this.names = names;
    }

    @SerializedName("Settings")
    @JsonProperty("Settings")
    private LinkElement settings;

    public Workbook settings(LinkElement settings) {
        this.settings = settings;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getSettings() {
        return settings;
    }

    public void setSettings(LinkElement settings) {
        this.settings = settings;
    }

    @SerializedName("IsWriteProtected")
    @JsonProperty("IsWriteProtected")
    private String isWriteProtected;

    public Workbook isWriteProtected(String isWriteProtected) {
        this.isWriteProtected = isWriteProtected;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getIsWriteProtected() {
        return isWriteProtected;
    }

    public void setIsWriteProtected(String isWriteProtected) {
        this.isWriteProtected = isWriteProtected;
    }

    @SerializedName("IsProtected")
    @JsonProperty("IsProtected")
    private String isProtected;

    public Workbook isProtected(String isProtected) {
        this.isProtected = isProtected;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getIsProtected() {
        return isProtected;
    }

    public void setIsProtected(String isProtected) {
        this.isProtected = isProtected;
    }

    @SerializedName("IsEncryption")
    @JsonProperty("IsEncryption")
    private String isEncryption;

    public Workbook isEncryption(String isEncryption) {
        this.isEncryption = isEncryption;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getIsEncryption() {
        return isEncryption;
    }

    public void setIsEncryption(String isEncryption) {
        this.isEncryption = isEncryption;
    }

    @SerializedName("Password")
    @JsonProperty("Password")
    private String password;

    public Workbook password(String password) {
        this.password = password;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Workbook other = (Workbook) o;
        return Objects.equals(this.fileName, other.fileName)
            && Objects.equals(this.links, other.links)
            && Objects.equals(this.worksheets, other.worksheets)
            && Objects.equals(this.defaultStyle, other.defaultStyle)
            && Objects.equals(this.documentProperties, other.documentProperties)
            && Objects.equals(this.names, other.names)
            && Objects.equals(this.settings, other.settings)
            && Objects.equals(this.isWriteProtected, other.isWriteProtected)
            && Objects.equals(this.isProtected, other.isProtected)
            && Objects.equals(this.isEncryption, other.isEncryption)
            && Objects.equals(this.password, other.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, links, worksheets, defaultStyle, documentProperties, names, settings, isWriteProtected, isProtected, isEncryption, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Workbook {\n");
        sb.append("    fileName: ").append(fileName).append("\n");
        sb.append("    links: ").append(links).append("\n");
        sb.append("    worksheets: ").append(worksheets).append("\n");
        sb.append("    defaultStyle: ").append(defaultStyle).append("\n");
        sb.append("    documentProperties: ").append(documentProperties).append("\n");
        sb.append("    names: ").append(names).append("\n");
        sb.append("    settings: ").append(settings).append("\n");
        sb.append("    isWriteProtected: ").append(isWriteProtected).append("\n");
        sb.append("    isProtected: ").append(isProtected).append("\n");
        sb.append("    isEncryption: ").append(isEncryption).append("\n");
        sb.append("    password: ").append(password).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
