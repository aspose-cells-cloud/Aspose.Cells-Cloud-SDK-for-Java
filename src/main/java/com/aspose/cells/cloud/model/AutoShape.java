package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AutoShape — Represents an AutoShape. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutoShape extends Shape {
    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Link getLink() { return link; }
    public AutoShape setLink(Link link) { this.link = link; return this; }


    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setName(String name) { return (AutoShape) super.setName(name); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setMsoDrawingType(String msoDrawingType) { return (AutoShape) super.setMsoDrawingType(msoDrawingType); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setAutoShapeType(String autoShapeType) { return (AutoShape) super.setAutoShapeType(autoShapeType); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setPlacement(String placement) { return (AutoShape) super.setPlacement(placement); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setUpperLeftRow(Integer upperLeftRow) { return (AutoShape) super.setUpperLeftRow(upperLeftRow); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setTop(Integer top) { return (AutoShape) super.setTop(top); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setUpperLeftColumn(Integer upperLeftColumn) { return (AutoShape) super.setUpperLeftColumn(upperLeftColumn); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setLeft(Integer left) { return (AutoShape) super.setLeft(left); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setLowerRightRow(Integer lowerRightRow) { return (AutoShape) super.setLowerRightRow(lowerRightRow); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setBottom(Integer bottom) { return (AutoShape) super.setBottom(bottom); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setLowerRightColumn(Integer lowerRightColumn) { return (AutoShape) super.setLowerRightColumn(lowerRightColumn); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setRight(Integer right) { return (AutoShape) super.setRight(right); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setWidth(Integer width) { return (AutoShape) super.setWidth(width); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setHeight(Integer height) { return (AutoShape) super.setHeight(height); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setX(Integer x) { return (AutoShape) super.setX(x); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setY(Integer y) { return (AutoShape) super.setY(y); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setRotationAngle(Double rotationAngle) { return (AutoShape) super.setRotationAngle(rotationAngle); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setHtmlText(String htmlText) { return (AutoShape) super.setHtmlText(htmlText); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setText(String text) { return (AutoShape) super.setText(text); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setAlternativeText(String alternativeText) { return (AutoShape) super.setAlternativeText(alternativeText); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setTextHorizontalAlignment(String textHorizontalAlignment) { return (AutoShape) super.setTextHorizontalAlignment(textHorizontalAlignment); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setTextHorizontalOverflow(String textHorizontalOverflow) { return (AutoShape) super.setTextHorizontalOverflow(textHorizontalOverflow); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setTextOrientationType(String textOrientationType) { return (AutoShape) super.setTextOrientationType(textOrientationType); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setTextVerticalAlignment(String textVerticalAlignment) { return (AutoShape) super.setTextVerticalAlignment(textVerticalAlignment); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setTextVerticalOverflow(String textVerticalOverflow) { return (AutoShape) super.setTextVerticalOverflow(textVerticalOverflow); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setIsGroup(Boolean isGroup) { return (AutoShape) super.setIsGroup(isGroup); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setIsHidden(Boolean isHidden) { return (AutoShape) super.setIsHidden(isHidden); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setIsLockAspectRatio(Boolean isLockAspectRatio) { return (AutoShape) super.setIsLockAspectRatio(isLockAspectRatio); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setIsLocked(Boolean isLocked) { return (AutoShape) super.setIsLocked(isLocked); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setIsPrintable(Boolean isPrintable) { return (AutoShape) super.setIsPrintable(isPrintable); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setIsTextWrapped(Boolean isTextWrapped) { return (AutoShape) super.setIsTextWrapped(isTextWrapped); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setIsWordArt(Boolean isWordArt) { return (AutoShape) super.setIsWordArt(isWordArt); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setLinkedCell(String linkedCell) { return (AutoShape) super.setLinkedCell(linkedCell); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setZOrderPosition(Integer zOrderPosition) { return (AutoShape) super.setZOrderPosition(zOrderPosition); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setFont(Font font) { return (AutoShape) super.setFont(font); }
    /** Covariant override: keeps fluent chains returning AutoShape. */
    @Override public AutoShape setHyperlink(String hyperlink) { return (AutoShape) super.setHyperlink(hyperlink); }

}
