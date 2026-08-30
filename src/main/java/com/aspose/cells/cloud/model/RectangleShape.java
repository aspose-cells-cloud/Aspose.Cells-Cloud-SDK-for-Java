package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RectangleShape — Represents the rectangle shape. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RectangleShape extends Shape {
    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Link getLink() { return link; }
    public RectangleShape setLink(Link link) { this.link = link; return this; }


    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setName(String name) { return (RectangleShape) super.setName(name); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setMsoDrawingType(String msoDrawingType) { return (RectangleShape) super.setMsoDrawingType(msoDrawingType); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setAutoShapeType(String autoShapeType) { return (RectangleShape) super.setAutoShapeType(autoShapeType); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setPlacement(String placement) { return (RectangleShape) super.setPlacement(placement); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setUpperLeftRow(Integer upperLeftRow) { return (RectangleShape) super.setUpperLeftRow(upperLeftRow); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setTop(Integer top) { return (RectangleShape) super.setTop(top); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setUpperLeftColumn(Integer upperLeftColumn) { return (RectangleShape) super.setUpperLeftColumn(upperLeftColumn); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setLeft(Integer left) { return (RectangleShape) super.setLeft(left); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setLowerRightRow(Integer lowerRightRow) { return (RectangleShape) super.setLowerRightRow(lowerRightRow); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setBottom(Integer bottom) { return (RectangleShape) super.setBottom(bottom); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setLowerRightColumn(Integer lowerRightColumn) { return (RectangleShape) super.setLowerRightColumn(lowerRightColumn); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setRight(Integer right) { return (RectangleShape) super.setRight(right); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setWidth(Integer width) { return (RectangleShape) super.setWidth(width); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setHeight(Integer height) { return (RectangleShape) super.setHeight(height); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setX(Integer x) { return (RectangleShape) super.setX(x); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setY(Integer y) { return (RectangleShape) super.setY(y); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setRotationAngle(Double rotationAngle) { return (RectangleShape) super.setRotationAngle(rotationAngle); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setHtmlText(String htmlText) { return (RectangleShape) super.setHtmlText(htmlText); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setText(String text) { return (RectangleShape) super.setText(text); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setAlternativeText(String alternativeText) { return (RectangleShape) super.setAlternativeText(alternativeText); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setTextHorizontalAlignment(String textHorizontalAlignment) { return (RectangleShape) super.setTextHorizontalAlignment(textHorizontalAlignment); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setTextHorizontalOverflow(String textHorizontalOverflow) { return (RectangleShape) super.setTextHorizontalOverflow(textHorizontalOverflow); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setTextOrientationType(String textOrientationType) { return (RectangleShape) super.setTextOrientationType(textOrientationType); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setTextVerticalAlignment(String textVerticalAlignment) { return (RectangleShape) super.setTextVerticalAlignment(textVerticalAlignment); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setTextVerticalOverflow(String textVerticalOverflow) { return (RectangleShape) super.setTextVerticalOverflow(textVerticalOverflow); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setIsGroup(Boolean isGroup) { return (RectangleShape) super.setIsGroup(isGroup); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setIsHidden(Boolean isHidden) { return (RectangleShape) super.setIsHidden(isHidden); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setIsLockAspectRatio(Boolean isLockAspectRatio) { return (RectangleShape) super.setIsLockAspectRatio(isLockAspectRatio); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setIsLocked(Boolean isLocked) { return (RectangleShape) super.setIsLocked(isLocked); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setIsPrintable(Boolean isPrintable) { return (RectangleShape) super.setIsPrintable(isPrintable); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setIsTextWrapped(Boolean isTextWrapped) { return (RectangleShape) super.setIsTextWrapped(isTextWrapped); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setIsWordArt(Boolean isWordArt) { return (RectangleShape) super.setIsWordArt(isWordArt); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setLinkedCell(String linkedCell) { return (RectangleShape) super.setLinkedCell(linkedCell); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setZOrderPosition(Integer zOrderPosition) { return (RectangleShape) super.setZOrderPosition(zOrderPosition); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setFont(Font font) { return (RectangleShape) super.setFont(font); }
    /** Covariant override: keeps fluent chains returning RectangleShape. */
    @Override public RectangleShape setHyperlink(String hyperlink) { return (RectangleShape) super.setHyperlink(hyperlink); }

}
