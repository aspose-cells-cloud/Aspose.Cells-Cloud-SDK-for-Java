package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ImageSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageSaveOptions extends SaveOptions {
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

    public String getChartImageType() { return chartImageType; }
    public ImageSaveOptions setChartImageType(String chartImageType) { this.chartImageType = chartImageType; return this; }

    public String getEmbededImageNameInSvg() { return embededImageNameInSvg; }
    public ImageSaveOptions setEmbededImageNameInSvg(String embededImageNameInSvg) { this.embededImageNameInSvg = embededImageNameInSvg; return this; }

    public Integer getHorizontalResolution() { return horizontalResolution; }
    public ImageSaveOptions setHorizontalResolution(Integer horizontalResolution) { this.horizontalResolution = horizontalResolution; return this; }

    public String getImageFormat() { return imageFormat; }
    public ImageSaveOptions setImageFormat(String imageFormat) { this.imageFormat = imageFormat; return this; }

    public Boolean getIsCellAutoFit() { return isCellAutoFit; }
    public ImageSaveOptions setIsCellAutoFit(Boolean isCellAutoFit) { this.isCellAutoFit = isCellAutoFit; return this; }

    public Boolean getOnePagePerSheet() { return onePagePerSheet; }
    public ImageSaveOptions setOnePagePerSheet(Boolean onePagePerSheet) { this.onePagePerSheet = onePagePerSheet; return this; }

    public Boolean getOnlyArea() { return onlyArea; }
    public ImageSaveOptions setOnlyArea(Boolean onlyArea) { this.onlyArea = onlyArea; return this; }

    public String getPrintingPage() { return printingPage; }
    public ImageSaveOptions setPrintingPage(String printingPage) { this.printingPage = printingPage; return this; }

    public Boolean getPrintWithStatusDialog() { return printWithStatusDialog; }
    public ImageSaveOptions setPrintWithStatusDialog(Boolean printWithStatusDialog) { this.printWithStatusDialog = printWithStatusDialog; return this; }

    public Integer getQuality() { return quality; }
    public ImageSaveOptions setQuality(Integer quality) { this.quality = quality; return this; }

    public String getTiffCompression() { return tiffCompression; }
    public ImageSaveOptions setTiffCompression(String tiffCompression) { this.tiffCompression = tiffCompression; return this; }

    public Integer getVerticalResolution() { return verticalResolution; }
    public ImageSaveOptions setVerticalResolution(Integer verticalResolution) { this.verticalResolution = verticalResolution; return this; }


    /** Covariant override: keeps fluent chains returning ImageSaveOptions. */
    @Override public ImageSaveOptions setSaveFormat(String saveFormat) { return (ImageSaveOptions) super.setSaveFormat(saveFormat); }
    /** Covariant override: keeps fluent chains returning ImageSaveOptions. */
    @Override public ImageSaveOptions setCachedFileFolder(String cachedFileFolder) { return (ImageSaveOptions) super.setCachedFileFolder(cachedFileFolder); }
    /** Covariant override: keeps fluent chains returning ImageSaveOptions. */
    @Override public ImageSaveOptions setClearData(Boolean clearData) { return (ImageSaveOptions) super.setClearData(clearData); }
    /** Covariant override: keeps fluent chains returning ImageSaveOptions. */
    @Override public ImageSaveOptions setCreateDirectory(Boolean createDirectory) { return (ImageSaveOptions) super.setCreateDirectory(createDirectory); }
    /** Covariant override: keeps fluent chains returning ImageSaveOptions. */
    @Override public ImageSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { return (ImageSaveOptions) super.setEnableHTTPCompression(enableHTTPCompression); }
    /** Covariant override: keeps fluent chains returning ImageSaveOptions. */
    @Override public ImageSaveOptions setRefreshChartCache(Boolean refreshChartCache) { return (ImageSaveOptions) super.setRefreshChartCache(refreshChartCache); }
    /** Covariant override: keeps fluent chains returning ImageSaveOptions. */
    @Override public ImageSaveOptions setSortNames(Boolean sortNames) { return (ImageSaveOptions) super.setSortNames(sortNames); }
    /** Covariant override: keeps fluent chains returning ImageSaveOptions. */
    @Override public ImageSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { return (ImageSaveOptions) super.setValidateMergedAreas(validateMergedAreas); }
    /** Covariant override: keeps fluent chains returning ImageSaveOptions. */
    @Override public ImageSaveOptions setMergeAreas(Boolean mergeAreas) { return (ImageSaveOptions) super.setMergeAreas(mergeAreas); }
    /** Covariant override: keeps fluent chains returning ImageSaveOptions. */
    @Override public ImageSaveOptions setSortExternalNames(Boolean sortExternalNames) { return (ImageSaveOptions) super.setSortExternalNames(sortExternalNames); }
    /** Covariant override: keeps fluent chains returning ImageSaveOptions. */
    @Override public ImageSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { return (ImageSaveOptions) super.setCheckExcelRestriction(checkExcelRestriction); }
    /** Covariant override: keeps fluent chains returning ImageSaveOptions. */
    @Override public ImageSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { return (ImageSaveOptions) super.setUpdateSmartArt(updateSmartArt); }
    /** Covariant override: keeps fluent chains returning ImageSaveOptions. */
    @Override public ImageSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { return (ImageSaveOptions) super.setEncryptDocumentProperties(encryptDocumentProperties); }

}
