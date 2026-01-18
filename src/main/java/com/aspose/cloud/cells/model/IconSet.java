/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="IconSet.java">
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


public class IconSet {
        @SerializedName("CfIcons")
        private List<ConditionalFormattingIcon> cfIcons ;

        public  IconSet  cfIcons(List<ConditionalFormattingIcon>  cfIcons) {
            this.cfIcons =  cfIcons;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<ConditionalFormattingIcon> getCfIcons() {
            return cfIcons;
        }

        public void setCfIcons(List<ConditionalFormattingIcon> cfIcons) {
            this.cfIcons = cfIcons;
        }

        @SerializedName("Cfvos")
        private List<ConditionalFormattingValue> cfvos ;

        public  IconSet  cfvos(List<ConditionalFormattingValue>  cfvos) {
            this.cfvos =  cfvos;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<ConditionalFormattingValue> getCfvos() {
            return cfvos;
        }

        public void setCfvos(List<ConditionalFormattingValue> cfvos) {
            this.cfvos = cfvos;
        }

        @SerializedName("IsCustom")
        private Boolean isCustom ;

        public  IconSet  isCustom(Boolean  isCustom) {
            this.isCustom =  isCustom;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsCustom() {
            return isCustom;
        }

        public void setIsCustom(Boolean isCustom) {
            this.isCustom = isCustom;
        }

        @SerializedName("Reverse")
        private Boolean reverse ;

        public  IconSet  reverse(Boolean  reverse) {
            this.reverse =  reverse;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getReverse() {
            return reverse;
        }

        public void setReverse(Boolean reverse) {
            this.reverse = reverse;
        }

        @SerializedName("ShowValue")
        private Boolean showValue ;

        public  IconSet  showValue(Boolean  showValue) {
            this.showValue =  showValue;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getShowValue() {
            return showValue;
        }

        public void setShowValue(Boolean showValue) {
            this.showValue = showValue;
        }

        @SerializedName("IconSetType")
        private String iconSetType ;

        public  IconSet  iconSetType(String  iconSetType) {
            this.iconSetType =  iconSetType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getIconSetType() {
            return iconSetType;
        }

        public void setIconSetType(String iconSetType) {
            this.iconSetType = iconSetType;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            IconSet iconSet = (IconSet) o;
            return
                Objects.equals(this.cfIcons, iconSet.cfIcons) &&
                Objects.equals(this.cfvos, iconSet.cfvos) &&
                Objects.equals(this.isCustom, iconSet.isCustom) &&
                Objects.equals(this.reverse, iconSet.reverse) &&
                Objects.equals(this.showValue, iconSet.showValue) &&
                Objects.equals(this.iconSetType, iconSet.iconSetType);
      }

      @Override
      public int hashCode() {
        return Objects.hash(cfIcons, cfvos, isCustom, reverse, showValue, iconSetType);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class IconSet {\n");
            sb.append("    cfIcons: ").append(toIndentedString(getCfIcons())).append("\n");
            sb.append("    cfvos: ").append(toIndentedString(getCfvos())).append("\n");
            sb.append("    isCustom: ").append(toIndentedString(getIsCustom())).append("\n");
            sb.append("    reverse: ").append(toIndentedString(getReverse())).append("\n");
            sb.append("    showValue: ").append(toIndentedString(getShowValue())).append("\n");
            sb.append("    iconSetType: ").append(toIndentedString(getIconSetType())).append("\n");
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

