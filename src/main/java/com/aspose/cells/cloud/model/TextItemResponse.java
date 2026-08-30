package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TextItemResponse — Represents the TextItem Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextItemResponse extends CellsCloudResponse {
    /** The class has a property that allows getting and setting a TextItem object. */
    @JsonProperty("TextItem")
    private TextItem textItem;

    public TextItem getTextItem() { return textItem; }
    public TextItemResponse setTextItem(TextItem textItem) { this.textItem = textItem; return this; }


    /** Covariant override: keeps fluent chains returning TextItemResponse. */
    @Override public TextItemResponse setCode(Integer code) { return (TextItemResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning TextItemResponse. */
    @Override public TextItemResponse setStatus(String status) { return (TextItemResponse) super.setStatus(status); }

}
