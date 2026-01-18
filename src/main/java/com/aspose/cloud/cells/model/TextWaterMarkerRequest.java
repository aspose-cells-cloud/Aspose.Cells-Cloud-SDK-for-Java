/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TextWaterMarkerRequest.java">
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


public class TextWaterMarkerRequest {
        @SerializedName("Text")
        private String text ;

        public  TextWaterMarkerRequest  text(String  text) {
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

        @SerializedName("FontName")
        private String fontName ;

        public  TextWaterMarkerRequest  fontName(String  fontName) {
            this.fontName =  fontName;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getFontName() {
            return fontName;
        }

        public void setFontName(String fontName) {
            this.fontName = fontName;
        }

        @SerializedName("FontSize")
        private Integer fontSize ;

        public  TextWaterMarkerRequest  fontSize(Integer  fontSize) {
            this.fontSize =  fontSize;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getFontSize() {
            return fontSize;
        }

        public void setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
        }

        @SerializedName("Height")
        private Integer height ;

        public  TextWaterMarkerRequest  height(Integer  height) {
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

        @SerializedName("Width")
        private Integer width ;

        public  TextWaterMarkerRequest  width(Integer  width) {
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

        @SerializedName("ImageAdaptOption")
        private String imageAdaptOption ;

        public  TextWaterMarkerRequest  imageAdaptOption(String  imageAdaptOption) {
            this.imageAdaptOption =  imageAdaptOption;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getImageAdaptOption() {
            return imageAdaptOption;
        }

        public void setImageAdaptOption(String imageAdaptOption) {
            this.imageAdaptOption = imageAdaptOption;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            TextWaterMarkerRequest textWaterMarkerRequest = (TextWaterMarkerRequest) o;
            return
                Objects.equals(this.text, textWaterMarkerRequest.text) &&
                Objects.equals(this.fontName, textWaterMarkerRequest.fontName) &&
                Objects.equals(this.fontSize, textWaterMarkerRequest.fontSize) &&
                Objects.equals(this.height, textWaterMarkerRequest.height) &&
                Objects.equals(this.width, textWaterMarkerRequest.width) &&
                Objects.equals(this.imageAdaptOption, textWaterMarkerRequest.imageAdaptOption);
      }

      @Override
      public int hashCode() {
        return Objects.hash(text, fontName, fontSize, height, width, imageAdaptOption);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TextWaterMarkerRequest {\n");
            sb.append("    text: ").append(toIndentedString(getText())).append("\n");
            sb.append("    fontName: ").append(toIndentedString(getFontName())).append("\n");
            sb.append("    fontSize: ").append(toIndentedString(getFontSize())).append("\n");
            sb.append("    height: ").append(toIndentedString(getHeight())).append("\n");
            sb.append("    width: ").append(toIndentedString(getWidth())).append("\n");
            sb.append("    imageAdaptOption: ").append(toIndentedString(getImageAdaptOption())).append("\n");
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

