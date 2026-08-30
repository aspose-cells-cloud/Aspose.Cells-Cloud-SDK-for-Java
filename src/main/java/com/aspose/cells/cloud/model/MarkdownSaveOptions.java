package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** MarkdownSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MarkdownSaveOptions extends SaveOptions {
    /** Gets or sets Encoding. */
    @JsonProperty("Encoding")
    private String encoding;

    /** Gets or sets FormatStrategy. */
    @JsonProperty("FormatStrategy")
    private String formatStrategy;

    /** Gets or sets LineSeparator. */
    @JsonProperty("LineSeparator")
    private String lineSeparator;

    public String getEncoding() { return encoding; }
    public MarkdownSaveOptions setEncoding(String encoding) { this.encoding = encoding; return this; }

    public String getFormatStrategy() { return formatStrategy; }
    public MarkdownSaveOptions setFormatStrategy(String formatStrategy) { this.formatStrategy = formatStrategy; return this; }

    public String getLineSeparator() { return lineSeparator; }
    public MarkdownSaveOptions setLineSeparator(String lineSeparator) { this.lineSeparator = lineSeparator; return this; }


    /** Covariant override: keeps fluent chains returning MarkdownSaveOptions. */
    @Override public MarkdownSaveOptions setSaveFormat(String saveFormat) { return (MarkdownSaveOptions) super.setSaveFormat(saveFormat); }
    /** Covariant override: keeps fluent chains returning MarkdownSaveOptions. */
    @Override public MarkdownSaveOptions setCachedFileFolder(String cachedFileFolder) { return (MarkdownSaveOptions) super.setCachedFileFolder(cachedFileFolder); }
    /** Covariant override: keeps fluent chains returning MarkdownSaveOptions. */
    @Override public MarkdownSaveOptions setClearData(Boolean clearData) { return (MarkdownSaveOptions) super.setClearData(clearData); }
    /** Covariant override: keeps fluent chains returning MarkdownSaveOptions. */
    @Override public MarkdownSaveOptions setCreateDirectory(Boolean createDirectory) { return (MarkdownSaveOptions) super.setCreateDirectory(createDirectory); }
    /** Covariant override: keeps fluent chains returning MarkdownSaveOptions. */
    @Override public MarkdownSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { return (MarkdownSaveOptions) super.setEnableHTTPCompression(enableHTTPCompression); }
    /** Covariant override: keeps fluent chains returning MarkdownSaveOptions. */
    @Override public MarkdownSaveOptions setRefreshChartCache(Boolean refreshChartCache) { return (MarkdownSaveOptions) super.setRefreshChartCache(refreshChartCache); }
    /** Covariant override: keeps fluent chains returning MarkdownSaveOptions. */
    @Override public MarkdownSaveOptions setSortNames(Boolean sortNames) { return (MarkdownSaveOptions) super.setSortNames(sortNames); }
    /** Covariant override: keeps fluent chains returning MarkdownSaveOptions. */
    @Override public MarkdownSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { return (MarkdownSaveOptions) super.setValidateMergedAreas(validateMergedAreas); }
    /** Covariant override: keeps fluent chains returning MarkdownSaveOptions. */
    @Override public MarkdownSaveOptions setMergeAreas(Boolean mergeAreas) { return (MarkdownSaveOptions) super.setMergeAreas(mergeAreas); }
    /** Covariant override: keeps fluent chains returning MarkdownSaveOptions. */
    @Override public MarkdownSaveOptions setSortExternalNames(Boolean sortExternalNames) { return (MarkdownSaveOptions) super.setSortExternalNames(sortExternalNames); }
    /** Covariant override: keeps fluent chains returning MarkdownSaveOptions. */
    @Override public MarkdownSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { return (MarkdownSaveOptions) super.setCheckExcelRestriction(checkExcelRestriction); }
    /** Covariant override: keeps fluent chains returning MarkdownSaveOptions. */
    @Override public MarkdownSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { return (MarkdownSaveOptions) super.setUpdateSmartArt(updateSmartArt); }
    /** Covariant override: keeps fluent chains returning MarkdownSaveOptions. */
    @Override public MarkdownSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { return (MarkdownSaveOptions) super.setEncryptDocumentProperties(encryptDocumentProperties); }

}
