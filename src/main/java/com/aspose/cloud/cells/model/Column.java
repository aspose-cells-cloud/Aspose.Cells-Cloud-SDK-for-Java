/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Column.java">
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


public class Column  extends  LinkElement {
        @SerializedName("GroupLevel")
        private Integer groupLevel ;

        public  Column  groupLevel(Integer  groupLevel) {
            this.groupLevel =  groupLevel;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getGroupLevel() {
            return groupLevel;
        }

        public void setGroupLevel(Integer groupLevel) {
            this.groupLevel = groupLevel;
        }

        @SerializedName("Index")
        private Integer index ;

        public  Column  index(Integer  index) {
            this.index =  index;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getIndex() {
            return index;
        }

        public void setIndex(Integer index) {
            this.index = index;
        }

        @SerializedName("IsHidden")
        private Boolean isHidden ;

        public  Column  isHidden(Boolean  isHidden) {
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

        @SerializedName("Width")
        private Double width ;

        public  Column  width(Double  width) {
            this.width =  width;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getWidth() {
            return width;
        }

        public void setWidth(Double width) {
            this.width = width;
        }

        @SerializedName("Style")
        private LinkElement style ;

        public  Column  style(LinkElement  style) {
            this.style =  style;
            return this;
        }

        @ApiModelProperty(value = "")
        public LinkElement getStyle() {
            return style;
        }

        public void setStyle(LinkElement style) {
            this.style = style;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Column column = (Column) o;
            return
                Objects.equals(this.groupLevel, column.groupLevel) &&
                Objects.equals(this.index, column.index) &&
                Objects.equals(this.isHidden, column.isHidden) &&
                Objects.equals(this.width, column.width) &&
                Objects.equals(this.style, column.style) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(groupLevel, index, isHidden, width, style, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Column {\n");
            sb.append("    groupLevel: ").append(toIndentedString(getGroupLevel())).append("\n");
            sb.append("    index: ").append(toIndentedString(getIndex())).append("\n");
            sb.append("    isHidden: ").append(toIndentedString(getIsHidden())).append("\n");
            sb.append("    width: ").append(toIndentedString(getWidth())).append("\n");
            sb.append("    style: ").append(toIndentedString(getStyle())).append("\n");
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

