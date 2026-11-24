/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="BatchProtectRequest.java">
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

public class BatchProtectRequest {

    @SerializedName("SourceFolder")
    @JsonProperty("SourceFolder")
    private String sourceFolder;

    public BatchProtectRequest sourceFolder(String sourceFolder) {
        this.sourceFolder = sourceFolder;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSourceFolder() {
        return sourceFolder;
    }

    public void setSourceFolder(String sourceFolder) {
        this.sourceFolder = sourceFolder;
    }

    @SerializedName("SourceStorage")
    @JsonProperty("SourceStorage")
    private String sourceStorage;

    public BatchProtectRequest sourceStorage(String sourceStorage) {
        this.sourceStorage = sourceStorage;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSourceStorage() {
        return sourceStorage;
    }

    public void setSourceStorage(String sourceStorage) {
        this.sourceStorage = sourceStorage;
    }

    @SerializedName("MatchCondition")
    @JsonProperty("MatchCondition")
    private MatchConditionRequest matchCondition;

    public BatchProtectRequest matchCondition(MatchConditionRequest matchCondition) {
        this.matchCondition = matchCondition;
        return this;
    }

    @ApiModelProperty(value = "")
    public MatchConditionRequest getMatchCondition() {
        return matchCondition;
    }

    public void setMatchCondition(MatchConditionRequest matchCondition) {
        this.matchCondition = matchCondition;
    }

    @SerializedName("ProtectionType")
    @JsonProperty("ProtectionType")
    private String protectionType;

    public BatchProtectRequest protectionType(String protectionType) {
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

    @SerializedName("Password")
    @JsonProperty("Password")
    private String password;

    public BatchProtectRequest password(String password) {
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

    @SerializedName("OutFolder")
    @JsonProperty("OutFolder")
    private String outFolder;

    public BatchProtectRequest outFolder(String outFolder) {
        this.outFolder = outFolder;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getOutFolder() {
        return outFolder;
    }

    public void setOutFolder(String outFolder) {
        this.outFolder = outFolder;
    }

    @SerializedName("OutStorage")
    @JsonProperty("OutStorage")
    private String outStorage;

    public BatchProtectRequest outStorage(String outStorage) {
        this.outStorage = outStorage;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getOutStorage() {
        return outStorage;
    }

    public void setOutStorage(String outStorage) {
        this.outStorage = outStorage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchProtectRequest other = (BatchProtectRequest) o;
        return Objects.equals(this.sourceFolder, other.sourceFolder)
            && Objects.equals(this.sourceStorage, other.sourceStorage)
            && Objects.equals(this.matchCondition, other.matchCondition)
            && Objects.equals(this.protectionType, other.protectionType)
            && Objects.equals(this.password, other.password)
            && Objects.equals(this.outFolder, other.outFolder)
            && Objects.equals(this.outStorage, other.outStorage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceFolder, sourceStorage, matchCondition, protectionType, password, outFolder, outStorage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchProtectRequest {\n");
        sb.append("    sourceFolder: ").append(sourceFolder).append("\n");
        sb.append("    sourceStorage: ").append(sourceStorage).append("\n");
        sb.append("    matchCondition: ").append(matchCondition).append("\n");
        sb.append("    protectionType: ").append(protectionType).append("\n");
        sb.append("    password: ").append(password).append("\n");
        sb.append("    outFolder: ").append(outFolder).append("\n");
        sb.append("    outStorage: ").append(outStorage).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
