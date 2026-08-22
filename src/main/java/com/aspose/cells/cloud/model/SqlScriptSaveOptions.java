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

    /** Gets or sets SaveFormat. */
    @JsonProperty("SaveFormat")
    private String saveFormat;

    /** Gets or sets CachedFileFolder. */
    @JsonProperty("CachedFileFolder")
    private String cachedFileFolder;

    /** Gets or sets ClearData. */
    @JsonProperty("ClearData")
    private Boolean clearData;

    /** Gets or sets CreateDirectory. */
    @JsonProperty("CreateDirectory")
    private Boolean createDirectory;

    /** Gets or sets EnableHTTPCompression. */
    @JsonProperty("EnableHTTPCompression")
    private Boolean enableHTTPCompression;

    /** Gets or sets RefreshChartCache. */
    @JsonProperty("RefreshChartCache")
    private Boolean refreshChartCache;

    /** Gets or sets SortNames. */
    @JsonProperty("SortNames")
    private Boolean sortNames;

    /** Gets or sets ValidateMergedAreas. */
    @JsonProperty("ValidateMergedAreas")
    private Boolean validateMergedAreas;

    /** Gets or sets MergeAreas. */
    @JsonProperty("MergeAreas")
    private Boolean mergeAreas;

    /** Gets or sets SortExternalNames. */
    @JsonProperty("SortExternalNames")
    private Boolean sortExternalNames;

    /** Gets or sets CheckExcelRestriction. */
    @JsonProperty("CheckExcelRestriction")
    private Boolean checkExcelRestriction;

    /** Gets or sets UpdateSmartArt. */
    @JsonProperty("UpdateSmartArt")
    private Boolean updateSmartArt;

    /** Gets or sets EncryptDocumentProperties. */
    @JsonProperty("EncryptDocumentProperties")
    private Boolean encryptDocumentProperties;

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

    public String getSaveFormat() { return saveFormat; }
    public SqlScriptSaveOptions setSaveFormat(String saveFormat) { this.saveFormat = saveFormat; return this; }

    public String getCachedFileFolder() { return cachedFileFolder; }
    public SqlScriptSaveOptions setCachedFileFolder(String cachedFileFolder) { this.cachedFileFolder = cachedFileFolder; return this; }

    public Boolean getClearData() { return clearData; }
    public SqlScriptSaveOptions setClearData(Boolean clearData) { this.clearData = clearData; return this; }

    public Boolean getCreateDirectory() { return createDirectory; }
    public SqlScriptSaveOptions setCreateDirectory(Boolean createDirectory) { this.createDirectory = createDirectory; return this; }

    public Boolean getEnableHTTPCompression() { return enableHTTPCompression; }
    public SqlScriptSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { this.enableHTTPCompression = enableHTTPCompression; return this; }

    public Boolean getRefreshChartCache() { return refreshChartCache; }
    public SqlScriptSaveOptions setRefreshChartCache(Boolean refreshChartCache) { this.refreshChartCache = refreshChartCache; return this; }

    public Boolean getSortNames() { return sortNames; }
    public SqlScriptSaveOptions setSortNames(Boolean sortNames) { this.sortNames = sortNames; return this; }

    public Boolean getValidateMergedAreas() { return validateMergedAreas; }
    public SqlScriptSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { this.validateMergedAreas = validateMergedAreas; return this; }

    public Boolean getMergeAreas() { return mergeAreas; }
    public SqlScriptSaveOptions setMergeAreas(Boolean mergeAreas) { this.mergeAreas = mergeAreas; return this; }

    public Boolean getSortExternalNames() { return sortExternalNames; }
    public SqlScriptSaveOptions setSortExternalNames(Boolean sortExternalNames) { this.sortExternalNames = sortExternalNames; return this; }

    public Boolean getCheckExcelRestriction() { return checkExcelRestriction; }
    public SqlScriptSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    public Boolean getUpdateSmartArt() { return updateSmartArt; }
    public SqlScriptSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { this.updateSmartArt = updateSmartArt; return this; }

    public Boolean getEncryptDocumentProperties() { return encryptDocumentProperties; }
    public SqlScriptSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { this.encryptDocumentProperties = encryptDocumentProperties; return this; }

}
