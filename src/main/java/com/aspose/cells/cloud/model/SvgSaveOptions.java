package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SvgSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SvgSaveOptions extends SaveOptions {
    /** Gets or sets SheetIndex. */
    @JsonProperty("SheetIndex")
    private Integer sheetIndex;

    /** Gets or sets ChartImageType. */
    @JsonProperty("ChartImageType")
    private String chartImageType;

    /** Gets or sets EmbededImageNameInSvg. */
    @JsonProperty("EmbededImageNameInSvg")
    private String embededImageNameInSvg;

    /** Gets or sets HorizontalResolution. */
    @JsonProperty("HorizontalResolution")
    private Integer horizontalResolution;

    /** Gets or sets ImageFormat. */
    @JsonProperty("ImageFormat")
    private String imageFormat;

    /** Gets or sets IsCellAutoFit. */
    @JsonProperty("IsCellAutoFit")
    private Boolean isCellAutoFit;

    /** Gets or sets OnePagePerSheet. */
    @JsonProperty("OnePagePerSheet")
    private Boolean onePagePerSheet;

    /** Gets or sets OnlyArea. */
    @JsonProperty("OnlyArea")
    private Boolean onlyArea;

    /** Gets or sets PrintingPage. */
    @JsonProperty("PrintingPage")
    private String printingPage;

    /** Gets or sets PrintWithStatusDialog. */
    @JsonProperty("PrintWithStatusDialog")
    private Boolean printWithStatusDialog;

    /** Gets or sets Quality. */
    @JsonProperty("Quality")
    private Integer quality;

    /** Gets or sets TiffCompression. */
    @JsonProperty("TiffCompression")
    private String tiffCompression;

    /** Gets or sets VerticalResolution. */
    @JsonProperty("VerticalResolution")
    private Integer verticalResolution;

    public Integer getSheetIndex() { return sheetIndex; }
    public SvgSaveOptions setSheetIndex(Integer sheetIndex) { this.sheetIndex = sheetIndex; return this; }

    public String getChartImageType() { return chartImageType; }
    public SvgSaveOptions setChartImageType(String chartImageType) { this.chartImageType = chartImageType; return this; }

    public String getEmbededImageNameInSvg() { return embededImageNameInSvg; }
    public SvgSaveOptions setEmbededImageNameInSvg(String embededImageNameInSvg) { this.embededImageNameInSvg = embededImageNameInSvg; return this; }

    public Integer getHorizontalResolution() { return horizontalResolution; }
    public SvgSaveOptions setHorizontalResolution(Integer horizontalResolution) { this.horizontalResolution = horizontalResolution; return this; }

    public String getImageFormat() { return imageFormat; }
    public SvgSaveOptions setImageFormat(String imageFormat) { this.imageFormat = imageFormat; return this; }

    public Boolean getIsCellAutoFit() { return isCellAutoFit; }
    public SvgSaveOptions setIsCellAutoFit(Boolean isCellAutoFit) { this.isCellAutoFit = isCellAutoFit; return this; }

    public Boolean getOnePagePerSheet() { return onePagePerSheet; }
    public SvgSaveOptions setOnePagePerSheet(Boolean onePagePerSheet) { this.onePagePerSheet = onePagePerSheet; return this; }

    public Boolean getOnlyArea() { return onlyArea; }
    public SvgSaveOptions setOnlyArea(Boolean onlyArea) { this.onlyArea = onlyArea; return this; }

    public String getPrintingPage() { return printingPage; }
    public SvgSaveOptions setPrintingPage(String printingPage) { this.printingPage = printingPage; return this; }

    public Boolean getPrintWithStatusDialog() { return printWithStatusDialog; }
    public SvgSaveOptions setPrintWithStatusDialog(Boolean printWithStatusDialog) { this.printWithStatusDialog = printWithStatusDialog; return this; }

    public Integer getQuality() { return quality; }
    public SvgSaveOptions setQuality(Integer quality) { this.quality = quality; return this; }

    public String getTiffCompression() { return tiffCompression; }
    public SvgSaveOptions setTiffCompression(String tiffCompression) { this.tiffCompression = tiffCompression; return this; }

    public Integer getVerticalResolution() { return verticalResolution; }
    public SvgSaveOptions setVerticalResolution(Integer verticalResolution) { this.verticalResolution = verticalResolution; return this; }


    /** Covariant override: keeps fluent chains returning SvgSaveOptions. */
    @Override public SvgSaveOptions setSaveFormat(String saveFormat) { return (SvgSaveOptions) super.setSaveFormat(saveFormat); }
    /** Covariant override: keeps fluent chains returning SvgSaveOptions. */
    @Override public SvgSaveOptions setCachedFileFolder(String cachedFileFolder) { return (SvgSaveOptions) super.setCachedFileFolder(cachedFileFolder); }
    /** Covariant override: keeps fluent chains returning SvgSaveOptions. */
    @Override public SvgSaveOptions setClearData(Boolean clearData) { return (SvgSaveOptions) super.setClearData(clearData); }
    /** Covariant override: keeps fluent chains returning SvgSaveOptions. */
    @Override public SvgSaveOptions setCreateDirectory(Boolean createDirectory) { return (SvgSaveOptions) super.setCreateDirectory(createDirectory); }
    /** Covariant override: keeps fluent chains returning SvgSaveOptions. */
    @Override public SvgSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { return (SvgSaveOptions) super.setEnableHTTPCompression(enableHTTPCompression); }
    /** Covariant override: keeps fluent chains returning SvgSaveOptions. */
    @Override public SvgSaveOptions setRefreshChartCache(Boolean refreshChartCache) { return (SvgSaveOptions) super.setRefreshChartCache(refreshChartCache); }
    /** Covariant override: keeps fluent chains returning SvgSaveOptions. */
    @Override public SvgSaveOptions setSortNames(Boolean sortNames) { return (SvgSaveOptions) super.setSortNames(sortNames); }
    /** Covariant override: keeps fluent chains returning SvgSaveOptions. */
    @Override public SvgSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { return (SvgSaveOptions) super.setValidateMergedAreas(validateMergedAreas); }
    /** Covariant override: keeps fluent chains returning SvgSaveOptions. */
    @Override public SvgSaveOptions setMergeAreas(Boolean mergeAreas) { return (SvgSaveOptions) super.setMergeAreas(mergeAreas); }
    /** Covariant override: keeps fluent chains returning SvgSaveOptions. */
    @Override public SvgSaveOptions setSortExternalNames(Boolean sortExternalNames) { return (SvgSaveOptions) super.setSortExternalNames(sortExternalNames); }
    /** Covariant override: keeps fluent chains returning SvgSaveOptions. */
    @Override public SvgSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { return (SvgSaveOptions) super.setCheckExcelRestriction(checkExcelRestriction); }
    /** Covariant override: keeps fluent chains returning SvgSaveOptions. */
    @Override public SvgSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { return (SvgSaveOptions) super.setUpdateSmartArt(updateSmartArt); }
    /** Covariant override: keeps fluent chains returning SvgSaveOptions. */
    @Override public SvgSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { return (SvgSaveOptions) super.setEncryptDocumentProperties(encryptDocumentProperties); }

}
