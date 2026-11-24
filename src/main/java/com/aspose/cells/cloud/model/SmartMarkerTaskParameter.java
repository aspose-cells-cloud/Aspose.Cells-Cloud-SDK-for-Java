/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SmartMarkerTaskParameter.java">
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

public class SmartMarkerTaskParameter extends TaskParameter {

    @SerializedName("SourceWorkbook")
    @JsonProperty("SourceWorkbook")
    private FileSource sourceWorkbook;

    public SmartMarkerTaskParameter sourceWorkbook(FileSource sourceWorkbook) {
        this.sourceWorkbook = sourceWorkbook;
        return this;
    }

    @ApiModelProperty(value = "")
    public FileSource getSourceWorkbook() {
        return sourceWorkbook;
    }

    public void setSourceWorkbook(FileSource sourceWorkbook) {
        this.sourceWorkbook = sourceWorkbook;
    }

    @SerializedName("DestinationWorkbook")
    @JsonProperty("DestinationWorkbook")
    private FileSource destinationWorkbook;

    public SmartMarkerTaskParameter destinationWorkbook(FileSource destinationWorkbook) {
        this.destinationWorkbook = destinationWorkbook;
        return this;
    }

    @ApiModelProperty(value = "")
    public FileSource getDestinationWorkbook() {
        return destinationWorkbook;
    }

    public void setDestinationWorkbook(FileSource destinationWorkbook) {
        this.destinationWorkbook = destinationWorkbook;
    }

    @SerializedName("xmlFile")
    @JsonProperty("xmlFile")
    private FileSource xmlFile;

    public SmartMarkerTaskParameter xmlFile(FileSource xmlFile) {
        this.xmlFile = xmlFile;
        return this;
    }

    @ApiModelProperty(value = "")
    public FileSource getXmlFile() {
        return xmlFile;
    }

    public void setXmlFile(FileSource xmlFile) {
        this.xmlFile = xmlFile;
    }

    @SerializedName("DataSource")
    @JsonProperty("DataSource")
    private DataSource dataSource;

    public SmartMarkerTaskParameter dataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    @ApiModelProperty(value = "")
    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @SerializedName("TargetDataSource")
    @JsonProperty("TargetDataSource")
    private DataSource targetDataSource;

    public SmartMarkerTaskParameter targetDataSource(DataSource targetDataSource) {
        this.targetDataSource = targetDataSource;
        return this;
    }

    @ApiModelProperty(value = "")
    public DataSource getTargetDataSource() {
        return targetDataSource;
    }

    public void setTargetDataSource(DataSource targetDataSource) {
        this.targetDataSource = targetDataSource;
    }

    @SerializedName("XMLFileDataSource")
    @JsonProperty("XMLFileDataSource")
    private DataSource xMLFileDataSource;

    public SmartMarkerTaskParameter xMLFileDataSource(DataSource xMLFileDataSource) {
        this.xMLFileDataSource = xMLFileDataSource;
        return this;
    }

    @ApiModelProperty(value = "")
    public DataSource getXMLFileDataSource() {
        return xMLFileDataSource;
    }

    public void setXMLFileDataSource(DataSource xMLFileDataSource) {
        this.xMLFileDataSource = xMLFileDataSource;
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
        SmartMarkerTaskParameter other = (SmartMarkerTaskParameter) o;
        return Objects.equals(this.sourceWorkbook, other.sourceWorkbook)
            && Objects.equals(this.destinationWorkbook, other.destinationWorkbook)
            && Objects.equals(this.xmlFile, other.xmlFile)
            && Objects.equals(this.dataSource, other.dataSource)
            && Objects.equals(this.targetDataSource, other.targetDataSource)
            && Objects.equals(this.xMLFileDataSource, other.xMLFileDataSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceWorkbook, destinationWorkbook, xmlFile, dataSource, targetDataSource, xMLFileDataSource, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartMarkerTaskParameter {\n");
        sb.append("    sourceWorkbook: ").append(sourceWorkbook).append("\n");
        sb.append("    destinationWorkbook: ").append(destinationWorkbook).append("\n");
        sb.append("    xmlFile: ").append(xmlFile).append("\n");
        sb.append("    dataSource: ").append(dataSource).append("\n");
        sb.append("    targetDataSource: ").append(targetDataSource).append("\n");
        sb.append("    xMLFileDataSource: ").append(xMLFileDataSource).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
