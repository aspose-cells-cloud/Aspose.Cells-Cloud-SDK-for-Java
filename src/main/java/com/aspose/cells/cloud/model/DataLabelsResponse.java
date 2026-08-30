package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DataLabelsResponse — Represents the DataLabels Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataLabelsResponse extends CellsCloudResponse {
    /** This class has a property named DataLabels of type DataLabels that can be accessed and modified. */
    @JsonProperty("DataLabels")
    private DataLabels dataLabels;

    public DataLabels getDataLabels() { return dataLabels; }
    public DataLabelsResponse setDataLabels(DataLabels dataLabels) { this.dataLabels = dataLabels; return this; }


    /** Covariant override: keeps fluent chains returning DataLabelsResponse. */
    @Override public DataLabelsResponse setCode(Integer code) { return (DataLabelsResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning DataLabelsResponse. */
    @Override public DataLabelsResponse setStatus(String status) { return (DataLabelsResponse) super.setStatus(status); }

}
