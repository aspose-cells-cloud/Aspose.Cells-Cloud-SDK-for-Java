package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ListObjectResponse — Represents the ListObject Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListObjectResponse extends CellsCloudResponse {
    /** A property that represents a list object within the Tables class. */
    @JsonProperty("ListObject")
    private ListObject listObject;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public ListObject getListObject() { return listObject; }
    public ListObjectResponse setListObject(ListObject listObject) { this.listObject = listObject; return this; }

    public Integer getCode() { return code; }
    public ListObjectResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public ListObjectResponse setStatus(String status) { this.status = status; return this; }

}
