package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TextItemsResponse — Represents the TextItems Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextItemsResponse extends CellsCloudResponse {
    /** This property allows access to a collection of TextItems. */
    @JsonProperty("TextItems")
    private TextItems textItems;

    public TextItems getTextItems() { return textItems; }
    public TextItemsResponse setTextItems(TextItems textItems) { this.textItems = textItems; return this; }


    /** Covariant override: keeps fluent chains returning TextItemsResponse. */
    @Override public TextItemsResponse setCode(Integer code) { return (TextItemsResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning TextItemsResponse. */
    @Override public TextItemsResponse setStatus(String status) { return (TextItemsResponse) super.setStatus(status); }

}
