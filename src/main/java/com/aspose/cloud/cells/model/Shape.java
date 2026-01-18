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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class Shape  extends  LinkElement {
        @SerializedName("Name")
        private String name ;

        public  Shape  name(String  name) {
            this.name =  name;
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
        private String msoDrawingType ;

        public  Shape  msoDrawingType(String  msoDrawingType) {
            this.msoDrawingType =  msoDrawingType;
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
        private String autoShapeType ;

        public  Shape  autoShapeType(String  autoShapeType) {
            this.autoShapeType =  autoShapeType;
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
        private String placement ;

        public  Shape  placement(String  placement) {
            this.placement =  placement;
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
        private Integer upperLeftRow ;

        public  Shape  upperLeftRow(Integer  upperLeftRow) {
            this.upperLeftRow =  upperLeftRow;
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
        private Integer top ;

        public  Shape  top(Integer  top) {
            this.top =  top;
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
        private Integer upperLeftColumn ;

        public  Shape  upperLeftColumn(Integer  upperLeftColumn) {
            this.upperLeftColumn =  upperLeftColumn;
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
        private Integer left ;

        public  Shape  left(Integer  left) {
            this.left =  left;
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
        private Integer lowerRightRow ;

        public  Shape  lowerRightRow(Integer  lowerRightRow) {
            this.lowerRightRow =  lowerRightRow;
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
        private Integer bottom ;

        public  Shape  bottom(Integer  bottom) {
            this.bottom =  bottom;
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
        private Integer lowerRightColumn ;

        public  Shape  lowerRightColumn(Integer  lowerRightColumn) {
            this.lowerRightColumn =  lowerRightColumn;
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
        private Integer right ;

        public  Shape  right(Integer  right) {
            this.right =  right;
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
        private Integer width ;

        public  Shape  width(Integer  width) {
            this.width =  width;
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
        private Integer height ;

        public  Shape  height(Integer  height) {
            this.height =  height;
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
        private Integer x ;

        public  Shape  x(Integer  x) {
            this.x =  x;
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
        private Integer y ;

        public  Shape  y(Integer  y) {
            this.y =  y;
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
        private Double rotationAngle ;

        public  Shape  rotationAngle(Double  rotationAngle) {
            this.rotationAngle =  rotationAngle;
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
        private String htmlText ;

        public  Shape  htmlText(String  htmlText) {
            this.htmlText =  htmlText;
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
        private String text ;

        public  Shape  text(String  text) {
            this.text =  text;
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
        private String alternativeText ;

        public  Shape  alternativeText(String  alternativeText) {
            this.alternativeText =  alternativeText;
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
        private String textHorizontalAlignment ;

        public  Shape  textHorizontalAlignment(String  textHorizontalAlignment) {
            this.textHorizontalAlignment =  textHorizontalAlignment;
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
        private String textHorizontalOverflow ;

        public  Shape  textHorizontalOverflow(String  textHorizontalOverflow) {
            this.textHorizontalOverflow =  textHorizontalOverflow;
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
        private String textOrientationType ;

        public  Shape  textOrientationType(String  textOrientationType) {
            this.textOrientationType =  textOrientationType;
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
        private String textVerticalAlignment ;

        public  Shape  textVerticalAlignment(String  textVerticalAlignment) {
            this.textVerticalAlignment =  textVerticalAlignment;
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
        private String textVerticalOverflow ;

        public  Shape  textVerticalOverflow(String  textVerticalOverflow) {
            this.textVerticalOverflow =  textVerticalOverflow;
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
        private Boolean isGroup ;

        public  Shape  isGroup(Boolean  isGroup) {
            this.isGroup =  isGroup;
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
        private Boolean isHidden ;

        public  Shape  isHidden(Boolean  isHidden) {
            this.isHidden =  isHidden;
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
        private Boolean isLockAspectRatio ;

        public  Shape  isLockAspectRatio(Boolean  isLockAspectRatio) {
            this.isLockAspectRatio =  isLockAspectRatio;
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
        private Boolean isLocked ;

        public  Shape  isLocked(Boolean  isLocked) {
            this.isLocked =  isLocked;
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
        private Boolean isPrintable ;

        public  Shape  isPrintable(Boolean  isPrintable) {
            this.isPrintable =  isPrintable;
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
        private Boolean isTextWrapped ;

        public  Shape  isTextWrapped(Boolean  isTextWrapped) {
            this.isTextWrapped =  isTextWrapped;
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
        private Boolean isWordArt ;

        public  Shape  isWordArt(Boolean  isWordArt) {
            this.isWordArt =  isWordArt;
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
        private String linkedCell ;

        public  Shape  linkedCell(String  linkedCell) {
            this.linkedCell =  linkedCell;
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
        private Integer zOrderPosition ;

        public  Shape  zOrderPosition(Integer  zOrderPosition) {
            this.zOrderPosition =  zOrderPosition;
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
        private Font font ;

        public  Shape  font(Font  font) {
            this.font =  font;
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
        private String hyperlink ;

        public  Shape  hyperlink(String  hyperlink) {
            this.hyperlink =  hyperlink;
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
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Shape shape = (Shape) o;
            return
                Objects.equals(this.name, shape.name) &&
                Objects.equals(this.msoDrawingType, shape.msoDrawingType) &&
                Objects.equals(this.autoShapeType, shape.autoShapeType) &&
                Objects.equals(this.placement, shape.placement) &&
                Objects.equals(this.upperLeftRow, shape.upperLeftRow) &&
                Objects.equals(this.top, shape.top) &&
                Objects.equals(this.upperLeftColumn, shape.upperLeftColumn) &&
                Objects.equals(this.left, shape.left) &&
                Objects.equals(this.lowerRightRow, shape.lowerRightRow) &&
                Objects.equals(this.bottom, shape.bottom) &&
                Objects.equals(this.lowerRightColumn, shape.lowerRightColumn) &&
                Objects.equals(this.right, shape.right) &&
                Objects.equals(this.width, shape.width) &&
                Objects.equals(this.height, shape.height) &&
                Objects.equals(this.x, shape.x) &&
                Objects.equals(this.y, shape.y) &&
                Objects.equals(this.rotationAngle, shape.rotationAngle) &&
                Objects.equals(this.htmlText, shape.htmlText) &&
                Objects.equals(this.text, shape.text) &&
                Objects.equals(this.alternativeText, shape.alternativeText) &&
                Objects.equals(this.textHorizontalAlignment, shape.textHorizontalAlignment) &&
                Objects.equals(this.textHorizontalOverflow, shape.textHorizontalOverflow) &&
                Objects.equals(this.textOrientationType, shape.textOrientationType) &&
                Objects.equals(this.textVerticalAlignment, shape.textVerticalAlignment) &&
                Objects.equals(this.textVerticalOverflow, shape.textVerticalOverflow) &&
                Objects.equals(this.isGroup, shape.isGroup) &&
                Objects.equals(this.isHidden, shape.isHidden) &&
                Objects.equals(this.isLockAspectRatio, shape.isLockAspectRatio) &&
                Objects.equals(this.isLocked, shape.isLocked) &&
                Objects.equals(this.isPrintable, shape.isPrintable) &&
                Objects.equals(this.isTextWrapped, shape.isTextWrapped) &&
                Objects.equals(this.isWordArt, shape.isWordArt) &&
                Objects.equals(this.linkedCell, shape.linkedCell) &&
                Objects.equals(this.zOrderPosition, shape.zOrderPosition) &&
                Objects.equals(this.font, shape.font) &&
                Objects.equals(this.hyperlink, shape.hyperlink) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(name, msoDrawingType, autoShapeType, placement, upperLeftRow, top, upperLeftColumn, left, lowerRightRow, bottom, lowerRightColumn, right, width, height, x, y, rotationAngle, htmlText, text, alternativeText, textHorizontalAlignment, textHorizontalOverflow, textOrientationType, textVerticalAlignment, textVerticalOverflow, isGroup, isHidden, isLockAspectRatio, isLocked, isPrintable, isTextWrapped, isWordArt, linkedCell, zOrderPosition, font, hyperlink, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Shape {\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    msoDrawingType: ").append(toIndentedString(getMsoDrawingType())).append("\n");
            sb.append("    autoShapeType: ").append(toIndentedString(getAutoShapeType())).append("\n");
            sb.append("    placement: ").append(toIndentedString(getPlacement())).append("\n");
            sb.append("    upperLeftRow: ").append(toIndentedString(getUpperLeftRow())).append("\n");
            sb.append("    top: ").append(toIndentedString(getTop())).append("\n");
            sb.append("    upperLeftColumn: ").append(toIndentedString(getUpperLeftColumn())).append("\n");
            sb.append("    left: ").append(toIndentedString(getLeft())).append("\n");
            sb.append("    lowerRightRow: ").append(toIndentedString(getLowerRightRow())).append("\n");
            sb.append("    bottom: ").append(toIndentedString(getBottom())).append("\n");
            sb.append("    lowerRightColumn: ").append(toIndentedString(getLowerRightColumn())).append("\n");
            sb.append("    right: ").append(toIndentedString(getRight())).append("\n");
            sb.append("    width: ").append(toIndentedString(getWidth())).append("\n");
            sb.append("    height: ").append(toIndentedString(getHeight())).append("\n");
            sb.append("    x: ").append(toIndentedString(getX())).append("\n");
            sb.append("    y: ").append(toIndentedString(getY())).append("\n");
            sb.append("    rotationAngle: ").append(toIndentedString(getRotationAngle())).append("\n");
            sb.append("    htmlText: ").append(toIndentedString(getHtmlText())).append("\n");
            sb.append("    text: ").append(toIndentedString(getText())).append("\n");
            sb.append("    alternativeText: ").append(toIndentedString(getAlternativeText())).append("\n");
            sb.append("    textHorizontalAlignment: ").append(toIndentedString(getTextHorizontalAlignment())).append("\n");
            sb.append("    textHorizontalOverflow: ").append(toIndentedString(getTextHorizontalOverflow())).append("\n");
            sb.append("    textOrientationType: ").append(toIndentedString(getTextOrientationType())).append("\n");
            sb.append("    textVerticalAlignment: ").append(toIndentedString(getTextVerticalAlignment())).append("\n");
            sb.append("    textVerticalOverflow: ").append(toIndentedString(getTextVerticalOverflow())).append("\n");
            sb.append("    isGroup: ").append(toIndentedString(getIsGroup())).append("\n");
            sb.append("    isHidden: ").append(toIndentedString(getIsHidden())).append("\n");
            sb.append("    isLockAspectRatio: ").append(toIndentedString(getIsLockAspectRatio())).append("\n");
            sb.append("    isLocked: ").append(toIndentedString(getIsLocked())).append("\n");
            sb.append("    isPrintable: ").append(toIndentedString(getIsPrintable())).append("\n");
            sb.append("    isTextWrapped: ").append(toIndentedString(getIsTextWrapped())).append("\n");
            sb.append("    isWordArt: ").append(toIndentedString(getIsWordArt())).append("\n");
            sb.append("    linkedCell: ").append(toIndentedString(getLinkedCell())).append("\n");
            sb.append("    zOrderPosition: ").append(toIndentedString(getZOrderPosition())).append("\n");
            sb.append("    font: ").append(toIndentedString(getFont())).append("\n");
            sb.append("    hyperlink: ").append(toIndentedString(getHyperlink())).append("\n");
            sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
        * Convert the given object to string with each line indented by 4 spaces
        * (except the first line).
        */
        private String toIndentedString(java.lang.Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }


}

