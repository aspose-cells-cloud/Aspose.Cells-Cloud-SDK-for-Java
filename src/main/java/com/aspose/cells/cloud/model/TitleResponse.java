package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TitleResponse — Represents the Title Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TitleResponse extends CellsCloudResponse {
    /** This class has a property called "Title" of type "Title" with both a getter and a setter. */
    @JsonProperty("Title")
    private Title title;

    public Title getTitle() { return title; }
    public TitleResponse setTitle(Title title) { this.title = title; return this; }


    /** Covariant override: keeps fluent chains returning TitleResponse. */
    @Override public TitleResponse setCode(Integer code) { return (TitleResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning TitleResponse. */
    @Override public TitleResponse setStatus(String status) { return (TitleResponse) super.setStatus(status); }

}
