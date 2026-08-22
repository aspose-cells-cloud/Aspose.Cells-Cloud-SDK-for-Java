package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ImageOrPrintOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageOrPrintOptions {
    /** Gets or sets TextCrossType. */
    @JsonProperty("TextCrossType")
    private String textCrossType;

    /** Gets or sets GridlineType. */
    @JsonProperty("GridlineType")
    private String gridlineType;

    /** Gets or sets OutputBlankPageWhenNothingToPrint. */
    @JsonProperty("OutputBlankPageWhenNothingToPrint")
    private Boolean outputBlankPageWhenNothingToPrint;

    /** Gets or sets CheckWorkbookDefaultFont. */
    @JsonProperty("CheckWorkbookDefaultFont")
    private Boolean checkWorkbookDefaultFont;

    /** Gets or sets DefaultFont. */
    @JsonProperty("DefaultFont")
    private String defaultFont;

    /** Gets or sets IsOptimized. */
    @JsonProperty("IsOptimized")
    private Boolean isOptimized;

    /** Gets or sets PageCount. */
    @JsonProperty("PageCount")
    private Integer pageCount;

    /** Gets or sets PageIndex. */
    @JsonProperty("PageIndex")
    private Integer pageIndex;

    /** Gets or sets IsFontSubstitutionCharGranularity. */
    @JsonProperty("IsFontSubstitutionCharGranularity")
    private Boolean isFontSubstitutionCharGranularity;

    /** Gets or sets Transparent. */
    @JsonProperty("Transparent")
    private Boolean transparent;

    /** Gets or sets OnlyArea. */
    @JsonProperty("OnlyArea")
    private Boolean onlyArea;

    /** Gets or sets SVGFitToViewPort. */
    @JsonProperty("SVGFitToViewPort")
    private Boolean sVGFitToViewPort;

    /** Gets or sets EmbededImageNameInSvg. */
    @JsonProperty("EmbededImageNameInSvg")
    private String embededImageNameInSvg;

    /** Gets or sets AllColumnsInOnePagePerSheet. */
    @JsonProperty("AllColumnsInOnePagePerSheet")
    private Boolean allColumnsInOnePagePerSheet;

    /** Gets or sets PrintWithStatusDialog. */
    @JsonProperty("PrintWithStatusDialog")
    private Boolean printWithStatusDialog;

    /** Gets or sets HorizontalResolution. */
    @JsonProperty("HorizontalResolution")
    private Integer horizontalResolution;

    /** Gets or sets VerticalResolution. */
    @JsonProperty("VerticalResolution")
    private Integer verticalResolution;

    /** Gets or sets DefaultEditLanguage. */
    @JsonProperty("DefaultEditLanguage")
    private String defaultEditLanguage;

    /** Gets or sets TiffColorDepth. */
    @JsonProperty("TiffColorDepth")
    private String tiffColorDepth;

    /** Gets or sets TiffCompression. */
    @JsonProperty("TiffCompression")
    private String tiffCompression;

    /** Gets or sets PrintingPage. */
    @JsonProperty("PrintingPage")
    private String printingPage;

    /** Gets or sets Quality. */
    @JsonProperty("Quality")
    private Integer quality;

    /** Gets or sets ImageType. */
    @JsonProperty("ImageType")
    private String imageType;

    /** Gets or sets OnePagePerSheet. */
    @JsonProperty("OnePagePerSheet")
    private Boolean onePagePerSheet;

    /** Gets or sets TiffBinarizationMethod. */
    @JsonProperty("TiffBinarizationMethod")
    private String tiffBinarizationMethod;

    public String getTextCrossType() { return textCrossType; }
    public ImageOrPrintOptions setTextCrossType(String textCrossType) { this.textCrossType = textCrossType; return this; }

    public String getGridlineType() { return gridlineType; }
    public ImageOrPrintOptions setGridlineType(String gridlineType) { this.gridlineType = gridlineType; return this; }

    public Boolean getOutputBlankPageWhenNothingToPrint() { return outputBlankPageWhenNothingToPrint; }
    public ImageOrPrintOptions setOutputBlankPageWhenNothingToPrint(Boolean outputBlankPageWhenNothingToPrint) { this.outputBlankPageWhenNothingToPrint = outputBlankPageWhenNothingToPrint; return this; }

    public Boolean getCheckWorkbookDefaultFont() { return checkWorkbookDefaultFont; }
    public ImageOrPrintOptions setCheckWorkbookDefaultFont(Boolean checkWorkbookDefaultFont) { this.checkWorkbookDefaultFont = checkWorkbookDefaultFont; return this; }

    public String getDefaultFont() { return defaultFont; }
    public ImageOrPrintOptions setDefaultFont(String defaultFont) { this.defaultFont = defaultFont; return this; }

    public Boolean getIsOptimized() { return isOptimized; }
    public ImageOrPrintOptions setIsOptimized(Boolean isOptimized) { this.isOptimized = isOptimized; return this; }

    public Integer getPageCount() { return pageCount; }
    public ImageOrPrintOptions setPageCount(Integer pageCount) { this.pageCount = pageCount; return this; }

    public Integer getPageIndex() { return pageIndex; }
    public ImageOrPrintOptions setPageIndex(Integer pageIndex) { this.pageIndex = pageIndex; return this; }

    public Boolean getIsFontSubstitutionCharGranularity() { return isFontSubstitutionCharGranularity; }
    public ImageOrPrintOptions setIsFontSubstitutionCharGranularity(Boolean isFontSubstitutionCharGranularity) { this.isFontSubstitutionCharGranularity = isFontSubstitutionCharGranularity; return this; }

    public Boolean getTransparent() { return transparent; }
    public ImageOrPrintOptions setTransparent(Boolean transparent) { this.transparent = transparent; return this; }

    public Boolean getOnlyArea() { return onlyArea; }
    public ImageOrPrintOptions setOnlyArea(Boolean onlyArea) { this.onlyArea = onlyArea; return this; }

    public Boolean getSVGFitToViewPort() { return sVGFitToViewPort; }
    public ImageOrPrintOptions setSVGFitToViewPort(Boolean sVGFitToViewPort) { this.sVGFitToViewPort = sVGFitToViewPort; return this; }

    public String getEmbededImageNameInSvg() { return embededImageNameInSvg; }
    public ImageOrPrintOptions setEmbededImageNameInSvg(String embededImageNameInSvg) { this.embededImageNameInSvg = embededImageNameInSvg; return this; }

    public Boolean getAllColumnsInOnePagePerSheet() { return allColumnsInOnePagePerSheet; }
    public ImageOrPrintOptions setAllColumnsInOnePagePerSheet(Boolean allColumnsInOnePagePerSheet) { this.allColumnsInOnePagePerSheet = allColumnsInOnePagePerSheet; return this; }

    public Boolean getPrintWithStatusDialog() { return printWithStatusDialog; }
    public ImageOrPrintOptions setPrintWithStatusDialog(Boolean printWithStatusDialog) { this.printWithStatusDialog = printWithStatusDialog; return this; }

    public Integer getHorizontalResolution() { return horizontalResolution; }
    public ImageOrPrintOptions setHorizontalResolution(Integer horizontalResolution) { this.horizontalResolution = horizontalResolution; return this; }

    public Integer getVerticalResolution() { return verticalResolution; }
    public ImageOrPrintOptions setVerticalResolution(Integer verticalResolution) { this.verticalResolution = verticalResolution; return this; }

    public String getDefaultEditLanguage() { return defaultEditLanguage; }
    public ImageOrPrintOptions setDefaultEditLanguage(String defaultEditLanguage) { this.defaultEditLanguage = defaultEditLanguage; return this; }

    public String getTiffColorDepth() { return tiffColorDepth; }
    public ImageOrPrintOptions setTiffColorDepth(String tiffColorDepth) { this.tiffColorDepth = tiffColorDepth; return this; }

    public String getTiffCompression() { return tiffCompression; }
    public ImageOrPrintOptions setTiffCompression(String tiffCompression) { this.tiffCompression = tiffCompression; return this; }

    public String getPrintingPage() { return printingPage; }
    public ImageOrPrintOptions setPrintingPage(String printingPage) { this.printingPage = printingPage; return this; }

    public Integer getQuality() { return quality; }
    public ImageOrPrintOptions setQuality(Integer quality) { this.quality = quality; return this; }

    public String getImageType() { return imageType; }
    public ImageOrPrintOptions setImageType(String imageType) { this.imageType = imageType; return this; }

    public Boolean getOnePagePerSheet() { return onePagePerSheet; }
    public ImageOrPrintOptions setOnePagePerSheet(Boolean onePagePerSheet) { this.onePagePerSheet = onePagePerSheet; return this; }

    public String getTiffBinarizationMethod() { return tiffBinarizationMethod; }
    public ImageOrPrintOptions setTiffBinarizationMethod(String tiffBinarizationMethod) { this.tiffBinarizationMethod = tiffBinarizationMethod; return this; }

}
