package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PdfSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PdfSaveOptions extends SaveOptions {
    /** Gets or sets DisplayDocTitle. */
    @JsonProperty("DisplayDocTitle")
    private Boolean displayDocTitle;

    /** Gets or sets ExportDocumentStructure. */
    @JsonProperty("ExportDocumentStructure")
    private Boolean exportDocumentStructure;

    /** Gets or sets EmfRenderSetting. */
    @JsonProperty("EmfRenderSetting")
    private String emfRenderSetting;

    /** Gets or sets CustomPropertiesExport. */
    @JsonProperty("CustomPropertiesExport")
    private String customPropertiesExport;

    /** Gets or sets OptimizationType. */
    @JsonProperty("OptimizationType")
    private String optimizationType;

    /** Gets or sets Producer. */
    @JsonProperty("Producer")
    private String producer;

    /** Gets or sets PdfCompression. */
    @JsonProperty("PdfCompression")
    private String pdfCompression;

    /** Gets or sets FontEncoding. */
    @JsonProperty("FontEncoding")
    private String fontEncoding;

    /** Gets or sets Watermark. */
    @JsonProperty("Watermark")
    private RenderingWatermark watermark;

    /** Gets or sets CalculateFormula. */
    @JsonProperty("CalculateFormula")
    private Boolean calculateFormula;

    /** Gets or sets CheckFontCompatibility. */
    @JsonProperty("CheckFontCompatibility")
    private Boolean checkFontCompatibility;

    /** Gets or sets Compliance. */
    @JsonProperty("Compliance")
    private String compliance;

    /** Gets or sets DefaultFont. */
    @JsonProperty("DefaultFont")
    private String defaultFont;

    /** Gets or sets OnePagePerSheet. */
    @JsonProperty("OnePagePerSheet")
    private Boolean onePagePerSheet;

    /** Gets or sets PrintingPageType. */
    @JsonProperty("PrintingPageType")
    private String printingPageType;

    /** Gets or sets SecurityOptions. */
    @JsonProperty("SecurityOptions")
    private PdfSecurityOptions securityOptions;

    /** Gets or sets desiredPPI. */
    @JsonProperty("desiredPPI")
    private Integer desiredPPI;

    /** Gets or sets jpegQuality. */
    @JsonProperty("jpegQuality")
    private Integer jpegQuality;

    /** Gets or sets ImageType. */
    @JsonProperty("ImageType")
    private String imageType;

    public Boolean getDisplayDocTitle() { return displayDocTitle; }
    public PdfSaveOptions setDisplayDocTitle(Boolean displayDocTitle) { this.displayDocTitle = displayDocTitle; return this; }

    public Boolean getExportDocumentStructure() { return exportDocumentStructure; }
    public PdfSaveOptions setExportDocumentStructure(Boolean exportDocumentStructure) { this.exportDocumentStructure = exportDocumentStructure; return this; }

    public String getEmfRenderSetting() { return emfRenderSetting; }
    public PdfSaveOptions setEmfRenderSetting(String emfRenderSetting) { this.emfRenderSetting = emfRenderSetting; return this; }

    public String getCustomPropertiesExport() { return customPropertiesExport; }
    public PdfSaveOptions setCustomPropertiesExport(String customPropertiesExport) { this.customPropertiesExport = customPropertiesExport; return this; }

    public String getOptimizationType() { return optimizationType; }
    public PdfSaveOptions setOptimizationType(String optimizationType) { this.optimizationType = optimizationType; return this; }

    public String getProducer() { return producer; }
    public PdfSaveOptions setProducer(String producer) { this.producer = producer; return this; }

    public String getPdfCompression() { return pdfCompression; }
    public PdfSaveOptions setPdfCompression(String pdfCompression) { this.pdfCompression = pdfCompression; return this; }

    public String getFontEncoding() { return fontEncoding; }
    public PdfSaveOptions setFontEncoding(String fontEncoding) { this.fontEncoding = fontEncoding; return this; }

    public RenderingWatermark getWatermark() { return watermark; }
    public PdfSaveOptions setWatermark(RenderingWatermark watermark) { this.watermark = watermark; return this; }

    public Boolean getCalculateFormula() { return calculateFormula; }
    public PdfSaveOptions setCalculateFormula(Boolean calculateFormula) { this.calculateFormula = calculateFormula; return this; }

    public Boolean getCheckFontCompatibility() { return checkFontCompatibility; }
    public PdfSaveOptions setCheckFontCompatibility(Boolean checkFontCompatibility) { this.checkFontCompatibility = checkFontCompatibility; return this; }

    public String getCompliance() { return compliance; }
    public PdfSaveOptions setCompliance(String compliance) { this.compliance = compliance; return this; }

    public String getDefaultFont() { return defaultFont; }
    public PdfSaveOptions setDefaultFont(String defaultFont) { this.defaultFont = defaultFont; return this; }

    public Boolean getOnePagePerSheet() { return onePagePerSheet; }
    public PdfSaveOptions setOnePagePerSheet(Boolean onePagePerSheet) { this.onePagePerSheet = onePagePerSheet; return this; }

    public String getPrintingPageType() { return printingPageType; }
    public PdfSaveOptions setPrintingPageType(String printingPageType) { this.printingPageType = printingPageType; return this; }

    public PdfSecurityOptions getSecurityOptions() { return securityOptions; }
    public PdfSaveOptions setSecurityOptions(PdfSecurityOptions securityOptions) { this.securityOptions = securityOptions; return this; }

    public Integer getDesiredPPI() { return desiredPPI; }
    public PdfSaveOptions setDesiredPPI(Integer desiredPPI) { this.desiredPPI = desiredPPI; return this; }

    public Integer getJpegQuality() { return jpegQuality; }
    public PdfSaveOptions setJpegQuality(Integer jpegQuality) { this.jpegQuality = jpegQuality; return this; }

    public String getImageType() { return imageType; }
    public PdfSaveOptions setImageType(String imageType) { this.imageType = imageType; return this; }


    /** Covariant override: keeps fluent chains returning PdfSaveOptions. */
    @Override public PdfSaveOptions setSaveFormat(String saveFormat) { return (PdfSaveOptions) super.setSaveFormat(saveFormat); }
    /** Covariant override: keeps fluent chains returning PdfSaveOptions. */
    @Override public PdfSaveOptions setCachedFileFolder(String cachedFileFolder) { return (PdfSaveOptions) super.setCachedFileFolder(cachedFileFolder); }
    /** Covariant override: keeps fluent chains returning PdfSaveOptions. */
    @Override public PdfSaveOptions setClearData(Boolean clearData) { return (PdfSaveOptions) super.setClearData(clearData); }
    /** Covariant override: keeps fluent chains returning PdfSaveOptions. */
    @Override public PdfSaveOptions setCreateDirectory(Boolean createDirectory) { return (PdfSaveOptions) super.setCreateDirectory(createDirectory); }
    /** Covariant override: keeps fluent chains returning PdfSaveOptions. */
    @Override public PdfSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { return (PdfSaveOptions) super.setEnableHTTPCompression(enableHTTPCompression); }
    /** Covariant override: keeps fluent chains returning PdfSaveOptions. */
    @Override public PdfSaveOptions setRefreshChartCache(Boolean refreshChartCache) { return (PdfSaveOptions) super.setRefreshChartCache(refreshChartCache); }
    /** Covariant override: keeps fluent chains returning PdfSaveOptions. */
    @Override public PdfSaveOptions setSortNames(Boolean sortNames) { return (PdfSaveOptions) super.setSortNames(sortNames); }
    /** Covariant override: keeps fluent chains returning PdfSaveOptions. */
    @Override public PdfSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { return (PdfSaveOptions) super.setValidateMergedAreas(validateMergedAreas); }
    /** Covariant override: keeps fluent chains returning PdfSaveOptions. */
    @Override public PdfSaveOptions setMergeAreas(Boolean mergeAreas) { return (PdfSaveOptions) super.setMergeAreas(mergeAreas); }
    /** Covariant override: keeps fluent chains returning PdfSaveOptions. */
    @Override public PdfSaveOptions setSortExternalNames(Boolean sortExternalNames) { return (PdfSaveOptions) super.setSortExternalNames(sortExternalNames); }
    /** Covariant override: keeps fluent chains returning PdfSaveOptions. */
    @Override public PdfSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { return (PdfSaveOptions) super.setCheckExcelRestriction(checkExcelRestriction); }
    /** Covariant override: keeps fluent chains returning PdfSaveOptions. */
    @Override public PdfSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { return (PdfSaveOptions) super.setUpdateSmartArt(updateSmartArt); }
    /** Covariant override: keeps fluent chains returning PdfSaveOptions. */
    @Override public PdfSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { return (PdfSaveOptions) super.setEncryptDocumentProperties(encryptDocumentProperties); }

}
