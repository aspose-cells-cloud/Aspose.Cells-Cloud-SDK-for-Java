/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="MergeTableOptions.java">
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

public class MergeTableOptions {

    @SerializedName("MainTable")
    @JsonProperty("MainTable")
    private CombinationSourceData mainTable;

    public MergeTableOptions mainTable(CombinationSourceData mainTable) {
        this.mainTable = mainTable;
        return this;
    }

    @ApiModelProperty(value = "")
    public CombinationSourceData getMainTable() {
        return mainTable;
    }

    public void setMainTable(CombinationSourceData mainTable) {
        this.mainTable = mainTable;
    }

    @SerializedName("SecondaryTable")
    @JsonProperty("SecondaryTable")
    private CombinationSourceData secondaryTable;

    public MergeTableOptions secondaryTable(CombinationSourceData secondaryTable) {
        this.secondaryTable = secondaryTable;
        return this;
    }

    @ApiModelProperty(value = "")
    public CombinationSourceData getSecondaryTable() {
        return secondaryTable;
    }

    public void setSecondaryTable(CombinationSourceData secondaryTable) {
        this.secondaryTable = secondaryTable;
    }

    @SerializedName("DataMergeType")
    @JsonProperty("DataMergeType")
    private String dataMergeType;

    public MergeTableOptions dataMergeType(String dataMergeType) {
        this.dataMergeType = dataMergeType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDataMergeType() {
        return dataMergeType;
    }

    public void setDataMergeType(String dataMergeType) {
        this.dataMergeType = dataMergeType;
    }

    @SerializedName("OverwriteMainTable")
    @JsonProperty("OverwriteMainTable")
    private Boolean overwriteMainTable;

    public MergeTableOptions overwriteMainTable(Boolean overwriteMainTable) {
        this.overwriteMainTable = overwriteMainTable;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getOverwriteMainTable() {
        return overwriteMainTable;
    }

    public void setOverwriteMainTable(Boolean overwriteMainTable) {
        this.overwriteMainTable = overwriteMainTable;
    }

    @SerializedName("SyncDataToTargetWorkbook")
    @JsonProperty("SyncDataToTargetWorkbook")
    private Boolean syncDataToTargetWorkbook;

    public MergeTableOptions syncDataToTargetWorkbook(Boolean syncDataToTargetWorkbook) {
        this.syncDataToTargetWorkbook = syncDataToTargetWorkbook;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getSyncDataToTargetWorkbook() {
        return syncDataToTargetWorkbook;
    }

    public void setSyncDataToTargetWorkbook(Boolean syncDataToTargetWorkbook) {
        this.syncDataToTargetWorkbook = syncDataToTargetWorkbook;
    }

    @SerializedName("MergedDataToPosition")
    @JsonProperty("MergedDataToPosition")
    private DataOutputLocation mergedDataToPosition;

    public MergeTableOptions mergedDataToPosition(DataOutputLocation mergedDataToPosition) {
        this.mergedDataToPosition = mergedDataToPosition;
        return this;
    }

    @ApiModelProperty(value = "")
    public DataOutputLocation getMergedDataToPosition() {
        return mergedDataToPosition;
    }

    public void setMergedDataToPosition(DataOutputLocation mergedDataToPosition) {
        this.mergedDataToPosition = mergedDataToPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MergeTableOptions other = (MergeTableOptions) o;
        return Objects.equals(this.mainTable, other.mainTable)
            && Objects.equals(this.secondaryTable, other.secondaryTable)
            && Objects.equals(this.dataMergeType, other.dataMergeType)
            && Objects.equals(this.overwriteMainTable, other.overwriteMainTable)
            && Objects.equals(this.syncDataToTargetWorkbook, other.syncDataToTargetWorkbook)
            && Objects.equals(this.mergedDataToPosition, other.mergedDataToPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mainTable, secondaryTable, dataMergeType, overwriteMainTable, syncDataToTargetWorkbook, mergedDataToPosition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeTableOptions {\n");
        sb.append("    mainTable: ").append(mainTable).append("\n");
        sb.append("    secondaryTable: ").append(secondaryTable).append("\n");
        sb.append("    dataMergeType: ").append(dataMergeType).append("\n");
        sb.append("    overwriteMainTable: ").append(overwriteMainTable).append("\n");
        sb.append("    syncDataToTargetWorkbook: ").append(syncDataToTargetWorkbook).append("\n");
        sb.append("    mergedDataToPosition: ").append(mergedDataToPosition).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
