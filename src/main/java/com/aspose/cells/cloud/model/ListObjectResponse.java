package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ListObjectResponse — Represents the ListObject Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListObjectResponse extends CellsCloudResponse {
    /** A property that represents a list object within the Tables class. */
    @JsonProperty("ListObject")
    private ListObject listObject;

    public ListObject getListObject() { return listObject; }
    public ListObjectResponse setListObject(ListObject listObject) { this.listObject = listObject; return this; }


    /** Covariant override: keeps fluent chains returning ListObjectResponse. */
    @Override public ListObjectResponse setCode(Integer code) { return (ListObjectResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning ListObjectResponse. */
    @Override public ListObjectResponse setStatus(String status) { return (ListObjectResponse) super.setStatus(status); }

}
