package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** PivotTableFieldRequest — Indicates pivot table field request */
public class PivotTableFieldRequest {
    /** Intdex array. */
    @JsonProperty("Data")
    private List<Integer> data;

    public List<Integer> getData() { return data; }
    public PivotTableFieldRequest setData(List<Integer> data) { this.data = data; return this; }

}