/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Shape.java">
 *   Copyright (c) 2026 Aspose.Cells Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------
 */

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Shape extends LinkElement {

    @SerializedName("Name")
    @JsonProperty("Name")
    private String name;

    public Shape name(String name) {
        this.name = name;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @SerializedName("MsoDrawingType")
    @JsonProperty("MsoDrawingType")
    private String msoDrawingType;

    public Shape msoDrawingType(String msoDrawingType) {
        this.msoDrawingType = msoDrawingType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getMsoDrawingType() {
        return msoDrawingType;
    }

    public void setMsoDrawingType(String msoDrawingType) {
        this.msoDrawingType = msoDrawingType;
    }

    @SerializedName("AutoShapeType")
    @JsonProperty("AutoShapeType")
    private String autoShapeType;

    public Shape autoShapeType(String autoShapeType) {
        this.autoShapeType = autoShapeType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getAutoShapeType() {
        return autoShapeType;
    }

    public void setAutoShapeType(String autoShapeType) {
        this.autoShapeType = autoShapeType;
    }

    @SerializedName("Placement")
    @JsonProperty("Placement")
    private String placement;

    public Shape placement(String placement) {
        this.placement = placement;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPlacement() {
        return placement;
    }

    public void setPlacement(String placement) {
        this.placement = placement;
    }

    @SerializedName("UpperLeftRow")
    @JsonProperty("UpperLeftRow")
    private Integer upperLeftRow;

    public Shape upperLeftRow(Integer upperLeftRow) {
        this.upperLeftRow = upperLeftRow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getUpperLeftRow() {
        return upperLeftRow;
    }

    public void setUpperLeftRow(Integer upperLeftRow) {
        this.upperLeftRow = upperLeftRow;
    }

    @SerializedName("Top")
    @JsonProperty("Top")
    private Integer top;

    public Shape top(Integer top) {
        this.top = top;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    @SerializedName("UpperLeftColumn")
    @JsonProperty("UpperLeftColumn")
    private Integer upperLeftColumn;

    public Shape upperLeftColumn(Integer upperLeftColumn) {
        this.upperLeftColumn = upperLeftColumn;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getUpperLeftColumn() {
        return upperLeftColumn;
    }

    public void setUpperLeftColumn(Integer upperLeftColumn) {
        this.upperLeftColumn = upperLeftColumn;
    }

    @SerializedName("Left")
    @JsonProperty("Left")
    private Integer left;

    public Shape left(Integer left) {
        this.left = left;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    @SerializedName("LowerRightRow")
    @JsonProperty("LowerRightRow")
    private Integer lowerRightRow;

    public Shape lowerRightRow(Integer lowerRightRow) {
        this.lowerRightRow = lowerRightRow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getLowerRightRow() {
        return lowerRightRow;
    }

    public void setLowerRightRow(Integer lowerRightRow) {
        this.lowerRightRow = lowerRightRow;
    }

    @SerializedName("Bottom")
    @JsonProperty("Bottom")
    private Integer bottom;

    public Shape bottom(Integer bottom) {
        this.bottom = bottom;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getBottom() {
        return bottom;
    }

    public void setBottom(Integer bottom) {
        this.bottom = bottom;
    }

    @SerializedName("LowerRightColumn")
    @JsonProperty("LowerRightColumn")
    private Integer lowerRightColumn;

    public Shape lowerRightColumn(Integer lowerRightColumn) {
        this.lowerRightColumn = lowerRightColumn;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getLowerRightColumn() {
        return lowerRightColumn;
    }

    public void setLowerRightColumn(Integer lowerRightColumn) {
        this.lowerRightColumn = lowerRightColumn;
    }

    @SerializedName("Right")
    @JsonProperty("Right")
    private Integer right;

    public Shape right(Integer right) {
        this.right = right;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getRight() {
        return right;
    }

    public void setRight(Integer right) {
        this.right = right;
    }

    @SerializedName("Width")
    @JsonProperty("Width")
    private Integer width;

    public Shape width(Integer width) {
        this.width = width;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @SerializedName("Height")
    @JsonProperty("Height")
    private Integer height;

    public Shape height(Integer height) {
        this.height = height;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @SerializedName("X")
    @JsonProperty("X")
    private Integer x;

    public Shape x(Integer x) {
        this.x = x;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    @SerializedName("Y")
    @JsonProperty("Y")
    private Integer y;

    public Shape y(Integer y) {
        this.y = y;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @SerializedName("RotationAngle")
    @JsonProperty("RotationAngle")
    private Double rotationAngle;

    public Shape rotationAngle(Double rotationAngle) {
        this.rotationAngle = rotationAngle;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getRotationAngle() {
        return rotationAngle;
    }

    public void setRotationAngle(Double rotationAngle) {
        this.rotationAngle = rotationAngle;
    }

    @SerializedName("HtmlText")
    @JsonProperty("HtmlText")
    private String htmlText;

    public Shape htmlText(String htmlText) {
        this.htmlText = htmlText;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getHtmlText() {
        return htmlText;
    }

    public void setHtmlText(String htmlText) {
        this.htmlText = htmlText;
    }

    @SerializedName("Text")
    @JsonProperty("Text")
    private String text;

    public Shape text(String text) {
        this.text = text;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @SerializedName("AlternativeText")
    @JsonProperty("AlternativeText")
    private String alternativeText;

    public Shape alternativeText(String alternativeText) {
        this.alternativeText = alternativeText;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getAlternativeText() {
        return alternativeText;
    }

    public void setAlternativeText(String alternativeText) {
        this.alternativeText = alternativeText;
    }

    @SerializedName("TextHorizontalAlignment")
    @JsonProperty("TextHorizontalAlignment")
    private String textHorizontalAlignment;

    public Shape textHorizontalAlignment(String textHorizontalAlignment) {
        this.textHorizontalAlignment = textHorizontalAlignment;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTextHorizontalAlignment() {
        return textHorizontalAlignment;
    }

    public void setTextHorizontalAlignment(String textHorizontalAlignment) {
        this.textHorizontalAlignment = textHorizontalAlignment;
    }

    @SerializedName("TextHorizontalOverflow")
    @JsonProperty("TextHorizontalOverflow")
    private String textHorizontalOverflow;

    public Shape textHorizontalOverflow(String textHorizontalOverflow) {
        this.textHorizontalOverflow = textHorizontalOverflow;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTextHorizontalOverflow() {
        return textHorizontalOverflow;
    }

    public void setTextHorizontalOverflow(String textHorizontalOverflow) {
        this.textHorizontalOverflow = textHorizontalOverflow;
    }

    @SerializedName("TextOrientationType")
    @JsonProperty("TextOrientationType")
    private String textOrientationType;

    public Shape textOrientationType(String textOrientationType) {
        this.textOrientationType = textOrientationType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTextOrientationType() {
        return textOrientationType;
    }

    public void setTextOrientationType(String textOrientationType) {
        this.textOrientationType = textOrientationType;
    }

    @SerializedName("TextVerticalAlignment")
    @JsonProperty("TextVerticalAlignment")
    private String textVerticalAlignment;

    public Shape textVerticalAlignment(String textVerticalAlignment) {
        this.textVerticalAlignment = textVerticalAlignment;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTextVerticalAlignment() {
        return textVerticalAlignment;
    }

    public void setTextVerticalAlignment(String textVerticalAlignment) {
        this.textVerticalAlignment = textVerticalAlignment;
    }

    @SerializedName("TextVerticalOverflow")
    @JsonProperty("TextVerticalOverflow")
    private String textVerticalOverflow;

    public Shape textVerticalOverflow(String textVerticalOverflow) {
        this.textVerticalOverflow = textVerticalOverflow;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTextVerticalOverflow() {
        return textVerticalOverflow;
    }

    public void setTextVerticalOverflow(String textVerticalOverflow) {
        this.textVerticalOverflow = textVerticalOverflow;
    }

    @SerializedName("IsGroup")
    @JsonProperty("IsGroup")
    private Boolean isGroup;

    public Shape isGroup(Boolean isGroup) {
        this.isGroup = isGroup;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsGroup() {
        return isGroup;
    }

    public void setIsGroup(Boolean isGroup) {
        this.isGroup = isGroup;
    }

    @SerializedName("IsHidden")
    @JsonProperty("IsHidden")
    private Boolean isHidden;

    public Shape isHidden(Boolean isHidden) {
        this.isHidden = isHidden;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    @SerializedName("IsLockAspectRatio")
    @JsonProperty("IsLockAspectRatio")
    private Boolean isLockAspectRatio;

    public Shape isLockAspectRatio(Boolean isLockAspectRatio) {
        this.isLockAspectRatio = isLockAspectRatio;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsLockAspectRatio() {
        return isLockAspectRatio;
    }

    public void setIsLockAspectRatio(Boolean isLockAspectRatio) {
        this.isLockAspectRatio = isLockAspectRatio;
    }

    @SerializedName("IsLocked")
    @JsonProperty("IsLocked")
    private Boolean isLocked;

    public Shape isLocked(Boolean isLocked) {
        this.isLocked = isLocked;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    @SerializedName("IsPrintable")
    @JsonProperty("IsPrintable")
    private Boolean isPrintable;

    public Shape isPrintable(Boolean isPrintable) {
        this.isPrintable = isPrintable;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsPrintable() {
        return isPrintable;
    }

    public void setIsPrintable(Boolean isPrintable) {
        this.isPrintable = isPrintable;
    }

    @SerializedName("IsTextWrapped")
    @JsonProperty("IsTextWrapped")
    private Boolean isTextWrapped;

    public Shape isTextWrapped(Boolean isTextWrapped) {
        this.isTextWrapped = isTextWrapped;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsTextWrapped() {
        return isTextWrapped;
    }

    public void setIsTextWrapped(Boolean isTextWrapped) {
        this.isTextWrapped = isTextWrapped;
    }

    @SerializedName("IsWordArt")
    @JsonProperty("IsWordArt")
    private Boolean isWordArt;

    public Shape isWordArt(Boolean isWordArt) {
        this.isWordArt = isWordArt;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsWordArt() {
        return isWordArt;
    }

    public void setIsWordArt(Boolean isWordArt) {
        this.isWordArt = isWordArt;
    }

    @SerializedName("LinkedCell")
    @JsonProperty("LinkedCell")
    private String linkedCell;

    public Shape linkedCell(String linkedCell) {
        this.linkedCell = linkedCell;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getLinkedCell() {
        return linkedCell;
    }

    public void setLinkedCell(String linkedCell) {
        this.linkedCell = linkedCell;
    }

    @SerializedName("ZOrderPosition")
    @JsonProperty("ZOrderPosition")
    private Integer zOrderPosition;

    public Shape zOrderPosition(Integer zOrderPosition) {
        this.zOrderPosition = zOrderPosition;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getZOrderPosition() {
        return zOrderPosition;
    }

    public void setZOrderPosition(Integer zOrderPosition) {
        this.zOrderPosition = zOrderPosition;
    }

    @SerializedName("Font")
    @JsonProperty("Font")
    private Font font;

    public Shape font(Font font) {
        this.font = font;
        return this;
    }

    @ApiModelProperty(value = "")
    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    @SerializedName("Hyperlink")
    @JsonProperty("Hyperlink")
    private String hyperlink;

    public Shape hyperlink(String hyperlink) {
        this.hyperlink = hyperlink;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getHyperlink() {
        return hyperlink;
    }

    public void setHyperlink(String hyperlink) {
        this.hyperlink = hyperlink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Shape other = (Shape) o;
        return Objects.equals(this.name, other.name)
            && Objects.equals(this.msoDrawingType, other.msoDrawingType)
            && Objects.equals(this.autoShapeType, other.autoShapeType)
            && Objects.equals(this.placement, other.placement)
            && Objects.equals(this.upperLeftRow, other.upperLeftRow)
            && Objects.equals(this.top, other.top)
            && Objects.equals(this.upperLeftColumn, other.upperLeftColumn)
            && Objects.equals(this.left, other.left)
            && Objects.equals(this.lowerRightRow, other.lowerRightRow)
            && Objects.equals(this.bottom, other.bottom)
            && Objects.equals(this.lowerRightColumn, other.lowerRightColumn)
            && Objects.equals(this.right, other.right)
            && Objects.equals(this.width, other.width)
            && Objects.equals(this.height, other.height)
            && Objects.equals(this.x, other.x)
            && Objects.equals(this.y, other.y)
            && Objects.equals(this.rotationAngle, other.rotationAngle)
            && Objects.equals(this.htmlText, other.htmlText)
            && Objects.equals(this.text, other.text)
            && Objects.equals(this.alternativeText, other.alternativeText)
            && Objects.equals(this.textHorizontalAlignment, other.textHorizontalAlignment)
            && Objects.equals(this.textHorizontalOverflow, other.textHorizontalOverflow)
            && Objects.equals(this.textOrientationType, other.textOrientationType)
            && Objects.equals(this.textVerticalAlignment, other.textVerticalAlignment)
            && Objects.equals(this.textVerticalOverflow, other.textVerticalOverflow)
            && Objects.equals(this.isGroup, other.isGroup)
            && Objects.equals(this.isHidden, other.isHidden)
            && Objects.equals(this.isLockAspectRatio, other.isLockAspectRatio)
            && Objects.equals(this.isLocked, other.isLocked)
            && Objects.equals(this.isPrintable, other.isPrintable)
            && Objects.equals(this.isTextWrapped, other.isTextWrapped)
            && Objects.equals(this.isWordArt, other.isWordArt)
            && Objects.equals(this.linkedCell, other.linkedCell)
            && Objects.equals(this.zOrderPosition, other.zOrderPosition)
            && Objects.equals(this.font, other.font)
            && Objects.equals(this.hyperlink, other.hyperlink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, msoDrawingType, autoShapeType, placement, upperLeftRow, top, upperLeftColumn, left, lowerRightRow, bottom, lowerRightColumn, right, width, height, x, y, rotationAngle, htmlText, text, alternativeText, textHorizontalAlignment, textHorizontalOverflow, textOrientationType, textVerticalAlignment, textVerticalOverflow, isGroup, isHidden, isLockAspectRatio, isLocked, isPrintable, isTextWrapped, isWordArt, linkedCell, zOrderPosition, font, hyperlink, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Shape {\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    msoDrawingType: ").append(msoDrawingType).append("\n");
        sb.append("    autoShapeType: ").append(autoShapeType).append("\n");
        sb.append("    placement: ").append(placement).append("\n");
        sb.append("    upperLeftRow: ").append(upperLeftRow).append("\n");
        sb.append("    top: ").append(top).append("\n");
        sb.append("    upperLeftColumn: ").append(upperLeftColumn).append("\n");
        sb.append("    left: ").append(left).append("\n");
        sb.append("    lowerRightRow: ").append(lowerRightRow).append("\n");
        sb.append("    bottom: ").append(bottom).append("\n");
        sb.append("    lowerRightColumn: ").append(lowerRightColumn).append("\n");
        sb.append("    right: ").append(right).append("\n");
        sb.append("    width: ").append(width).append("\n");
        sb.append("    height: ").append(height).append("\n");
        sb.append("    x: ").append(x).append("\n");
        sb.append("    y: ").append(y).append("\n");
        sb.append("    rotationAngle: ").append(rotationAngle).append("\n");
        sb.append("    htmlText: ").append(htmlText).append("\n");
        sb.append("    text: ").append(text).append("\n");
        sb.append("    alternativeText: ").append(alternativeText).append("\n");
        sb.append("    textHorizontalAlignment: ").append(textHorizontalAlignment).append("\n");
        sb.append("    textHorizontalOverflow: ").append(textHorizontalOverflow).append("\n");
        sb.append("    textOrientationType: ").append(textOrientationType).append("\n");
        sb.append("    textVerticalAlignment: ").append(textVerticalAlignment).append("\n");
        sb.append("    textVerticalOverflow: ").append(textVerticalOverflow).append("\n");
        sb.append("    isGroup: ").append(isGroup).append("\n");
        sb.append("    isHidden: ").append(isHidden).append("\n");
        sb.append("    isLockAspectRatio: ").append(isLockAspectRatio).append("\n");
        sb.append("    isLocked: ").append(isLocked).append("\n");
        sb.append("    isPrintable: ").append(isPrintable).append("\n");
        sb.append("    isTextWrapped: ").append(isTextWrapped).append("\n");
        sb.append("    isWordArt: ").append(isWordArt).append("\n");
        sb.append("    linkedCell: ").append(linkedCell).append("\n");
        sb.append("    zOrderPosition: ").append(zOrderPosition).append("\n");
        sb.append("    font: ").append(font).append("\n");
        sb.append("    hyperlink: ").append(hyperlink).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
