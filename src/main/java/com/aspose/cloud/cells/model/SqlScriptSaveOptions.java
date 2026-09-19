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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class SqlScriptSaveOptions  extends  SaveOptions {
        @SerializedName("CheckIfTableExists")
        private Boolean checkIfTableExists ;

        public  SqlScriptSaveOptions  checkIfTableExists(Boolean  checkIfTableExists) {
            this.checkIfTableExists =  checkIfTableExists;
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
        private String columnTypeMap ;

        public  SqlScriptSaveOptions  columnTypeMap(String  columnTypeMap) {
            this.columnTypeMap =  columnTypeMap;
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
        private Boolean checkAllDataForColumnType ;

        public  SqlScriptSaveOptions  checkAllDataForColumnType(Boolean  checkAllDataForColumnType) {
            this.checkAllDataForColumnType =  checkAllDataForColumnType;
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
        private Boolean addBlankLineBetweenRows ;

        public  SqlScriptSaveOptions  addBlankLineBetweenRows(Boolean  addBlankLineBetweenRows) {
            this.addBlankLineBetweenRows =  addBlankLineBetweenRows;
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
        private String separator ;

        public  SqlScriptSaveOptions  separator(String  separator) {
            this.separator =  separator;
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
        private String operatorType ;

        public  SqlScriptSaveOptions  operatorType(String  operatorType) {
            this.operatorType =  operatorType;
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
        private Integer primaryKey ;

        public  SqlScriptSaveOptions  primaryKey(Integer  primaryKey) {
            this.primaryKey =  primaryKey;
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
        private Boolean createTable ;

        public  SqlScriptSaveOptions  createTable(Boolean  createTable) {
            this.createTable =  createTable;
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
        private String idName ;

        public  SqlScriptSaveOptions  idName(String  idName) {
            this.idName =  idName;
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
        private Integer startId ;

        public  SqlScriptSaveOptions  startId(Integer  startId) {
            this.startId =  startId;
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
        private String tableName ;

        public  SqlScriptSaveOptions  tableName(String  tableName) {
            this.tableName =  tableName;
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
        private Boolean exportAsString ;

        public  SqlScriptSaveOptions  exportAsString(Boolean  exportAsString) {
            this.exportAsString =  exportAsString;
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
        private CellArea exportArea ;

        public  SqlScriptSaveOptions  exportArea(CellArea  exportArea) {
            this.exportArea =  exportArea;
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
        private Boolean hasHeaderRow ;

        public  SqlScriptSaveOptions  hasHeaderRow(Boolean  hasHeaderRow) {
            this.hasHeaderRow =  hasHeaderRow;
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
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            SqlScriptSaveOptions sqlScriptSaveOptions = (SqlScriptSaveOptions) o;
            return
                Objects.equals(this.checkIfTableExists, sqlScriptSaveOptions.checkIfTableExists) &&
                Objects.equals(this.columnTypeMap, sqlScriptSaveOptions.columnTypeMap) &&
                Objects.equals(this.checkAllDataForColumnType, sqlScriptSaveOptions.checkAllDataForColumnType) &&
                Objects.equals(this.addBlankLineBetweenRows, sqlScriptSaveOptions.addBlankLineBetweenRows) &&
                Objects.equals(this.separator, sqlScriptSaveOptions.separator) &&
                Objects.equals(this.operatorType, sqlScriptSaveOptions.operatorType) &&
                Objects.equals(this.primaryKey, sqlScriptSaveOptions.primaryKey) &&
                Objects.equals(this.createTable, sqlScriptSaveOptions.createTable) &&
                Objects.equals(this.idName, sqlScriptSaveOptions.idName) &&
                Objects.equals(this.startId, sqlScriptSaveOptions.startId) &&
                Objects.equals(this.tableName, sqlScriptSaveOptions.tableName) &&
                Objects.equals(this.exportAsString, sqlScriptSaveOptions.exportAsString) &&
                Objects.equals(this.exportArea, sqlScriptSaveOptions.exportArea) &&
                Objects.equals(this.hasHeaderRow, sqlScriptSaveOptions.hasHeaderRow) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(checkIfTableExists, columnTypeMap, checkAllDataForColumnType, addBlankLineBetweenRows, separator, operatorType, primaryKey, createTable, idName, startId, tableName, exportAsString, exportArea, hasHeaderRow, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SqlScriptSaveOptions {\n");
            sb.append("    checkIfTableExists: ").append(toIndentedString(getCheckIfTableExists())).append("\n");
            sb.append("    columnTypeMap: ").append(toIndentedString(getColumnTypeMap())).append("\n");
            sb.append("    checkAllDataForColumnType: ").append(toIndentedString(getCheckAllDataForColumnType())).append("\n");
            sb.append("    addBlankLineBetweenRows: ").append(toIndentedString(getAddBlankLineBetweenRows())).append("\n");
            sb.append("    separator: ").append(toIndentedString(getSeparator())).append("\n");
            sb.append("    operatorType: ").append(toIndentedString(getOperatorType())).append("\n");
            sb.append("    primaryKey: ").append(toIndentedString(getPrimaryKey())).append("\n");
            sb.append("    createTable: ").append(toIndentedString(getCreateTable())).append("\n");
            sb.append("    idName: ").append(toIndentedString(getIdName())).append("\n");
            sb.append("    startId: ").append(toIndentedString(getStartId())).append("\n");
            sb.append("    tableName: ").append(toIndentedString(getTableName())).append("\n");
            sb.append("    exportAsString: ").append(toIndentedString(getExportAsString())).append("\n");
            sb.append("    exportArea: ").append(toIndentedString(getExportArea())).append("\n");
            sb.append("    hasHeaderRow: ").append(toIndentedString(getHasHeaderRow())).append("\n");
            sb.append("    saveFormat: ").append(toIndentedString(getSaveFormat())).append("\n");
            sb.append("    cachedFileFolder: ").append(toIndentedString(getCachedFileFolder())).append("\n");
            sb.append("    clearData: ").append(toIndentedString(getClearData())).append("\n");
            sb.append("    createDirectory: ").append(toIndentedString(getCreateDirectory())).append("\n");
            sb.append("    enableHTTPCompression: ").append(toIndentedString(getEnableHTTPCompression())).append("\n");
            sb.append("    refreshChartCache: ").append(toIndentedString(getRefreshChartCache())).append("\n");
            sb.append("    sortNames: ").append(toIndentedString(getSortNames())).append("\n");
            sb.append("    validateMergedAreas: ").append(toIndentedString(getValidateMergedAreas())).append("\n");
            sb.append("    mergeAreas: ").append(toIndentedString(getMergeAreas())).append("\n");
            sb.append("    sortExternalNames: ").append(toIndentedString(getSortExternalNames())).append("\n");
            sb.append("    checkExcelRestriction: ").append(toIndentedString(getCheckExcelRestriction())).append("\n");
            sb.append("    updateSmartArt: ").append(toIndentedString(getUpdateSmartArt())).append("\n");
            sb.append("    encryptDocumentProperties: ").append(toIndentedString(getEncryptDocumentProperties())).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
        * Convert the given object to string with each line indented by 4 spaces
        * (except the first line).
        */
        private String toIndentedString(java.lang.Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }


}

