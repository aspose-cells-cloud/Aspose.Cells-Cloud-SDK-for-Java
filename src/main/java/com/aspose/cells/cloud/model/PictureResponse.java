package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PictureResponse — Represents the Picture Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PictureResponse extends CellsCloudResponse {
    /** Property Summary: This class has a public property named "Picture" of type "Picture" that has both getter and setter methods. */
    @JsonProperty("Picture")
    private Picture picture;

    public Picture getPicture() { return picture; }
    public PictureResponse setPicture(Picture picture) { this.picture = picture; return this; }


    /** Covariant override: keeps fluent chains returning PictureResponse. */
    @Override public PictureResponse setCode(Integer code) { return (PictureResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning PictureResponse. */
    @Override public PictureResponse setStatus(String status) { return (PictureResponse) super.setStatus(status); }

}
