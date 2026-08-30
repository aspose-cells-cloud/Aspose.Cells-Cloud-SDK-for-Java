package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** JsonSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JsonSaveOptions extends SaveOptions {
    /** Gets or sets ExportArea. */
    @JsonProperty("ExportArea")
    private CellArea exportArea;

    /** Gets or sets HasHeaderRow. */
    @JsonProperty("HasHeaderRow")
    private Boolean hasHeaderRow;

    /** Gets or sets ExportAsString. */
    @JsonProperty("ExportAsString")
    private Boolean exportAsString;

    /** Gets or sets Indent. */
    @JsonProperty("Indent")
    private String indent;

    public CellArea getExportArea() { return exportArea; }
    public JsonSaveOptions setExportArea(CellArea exportArea) { this.exportArea = exportArea; return this; }

    public Boolean getHasHeaderRow() { return hasHeaderRow; }
    public JsonSaveOptions setHasHeaderRow(Boolean hasHeaderRow) { this.hasHeaderRow = hasHeaderRow; return this; }

    public Boolean getExportAsString() { return exportAsString; }
    public JsonSaveOptions setExportAsString(Boolean exportAsString) { this.exportAsString = exportAsString; return this; }

    public String getIndent() { return indent; }
    public JsonSaveOptions setIndent(String indent) { this.indent = indent; return this; }


    /** Covariant override: keeps fluent chains returning JsonSaveOptions. */
    @Override public JsonSaveOptions setSaveFormat(String saveFormat) { return (JsonSaveOptions) super.setSaveFormat(saveFormat); }
    /** Covariant override: keeps fluent chains returning JsonSaveOptions. */
    @Override public JsonSaveOptions setCachedFileFolder(String cachedFileFolder) { return (JsonSaveOptions) super.setCachedFileFolder(cachedFileFolder); }
    /** Covariant override: keeps fluent chains returning JsonSaveOptions. */
    @Override public JsonSaveOptions setClearData(Boolean clearData) { return (JsonSaveOptions) super.setClearData(clearData); }
    /** Covariant override: keeps fluent chains returning JsonSaveOptions. */
    @Override public JsonSaveOptions setCreateDirectory(Boolean createDirectory) { return (JsonSaveOptions) super.setCreateDirectory(createDirectory); }
    /** Covariant override: keeps fluent chains returning JsonSaveOptions. */
    @Override public JsonSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { return (JsonSaveOptions) super.setEnableHTTPCompression(enableHTTPCompression); }
    /** Covariant override: keeps fluent chains returning JsonSaveOptions. */
    @Override public JsonSaveOptions setRefreshChartCache(Boolean refreshChartCache) { return (JsonSaveOptions) super.setRefreshChartCache(refreshChartCache); }
    /** Covariant override: keeps fluent chains returning JsonSaveOptions. */
    @Override public JsonSaveOptions setSortNames(Boolean sortNames) { return (JsonSaveOptions) super.setSortNames(sortNames); }
    /** Covariant override: keeps fluent chains returning JsonSaveOptions. */
    @Override public JsonSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { return (JsonSaveOptions) super.setValidateMergedAreas(validateMergedAreas); }
    /** Covariant override: keeps fluent chains returning JsonSaveOptions. */
    @Override public JsonSaveOptions setMergeAreas(Boolean mergeAreas) { return (JsonSaveOptions) super.setMergeAreas(mergeAreas); }
    /** Covariant override: keeps fluent chains returning JsonSaveOptions. */
    @Override public JsonSaveOptions setSortExternalNames(Boolean sortExternalNames) { return (JsonSaveOptions) super.setSortExternalNames(sortExternalNames); }
    /** Covariant override: keeps fluent chains returning JsonSaveOptions. */
    @Override public JsonSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { return (JsonSaveOptions) super.setCheckExcelRestriction(checkExcelRestriction); }
    /** Covariant override: keeps fluent chains returning JsonSaveOptions. */
    @Override public JsonSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { return (JsonSaveOptions) super.setUpdateSmartArt(updateSmartArt); }
    /** Covariant override: keeps fluent chains returning JsonSaveOptions. */
    @Override public JsonSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { return (JsonSaveOptions) super.setEncryptDocumentProperties(encryptDocumentProperties); }

}
