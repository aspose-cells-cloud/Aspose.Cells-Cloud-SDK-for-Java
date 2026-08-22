package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** IconSet — Describe the IconSet conditional formatting rule. This conditional formatting rule applies icons to cells according to their values. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IconSet {
    /** Get the from the collection */
    @JsonProperty("CfIcons")
    private List<ConditionalFormattingIcon> cfIcons;

    /** Get the CFValueObjects instance. */
    @JsonProperty("Cfvos")
    private List<ConditionalFormattingValue> cfvos;

    /** Indicates whether the icon set is custom. Default value is false. */
    @JsonProperty("IsCustom")
    private Boolean isCustom;

    /** Get or set the flag indicating whether to reverses the default order of the icons in this icon set. Default value is false. */
    @JsonProperty("Reverse")
    private Boolean reverse;

    /** Get or set the flag indicating whether to show the values of the cells on which this icon set is applied. Default value is true. */
    @JsonProperty("ShowValue")
    private Boolean showValue;

    /** Get or Set the icon set type to display.  Setting the type will auto check if the current Cfvos's count is accord with the new type. If not accord, old Cfvos will be cleaned and default Cfvos will be added. */
    @JsonProperty("IconSetType")
    private String iconSetType;

    public List<ConditionalFormattingIcon> getCfIcons() { return cfIcons; }
    public IconSet setCfIcons(List<ConditionalFormattingIcon> cfIcons) { this.cfIcons = cfIcons; return this; }

    public List<ConditionalFormattingValue> getCfvos() { return cfvos; }
    public IconSet setCfvos(List<ConditionalFormattingValue> cfvos) { this.cfvos = cfvos; return this; }

    public Boolean getIsCustom() { return isCustom; }
    public IconSet setIsCustom(Boolean isCustom) { this.isCustom = isCustom; return this; }

    public Boolean getReverse() { return reverse; }
    public IconSet setReverse(Boolean reverse) { this.reverse = reverse; return this; }

    public Boolean getShowValue() { return showValue; }
    public IconSet setShowValue(Boolean showValue) { this.showValue = showValue; return this; }

    public String getIconSetType() { return iconSetType; }
    public IconSet setIconSetType(String iconSetType) { this.iconSetType = iconSetType; return this; }

}
