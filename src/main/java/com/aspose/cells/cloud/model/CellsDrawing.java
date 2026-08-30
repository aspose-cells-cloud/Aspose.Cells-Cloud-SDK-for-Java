package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CellsDrawing — Represents the auto shape and drawing object. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellsDrawing extends Shape {
    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Link getLink() { return link; }
    public CellsDrawing setLink(Link link) { this.link = link; return this; }


    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setName(String name) { return (CellsDrawing) super.setName(name); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setMsoDrawingType(String msoDrawingType) { return (CellsDrawing) super.setMsoDrawingType(msoDrawingType); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setAutoShapeType(String autoShapeType) { return (CellsDrawing) super.setAutoShapeType(autoShapeType); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setPlacement(String placement) { return (CellsDrawing) super.setPlacement(placement); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setUpperLeftRow(Integer upperLeftRow) { return (CellsDrawing) super.setUpperLeftRow(upperLeftRow); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setTop(Integer top) { return (CellsDrawing) super.setTop(top); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setUpperLeftColumn(Integer upperLeftColumn) { return (CellsDrawing) super.setUpperLeftColumn(upperLeftColumn); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setLeft(Integer left) { return (CellsDrawing) super.setLeft(left); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setLowerRightRow(Integer lowerRightRow) { return (CellsDrawing) super.setLowerRightRow(lowerRightRow); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setBottom(Integer bottom) { return (CellsDrawing) super.setBottom(bottom); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setLowerRightColumn(Integer lowerRightColumn) { return (CellsDrawing) super.setLowerRightColumn(lowerRightColumn); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setRight(Integer right) { return (CellsDrawing) super.setRight(right); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setWidth(Integer width) { return (CellsDrawing) super.setWidth(width); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setHeight(Integer height) { return (CellsDrawing) super.setHeight(height); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setX(Integer x) { return (CellsDrawing) super.setX(x); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setY(Integer y) { return (CellsDrawing) super.setY(y); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setRotationAngle(Double rotationAngle) { return (CellsDrawing) super.setRotationAngle(rotationAngle); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setHtmlText(String htmlText) { return (CellsDrawing) super.setHtmlText(htmlText); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setText(String text) { return (CellsDrawing) super.setText(text); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setAlternativeText(String alternativeText) { return (CellsDrawing) super.setAlternativeText(alternativeText); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setTextHorizontalAlignment(String textHorizontalAlignment) { return (CellsDrawing) super.setTextHorizontalAlignment(textHorizontalAlignment); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setTextHorizontalOverflow(String textHorizontalOverflow) { return (CellsDrawing) super.setTextHorizontalOverflow(textHorizontalOverflow); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setTextOrientationType(String textOrientationType) { return (CellsDrawing) super.setTextOrientationType(textOrientationType); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setTextVerticalAlignment(String textVerticalAlignment) { return (CellsDrawing) super.setTextVerticalAlignment(textVerticalAlignment); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setTextVerticalOverflow(String textVerticalOverflow) { return (CellsDrawing) super.setTextVerticalOverflow(textVerticalOverflow); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setIsGroup(Boolean isGroup) { return (CellsDrawing) super.setIsGroup(isGroup); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setIsHidden(Boolean isHidden) { return (CellsDrawing) super.setIsHidden(isHidden); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setIsLockAspectRatio(Boolean isLockAspectRatio) { return (CellsDrawing) super.setIsLockAspectRatio(isLockAspectRatio); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setIsLocked(Boolean isLocked) { return (CellsDrawing) super.setIsLocked(isLocked); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setIsPrintable(Boolean isPrintable) { return (CellsDrawing) super.setIsPrintable(isPrintable); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setIsTextWrapped(Boolean isTextWrapped) { return (CellsDrawing) super.setIsTextWrapped(isTextWrapped); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setIsWordArt(Boolean isWordArt) { return (CellsDrawing) super.setIsWordArt(isWordArt); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setLinkedCell(String linkedCell) { return (CellsDrawing) super.setLinkedCell(linkedCell); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setZOrderPosition(Integer zOrderPosition) { return (CellsDrawing) super.setZOrderPosition(zOrderPosition); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setFont(Font font) { return (CellsDrawing) super.setFont(font); }
    /** Covariant override: keeps fluent chains returning CellsDrawing. */
    @Override public CellsDrawing setHyperlink(String hyperlink) { return (CellsDrawing) super.setHyperlink(hyperlink); }

}
