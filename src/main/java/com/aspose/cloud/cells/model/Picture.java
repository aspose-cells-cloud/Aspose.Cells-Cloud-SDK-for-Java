/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Picture.java">
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


public class Picture  extends  Shape {
        @SerializedName("BorderLineColor")
        private Color borderLineColor ;

        public  Picture  borderLineColor(Color  borderLineColor) {
            this.borderLineColor =  borderLineColor;
            return this;
        }

        @ApiModelProperty(value = "")
        public Color getBorderLineColor() {
            return borderLineColor;
        }

        public void setBorderLineColor(Color borderLineColor) {
            this.borderLineColor = borderLineColor;
        }

        @SerializedName("BorderWeight")
        private Double borderWeight ;

        public  Picture  borderWeight(Double  borderWeight) {
            this.borderWeight =  borderWeight;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getBorderWeight() {
            return borderWeight;
        }

        public void setBorderWeight(Double borderWeight) {
            this.borderWeight = borderWeight;
        }

        @SerializedName("OriginalHeight")
        private Integer originalHeight ;

        public  Picture  originalHeight(Integer  originalHeight) {
            this.originalHeight =  originalHeight;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getOriginalHeight() {
            return originalHeight;
        }

        public void setOriginalHeight(Integer originalHeight) {
            this.originalHeight = originalHeight;
        }

        @SerializedName("OriginalWidth")
        private Integer originalWidth ;

        public  Picture  originalWidth(Integer  originalWidth) {
            this.originalWidth =  originalWidth;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getOriginalWidth() {
            return originalWidth;
        }

        public void setOriginalWidth(Integer originalWidth) {
            this.originalWidth = originalWidth;
        }

        @SerializedName("ImageFormat")
        private String imageFormat ;

        public  Picture  imageFormat(String  imageFormat) {
            this.imageFormat =  imageFormat;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getImageFormat() {
            return imageFormat;
        }

        public void setImageFormat(String imageFormat) {
            this.imageFormat = imageFormat;
        }

        @SerializedName("SourceFullName")
        private String sourceFullName ;

        public  Picture  sourceFullName(String  sourceFullName) {
            this.sourceFullName =  sourceFullName;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSourceFullName() {
            return sourceFullName;
        }

        public void setSourceFullName(String sourceFullName) {
            this.sourceFullName = sourceFullName;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Picture picture = (Picture) o;
            return
                Objects.equals(this.borderLineColor, picture.borderLineColor) &&
                Objects.equals(this.borderWeight, picture.borderWeight) &&
                Objects.equals(this.originalHeight, picture.originalHeight) &&
                Objects.equals(this.originalWidth, picture.originalWidth) &&
                Objects.equals(this.imageFormat, picture.imageFormat) &&
                Objects.equals(this.sourceFullName, picture.sourceFullName) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(borderLineColor, borderWeight, originalHeight, originalWidth, imageFormat, sourceFullName, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Picture {\n");
            sb.append("    borderLineColor: ").append(toIndentedString(getBorderLineColor())).append("\n");
            sb.append("    borderWeight: ").append(toIndentedString(getBorderWeight())).append("\n");
            sb.append("    originalHeight: ").append(toIndentedString(getOriginalHeight())).append("\n");
            sb.append("    originalWidth: ").append(toIndentedString(getOriginalWidth())).append("\n");
            sb.append("    imageFormat: ").append(toIndentedString(getImageFormat())).append("\n");
            sb.append("    sourceFullName: ").append(toIndentedString(getSourceFullName())).append("\n");
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

