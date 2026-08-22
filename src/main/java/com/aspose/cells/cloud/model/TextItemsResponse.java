package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TextItemsResponse — Represents the TextItems Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextItemsResponse extends CellsCloudResponse {
    /** This property allows access to a collection of TextItems. */
    @JsonProperty("TextItems")
    private TextItems textItems;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public TextItems getTextItems() { return textItems; }
    public TextItemsResponse setTextItems(TextItems textItems) { this.textItems = textItems; return this; }

    public Integer getCode() { return code; }
    public TextItemsResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public TextItemsResponse setStatus(String status) { this.status = status; return this; }

}
