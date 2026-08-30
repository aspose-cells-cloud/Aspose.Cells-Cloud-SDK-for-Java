package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SqlScriptSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SqlScriptSaveOptions extends SaveOptions {
    /** Gets or sets CheckIfTableExists. */
    @JsonProperty("CheckIfTableExists")
    private Boolean checkIfTableExists;

    /** Gets or sets ColumnTypeMap. */
    @JsonProperty("ColumnTypeMap")
    private String columnTypeMap;

    /** Gets or sets CheckAllDataForColumnType. */
    @JsonProperty("CheckAllDataForColumnType")
    private Boolean checkAllDataForColumnType;

    /** Gets or sets AddBlankLineBetweenRows. */
    @JsonProperty("AddBlankLineBetweenRows")
    private Boolean addBlankLineBetweenRows;

    /** Gets or sets Separator. */
    @JsonProperty("Separator")
    private String separator;

    /** Gets or sets OperatorType. */
    @JsonProperty("OperatorType")
    private String operatorType;

    /** Gets or sets PrimaryKey. */
    @JsonProperty("PrimaryKey")
    private Integer primaryKey;

    /** Gets or sets CreateTable. */
    @JsonProperty("CreateTable")
    private Boolean createTable;

    /** Gets or sets IdName. */
    @JsonProperty("IdName")
    private String idName;

    /** Gets or sets StartId. */
    @JsonProperty("StartId")
    private Integer startId;

    /** Gets or sets TableName. */
    @JsonProperty("TableName")
    private String tableName;

    /** Gets or sets ExportAsString. */
    @JsonProperty("ExportAsString")
    private Boolean exportAsString;

    /** Gets or sets ExportArea. */
    @JsonProperty("ExportArea")
    private CellArea exportArea;

    /** Gets or sets HasHeaderRow. */
    @JsonProperty("HasHeaderRow")
    private Boolean hasHeaderRow;

    public Boolean getCheckIfTableExists() { return checkIfTableExists; }
    public SqlScriptSaveOptions setCheckIfTableExists(Boolean checkIfTableExists) { this.checkIfTableExists = checkIfTableExists; return this; }

    public String getColumnTypeMap() { return columnTypeMap; }
    public SqlScriptSaveOptions setColumnTypeMap(String columnTypeMap) { this.columnTypeMap = columnTypeMap; return this; }

    public Boolean getCheckAllDataForColumnType() { return checkAllDataForColumnType; }
    public SqlScriptSaveOptions setCheckAllDataForColumnType(Boolean checkAllDataForColumnType) { this.checkAllDataForColumnType = checkAllDataForColumnType; return this; }

    public Boolean getAddBlankLineBetweenRows() { return addBlankLineBetweenRows; }
    public SqlScriptSaveOptions setAddBlankLineBetweenRows(Boolean addBlankLineBetweenRows) { this.addBlankLineBetweenRows = addBlankLineBetweenRows; return this; }

    public String getSeparator() { return separator; }
    public SqlScriptSaveOptions setSeparator(String separator) { this.separator = separator; return this; }

    public String getOperatorType() { return operatorType; }
    public SqlScriptSaveOptions setOperatorType(String operatorType) { this.operatorType = operatorType; return this; }

    public Integer getPrimaryKey() { return primaryKey; }
    public SqlScriptSaveOptions setPrimaryKey(Integer primaryKey) { this.primaryKey = primaryKey; return this; }

    public Boolean getCreateTable() { return createTable; }
    public SqlScriptSaveOptions setCreateTable(Boolean createTable) { this.createTable = createTable; return this; }

    public String getIdName() { return idName; }
    public SqlScriptSaveOptions setIdName(String idName) { this.idName = idName; return this; }

    public Integer getStartId() { return startId; }
    public SqlScriptSaveOptions setStartId(Integer startId) { this.startId = startId; return this; }

    public String getTableName() { return tableName; }
    public SqlScriptSaveOptions setTableName(String tableName) { this.tableName = tableName; return this; }

    public Boolean getExportAsString() { return exportAsString; }
    public SqlScriptSaveOptions setExportAsString(Boolean exportAsString) { this.exportAsString = exportAsString; return this; }

    public CellArea getExportArea() { return exportArea; }
    public SqlScriptSaveOptions setExportArea(CellArea exportArea) { this.exportArea = exportArea; return this; }

    public Boolean getHasHeaderRow() { return hasHeaderRow; }
    public SqlScriptSaveOptions setHasHeaderRow(Boolean hasHeaderRow) { this.hasHeaderRow = hasHeaderRow; return this; }


    /** Covariant override: keeps fluent chains returning SqlScriptSaveOptions. */
    @Override public SqlScriptSaveOptions setSaveFormat(String saveFormat) { return (SqlScriptSaveOptions) super.setSaveFormat(saveFormat); }
    /** Covariant override: keeps fluent chains returning SqlScriptSaveOptions. */
    @Override public SqlScriptSaveOptions setCachedFileFolder(String cachedFileFolder) { return (SqlScriptSaveOptions) super.setCachedFileFolder(cachedFileFolder); }
    /** Covariant override: keeps fluent chains returning SqlScriptSaveOptions. */
    @Override public SqlScriptSaveOptions setClearData(Boolean clearData) { return (SqlScriptSaveOptions) super.setClearData(clearData); }
    /** Covariant override: keeps fluent chains returning SqlScriptSaveOptions. */
    @Override public SqlScriptSaveOptions setCreateDirectory(Boolean createDirectory) { return (SqlScriptSaveOptions) super.setCreateDirectory(createDirectory); }
    /** Covariant override: keeps fluent chains returning SqlScriptSaveOptions. */
    @Override public SqlScriptSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { return (SqlScriptSaveOptions) super.setEnableHTTPCompression(enableHTTPCompression); }
    /** Covariant override: keeps fluent chains returning SqlScriptSaveOptions. */
    @Override public SqlScriptSaveOptions setRefreshChartCache(Boolean refreshChartCache) { return (SqlScriptSaveOptions) super.setRefreshChartCache(refreshChartCache); }
    /** Covariant override: keeps fluent chains returning SqlScriptSaveOptions. */
    @Override public SqlScriptSaveOptions setSortNames(Boolean sortNames) { return (SqlScriptSaveOptions) super.setSortNames(sortNames); }
    /** Covariant override: keeps fluent chains returning SqlScriptSaveOptions. */
    @Override public SqlScriptSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { return (SqlScriptSaveOptions) super.setValidateMergedAreas(validateMergedAreas); }
    /** Covariant override: keeps fluent chains returning SqlScriptSaveOptions. */
    @Override public SqlScriptSaveOptions setMergeAreas(Boolean mergeAreas) { return (SqlScriptSaveOptions) super.setMergeAreas(mergeAreas); }
    /** Covariant override: keeps fluent chains returning SqlScriptSaveOptions. */
    @Override public SqlScriptSaveOptions setSortExternalNames(Boolean sortExternalNames) { return (SqlScriptSaveOptions) super.setSortExternalNames(sortExternalNames); }
    /** Covariant override: keeps fluent chains returning SqlScriptSaveOptions. */
    @Override public SqlScriptSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { return (SqlScriptSaveOptions) super.setCheckExcelRestriction(checkExcelRestriction); }
    /** Covariant override: keeps fluent chains returning SqlScriptSaveOptions. */
    @Override public SqlScriptSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { return (SqlScriptSaveOptions) super.setUpdateSmartArt(updateSmartArt); }
    /** Covariant override: keeps fluent chains returning SqlScriptSaveOptions. */
    @Override public SqlScriptSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { return (SqlScriptSaveOptions) super.setEncryptDocumentProperties(encryptDocumentProperties); }

}
