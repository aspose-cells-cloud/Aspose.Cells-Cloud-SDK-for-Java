package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Label — Encapsulates the object that represents a label in a spreadsheet. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Label extends Shape {
    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Link getLink() { return link; }
    public Label setLink(Link link) { this.link = link; return this; }


    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setName(String name) { return (Label) super.setName(name); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setMsoDrawingType(String msoDrawingType) { return (Label) super.setMsoDrawingType(msoDrawingType); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setAutoShapeType(String autoShapeType) { return (Label) super.setAutoShapeType(autoShapeType); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setPlacement(String placement) { return (Label) super.setPlacement(placement); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setUpperLeftRow(Integer upperLeftRow) { return (Label) super.setUpperLeftRow(upperLeftRow); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setTop(Integer top) { return (Label) super.setTop(top); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setUpperLeftColumn(Integer upperLeftColumn) { return (Label) super.setUpperLeftColumn(upperLeftColumn); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setLeft(Integer left) { return (Label) super.setLeft(left); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setLowerRightRow(Integer lowerRightRow) { return (Label) super.setLowerRightRow(lowerRightRow); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setBottom(Integer bottom) { return (Label) super.setBottom(bottom); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setLowerRightColumn(Integer lowerRightColumn) { return (Label) super.setLowerRightColumn(lowerRightColumn); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setRight(Integer right) { return (Label) super.setRight(right); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setWidth(Integer width) { return (Label) super.setWidth(width); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setHeight(Integer height) { return (Label) super.setHeight(height); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setX(Integer x) { return (Label) super.setX(x); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setY(Integer y) { return (Label) super.setY(y); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setRotationAngle(Double rotationAngle) { return (Label) super.setRotationAngle(rotationAngle); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setHtmlText(String htmlText) { return (Label) super.setHtmlText(htmlText); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setText(String text) { return (Label) super.setText(text); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setAlternativeText(String alternativeText) { return (Label) super.setAlternativeText(alternativeText); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setTextHorizontalAlignment(String textHorizontalAlignment) { return (Label) super.setTextHorizontalAlignment(textHorizontalAlignment); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setTextHorizontalOverflow(String textHorizontalOverflow) { return (Label) super.setTextHorizontalOverflow(textHorizontalOverflow); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setTextOrientationType(String textOrientationType) { return (Label) super.setTextOrientationType(textOrientationType); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setTextVerticalAlignment(String textVerticalAlignment) { return (Label) super.setTextVerticalAlignment(textVerticalAlignment); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setTextVerticalOverflow(String textVerticalOverflow) { return (Label) super.setTextVerticalOverflow(textVerticalOverflow); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setIsGroup(Boolean isGroup) { return (Label) super.setIsGroup(isGroup); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setIsHidden(Boolean isHidden) { return (Label) super.setIsHidden(isHidden); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setIsLockAspectRatio(Boolean isLockAspectRatio) { return (Label) super.setIsLockAspectRatio(isLockAspectRatio); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setIsLocked(Boolean isLocked) { return (Label) super.setIsLocked(isLocked); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setIsPrintable(Boolean isPrintable) { return (Label) super.setIsPrintable(isPrintable); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setIsTextWrapped(Boolean isTextWrapped) { return (Label) super.setIsTextWrapped(isTextWrapped); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setIsWordArt(Boolean isWordArt) { return (Label) super.setIsWordArt(isWordArt); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setLinkedCell(String linkedCell) { return (Label) super.setLinkedCell(linkedCell); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setZOrderPosition(Integer zOrderPosition) { return (Label) super.setZOrderPosition(zOrderPosition); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setFont(Font font) { return (Label) super.setFont(font); }
    /** Covariant override: keeps fluent chains returning Label. */
    @Override public Label setHyperlink(String hyperlink) { return (Label) super.setHyperlink(hyperlink); }

}
