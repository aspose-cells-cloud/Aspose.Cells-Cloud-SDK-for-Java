package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** MergedCell — I'm happy to help! Could you please provide me with the features you would like me to summarize for the class? */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MergedCell extends LinkElement {
    /** An integer property named "EndColumn" with the XML element name "endcolumn". */
    @JsonProperty("EndColumn")
    private Integer endColumn;

    /** Gets or sets EndRow. */
    @JsonProperty("EndRow")
    private Integer endRow;

    /** Gets or sets StartColumn. */
    @JsonProperty("StartColumn")
    private Integer startColumn;

    /** Gets or sets StartRow. */
    @JsonProperty("StartRow")
    private Integer startRow;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Integer getEndColumn() { return endColumn; }
    public MergedCell setEndColumn(Integer endColumn) { this.endColumn = endColumn; return this; }

    public Integer getEndRow() { return endRow; }
    public MergedCell setEndRow(Integer endRow) { this.endRow = endRow; return this; }

    public Integer getStartColumn() { return startColumn; }
    public MergedCell setStartColumn(Integer startColumn) { this.startColumn = startColumn; return this; }

    public Integer getStartRow() { return startRow; }
    public MergedCell setStartRow(Integer startRow) { this.startRow = startRow; return this; }

    public Link getLink() { return link; }
    public MergedCell setLink(Link link) { this.link = link; return this; }

}
