/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="WorkbookSettings.java">
 *   Copyright (c) 2026 Aspose.Cells Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------
 */

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class WorkbookSettings {

    @SerializedName("AutoCompressPictures")
    @JsonProperty("AutoCompressPictures")
    private Boolean autoCompressPictures;

    public WorkbookSettings autoCompressPictures(Boolean autoCompressPictures) {
        this.autoCompressPictures = autoCompressPictures;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAutoCompressPictures() {
        return autoCompressPictures;
    }

    public void setAutoCompressPictures(Boolean autoCompressPictures) {
        this.autoCompressPictures = autoCompressPictures;
    }

    @SerializedName("AutoRecover")
    @JsonProperty("AutoRecover")
    private Boolean autoRecover;

    public WorkbookSettings autoRecover(Boolean autoRecover) {
        this.autoRecover = autoRecover;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAutoRecover() {
        return autoRecover;
    }

    public void setAutoRecover(Boolean autoRecover) {
        this.autoRecover = autoRecover;
    }

    @SerializedName("BuildVersion")
    @JsonProperty("BuildVersion")
    private String buildVersion;

    public WorkbookSettings buildVersion(String buildVersion) {
        this.buildVersion = buildVersion;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getBuildVersion() {
        return buildVersion;
    }

    public void setBuildVersion(String buildVersion) {
        this.buildVersion = buildVersion;
    }

    @SerializedName("CalcMode")
    @JsonProperty("CalcMode")
    private String calcMode;

    public WorkbookSettings calcMode(String calcMode) {
        this.calcMode = calcMode;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getCalcMode() {
        return calcMode;
    }

    public void setCalcMode(String calcMode) {
        this.calcMode = calcMode;
    }

    @SerializedName("CalculationId")
    @JsonProperty("CalculationId")
    private String calculationId;

    public WorkbookSettings calculationId(String calculationId) {
        this.calculationId = calculationId;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getCalculationId() {
        return calculationId;
    }

    public void setCalculationId(String calculationId) {
        this.calculationId = calculationId;
    }

    @SerializedName("CheckComptiliblity")
    @JsonProperty("CheckComptiliblity")
    private Boolean checkComptiliblity;

    public WorkbookSettings checkComptiliblity(Boolean checkComptiliblity) {
        this.checkComptiliblity = checkComptiliblity;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getCheckComptiliblity() {
        return checkComptiliblity;
    }

    public void setCheckComptiliblity(Boolean checkComptiliblity) {
        this.checkComptiliblity = checkComptiliblity;
    }

    @SerializedName("CheckExcelRestriction")
    @JsonProperty("CheckExcelRestriction")
    private Boolean checkExcelRestriction;

    public WorkbookSettings checkExcelRestriction(Boolean checkExcelRestriction) {
        this.checkExcelRestriction = checkExcelRestriction;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getCheckExcelRestriction() {
        return checkExcelRestriction;
    }

    public void setCheckExcelRestriction(Boolean checkExcelRestriction) {
        this.checkExcelRestriction = checkExcelRestriction;
    }

    @SerializedName("CrashSave")
    @JsonProperty("CrashSave")
    private Boolean crashSave;

    public WorkbookSettings crashSave(Boolean crashSave) {
        this.crashSave = crashSave;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getCrashSave() {
        return crashSave;
    }

    public void setCrashSave(Boolean crashSave) {
        this.crashSave = crashSave;
    }

    @SerializedName("CreateCalcChain")
    @JsonProperty("CreateCalcChain")
    private Boolean createCalcChain;

    public WorkbookSettings createCalcChain(Boolean createCalcChain) {
        this.createCalcChain = createCalcChain;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getCreateCalcChain() {
        return createCalcChain;
    }

    public void setCreateCalcChain(Boolean createCalcChain) {
        this.createCalcChain = createCalcChain;
    }

    @SerializedName("DataExtractLoad")
    @JsonProperty("DataExtractLoad")
    private Boolean dataExtractLoad;

    public WorkbookSettings dataExtractLoad(Boolean dataExtractLoad) {
        this.dataExtractLoad = dataExtractLoad;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getDataExtractLoad() {
        return dataExtractLoad;
    }

    public void setDataExtractLoad(Boolean dataExtractLoad) {
        this.dataExtractLoad = dataExtractLoad;
    }

    @SerializedName("Date1904")
    @JsonProperty("Date1904")
    private Boolean date1904;

    public WorkbookSettings date1904(Boolean date1904) {
        this.date1904 = date1904;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getDate1904() {
        return date1904;
    }

    public void setDate1904(Boolean date1904) {
        this.date1904 = date1904;
    }

    @SerializedName("DisplayDrawingObjects")
    @JsonProperty("DisplayDrawingObjects")
    private String displayDrawingObjects;

    public WorkbookSettings displayDrawingObjects(String displayDrawingObjects) {
        this.displayDrawingObjects = displayDrawingObjects;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDisplayDrawingObjects() {
        return displayDrawingObjects;
    }

    public void setDisplayDrawingObjects(String displayDrawingObjects) {
        this.displayDrawingObjects = displayDrawingObjects;
    }

    @SerializedName("EnableMacros")
    @JsonProperty("EnableMacros")
    private Boolean enableMacros;

    public WorkbookSettings enableMacros(Boolean enableMacros) {
        this.enableMacros = enableMacros;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getEnableMacros() {
        return enableMacros;
    }

    public void setEnableMacros(Boolean enableMacros) {
        this.enableMacros = enableMacros;
    }

    @SerializedName("FirstVisibleTab")
    @JsonProperty("FirstVisibleTab")
    private Integer firstVisibleTab;

    public WorkbookSettings firstVisibleTab(Integer firstVisibleTab) {
        this.firstVisibleTab = firstVisibleTab;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getFirstVisibleTab() {
        return firstVisibleTab;
    }

    public void setFirstVisibleTab(Integer firstVisibleTab) {
        this.firstVisibleTab = firstVisibleTab;
    }

    @SerializedName("HidePivotFieldList")
    @JsonProperty("HidePivotFieldList")
    private Boolean hidePivotFieldList;

    public WorkbookSettings hidePivotFieldList(Boolean hidePivotFieldList) {
        this.hidePivotFieldList = hidePivotFieldList;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getHidePivotFieldList() {
        return hidePivotFieldList;
    }

    public void setHidePivotFieldList(Boolean hidePivotFieldList) {
        this.hidePivotFieldList = hidePivotFieldList;
    }

    @SerializedName("IsDefaultEncrypted")
    @JsonProperty("IsDefaultEncrypted")
    private Boolean isDefaultEncrypted;

    public WorkbookSettings isDefaultEncrypted(Boolean isDefaultEncrypted) {
        this.isDefaultEncrypted = isDefaultEncrypted;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsDefaultEncrypted() {
        return isDefaultEncrypted;
    }

    public void setIsDefaultEncrypted(Boolean isDefaultEncrypted) {
        this.isDefaultEncrypted = isDefaultEncrypted;
    }

    @SerializedName("IsHidden")
    @JsonProperty("IsHidden")
    private Boolean isHidden;

    public WorkbookSettings isHidden(Boolean isHidden) {
        this.isHidden = isHidden;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    @SerializedName("IsHScrollBarVisible")
    @JsonProperty("IsHScrollBarVisible")
    private Boolean isHScrollBarVisible;

    public WorkbookSettings isHScrollBarVisible(Boolean isHScrollBarVisible) {
        this.isHScrollBarVisible = isHScrollBarVisible;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsHScrollBarVisible() {
        return isHScrollBarVisible;
    }

    public void setIsHScrollBarVisible(Boolean isHScrollBarVisible) {
        this.isHScrollBarVisible = isHScrollBarVisible;
    }

    @SerializedName("IsMinimized")
    @JsonProperty("IsMinimized")
    private Boolean isMinimized;

    public WorkbookSettings isMinimized(Boolean isMinimized) {
        this.isMinimized = isMinimized;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsMinimized() {
        return isMinimized;
    }

    public void setIsMinimized(Boolean isMinimized) {
        this.isMinimized = isMinimized;
    }

    @SerializedName("IsVScrollBarVisible")
    @JsonProperty("IsVScrollBarVisible")
    private Boolean isVScrollBarVisible;

    public WorkbookSettings isVScrollBarVisible(Boolean isVScrollBarVisible) {
        this.isVScrollBarVisible = isVScrollBarVisible;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsVScrollBarVisible() {
        return isVScrollBarVisible;
    }

    public void setIsVScrollBarVisible(Boolean isVScrollBarVisible) {
        this.isVScrollBarVisible = isVScrollBarVisible;
    }

    @SerializedName("Iteration")
    @JsonProperty("Iteration")
    private Boolean iteration;

    public WorkbookSettings iteration(Boolean iteration) {
        this.iteration = iteration;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIteration() {
        return iteration;
    }

    public void setIteration(Boolean iteration) {
        this.iteration = iteration;
    }

    @SerializedName("LanguageCode")
    @JsonProperty("LanguageCode")
    private String languageCode;

    public WorkbookSettings languageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    @SerializedName("MaxChange")
    @JsonProperty("MaxChange")
    private Double maxChange;

    public WorkbookSettings maxChange(Double maxChange) {
        this.maxChange = maxChange;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getMaxChange() {
        return maxChange;
    }

    public void setMaxChange(Double maxChange) {
        this.maxChange = maxChange;
    }

    @SerializedName("MaxIteration")
    @JsonProperty("MaxIteration")
    private Integer maxIteration;

    public WorkbookSettings maxIteration(Integer maxIteration) {
        this.maxIteration = maxIteration;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getMaxIteration() {
        return maxIteration;
    }

    public void setMaxIteration(Integer maxIteration) {
        this.maxIteration = maxIteration;
    }

    @SerializedName("MemorySetting")
    @JsonProperty("MemorySetting")
    private String memorySetting;

    public WorkbookSettings memorySetting(String memorySetting) {
        this.memorySetting = memorySetting;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getMemorySetting() {
        return memorySetting;
    }

    public void setMemorySetting(String memorySetting) {
        this.memorySetting = memorySetting;
    }

    @SerializedName("NumberDecimalSeparator")
    @JsonProperty("NumberDecimalSeparator")
    private String numberDecimalSeparator;

    public WorkbookSettings numberDecimalSeparator(String numberDecimalSeparator) {
        this.numberDecimalSeparator = numberDecimalSeparator;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getNumberDecimalSeparator() {
        return numberDecimalSeparator;
    }

    public void setNumberDecimalSeparator(String numberDecimalSeparator) {
        this.numberDecimalSeparator = numberDecimalSeparator;
    }

    @SerializedName("NumberGroupSeparator")
    @JsonProperty("NumberGroupSeparator")
    private String numberGroupSeparator;

    public WorkbookSettings numberGroupSeparator(String numberGroupSeparator) {
        this.numberGroupSeparator = numberGroupSeparator;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getNumberGroupSeparator() {
        return numberGroupSeparator;
    }

    public void setNumberGroupSeparator(String numberGroupSeparator) {
        this.numberGroupSeparator = numberGroupSeparator;
    }

    @SerializedName("ParsingFormulaOnOpen")
    @JsonProperty("ParsingFormulaOnOpen")
    private Boolean parsingFormulaOnOpen;

    public WorkbookSettings parsingFormulaOnOpen(Boolean parsingFormulaOnOpen) {
        this.parsingFormulaOnOpen = parsingFormulaOnOpen;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getParsingFormulaOnOpen() {
        return parsingFormulaOnOpen;
    }

    public void setParsingFormulaOnOpen(Boolean parsingFormulaOnOpen) {
        this.parsingFormulaOnOpen = parsingFormulaOnOpen;
    }

    @SerializedName("PrecisionAsDisplayed")
    @JsonProperty("PrecisionAsDisplayed")
    private Boolean precisionAsDisplayed;

    public WorkbookSettings precisionAsDisplayed(Boolean precisionAsDisplayed) {
        this.precisionAsDisplayed = precisionAsDisplayed;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getPrecisionAsDisplayed() {
        return precisionAsDisplayed;
    }

    public void setPrecisionAsDisplayed(Boolean precisionAsDisplayed) {
        this.precisionAsDisplayed = precisionAsDisplayed;
    }

    @SerializedName("RecalculateBeforeSave")
    @JsonProperty("RecalculateBeforeSave")
    private Boolean recalculateBeforeSave;

    public WorkbookSettings recalculateBeforeSave(Boolean recalculateBeforeSave) {
        this.recalculateBeforeSave = recalculateBeforeSave;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getRecalculateBeforeSave() {
        return recalculateBeforeSave;
    }

    public void setRecalculateBeforeSave(Boolean recalculateBeforeSave) {
        this.recalculateBeforeSave = recalculateBeforeSave;
    }

    @SerializedName("ReCalculateOnOpen")
    @JsonProperty("ReCalculateOnOpen")
    private Boolean reCalculateOnOpen;

    public WorkbookSettings reCalculateOnOpen(Boolean reCalculateOnOpen) {
        this.reCalculateOnOpen = reCalculateOnOpen;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getReCalculateOnOpen() {
        return reCalculateOnOpen;
    }

    public void setReCalculateOnOpen(Boolean reCalculateOnOpen) {
        this.reCalculateOnOpen = reCalculateOnOpen;
    }

    @SerializedName("RecommendReadOnly")
    @JsonProperty("RecommendReadOnly")
    private Boolean recommendReadOnly;

    public WorkbookSettings recommendReadOnly(Boolean recommendReadOnly) {
        this.recommendReadOnly = recommendReadOnly;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getRecommendReadOnly() {
        return recommendReadOnly;
    }

    public void setRecommendReadOnly(Boolean recommendReadOnly) {
        this.recommendReadOnly = recommendReadOnly;
    }

    @SerializedName("Region")
    @JsonProperty("Region")
    private String region;

    public WorkbookSettings region(String region) {
        this.region = region;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @SerializedName("RemovePersonalInformation")
    @JsonProperty("RemovePersonalInformation")
    private Boolean removePersonalInformation;

    public WorkbookSettings removePersonalInformation(Boolean removePersonalInformation) {
        this.removePersonalInformation = removePersonalInformation;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getRemovePersonalInformation() {
        return removePersonalInformation;
    }

    public void setRemovePersonalInformation(Boolean removePersonalInformation) {
        this.removePersonalInformation = removePersonalInformation;
    }

    @SerializedName("RepairLoad")
    @JsonProperty("RepairLoad")
    private Boolean repairLoad;

    public WorkbookSettings repairLoad(Boolean repairLoad) {
        this.repairLoad = repairLoad;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getRepairLoad() {
        return repairLoad;
    }

    public void setRepairLoad(Boolean repairLoad) {
        this.repairLoad = repairLoad;
    }

    @SerializedName("Shared")
    @JsonProperty("Shared")
    private Boolean shared;

    public WorkbookSettings shared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    @SerializedName("SheetTabBarWidth")
    @JsonProperty("SheetTabBarWidth")
    private Integer sheetTabBarWidth;

    public WorkbookSettings sheetTabBarWidth(Integer sheetTabBarWidth) {
        this.sheetTabBarWidth = sheetTabBarWidth;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getSheetTabBarWidth() {
        return sheetTabBarWidth;
    }

    public void setSheetTabBarWidth(Integer sheetTabBarWidth) {
        this.sheetTabBarWidth = sheetTabBarWidth;
    }

    @SerializedName("ShowTabs")
    @JsonProperty("ShowTabs")
    private Boolean showTabs;

    public WorkbookSettings showTabs(Boolean showTabs) {
        this.showTabs = showTabs;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowTabs() {
        return showTabs;
    }

    public void setShowTabs(Boolean showTabs) {
        this.showTabs = showTabs;
    }

    @SerializedName("UpdateAdjacentCellsBorder")
    @JsonProperty("UpdateAdjacentCellsBorder")
    private Boolean updateAdjacentCellsBorder;

    public WorkbookSettings updateAdjacentCellsBorder(Boolean updateAdjacentCellsBorder) {
        this.updateAdjacentCellsBorder = updateAdjacentCellsBorder;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getUpdateAdjacentCellsBorder() {
        return updateAdjacentCellsBorder;
    }

    public void setUpdateAdjacentCellsBorder(Boolean updateAdjacentCellsBorder) {
        this.updateAdjacentCellsBorder = updateAdjacentCellsBorder;
    }

    @SerializedName("UpdateLinksType")
    @JsonProperty("UpdateLinksType")
    private String updateLinksType;

    public WorkbookSettings updateLinksType(String updateLinksType) {
        this.updateLinksType = updateLinksType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getUpdateLinksType() {
        return updateLinksType;
    }

    public void setUpdateLinksType(String updateLinksType) {
        this.updateLinksType = updateLinksType;
    }

    @SerializedName("WindowHeight")
    @JsonProperty("WindowHeight")
    private Double windowHeight;

    public WorkbookSettings windowHeight(Double windowHeight) {
        this.windowHeight = windowHeight;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getWindowHeight() {
        return windowHeight;
    }

    public void setWindowHeight(Double windowHeight) {
        this.windowHeight = windowHeight;
    }

    @SerializedName("WindowLeft")
    @JsonProperty("WindowLeft")
    private Double windowLeft;

    public WorkbookSettings windowLeft(Double windowLeft) {
        this.windowLeft = windowLeft;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getWindowLeft() {
        return windowLeft;
    }

    public void setWindowLeft(Double windowLeft) {
        this.windowLeft = windowLeft;
    }

    @SerializedName("WindowTop")
    @JsonProperty("WindowTop")
    private Double windowTop;

    public WorkbookSettings windowTop(Double windowTop) {
        this.windowTop = windowTop;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getWindowTop() {
        return windowTop;
    }

    public void setWindowTop(Double windowTop) {
        this.windowTop = windowTop;
    }

    @SerializedName("WindowWidth")
    @JsonProperty("WindowWidth")
    private Double windowWidth;

    public WorkbookSettings windowWidth(Double windowWidth) {
        this.windowWidth = windowWidth;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getWindowWidth() {
        return windowWidth;
    }

    public void setWindowWidth(Double windowWidth) {
        this.windowWidth = windowWidth;
    }

    @SerializedName("Author")
    @JsonProperty("Author")
    private String author;

    public WorkbookSettings author(String author) {
        this.author = author;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @SerializedName("CheckCustomNumberFormat")
    @JsonProperty("CheckCustomNumberFormat")
    private Boolean checkCustomNumberFormat;

    public WorkbookSettings checkCustomNumberFormat(Boolean checkCustomNumberFormat) {
        this.checkCustomNumberFormat = checkCustomNumberFormat;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getCheckCustomNumberFormat() {
        return checkCustomNumberFormat;
    }

    public void setCheckCustomNumberFormat(Boolean checkCustomNumberFormat) {
        this.checkCustomNumberFormat = checkCustomNumberFormat;
    }

    @SerializedName("ProtectionType")
    @JsonProperty("ProtectionType")
    private String protectionType;

    public WorkbookSettings protectionType(String protectionType) {
        this.protectionType = protectionType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getProtectionType() {
        return protectionType;
    }

    public void setProtectionType(String protectionType) {
        this.protectionType = protectionType;
    }

    @SerializedName("GlobalizationSettings")
    @JsonProperty("GlobalizationSettings")
    private GlobalizationSettings globalizationSettings;

    public WorkbookSettings globalizationSettings(GlobalizationSettings globalizationSettings) {
        this.globalizationSettings = globalizationSettings;
        return this;
    }

    @ApiModelProperty(value = "")
    public GlobalizationSettings getGlobalizationSettings() {
        return globalizationSettings;
    }

    public void setGlobalizationSettings(GlobalizationSettings globalizationSettings) {
        this.globalizationSettings = globalizationSettings;
    }

    @SerializedName("Password")
    @JsonProperty("Password")
    private String password;

    public WorkbookSettings password(String password) {
        this.password = password;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @SerializedName("WriteProtection")
    @JsonProperty("WriteProtection")
    private WriteProtection writeProtection;

    public WorkbookSettings writeProtection(WriteProtection writeProtection) {
        this.writeProtection = writeProtection;
        return this;
    }

    @ApiModelProperty(value = "")
    public WriteProtection getWriteProtection() {
        return writeProtection;
    }

    public void setWriteProtection(WriteProtection writeProtection) {
        this.writeProtection = writeProtection;
    }

    @SerializedName("IsEncrypted")
    @JsonProperty("IsEncrypted")
    private Boolean isEncrypted;

    public WorkbookSettings isEncrypted(Boolean isEncrypted) {
        this.isEncrypted = isEncrypted;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsEncrypted() {
        return isEncrypted;
    }

    public void setIsEncrypted(Boolean isEncrypted) {
        this.isEncrypted = isEncrypted;
    }

    @SerializedName("IsProtected")
    @JsonProperty("IsProtected")
    private Boolean isProtected;

    public WorkbookSettings isProtected(Boolean isProtected) {
        this.isProtected = isProtected;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsProtected() {
        return isProtected;
    }

    public void setIsProtected(Boolean isProtected) {
        this.isProtected = isProtected;
    }

    @SerializedName("MaxRow")
    @JsonProperty("MaxRow")
    private Integer maxRow;

    public WorkbookSettings maxRow(Integer maxRow) {
        this.maxRow = maxRow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getMaxRow() {
        return maxRow;
    }

    public void setMaxRow(Integer maxRow) {
        this.maxRow = maxRow;
    }

    @SerializedName("MaxColumn")
    @JsonProperty("MaxColumn")
    private Integer maxColumn;

    public WorkbookSettings maxColumn(Integer maxColumn) {
        this.maxColumn = maxColumn;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getMaxColumn() {
        return maxColumn;
    }

    public void setMaxColumn(Integer maxColumn) {
        this.maxColumn = maxColumn;
    }

    @SerializedName("SignificantDigits")
    @JsonProperty("SignificantDigits")
    private Integer significantDigits;

    public WorkbookSettings significantDigits(Integer significantDigits) {
        this.significantDigits = significantDigits;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getSignificantDigits() {
        return significantDigits;
    }

    public void setSignificantDigits(Integer significantDigits) {
        this.significantDigits = significantDigits;
    }

    @SerializedName("CheckCompatibility")
    @JsonProperty("CheckCompatibility")
    private Boolean checkCompatibility;

    public WorkbookSettings checkCompatibility(Boolean checkCompatibility) {
        this.checkCompatibility = checkCompatibility;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getCheckCompatibility() {
        return checkCompatibility;
    }

    public void setCheckCompatibility(Boolean checkCompatibility) {
        this.checkCompatibility = checkCompatibility;
    }

    @SerializedName("PaperSize")
    @JsonProperty("PaperSize")
    private String paperSize;

    public WorkbookSettings paperSize(String paperSize) {
        this.paperSize = paperSize;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPaperSize() {
        return paperSize;
    }

    public void setPaperSize(String paperSize) {
        this.paperSize = paperSize;
    }

    @SerializedName("MaxRowsOfSharedFormula")
    @JsonProperty("MaxRowsOfSharedFormula")
    private Integer maxRowsOfSharedFormula;

    public WorkbookSettings maxRowsOfSharedFormula(Integer maxRowsOfSharedFormula) {
        this.maxRowsOfSharedFormula = maxRowsOfSharedFormula;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getMaxRowsOfSharedFormula() {
        return maxRowsOfSharedFormula;
    }

    public void setMaxRowsOfSharedFormula(Integer maxRowsOfSharedFormula) {
        this.maxRowsOfSharedFormula = maxRowsOfSharedFormula;
    }

    @SerializedName("Compliance")
    @JsonProperty("Compliance")
    private String compliance;

    public WorkbookSettings compliance(String compliance) {
        this.compliance = compliance;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getCompliance() {
        return compliance;
    }

    public void setCompliance(String compliance) {
        this.compliance = compliance;
    }

    @SerializedName("QuotePrefixToStyle")
    @JsonProperty("QuotePrefixToStyle")
    private Boolean quotePrefixToStyle;

    public WorkbookSettings quotePrefixToStyle(Boolean quotePrefixToStyle) {
        this.quotePrefixToStyle = quotePrefixToStyle;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getQuotePrefixToStyle() {
        return quotePrefixToStyle;
    }

    public void setQuotePrefixToStyle(Boolean quotePrefixToStyle) {
        this.quotePrefixToStyle = quotePrefixToStyle;
    }

    @SerializedName("FormulaSettings")
    @JsonProperty("FormulaSettings")
    private FormulaSettings formulaSettings;

    public WorkbookSettings formulaSettings(FormulaSettings formulaSettings) {
        this.formulaSettings = formulaSettings;
        return this;
    }

    @ApiModelProperty(value = "")
    public FormulaSettings getFormulaSettings() {
        return formulaSettings;
    }

    public void setFormulaSettings(FormulaSettings formulaSettings) {
        this.formulaSettings = formulaSettings;
    }

    @SerializedName("ForceFullCalculate")
    @JsonProperty("ForceFullCalculate")
    private Boolean forceFullCalculate;

    public WorkbookSettings forceFullCalculate(Boolean forceFullCalculate) {
        this.forceFullCalculate = forceFullCalculate;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getForceFullCalculate() {
        return forceFullCalculate;
    }

    public void setForceFullCalculate(Boolean forceFullCalculate) {
        this.forceFullCalculate = forceFullCalculate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkbookSettings other = (WorkbookSettings) o;
        return Objects.equals(this.autoCompressPictures, other.autoCompressPictures)
            && Objects.equals(this.autoRecover, other.autoRecover)
            && Objects.equals(this.buildVersion, other.buildVersion)
            && Objects.equals(this.calcMode, other.calcMode)
            && Objects.equals(this.calculationId, other.calculationId)
            && Objects.equals(this.checkComptiliblity, other.checkComptiliblity)
            && Objects.equals(this.checkExcelRestriction, other.checkExcelRestriction)
            && Objects.equals(this.crashSave, other.crashSave)
            && Objects.equals(this.createCalcChain, other.createCalcChain)
            && Objects.equals(this.dataExtractLoad, other.dataExtractLoad)
            && Objects.equals(this.date1904, other.date1904)
            && Objects.equals(this.displayDrawingObjects, other.displayDrawingObjects)
            && Objects.equals(this.enableMacros, other.enableMacros)
            && Objects.equals(this.firstVisibleTab, other.firstVisibleTab)
            && Objects.equals(this.hidePivotFieldList, other.hidePivotFieldList)
            && Objects.equals(this.isDefaultEncrypted, other.isDefaultEncrypted)
            && Objects.equals(this.isHidden, other.isHidden)
            && Objects.equals(this.isHScrollBarVisible, other.isHScrollBarVisible)
            && Objects.equals(this.isMinimized, other.isMinimized)
            && Objects.equals(this.isVScrollBarVisible, other.isVScrollBarVisible)
            && Objects.equals(this.iteration, other.iteration)
            && Objects.equals(this.languageCode, other.languageCode)
            && Objects.equals(this.maxChange, other.maxChange)
            && Objects.equals(this.maxIteration, other.maxIteration)
            && Objects.equals(this.memorySetting, other.memorySetting)
            && Objects.equals(this.numberDecimalSeparator, other.numberDecimalSeparator)
            && Objects.equals(this.numberGroupSeparator, other.numberGroupSeparator)
            && Objects.equals(this.parsingFormulaOnOpen, other.parsingFormulaOnOpen)
            && Objects.equals(this.precisionAsDisplayed, other.precisionAsDisplayed)
            && Objects.equals(this.recalculateBeforeSave, other.recalculateBeforeSave)
            && Objects.equals(this.reCalculateOnOpen, other.reCalculateOnOpen)
            && Objects.equals(this.recommendReadOnly, other.recommendReadOnly)
            && Objects.equals(this.region, other.region)
            && Objects.equals(this.removePersonalInformation, other.removePersonalInformation)
            && Objects.equals(this.repairLoad, other.repairLoad)
            && Objects.equals(this.shared, other.shared)
            && Objects.equals(this.sheetTabBarWidth, other.sheetTabBarWidth)
            && Objects.equals(this.showTabs, other.showTabs)
            && Objects.equals(this.updateAdjacentCellsBorder, other.updateAdjacentCellsBorder)
            && Objects.equals(this.updateLinksType, other.updateLinksType)
            && Objects.equals(this.windowHeight, other.windowHeight)
            && Objects.equals(this.windowLeft, other.windowLeft)
            && Objects.equals(this.windowTop, other.windowTop)
            && Objects.equals(this.windowWidth, other.windowWidth)
            && Objects.equals(this.author, other.author)
            && Objects.equals(this.checkCustomNumberFormat, other.checkCustomNumberFormat)
            && Objects.equals(this.protectionType, other.protectionType)
            && Objects.equals(this.globalizationSettings, other.globalizationSettings)
            && Objects.equals(this.password, other.password)
            && Objects.equals(this.writeProtection, other.writeProtection)
            && Objects.equals(this.isEncrypted, other.isEncrypted)
            && Objects.equals(this.isProtected, other.isProtected)
            && Objects.equals(this.maxRow, other.maxRow)
            && Objects.equals(this.maxColumn, other.maxColumn)
            && Objects.equals(this.significantDigits, other.significantDigits)
            && Objects.equals(this.checkCompatibility, other.checkCompatibility)
            && Objects.equals(this.paperSize, other.paperSize)
            && Objects.equals(this.maxRowsOfSharedFormula, other.maxRowsOfSharedFormula)
            && Objects.equals(this.compliance, other.compliance)
            && Objects.equals(this.quotePrefixToStyle, other.quotePrefixToStyle)
            && Objects.equals(this.formulaSettings, other.formulaSettings)
            && Objects.equals(this.forceFullCalculate, other.forceFullCalculate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoCompressPictures, autoRecover, buildVersion, calcMode, calculationId, checkComptiliblity, checkExcelRestriction, crashSave, createCalcChain, dataExtractLoad, date1904, displayDrawingObjects, enableMacros, firstVisibleTab, hidePivotFieldList, isDefaultEncrypted, isHidden, isHScrollBarVisible, isMinimized, isVScrollBarVisible, iteration, languageCode, maxChange, maxIteration, memorySetting, numberDecimalSeparator, numberGroupSeparator, parsingFormulaOnOpen, precisionAsDisplayed, recalculateBeforeSave, reCalculateOnOpen, recommendReadOnly, region, removePersonalInformation, repairLoad, shared, sheetTabBarWidth, showTabs, updateAdjacentCellsBorder, updateLinksType, windowHeight, windowLeft, windowTop, windowWidth, author, checkCustomNumberFormat, protectionType, globalizationSettings, password, writeProtection, isEncrypted, isProtected, maxRow, maxColumn, significantDigits, checkCompatibility, paperSize, maxRowsOfSharedFormula, compliance, quotePrefixToStyle, formulaSettings, forceFullCalculate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkbookSettings {\n");
        sb.append("    autoCompressPictures: ").append(autoCompressPictures).append("\n");
        sb.append("    autoRecover: ").append(autoRecover).append("\n");
        sb.append("    buildVersion: ").append(buildVersion).append("\n");
        sb.append("    calcMode: ").append(calcMode).append("\n");
        sb.append("    calculationId: ").append(calculationId).append("\n");
        sb.append("    checkComptiliblity: ").append(checkComptiliblity).append("\n");
        sb.append("    checkExcelRestriction: ").append(checkExcelRestriction).append("\n");
        sb.append("    crashSave: ").append(crashSave).append("\n");
        sb.append("    createCalcChain: ").append(createCalcChain).append("\n");
        sb.append("    dataExtractLoad: ").append(dataExtractLoad).append("\n");
        sb.append("    date1904: ").append(date1904).append("\n");
        sb.append("    displayDrawingObjects: ").append(displayDrawingObjects).append("\n");
        sb.append("    enableMacros: ").append(enableMacros).append("\n");
        sb.append("    firstVisibleTab: ").append(firstVisibleTab).append("\n");
        sb.append("    hidePivotFieldList: ").append(hidePivotFieldList).append("\n");
        sb.append("    isDefaultEncrypted: ").append(isDefaultEncrypted).append("\n");
        sb.append("    isHidden: ").append(isHidden).append("\n");
        sb.append("    isHScrollBarVisible: ").append(isHScrollBarVisible).append("\n");
        sb.append("    isMinimized: ").append(isMinimized).append("\n");
        sb.append("    isVScrollBarVisible: ").append(isVScrollBarVisible).append("\n");
        sb.append("    iteration: ").append(iteration).append("\n");
        sb.append("    languageCode: ").append(languageCode).append("\n");
        sb.append("    maxChange: ").append(maxChange).append("\n");
        sb.append("    maxIteration: ").append(maxIteration).append("\n");
        sb.append("    memorySetting: ").append(memorySetting).append("\n");
        sb.append("    numberDecimalSeparator: ").append(numberDecimalSeparator).append("\n");
        sb.append("    numberGroupSeparator: ").append(numberGroupSeparator).append("\n");
        sb.append("    parsingFormulaOnOpen: ").append(parsingFormulaOnOpen).append("\n");
        sb.append("    precisionAsDisplayed: ").append(precisionAsDisplayed).append("\n");
        sb.append("    recalculateBeforeSave: ").append(recalculateBeforeSave).append("\n");
        sb.append("    reCalculateOnOpen: ").append(reCalculateOnOpen).append("\n");
        sb.append("    recommendReadOnly: ").append(recommendReadOnly).append("\n");
        sb.append("    region: ").append(region).append("\n");
        sb.append("    removePersonalInformation: ").append(removePersonalInformation).append("\n");
        sb.append("    repairLoad: ").append(repairLoad).append("\n");
        sb.append("    shared: ").append(shared).append("\n");
        sb.append("    sheetTabBarWidth: ").append(sheetTabBarWidth).append("\n");
        sb.append("    showTabs: ").append(showTabs).append("\n");
        sb.append("    updateAdjacentCellsBorder: ").append(updateAdjacentCellsBorder).append("\n");
        sb.append("    updateLinksType: ").append(updateLinksType).append("\n");
        sb.append("    windowHeight: ").append(windowHeight).append("\n");
        sb.append("    windowLeft: ").append(windowLeft).append("\n");
        sb.append("    windowTop: ").append(windowTop).append("\n");
        sb.append("    windowWidth: ").append(windowWidth).append("\n");
        sb.append("    author: ").append(author).append("\n");
        sb.append("    checkCustomNumberFormat: ").append(checkCustomNumberFormat).append("\n");
        sb.append("    protectionType: ").append(protectionType).append("\n");
        sb.append("    globalizationSettings: ").append(globalizationSettings).append("\n");
        sb.append("    password: ").append(password).append("\n");
        sb.append("    writeProtection: ").append(writeProtection).append("\n");
        sb.append("    isEncrypted: ").append(isEncrypted).append("\n");
        sb.append("    isProtected: ").append(isProtected).append("\n");
        sb.append("    maxRow: ").append(maxRow).append("\n");
        sb.append("    maxColumn: ").append(maxColumn).append("\n");
        sb.append("    significantDigits: ").append(significantDigits).append("\n");
        sb.append("    checkCompatibility: ").append(checkCompatibility).append("\n");
        sb.append("    paperSize: ").append(paperSize).append("\n");
        sb.append("    maxRowsOfSharedFormula: ").append(maxRowsOfSharedFormula).append("\n");
        sb.append("    compliance: ").append(compliance).append("\n");
        sb.append("    quotePrefixToStyle: ").append(quotePrefixToStyle).append("\n");
        sb.append("    formulaSettings: ").append(formulaSettings).append("\n");
        sb.append("    forceFullCalculate: ").append(forceFullCalculate).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
