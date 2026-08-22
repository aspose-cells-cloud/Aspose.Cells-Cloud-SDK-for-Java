package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PicturesResponse — Represents the Pictures Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PicturesResponse extends CellsCloudResponse {
    /** This class has a property called "Pictures" with the feature of being serialized as "pictures" in XML elements. */
    @JsonProperty("Pictures")
    private Pictures pictures;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Pictures getPictures() { return pictures; }
    public PicturesResponse setPictures(Pictures pictures) { this.pictures = pictures; return this; }

    public Integer getCode() { return code; }
    public PicturesResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public PicturesResponse setStatus(String status) { this.status = status; return this; }

}
