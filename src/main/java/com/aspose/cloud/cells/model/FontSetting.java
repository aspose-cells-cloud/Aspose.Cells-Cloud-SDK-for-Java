/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FontSetting.java">
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


public class FontSetting {
        @SerializedName("Font")
        private Font font ;

        public  FontSetting  font(Font  font) {
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

        @SerializedName("Length")
        private Integer length ;

        public  FontSetting  length(Integer  length) {
            this.length =  length;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getLength() {
            return length;
        }

        public void setLength(Integer length) {
            this.length = length;
        }

        @SerializedName("StartIndex")
        private Integer startIndex ;

        public  FontSetting  startIndex(Integer  startIndex) {
            this.startIndex =  startIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getStartIndex() {
            return startIndex;
        }

        public void setStartIndex(Integer startIndex) {
            this.startIndex = startIndex;
        }

        @SerializedName("TextOptions")
        private TextOptions textOptions ;

        public  FontSetting  textOptions(TextOptions  textOptions) {
            this.textOptions =  textOptions;
            return this;
        }

        @ApiModelProperty(value = "")
        public TextOptions getTextOptions() {
            return textOptions;
        }

        public void setTextOptions(TextOptions textOptions) {
            this.textOptions = textOptions;
        }

        @SerializedName("Type")
        private String type ;

        public  FontSetting  type(String  type) {
            this.type =  type;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            FontSetting fontSetting = (FontSetting) o;
            return
                Objects.equals(this.font, fontSetting.font) &&
                Objects.equals(this.length, fontSetting.length) &&
                Objects.equals(this.startIndex, fontSetting.startIndex) &&
                Objects.equals(this.textOptions, fontSetting.textOptions) &&
                Objects.equals(this.type, fontSetting.type);
      }

      @Override
      public int hashCode() {
        return Objects.hash(font, length, startIndex, textOptions, type);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class FontSetting {\n");
            sb.append("    font: ").append(toIndentedString(getFont())).append("\n");
            sb.append("    length: ").append(toIndentedString(getLength())).append("\n");
            sb.append("    startIndex: ").append(toIndentedString(getStartIndex())).append("\n");
            sb.append("    textOptions: ").append(toIndentedString(getTextOptions())).append("\n");
            sb.append("    type: ").append(toIndentedString(getType())).append("\n");
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

