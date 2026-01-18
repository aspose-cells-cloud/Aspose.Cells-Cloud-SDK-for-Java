/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TextOptions.java">
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


public class TextOptions  extends  Font {
        @SerializedName("Fill")
        private FillFormat fill ;

        public  TextOptions  fill(FillFormat  fill) {
            this.fill =  fill;
            return this;
        }

        @ApiModelProperty(value = "")
        public FillFormat getFill() {
            return fill;
        }

        public void setFill(FillFormat fill) {
            this.fill = fill;
        }

        @SerializedName("Kerning")
        private Double kerning ;

        public  TextOptions  kerning(Double  kerning) {
            this.kerning =  kerning;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getKerning() {
            return kerning;
        }

        public void setKerning(Double kerning) {
            this.kerning = kerning;
        }

        @SerializedName("Outline")
        private LineFormat outline ;

        public  TextOptions  outline(LineFormat  outline) {
            this.outline =  outline;
            return this;
        }

        @ApiModelProperty(value = "")
        public LineFormat getOutline() {
            return outline;
        }

        public void setOutline(LineFormat outline) {
            this.outline = outline;
        }

        @SerializedName("Shadow")
        private ShadowEffect shadow ;

        public  TextOptions  shadow(ShadowEffect  shadow) {
            this.shadow =  shadow;
            return this;
        }

        @ApiModelProperty(value = "")
        public ShadowEffect getShadow() {
            return shadow;
        }

        public void setShadow(ShadowEffect shadow) {
            this.shadow = shadow;
        }

        @SerializedName("Spacing")
        private Double spacing ;

        public  TextOptions  spacing(Double  spacing) {
            this.spacing =  spacing;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getSpacing() {
            return spacing;
        }

        public void setSpacing(Double spacing) {
            this.spacing = spacing;
        }

        @SerializedName("UnderlineColor")
        private CellsColor underlineColor ;

        public  TextOptions  underlineColor(CellsColor  underlineColor) {
            this.underlineColor =  underlineColor;
            return this;
        }

        @ApiModelProperty(value = "")
        public CellsColor getUnderlineColor() {
            return underlineColor;
        }

        public void setUnderlineColor(CellsColor underlineColor) {
            this.underlineColor = underlineColor;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            TextOptions textOptions = (TextOptions) o;
            return
                Objects.equals(this.fill, textOptions.fill) &&
                Objects.equals(this.kerning, textOptions.kerning) &&
                Objects.equals(this.outline, textOptions.outline) &&
                Objects.equals(this.shadow, textOptions.shadow) &&
                Objects.equals(this.spacing, textOptions.spacing) &&
                Objects.equals(this.underlineColor, textOptions.underlineColor) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(fill, kerning, outline, shadow, spacing, underlineColor, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TextOptions {\n");
            sb.append("    fill: ").append(toIndentedString(getFill())).append("\n");
            sb.append("    kerning: ").append(toIndentedString(getKerning())).append("\n");
            sb.append("    outline: ").append(toIndentedString(getOutline())).append("\n");
            sb.append("    shadow: ").append(toIndentedString(getShadow())).append("\n");
            sb.append("    spacing: ").append(toIndentedString(getSpacing())).append("\n");
            sb.append("    underlineColor: ").append(toIndentedString(getUnderlineColor())).append("\n");
            sb.append("    color: ").append(toIndentedString(getColor())).append("\n");
            sb.append("    doubleSize: ").append(toIndentedString(getDoubleSize())).append("\n");
            sb.append("    isBold: ").append(toIndentedString(getIsBold())).append("\n");
            sb.append("    isItalic: ").append(toIndentedString(getIsItalic())).append("\n");
            sb.append("    isStrikeout: ").append(toIndentedString(getIsStrikeout())).append("\n");
            sb.append("    isSubscript: ").append(toIndentedString(getIsSubscript())).append("\n");
            sb.append("    isSuperscript: ").append(toIndentedString(getIsSuperscript())).append("\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    size: ").append(toIndentedString(getSize())).append("\n");
            sb.append("    underline: ").append(toIndentedString(getUnderline())).append("\n");
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

