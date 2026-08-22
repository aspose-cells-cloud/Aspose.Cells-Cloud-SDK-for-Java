package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LoadOptions — Represents the options of loading the file. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoadOptions {
    /** This class has a public property named "ConvertNumericData" of type string that can be read from and written to. */
    @JsonProperty("ConvertNumericData")
    private String convertNumericData;

    /** Gets and sets the interrupt monitor. */
    @JsonProperty("InterruptMonitor")
    private String interruptMonitor;

    /** Gets or sets the user interface language of the Workbook version based on CountryCode that has saved the file. */
    @JsonProperty("LanguageCode")
    private String languageCode;

    /** Gets or sets LoadDataOptions. */
    @JsonProperty("LoadDataOptions")
    private String loadDataOptions;

    /** Gets the load format. */
    @JsonProperty("LoadFormat")
    private String loadFormat;

    /** Gets or sets OnlyLoadDocumentProperties. */
    @JsonProperty("OnlyLoadDocumentProperties")
    private String onlyLoadDocumentProperties;

    /** Indicates whether parsing the formula when reading the file. */
    @JsonProperty("ParsingFormulaOnOpen")
    private String parsingFormulaOnOpen;

    /** Gets and set the password of the workbook. */
    @JsonProperty("Password")
    private String password;

    /** Gets or sets the system regional settings based on CountryCode at the time the file was loaded. */
    @JsonProperty("Region")
    private String region;

    /** Sets the default standard font name */
    @JsonProperty("StandardFont")
    private String standardFont;

    /** Sets the default standard font size. */
    @JsonProperty("StandardFontSize")
    private Double standardFontSize;

    public String getConvertNumericData() { return convertNumericData; }
    public LoadOptions setConvertNumericData(String convertNumericData) { this.convertNumericData = convertNumericData; return this; }

    public String getInterruptMonitor() { return interruptMonitor; }
    public LoadOptions setInterruptMonitor(String interruptMonitor) { this.interruptMonitor = interruptMonitor; return this; }

    public String getLanguageCode() { return languageCode; }
    public LoadOptions setLanguageCode(String languageCode) { this.languageCode = languageCode; return this; }

    public String getLoadDataOptions() { return loadDataOptions; }
    public LoadOptions setLoadDataOptions(String loadDataOptions) { this.loadDataOptions = loadDataOptions; return this; }

    public String getLoadFormat() { return loadFormat; }
    public LoadOptions setLoadFormat(String loadFormat) { this.loadFormat = loadFormat; return this; }

    public String getOnlyLoadDocumentProperties() { return onlyLoadDocumentProperties; }
    public LoadOptions setOnlyLoadDocumentProperties(String onlyLoadDocumentProperties) { this.onlyLoadDocumentProperties = onlyLoadDocumentProperties; return this; }

    public String getParsingFormulaOnOpen() { return parsingFormulaOnOpen; }
    public LoadOptions setParsingFormulaOnOpen(String parsingFormulaOnOpen) { this.parsingFormulaOnOpen = parsingFormulaOnOpen; return this; }

    public String getPassword() { return password; }
    public LoadOptions setPassword(String password) { this.password = password; return this; }

    public String getRegion() { return region; }
    public LoadOptions setRegion(String region) { this.region = region; return this; }

    public String getStandardFont() { return standardFont; }
    public LoadOptions setStandardFont(String standardFont) { this.standardFont = standardFont; return this; }

    public Double getStandardFontSize() { return standardFontSize; }
    public LoadOptions setStandardFontSize(Double standardFontSize) { this.standardFontSize = standardFontSize; return this; }

}
