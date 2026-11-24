/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="LoadOptions.java">
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

public class LoadOptions {

    @SerializedName("ConvertNumericData")
    @JsonProperty("ConvertNumericData")
    private String convertNumericData;

    public LoadOptions convertNumericData(String convertNumericData) {
        this.convertNumericData = convertNumericData;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getConvertNumericData() {
        return convertNumericData;
    }

    public void setConvertNumericData(String convertNumericData) {
        this.convertNumericData = convertNumericData;
    }

    @SerializedName("InterruptMonitor")
    @JsonProperty("InterruptMonitor")
    private String interruptMonitor;

    public LoadOptions interruptMonitor(String interruptMonitor) {
        this.interruptMonitor = interruptMonitor;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getInterruptMonitor() {
        return interruptMonitor;
    }

    public void setInterruptMonitor(String interruptMonitor) {
        this.interruptMonitor = interruptMonitor;
    }

    @SerializedName("LanguageCode")
    @JsonProperty("LanguageCode")
    private String languageCode;

    public LoadOptions languageCode(String languageCode) {
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

    @SerializedName("LoadDataOptions")
    @JsonProperty("LoadDataOptions")
    private String loadDataOptions;

    public LoadOptions loadDataOptions(String loadDataOptions) {
        this.loadDataOptions = loadDataOptions;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getLoadDataOptions() {
        return loadDataOptions;
    }

    public void setLoadDataOptions(String loadDataOptions) {
        this.loadDataOptions = loadDataOptions;
    }

    @SerializedName("LoadFormat")
    @JsonProperty("LoadFormat")
    private String loadFormat;

    public LoadOptions loadFormat(String loadFormat) {
        this.loadFormat = loadFormat;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getLoadFormat() {
        return loadFormat;
    }

    public void setLoadFormat(String loadFormat) {
        this.loadFormat = loadFormat;
    }

    @SerializedName("OnlyLoadDocumentProperties")
    @JsonProperty("OnlyLoadDocumentProperties")
    private String onlyLoadDocumentProperties;

    public LoadOptions onlyLoadDocumentProperties(String onlyLoadDocumentProperties) {
        this.onlyLoadDocumentProperties = onlyLoadDocumentProperties;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getOnlyLoadDocumentProperties() {
        return onlyLoadDocumentProperties;
    }

    public void setOnlyLoadDocumentProperties(String onlyLoadDocumentProperties) {
        this.onlyLoadDocumentProperties = onlyLoadDocumentProperties;
    }

    @SerializedName("ParsingFormulaOnOpen")
    @JsonProperty("ParsingFormulaOnOpen")
    private String parsingFormulaOnOpen;

    public LoadOptions parsingFormulaOnOpen(String parsingFormulaOnOpen) {
        this.parsingFormulaOnOpen = parsingFormulaOnOpen;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getParsingFormulaOnOpen() {
        return parsingFormulaOnOpen;
    }

    public void setParsingFormulaOnOpen(String parsingFormulaOnOpen) {
        this.parsingFormulaOnOpen = parsingFormulaOnOpen;
    }

    @SerializedName("Password")
    @JsonProperty("Password")
    private String password;

    public LoadOptions password(String password) {
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

    @SerializedName("Region")
    @JsonProperty("Region")
    private String region;

    public LoadOptions region(String region) {
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

    @SerializedName("StandardFont")
    @JsonProperty("StandardFont")
    private String standardFont;

    public LoadOptions standardFont(String standardFont) {
        this.standardFont = standardFont;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getStandardFont() {
        return standardFont;
    }

    public void setStandardFont(String standardFont) {
        this.standardFont = standardFont;
    }

    @SerializedName("StandardFontSize")
    @JsonProperty("StandardFontSize")
    private Double standardFontSize;

    public LoadOptions standardFontSize(Double standardFontSize) {
        this.standardFontSize = standardFontSize;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getStandardFontSize() {
        return standardFontSize;
    }

    public void setStandardFontSize(Double standardFontSize) {
        this.standardFontSize = standardFontSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoadOptions other = (LoadOptions) o;
        return Objects.equals(this.convertNumericData, other.convertNumericData)
            && Objects.equals(this.interruptMonitor, other.interruptMonitor)
            && Objects.equals(this.languageCode, other.languageCode)
            && Objects.equals(this.loadDataOptions, other.loadDataOptions)
            && Objects.equals(this.loadFormat, other.loadFormat)
            && Objects.equals(this.onlyLoadDocumentProperties, other.onlyLoadDocumentProperties)
            && Objects.equals(this.parsingFormulaOnOpen, other.parsingFormulaOnOpen)
            && Objects.equals(this.password, other.password)
            && Objects.equals(this.region, other.region)
            && Objects.equals(this.standardFont, other.standardFont)
            && Objects.equals(this.standardFontSize, other.standardFontSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(convertNumericData, interruptMonitor, languageCode, loadDataOptions, loadFormat, onlyLoadDocumentProperties, parsingFormulaOnOpen, password, region, standardFont, standardFontSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoadOptions {\n");
        sb.append("    convertNumericData: ").append(convertNumericData).append("\n");
        sb.append("    interruptMonitor: ").append(interruptMonitor).append("\n");
        sb.append("    languageCode: ").append(languageCode).append("\n");
        sb.append("    loadDataOptions: ").append(loadDataOptions).append("\n");
        sb.append("    loadFormat: ").append(loadFormat).append("\n");
        sb.append("    onlyLoadDocumentProperties: ").append(onlyLoadDocumentProperties).append("\n");
        sb.append("    parsingFormulaOnOpen: ").append(parsingFormulaOnOpen).append("\n");
        sb.append("    password: ").append(password).append("\n");
        sb.append("    region: ").append(region).append("\n");
        sb.append("    standardFont: ").append(standardFont).append("\n");
        sb.append("    standardFontSize: ").append(standardFontSize).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
