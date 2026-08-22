package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** FormsResponse — Represents the Forms Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormsResponse extends CellsCloudResponse {
    /** This class has a property named Forms of type Forms that has both a getter and setter. */
    @JsonProperty("Forms")
    private Forms forms;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Forms getForms() { return forms; }
    public FormsResponse setForms(Forms forms) { this.forms = forms; return this; }

    public Integer getCode() { return code; }
    public FormsResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public FormsResponse setStatus(String status) { this.status = status; return this; }

}
