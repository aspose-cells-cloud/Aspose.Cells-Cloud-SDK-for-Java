/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DataSorterKey.java">
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


public class DataSorterKey {
        @SerializedName("Order")
        private String order ;

        public  DataSorterKey  order(String  order) {
            this.order =  order;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getOrder() {
            return order;
        }

        public void setOrder(String order) {
            this.order = order;
        }

        @SerializedName("Index")
        private Integer index ;

        public  DataSorterKey  index(Integer  index) {
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

        @SerializedName("Type")
        private String type ;

        public  DataSorterKey  type(String  type) {
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

        @SerializedName("IconSetType")
        private String iconSetType ;

        public  DataSorterKey  iconSetType(String  iconSetType) {
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

        @SerializedName("IconId")
        private Integer iconId ;

        public  DataSorterKey  iconId(Integer  iconId) {
            this.iconId =  iconId;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getIconId() {
            return iconId;
        }

        public void setIconId(Integer iconId) {
            this.iconId = iconId;
        }

        @SerializedName("Color")
        private Color color ;

        public  DataSorterKey  color(Color  color) {
            this.color =  color;
            return this;
        }

        @ApiModelProperty(value = "")
        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            DataSorterKey dataSorterKey = (DataSorterKey) o;
            return
                Objects.equals(this.order, dataSorterKey.order) &&
                Objects.equals(this.index, dataSorterKey.index) &&
                Objects.equals(this.type, dataSorterKey.type) &&
                Objects.equals(this.iconSetType, dataSorterKey.iconSetType) &&
                Objects.equals(this.iconId, dataSorterKey.iconId) &&
                Objects.equals(this.color, dataSorterKey.color);
      }

      @Override
      public int hashCode() {
        return Objects.hash(order, index, type, iconSetType, iconId, color);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DataSorterKey {\n");
            sb.append("    order: ").append(toIndentedString(getOrder())).append("\n");
            sb.append("    index: ").append(toIndentedString(getIndex())).append("\n");
            sb.append("    type: ").append(toIndentedString(getType())).append("\n");
            sb.append("    iconSetType: ").append(toIndentedString(getIconSetType())).append("\n");
            sb.append("    iconId: ").append(toIndentedString(getIconId())).append("\n");
            sb.append("    color: ").append(toIndentedString(getColor())).append("\n");
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

