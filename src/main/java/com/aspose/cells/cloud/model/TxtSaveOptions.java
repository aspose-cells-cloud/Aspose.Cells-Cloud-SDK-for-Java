package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TxtSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TxtSaveOptions extends SaveOptions {
    /** Gets or sets QuoteType. */
    @JsonProperty("QuoteType")
    private String quoteType;

    /** Gets or sets Separator. */
    @JsonProperty("Separator")
    private String separator;

    /** Gets or sets SeparatorString. */
    @JsonProperty("SeparatorString")
    private String separatorString;

    /** Gets or sets AlwaysQuoted. */
    @JsonProperty("AlwaysQuoted")
    private Boolean alwaysQuoted;

    public String getQuoteType() { return quoteType; }
    public TxtSaveOptions setQuoteType(String quoteType) { this.quoteType = quoteType; return this; }

    public String getSeparator() { return separator; }
    public TxtSaveOptions setSeparator(String separator) { this.separator = separator; return this; }

    public String getSeparatorString() { return separatorString; }
    public TxtSaveOptions setSeparatorString(String separatorString) { this.separatorString = separatorString; return this; }

    public Boolean getAlwaysQuoted() { return alwaysQuoted; }
    public TxtSaveOptions setAlwaysQuoted(Boolean alwaysQuoted) { this.alwaysQuoted = alwaysQuoted; return this; }


    /** Covariant override: keeps fluent chains returning TxtSaveOptions. */
    @Override public TxtSaveOptions setSaveFormat(String saveFormat) { return (TxtSaveOptions) super.setSaveFormat(saveFormat); }
    /** Covariant override: keeps fluent chains returning TxtSaveOptions. */
    @Override public TxtSaveOptions setCachedFileFolder(String cachedFileFolder) { return (TxtSaveOptions) super.setCachedFileFolder(cachedFileFolder); }
    /** Covariant override: keeps fluent chains returning TxtSaveOptions. */
    @Override public TxtSaveOptions setClearData(Boolean clearData) { return (TxtSaveOptions) super.setClearData(clearData); }
    /** Covariant override: keeps fluent chains returning TxtSaveOptions. */
    @Override public TxtSaveOptions setCreateDirectory(Boolean createDirectory) { return (TxtSaveOptions) super.setCreateDirectory(createDirectory); }
    /** Covariant override: keeps fluent chains returning TxtSaveOptions. */
    @Override public TxtSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { return (TxtSaveOptions) super.setEnableHTTPCompression(enableHTTPCompression); }
    /** Covariant override: keeps fluent chains returning TxtSaveOptions. */
    @Override public TxtSaveOptions setRefreshChartCache(Boolean refreshChartCache) { return (TxtSaveOptions) super.setRefreshChartCache(refreshChartCache); }
    /** Covariant override: keeps fluent chains returning TxtSaveOptions. */
    @Override public TxtSaveOptions setSortNames(Boolean sortNames) { return (TxtSaveOptions) super.setSortNames(sortNames); }
    /** Covariant override: keeps fluent chains returning TxtSaveOptions. */
    @Override public TxtSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { return (TxtSaveOptions) super.setValidateMergedAreas(validateMergedAreas); }
    /** Covariant override: keeps fluent chains returning TxtSaveOptions. */
    @Override public TxtSaveOptions setMergeAreas(Boolean mergeAreas) { return (TxtSaveOptions) super.setMergeAreas(mergeAreas); }
    /** Covariant override: keeps fluent chains returning TxtSaveOptions. */
    @Override public TxtSaveOptions setSortExternalNames(Boolean sortExternalNames) { return (TxtSaveOptions) super.setSortExternalNames(sortExternalNames); }
    /** Covariant override: keeps fluent chains returning TxtSaveOptions. */
    @Override public TxtSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { return (TxtSaveOptions) super.setCheckExcelRestriction(checkExcelRestriction); }
    /** Covariant override: keeps fluent chains returning TxtSaveOptions. */
    @Override public TxtSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { return (TxtSaveOptions) super.setUpdateSmartArt(updateSmartArt); }
    /** Covariant override: keeps fluent chains returning TxtSaveOptions. */
    @Override public TxtSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { return (TxtSaveOptions) super.setEncryptDocumentProperties(encryptDocumentProperties); }

}
