package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ListObjectOperateParameter — Represents list object operate parameter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListObjectOperateParameter extends OperateParameter {
    /** Represents list object of operate object. */
    @JsonProperty("ListObject")
    private ListObject listObject;

    public ListObject getListObject() { return listObject; }
    public ListObjectOperateParameter setListObject(ListObject listObject) { this.listObject = listObject; return this; }


    /** Covariant override: keeps fluent chains returning ListObjectOperateParameter. */
    @Override public ListObjectOperateParameter setOperateType(String operateType) { return (ListObjectOperateParameter) super.setOperateType(operateType); }

}
