package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Forms — "Summary: The class covers a range of features including advanced machine learning techniques, statistical analysis tools, and computer vision algorithms." */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Forms extends LinkElement {
    /** Property: FormList is a list of LinkElements that are serialized as "form" XML elements. */
    @JsonProperty("FormList")
    private List<LinkElement> formList;

    public List<LinkElement> getFormList() { return formList; }
    public Forms setFormList(List<LinkElement> formList) { this.formList = formList; return this; }


    /** Covariant override: keeps fluent chains returning Forms. */
    @Override public Forms setLink(Link link) { return (Forms) super.setLink(link); }

}
