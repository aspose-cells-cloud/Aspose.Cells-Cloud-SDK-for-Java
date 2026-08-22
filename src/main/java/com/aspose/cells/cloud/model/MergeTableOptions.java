package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** MergeTableOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MergeTableOptions {
    /** Gets or sets MainTable. */
    @JsonProperty("MainTable")
    private CombinationSourceData mainTable;

    /** Gets or sets SecondaryTable. */
    @JsonProperty("SecondaryTable")
    private CombinationSourceData secondaryTable;

    /** Gets or sets DataMergeType. */
    @JsonProperty("DataMergeType")
    private String dataMergeType;

    /** Gets or sets OverwriteMainTable. */
    @JsonProperty("OverwriteMainTable")
    private Boolean overwriteMainTable;

    /** Gets or sets SyncDataToTargetWorkbook. */
    @JsonProperty("SyncDataToTargetWorkbook")
    private Boolean syncDataToTargetWorkbook;

    /** Gets or sets MergedDataToPosition. */
    @JsonProperty("MergedDataToPosition")
    private DataOutputLocation mergedDataToPosition;

    public CombinationSourceData getMainTable() { return mainTable; }
    public MergeTableOptions setMainTable(CombinationSourceData mainTable) { this.mainTable = mainTable; return this; }

    public CombinationSourceData getSecondaryTable() { return secondaryTable; }
    public MergeTableOptions setSecondaryTable(CombinationSourceData secondaryTable) { this.secondaryTable = secondaryTable; return this; }

    public String getDataMergeType() { return dataMergeType; }
    public MergeTableOptions setDataMergeType(String dataMergeType) { this.dataMergeType = dataMergeType; return this; }

    public Boolean getOverwriteMainTable() { return overwriteMainTable; }
    public MergeTableOptions setOverwriteMainTable(Boolean overwriteMainTable) { this.overwriteMainTable = overwriteMainTable; return this; }

    public Boolean getSyncDataToTargetWorkbook() { return syncDataToTargetWorkbook; }
    public MergeTableOptions setSyncDataToTargetWorkbook(Boolean syncDataToTargetWorkbook) { this.syncDataToTargetWorkbook = syncDataToTargetWorkbook; return this; }

    public DataOutputLocation getMergedDataToPosition() { return mergedDataToPosition; }
    public MergeTableOptions setMergedDataToPosition(DataOutputLocation mergedDataToPosition) { this.mergedDataToPosition = mergedDataToPosition; return this; }

}
