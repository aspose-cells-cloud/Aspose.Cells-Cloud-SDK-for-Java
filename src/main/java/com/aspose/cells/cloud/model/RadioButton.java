package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RadioButton — Represents a radio button. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RadioButton extends Shape {
    /** Gets the GroupBox that contains this RadioButton. */
    @JsonProperty("GroupBox")
    private GroupBox groupBox;

    /** Indicates if the radiobutton is checked or not. */
    @JsonProperty("IsChecked")
    private Boolean isChecked;

    /** Indicates whether the combobox has 3-D shading. */
    @JsonProperty("Shadow")
    private Boolean shadow;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public GroupBox getGroupBox() { return groupBox; }
    public RadioButton setGroupBox(GroupBox groupBox) { this.groupBox = groupBox; return this; }

    public Boolean getIsChecked() { return isChecked; }
    public RadioButton setIsChecked(Boolean isChecked) { this.isChecked = isChecked; return this; }

    public Boolean getShadow() { return shadow; }
    public RadioButton setShadow(Boolean shadow) { this.shadow = shadow; return this; }

    public Link getLink() { return link; }
    public RadioButton setLink(Link link) { this.link = link; return this; }


    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setName(String name) { return (RadioButton) super.setName(name); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setMsoDrawingType(String msoDrawingType) { return (RadioButton) super.setMsoDrawingType(msoDrawingType); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setAutoShapeType(String autoShapeType) { return (RadioButton) super.setAutoShapeType(autoShapeType); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setPlacement(String placement) { return (RadioButton) super.setPlacement(placement); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setUpperLeftRow(Integer upperLeftRow) { return (RadioButton) super.setUpperLeftRow(upperLeftRow); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setTop(Integer top) { return (RadioButton) super.setTop(top); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setUpperLeftColumn(Integer upperLeftColumn) { return (RadioButton) super.setUpperLeftColumn(upperLeftColumn); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setLeft(Integer left) { return (RadioButton) super.setLeft(left); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setLowerRightRow(Integer lowerRightRow) { return (RadioButton) super.setLowerRightRow(lowerRightRow); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setBottom(Integer bottom) { return (RadioButton) super.setBottom(bottom); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setLowerRightColumn(Integer lowerRightColumn) { return (RadioButton) super.setLowerRightColumn(lowerRightColumn); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setRight(Integer right) { return (RadioButton) super.setRight(right); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setWidth(Integer width) { return (RadioButton) super.setWidth(width); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setHeight(Integer height) { return (RadioButton) super.setHeight(height); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setX(Integer x) { return (RadioButton) super.setX(x); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setY(Integer y) { return (RadioButton) super.setY(y); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setRotationAngle(Double rotationAngle) { return (RadioButton) super.setRotationAngle(rotationAngle); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setHtmlText(String htmlText) { return (RadioButton) super.setHtmlText(htmlText); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setText(String text) { return (RadioButton) super.setText(text); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setAlternativeText(String alternativeText) { return (RadioButton) super.setAlternativeText(alternativeText); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setTextHorizontalAlignment(String textHorizontalAlignment) { return (RadioButton) super.setTextHorizontalAlignment(textHorizontalAlignment); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setTextHorizontalOverflow(String textHorizontalOverflow) { return (RadioButton) super.setTextHorizontalOverflow(textHorizontalOverflow); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setTextOrientationType(String textOrientationType) { return (RadioButton) super.setTextOrientationType(textOrientationType); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setTextVerticalAlignment(String textVerticalAlignment) { return (RadioButton) super.setTextVerticalAlignment(textVerticalAlignment); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setTextVerticalOverflow(String textVerticalOverflow) { return (RadioButton) super.setTextVerticalOverflow(textVerticalOverflow); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setIsGroup(Boolean isGroup) { return (RadioButton) super.setIsGroup(isGroup); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setIsHidden(Boolean isHidden) { return (RadioButton) super.setIsHidden(isHidden); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setIsLockAspectRatio(Boolean isLockAspectRatio) { return (RadioButton) super.setIsLockAspectRatio(isLockAspectRatio); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setIsLocked(Boolean isLocked) { return (RadioButton) super.setIsLocked(isLocked); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setIsPrintable(Boolean isPrintable) { return (RadioButton) super.setIsPrintable(isPrintable); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setIsTextWrapped(Boolean isTextWrapped) { return (RadioButton) super.setIsTextWrapped(isTextWrapped); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setIsWordArt(Boolean isWordArt) { return (RadioButton) super.setIsWordArt(isWordArt); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setLinkedCell(String linkedCell) { return (RadioButton) super.setLinkedCell(linkedCell); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setZOrderPosition(Integer zOrderPosition) { return (RadioButton) super.setZOrderPosition(zOrderPosition); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setFont(Font font) { return (RadioButton) super.setFont(font); }
    /** Covariant override: keeps fluent chains returning RadioButton. */
    @Override public RadioButton setHyperlink(String hyperlink) { return (RadioButton) super.setHyperlink(hyperlink); }

}
