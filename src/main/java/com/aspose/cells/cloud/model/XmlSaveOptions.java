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


    /** Covariant override: keeps fluent chains returning XmlSaveOptions. */
    @Override public XmlSaveOptions setSaveFormat(String saveFormat) { return (XmlSaveOptions) super.setSaveFormat(saveFormat); }
    /** Covariant override: keeps fluent chains returning XmlSaveOptions. */
    @Override public XmlSaveOptions setCachedFileFolder(String cachedFileFolder) { return (XmlSaveOptions) super.setCachedFileFolder(cachedFileFolder); }
    /** Covariant override: keeps fluent chains returning XmlSaveOptions. */
    @Override public XmlSaveOptions setClearData(Boolean clearData) { return (XmlSaveOptions) super.setClearData(clearData); }
    /** Covariant override: keeps fluent chains returning XmlSaveOptions. */
    @Override public XmlSaveOptions setCreateDirectory(Boolean createDirectory) { return (XmlSaveOptions) super.setCreateDirectory(createDirectory); }
    /** Covariant override: keeps fluent chains returning XmlSaveOptions. */
    @Override public XmlSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { return (XmlSaveOptions) super.setEnableHTTPCompression(enableHTTPCompression); }
    /** Covariant override: keeps fluent chains returning XmlSaveOptions. */
    @Override public XmlSaveOptions setRefreshChartCache(Boolean refreshChartCache) { return (XmlSaveOptions) super.setRefreshChartCache(refreshChartCache); }
    /** Covariant override: keeps fluent chains returning XmlSaveOptions. */
    @Override public XmlSaveOptions setSortNames(Boolean sortNames) { return (XmlSaveOptions) super.setSortNames(sortNames); }
    /** Covariant override: keeps fluent chains returning XmlSaveOptions. */
    @Override public XmlSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { return (XmlSaveOptions) super.setValidateMergedAreas(validateMergedAreas); }
    /** Covariant override: keeps fluent chains returning XmlSaveOptions. */
    @Override public XmlSaveOptions setMergeAreas(Boolean mergeAreas) { return (XmlSaveOptions) super.setMergeAreas(mergeAreas); }
    /** Covariant override: keeps fluent chains returning XmlSaveOptions. */
    @Override public XmlSaveOptions setSortExternalNames(Boolean sortExternalNames) { return (XmlSaveOptions) super.setSortExternalNames(sortExternalNames); }
    /** Covariant override: keeps fluent chains returning XmlSaveOptions. */
    @Override public XmlSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { return (XmlSaveOptions) super.setCheckExcelRestriction(checkExcelRestriction); }
    /** Covariant override: keeps fluent chains returning XmlSaveOptions. */
    @Override public XmlSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { return (XmlSaveOptions) super.setUpdateSmartArt(updateSmartArt); }
    /** Covariant override: keeps fluent chains returning XmlSaveOptions. */
    @Override public XmlSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { return (XmlSaveOptions) super.setEncryptDocumentProperties(encryptDocumentProperties); }

}
