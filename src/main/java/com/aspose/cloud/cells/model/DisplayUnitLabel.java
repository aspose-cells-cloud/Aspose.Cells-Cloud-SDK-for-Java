/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DisplayUnitLabel.java">
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


public class DisplayUnitLabel  extends  ChartFrame {
        @SerializedName("LinkedSource")
        private String linkedSource ;

        public  DisplayUnitLabel  linkedSource(String  linkedSource) {
            this.linkedSource =  linkedSource;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getLinkedSource() {
            return linkedSource;
        }

        public void setLinkedSource(String linkedSource) {
            this.linkedSource = linkedSource;
        }

        @SerializedName("RotationAngle")
        private Integer rotationAngle ;

        public  DisplayUnitLabel  rotationAngle(Integer  rotationAngle) {
            this.rotationAngle =  rotationAngle;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getRotationAngle() {
            return rotationAngle;
        }

        public void setRotationAngle(Integer rotationAngle) {
            this.rotationAngle = rotationAngle;
        }

        @SerializedName("Text")
        private String text ;

        public  DisplayUnitLabel  text(String  text) {
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

        @SerializedName("TextHorizontalAlignment")
        private String textHorizontalAlignment ;

        public  DisplayUnitLabel  textHorizontalAlignment(String  textHorizontalAlignment) {
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

        @SerializedName("TextVerticalAlignment")
        private String textVerticalAlignment ;

        public  DisplayUnitLabel  textVerticalAlignment(String  textVerticalAlignment) {
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

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            DisplayUnitLabel displayUnitLabel = (DisplayUnitLabel) o;
            return
                Objects.equals(this.linkedSource, displayUnitLabel.linkedSource) &&
                Objects.equals(this.rotationAngle, displayUnitLabel.rotationAngle) &&
                Objects.equals(this.text, displayUnitLabel.text) &&
                Objects.equals(this.textHorizontalAlignment, displayUnitLabel.textHorizontalAlignment) &&
                Objects.equals(this.textVerticalAlignment, displayUnitLabel.textVerticalAlignment) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(linkedSource, rotationAngle, text, textHorizontalAlignment, textVerticalAlignment, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DisplayUnitLabel {\n");
            sb.append("    linkedSource: ").append(toIndentedString(getLinkedSource())).append("\n");
            sb.append("    rotationAngle: ").append(toIndentedString(getRotationAngle())).append("\n");
            sb.append("    text: ").append(toIndentedString(getText())).append("\n");
            sb.append("    textHorizontalAlignment: ").append(toIndentedString(getTextHorizontalAlignment())).append("\n");
            sb.append("    textVerticalAlignment: ").append(toIndentedString(getTextVerticalAlignment())).append("\n");
            sb.append("    area: ").append(toIndentedString(getArea())).append("\n");
            sb.append("    autoScaleFont: ").append(toIndentedString(getAutoScaleFont())).append("\n");
            sb.append("    backgroundMode: ").append(toIndentedString(getBackgroundMode())).append("\n");
            sb.append("    border: ").append(toIndentedString(getBorder())).append("\n");
            sb.append("    font: ").append(toIndentedString(getFont())).append("\n");
            sb.append("    isAutomaticSize: ").append(toIndentedString(getIsAutomaticSize())).append("\n");
            sb.append("    isInnerMode: ").append(toIndentedString(getIsInnerMode())).append("\n");
            sb.append("    shadow: ").append(toIndentedString(getShadow())).append("\n");
            sb.append("    width: ").append(toIndentedString(getWidth())).append("\n");
            sb.append("    height: ").append(toIndentedString(getHeight())).append("\n");
            sb.append("    x: ").append(toIndentedString(getX())).append("\n");
            sb.append("    y: ").append(toIndentedString(getY())).append("\n");
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

