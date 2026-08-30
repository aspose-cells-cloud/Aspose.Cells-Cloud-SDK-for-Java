package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** GroupShape — Represents the group shape which contains the individual shapes. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupShape extends Shape {
    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Link getLink() { return link; }
    public GroupShape setLink(Link link) { this.link = link; return this; }


    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setName(String name) { return (GroupShape) super.setName(name); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setMsoDrawingType(String msoDrawingType) { return (GroupShape) super.setMsoDrawingType(msoDrawingType); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setAutoShapeType(String autoShapeType) { return (GroupShape) super.setAutoShapeType(autoShapeType); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setPlacement(String placement) { return (GroupShape) super.setPlacement(placement); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setUpperLeftRow(Integer upperLeftRow) { return (GroupShape) super.setUpperLeftRow(upperLeftRow); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setTop(Integer top) { return (GroupShape) super.setTop(top); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setUpperLeftColumn(Integer upperLeftColumn) { return (GroupShape) super.setUpperLeftColumn(upperLeftColumn); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setLeft(Integer left) { return (GroupShape) super.setLeft(left); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setLowerRightRow(Integer lowerRightRow) { return (GroupShape) super.setLowerRightRow(lowerRightRow); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setBottom(Integer bottom) { return (GroupShape) super.setBottom(bottom); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setLowerRightColumn(Integer lowerRightColumn) { return (GroupShape) super.setLowerRightColumn(lowerRightColumn); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setRight(Integer right) { return (GroupShape) super.setRight(right); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setWidth(Integer width) { return (GroupShape) super.setWidth(width); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setHeight(Integer height) { return (GroupShape) super.setHeight(height); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setX(Integer x) { return (GroupShape) super.setX(x); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setY(Integer y) { return (GroupShape) super.setY(y); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setRotationAngle(Double rotationAngle) { return (GroupShape) super.setRotationAngle(rotationAngle); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setHtmlText(String htmlText) { return (GroupShape) super.setHtmlText(htmlText); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setText(String text) { return (GroupShape) super.setText(text); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setAlternativeText(String alternativeText) { return (GroupShape) super.setAlternativeText(alternativeText); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setTextHorizontalAlignment(String textHorizontalAlignment) { return (GroupShape) super.setTextHorizontalAlignment(textHorizontalAlignment); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setTextHorizontalOverflow(String textHorizontalOverflow) { return (GroupShape) super.setTextHorizontalOverflow(textHorizontalOverflow); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setTextOrientationType(String textOrientationType) { return (GroupShape) super.setTextOrientationType(textOrientationType); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setTextVerticalAlignment(String textVerticalAlignment) { return (GroupShape) super.setTextVerticalAlignment(textVerticalAlignment); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setTextVerticalOverflow(String textVerticalOverflow) { return (GroupShape) super.setTextVerticalOverflow(textVerticalOverflow); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setIsGroup(Boolean isGroup) { return (GroupShape) super.setIsGroup(isGroup); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setIsHidden(Boolean isHidden) { return (GroupShape) super.setIsHidden(isHidden); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setIsLockAspectRatio(Boolean isLockAspectRatio) { return (GroupShape) super.setIsLockAspectRatio(isLockAspectRatio); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setIsLocked(Boolean isLocked) { return (GroupShape) super.setIsLocked(isLocked); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setIsPrintable(Boolean isPrintable) { return (GroupShape) super.setIsPrintable(isPrintable); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setIsTextWrapped(Boolean isTextWrapped) { return (GroupShape) super.setIsTextWrapped(isTextWrapped); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setIsWordArt(Boolean isWordArt) { return (GroupShape) super.setIsWordArt(isWordArt); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setLinkedCell(String linkedCell) { return (GroupShape) super.setLinkedCell(linkedCell); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setZOrderPosition(Integer zOrderPosition) { return (GroupShape) super.setZOrderPosition(zOrderPosition); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setFont(Font font) { return (GroupShape) super.setFont(font); }
    /** Covariant override: keeps fluent chains returning GroupShape. */
    @Override public GroupShape setHyperlink(String hyperlink) { return (GroupShape) super.setHyperlink(hyperlink); }

}
