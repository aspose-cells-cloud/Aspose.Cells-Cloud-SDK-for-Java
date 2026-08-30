package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ConditionalFormatting — I'm here to help! Please provide me with the features that need to be summarized. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConditionalFormatting extends LinkElement {
    /** A public property called "sqref" of type string with a getter and a setter is defined in the class. */
    @JsonProperty("sqref")
    private String sqref;

    /** Gets or sets FormatConditions. */
    @JsonProperty("FormatConditions")
    private List<FormatCondition> formatConditions;

    public String getSqref() { return sqref; }
    public ConditionalFormatting setSqref(String sqref) { this.sqref = sqref; return this; }

    public List<FormatCondition> getFormatConditions() { return formatConditions; }
    public ConditionalFormatting setFormatConditions(List<FormatCondition> formatConditions) { this.formatConditions = formatConditions; return this; }


    /** Covariant override: keeps fluent chains returning ConditionalFormatting. */
    @Override public ConditionalFormatting setLink(Link link) { return (ConditionalFormatting) super.setLink(link); }

}
