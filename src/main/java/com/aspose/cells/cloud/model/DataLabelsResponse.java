package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DataLabelsResponse — Represents the DataLabels Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataLabelsResponse extends CellsCloudResponse {
    /** This class has a property named DataLabels of type DataLabels that can be accessed and modified. */
    @JsonProperty("DataLabels")
    private DataLabels dataLabels;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public DataLabels getDataLabels() { return dataLabels; }
    public DataLabelsResponse setDataLabels(DataLabels dataLabels) { this.dataLabels = dataLabels; return this; }

    public Integer getCode() { return code; }
    public DataLabelsResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public DataLabelsResponse setStatus(String status) { this.status = status; return this; }

}
