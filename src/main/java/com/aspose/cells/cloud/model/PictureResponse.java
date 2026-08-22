package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PictureResponse — Represents the Picture Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PictureResponse extends CellsCloudResponse {
    /** Property Summary: This class has a public property named "Picture" of type "Picture" that has both getter and setter methods. */
    @JsonProperty("Picture")
    private Picture picture;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Picture getPicture() { return picture; }
    public PictureResponse setPicture(Picture picture) { this.picture = picture; return this; }

    public Integer getCode() { return code; }
    public PictureResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public PictureResponse setStatus(String status) { this.status = status; return this; }

}
