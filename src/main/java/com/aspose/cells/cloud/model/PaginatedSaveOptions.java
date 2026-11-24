/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PaginatedSaveOptions.java">
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

public class PaginatedSaveOptions extends SaveOptions {

    @SerializedName("DefaultFont")
    @JsonProperty("DefaultFont")
    private String defaultFont;

    public PaginatedSaveOptions defaultFont(String defaultFont) {
        this.defaultFont = defaultFont;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDefaultFont() {
        return defaultFont;
    }

    public void setDefaultFont(String defaultFont) {
        this.defaultFont = defaultFont;
    }

    @SerializedName("CheckWorkbookDefaultFont")
    @JsonProperty("CheckWorkbookDefaultFont")
    private Boolean checkWorkbookDefaultFont;

    public PaginatedSaveOptions checkWorkbookDefaultFont(Boolean checkWorkbookDefaultFont) {
        this.checkWorkbookDefaultFont = checkWorkbookDefaultFont;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getCheckWorkbookDefaultFont() {
        return checkWorkbookDefaultFont;
    }

    public void setCheckWorkbookDefaultFont(Boolean checkWorkbookDefaultFont) {
        this.checkWorkbookDefaultFont = checkWorkbookDefaultFont;
    }

    @SerializedName("CheckFontCompatibility")
    @JsonProperty("CheckFontCompatibility")
    private Boolean checkFontCompatibility;

    public PaginatedSaveOptions checkFontCompatibility(Boolean checkFontCompatibility) {
        this.checkFontCompatibility = checkFontCompatibility;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getCheckFontCompatibility() {
        return checkFontCompatibility;
    }

    public void setCheckFontCompatibility(Boolean checkFontCompatibility) {
        this.checkFontCompatibility = checkFontCompatibility;
    }

    @SerializedName("IsFontSubstitutionCharGranularity")
    @JsonProperty("IsFontSubstitutionCharGranularity")
    private Boolean isFontSubstitutionCharGranularity;

    public PaginatedSaveOptions isFontSubstitutionCharGranularity(Boolean isFontSubstitutionCharGranularity) {
        this.isFontSubstitutionCharGranularity = isFontSubstitutionCharGranularity;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsFontSubstitutionCharGranularity() {
        return isFontSubstitutionCharGranularity;
    }

    public void setIsFontSubstitutionCharGranularity(Boolean isFontSubstitutionCharGranularity) {
        this.isFontSubstitutionCharGranularity = isFontSubstitutionCharGranularity;
    }

    @SerializedName("OnePagePerSheet")
    @JsonProperty("OnePagePerSheet")
    private Boolean onePagePerSheet;

    public PaginatedSaveOptions onePagePerSheet(Boolean onePagePerSheet) {
        this.onePagePerSheet = onePagePerSheet;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getOnePagePerSheet() {
        return onePagePerSheet;
    }

    public void setOnePagePerSheet(Boolean onePagePerSheet) {
        this.onePagePerSheet = onePagePerSheet;
    }

    @SerializedName("AllColumnsInOnePagePerSheet")
    @JsonProperty("AllColumnsInOnePagePerSheet")
    private Boolean allColumnsInOnePagePerSheet;

    public PaginatedSaveOptions allColumnsInOnePagePerSheet(Boolean allColumnsInOnePagePerSheet) {
        this.allColumnsInOnePagePerSheet = allColumnsInOnePagePerSheet;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAllColumnsInOnePagePerSheet() {
        return allColumnsInOnePagePerSheet;
    }

    public void setAllColumnsInOnePagePerSheet(Boolean allColumnsInOnePagePerSheet) {
        this.allColumnsInOnePagePerSheet = allColumnsInOnePagePerSheet;
    }

    @SerializedName("IgnoreError")
    @JsonProperty("IgnoreError")
    private Boolean ignoreError;

    public PaginatedSaveOptions ignoreError(Boolean ignoreError) {
        this.ignoreError = ignoreError;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIgnoreError() {
        return ignoreError;
    }

    public void setIgnoreError(Boolean ignoreError) {
        this.ignoreError = ignoreError;
    }

    @SerializedName("OutputBlankPageWhenNothingToPrint")
    @JsonProperty("OutputBlankPageWhenNothingToPrint")
    private Boolean outputBlankPageWhenNothingToPrint;

    public PaginatedSaveOptions outputBlankPageWhenNothingToPrint(Boolean outputBlankPageWhenNothingToPrint) {
        this.outputBlankPageWhenNothingToPrint = outputBlankPageWhenNothingToPrint;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getOutputBlankPageWhenNothingToPrint() {
        return outputBlankPageWhenNothingToPrint;
    }

    public void setOutputBlankPageWhenNothingToPrint(Boolean outputBlankPageWhenNothingToPrint) {
        this.outputBlankPageWhenNothingToPrint = outputBlankPageWhenNothingToPrint;
    }

    @SerializedName("PageIndex")
    @JsonProperty("PageIndex")
    private Integer pageIndex;

    public PaginatedSaveOptions pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    @SerializedName("PageCount")
    @JsonProperty("PageCount")
    private Integer pageCount;

    public PaginatedSaveOptions pageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    @SerializedName("PrintingPageType")
    @JsonProperty("PrintingPageType")
    private String printingPageType;

    public PaginatedSaveOptions printingPageType(String printingPageType) {
        this.printingPageType = printingPageType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPrintingPageType() {
        return printingPageType;
    }

    public void setPrintingPageType(String printingPageType) {
        this.printingPageType = printingPageType;
    }

    @SerializedName("GridlineType")
    @JsonProperty("GridlineType")
    private String gridlineType;

    public PaginatedSaveOptions gridlineType(String gridlineType) {
        this.gridlineType = gridlineType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getGridlineType() {
        return gridlineType;
    }

    public void setGridlineType(String gridlineType) {
        this.gridlineType = gridlineType;
    }

    @SerializedName("TextCrossType")
    @JsonProperty("TextCrossType")
    private String textCrossType;

    public PaginatedSaveOptions textCrossType(String textCrossType) {
        this.textCrossType = textCrossType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTextCrossType() {
        return textCrossType;
    }

    public void setTextCrossType(String textCrossType) {
        this.textCrossType = textCrossType;
    }

    @SerializedName("DefaultEditLanguage")
    @JsonProperty("DefaultEditLanguage")
    private String defaultEditLanguage;

    public PaginatedSaveOptions defaultEditLanguage(String defaultEditLanguage) {
        this.defaultEditLanguage = defaultEditLanguage;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDefaultEditLanguage() {
        return defaultEditLanguage;
    }

    public void setDefaultEditLanguage(String defaultEditLanguage) {
        this.defaultEditLanguage = defaultEditLanguage;
    }

    @SerializedName("EmfRenderSetting")
    @JsonProperty("EmfRenderSetting")
    private String emfRenderSetting;

    public PaginatedSaveOptions emfRenderSetting(String emfRenderSetting) {
        this.emfRenderSetting = emfRenderSetting;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getEmfRenderSetting() {
        return emfRenderSetting;
    }

    public void setEmfRenderSetting(String emfRenderSetting) {
        this.emfRenderSetting = emfRenderSetting;
    }

    @SerializedName("MergeAreas")
    @JsonProperty("MergeAreas")
    private Boolean mergeAreas;

    public PaginatedSaveOptions mergeAreas(Boolean mergeAreas) {
        this.mergeAreas = mergeAreas;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getMergeAreas() {
        return mergeAreas;
    }

    public void setMergeAreas(Boolean mergeAreas) {
        this.mergeAreas = mergeAreas;
    }

    @SerializedName("SortExternalNames")
    @JsonProperty("SortExternalNames")
    private Boolean sortExternalNames;

    public PaginatedSaveOptions sortExternalNames(Boolean sortExternalNames) {
        this.sortExternalNames = sortExternalNames;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getSortExternalNames() {
        return sortExternalNames;
    }

    public void setSortExternalNames(Boolean sortExternalNames) {
        this.sortExternalNames = sortExternalNames;
    }

    @SerializedName("UpdateSmartArt")
    @JsonProperty("UpdateSmartArt")
    private Boolean updateSmartArt;

    public PaginatedSaveOptions updateSmartArt(Boolean updateSmartArt) {
        this.updateSmartArt = updateSmartArt;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getUpdateSmartArt() {
        return updateSmartArt;
    }

    public void setUpdateSmartArt(Boolean updateSmartArt) {
        this.updateSmartArt = updateSmartArt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        PaginatedSaveOptions other = (PaginatedSaveOptions) o;
        return Objects.equals(this.defaultFont, other.defaultFont)
            && Objects.equals(this.checkWorkbookDefaultFont, other.checkWorkbookDefaultFont)
            && Objects.equals(this.checkFontCompatibility, other.checkFontCompatibility)
            && Objects.equals(this.isFontSubstitutionCharGranularity, other.isFontSubstitutionCharGranularity)
            && Objects.equals(this.onePagePerSheet, other.onePagePerSheet)
            && Objects.equals(this.allColumnsInOnePagePerSheet, other.allColumnsInOnePagePerSheet)
            && Objects.equals(this.ignoreError, other.ignoreError)
            && Objects.equals(this.outputBlankPageWhenNothingToPrint, other.outputBlankPageWhenNothingToPrint)
            && Objects.equals(this.pageIndex, other.pageIndex)
            && Objects.equals(this.pageCount, other.pageCount)
            && Objects.equals(this.printingPageType, other.printingPageType)
            && Objects.equals(this.gridlineType, other.gridlineType)
            && Objects.equals(this.textCrossType, other.textCrossType)
            && Objects.equals(this.defaultEditLanguage, other.defaultEditLanguage)
            && Objects.equals(this.emfRenderSetting, other.emfRenderSetting)
            && Objects.equals(this.mergeAreas, other.mergeAreas)
            && Objects.equals(this.sortExternalNames, other.sortExternalNames)
            && Objects.equals(this.updateSmartArt, other.updateSmartArt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultFont, checkWorkbookDefaultFont, checkFontCompatibility, isFontSubstitutionCharGranularity, onePagePerSheet, allColumnsInOnePagePerSheet, ignoreError, outputBlankPageWhenNothingToPrint, pageIndex, pageCount, printingPageType, gridlineType, textCrossType, defaultEditLanguage, emfRenderSetting, mergeAreas, sortExternalNames, updateSmartArt, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaginatedSaveOptions {\n");
        sb.append("    defaultFont: ").append(defaultFont).append("\n");
        sb.append("    checkWorkbookDefaultFont: ").append(checkWorkbookDefaultFont).append("\n");
        sb.append("    checkFontCompatibility: ").append(checkFontCompatibility).append("\n");
        sb.append("    isFontSubstitutionCharGranularity: ").append(isFontSubstitutionCharGranularity).append("\n");
        sb.append("    onePagePerSheet: ").append(onePagePerSheet).append("\n");
        sb.append("    allColumnsInOnePagePerSheet: ").append(allColumnsInOnePagePerSheet).append("\n");
        sb.append("    ignoreError: ").append(ignoreError).append("\n");
        sb.append("    outputBlankPageWhenNothingToPrint: ").append(outputBlankPageWhenNothingToPrint).append("\n");
        sb.append("    pageIndex: ").append(pageIndex).append("\n");
        sb.append("    pageCount: ").append(pageCount).append("\n");
        sb.append("    printingPageType: ").append(printingPageType).append("\n");
        sb.append("    gridlineType: ").append(gridlineType).append("\n");
        sb.append("    textCrossType: ").append(textCrossType).append("\n");
        sb.append("    defaultEditLanguage: ").append(defaultEditLanguage).append("\n");
        sb.append("    emfRenderSetting: ").append(emfRenderSetting).append("\n");
        sb.append("    mergeAreas: ").append(mergeAreas).append("\n");
        sb.append("    sortExternalNames: ").append(sortExternalNames).append("\n");
        sb.append("    updateSmartArt: ").append(updateSmartArt).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
