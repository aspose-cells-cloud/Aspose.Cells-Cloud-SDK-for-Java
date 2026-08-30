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

    public List<TextItem> getTextItems() { return textItems; }
    public SearchResponse setTextItems(List<TextItem> textItems) { this.textItems = textItems; return this; }


    /** Covariant override: keeps fluent chains returning SearchResponse. */
    @Override public SearchResponse setCode(Integer code) { return (SearchResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning SearchResponse. */
    @Override public SearchResponse setStatus(String status) { return (SearchResponse) super.setStatus(status); }

}
