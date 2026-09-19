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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class WorkbookSettings {
        @SerializedName("AutoCompressPictures")
        private Boolean autoCompressPictures ;

        public  WorkbookSettings  autoCompressPictures(Boolean  autoCompressPictures) {
            this.autoCompressPictures =  autoCompressPictures;
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
        private Boolean autoRecover ;

        public  WorkbookSettings  autoRecover(Boolean  autoRecover) {
            this.autoRecover =  autoRecover;
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
        private String buildVersion ;

        public  WorkbookSettings  buildVersion(String  buildVersion) {
            this.buildVersion =  buildVersion;
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
        private String calcMode ;

        public  WorkbookSettings  calcMode(String  calcMode) {
            this.calcMode =  calcMode;
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
        private String calculationId ;

        public  WorkbookSettings  calculationId(String  calculationId) {
            this.calculationId =  calculationId;
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
        private Boolean checkComptiliblity ;

        public  WorkbookSettings  checkComptiliblity(Boolean  checkComptiliblity) {
            this.checkComptiliblity =  checkComptiliblity;
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
        private Boolean checkExcelRestriction ;

        public  WorkbookSettings  checkExcelRestriction(Boolean  checkExcelRestriction) {
            this.checkExcelRestriction =  checkExcelRestriction;
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
        private Boolean crashSave ;

        public  WorkbookSettings  crashSave(Boolean  crashSave) {
            this.crashSave =  crashSave;
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
        private Boolean createCalcChain ;

        public  WorkbookSettings  createCalcChain(Boolean  createCalcChain) {
            this.createCalcChain =  createCalcChain;
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
        private Boolean dataExtractLoad ;

        public  WorkbookSettings  dataExtractLoad(Boolean  dataExtractLoad) {
            this.dataExtractLoad =  dataExtractLoad;
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
        private Boolean date1904 ;

        public  WorkbookSettings  date1904(Boolean  date1904) {
            this.date1904 =  date1904;
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
        private String displayDrawingObjects ;

        public  WorkbookSettings  displayDrawingObjects(String  displayDrawingObjects) {
            this.displayDrawingObjects =  displayDrawingObjects;
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
        private Boolean enableMacros ;

        public  WorkbookSettings  enableMacros(Boolean  enableMacros) {
            this.enableMacros =  enableMacros;
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
        private Integer firstVisibleTab ;

        public  WorkbookSettings  firstVisibleTab(Integer  firstVisibleTab) {
            this.firstVisibleTab =  firstVisibleTab;
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
        private Boolean hidePivotFieldList ;

        public  WorkbookSettings  hidePivotFieldList(Boolean  hidePivotFieldList) {
            this.hidePivotFieldList =  hidePivotFieldList;
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
        private Boolean isDefaultEncrypted ;

        public  WorkbookSettings  isDefaultEncrypted(Boolean  isDefaultEncrypted) {
            this.isDefaultEncrypted =  isDefaultEncrypted;
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
        private Boolean isHidden ;

        public  WorkbookSettings  isHidden(Boolean  isHidden) {
            this.isHidden =  isHidden;
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
        private Boolean isHScrollBarVisible ;

        public  WorkbookSettings  isHScrollBarVisible(Boolean  isHScrollBarVisible) {
            this.isHScrollBarVisible =  isHScrollBarVisible;
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
        private Boolean isMinimized ;

        public  WorkbookSettings  isMinimized(Boolean  isMinimized) {
            this.isMinimized =  isMinimized;
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
        private Boolean isVScrollBarVisible ;

        public  WorkbookSettings  isVScrollBarVisible(Boolean  isVScrollBarVisible) {
            this.isVScrollBarVisible =  isVScrollBarVisible;
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
        private Boolean iteration ;

        public  WorkbookSettings  iteration(Boolean  iteration) {
            this.iteration =  iteration;
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
        private String languageCode ;

        public  WorkbookSettings  languageCode(String  languageCode) {
            this.languageCode =  languageCode;
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
        private Double maxChange ;

        public  WorkbookSettings  maxChange(Double  maxChange) {
            this.maxChange =  maxChange;
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
        private Integer maxIteration ;

        public  WorkbookSettings  maxIteration(Integer  maxIteration) {
            this.maxIteration =  maxIteration;
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
        private String memorySetting ;

        public  WorkbookSettings  memorySetting(String  memorySetting) {
            this.memorySetting =  memorySetting;
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
        private String numberDecimalSeparator ;

        public  WorkbookSettings  numberDecimalSeparator(String  numberDecimalSeparator) {
            this.numberDecimalSeparator =  numberDecimalSeparator;
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
        private String numberGroupSeparator ;

        public  WorkbookSettings  numberGroupSeparator(String  numberGroupSeparator) {
            this.numberGroupSeparator =  numberGroupSeparator;
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
        private Boolean parsingFormulaOnOpen ;

        public  WorkbookSettings  parsingFormulaOnOpen(Boolean  parsingFormulaOnOpen) {
            this.parsingFormulaOnOpen =  parsingFormulaOnOpen;
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
        private Boolean precisionAsDisplayed ;

        public  WorkbookSettings  precisionAsDisplayed(Boolean  precisionAsDisplayed) {
            this.precisionAsDisplayed =  precisionAsDisplayed;
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
        private Boolean recalculateBeforeSave ;

        public  WorkbookSettings  recalculateBeforeSave(Boolean  recalculateBeforeSave) {
            this.recalculateBeforeSave =  recalculateBeforeSave;
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
        private Boolean reCalculateOnOpen ;

        public  WorkbookSettings  reCalculateOnOpen(Boolean  reCalculateOnOpen) {
            this.reCalculateOnOpen =  reCalculateOnOpen;
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
        private Boolean recommendReadOnly ;

        public  WorkbookSettings  recommendReadOnly(Boolean  recommendReadOnly) {
            this.recommendReadOnly =  recommendReadOnly;
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
        private String region ;

        public  WorkbookSettings  region(String  region) {
            this.region =  region;
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
        private Boolean removePersonalInformation ;

        public  WorkbookSettings  removePersonalInformation(Boolean  removePersonalInformation) {
            this.removePersonalInformation =  removePersonalInformation;
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
        private Boolean repairLoad ;

        public  WorkbookSettings  repairLoad(Boolean  repairLoad) {
            this.repairLoad =  repairLoad;
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
        private Boolean shared ;

        public  WorkbookSettings  shared(Boolean  shared) {
            this.shared =  shared;
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
        private Integer sheetTabBarWidth ;

        public  WorkbookSettings  sheetTabBarWidth(Integer  sheetTabBarWidth) {
            this.sheetTabBarWidth =  sheetTabBarWidth;
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
        private Boolean showTabs ;

        public  WorkbookSettings  showTabs(Boolean  showTabs) {
            this.showTabs =  showTabs;
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
        private Boolean updateAdjacentCellsBorder ;

        public  WorkbookSettings  updateAdjacentCellsBorder(Boolean  updateAdjacentCellsBorder) {
            this.updateAdjacentCellsBorder =  updateAdjacentCellsBorder;
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
        private String updateLinksType ;

        public  WorkbookSettings  updateLinksType(String  updateLinksType) {
            this.updateLinksType =  updateLinksType;
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
        private Double windowHeight ;

        public  WorkbookSettings  windowHeight(Double  windowHeight) {
            this.windowHeight =  windowHeight;
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
        private Double windowLeft ;

        public  WorkbookSettings  windowLeft(Double  windowLeft) {
            this.windowLeft =  windowLeft;
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
        private Double windowTop ;

        public  WorkbookSettings  windowTop(Double  windowTop) {
            this.windowTop =  windowTop;
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
        private Double windowWidth ;

        public  WorkbookSettings  windowWidth(Double  windowWidth) {
            this.windowWidth =  windowWidth;
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
        private String author ;

        public  WorkbookSettings  author(String  author) {
            this.author =  author;
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
        private Boolean checkCustomNumberFormat ;

        public  WorkbookSettings  checkCustomNumberFormat(Boolean  checkCustomNumberFormat) {
            this.checkCustomNumberFormat =  checkCustomNumberFormat;
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
        private String protectionType ;

        public  WorkbookSettings  protectionType(String  protectionType) {
            this.protectionType =  protectionType;
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
        private GlobalizationSettings globalizationSettings ;

        public  WorkbookSettings  globalizationSettings(GlobalizationSettings  globalizationSettings) {
            this.globalizationSettings =  globalizationSettings;
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
        private String password ;

        public  WorkbookSettings  password(String  password) {
            this.password =  password;
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
        private WriteProtection writeProtection ;

        public  WorkbookSettings  writeProtection(WriteProtection  writeProtection) {
            this.writeProtection =  writeProtection;
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
        private Boolean isEncrypted ;

        public  WorkbookSettings  isEncrypted(Boolean  isEncrypted) {
            this.isEncrypted =  isEncrypted;
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
        private Boolean isProtected ;

        public  WorkbookSettings  isProtected(Boolean  isProtected) {
            this.isProtected =  isProtected;
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
        private Integer maxRow ;

        public  WorkbookSettings  maxRow(Integer  maxRow) {
            this.maxRow =  maxRow;
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
        private Integer maxColumn ;

        public  WorkbookSettings  maxColumn(Integer  maxColumn) {
            this.maxColumn =  maxColumn;
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
        private Integer significantDigits ;

        public  WorkbookSettings  significantDigits(Integer  significantDigits) {
            this.significantDigits =  significantDigits;
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
        private Boolean checkCompatibility ;

        public  WorkbookSettings  checkCompatibility(Boolean  checkCompatibility) {
            this.checkCompatibility =  checkCompatibility;
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
        private String paperSize ;

        public  WorkbookSettings  paperSize(String  paperSize) {
            this.paperSize =  paperSize;
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
        private Integer maxRowsOfSharedFormula ;

        public  WorkbookSettings  maxRowsOfSharedFormula(Integer  maxRowsOfSharedFormula) {
            this.maxRowsOfSharedFormula =  maxRowsOfSharedFormula;
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
        private String compliance ;

        public  WorkbookSettings  compliance(String  compliance) {
            this.compliance =  compliance;
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
        private Boolean quotePrefixToStyle ;

        public  WorkbookSettings  quotePrefixToStyle(Boolean  quotePrefixToStyle) {
            this.quotePrefixToStyle =  quotePrefixToStyle;
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
        private FormulaSettings formulaSettings ;

        public  WorkbookSettings  formulaSettings(FormulaSettings  formulaSettings) {
            this.formulaSettings =  formulaSettings;
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
        private Boolean forceFullCalculate ;

        public  WorkbookSettings  forceFullCalculate(Boolean  forceFullCalculate) {
            this.forceFullCalculate =  forceFullCalculate;
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
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            WorkbookSettings workbookSettings = (WorkbookSettings) o;
            return
                Objects.equals(this.autoCompressPictures, workbookSettings.autoCompressPictures) &&
                Objects.equals(this.autoRecover, workbookSettings.autoRecover) &&
                Objects.equals(this.buildVersion, workbookSettings.buildVersion) &&
                Objects.equals(this.calcMode, workbookSettings.calcMode) &&
                Objects.equals(this.calculationId, workbookSettings.calculationId) &&
                Objects.equals(this.checkComptiliblity, workbookSettings.checkComptiliblity) &&
                Objects.equals(this.checkExcelRestriction, workbookSettings.checkExcelRestriction) &&
                Objects.equals(this.crashSave, workbookSettings.crashSave) &&
                Objects.equals(this.createCalcChain, workbookSettings.createCalcChain) &&
                Objects.equals(this.dataExtractLoad, workbookSettings.dataExtractLoad) &&
                Objects.equals(this.date1904, workbookSettings.date1904) &&
                Objects.equals(this.displayDrawingObjects, workbookSettings.displayDrawingObjects) &&
                Objects.equals(this.enableMacros, workbookSettings.enableMacros) &&
                Objects.equals(this.firstVisibleTab, workbookSettings.firstVisibleTab) &&
                Objects.equals(this.hidePivotFieldList, workbookSettings.hidePivotFieldList) &&
                Objects.equals(this.isDefaultEncrypted, workbookSettings.isDefaultEncrypted) &&
                Objects.equals(this.isHidden, workbookSettings.isHidden) &&
                Objects.equals(this.isHScrollBarVisible, workbookSettings.isHScrollBarVisible) &&
                Objects.equals(this.isMinimized, workbookSettings.isMinimized) &&
                Objects.equals(this.isVScrollBarVisible, workbookSettings.isVScrollBarVisible) &&
                Objects.equals(this.iteration, workbookSettings.iteration) &&
                Objects.equals(this.languageCode, workbookSettings.languageCode) &&
                Objects.equals(this.maxChange, workbookSettings.maxChange) &&
                Objects.equals(this.maxIteration, workbookSettings.maxIteration) &&
                Objects.equals(this.memorySetting, workbookSettings.memorySetting) &&
                Objects.equals(this.numberDecimalSeparator, workbookSettings.numberDecimalSeparator) &&
                Objects.equals(this.numberGroupSeparator, workbookSettings.numberGroupSeparator) &&
                Objects.equals(this.parsingFormulaOnOpen, workbookSettings.parsingFormulaOnOpen) &&
                Objects.equals(this.precisionAsDisplayed, workbookSettings.precisionAsDisplayed) &&
                Objects.equals(this.recalculateBeforeSave, workbookSettings.recalculateBeforeSave) &&
                Objects.equals(this.reCalculateOnOpen, workbookSettings.reCalculateOnOpen) &&
                Objects.equals(this.recommendReadOnly, workbookSettings.recommendReadOnly) &&
                Objects.equals(this.region, workbookSettings.region) &&
                Objects.equals(this.removePersonalInformation, workbookSettings.removePersonalInformation) &&
                Objects.equals(this.repairLoad, workbookSettings.repairLoad) &&
                Objects.equals(this.shared, workbookSettings.shared) &&
                Objects.equals(this.sheetTabBarWidth, workbookSettings.sheetTabBarWidth) &&
                Objects.equals(this.showTabs, workbookSettings.showTabs) &&
                Objects.equals(this.updateAdjacentCellsBorder, workbookSettings.updateAdjacentCellsBorder) &&
                Objects.equals(this.updateLinksType, workbookSettings.updateLinksType) &&
                Objects.equals(this.windowHeight, workbookSettings.windowHeight) &&
                Objects.equals(this.windowLeft, workbookSettings.windowLeft) &&
                Objects.equals(this.windowTop, workbookSettings.windowTop) &&
                Objects.equals(this.windowWidth, workbookSettings.windowWidth) &&
                Objects.equals(this.author, workbookSettings.author) &&
                Objects.equals(this.checkCustomNumberFormat, workbookSettings.checkCustomNumberFormat) &&
                Objects.equals(this.protectionType, workbookSettings.protectionType) &&
                Objects.equals(this.globalizationSettings, workbookSettings.globalizationSettings) &&
                Objects.equals(this.password, workbookSettings.password) &&
                Objects.equals(this.writeProtection, workbookSettings.writeProtection) &&
                Objects.equals(this.isEncrypted, workbookSettings.isEncrypted) &&
                Objects.equals(this.isProtected, workbookSettings.isProtected) &&
                Objects.equals(this.maxRow, workbookSettings.maxRow) &&
                Objects.equals(this.maxColumn, workbookSettings.maxColumn) &&
                Objects.equals(this.significantDigits, workbookSettings.significantDigits) &&
                Objects.equals(this.checkCompatibility, workbookSettings.checkCompatibility) &&
                Objects.equals(this.paperSize, workbookSettings.paperSize) &&
                Objects.equals(this.maxRowsOfSharedFormula, workbookSettings.maxRowsOfSharedFormula) &&
                Objects.equals(this.compliance, workbookSettings.compliance) &&
                Objects.equals(this.quotePrefixToStyle, workbookSettings.quotePrefixToStyle) &&
                Objects.equals(this.formulaSettings, workbookSettings.formulaSettings) &&
                Objects.equals(this.forceFullCalculate, workbookSettings.forceFullCalculate);
      }

      @Override
      public int hashCode() {
        return Objects.hash(autoCompressPictures, autoRecover, buildVersion, calcMode, calculationId, checkComptiliblity, checkExcelRestriction, crashSave, createCalcChain, dataExtractLoad, date1904, displayDrawingObjects, enableMacros, firstVisibleTab, hidePivotFieldList, isDefaultEncrypted, isHidden, isHScrollBarVisible, isMinimized, isVScrollBarVisible, iteration, languageCode, maxChange, maxIteration, memorySetting, numberDecimalSeparator, numberGroupSeparator, parsingFormulaOnOpen, precisionAsDisplayed, recalculateBeforeSave, reCalculateOnOpen, recommendReadOnly, region, removePersonalInformation, repairLoad, shared, sheetTabBarWidth, showTabs, updateAdjacentCellsBorder, updateLinksType, windowHeight, windowLeft, windowTop, windowWidth, author, checkCustomNumberFormat, protectionType, globalizationSettings, password, writeProtection, isEncrypted, isProtected, maxRow, maxColumn, significantDigits, checkCompatibility, paperSize, maxRowsOfSharedFormula, compliance, quotePrefixToStyle, formulaSettings, forceFullCalculate);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WorkbookSettings {\n");
            sb.append("    autoCompressPictures: ").append(toIndentedString(getAutoCompressPictures())).append("\n");
            sb.append("    autoRecover: ").append(toIndentedString(getAutoRecover())).append("\n");
            sb.append("    buildVersion: ").append(toIndentedString(getBuildVersion())).append("\n");
            sb.append("    calcMode: ").append(toIndentedString(getCalcMode())).append("\n");
            sb.append("    calculationId: ").append(toIndentedString(getCalculationId())).append("\n");
            sb.append("    checkComptiliblity: ").append(toIndentedString(getCheckComptiliblity())).append("\n");
            sb.append("    checkExcelRestriction: ").append(toIndentedString(getCheckExcelRestriction())).append("\n");
            sb.append("    crashSave: ").append(toIndentedString(getCrashSave())).append("\n");
            sb.append("    createCalcChain: ").append(toIndentedString(getCreateCalcChain())).append("\n");
            sb.append("    dataExtractLoad: ").append(toIndentedString(getDataExtractLoad())).append("\n");
            sb.append("    date1904: ").append(toIndentedString(getDate1904())).append("\n");
            sb.append("    displayDrawingObjects: ").append(toIndentedString(getDisplayDrawingObjects())).append("\n");
            sb.append("    enableMacros: ").append(toIndentedString(getEnableMacros())).append("\n");
            sb.append("    firstVisibleTab: ").append(toIndentedString(getFirstVisibleTab())).append("\n");
            sb.append("    hidePivotFieldList: ").append(toIndentedString(getHidePivotFieldList())).append("\n");
            sb.append("    isDefaultEncrypted: ").append(toIndentedString(getIsDefaultEncrypted())).append("\n");
            sb.append("    isHidden: ").append(toIndentedString(getIsHidden())).append("\n");
            sb.append("    isHScrollBarVisible: ").append(toIndentedString(getIsHScrollBarVisible())).append("\n");
            sb.append("    isMinimized: ").append(toIndentedString(getIsMinimized())).append("\n");
            sb.append("    isVScrollBarVisible: ").append(toIndentedString(getIsVScrollBarVisible())).append("\n");
            sb.append("    iteration: ").append(toIndentedString(getIteration())).append("\n");
            sb.append("    languageCode: ").append(toIndentedString(getLanguageCode())).append("\n");
            sb.append("    maxChange: ").append(toIndentedString(getMaxChange())).append("\n");
            sb.append("    maxIteration: ").append(toIndentedString(getMaxIteration())).append("\n");
            sb.append("    memorySetting: ").append(toIndentedString(getMemorySetting())).append("\n");
            sb.append("    numberDecimalSeparator: ").append(toIndentedString(getNumberDecimalSeparator())).append("\n");
            sb.append("    numberGroupSeparator: ").append(toIndentedString(getNumberGroupSeparator())).append("\n");
            sb.append("    parsingFormulaOnOpen: ").append(toIndentedString(getParsingFormulaOnOpen())).append("\n");
            sb.append("    precisionAsDisplayed: ").append(toIndentedString(getPrecisionAsDisplayed())).append("\n");
            sb.append("    recalculateBeforeSave: ").append(toIndentedString(getRecalculateBeforeSave())).append("\n");
            sb.append("    reCalculateOnOpen: ").append(toIndentedString(getReCalculateOnOpen())).append("\n");
            sb.append("    recommendReadOnly: ").append(toIndentedString(getRecommendReadOnly())).append("\n");
            sb.append("    region: ").append(toIndentedString(getRegion())).append("\n");
            sb.append("    removePersonalInformation: ").append(toIndentedString(getRemovePersonalInformation())).append("\n");
            sb.append("    repairLoad: ").append(toIndentedString(getRepairLoad())).append("\n");
            sb.append("    shared: ").append(toIndentedString(getShared())).append("\n");
            sb.append("    sheetTabBarWidth: ").append(toIndentedString(getSheetTabBarWidth())).append("\n");
            sb.append("    showTabs: ").append(toIndentedString(getShowTabs())).append("\n");
            sb.append("    updateAdjacentCellsBorder: ").append(toIndentedString(getUpdateAdjacentCellsBorder())).append("\n");
            sb.append("    updateLinksType: ").append(toIndentedString(getUpdateLinksType())).append("\n");
            sb.append("    windowHeight: ").append(toIndentedString(getWindowHeight())).append("\n");
            sb.append("    windowLeft: ").append(toIndentedString(getWindowLeft())).append("\n");
            sb.append("    windowTop: ").append(toIndentedString(getWindowTop())).append("\n");
            sb.append("    windowWidth: ").append(toIndentedString(getWindowWidth())).append("\n");
            sb.append("    author: ").append(toIndentedString(getAuthor())).append("\n");
            sb.append("    checkCustomNumberFormat: ").append(toIndentedString(getCheckCustomNumberFormat())).append("\n");
            sb.append("    protectionType: ").append(toIndentedString(getProtectionType())).append("\n");
            sb.append("    globalizationSettings: ").append(toIndentedString(getGlobalizationSettings())).append("\n");
            sb.append("    password: ").append(toIndentedString(getPassword())).append("\n");
            sb.append("    writeProtection: ").append(toIndentedString(getWriteProtection())).append("\n");
            sb.append("    isEncrypted: ").append(toIndentedString(getIsEncrypted())).append("\n");
            sb.append("    isProtected: ").append(toIndentedString(getIsProtected())).append("\n");
            sb.append("    maxRow: ").append(toIndentedString(getMaxRow())).append("\n");
            sb.append("    maxColumn: ").append(toIndentedString(getMaxColumn())).append("\n");
            sb.append("    significantDigits: ").append(toIndentedString(getSignificantDigits())).append("\n");
            sb.append("    checkCompatibility: ").append(toIndentedString(getCheckCompatibility())).append("\n");
            sb.append("    paperSize: ").append(toIndentedString(getPaperSize())).append("\n");
            sb.append("    maxRowsOfSharedFormula: ").append(toIndentedString(getMaxRowsOfSharedFormula())).append("\n");
            sb.append("    compliance: ").append(toIndentedString(getCompliance())).append("\n");
            sb.append("    quotePrefixToStyle: ").append(toIndentedString(getQuotePrefixToStyle())).append("\n");
            sb.append("    formulaSettings: ").append(toIndentedString(getFormulaSettings())).append("\n");
            sb.append("    forceFullCalculate: ").append(toIndentedString(getForceFullCalculate())).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
        * Convert the given object to string with each line indented by 4 spaces
        * (except the first line).
        */
        private String toIndentedString(java.lang.Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }


}

