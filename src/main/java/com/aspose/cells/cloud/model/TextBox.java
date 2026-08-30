package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TextBox — Encapsulates the object that represents a textbox in a spreadsheet. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextBox extends Shape {
    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Link getLink() { return link; }
    public TextBox setLink(Link link) { this.link = link; return this; }


    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setName(String name) { return (TextBox) super.setName(name); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setMsoDrawingType(String msoDrawingType) { return (TextBox) super.setMsoDrawingType(msoDrawingType); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setAutoShapeType(String autoShapeType) { return (TextBox) super.setAutoShapeType(autoShapeType); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setPlacement(String placement) { return (TextBox) super.setPlacement(placement); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setUpperLeftRow(Integer upperLeftRow) { return (TextBox) super.setUpperLeftRow(upperLeftRow); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setTop(Integer top) { return (TextBox) super.setTop(top); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setUpperLeftColumn(Integer upperLeftColumn) { return (TextBox) super.setUpperLeftColumn(upperLeftColumn); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setLeft(Integer left) { return (TextBox) super.setLeft(left); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setLowerRightRow(Integer lowerRightRow) { return (TextBox) super.setLowerRightRow(lowerRightRow); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setBottom(Integer bottom) { return (TextBox) super.setBottom(bottom); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setLowerRightColumn(Integer lowerRightColumn) { return (TextBox) super.setLowerRightColumn(lowerRightColumn); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setRight(Integer right) { return (TextBox) super.setRight(right); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setWidth(Integer width) { return (TextBox) super.setWidth(width); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setHeight(Integer height) { return (TextBox) super.setHeight(height); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setX(Integer x) { return (TextBox) super.setX(x); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setY(Integer y) { return (TextBox) super.setY(y); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setRotationAngle(Double rotationAngle) { return (TextBox) super.setRotationAngle(rotationAngle); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setHtmlText(String htmlText) { return (TextBox) super.setHtmlText(htmlText); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setText(String text) { return (TextBox) super.setText(text); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setAlternativeText(String alternativeText) { return (TextBox) super.setAlternativeText(alternativeText); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setTextHorizontalAlignment(String textHorizontalAlignment) { return (TextBox) super.setTextHorizontalAlignment(textHorizontalAlignment); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setTextHorizontalOverflow(String textHorizontalOverflow) { return (TextBox) super.setTextHorizontalOverflow(textHorizontalOverflow); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setTextOrientationType(String textOrientationType) { return (TextBox) super.setTextOrientationType(textOrientationType); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setTextVerticalAlignment(String textVerticalAlignment) { return (TextBox) super.setTextVerticalAlignment(textVerticalAlignment); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setTextVerticalOverflow(String textVerticalOverflow) { return (TextBox) super.setTextVerticalOverflow(textVerticalOverflow); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setIsGroup(Boolean isGroup) { return (TextBox) super.setIsGroup(isGroup); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setIsHidden(Boolean isHidden) { return (TextBox) super.setIsHidden(isHidden); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setIsLockAspectRatio(Boolean isLockAspectRatio) { return (TextBox) super.setIsLockAspectRatio(isLockAspectRatio); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setIsLocked(Boolean isLocked) { return (TextBox) super.setIsLocked(isLocked); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setIsPrintable(Boolean isPrintable) { return (TextBox) super.setIsPrintable(isPrintable); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setIsTextWrapped(Boolean isTextWrapped) { return (TextBox) super.setIsTextWrapped(isTextWrapped); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setIsWordArt(Boolean isWordArt) { return (TextBox) super.setIsWordArt(isWordArt); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setLinkedCell(String linkedCell) { return (TextBox) super.setLinkedCell(linkedCell); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setZOrderPosition(Integer zOrderPosition) { return (TextBox) super.setZOrderPosition(zOrderPosition); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setFont(Font font) { return (TextBox) super.setFont(font); }
    /** Covariant override: keeps fluent chains returning TextBox. */
    @Override public TextBox setHyperlink(String hyperlink) { return (TextBox) super.setHyperlink(hyperlink); }

}
