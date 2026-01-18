/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AutoFilter.java">
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


public class AutoFilter  extends  LinkElement {
        @SerializedName("FilterColumns")
        private List<FilterColumn> filterColumns ;

        public  AutoFilter  filterColumns(List<FilterColumn>  filterColumns) {
            this.filterColumns =  filterColumns;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<FilterColumn> getFilterColumns() {
            return filterColumns;
        }

        public void setFilterColumns(List<FilterColumn> filterColumns) {
            this.filterColumns = filterColumns;
        }

        @SerializedName("Range")
        private String range ;

        public  AutoFilter  range(String  range) {
            this.range =  range;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getRange() {
            return range;
        }

        public void setRange(String range) {
            this.range = range;
        }

        @SerializedName("Sorter")
        private DataSorter sorter ;

        public  AutoFilter  sorter(DataSorter  sorter) {
            this.sorter =  sorter;
            return this;
        }

        @ApiModelProperty(value = "")
        public DataSorter getSorter() {
            return sorter;
        }

        public void setSorter(DataSorter sorter) {
            this.sorter = sorter;
        }

        @SerializedName("ShowFilterButton")
        private Boolean showFilterButton ;

        public  AutoFilter  showFilterButton(Boolean  showFilterButton) {
            this.showFilterButton =  showFilterButton;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getShowFilterButton() {
            return showFilterButton;
        }

        public void setShowFilterButton(Boolean showFilterButton) {
            this.showFilterButton = showFilterButton;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            AutoFilter autoFilter = (AutoFilter) o;
            return
                Objects.equals(this.filterColumns, autoFilter.filterColumns) &&
                Objects.equals(this.range, autoFilter.range) &&
                Objects.equals(this.sorter, autoFilter.sorter) &&
                Objects.equals(this.showFilterButton, autoFilter.showFilterButton) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(filterColumns, range, sorter, showFilterButton, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AutoFilter {\n");
            sb.append("    filterColumns: ").append(toIndentedString(getFilterColumns())).append("\n");
            sb.append("    range: ").append(toIndentedString(getRange())).append("\n");
            sb.append("    sorter: ").append(toIndentedString(getSorter())).append("\n");
            sb.append("    showFilterButton: ").append(toIndentedString(getShowFilterButton())).append("\n");
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

