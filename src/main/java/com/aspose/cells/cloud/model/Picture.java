package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Picture — Encapsulates the object that represents a single picture in a spreadsheet. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Picture extends Shape {
    /** Represents the  of the border line of a picture. */
    @JsonProperty("BorderLineColor")
    private Color borderLineColor;

    /** Gets or sets the weight of the border line of a picture in units of pt. */
    @JsonProperty("BorderWeight")
    private Double borderWeight;

    /** Gets the original height of the picture. */
    @JsonProperty("OriginalHeight")
    private Integer originalHeight;

    /** Gets the original width of the picture. */
    @JsonProperty("OriginalWidth")
    private Integer originalWidth;

    /** This class has a property called "ImageFormat" that allows getting and setting a string value. */
    @JsonProperty("ImageFormat")
    private String imageFormat;

    /** Gets or sets the path and name of the source file for the linked image. */
    @JsonProperty("SourceFullName")
    private String sourceFullName;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Color getBorderLineColor() { return borderLineColor; }
    public Picture setBorderLineColor(Color borderLineColor) { this.borderLineColor = borderLineColor; return this; }

    public Double getBorderWeight() { return borderWeight; }
    public Picture setBorderWeight(Double borderWeight) { this.borderWeight = borderWeight; return this; }

    public Integer getOriginalHeight() { return originalHeight; }
    public Picture setOriginalHeight(Integer originalHeight) { this.originalHeight = originalHeight; return this; }

    public Integer getOriginalWidth() { return originalWidth; }
    public Picture setOriginalWidth(Integer originalWidth) { this.originalWidth = originalWidth; return this; }

    public String getImageFormat() { return imageFormat; }
    public Picture setImageFormat(String imageFormat) { this.imageFormat = imageFormat; return this; }

    public String getSourceFullName() { return sourceFullName; }
    public Picture setSourceFullName(String sourceFullName) { this.sourceFullName = sourceFullName; return this; }

    public Link getLink() { return link; }
    public Picture setLink(Link link) { this.link = link; return this; }


    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setName(String name) { return (Picture) super.setName(name); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setMsoDrawingType(String msoDrawingType) { return (Picture) super.setMsoDrawingType(msoDrawingType); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setAutoShapeType(String autoShapeType) { return (Picture) super.setAutoShapeType(autoShapeType); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setPlacement(String placement) { return (Picture) super.setPlacement(placement); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setUpperLeftRow(Integer upperLeftRow) { return (Picture) super.setUpperLeftRow(upperLeftRow); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setTop(Integer top) { return (Picture) super.setTop(top); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setUpperLeftColumn(Integer upperLeftColumn) { return (Picture) super.setUpperLeftColumn(upperLeftColumn); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setLeft(Integer left) { return (Picture) super.setLeft(left); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setLowerRightRow(Integer lowerRightRow) { return (Picture) super.setLowerRightRow(lowerRightRow); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setBottom(Integer bottom) { return (Picture) super.setBottom(bottom); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setLowerRightColumn(Integer lowerRightColumn) { return (Picture) super.setLowerRightColumn(lowerRightColumn); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setRight(Integer right) { return (Picture) super.setRight(right); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setWidth(Integer width) { return (Picture) super.setWidth(width); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setHeight(Integer height) { return (Picture) super.setHeight(height); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setX(Integer x) { return (Picture) super.setX(x); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setY(Integer y) { return (Picture) super.setY(y); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setRotationAngle(Double rotationAngle) { return (Picture) super.setRotationAngle(rotationAngle); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setHtmlText(String htmlText) { return (Picture) super.setHtmlText(htmlText); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setText(String text) { return (Picture) super.setText(text); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setAlternativeText(String alternativeText) { return (Picture) super.setAlternativeText(alternativeText); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setTextHorizontalAlignment(String textHorizontalAlignment) { return (Picture) super.setTextHorizontalAlignment(textHorizontalAlignment); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setTextHorizontalOverflow(String textHorizontalOverflow) { return (Picture) super.setTextHorizontalOverflow(textHorizontalOverflow); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setTextOrientationType(String textOrientationType) { return (Picture) super.setTextOrientationType(textOrientationType); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setTextVerticalAlignment(String textVerticalAlignment) { return (Picture) super.setTextVerticalAlignment(textVerticalAlignment); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setTextVerticalOverflow(String textVerticalOverflow) { return (Picture) super.setTextVerticalOverflow(textVerticalOverflow); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setIsGroup(Boolean isGroup) { return (Picture) super.setIsGroup(isGroup); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setIsHidden(Boolean isHidden) { return (Picture) super.setIsHidden(isHidden); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setIsLockAspectRatio(Boolean isLockAspectRatio) { return (Picture) super.setIsLockAspectRatio(isLockAspectRatio); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setIsLocked(Boolean isLocked) { return (Picture) super.setIsLocked(isLocked); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setIsPrintable(Boolean isPrintable) { return (Picture) super.setIsPrintable(isPrintable); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setIsTextWrapped(Boolean isTextWrapped) { return (Picture) super.setIsTextWrapped(isTextWrapped); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setIsWordArt(Boolean isWordArt) { return (Picture) super.setIsWordArt(isWordArt); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setLinkedCell(String linkedCell) { return (Picture) super.setLinkedCell(linkedCell); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setZOrderPosition(Integer zOrderPosition) { return (Picture) super.setZOrderPosition(zOrderPosition); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setFont(Font font) { return (Picture) super.setFont(font); }
    /** Covariant override: keeps fluent chains returning Picture. */
    @Override public Picture setHyperlink(String hyperlink) { return (Picture) super.setHyperlink(hyperlink); }

}
