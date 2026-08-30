package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Spinner — Represents the Forms control: Spinner. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Spinner extends Shape {
    /** Gets or sets the current value. */
    @JsonProperty("CurrentValue")
    private Integer currentValue;

    /** Gets or sets the amount that the scroll bar or spinner is incremented a line scroll. */
    @JsonProperty("IncrementalChange")
    private Integer incrementalChange;

    /** Gets or sets the maximum value of a scroll bar or spinner range. */
    @JsonProperty("Max")
    private Integer max;

    /** Gets or sets the minimum value of a scroll bar or spinner range. */
    @JsonProperty("Min")
    private Integer min;

    /** Indicates whether the shape has 3-D shading. */
    @JsonProperty("Shadow")
    private Boolean shadow;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Integer getCurrentValue() { return currentValue; }
    public Spinner setCurrentValue(Integer currentValue) { this.currentValue = currentValue; return this; }

    public Integer getIncrementalChange() { return incrementalChange; }
    public Spinner setIncrementalChange(Integer incrementalChange) { this.incrementalChange = incrementalChange; return this; }

    public Integer getMax() { return max; }
    public Spinner setMax(Integer max) { this.max = max; return this; }

    public Integer getMin() { return min; }
    public Spinner setMin(Integer min) { this.min = min; return this; }

    public Boolean getShadow() { return shadow; }
    public Spinner setShadow(Boolean shadow) { this.shadow = shadow; return this; }

    public Link getLink() { return link; }
    public Spinner setLink(Link link) { this.link = link; return this; }


    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setName(String name) { return (Spinner) super.setName(name); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setMsoDrawingType(String msoDrawingType) { return (Spinner) super.setMsoDrawingType(msoDrawingType); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setAutoShapeType(String autoShapeType) { return (Spinner) super.setAutoShapeType(autoShapeType); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setPlacement(String placement) { return (Spinner) super.setPlacement(placement); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setUpperLeftRow(Integer upperLeftRow) { return (Spinner) super.setUpperLeftRow(upperLeftRow); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setTop(Integer top) { return (Spinner) super.setTop(top); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setUpperLeftColumn(Integer upperLeftColumn) { return (Spinner) super.setUpperLeftColumn(upperLeftColumn); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setLeft(Integer left) { return (Spinner) super.setLeft(left); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setLowerRightRow(Integer lowerRightRow) { return (Spinner) super.setLowerRightRow(lowerRightRow); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setBottom(Integer bottom) { return (Spinner) super.setBottom(bottom); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setLowerRightColumn(Integer lowerRightColumn) { return (Spinner) super.setLowerRightColumn(lowerRightColumn); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setRight(Integer right) { return (Spinner) super.setRight(right); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setWidth(Integer width) { return (Spinner) super.setWidth(width); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setHeight(Integer height) { return (Spinner) super.setHeight(height); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setX(Integer x) { return (Spinner) super.setX(x); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setY(Integer y) { return (Spinner) super.setY(y); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setRotationAngle(Double rotationAngle) { return (Spinner) super.setRotationAngle(rotationAngle); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setHtmlText(String htmlText) { return (Spinner) super.setHtmlText(htmlText); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setText(String text) { return (Spinner) super.setText(text); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setAlternativeText(String alternativeText) { return (Spinner) super.setAlternativeText(alternativeText); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setTextHorizontalAlignment(String textHorizontalAlignment) { return (Spinner) super.setTextHorizontalAlignment(textHorizontalAlignment); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setTextHorizontalOverflow(String textHorizontalOverflow) { return (Spinner) super.setTextHorizontalOverflow(textHorizontalOverflow); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setTextOrientationType(String textOrientationType) { return (Spinner) super.setTextOrientationType(textOrientationType); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setTextVerticalAlignment(String textVerticalAlignment) { return (Spinner) super.setTextVerticalAlignment(textVerticalAlignment); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setTextVerticalOverflow(String textVerticalOverflow) { return (Spinner) super.setTextVerticalOverflow(textVerticalOverflow); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setIsGroup(Boolean isGroup) { return (Spinner) super.setIsGroup(isGroup); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setIsHidden(Boolean isHidden) { return (Spinner) super.setIsHidden(isHidden); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setIsLockAspectRatio(Boolean isLockAspectRatio) { return (Spinner) super.setIsLockAspectRatio(isLockAspectRatio); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setIsLocked(Boolean isLocked) { return (Spinner) super.setIsLocked(isLocked); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setIsPrintable(Boolean isPrintable) { return (Spinner) super.setIsPrintable(isPrintable); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setIsTextWrapped(Boolean isTextWrapped) { return (Spinner) super.setIsTextWrapped(isTextWrapped); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setIsWordArt(Boolean isWordArt) { return (Spinner) super.setIsWordArt(isWordArt); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setLinkedCell(String linkedCell) { return (Spinner) super.setLinkedCell(linkedCell); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setZOrderPosition(Integer zOrderPosition) { return (Spinner) super.setZOrderPosition(zOrderPosition); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setFont(Font font) { return (Spinner) super.setFont(font); }
    /** Covariant override: keeps fluent chains returning Spinner. */
    @Override public Spinner setHyperlink(String hyperlink) { return (Spinner) super.setHyperlink(hyperlink); }

}
