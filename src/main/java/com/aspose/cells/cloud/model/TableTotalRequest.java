package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TableTotalRequest — Indicates table total request */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TableTotalRequest {
    /** Indicates list column index. */
    @JsonProperty("ListColumnIndex")
    private Integer listColumnIndex;

    /** Indicates totals calculation. */
    @JsonProperty("TotalsCalculation")
    private String totalsCalculation;

    /** Indicates custom formula. */
    @JsonProperty("CustomFormula")
    private String customFormula;

    public Integer getListColumnIndex() { return listColumnIndex; }
    public TableTotalRequest setListColumnIndex(Integer listColumnIndex) { this.listColumnIndex = listColumnIndex; return this; }

    public String getTotalsCalculation() { return totalsCalculation; }
    public TableTotalRequest setTotalsCalculation(String totalsCalculation) { this.totalsCalculation = totalsCalculation; return this; }

    public String getCustomFormula() { return customFormula; }
    public TableTotalRequest setCustomFormula(String customFormula) { this.customFormula = customFormula; return this; }

}
