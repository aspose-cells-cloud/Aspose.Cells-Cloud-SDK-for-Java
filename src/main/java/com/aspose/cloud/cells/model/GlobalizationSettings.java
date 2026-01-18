/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GlobalizationSettings.java">
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


public class GlobalizationSettings {
        @SerializedName("ChartSettings")
        private ChartGlobalizationSettings chartSettings ;

        public  GlobalizationSettings  chartSettings(ChartGlobalizationSettings  chartSettings) {
            this.chartSettings =  chartSettings;
            return this;
        }

        @ApiModelProperty(value = "")
        public ChartGlobalizationSettings getChartSettings() {
            return chartSettings;
        }

        public void setChartSettings(ChartGlobalizationSettings chartSettings) {
            this.chartSettings = chartSettings;
        }

        @SerializedName("PivotSettings")
        private PivotGlobalizationSettings pivotSettings ;

        public  GlobalizationSettings  pivotSettings(PivotGlobalizationSettings  pivotSettings) {
            this.pivotSettings =  pivotSettings;
            return this;
        }

        @ApiModelProperty(value = "")
        public PivotGlobalizationSettings getPivotSettings() {
            return pivotSettings;
        }

        public void setPivotSettings(PivotGlobalizationSettings pivotSettings) {
            this.pivotSettings = pivotSettings;
        }

        @SerializedName("ListSeparator")
        private String listSeparator ;

        public  GlobalizationSettings  listSeparator(String  listSeparator) {
            this.listSeparator =  listSeparator;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getListSeparator() {
            return listSeparator;
        }

        public void setListSeparator(String listSeparator) {
            this.listSeparator = listSeparator;
        }

        @SerializedName("RowSeparatorOfFormulaArray")
        private String rowSeparatorOfFormulaArray ;

        public  GlobalizationSettings  rowSeparatorOfFormulaArray(String  rowSeparatorOfFormulaArray) {
            this.rowSeparatorOfFormulaArray =  rowSeparatorOfFormulaArray;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getRowSeparatorOfFormulaArray() {
            return rowSeparatorOfFormulaArray;
        }

        public void setRowSeparatorOfFormulaArray(String rowSeparatorOfFormulaArray) {
            this.rowSeparatorOfFormulaArray = rowSeparatorOfFormulaArray;
        }

        @SerializedName("ColumnSeparatorOfFormulaArray")
        private String columnSeparatorOfFormulaArray ;

        public  GlobalizationSettings  columnSeparatorOfFormulaArray(String  columnSeparatorOfFormulaArray) {
            this.columnSeparatorOfFormulaArray =  columnSeparatorOfFormulaArray;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getColumnSeparatorOfFormulaArray() {
            return columnSeparatorOfFormulaArray;
        }

        public void setColumnSeparatorOfFormulaArray(String columnSeparatorOfFormulaArray) {
            this.columnSeparatorOfFormulaArray = columnSeparatorOfFormulaArray;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            GlobalizationSettings globalizationSettings = (GlobalizationSettings) o;
            return
                Objects.equals(this.chartSettings, globalizationSettings.chartSettings) &&
                Objects.equals(this.pivotSettings, globalizationSettings.pivotSettings) &&
                Objects.equals(this.listSeparator, globalizationSettings.listSeparator) &&
                Objects.equals(this.rowSeparatorOfFormulaArray, globalizationSettings.rowSeparatorOfFormulaArray) &&
                Objects.equals(this.columnSeparatorOfFormulaArray, globalizationSettings.columnSeparatorOfFormulaArray);
      }

      @Override
      public int hashCode() {
        return Objects.hash(chartSettings, pivotSettings, listSeparator, rowSeparatorOfFormulaArray, columnSeparatorOfFormulaArray);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GlobalizationSettings {\n");
            sb.append("    chartSettings: ").append(toIndentedString(getChartSettings())).append("\n");
            sb.append("    pivotSettings: ").append(toIndentedString(getPivotSettings())).append("\n");
            sb.append("    listSeparator: ").append(toIndentedString(getListSeparator())).append("\n");
            sb.append("    rowSeparatorOfFormulaArray: ").append(toIndentedString(getRowSeparatorOfFormulaArray())).append("\n");
            sb.append("    columnSeparatorOfFormulaArray: ").append(toIndentedString(getColumnSeparatorOfFormulaArray())).append("\n");
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

