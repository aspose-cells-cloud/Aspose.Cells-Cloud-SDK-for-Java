package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ScrollBar — Represents a scroll bar object. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScrollBar extends Shape {
    /** Gets or sets the current value. */
    @JsonProperty("CurrentValue")
    private Integer currentValue;

    /** Gets or sets the amount that the scroll bar or spinner is incremented a line scroll. */
    @JsonProperty("IncrementalChange")
    private Integer incrementalChange;

    /** Indicates whether this is a horizontal scroll bar. */
    @JsonProperty("IsHorizontal")
    private Boolean isHorizontal;

    /** Gets or sets the maximum value of a scroll bar or spinner range. */
    @JsonProperty("Max")
    private Integer max;

    /** Gets or sets the minimum value of a scroll bar or spinner range. */
    @JsonProperty("Min")
    private Integer min;

    /** Gets or sets page change */
    @JsonProperty("PageChange")
    private Integer pageChange;

    /** Indicates whether the shape has 3-D shading. */
    @JsonProperty("Shadow")
    private Boolean shadow;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Integer getCurrentValue() { return currentValue; }
    public ScrollBar setCurrentValue(Integer currentValue) { this.currentValue = currentValue; return this; }

    public Integer getIncrementalChange() { return incrementalChange; }
    public ScrollBar setIncrementalChange(Integer incrementalChange) { this.incrementalChange = incrementalChange; return this; }

    public Boolean getIsHorizontal() { return isHorizontal; }
    public ScrollBar setIsHorizontal(Boolean isHorizontal) { this.isHorizontal = isHorizontal; return this; }

    public Integer getMax() { return max; }
    public ScrollBar setMax(Integer max) { this.max = max; return this; }

    public Integer getMin() { return min; }
    public ScrollBar setMin(Integer min) { this.min = min; return this; }

    public Integer getPageChange() { return pageChange; }
    public ScrollBar setPageChange(Integer pageChange) { this.pageChange = pageChange; return this; }

    public Boolean getShadow() { return shadow; }
    public ScrollBar setShadow(Boolean shadow) { this.shadow = shadow; return this; }

    public Link getLink() { return link; }
    public ScrollBar setLink(Link link) { this.link = link; return this; }


    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setName(String name) { return (ScrollBar) super.setName(name); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setMsoDrawingType(String msoDrawingType) { return (ScrollBar) super.setMsoDrawingType(msoDrawingType); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setAutoShapeType(String autoShapeType) { return (ScrollBar) super.setAutoShapeType(autoShapeType); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setPlacement(String placement) { return (ScrollBar) super.setPlacement(placement); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setUpperLeftRow(Integer upperLeftRow) { return (ScrollBar) super.setUpperLeftRow(upperLeftRow); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setTop(Integer top) { return (ScrollBar) super.setTop(top); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setUpperLeftColumn(Integer upperLeftColumn) { return (ScrollBar) super.setUpperLeftColumn(upperLeftColumn); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setLeft(Integer left) { return (ScrollBar) super.setLeft(left); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setLowerRightRow(Integer lowerRightRow) { return (ScrollBar) super.setLowerRightRow(lowerRightRow); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setBottom(Integer bottom) { return (ScrollBar) super.setBottom(bottom); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setLowerRightColumn(Integer lowerRightColumn) { return (ScrollBar) super.setLowerRightColumn(lowerRightColumn); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setRight(Integer right) { return (ScrollBar) super.setRight(right); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setWidth(Integer width) { return (ScrollBar) super.setWidth(width); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setHeight(Integer height) { return (ScrollBar) super.setHeight(height); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setX(Integer x) { return (ScrollBar) super.setX(x); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setY(Integer y) { return (ScrollBar) super.setY(y); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setRotationAngle(Double rotationAngle) { return (ScrollBar) super.setRotationAngle(rotationAngle); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setHtmlText(String htmlText) { return (ScrollBar) super.setHtmlText(htmlText); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setText(String text) { return (ScrollBar) super.setText(text); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setAlternativeText(String alternativeText) { return (ScrollBar) super.setAlternativeText(alternativeText); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setTextHorizontalAlignment(String textHorizontalAlignment) { return (ScrollBar) super.setTextHorizontalAlignment(textHorizontalAlignment); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setTextHorizontalOverflow(String textHorizontalOverflow) { return (ScrollBar) super.setTextHorizontalOverflow(textHorizontalOverflow); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setTextOrientationType(String textOrientationType) { return (ScrollBar) super.setTextOrientationType(textOrientationType); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setTextVerticalAlignment(String textVerticalAlignment) { return (ScrollBar) super.setTextVerticalAlignment(textVerticalAlignment); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setTextVerticalOverflow(String textVerticalOverflow) { return (ScrollBar) super.setTextVerticalOverflow(textVerticalOverflow); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setIsGroup(Boolean isGroup) { return (ScrollBar) super.setIsGroup(isGroup); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setIsHidden(Boolean isHidden) { return (ScrollBar) super.setIsHidden(isHidden); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setIsLockAspectRatio(Boolean isLockAspectRatio) { return (ScrollBar) super.setIsLockAspectRatio(isLockAspectRatio); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setIsLocked(Boolean isLocked) { return (ScrollBar) super.setIsLocked(isLocked); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setIsPrintable(Boolean isPrintable) { return (ScrollBar) super.setIsPrintable(isPrintable); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setIsTextWrapped(Boolean isTextWrapped) { return (ScrollBar) super.setIsTextWrapped(isTextWrapped); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setIsWordArt(Boolean isWordArt) { return (ScrollBar) super.setIsWordArt(isWordArt); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setLinkedCell(String linkedCell) { return (ScrollBar) super.setLinkedCell(linkedCell); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setZOrderPosition(Integer zOrderPosition) { return (ScrollBar) super.setZOrderPosition(zOrderPosition); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setFont(Font font) { return (ScrollBar) super.setFont(font); }
    /** Covariant override: keeps fluent chains returning ScrollBar. */
    @Override public ScrollBar setHyperlink(String hyperlink) { return (ScrollBar) super.setHyperlink(hyperlink); }

}
