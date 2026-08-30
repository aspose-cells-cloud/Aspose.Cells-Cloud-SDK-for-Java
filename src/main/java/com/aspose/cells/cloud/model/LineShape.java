package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LineShape — Represents the line shape. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LineShape extends Shape {
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
    public LineShape setBeginArrowheadLength(String beginArrowheadLength) { this.beginArrowheadLength = beginArrowheadLength; return this; }

    public String getBeginArrowheadStyle() { return beginArrowheadStyle; }
    public LineShape setBeginArrowheadStyle(String beginArrowheadStyle) { this.beginArrowheadStyle = beginArrowheadStyle; return this; }

    public String getBeginArrowheadWidth() { return beginArrowheadWidth; }
    public LineShape setBeginArrowheadWidth(String beginArrowheadWidth) { this.beginArrowheadWidth = beginArrowheadWidth; return this; }

    public String getEndArrowheadLength() { return endArrowheadLength; }
    public LineShape setEndArrowheadLength(String endArrowheadLength) { this.endArrowheadLength = endArrowheadLength; return this; }

    public String getEndArrowheadStyle() { return endArrowheadStyle; }
    public LineShape setEndArrowheadStyle(String endArrowheadStyle) { this.endArrowheadStyle = endArrowheadStyle; return this; }

    public String getEndArrowheadWidth() { return endArrowheadWidth; }
    public LineShape setEndArrowheadWidth(String endArrowheadWidth) { this.endArrowheadWidth = endArrowheadWidth; return this; }

    public Link getLink() { return link; }
    public LineShape setLink(Link link) { this.link = link; return this; }


    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setName(String name) { return (LineShape) super.setName(name); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setMsoDrawingType(String msoDrawingType) { return (LineShape) super.setMsoDrawingType(msoDrawingType); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setAutoShapeType(String autoShapeType) { return (LineShape) super.setAutoShapeType(autoShapeType); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setPlacement(String placement) { return (LineShape) super.setPlacement(placement); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setUpperLeftRow(Integer upperLeftRow) { return (LineShape) super.setUpperLeftRow(upperLeftRow); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setTop(Integer top) { return (LineShape) super.setTop(top); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setUpperLeftColumn(Integer upperLeftColumn) { return (LineShape) super.setUpperLeftColumn(upperLeftColumn); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setLeft(Integer left) { return (LineShape) super.setLeft(left); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setLowerRightRow(Integer lowerRightRow) { return (LineShape) super.setLowerRightRow(lowerRightRow); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setBottom(Integer bottom) { return (LineShape) super.setBottom(bottom); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setLowerRightColumn(Integer lowerRightColumn) { return (LineShape) super.setLowerRightColumn(lowerRightColumn); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setRight(Integer right) { return (LineShape) super.setRight(right); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setWidth(Integer width) { return (LineShape) super.setWidth(width); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setHeight(Integer height) { return (LineShape) super.setHeight(height); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setX(Integer x) { return (LineShape) super.setX(x); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setY(Integer y) { return (LineShape) super.setY(y); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setRotationAngle(Double rotationAngle) { return (LineShape) super.setRotationAngle(rotationAngle); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setHtmlText(String htmlText) { return (LineShape) super.setHtmlText(htmlText); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setText(String text) { return (LineShape) super.setText(text); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setAlternativeText(String alternativeText) { return (LineShape) super.setAlternativeText(alternativeText); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setTextHorizontalAlignment(String textHorizontalAlignment) { return (LineShape) super.setTextHorizontalAlignment(textHorizontalAlignment); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setTextHorizontalOverflow(String textHorizontalOverflow) { return (LineShape) super.setTextHorizontalOverflow(textHorizontalOverflow); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setTextOrientationType(String textOrientationType) { return (LineShape) super.setTextOrientationType(textOrientationType); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setTextVerticalAlignment(String textVerticalAlignment) { return (LineShape) super.setTextVerticalAlignment(textVerticalAlignment); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setTextVerticalOverflow(String textVerticalOverflow) { return (LineShape) super.setTextVerticalOverflow(textVerticalOverflow); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setIsGroup(Boolean isGroup) { return (LineShape) super.setIsGroup(isGroup); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setIsHidden(Boolean isHidden) { return (LineShape) super.setIsHidden(isHidden); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setIsLockAspectRatio(Boolean isLockAspectRatio) { return (LineShape) super.setIsLockAspectRatio(isLockAspectRatio); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setIsLocked(Boolean isLocked) { return (LineShape) super.setIsLocked(isLocked); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setIsPrintable(Boolean isPrintable) { return (LineShape) super.setIsPrintable(isPrintable); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setIsTextWrapped(Boolean isTextWrapped) { return (LineShape) super.setIsTextWrapped(isTextWrapped); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setIsWordArt(Boolean isWordArt) { return (LineShape) super.setIsWordArt(isWordArt); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setLinkedCell(String linkedCell) { return (LineShape) super.setLinkedCell(linkedCell); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setZOrderPosition(Integer zOrderPosition) { return (LineShape) super.setZOrderPosition(zOrderPosition); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setFont(Font font) { return (LineShape) super.setFont(font); }
    /** Covariant override: keeps fluent chains returning LineShape. */
    @Override public LineShape setHyperlink(String hyperlink) { return (LineShape) super.setHyperlink(hyperlink); }

}
