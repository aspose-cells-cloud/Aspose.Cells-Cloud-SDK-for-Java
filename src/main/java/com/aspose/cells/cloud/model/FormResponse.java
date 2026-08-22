package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** FormResponse — Represents the Form Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormResponse extends CellsCloudResponse {
    /** Property summary: A public property named "Form" with both get and set accessors, allowing access to a Form object. */
    @JsonProperty("Form")
    private Form form;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Form getForm() { return form; }
    public FormResponse setForm(Form form) { this.form = form; return this; }

    public Integer getCode() { return code; }
    public FormResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public FormResponse setStatus(String status) { this.status = status; return this; }

}
