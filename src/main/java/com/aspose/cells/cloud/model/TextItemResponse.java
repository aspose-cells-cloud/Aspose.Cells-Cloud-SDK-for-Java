package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TextItemResponse — Represents the TextItem Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextItemResponse extends CellsCloudResponse {
    /** The class has a property that allows getting and setting a TextItem object. */
    @JsonProperty("TextItem")
    private TextItem textItem;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public TextItem getTextItem() { return textItem; }
    public TextItemResponse setTextItem(TextItem textItem) { this.textItem = textItem; return this; }

    public Integer getCode() { return code; }
    public TextItemResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public TextItemResponse setStatus(String status) { this.status = status; return this; }

}
