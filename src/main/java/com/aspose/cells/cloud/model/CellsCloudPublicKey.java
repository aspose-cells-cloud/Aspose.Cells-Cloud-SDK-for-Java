package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CellsCloudPublicKey model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellsCloudPublicKey {
    /** Gets or sets Exponent. */
    @JsonProperty("Exponent")
    private String exponent;

    /** Gets or sets Modulus. */
    @JsonProperty("Modulus")
    private String modulus;

    public String getExponent() { return exponent; }
    public CellsCloudPublicKey setExponent(String exponent) { this.exponent = exponent; return this; }

    public String getModulus() { return modulus; }
    public CellsCloudPublicKey setModulus(String modulus) { this.modulus = modulus; return this; }

}
