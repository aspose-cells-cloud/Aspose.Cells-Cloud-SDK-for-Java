package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DiscUsage — Class for disc space information. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DiscUsage {
    /** Application used disc space. */
    @JsonProperty("UsedSize")
    private Long usedSize;

    /** Total disc space. */
    @JsonProperty("TotalSize")
    private Long totalSize;

    public Long getUsedSize() { return usedSize; }
    public DiscUsage setUsedSize(Long usedSize) { this.usedSize = usedSize; return this; }

    public Long getTotalSize() { return totalSize; }
    public DiscUsage setTotalSize(Long totalSize) { this.totalSize = totalSize; return this; }

}
