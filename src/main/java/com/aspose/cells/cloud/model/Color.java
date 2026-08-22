package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Color model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Color {
    /** Gets or sets A. */
    @JsonProperty("A")
    private Integer a;

    /** Gets or sets R. */
    @JsonProperty("R")
    private Integer r;

    /** Gets or sets G. */
    @JsonProperty("G")
    private Integer g;

    /** Gets or sets B. */
    @JsonProperty("B")
    private Integer b;

    public Integer getA() { return a; }
    public Color setA(Integer a) { this.a = a; return this; }

    public Integer getR() { return r; }
    public Color setR(Integer r) { this.r = r; return this; }

    public Integer getG() { return g; }
    public Color setG(Integer g) { this.g = g; return this; }

    public Integer getB() { return b; }
    public Color setB(Integer b) { this.b = b; return this; }

}
