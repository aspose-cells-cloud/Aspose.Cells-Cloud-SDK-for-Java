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

    /** Gets or sets SaveFormat. */
    @JsonProperty("SaveFormat")
    private String saveFormat;

    /** Gets or sets CachedFileFolder. */
    @JsonProperty("CachedFileFolder")
    private String cachedFileFolder;

    /** Gets or sets ClearData. */
    @JsonProperty("ClearData")
    private Boolean clearData;

    /** Gets or sets CreateDirectory. */
    @JsonProperty("CreateDirectory")
    private Boolean createDirectory;

    /** Gets or sets EnableHTTPCompression. */
    @JsonProperty("EnableHTTPCompression")
    private Boolean enableHTTPCompression;

    /** Gets or sets RefreshChartCache. */
    @JsonProperty("RefreshChartCache")
    private Boolean refreshChartCache;

    /** Gets or sets SortNames. */
    @JsonProperty("SortNames")
    private Boolean sortNames;

    /** Gets or sets ValidateMergedAreas. */
    @JsonProperty("ValidateMergedAreas")
    private Boolean validateMergedAreas;

    /** Gets or sets MergeAreas. */
    @JsonProperty("MergeAreas")
    private Boolean mergeAreas;

    /** Gets or sets SortExternalNames. */
    @JsonProperty("SortExternalNames")
    private Boolean sortExternalNames;

    /** Gets or sets CheckExcelRestriction. */
    @JsonProperty("CheckExcelRestriction")
    private Boolean checkExcelRestriction;

    /** Gets or sets UpdateSmartArt. */
    @JsonProperty("UpdateSmartArt")
    private Boolean updateSmartArt;

    /** Gets or sets EncryptDocumentProperties. */
    @JsonProperty("EncryptDocumentProperties")
    private Boolean encryptDocumentProperties;

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

    public String getSaveFormat() { return saveFormat; }
    public SvgSaveOptions setSaveFormat(String saveFormat) { this.saveFormat = saveFormat; return this; }

    public String getCachedFileFolder() { return cachedFileFolder; }
    public SvgSaveOptions setCachedFileFolder(String cachedFileFolder) { this.cachedFileFolder = cachedFileFolder; return this; }

    public Boolean getClearData() { return clearData; }
    public SvgSaveOptions setClearData(Boolean clearData) { this.clearData = clearData; return this; }

    public Boolean getCreateDirectory() { return createDirectory; }
    public SvgSaveOptions setCreateDirectory(Boolean createDirectory) { this.createDirectory = createDirectory; return this; }

    public Boolean getEnableHTTPCompression() { return enableHTTPCompression; }
    public SvgSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { this.enableHTTPCompression = enableHTTPCompression; return this; }

    public Boolean getRefreshChartCache() { return refreshChartCache; }
    public SvgSaveOptions setRefreshChartCache(Boolean refreshChartCache) { this.refreshChartCache = refreshChartCache; return this; }

    public Boolean getSortNames() { return sortNames; }
    public SvgSaveOptions setSortNames(Boolean sortNames) { this.sortNames = sortNames; return this; }

    public Boolean getValidateMergedAreas() { return validateMergedAreas; }
    public SvgSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { this.validateMergedAreas = validateMergedAreas; return this; }

    public Boolean getMergeAreas() { return mergeAreas; }
    public SvgSaveOptions setMergeAreas(Boolean mergeAreas) { this.mergeAreas = mergeAreas; return this; }

    public Boolean getSortExternalNames() { return sortExternalNames; }
    public SvgSaveOptions setSortExternalNames(Boolean sortExternalNames) { this.sortExternalNames = sortExternalNames; return this; }

    public Boolean getCheckExcelRestriction() { return checkExcelRestriction; }
    public SvgSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    public Boolean getUpdateSmartArt() { return updateSmartArt; }
    public SvgSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { this.updateSmartArt = updateSmartArt; return this; }

    public Boolean getEncryptDocumentProperties() { return encryptDocumentProperties; }
    public SvgSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { this.encryptDocumentProperties = encryptDocumentProperties; return this; }

}
