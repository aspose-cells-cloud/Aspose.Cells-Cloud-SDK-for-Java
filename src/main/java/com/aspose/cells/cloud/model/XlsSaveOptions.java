package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** XlsSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class XlsSaveOptions extends SaveOptions {
    /** Gets or sets MatchColor. */
    @JsonProperty("MatchColor")
    private Boolean matchColor;

    /** Gets or sets WpsCompatibility. */
    @JsonProperty("WpsCompatibility")
    private Boolean wpsCompatibility;

    public Boolean getMatchColor() { return matchColor; }
    public XlsSaveOptions setMatchColor(Boolean matchColor) { this.matchColor = matchColor; return this; }

    public Boolean getWpsCompatibility() { return wpsCompatibility; }
    public XlsSaveOptions setWpsCompatibility(Boolean wpsCompatibility) { this.wpsCompatibility = wpsCompatibility; return this; }


    /** Covariant override: keeps fluent chains returning XlsSaveOptions. */
    @Override public XlsSaveOptions setSaveFormat(String saveFormat) { return (XlsSaveOptions) super.setSaveFormat(saveFormat); }
    /** Covariant override: keeps fluent chains returning XlsSaveOptions. */
    @Override public XlsSaveOptions setCachedFileFolder(String cachedFileFolder) { return (XlsSaveOptions) super.setCachedFileFolder(cachedFileFolder); }
    /** Covariant override: keeps fluent chains returning XlsSaveOptions. */
    @Override public XlsSaveOptions setClearData(Boolean clearData) { return (XlsSaveOptions) super.setClearData(clearData); }
    /** Covariant override: keeps fluent chains returning XlsSaveOptions. */
    @Override public XlsSaveOptions setCreateDirectory(Boolean createDirectory) { return (XlsSaveOptions) super.setCreateDirectory(createDirectory); }
    /** Covariant override: keeps fluent chains returning XlsSaveOptions. */
    @Override public XlsSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { return (XlsSaveOptions) super.setEnableHTTPCompression(enableHTTPCompression); }
    /** Covariant override: keeps fluent chains returning XlsSaveOptions. */
    @Override public XlsSaveOptions setRefreshChartCache(Boolean refreshChartCache) { return (XlsSaveOptions) super.setRefreshChartCache(refreshChartCache); }
    /** Covariant override: keeps fluent chains returning XlsSaveOptions. */
    @Override public XlsSaveOptions setSortNames(Boolean sortNames) { return (XlsSaveOptions) super.setSortNames(sortNames); }
    /** Covariant override: keeps fluent chains returning XlsSaveOptions. */
    @Override public XlsSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { return (XlsSaveOptions) super.setValidateMergedAreas(validateMergedAreas); }
    /** Covariant override: keeps fluent chains returning XlsSaveOptions. */
    @Override public XlsSaveOptions setMergeAreas(Boolean mergeAreas) { return (XlsSaveOptions) super.setMergeAreas(mergeAreas); }
    /** Covariant override: keeps fluent chains returning XlsSaveOptions. */
    @Override public XlsSaveOptions setSortExternalNames(Boolean sortExternalNames) { return (XlsSaveOptions) super.setSortExternalNames(sortExternalNames); }
    /** Covariant override: keeps fluent chains returning XlsSaveOptions. */
    @Override public XlsSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { return (XlsSaveOptions) super.setCheckExcelRestriction(checkExcelRestriction); }
    /** Covariant override: keeps fluent chains returning XlsSaveOptions. */
    @Override public XlsSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { return (XlsSaveOptions) super.setUpdateSmartArt(updateSmartArt); }
    /** Covariant override: keeps fluent chains returning XlsSaveOptions. */
    @Override public XlsSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { return (XlsSaveOptions) super.setEncryptDocumentProperties(encryptDocumentProperties); }

}
