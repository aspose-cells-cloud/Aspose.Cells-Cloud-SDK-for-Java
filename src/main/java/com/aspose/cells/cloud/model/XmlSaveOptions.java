/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="XmlSaveOptions.java">
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

public class XmlSaveOptions extends SaveOptions {

    @SerializedName("SheetIndexes")
    @JsonProperty("SheetIndexes")
    private List<Integer> sheetIndexes;

    public XmlSaveOptions sheetIndexes(List<Integer> sheetIndexes) {
        this.sheetIndexes = sheetIndexes;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<Integer> getSheetIndexes() {
        return sheetIndexes;
    }

    public void setSheetIndexes(List<Integer> sheetIndexes) {
        this.sheetIndexes = sheetIndexes;
    }

    @SerializedName("ExportArea")
    @JsonProperty("ExportArea")
    private CellArea exportArea;

    public XmlSaveOptions exportArea(CellArea exportArea) {
        this.exportArea = exportArea;
        return this;
    }

    @ApiModelProperty(value = "")
    public CellArea getExportArea() {
        return exportArea;
    }

    public void setExportArea(CellArea exportArea) {
        this.exportArea = exportArea;
    }

    @SerializedName("HasHeaderRow")
    @JsonProperty("HasHeaderRow")
    private Boolean hasHeaderRow;

    public XmlSaveOptions hasHeaderRow(Boolean hasHeaderRow) {
        this.hasHeaderRow = hasHeaderRow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getHasHeaderRow() {
        return hasHeaderRow;
    }

    public void setHasHeaderRow(Boolean hasHeaderRow) {
        this.hasHeaderRow = hasHeaderRow;
    }

    @SerializedName("XmlMapName")
    @JsonProperty("XmlMapName")
    private String xmlMapName;

    public XmlSaveOptions xmlMapName(String xmlMapName) {
        this.xmlMapName = xmlMapName;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getXmlMapName() {
        return xmlMapName;
    }

    public void setXmlMapName(String xmlMapName) {
        this.xmlMapName = xmlMapName;
    }

    @SerializedName("SheetNameAsElementName")
    @JsonProperty("SheetNameAsElementName")
    private Boolean sheetNameAsElementName;

    public XmlSaveOptions sheetNameAsElementName(Boolean sheetNameAsElementName) {
        this.sheetNameAsElementName = sheetNameAsElementName;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getSheetNameAsElementName() {
        return sheetNameAsElementName;
    }

    public void setSheetNameAsElementName(Boolean sheetNameAsElementName) {
        this.sheetNameAsElementName = sheetNameAsElementName;
    }

    @SerializedName("DataAsAttribute")
    @JsonProperty("DataAsAttribute")
    private Boolean dataAsAttribute;

    public XmlSaveOptions dataAsAttribute(Boolean dataAsAttribute) {
        this.dataAsAttribute = dataAsAttribute;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getDataAsAttribute() {
        return dataAsAttribute;
    }

    public void setDataAsAttribute(Boolean dataAsAttribute) {
        this.dataAsAttribute = dataAsAttribute;
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
        XmlSaveOptions other = (XmlSaveOptions) o;
        return Objects.equals(this.sheetIndexes, other.sheetIndexes)
            && Objects.equals(this.exportArea, other.exportArea)
            && Objects.equals(this.hasHeaderRow, other.hasHeaderRow)
            && Objects.equals(this.xmlMapName, other.xmlMapName)
            && Objects.equals(this.sheetNameAsElementName, other.sheetNameAsElementName)
            && Objects.equals(this.dataAsAttribute, other.dataAsAttribute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sheetIndexes, exportArea, hasHeaderRow, xmlMapName, sheetNameAsElementName, dataAsAttribute, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class XmlSaveOptions {\n");
        sb.append("    sheetIndexes: ").append(sheetIndexes).append("\n");
        sb.append("    exportArea: ").append(exportArea).append("\n");
        sb.append("    hasHeaderRow: ").append(hasHeaderRow).append("\n");
        sb.append("    xmlMapName: ").append(xmlMapName).append("\n");
        sb.append("    sheetNameAsElementName: ").append(sheetNameAsElementName).append("\n");
        sb.append("    dataAsAttribute: ").append(dataAsAttribute).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
