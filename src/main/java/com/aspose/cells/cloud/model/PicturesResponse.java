package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PicturesResponse — Represents the Pictures Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PicturesResponse extends CellsCloudResponse {
    /** This class has a property called "Pictures" with the feature of being serialized as "pictures" in XML elements. */
    @JsonProperty("Pictures")
    private Pictures pictures;

    public Pictures getPictures() { return pictures; }
    public PicturesResponse setPictures(Pictures pictures) { this.pictures = pictures; return this; }


    /** Covariant override: keeps fluent chains returning PicturesResponse. */
    @Override public PicturesResponse setCode(Integer code) { return (PicturesResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning PicturesResponse. */
    @Override public PicturesResponse setStatus(String status) { return (PicturesResponse) super.setStatus(status); }

}
