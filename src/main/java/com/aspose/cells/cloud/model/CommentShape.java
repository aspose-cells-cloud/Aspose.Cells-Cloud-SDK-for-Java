package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CommentShape — Represents the shape of the comment. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentShape extends Shape {
    /** Gets the comment object. */
    @JsonProperty("Comment")
    private LinkElement comment;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public LinkElement getComment() { return comment; }
    public CommentShape setComment(LinkElement comment) { this.comment = comment; return this; }

    public Link getLink() { return link; }
    public CommentShape setLink(Link link) { this.link = link; return this; }


    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setName(String name) { return (CommentShape) super.setName(name); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setMsoDrawingType(String msoDrawingType) { return (CommentShape) super.setMsoDrawingType(msoDrawingType); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setAutoShapeType(String autoShapeType) { return (CommentShape) super.setAutoShapeType(autoShapeType); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setPlacement(String placement) { return (CommentShape) super.setPlacement(placement); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setUpperLeftRow(Integer upperLeftRow) { return (CommentShape) super.setUpperLeftRow(upperLeftRow); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setTop(Integer top) { return (CommentShape) super.setTop(top); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setUpperLeftColumn(Integer upperLeftColumn) { return (CommentShape) super.setUpperLeftColumn(upperLeftColumn); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setLeft(Integer left) { return (CommentShape) super.setLeft(left); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setLowerRightRow(Integer lowerRightRow) { return (CommentShape) super.setLowerRightRow(lowerRightRow); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setBottom(Integer bottom) { return (CommentShape) super.setBottom(bottom); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setLowerRightColumn(Integer lowerRightColumn) { return (CommentShape) super.setLowerRightColumn(lowerRightColumn); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setRight(Integer right) { return (CommentShape) super.setRight(right); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setWidth(Integer width) { return (CommentShape) super.setWidth(width); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setHeight(Integer height) { return (CommentShape) super.setHeight(height); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setX(Integer x) { return (CommentShape) super.setX(x); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setY(Integer y) { return (CommentShape) super.setY(y); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setRotationAngle(Double rotationAngle) { return (CommentShape) super.setRotationAngle(rotationAngle); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setHtmlText(String htmlText) { return (CommentShape) super.setHtmlText(htmlText); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setText(String text) { return (CommentShape) super.setText(text); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setAlternativeText(String alternativeText) { return (CommentShape) super.setAlternativeText(alternativeText); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setTextHorizontalAlignment(String textHorizontalAlignment) { return (CommentShape) super.setTextHorizontalAlignment(textHorizontalAlignment); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setTextHorizontalOverflow(String textHorizontalOverflow) { return (CommentShape) super.setTextHorizontalOverflow(textHorizontalOverflow); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setTextOrientationType(String textOrientationType) { return (CommentShape) super.setTextOrientationType(textOrientationType); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setTextVerticalAlignment(String textVerticalAlignment) { return (CommentShape) super.setTextVerticalAlignment(textVerticalAlignment); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setTextVerticalOverflow(String textVerticalOverflow) { return (CommentShape) super.setTextVerticalOverflow(textVerticalOverflow); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setIsGroup(Boolean isGroup) { return (CommentShape) super.setIsGroup(isGroup); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setIsHidden(Boolean isHidden) { return (CommentShape) super.setIsHidden(isHidden); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setIsLockAspectRatio(Boolean isLockAspectRatio) { return (CommentShape) super.setIsLockAspectRatio(isLockAspectRatio); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setIsLocked(Boolean isLocked) { return (CommentShape) super.setIsLocked(isLocked); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setIsPrintable(Boolean isPrintable) { return (CommentShape) super.setIsPrintable(isPrintable); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setIsTextWrapped(Boolean isTextWrapped) { return (CommentShape) super.setIsTextWrapped(isTextWrapped); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setIsWordArt(Boolean isWordArt) { return (CommentShape) super.setIsWordArt(isWordArt); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setLinkedCell(String linkedCell) { return (CommentShape) super.setLinkedCell(linkedCell); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setZOrderPosition(Integer zOrderPosition) { return (CommentShape) super.setZOrderPosition(zOrderPosition); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setFont(Font font) { return (CommentShape) super.setFont(font); }
    /** Covariant override: keeps fluent chains returning CommentShape. */
    @Override public CommentShape setHyperlink(String hyperlink) { return (CommentShape) super.setHyperlink(hyperlink); }

}
