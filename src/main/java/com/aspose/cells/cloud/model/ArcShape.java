package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ArcShape — Represents the arc shape. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArcShape extends Shape {
    /** Gets and sets the begin arrow head length of the line. */
    @JsonProperty("BeginArrowheadLength")
    private String beginArrowheadLength;

    /** Gets and sets the begin arrow head style of the line. */
    @JsonProperty("BeginArrowheadStyle")
    private String beginArrowheadStyle;

    /** Gets and sets the begin arrow head width of the line. */
    @JsonProperty("BeginArrowheadWidth")
    private String beginArrowheadWidth;

    /** Gets and sets the end arrow head length of the line. */
    @JsonProperty("EndArrowheadLength")
    private String endArrowheadLength;

    /** Gets and sets the end arrow head style of the line. */
    @JsonProperty("EndArrowheadStyle")
    private String endArrowheadStyle;

    /** Gets and sets the end arrow head width of the line. */
    @JsonProperty("EndArrowheadWidth")
    private String endArrowheadWidth;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public String getBeginArrowheadLength() { return beginArrowheadLength; }
    public ArcShape setBeginArrowheadLength(String beginArrowheadLength) { this.beginArrowheadLength = beginArrowheadLength; return this; }

    public String getBeginArrowheadStyle() { return beginArrowheadStyle; }
    public ArcShape setBeginArrowheadStyle(String beginArrowheadStyle) { this.beginArrowheadStyle = beginArrowheadStyle; return this; }

    public String getBeginArrowheadWidth() { return beginArrowheadWidth; }
    public ArcShape setBeginArrowheadWidth(String beginArrowheadWidth) { this.beginArrowheadWidth = beginArrowheadWidth; return this; }

    public String getEndArrowheadLength() { return endArrowheadLength; }
    public ArcShape setEndArrowheadLength(String endArrowheadLength) { this.endArrowheadLength = endArrowheadLength; return this; }

    public String getEndArrowheadStyle() { return endArrowheadStyle; }
    public ArcShape setEndArrowheadStyle(String endArrowheadStyle) { this.endArrowheadStyle = endArrowheadStyle; return this; }

    public String getEndArrowheadWidth() { return endArrowheadWidth; }
    public ArcShape setEndArrowheadWidth(String endArrowheadWidth) { this.endArrowheadWidth = endArrowheadWidth; return this; }

    public Link getLink() { return link; }
    public ArcShape setLink(Link link) { this.link = link; return this; }


    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setName(String name) { return (ArcShape) super.setName(name); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setMsoDrawingType(String msoDrawingType) { return (ArcShape) super.setMsoDrawingType(msoDrawingType); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setAutoShapeType(String autoShapeType) { return (ArcShape) super.setAutoShapeType(autoShapeType); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setPlacement(String placement) { return (ArcShape) super.setPlacement(placement); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setUpperLeftRow(Integer upperLeftRow) { return (ArcShape) super.setUpperLeftRow(upperLeftRow); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setTop(Integer top) { return (ArcShape) super.setTop(top); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setUpperLeftColumn(Integer upperLeftColumn) { return (ArcShape) super.setUpperLeftColumn(upperLeftColumn); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setLeft(Integer left) { return (ArcShape) super.setLeft(left); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setLowerRightRow(Integer lowerRightRow) { return (ArcShape) super.setLowerRightRow(lowerRightRow); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setBottom(Integer bottom) { return (ArcShape) super.setBottom(bottom); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setLowerRightColumn(Integer lowerRightColumn) { return (ArcShape) super.setLowerRightColumn(lowerRightColumn); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setRight(Integer right) { return (ArcShape) super.setRight(right); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setWidth(Integer width) { return (ArcShape) super.setWidth(width); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setHeight(Integer height) { return (ArcShape) super.setHeight(height); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setX(Integer x) { return (ArcShape) super.setX(x); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setY(Integer y) { return (ArcShape) super.setY(y); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setRotationAngle(Double rotationAngle) { return (ArcShape) super.setRotationAngle(rotationAngle); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setHtmlText(String htmlText) { return (ArcShape) super.setHtmlText(htmlText); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setText(String text) { return (ArcShape) super.setText(text); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setAlternativeText(String alternativeText) { return (ArcShape) super.setAlternativeText(alternativeText); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setTextHorizontalAlignment(String textHorizontalAlignment) { return (ArcShape) super.setTextHorizontalAlignment(textHorizontalAlignment); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setTextHorizontalOverflow(String textHorizontalOverflow) { return (ArcShape) super.setTextHorizontalOverflow(textHorizontalOverflow); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setTextOrientationType(String textOrientationType) { return (ArcShape) super.setTextOrientationType(textOrientationType); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setTextVerticalAlignment(String textVerticalAlignment) { return (ArcShape) super.setTextVerticalAlignment(textVerticalAlignment); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setTextVerticalOverflow(String textVerticalOverflow) { return (ArcShape) super.setTextVerticalOverflow(textVerticalOverflow); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setIsGroup(Boolean isGroup) { return (ArcShape) super.setIsGroup(isGroup); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setIsHidden(Boolean isHidden) { return (ArcShape) super.setIsHidden(isHidden); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setIsLockAspectRatio(Boolean isLockAspectRatio) { return (ArcShape) super.setIsLockAspectRatio(isLockAspectRatio); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setIsLocked(Boolean isLocked) { return (ArcShape) super.setIsLocked(isLocked); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setIsPrintable(Boolean isPrintable) { return (ArcShape) super.setIsPrintable(isPrintable); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setIsTextWrapped(Boolean isTextWrapped) { return (ArcShape) super.setIsTextWrapped(isTextWrapped); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setIsWordArt(Boolean isWordArt) { return (ArcShape) super.setIsWordArt(isWordArt); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setLinkedCell(String linkedCell) { return (ArcShape) super.setLinkedCell(linkedCell); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setZOrderPosition(Integer zOrderPosition) { return (ArcShape) super.setZOrderPosition(zOrderPosition); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setFont(Font font) { return (ArcShape) super.setFont(font); }
    /** Covariant override: keeps fluent chains returning ArcShape. */
    @Override public ArcShape setHyperlink(String hyperlink) { return (ArcShape) super.setHyperlink(hyperlink); }

}
