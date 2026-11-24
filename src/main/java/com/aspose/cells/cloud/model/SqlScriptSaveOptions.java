/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SqlScriptSaveOptions.java">
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

public class SqlScriptSaveOptions extends SaveOptions {

    @SerializedName("CheckIfTableExists")
    @JsonProperty("CheckIfTableExists")
    private Boolean checkIfTableExists;

    public SqlScriptSaveOptions checkIfTableExists(Boolean checkIfTableExists) {
        this.checkIfTableExists = checkIfTableExists;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getCheckIfTableExists() {
        return checkIfTableExists;
    }

    public void setCheckIfTableExists(Boolean checkIfTableExists) {
        this.checkIfTableExists = checkIfTableExists;
    }

    @SerializedName("ColumnTypeMap")
    @JsonProperty("ColumnTypeMap")
    private String columnTypeMap;

    public SqlScriptSaveOptions columnTypeMap(String columnTypeMap) {
        this.columnTypeMap = columnTypeMap;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getColumnTypeMap() {
        return columnTypeMap;
    }

    public void setColumnTypeMap(String columnTypeMap) {
        this.columnTypeMap = columnTypeMap;
    }

    @SerializedName("CheckAllDataForColumnType")
    @JsonProperty("CheckAllDataForColumnType")
    private Boolean checkAllDataForColumnType;

    public SqlScriptSaveOptions checkAllDataForColumnType(Boolean checkAllDataForColumnType) {
        this.checkAllDataForColumnType = checkAllDataForColumnType;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getCheckAllDataForColumnType() {
        return checkAllDataForColumnType;
    }

    public void setCheckAllDataForColumnType(Boolean checkAllDataForColumnType) {
        this.checkAllDataForColumnType = checkAllDataForColumnType;
    }

    @SerializedName("AddBlankLineBetweenRows")
    @JsonProperty("AddBlankLineBetweenRows")
    private Boolean addBlankLineBetweenRows;

    public SqlScriptSaveOptions addBlankLineBetweenRows(Boolean addBlankLineBetweenRows) {
        this.addBlankLineBetweenRows = addBlankLineBetweenRows;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAddBlankLineBetweenRows() {
        return addBlankLineBetweenRows;
    }

    public void setAddBlankLineBetweenRows(Boolean addBlankLineBetweenRows) {
        this.addBlankLineBetweenRows = addBlankLineBetweenRows;
    }

    @SerializedName("Separator")
    @JsonProperty("Separator")
    private String separator;

    public SqlScriptSaveOptions separator(String separator) {
        this.separator = separator;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    @SerializedName("OperatorType")
    @JsonProperty("OperatorType")
    private String operatorType;

    public SqlScriptSaveOptions operatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType;
    }

    @SerializedName("PrimaryKey")
    @JsonProperty("PrimaryKey")
    private Integer primaryKey;

    public SqlScriptSaveOptions primaryKey(Integer primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(Integer primaryKey) {
        this.primaryKey = primaryKey;
    }

    @SerializedName("CreateTable")
    @JsonProperty("CreateTable")
    private Boolean createTable;

    public SqlScriptSaveOptions createTable(Boolean createTable) {
        this.createTable = createTable;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getCreateTable() {
        return createTable;
    }

    public void setCreateTable(Boolean createTable) {
        this.createTable = createTable;
    }

    @SerializedName("IdName")
    @JsonProperty("IdName")
    private String idName;

    public SqlScriptSaveOptions idName(String idName) {
        this.idName = idName;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    @SerializedName("StartId")
    @JsonProperty("StartId")
    private Integer startId;

    public SqlScriptSaveOptions startId(Integer startId) {
        this.startId = startId;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getStartId() {
        return startId;
    }

    public void setStartId(Integer startId) {
        this.startId = startId;
    }

    @SerializedName("TableName")
    @JsonProperty("TableName")
    private String tableName;

    public SqlScriptSaveOptions tableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @SerializedName("ExportAsString")
    @JsonProperty("ExportAsString")
    private Boolean exportAsString;

    public SqlScriptSaveOptions exportAsString(Boolean exportAsString) {
        this.exportAsString = exportAsString;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getExportAsString() {
        return exportAsString;
    }

    public void setExportAsString(Boolean exportAsString) {
        this.exportAsString = exportAsString;
    }

    @SerializedName("ExportArea")
    @JsonProperty("ExportArea")
    private CellArea exportArea;

    public SqlScriptSaveOptions exportArea(CellArea exportArea) {
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

    public SqlScriptSaveOptions hasHeaderRow(Boolean hasHeaderRow) {
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
        SqlScriptSaveOptions other = (SqlScriptSaveOptions) o;
        return Objects.equals(this.checkIfTableExists, other.checkIfTableExists)
            && Objects.equals(this.columnTypeMap, other.columnTypeMap)
            && Objects.equals(this.checkAllDataForColumnType, other.checkAllDataForColumnType)
            && Objects.equals(this.addBlankLineBetweenRows, other.addBlankLineBetweenRows)
            && Objects.equals(this.separator, other.separator)
            && Objects.equals(this.operatorType, other.operatorType)
            && Objects.equals(this.primaryKey, other.primaryKey)
            && Objects.equals(this.createTable, other.createTable)
            && Objects.equals(this.idName, other.idName)
            && Objects.equals(this.startId, other.startId)
            && Objects.equals(this.tableName, other.tableName)
            && Objects.equals(this.exportAsString, other.exportAsString)
            && Objects.equals(this.exportArea, other.exportArea)
            && Objects.equals(this.hasHeaderRow, other.hasHeaderRow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkIfTableExists, columnTypeMap, checkAllDataForColumnType, addBlankLineBetweenRows, separator, operatorType, primaryKey, createTable, idName, startId, tableName, exportAsString, exportArea, hasHeaderRow, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlScriptSaveOptions {\n");
        sb.append("    checkIfTableExists: ").append(checkIfTableExists).append("\n");
        sb.append("    columnTypeMap: ").append(columnTypeMap).append("\n");
        sb.append("    checkAllDataForColumnType: ").append(checkAllDataForColumnType).append("\n");
        sb.append("    addBlankLineBetweenRows: ").append(addBlankLineBetweenRows).append("\n");
        sb.append("    separator: ").append(separator).append("\n");
        sb.append("    operatorType: ").append(operatorType).append("\n");
        sb.append("    primaryKey: ").append(primaryKey).append("\n");
        sb.append("    createTable: ").append(createTable).append("\n");
        sb.append("    idName: ").append(idName).append("\n");
        sb.append("    startId: ").append(startId).append("\n");
        sb.append("    tableName: ").append(tableName).append("\n");
        sb.append("    exportAsString: ").append(exportAsString).append("\n");
        sb.append("    exportArea: ").append(exportArea).append("\n");
        sb.append("    hasHeaderRow: ").append(hasHeaderRow).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
