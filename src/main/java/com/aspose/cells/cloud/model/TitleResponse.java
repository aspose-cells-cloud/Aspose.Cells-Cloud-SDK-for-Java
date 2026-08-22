package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TitleResponse — Represents the Title Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TitleResponse extends CellsCloudResponse {
    /** This class has a property called "Title" of type "Title" with both a getter and a setter. */
    @JsonProperty("Title")
    private Title title;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Title getTitle() { return title; }
    public TitleResponse setTitle(Title title) { this.title = title; return this; }

    public Integer getCode() { return code; }
    public TitleResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public TitleResponse setStatus(String status) { this.status = status; return this; }

}
