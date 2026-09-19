/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FillFormat.java">
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


public class FillFormat {
        @SerializedName("Type")
        private String type ;

        public  FillFormat  type(String  type) {
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

        @SerializedName("SolidFill")
        private SolidFill solidFill ;

        public  FillFormat  solidFill(SolidFill  solidFill) {
            this.solidFill =  solidFill;
            return this;
        }

        @ApiModelProperty(value = "")
        public SolidFill getSolidFill() {
            return solidFill;
        }

        public void setSolidFill(SolidFill solidFill) {
            this.solidFill = solidFill;
        }

        @SerializedName("PatternFill")
        private PatternFill patternFill ;

        public  FillFormat  patternFill(PatternFill  patternFill) {
            this.patternFill =  patternFill;
            return this;
        }

        @ApiModelProperty(value = "")
        public PatternFill getPatternFill() {
            return patternFill;
        }

        public void setPatternFill(PatternFill patternFill) {
            this.patternFill = patternFill;
        }

        @SerializedName("TextureFill")
        private TextureFill textureFill ;

        public  FillFormat  textureFill(TextureFill  textureFill) {
            this.textureFill =  textureFill;
            return this;
        }

        @ApiModelProperty(value = "")
        public TextureFill getTextureFill() {
            return textureFill;
        }

        public void setTextureFill(TextureFill textureFill) {
            this.textureFill = textureFill;
        }

        @SerializedName("GradientFill")
        private GradientFill gradientFill ;

        public  FillFormat  gradientFill(GradientFill  gradientFill) {
            this.gradientFill =  gradientFill;
            return this;
        }

        @ApiModelProperty(value = "")
        public GradientFill getGradientFill() {
            return gradientFill;
        }

        public void setGradientFill(GradientFill gradientFill) {
            this.gradientFill = gradientFill;
        }

        @SerializedName("ImageData")
        private String imageData ;

        public  FillFormat  imageData(String  imageData) {
            this.imageData =  imageData;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getImageData() {
            return imageData;
        }

        public void setImageData(String imageData) {
            this.imageData = imageData;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            FillFormat fillFormat = (FillFormat) o;
            return
                Objects.equals(this.type, fillFormat.type) &&
                Objects.equals(this.solidFill, fillFormat.solidFill) &&
                Objects.equals(this.patternFill, fillFormat.patternFill) &&
                Objects.equals(this.textureFill, fillFormat.textureFill) &&
                Objects.equals(this.gradientFill, fillFormat.gradientFill) &&
                Objects.equals(this.imageData, fillFormat.imageData);
      }

      @Override
      public int hashCode() {
        return Objects.hash(type, solidFill, patternFill, textureFill, gradientFill, imageData);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class FillFormat {\n");
            sb.append("    type: ").append(toIndentedString(getType())).append("\n");
            sb.append("    solidFill: ").append(toIndentedString(getSolidFill())).append("\n");
            sb.append("    patternFill: ").append(toIndentedString(getPatternFill())).append("\n");
            sb.append("    textureFill: ").append(toIndentedString(getTextureFill())).append("\n");
            sb.append("    gradientFill: ").append(toIndentedString(getGradientFill())).append("\n");
            sb.append("    imageData: ").append(toIndentedString(getImageData())).append("\n");
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

