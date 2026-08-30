package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ComboBox — Represents the control form ComboBox. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComboBox extends Shape {
    /** Gets or sets the number of list lines displayed in the drop-down portion of a combo box. */
    @JsonProperty("DropDownLines")
    private Integer dropDownLines;

    /** Property Summary: Contains a public string property named "InputRange" with both get and set accessors. */
    @JsonProperty("InputRange")
    private String inputRange;

    /** Gets the selected cell in the input range of the combo box. */
    @JsonProperty("SelectedCell")
    private LinkElement selectedCell;

    /** Gets or sets the index number of the currently selected item in a list box or combo box. Zero-based. */
    @JsonProperty("SelectedIndex")
    private Integer selectedIndex;

    /** Gets the selected value of the combox box. */
    @JsonProperty("SelectedValue")
    private String selectedValue;

    /** Indicates whether the combobox has 3-D shading. */
    @JsonProperty("Shadow")
    private Boolean shadow;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Integer getDropDownLines() { return dropDownLines; }
    public ComboBox setDropDownLines(Integer dropDownLines) { this.dropDownLines = dropDownLines; return this; }

    public String getInputRange() { return inputRange; }
    public ComboBox setInputRange(String inputRange) { this.inputRange = inputRange; return this; }

    public LinkElement getSelectedCell() { return selectedCell; }
    public ComboBox setSelectedCell(LinkElement selectedCell) { this.selectedCell = selectedCell; return this; }

    public Integer getSelectedIndex() { return selectedIndex; }
    public ComboBox setSelectedIndex(Integer selectedIndex) { this.selectedIndex = selectedIndex; return this; }

    public String getSelectedValue() { return selectedValue; }
    public ComboBox setSelectedValue(String selectedValue) { this.selectedValue = selectedValue; return this; }

    public Boolean getShadow() { return shadow; }
    public ComboBox setShadow(Boolean shadow) { this.shadow = shadow; return this; }

    public Link getLink() { return link; }
    public ComboBox setLink(Link link) { this.link = link; return this; }


    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setName(String name) { return (ComboBox) super.setName(name); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setMsoDrawingType(String msoDrawingType) { return (ComboBox) super.setMsoDrawingType(msoDrawingType); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setAutoShapeType(String autoShapeType) { return (ComboBox) super.setAutoShapeType(autoShapeType); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setPlacement(String placement) { return (ComboBox) super.setPlacement(placement); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setUpperLeftRow(Integer upperLeftRow) { return (ComboBox) super.setUpperLeftRow(upperLeftRow); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setTop(Integer top) { return (ComboBox) super.setTop(top); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setUpperLeftColumn(Integer upperLeftColumn) { return (ComboBox) super.setUpperLeftColumn(upperLeftColumn); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setLeft(Integer left) { return (ComboBox) super.setLeft(left); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setLowerRightRow(Integer lowerRightRow) { return (ComboBox) super.setLowerRightRow(lowerRightRow); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setBottom(Integer bottom) { return (ComboBox) super.setBottom(bottom); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setLowerRightColumn(Integer lowerRightColumn) { return (ComboBox) super.setLowerRightColumn(lowerRightColumn); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setRight(Integer right) { return (ComboBox) super.setRight(right); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setWidth(Integer width) { return (ComboBox) super.setWidth(width); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setHeight(Integer height) { return (ComboBox) super.setHeight(height); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setX(Integer x) { return (ComboBox) super.setX(x); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setY(Integer y) { return (ComboBox) super.setY(y); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setRotationAngle(Double rotationAngle) { return (ComboBox) super.setRotationAngle(rotationAngle); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setHtmlText(String htmlText) { return (ComboBox) super.setHtmlText(htmlText); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setText(String text) { return (ComboBox) super.setText(text); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setAlternativeText(String alternativeText) { return (ComboBox) super.setAlternativeText(alternativeText); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setTextHorizontalAlignment(String textHorizontalAlignment) { return (ComboBox) super.setTextHorizontalAlignment(textHorizontalAlignment); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setTextHorizontalOverflow(String textHorizontalOverflow) { return (ComboBox) super.setTextHorizontalOverflow(textHorizontalOverflow); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setTextOrientationType(String textOrientationType) { return (ComboBox) super.setTextOrientationType(textOrientationType); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setTextVerticalAlignment(String textVerticalAlignment) { return (ComboBox) super.setTextVerticalAlignment(textVerticalAlignment); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setTextVerticalOverflow(String textVerticalOverflow) { return (ComboBox) super.setTextVerticalOverflow(textVerticalOverflow); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setIsGroup(Boolean isGroup) { return (ComboBox) super.setIsGroup(isGroup); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setIsHidden(Boolean isHidden) { return (ComboBox) super.setIsHidden(isHidden); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setIsLockAspectRatio(Boolean isLockAspectRatio) { return (ComboBox) super.setIsLockAspectRatio(isLockAspectRatio); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setIsLocked(Boolean isLocked) { return (ComboBox) super.setIsLocked(isLocked); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setIsPrintable(Boolean isPrintable) { return (ComboBox) super.setIsPrintable(isPrintable); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setIsTextWrapped(Boolean isTextWrapped) { return (ComboBox) super.setIsTextWrapped(isTextWrapped); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setIsWordArt(Boolean isWordArt) { return (ComboBox) super.setIsWordArt(isWordArt); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setLinkedCell(String linkedCell) { return (ComboBox) super.setLinkedCell(linkedCell); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setZOrderPosition(Integer zOrderPosition) { return (ComboBox) super.setZOrderPosition(zOrderPosition); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setFont(Font font) { return (ComboBox) super.setFont(font); }
    /** Covariant override: keeps fluent chains returning ComboBox. */
    @Override public ComboBox setHyperlink(String hyperlink) { return (ComboBox) super.setHyperlink(hyperlink); }

}
