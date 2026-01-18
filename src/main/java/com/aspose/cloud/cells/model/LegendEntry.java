/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="LegendEntry.java">
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


public class LegendEntry  extends  LinkElement {
        @SerializedName("AutoScaleFont")
        private Boolean autoScaleFont ;

        public  LegendEntry  autoScaleFont(Boolean  autoScaleFont) {
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

        public  LegendEntry  backgroundMode(String  backgroundMode) {
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

        @SerializedName("Font")
        private Font font ;

        public  LegendEntry  font(Font  font) {
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

        @SerializedName("IsDeleted")
        private Boolean isDeleted ;

        public  LegendEntry  isDeleted(Boolean  isDeleted) {
            this.isDeleted =  isDeleted;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsDeleted() {
            return isDeleted;
        }

        public void setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            LegendEntry legendEntry = (LegendEntry) o;
            return
                Objects.equals(this.autoScaleFont, legendEntry.autoScaleFont) &&
                Objects.equals(this.backgroundMode, legendEntry.backgroundMode) &&
                Objects.equals(this.font, legendEntry.font) &&
                Objects.equals(this.isDeleted, legendEntry.isDeleted) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(autoScaleFont, backgroundMode, font, isDeleted, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LegendEntry {\n");
            sb.append("    autoScaleFont: ").append(toIndentedString(getAutoScaleFont())).append("\n");
            sb.append("    backgroundMode: ").append(toIndentedString(getBackgroundMode())).append("\n");
            sb.append("    font: ").append(toIndentedString(getFont())).append("\n");
            sb.append("    isDeleted: ").append(toIndentedString(getIsDeleted())).append("\n");
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

