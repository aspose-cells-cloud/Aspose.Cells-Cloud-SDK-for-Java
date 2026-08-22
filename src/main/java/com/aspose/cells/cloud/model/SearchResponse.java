package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** SearchResponse model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchResponse extends CellsCloudResponse {
    /** Gets or sets TextItems. */
    @JsonProperty("TextItems")
    private List<TextItem> textItems;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public List<TextItem> getTextItems() { return textItems; }
    public SearchResponse setTextItems(List<TextItem> textItems) { this.textItems = textItems; return this; }

    public Integer getCode() { return code; }
    public SearchResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public SearchResponse setStatus(String status) { this.status = status; return this; }

}
