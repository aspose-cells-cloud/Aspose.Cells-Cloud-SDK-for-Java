package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WorkbookSettings — Represents all settings of the workbook. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkbookSettings {
    /** Specifies a boolean value that indicates the application automatically compressed pictures in the workbook. */
    @JsonProperty("AutoCompressPictures")
    private Boolean autoCompressPictures;

    /** Indicates whether the file is mark for auto-recovery. */
    @JsonProperty("AutoRecover")
    private Boolean autoRecover;

    /** Specifies the incremental public release of the application. */
    @JsonProperty("BuildVersion")
    private String buildVersion;

    /** It specifies whether to calculate formulas manually, automatically or automatically except for multiple table operations. */
    @JsonProperty("CalcMode")
    private String calcMode;

    /** Specifies the version of the calculation engine used to calculate values in the workbook. */
    @JsonProperty("CalculationId")
    private String calculationId;

    /** Indicates whether check comptiliblity when saving workbook.  Remarks: The default value is true. */
    @JsonProperty("CheckComptiliblity")
    private Boolean checkComptiliblity;

    /** Whether check restriction of excel file when user modify cells related objects. For example, excel does not allow inputting string value longer than 32K. When you input a value longer than 32K such as by Cell.PutValue(string), if this property is true, you will get an Exception. If this property is false, we will accept your input string value as the cell's value so that later you can output the complete string value for other file formats such as CSV. However, if you have set such kind of value that is invalid for excel file format, you should not save the workbook as excel file format later. Otherwise there may be unexpected error for the generated excel file. */
    @JsonProperty("CheckExcelRestriction")
    private Boolean checkExcelRestriction;

    /** indicates whether the application last saved the workbook file after a crash. */
    @JsonProperty("CrashSave")
    private Boolean crashSave;

    /** Whether creates calculated formulas chain. Default is false. */
    @JsonProperty("CreateCalcChain")
    private Boolean createCalcChain;

    /** indicates whether the application last opened the workbook for data recovery. */
    @JsonProperty("DataExtractLoad")
    private Boolean dataExtractLoad;

    /** Gets or sets a value which represents if the workbook uses the 1904 date system. */
    @JsonProperty("Date1904")
    private Boolean date1904;

    /** Indicates whether and how to show objects in the workbook. */
    @JsonProperty("DisplayDrawingObjects")
    private String displayDrawingObjects;

    /** Enable macros; */
    @JsonProperty("EnableMacros")
    private Boolean enableMacros;

    /** Gets or sets the first visible worksheet tab. */
    @JsonProperty("FirstVisibleTab")
    private Integer firstVisibleTab;

    /** Gets and sets whether hide the field list for the PivotTable. */
    @JsonProperty("HidePivotFieldList")
    private Boolean hidePivotFieldList;

    /** Indicates whether encrypting the workbook with default password if Structure and Windows of the workbook are locked. */
    @JsonProperty("IsDefaultEncrypted")
    private Boolean isDefaultEncrypted;

    /** Indicates whether this workbook is hidden. */
    @JsonProperty("IsHidden")
    private Boolean isHidden;

    /** Gets or sets a value indicating whether the generated spreadsheet will contain a horizontal scroll bar. */
    @JsonProperty("IsHScrollBarVisible")
    private Boolean isHScrollBarVisible;

    /** Represents whether the generated spreadsheet will be opened Minimized. */
    @JsonProperty("IsMinimized")
    private Boolean isMinimized;

    /** Gets or sets a value indicating whether the generated spreadsheet will contain a vertical scroll bar. */
    @JsonProperty("IsVScrollBarVisible")
    private Boolean isVScrollBarVisible;

    /** Indicates whether enable iterative calculation to resolve circular references. */
    @JsonProperty("Iteration")
    private Boolean iteration;

    /** Gets or sets the user interface language of the Workbook version based on CountryCode that has saved the file. */
    @JsonProperty("LanguageCode")
    private String languageCode;

    /** Returns or sets the maximum number of change to resolve a circular reference. */
    @JsonProperty("MaxChange")
    private Double maxChange;

    /** Returns or sets the maximum number of iterations to resolve a circular reference. */
    @JsonProperty("MaxIteration")
    private Integer maxIteration;

    /** Gets or sets the memory usage options. The new option will be taken as the default option for newly created worksheets but does not take effect for existing worksheets. */
    @JsonProperty("MemorySetting")
    private String memorySetting;

    /** Gets or sets the decimal separator for formatting/parsing numeric values. Default is the decimal separator of current Region. */
    @JsonProperty("NumberDecimalSeparator")
    private String numberDecimalSeparator;

    /** Gets or sets the character that separates groups of digits to the left of the decimal in numeric values. Default is the group separator of current Region. */
    @JsonProperty("NumberGroupSeparator")
    private String numberGroupSeparator;

    /** Indicates whether parsing the formula when reading the file. */
    @JsonProperty("ParsingFormulaOnOpen")
    private Boolean parsingFormulaOnOpen;

    /** True if calculations in this workbook will be done using only the precision of the numbers as they're displayed */
    @JsonProperty("PrecisionAsDisplayed")
    private Boolean precisionAsDisplayed;

    /** Indicates whether to recalculate before saving the document. */
    @JsonProperty("RecalculateBeforeSave")
    private Boolean recalculateBeforeSave;

    /** Indicates whether re-calculate all formulas on opening file. */
    @JsonProperty("ReCalculateOnOpen")
    private Boolean reCalculateOnOpen;

    /** Indicates if the Read Only Recommended option is selected. */
    @JsonProperty("RecommendReadOnly")
    private Boolean recommendReadOnly;

    /** Gets or sets the regional settings for workbook. */
    @JsonProperty("Region")
    private String region;

    /** True if personal information can be removed from the specified workbook. */
    @JsonProperty("RemovePersonalInformation")
    private Boolean removePersonalInformation;

    /** Indicates whether the application last opened the workbook in safe or repair mode. */
    @JsonProperty("RepairLoad")
    private Boolean repairLoad;

    /** Gets or sets a value that indicates whether the Workbook is shared. */
    @JsonProperty("Shared")
    private Boolean shared;

    /** Width of worksheet tab bar (in 1/1000 of window width). */
    @JsonProperty("SheetTabBarWidth")
    private Integer sheetTabBarWidth;

    /** Get or sets a value whether the Workbook tabs are displayed. */
    @JsonProperty("ShowTabs")
    private Boolean showTabs;

    /** Indicates whether update adjacent cells' border. */
    @JsonProperty("UpdateAdjacentCellsBorder")
    private Boolean updateAdjacentCellsBorder;

    /** Gets and sets how updates external links when the workbook is opened. */
    @JsonProperty("UpdateLinksType")
    private String updateLinksType;

    /** The height of the window, in unit of point. */
    @JsonProperty("WindowHeight")
    private Double windowHeight;

    /** The distance from the left edge of the client area to the left edge of the window, in unit of point. */
    @JsonProperty("WindowLeft")
    private Double windowLeft;

    /** The distance from the top edge of the client area to the top edge of the window, in unit of point. */
    @JsonProperty("WindowTop")
    private Double windowTop;

    /** The width of the window, in unit of point. */
    @JsonProperty("WindowWidth")
    private Double windowWidth;

    /** Gets and sets the author of the file. */
    @JsonProperty("Author")
    private String author;

    /** Indicates whether checking custom number format when setting Style.Custom. */
    @JsonProperty("CheckCustomNumberFormat")
    private Boolean checkCustomNumberFormat;

    /** Gets the protection type of the workbook. */
    @JsonProperty("ProtectionType")
    private String protectionType;

    /** Gets and sets the globalization settings. */
    @JsonProperty("GlobalizationSettings")
    private GlobalizationSettings globalizationSettings;

    /** Represents Workbook file encryption password. */
    @JsonProperty("Password")
    private String password;

    /** Provides access to the workbook write protection options. */
    @JsonProperty("WriteProtection")
    private WriteProtection writeProtection;

    /** Gets a value that indicates whether a password is required to open this workbook. */
    @JsonProperty("IsEncrypted")
    private Boolean isEncrypted;

    /** Gets a value that indicates whether the structure or window of the Workbook is protected. */
    @JsonProperty("IsProtected")
    private Boolean isProtected;

    /** Gets the max row index, zero-based. */
    @JsonProperty("MaxRow")
    private Integer maxRow;

    /** Gets the max column index, zero-based. */
    @JsonProperty("MaxColumn")
    private Integer maxColumn;

    /** Gets and sets the number of significant digits. The default value is . */
    @JsonProperty("SignificantDigits")
    private Integer significantDigits;

    /** Indicates whether check compatibility with earlier versions when saving workbook. */
    @JsonProperty("CheckCompatibility")
    private Boolean checkCompatibility;

    /** Gets and sets the default print paper size. */
    @JsonProperty("PaperSize")
    private String paperSize;

    /** Gets and sets the max row number of shared formula. */
    @JsonProperty("MaxRowsOfSharedFormula")
    private Integer maxRowsOfSharedFormula;

    /** Specifies the OOXML version for the output document. The default value is Ecma376_2006. */
    @JsonProperty("Compliance")
    private String compliance;

    /** Indicates whether setting  property when entering the string value(which starts  with single quote mark ) to the cell */
    @JsonProperty("QuotePrefixToStyle")
    private Boolean quotePrefixToStyle;

    /** Gets the settings for formula-related features. */
    @JsonProperty("FormulaSettings")
    private FormulaSettings formulaSettings;

    /** Fully calculates every time when a calculation is triggered. */
    @JsonProperty("ForceFullCalculate")
    private Boolean forceFullCalculate;

    public Boolean getAutoCompressPictures() { return autoCompressPictures; }
    public WorkbookSettings setAutoCompressPictures(Boolean autoCompressPictures) { this.autoCompressPictures = autoCompressPictures; return this; }

    public Boolean getAutoRecover() { return autoRecover; }
    public WorkbookSettings setAutoRecover(Boolean autoRecover) { this.autoRecover = autoRecover; return this; }

    public String getBuildVersion() { return buildVersion; }
    public WorkbookSettings setBuildVersion(String buildVersion) { this.buildVersion = buildVersion; return this; }

    public String getCalcMode() { return calcMode; }
    public WorkbookSettings setCalcMode(String calcMode) { this.calcMode = calcMode; return this; }

    public String getCalculationId() { return calculationId; }
    public WorkbookSettings setCalculationId(String calculationId) { this.calculationId = calculationId; return this; }

    public Boolean getCheckComptiliblity() { return checkComptiliblity; }
    public WorkbookSettings setCheckComptiliblity(Boolean checkComptiliblity) { this.checkComptiliblity = checkComptiliblity; return this; }

    public Boolean getCheckExcelRestriction() { return checkExcelRestriction; }
    public WorkbookSettings setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    public Boolean getCrashSave() { return crashSave; }
    public WorkbookSettings setCrashSave(Boolean crashSave) { this.crashSave = crashSave; return this; }

    public Boolean getCreateCalcChain() { return createCalcChain; }
    public WorkbookSettings setCreateCalcChain(Boolean createCalcChain) { this.createCalcChain = createCalcChain; return this; }

    public Boolean getDataExtractLoad() { return dataExtractLoad; }
    public WorkbookSettings setDataExtractLoad(Boolean dataExtractLoad) { this.dataExtractLoad = dataExtractLoad; return this; }

    public Boolean getDate1904() { return date1904; }
    public WorkbookSettings setDate1904(Boolean date1904) { this.date1904 = date1904; return this; }

    public String getDisplayDrawingObjects() { return displayDrawingObjects; }
    public WorkbookSettings setDisplayDrawingObjects(String displayDrawingObjects) { this.displayDrawingObjects = displayDrawingObjects; return this; }

    public Boolean getEnableMacros() { return enableMacros; }
    public WorkbookSettings setEnableMacros(Boolean enableMacros) { this.enableMacros = enableMacros; return this; }

    public Integer getFirstVisibleTab() { return firstVisibleTab; }
    public WorkbookSettings setFirstVisibleTab(Integer firstVisibleTab) { this.firstVisibleTab = firstVisibleTab; return this; }

    public Boolean getHidePivotFieldList() { return hidePivotFieldList; }
    public WorkbookSettings setHidePivotFieldList(Boolean hidePivotFieldList) { this.hidePivotFieldList = hidePivotFieldList; return this; }

    public Boolean getIsDefaultEncrypted() { return isDefaultEncrypted; }
    public WorkbookSettings setIsDefaultEncrypted(Boolean isDefaultEncrypted) { this.isDefaultEncrypted = isDefaultEncrypted; return this; }

    public Boolean getIsHidden() { return isHidden; }
    public WorkbookSettings setIsHidden(Boolean isHidden) { this.isHidden = isHidden; return this; }

    public Boolean getIsHScrollBarVisible() { return isHScrollBarVisible; }
    public WorkbookSettings setIsHScrollBarVisible(Boolean isHScrollBarVisible) { this.isHScrollBarVisible = isHScrollBarVisible; return this; }

    public Boolean getIsMinimized() { return isMinimized; }
    public WorkbookSettings setIsMinimized(Boolean isMinimized) { this.isMinimized = isMinimized; return this; }

    public Boolean getIsVScrollBarVisible() { return isVScrollBarVisible; }
    public WorkbookSettings setIsVScrollBarVisible(Boolean isVScrollBarVisible) { this.isVScrollBarVisible = isVScrollBarVisible; return this; }

    public Boolean getIteration() { return iteration; }
    public WorkbookSettings setIteration(Boolean iteration) { this.iteration = iteration; return this; }

    public String getLanguageCode() { return languageCode; }
    public WorkbookSettings setLanguageCode(String languageCode) { this.languageCode = languageCode; return this; }

    public Double getMaxChange() { return maxChange; }
    public WorkbookSettings setMaxChange(Double maxChange) { this.maxChange = maxChange; return this; }

    public Integer getMaxIteration() { return maxIteration; }
    public WorkbookSettings setMaxIteration(Integer maxIteration) { this.maxIteration = maxIteration; return this; }

    public String getMemorySetting() { return memorySetting; }
    public WorkbookSettings setMemorySetting(String memorySetting) { this.memorySetting = memorySetting; return this; }

    public String getNumberDecimalSeparator() { return numberDecimalSeparator; }
    public WorkbookSettings setNumberDecimalSeparator(String numberDecimalSeparator) { this.numberDecimalSeparator = numberDecimalSeparator; return this; }

    public String getNumberGroupSeparator() { return numberGroupSeparator; }
    public WorkbookSettings setNumberGroupSeparator(String numberGroupSeparator) { this.numberGroupSeparator = numberGroupSeparator; return this; }

    public Boolean getParsingFormulaOnOpen() { return parsingFormulaOnOpen; }
    public WorkbookSettings setParsingFormulaOnOpen(Boolean parsingFormulaOnOpen) { this.parsingFormulaOnOpen = parsingFormulaOnOpen; return this; }

    public Boolean getPrecisionAsDisplayed() { return precisionAsDisplayed; }
    public WorkbookSettings setPrecisionAsDisplayed(Boolean precisionAsDisplayed) { this.precisionAsDisplayed = precisionAsDisplayed; return this; }

    public Boolean getRecalculateBeforeSave() { return recalculateBeforeSave; }
    public WorkbookSettings setRecalculateBeforeSave(Boolean recalculateBeforeSave) { this.recalculateBeforeSave = recalculateBeforeSave; return this; }

    public Boolean getReCalculateOnOpen() { return reCalculateOnOpen; }
    public WorkbookSettings setReCalculateOnOpen(Boolean reCalculateOnOpen) { this.reCalculateOnOpen = reCalculateOnOpen; return this; }

    public Boolean getRecommendReadOnly() { return recommendReadOnly; }
    public WorkbookSettings setRecommendReadOnly(Boolean recommendReadOnly) { this.recommendReadOnly = recommendReadOnly; return this; }

    public String getRegion() { return region; }
    public WorkbookSettings setRegion(String region) { this.region = region; return this; }

    public Boolean getRemovePersonalInformation() { return removePersonalInformation; }
    public WorkbookSettings setRemovePersonalInformation(Boolean removePersonalInformation) { this.removePersonalInformation = removePersonalInformation; return this; }

    public Boolean getRepairLoad() { return repairLoad; }
    public WorkbookSettings setRepairLoad(Boolean repairLoad) { this.repairLoad = repairLoad; return this; }

    public Boolean getShared() { return shared; }
    public WorkbookSettings setShared(Boolean shared) { this.shared = shared; return this; }

    public Integer getSheetTabBarWidth() { return sheetTabBarWidth; }
    public WorkbookSettings setSheetTabBarWidth(Integer sheetTabBarWidth) { this.sheetTabBarWidth = sheetTabBarWidth; return this; }

    public Boolean getShowTabs() { return showTabs; }
    public WorkbookSettings setShowTabs(Boolean showTabs) { this.showTabs = showTabs; return this; }

    public Boolean getUpdateAdjacentCellsBorder() { return updateAdjacentCellsBorder; }
    public WorkbookSettings setUpdateAdjacentCellsBorder(Boolean updateAdjacentCellsBorder) { this.updateAdjacentCellsBorder = updateAdjacentCellsBorder; return this; }

    public String getUpdateLinksType() { return updateLinksType; }
    public WorkbookSettings setUpdateLinksType(String updateLinksType) { this.updateLinksType = updateLinksType; return this; }

    public Double getWindowHeight() { return windowHeight; }
    public WorkbookSettings setWindowHeight(Double windowHeight) { this.windowHeight = windowHeight; return this; }

    public Double getWindowLeft() { return windowLeft; }
    public WorkbookSettings setWindowLeft(Double windowLeft) { this.windowLeft = windowLeft; return this; }

    public Double getWindowTop() { return windowTop; }
    public WorkbookSettings setWindowTop(Double windowTop) { this.windowTop = windowTop; return this; }

    public Double getWindowWidth() { return windowWidth; }
    public WorkbookSettings setWindowWidth(Double windowWidth) { this.windowWidth = windowWidth; return this; }

    public String getAuthor() { return author; }
    public WorkbookSettings setAuthor(String author) { this.author = author; return this; }

    public Boolean getCheckCustomNumberFormat() { return checkCustomNumberFormat; }
    public WorkbookSettings setCheckCustomNumberFormat(Boolean checkCustomNumberFormat) { this.checkCustomNumberFormat = checkCustomNumberFormat; return this; }

    public String getProtectionType() { return protectionType; }
    public WorkbookSettings setProtectionType(String protectionType) { this.protectionType = protectionType; return this; }

    public GlobalizationSettings getGlobalizationSettings() { return globalizationSettings; }
    public WorkbookSettings setGlobalizationSettings(GlobalizationSettings globalizationSettings) { this.globalizationSettings = globalizationSettings; return this; }

    public String getPassword() { return password; }
    public WorkbookSettings setPassword(String password) { this.password = password; return this; }

    public WriteProtection getWriteProtection() { return writeProtection; }
    public WorkbookSettings setWriteProtection(WriteProtection writeProtection) { this.writeProtection = writeProtection; return this; }

    public Boolean getIsEncrypted() { return isEncrypted; }
    public WorkbookSettings setIsEncrypted(Boolean isEncrypted) { this.isEncrypted = isEncrypted; return this; }

    public Boolean getIsProtected() { return isProtected; }
    public WorkbookSettings setIsProtected(Boolean isProtected) { this.isProtected = isProtected; return this; }

    public Integer getMaxRow() { return maxRow; }
    public WorkbookSettings setMaxRow(Integer maxRow) { this.maxRow = maxRow; return this; }

    public Integer getMaxColumn() { return maxColumn; }
    public WorkbookSettings setMaxColumn(Integer maxColumn) { this.maxColumn = maxColumn; return this; }

    public Integer getSignificantDigits() { return significantDigits; }
    public WorkbookSettings setSignificantDigits(Integer significantDigits) { this.significantDigits = significantDigits; return this; }

    public Boolean getCheckCompatibility() { return checkCompatibility; }
    public WorkbookSettings setCheckCompatibility(Boolean checkCompatibility) { this.checkCompatibility = checkCompatibility; return this; }

    public String getPaperSize() { return paperSize; }
    public WorkbookSettings setPaperSize(String paperSize) { this.paperSize = paperSize; return this; }

    public Integer getMaxRowsOfSharedFormula() { return maxRowsOfSharedFormula; }
    public WorkbookSettings setMaxRowsOfSharedFormula(Integer maxRowsOfSharedFormula) { this.maxRowsOfSharedFormula = maxRowsOfSharedFormula; return this; }

    public String getCompliance() { return compliance; }
    public WorkbookSettings setCompliance(String compliance) { this.compliance = compliance; return this; }

    public Boolean getQuotePrefixToStyle() { return quotePrefixToStyle; }
    public WorkbookSettings setQuotePrefixToStyle(Boolean quotePrefixToStyle) { this.quotePrefixToStyle = quotePrefixToStyle; return this; }

    public FormulaSettings getFormulaSettings() { return formulaSettings; }
    public WorkbookSettings setFormulaSettings(FormulaSettings formulaSettings) { this.formulaSettings = formulaSettings; return this; }

    public Boolean getForceFullCalculate() { return forceFullCalculate; }
    public WorkbookSettings setForceFullCalculate(Boolean forceFullCalculate) { this.forceFullCalculate = forceFullCalculate; return this; }

}
