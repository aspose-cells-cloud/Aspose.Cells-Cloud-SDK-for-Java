/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="UnpivotColumn.java">
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


public class UnpivotColumn  extends  AppliedOperate {
        @SerializedName("UnpivotColumnNames")
        private List<String> unpivotColumnNames ;

        public  UnpivotColumn  unpivotColumnNames(List<String>  unpivotColumnNames) {
            this.unpivotColumnNames =  unpivotColumnNames;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<String> getUnpivotColumnNames() {
            return unpivotColumnNames;
        }

        public void setUnpivotColumnNames(List<String> unpivotColumnNames) {
            this.unpivotColumnNames = unpivotColumnNames;
        }

        @SerializedName("ColumnMapName")
        private String columnMapName ;

        public  UnpivotColumn  columnMapName(String  columnMapName) {
            this.columnMapName =  columnMapName;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getColumnMapName() {
            return columnMapName;
        }

        public void setColumnMapName(String columnMapName) {
            this.columnMapName = columnMapName;
        }

        @SerializedName("ValueMapName")
        private String valueMapName ;

        public  UnpivotColumn  valueMapName(String  valueMapName) {
            this.valueMapName =  valueMapName;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getValueMapName() {
            return valueMapName;
        }

        public void setValueMapName(String valueMapName) {
            this.valueMapName = valueMapName;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            UnpivotColumn unpivotColumn = (UnpivotColumn) o;
            return
                Objects.equals(this.unpivotColumnNames, unpivotColumn.unpivotColumnNames) &&
                Objects.equals(this.columnMapName, unpivotColumn.columnMapName) &&
                Objects.equals(this.valueMapName, unpivotColumn.valueMapName) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(unpivotColumnNames, columnMapName, valueMapName, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class UnpivotColumn {\n");
            sb.append("    unpivotColumnNames: ").append(toIndentedString(getUnpivotColumnNames())).append("\n");
            sb.append("    columnMapName: ").append(toIndentedString(getColumnMapName())).append("\n");
            sb.append("    valueMapName: ").append(toIndentedString(getValueMapName())).append("\n");
            sb.append("    appliedOperateType: ").append(toIndentedString(getAppliedOperateType())).append("\n");
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

