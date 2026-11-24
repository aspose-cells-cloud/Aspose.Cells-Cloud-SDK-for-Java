/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="XpsSaveOptions.java">
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

public class XpsSaveOptions extends PaginatedSaveOptions {

    @SerializedName("SaveFormat")
    @JsonProperty("SaveFormat")
    private String saveFormat;

    public XpsSaveOptions saveFormat(String saveFormat) {
        this.saveFormat = saveFormat;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSaveFormat() {
        return saveFormat;
    }

    public void setSaveFormat(String saveFormat) {
        this.saveFormat = saveFormat;
    }

    @SerializedName("CachedFileFolder")
    @JsonProperty("CachedFileFolder")
    private String cachedFileFolder;

    public XpsSaveOptions cachedFileFolder(String cachedFileFolder) {
        this.cachedFileFolder = cachedFileFolder;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getCachedFileFolder() {
        return cachedFileFolder;
    }

    public void setCachedFileFolder(String cachedFileFolder) {
        this.cachedFileFolder = cachedFileFolder;
    }

    @SerializedName("ClearData")
    @JsonProperty("ClearData")
    private Boolean clearData;

    public XpsSaveOptions clearData(Boolean clearData) {
        this.clearData = clearData;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getClearData() {
        return clearData;
    }

    public void setClearData(Boolean clearData) {
        this.clearData = clearData;
    }

    @SerializedName("CreateDirectory")
    @JsonProperty("CreateDirectory")
    private Boolean createDirectory;

    public XpsSaveOptions createDirectory(Boolean createDirectory) {
        this.createDirectory = createDirectory;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getCreateDirectory() {
        return createDirectory;
    }

    public void setCreateDirectory(Boolean createDirectory) {
        this.createDirectory = createDirectory;
    }

    @SerializedName("EnableHTTPCompression")
    @JsonProperty("EnableHTTPCompression")
    private Boolean enableHTTPCompression;

    public XpsSaveOptions enableHTTPCompression(Boolean enableHTTPCompression) {
        this.enableHTTPCompression = enableHTTPCompression;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getEnableHTTPCompression() {
        return enableHTTPCompression;
    }

    public void setEnableHTTPCompression(Boolean enableHTTPCompression) {
        this.enableHTTPCompression = enableHTTPCompression;
    }

    @SerializedName("RefreshChartCache")
    @JsonProperty("RefreshChartCache")
    private Boolean refreshChartCache;

    public XpsSaveOptions refreshChartCache(Boolean refreshChartCache) {
        this.refreshChartCache = refreshChartCache;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getRefreshChartCache() {
        return refreshChartCache;
    }

    public void setRefreshChartCache(Boolean refreshChartCache) {
        this.refreshChartCache = refreshChartCache;
    }

    @SerializedName("SortNames")
    @JsonProperty("SortNames")
    private Boolean sortNames;

    public XpsSaveOptions sortNames(Boolean sortNames) {
        this.sortNames = sortNames;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getSortNames() {
        return sortNames;
    }

    public void setSortNames(Boolean sortNames) {
        this.sortNames = sortNames;
    }

    @SerializedName("ValidateMergedAreas")
    @JsonProperty("ValidateMergedAreas")
    private Boolean validateMergedAreas;

    public XpsSaveOptions validateMergedAreas(Boolean validateMergedAreas) {
        this.validateMergedAreas = validateMergedAreas;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getValidateMergedAreas() {
        return validateMergedAreas;
    }

    public void setValidateMergedAreas(Boolean validateMergedAreas) {
        this.validateMergedAreas = validateMergedAreas;
    }

    @SerializedName("CheckExcelRestriction")
    @JsonProperty("CheckExcelRestriction")
    private Boolean checkExcelRestriction;

    public XpsSaveOptions checkExcelRestriction(Boolean checkExcelRestriction) {
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

    @SerializedName("EncryptDocumentProperties")
    @JsonProperty("EncryptDocumentProperties")
    private Boolean encryptDocumentProperties;

    public XpsSaveOptions encryptDocumentProperties(Boolean encryptDocumentProperties) {
        this.encryptDocumentProperties = encryptDocumentProperties;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getEncryptDocumentProperties() {
        return encryptDocumentProperties;
    }

    public void setEncryptDocumentProperties(Boolean encryptDocumentProperties) {
        this.encryptDocumentProperties = encryptDocumentProperties;
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
        XpsSaveOptions other = (XpsSaveOptions) o;
        return Objects.equals(this.saveFormat, other.saveFormat)
            && Objects.equals(this.cachedFileFolder, other.cachedFileFolder)
            && Objects.equals(this.clearData, other.clearData)
            && Objects.equals(this.createDirectory, other.createDirectory)
            && Objects.equals(this.enableHTTPCompression, other.enableHTTPCompression)
            && Objects.equals(this.refreshChartCache, other.refreshChartCache)
            && Objects.equals(this.sortNames, other.sortNames)
            && Objects.equals(this.validateMergedAreas, other.validateMergedAreas)
            && Objects.equals(this.checkExcelRestriction, other.checkExcelRestriction)
            && Objects.equals(this.encryptDocumentProperties, other.encryptDocumentProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saveFormat, cachedFileFolder, clearData, createDirectory, enableHTTPCompression, refreshChartCache, sortNames, validateMergedAreas, checkExcelRestriction, encryptDocumentProperties, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class XpsSaveOptions {\n");
        sb.append("    saveFormat: ").append(saveFormat).append("\n");
        sb.append("    cachedFileFolder: ").append(cachedFileFolder).append("\n");
        sb.append("    clearData: ").append(clearData).append("\n");
        sb.append("    createDirectory: ").append(createDirectory).append("\n");
        sb.append("    enableHTTPCompression: ").append(enableHTTPCompression).append("\n");
        sb.append("    refreshChartCache: ").append(refreshChartCache).append("\n");
        sb.append("    sortNames: ").append(sortNames).append("\n");
        sb.append("    validateMergedAreas: ").append(validateMergedAreas).append("\n");
        sb.append("    checkExcelRestriction: ").append(checkExcelRestriction).append("\n");
        sb.append("    encryptDocumentProperties: ").append(encryptDocumentProperties).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
