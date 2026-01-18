/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PivotItem.java">
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


public class PivotItem {
        @SerializedName("Index")
        private Integer index ;

        public  PivotItem  index(Integer  index) {
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

        public  PivotItem  isHidden(Boolean  isHidden) {
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

        @SerializedName("Name")
        private String name ;

        public  PivotItem  name(String  name) {
            this.name =  name;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @SerializedName("Value")
        private String value ;

        public  PivotItem  value(String  value) {
            this.value =  value;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            PivotItem pivotItem = (PivotItem) o;
            return
                Objects.equals(this.index, pivotItem.index) &&
                Objects.equals(this.isHidden, pivotItem.isHidden) &&
                Objects.equals(this.name, pivotItem.name) &&
                Objects.equals(this.value, pivotItem.value);
      }

      @Override
      public int hashCode() {
        return Objects.hash(index, isHidden, name, value);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PivotItem {\n");
            sb.append("    index: ").append(toIndentedString(getIndex())).append("\n");
            sb.append("    isHidden: ").append(toIndentedString(getIsHidden())).append("\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    value: ").append(toIndentedString(getValue())).append("\n");
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

