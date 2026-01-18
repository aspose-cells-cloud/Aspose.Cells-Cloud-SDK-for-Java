/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ChartDataTable.java">
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


public class ChartDataTable  extends  LinkElement {
        @SerializedName("AutoScaleFont")
        private Boolean autoScaleFont ;

        public  ChartDataTable  autoScaleFont(Boolean  autoScaleFont) {
            this.autoScaleFont =  autoScaleFont;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getAutoScaleFont() {
            return autoScaleFont;
        }

        public void setAutoScaleFont(Boolean autoScaleFont) {
            this.autoScaleFont = autoScaleFont;
        }

        @SerializedName("BackgroundMode")
        private String backgroundMode ;

        public  ChartDataTable  backgroundMode(String  backgroundMode) {
            this.backgroundMode =  backgroundMode;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getBackgroundMode() {
            return backgroundMode;
        }

        public void setBackgroundMode(String backgroundMode) {
            this.backgroundMode = backgroundMode;
        }

        @SerializedName("Border")
        private Line border ;

        public  ChartDataTable  border(Line  border) {
            this.border =  border;
            return this;
        }

        @ApiModelProperty(value = "")
        public Line getBorder() {
            return border;
        }

        public void setBorder(Line border) {
            this.border = border;
        }

        @SerializedName("Font")
        private Font font ;

        public  ChartDataTable  font(Font  font) {
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

        @SerializedName("HasBorderHorizontal")
        private Boolean hasBorderHorizontal ;

        public  ChartDataTable  hasBorderHorizontal(Boolean  hasBorderHorizontal) {
            this.hasBorderHorizontal =  hasBorderHorizontal;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getHasBorderHorizontal() {
            return hasBorderHorizontal;
        }

        public void setHasBorderHorizontal(Boolean hasBorderHorizontal) {
            this.hasBorderHorizontal = hasBorderHorizontal;
        }

        @SerializedName("HasBorderOutline")
        private Boolean hasBorderOutline ;

        public  ChartDataTable  hasBorderOutline(Boolean  hasBorderOutline) {
            this.hasBorderOutline =  hasBorderOutline;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getHasBorderOutline() {
            return hasBorderOutline;
        }

        public void setHasBorderOutline(Boolean hasBorderOutline) {
            this.hasBorderOutline = hasBorderOutline;
        }

        @SerializedName("HasBorderVertical")
        private Boolean hasBorderVertical ;

        public  ChartDataTable  hasBorderVertical(Boolean  hasBorderVertical) {
            this.hasBorderVertical =  hasBorderVertical;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getHasBorderVertical() {
            return hasBorderVertical;
        }

        public void setHasBorderVertical(Boolean hasBorderVertical) {
            this.hasBorderVertical = hasBorderVertical;
        }

        @SerializedName("ShowLegendKey")
        private Boolean showLegendKey ;

        public  ChartDataTable  showLegendKey(Boolean  showLegendKey) {
            this.showLegendKey =  showLegendKey;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getShowLegendKey() {
            return showLegendKey;
        }

        public void setShowLegendKey(Boolean showLegendKey) {
            this.showLegendKey = showLegendKey;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ChartDataTable chartDataTable = (ChartDataTable) o;
            return
                Objects.equals(this.autoScaleFont, chartDataTable.autoScaleFont) &&
                Objects.equals(this.backgroundMode, chartDataTable.backgroundMode) &&
                Objects.equals(this.border, chartDataTable.border) &&
                Objects.equals(this.font, chartDataTable.font) &&
                Objects.equals(this.hasBorderHorizontal, chartDataTable.hasBorderHorizontal) &&
                Objects.equals(this.hasBorderOutline, chartDataTable.hasBorderOutline) &&
                Objects.equals(this.hasBorderVertical, chartDataTable.hasBorderVertical) &&
                Objects.equals(this.showLegendKey, chartDataTable.showLegendKey) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(autoScaleFont, backgroundMode, border, font, hasBorderHorizontal, hasBorderOutline, hasBorderVertical, showLegendKey, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ChartDataTable {\n");
            sb.append("    autoScaleFont: ").append(toIndentedString(getAutoScaleFont())).append("\n");
            sb.append("    backgroundMode: ").append(toIndentedString(getBackgroundMode())).append("\n");
            sb.append("    border: ").append(toIndentedString(getBorder())).append("\n");
            sb.append("    font: ").append(toIndentedString(getFont())).append("\n");
            sb.append("    hasBorderHorizontal: ").append(toIndentedString(getHasBorderHorizontal())).append("\n");
            sb.append("    hasBorderOutline: ").append(toIndentedString(getHasBorderOutline())).append("\n");
            sb.append("    hasBorderVertical: ").append(toIndentedString(getHasBorderVertical())).append("\n");
            sb.append("    showLegendKey: ").append(toIndentedString(getShowLegendKey())).append("\n");
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

