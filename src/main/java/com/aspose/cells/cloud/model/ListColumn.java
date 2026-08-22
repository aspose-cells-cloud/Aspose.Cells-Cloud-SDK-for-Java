package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ListColumn — Represents a column in a Table. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListColumn {
    /** Gets and sets the name of the column. */
    @JsonProperty("Name")
    private String name;

    /** Gets the range of this list column. */
    @JsonProperty("Range")
    private Range range;

    /** Gets and sets the type of calculation in the Totals row of the list column. */
    @JsonProperty("TotalsCalculation")
    private String totalsCalculation;

    /** Gets and sets the formula of the list column. */
    @JsonProperty("Formula")
    private String formula;

    /** Gets and sets the display labels of total row. */
    @JsonProperty("TotalsRowLabel")
    private String totalsRowLabel;

    public String getName() { return name; }
    public ListColumn setName(String name) { this.name = name; return this; }

    public Range getRange() { return range; }
    public ListColumn setRange(Range range) { this.range = range; return this; }

    public String getTotalsCalculation() { return totalsCalculation; }
    public ListColumn setTotalsCalculation(String totalsCalculation) { this.totalsCalculation = totalsCalculation; return this; }

    public String getFormula() { return formula; }
    public ListColumn setFormula(String formula) { this.formula = formula; return this; }

    public String getTotalsRowLabel() { return totalsRowLabel; }
    public ListColumn setTotalsRowLabel(String totalsRowLabel) { this.totalsRowLabel = totalsRowLabel; return this; }

}
