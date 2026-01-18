/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FilterColumn.java">
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


public class FilterColumn {
        @SerializedName("FieldIndex")
        private Integer fieldIndex ;

        public  FilterColumn  fieldIndex(Integer  fieldIndex) {
            this.fieldIndex =  fieldIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getFieldIndex() {
            return fieldIndex;
        }

        public void setFieldIndex(Integer fieldIndex) {
            this.fieldIndex = fieldIndex;
        }

        @SerializedName("FilterType")
        private String filterType ;

        public  FilterColumn  filterType(String  filterType) {
            this.filterType =  filterType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getFilterType() {
            return filterType;
        }

        public void setFilterType(String filterType) {
            this.filterType = filterType;
        }

        @SerializedName("MultipleFilters")
        private MultipleFilters multipleFilters ;

        public  FilterColumn  multipleFilters(MultipleFilters  multipleFilters) {
            this.multipleFilters =  multipleFilters;
            return this;
        }

        @ApiModelProperty(value = "")
        public MultipleFilters getMultipleFilters() {
            return multipleFilters;
        }

        public void setMultipleFilters(MultipleFilters multipleFilters) {
            this.multipleFilters = multipleFilters;
        }

        @SerializedName("ColorFilter")
        private ColorFilter colorFilter ;

        public  FilterColumn  colorFilter(ColorFilter  colorFilter) {
            this.colorFilter =  colorFilter;
            return this;
        }

        @ApiModelProperty(value = "")
        public ColorFilter getColorFilter() {
            return colorFilter;
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.colorFilter = colorFilter;
        }

        @SerializedName("CustomFilters")
        private List<CustomFilter> customFilters ;

        public  FilterColumn  customFilters(List<CustomFilter>  customFilters) {
            this.customFilters =  customFilters;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<CustomFilter> getCustomFilters() {
            return customFilters;
        }

        public void setCustomFilters(List<CustomFilter> customFilters) {
            this.customFilters = customFilters;
        }

        @SerializedName("DynamicFilter")
        private DynamicFilter dynamicFilter ;

        public  FilterColumn  dynamicFilter(DynamicFilter  dynamicFilter) {
            this.dynamicFilter =  dynamicFilter;
            return this;
        }

        @ApiModelProperty(value = "")
        public DynamicFilter getDynamicFilter() {
            return dynamicFilter;
        }

        public void setDynamicFilter(DynamicFilter dynamicFilter) {
            this.dynamicFilter = dynamicFilter;
        }

        @SerializedName("IconFilter")
        private IconFilter iconFilter ;

        public  FilterColumn  iconFilter(IconFilter  iconFilter) {
            this.iconFilter =  iconFilter;
            return this;
        }

        @ApiModelProperty(value = "")
        public IconFilter getIconFilter() {
            return iconFilter;
        }

        public void setIconFilter(IconFilter iconFilter) {
            this.iconFilter = iconFilter;
        }

        @SerializedName("Top10Filter")
        private Top10Filter top10Filter ;

        public  FilterColumn  top10Filter(Top10Filter  top10Filter) {
            this.top10Filter =  top10Filter;
            return this;
        }

        @ApiModelProperty(value = "")
        public Top10Filter getTop10Filter() {
            return top10Filter;
        }

        public void setTop10Filter(Top10Filter top10Filter) {
            this.top10Filter = top10Filter;
        }

        @SerializedName("Visibledropdown")
        private String visibledropdown ;

        public  FilterColumn  visibledropdown(String  visibledropdown) {
            this.visibledropdown =  visibledropdown;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getVisibledropdown() {
            return visibledropdown;
        }

        public void setVisibledropdown(String visibledropdown) {
            this.visibledropdown = visibledropdown;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            FilterColumn filterColumn = (FilterColumn) o;
            return
                Objects.equals(this.fieldIndex, filterColumn.fieldIndex) &&
                Objects.equals(this.filterType, filterColumn.filterType) &&
                Objects.equals(this.multipleFilters, filterColumn.multipleFilters) &&
                Objects.equals(this.colorFilter, filterColumn.colorFilter) &&
                Objects.equals(this.customFilters, filterColumn.customFilters) &&
                Objects.equals(this.dynamicFilter, filterColumn.dynamicFilter) &&
                Objects.equals(this.iconFilter, filterColumn.iconFilter) &&
                Objects.equals(this.top10Filter, filterColumn.top10Filter) &&
                Objects.equals(this.visibledropdown, filterColumn.visibledropdown);
      }

      @Override
      public int hashCode() {
        return Objects.hash(fieldIndex, filterType, multipleFilters, colorFilter, customFilters, dynamicFilter, iconFilter, top10Filter, visibledropdown);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class FilterColumn {\n");
            sb.append("    fieldIndex: ").append(toIndentedString(getFieldIndex())).append("\n");
            sb.append("    filterType: ").append(toIndentedString(getFilterType())).append("\n");
            sb.append("    multipleFilters: ").append(toIndentedString(getMultipleFilters())).append("\n");
            sb.append("    colorFilter: ").append(toIndentedString(getColorFilter())).append("\n");
            sb.append("    customFilters: ").append(toIndentedString(getCustomFilters())).append("\n");
            sb.append("    dynamicFilter: ").append(toIndentedString(getDynamicFilter())).append("\n");
            sb.append("    iconFilter: ").append(toIndentedString(getIconFilter())).append("\n");
            sb.append("    top10Filter: ").append(toIndentedString(getTop10Filter())).append("\n");
            sb.append("    visibledropdown: ").append(toIndentedString(getVisibledropdown())).append("\n");
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

