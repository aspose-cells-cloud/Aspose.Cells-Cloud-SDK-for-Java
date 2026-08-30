package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** FormResponse — Represents the Form Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormResponse extends CellsCloudResponse {
    /** Property summary: A public property named "Form" with both get and set accessors, allowing access to a Form object. */
    @JsonProperty("Form")
    private Form form;

    public Form getForm() { return form; }
    public FormResponse setForm(Form form) { this.form = form; return this; }


    /** Covariant override: keeps fluent chains returning FormResponse. */
    @Override public FormResponse setCode(Integer code) { return (FormResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning FormResponse. */
    @Override public FormResponse setStatus(String status) { return (FormResponse) super.setStatus(status); }

}
