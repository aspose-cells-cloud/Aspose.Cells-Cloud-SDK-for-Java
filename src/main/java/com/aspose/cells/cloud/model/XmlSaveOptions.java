package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** XmlSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class XmlSaveOptions extends SaveOptions {
    /** Gets or sets SheetIndexes. */
    @JsonProperty("SheetIndexes")
    private List<Integer> sheetIndexes;

    /** Gets or sets ExportArea. */
    @JsonProperty("ExportArea")
    private CellArea exportArea;

    /** Gets or sets HasHeaderRow. */
    @JsonProperty("HasHeaderRow")
    private Boolean hasHeaderRow;

    /** Gets or sets XmlMapName. */
    @JsonProperty("XmlMapName")
    private String xmlMapName;

    /** Gets or sets SheetNameAsElementName. */
    @JsonProperty("SheetNameAsElementName")
    private Boolean sheetNameAsElementName;

    /** Gets or sets DataAsAttribute. */
    @JsonProperty("DataAsAttribute")
    private Boolean dataAsAttribute;

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

    public List<Integer> getSheetIndexes() { return sheetIndexes; }
    public XmlSaveOptions setSheetIndexes(List<Integer> sheetIndexes) { this.sheetIndexes = sheetIndexes; return this; }

    public CellArea getExportArea() { return exportArea; }
    public XmlSaveOptions setExportArea(CellArea exportArea) { this.exportArea = exportArea; return this; }

    public Boolean getHasHeaderRow() { return hasHeaderRow; }
    public XmlSaveOptions setHasHeaderRow(Boolean hasHeaderRow) { this.hasHeaderRow = hasHeaderRow; return this; }

    public String getXmlMapName() { return xmlMapName; }
    public XmlSaveOptions setXmlMapName(String xmlMapName) { this.xmlMapName = xmlMapName; return this; }

    public Boolean getSheetNameAsElementName() { return sheetNameAsElementName; }
    public XmlSaveOptions setSheetNameAsElementName(Boolean sheetNameAsElementName) { this.sheetNameAsElementName = sheetNameAsElementName; return this; }

    public Boolean getDataAsAttribute() { return dataAsAttribute; }
    public XmlSaveOptions setDataAsAttribute(Boolean dataAsAttribute) { this.dataAsAttribute = dataAsAttribute; return this; }

    public String getSaveFormat() { return saveFormat; }
    public XmlSaveOptions setSaveFormat(String saveFormat) { this.saveFormat = saveFormat; return this; }

    public String getCachedFileFolder() { return cachedFileFolder; }
    public XmlSaveOptions setCachedFileFolder(String cachedFileFolder) { this.cachedFileFolder = cachedFileFolder; return this; }

    public Boolean getClearData() { return clearData; }
    public XmlSaveOptions setClearData(Boolean clearData) { this.clearData = clearData; return this; }

    public Boolean getCreateDirectory() { return createDirectory; }
    public XmlSaveOptions setCreateDirectory(Boolean createDirectory) { this.createDirectory = createDirectory; return this; }

    public Boolean getEnableHTTPCompression() { return enableHTTPCompression; }
    public XmlSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { this.enableHTTPCompression = enableHTTPCompression; return this; }

    public Boolean getRefreshChartCache() { return refreshChartCache; }
    public XmlSaveOptions setRefreshChartCache(Boolean refreshChartCache) { this.refreshChartCache = refreshChartCache; return this; }

    public Boolean getSortNames() { return sortNames; }
    public XmlSaveOptions setSortNames(Boolean sortNames) { this.sortNames = sortNames; return this; }

    public Boolean getValidateMergedAreas() { return validateMergedAreas; }
    public XmlSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { this.validateMergedAreas = validateMergedAreas; return this; }

    public Boolean getMergeAreas() { return mergeAreas; }
    public XmlSaveOptions setMergeAreas(Boolean mergeAreas) { this.mergeAreas = mergeAreas; return this; }

    public Boolean getSortExternalNames() { return sortExternalNames; }
    public XmlSaveOptions setSortExternalNames(Boolean sortExternalNames) { this.sortExternalNames = sortExternalNames; return this; }

    public Boolean getCheckExcelRestriction() { return checkExcelRestriction; }
    public XmlSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    public Boolean getUpdateSmartArt() { return updateSmartArt; }
    public XmlSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { this.updateSmartArt = updateSmartArt; return this; }

    public Boolean getEncryptDocumentProperties() { return encryptDocumentProperties; }
    public XmlSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { this.encryptDocumentProperties = encryptDocumentProperties; return this; }

}
