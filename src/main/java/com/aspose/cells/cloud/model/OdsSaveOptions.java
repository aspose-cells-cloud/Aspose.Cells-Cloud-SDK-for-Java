package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** OdsSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OdsSaveOptions extends SaveOptions {
    /** Gets or sets GeneratorType. */
    @JsonProperty("GeneratorType")
    private String generatorType;

    /** Gets or sets OdfStrictVersion. */
    @JsonProperty("OdfStrictVersion")
    private String odfStrictVersion;

    /** Gets or sets IgnorePivotTables. */
    @JsonProperty("IgnorePivotTables")
    private Boolean ignorePivotTables;

    public String getGeneratorType() { return generatorType; }
    public OdsSaveOptions setGeneratorType(String generatorType) { this.generatorType = generatorType; return this; }

    public String getOdfStrictVersion() { return odfStrictVersion; }
    public OdsSaveOptions setOdfStrictVersion(String odfStrictVersion) { this.odfStrictVersion = odfStrictVersion; return this; }

    public Boolean getIgnorePivotTables() { return ignorePivotTables; }
    public OdsSaveOptions setIgnorePivotTables(Boolean ignorePivotTables) { this.ignorePivotTables = ignorePivotTables; return this; }


    /** Covariant override: keeps fluent chains returning OdsSaveOptions. */
    @Override public OdsSaveOptions setSaveFormat(String saveFormat) { return (OdsSaveOptions) super.setSaveFormat(saveFormat); }
    /** Covariant override: keeps fluent chains returning OdsSaveOptions. */
    @Override public OdsSaveOptions setCachedFileFolder(String cachedFileFolder) { return (OdsSaveOptions) super.setCachedFileFolder(cachedFileFolder); }
    /** Covariant override: keeps fluent chains returning OdsSaveOptions. */
    @Override public OdsSaveOptions setClearData(Boolean clearData) { return (OdsSaveOptions) super.setClearData(clearData); }
    /** Covariant override: keeps fluent chains returning OdsSaveOptions. */
    @Override public OdsSaveOptions setCreateDirectory(Boolean createDirectory) { return (OdsSaveOptions) super.setCreateDirectory(createDirectory); }
    /** Covariant override: keeps fluent chains returning OdsSaveOptions. */
    @Override public OdsSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { return (OdsSaveOptions) super.setEnableHTTPCompression(enableHTTPCompression); }
    /** Covariant override: keeps fluent chains returning OdsSaveOptions. */
    @Override public OdsSaveOptions setRefreshChartCache(Boolean refreshChartCache) { return (OdsSaveOptions) super.setRefreshChartCache(refreshChartCache); }
    /** Covariant override: keeps fluent chains returning OdsSaveOptions. */
    @Override public OdsSaveOptions setSortNames(Boolean sortNames) { return (OdsSaveOptions) super.setSortNames(sortNames); }
    /** Covariant override: keeps fluent chains returning OdsSaveOptions. */
    @Override public OdsSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { return (OdsSaveOptions) super.setValidateMergedAreas(validateMergedAreas); }
    /** Covariant override: keeps fluent chains returning OdsSaveOptions. */
    @Override public OdsSaveOptions setMergeAreas(Boolean mergeAreas) { return (OdsSaveOptions) super.setMergeAreas(mergeAreas); }
    /** Covariant override: keeps fluent chains returning OdsSaveOptions. */
    @Override public OdsSaveOptions setSortExternalNames(Boolean sortExternalNames) { return (OdsSaveOptions) super.setSortExternalNames(sortExternalNames); }
    /** Covariant override: keeps fluent chains returning OdsSaveOptions. */
    @Override public OdsSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { return (OdsSaveOptions) super.setCheckExcelRestriction(checkExcelRestriction); }
    /** Covariant override: keeps fluent chains returning OdsSaveOptions. */
    @Override public OdsSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { return (OdsSaveOptions) super.setUpdateSmartArt(updateSmartArt); }
    /** Covariant override: keeps fluent chains returning OdsSaveOptions. */
    @Override public OdsSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { return (OdsSaveOptions) super.setEncryptDocumentProperties(encryptDocumentProperties); }

}
