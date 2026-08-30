package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** GroupBox — Encapsulates the object that represents a groupbox in a spreadsheet. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupBox extends Shape {
    /** Indicates whether the groupbox has shadow. */
    @JsonProperty("Shadow")
    private Boolean shadow;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Boolean getShadow() { return shadow; }
    public GroupBox setShadow(Boolean shadow) { this.shadow = shadow; return this; }

    public Link getLink() { return link; }
    public GroupBox setLink(Link link) { this.link = link; return this; }


    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setName(String name) { return (GroupBox) super.setName(name); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setMsoDrawingType(String msoDrawingType) { return (GroupBox) super.setMsoDrawingType(msoDrawingType); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setAutoShapeType(String autoShapeType) { return (GroupBox) super.setAutoShapeType(autoShapeType); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setPlacement(String placement) { return (GroupBox) super.setPlacement(placement); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setUpperLeftRow(Integer upperLeftRow) { return (GroupBox) super.setUpperLeftRow(upperLeftRow); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setTop(Integer top) { return (GroupBox) super.setTop(top); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setUpperLeftColumn(Integer upperLeftColumn) { return (GroupBox) super.setUpperLeftColumn(upperLeftColumn); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setLeft(Integer left) { return (GroupBox) super.setLeft(left); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setLowerRightRow(Integer lowerRightRow) { return (GroupBox) super.setLowerRightRow(lowerRightRow); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setBottom(Integer bottom) { return (GroupBox) super.setBottom(bottom); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setLowerRightColumn(Integer lowerRightColumn) { return (GroupBox) super.setLowerRightColumn(lowerRightColumn); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setRight(Integer right) { return (GroupBox) super.setRight(right); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setWidth(Integer width) { return (GroupBox) super.setWidth(width); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setHeight(Integer height) { return (GroupBox) super.setHeight(height); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setX(Integer x) { return (GroupBox) super.setX(x); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setY(Integer y) { return (GroupBox) super.setY(y); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setRotationAngle(Double rotationAngle) { return (GroupBox) super.setRotationAngle(rotationAngle); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setHtmlText(String htmlText) { return (GroupBox) super.setHtmlText(htmlText); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setText(String text) { return (GroupBox) super.setText(text); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setAlternativeText(String alternativeText) { return (GroupBox) super.setAlternativeText(alternativeText); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setTextHorizontalAlignment(String textHorizontalAlignment) { return (GroupBox) super.setTextHorizontalAlignment(textHorizontalAlignment); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setTextHorizontalOverflow(String textHorizontalOverflow) { return (GroupBox) super.setTextHorizontalOverflow(textHorizontalOverflow); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setTextOrientationType(String textOrientationType) { return (GroupBox) super.setTextOrientationType(textOrientationType); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setTextVerticalAlignment(String textVerticalAlignment) { return (GroupBox) super.setTextVerticalAlignment(textVerticalAlignment); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setTextVerticalOverflow(String textVerticalOverflow) { return (GroupBox) super.setTextVerticalOverflow(textVerticalOverflow); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setIsGroup(Boolean isGroup) { return (GroupBox) super.setIsGroup(isGroup); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setIsHidden(Boolean isHidden) { return (GroupBox) super.setIsHidden(isHidden); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setIsLockAspectRatio(Boolean isLockAspectRatio) { return (GroupBox) super.setIsLockAspectRatio(isLockAspectRatio); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setIsLocked(Boolean isLocked) { return (GroupBox) super.setIsLocked(isLocked); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setIsPrintable(Boolean isPrintable) { return (GroupBox) super.setIsPrintable(isPrintable); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setIsTextWrapped(Boolean isTextWrapped) { return (GroupBox) super.setIsTextWrapped(isTextWrapped); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setIsWordArt(Boolean isWordArt) { return (GroupBox) super.setIsWordArt(isWordArt); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setLinkedCell(String linkedCell) { return (GroupBox) super.setLinkedCell(linkedCell); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setZOrderPosition(Integer zOrderPosition) { return (GroupBox) super.setZOrderPosition(zOrderPosition); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setFont(Font font) { return (GroupBox) super.setFont(font); }
    /** Covariant override: keeps fluent chains returning GroupBox. */
    @Override public GroupBox setHyperlink(String hyperlink) { return (GroupBox) super.setHyperlink(hyperlink); }

}
