package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** FindResponse — Represents the Find Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FindResponse extends CellsCloudResponse {
    /** Property Summary: This property is annotated with the XML element name "count" and represents an integer value. */
    @JsonProperty("Count")
    private Integer count;

    /** Gets or sets TextItems. */
    @JsonProperty("TextItems")
    private TextItems textItems;

    public Integer getCount() { return count; }
    public FindResponse setCount(Integer count) { this.count = count; return this; }

    public TextItems getTextItems() { return textItems; }
    public FindResponse setTextItems(TextItems textItems) { this.textItems = textItems; return this; }


    /** Covariant override: keeps fluent chains returning FindResponse. */
    @Override public FindResponse setCode(Integer code) { return (FindResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning FindResponse. */
    @Override public FindResponse setStatus(String status) { return (FindResponse) super.setStatus(status); }

}
