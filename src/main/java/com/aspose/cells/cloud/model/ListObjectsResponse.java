package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ListObjectsResponse — Represents the ListObjects Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListObjectsResponse extends CellsCloudResponse {
    /** A property named "ListObjects" of type "Tables.ListObjects" that can be both accessed and modified. */
    @JsonProperty("ListObjects")
    private ListObjects listObjects;

    public ListObjects getListObjects() { return listObjects; }
    public ListObjectsResponse setListObjects(ListObjects listObjects) { this.listObjects = listObjects; return this; }


    /** Covariant override: keeps fluent chains returning ListObjectsResponse. */
    @Override public ListObjectsResponse setCode(Integer code) { return (ListObjectsResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning ListObjectsResponse. */
    @Override public ListObjectsResponse setStatus(String status) { return (ListObjectsResponse) super.setStatus(status); }

}
