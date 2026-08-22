package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ListObjectsResponse — Represents the ListObjects Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListObjectsResponse extends CellsCloudResponse {
    /** A property named "ListObjects" of type "Tables.ListObjects" that can be both accessed and modified. */
    @JsonProperty("ListObjects")
    private ListObjects listObjects;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public ListObjects getListObjects() { return listObjects; }
    public ListObjectsResponse setListObjects(ListObjects listObjects) { this.listObjects = listObjects; return this; }

    public Integer getCode() { return code; }
    public ListObjectsResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public ListObjectsResponse setStatus(String status) { this.status = status; return this; }

}
