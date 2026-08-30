package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CheckBox — Represents a check box object in a worksheet. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckBox extends Shape {
    /** Gets or set checkbox' value. */
    @JsonProperty("CheckedValue")
    private String checkedValue;

    /** Indicates whether the combobox has 3-D shading. */
    @JsonProperty("Shadow")
    private Boolean shadow;

    /** Indicates if the checkbox is checked or not. */
    @JsonProperty("Value")
    private Boolean value;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public String getCheckedValue() { return checkedValue; }
    public CheckBox setCheckedValue(String checkedValue) { this.checkedValue = checkedValue; return this; }

    public Boolean getShadow() { return shadow; }
    public CheckBox setShadow(Boolean shadow) { this.shadow = shadow; return this; }

    public Boolean getValue() { return value; }
    public CheckBox setValue(Boolean value) { this.value = value; return this; }

    public Link getLink() { return link; }
    public CheckBox setLink(Link link) { this.link = link; return this; }


    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setName(String name) { return (CheckBox) super.setName(name); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setMsoDrawingType(String msoDrawingType) { return (CheckBox) super.setMsoDrawingType(msoDrawingType); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setAutoShapeType(String autoShapeType) { return (CheckBox) super.setAutoShapeType(autoShapeType); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setPlacement(String placement) { return (CheckBox) super.setPlacement(placement); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setUpperLeftRow(Integer upperLeftRow) { return (CheckBox) super.setUpperLeftRow(upperLeftRow); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setTop(Integer top) { return (CheckBox) super.setTop(top); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setUpperLeftColumn(Integer upperLeftColumn) { return (CheckBox) super.setUpperLeftColumn(upperLeftColumn); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setLeft(Integer left) { return (CheckBox) super.setLeft(left); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setLowerRightRow(Integer lowerRightRow) { return (CheckBox) super.setLowerRightRow(lowerRightRow); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setBottom(Integer bottom) { return (CheckBox) super.setBottom(bottom); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setLowerRightColumn(Integer lowerRightColumn) { return (CheckBox) super.setLowerRightColumn(lowerRightColumn); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setRight(Integer right) { return (CheckBox) super.setRight(right); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setWidth(Integer width) { return (CheckBox) super.setWidth(width); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setHeight(Integer height) { return (CheckBox) super.setHeight(height); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setX(Integer x) { return (CheckBox) super.setX(x); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setY(Integer y) { return (CheckBox) super.setY(y); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setRotationAngle(Double rotationAngle) { return (CheckBox) super.setRotationAngle(rotationAngle); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setHtmlText(String htmlText) { return (CheckBox) super.setHtmlText(htmlText); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setText(String text) { return (CheckBox) super.setText(text); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setAlternativeText(String alternativeText) { return (CheckBox) super.setAlternativeText(alternativeText); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setTextHorizontalAlignment(String textHorizontalAlignment) { return (CheckBox) super.setTextHorizontalAlignment(textHorizontalAlignment); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setTextHorizontalOverflow(String textHorizontalOverflow) { return (CheckBox) super.setTextHorizontalOverflow(textHorizontalOverflow); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setTextOrientationType(String textOrientationType) { return (CheckBox) super.setTextOrientationType(textOrientationType); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setTextVerticalAlignment(String textVerticalAlignment) { return (CheckBox) super.setTextVerticalAlignment(textVerticalAlignment); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setTextVerticalOverflow(String textVerticalOverflow) { return (CheckBox) super.setTextVerticalOverflow(textVerticalOverflow); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setIsGroup(Boolean isGroup) { return (CheckBox) super.setIsGroup(isGroup); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setIsHidden(Boolean isHidden) { return (CheckBox) super.setIsHidden(isHidden); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setIsLockAspectRatio(Boolean isLockAspectRatio) { return (CheckBox) super.setIsLockAspectRatio(isLockAspectRatio); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setIsLocked(Boolean isLocked) { return (CheckBox) super.setIsLocked(isLocked); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setIsPrintable(Boolean isPrintable) { return (CheckBox) super.setIsPrintable(isPrintable); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setIsTextWrapped(Boolean isTextWrapped) { return (CheckBox) super.setIsTextWrapped(isTextWrapped); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setIsWordArt(Boolean isWordArt) { return (CheckBox) super.setIsWordArt(isWordArt); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setLinkedCell(String linkedCell) { return (CheckBox) super.setLinkedCell(linkedCell); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setZOrderPosition(Integer zOrderPosition) { return (CheckBox) super.setZOrderPosition(zOrderPosition); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setFont(Font font) { return (CheckBox) super.setFont(font); }
    /** Covariant override: keeps fluent chains returning CheckBox. */
    @Override public CheckBox setHyperlink(String hyperlink) { return (CheckBox) super.setHyperlink(hyperlink); }

}
