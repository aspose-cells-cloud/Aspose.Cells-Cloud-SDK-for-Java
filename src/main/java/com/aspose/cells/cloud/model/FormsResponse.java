package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** FormsResponse — Represents the Forms Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormsResponse extends CellsCloudResponse {
    /** This class has a property named Forms of type Forms that has both a getter and setter. */
    @JsonProperty("Forms")
    private Forms forms;

    public Forms getForms() { return forms; }
    public FormsResponse setForms(Forms forms) { this.forms = forms; return this; }


    /** Covariant override: keeps fluent chains returning FormsResponse. */
    @Override public FormsResponse setCode(Integer code) { return (FormsResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning FormsResponse. */
    @Override public FormsResponse setStatus(String status) { return (FormsResponse) super.setStatus(status); }

}
