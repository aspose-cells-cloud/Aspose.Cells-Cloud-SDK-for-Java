/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CellsObjectOperateTaskParameter.java">
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


public class CellsObjectOperateTaskParameter  extends  TaskParameter {
        @SerializedName("OperateObject")
        private OperateObject operateObject ;

        public  CellsObjectOperateTaskParameter  operateObject(OperateObject  operateObject) {
            this.operateObject =  operateObject;
            return this;
        }

        @ApiModelProperty(value = "")
        public OperateObject getOperateObject() {
            return operateObject;
        }

        public void setOperateObject(OperateObject operateObject) {
            this.operateObject = operateObject;
        }

        @SerializedName("OperateParameter")
        private OperateParameter operateParameter ;

        public  CellsObjectOperateTaskParameter  operateParameter(OperateParameter  operateParameter) {
            this.operateParameter =  operateParameter;
            return this;
        }

        @ApiModelProperty(value = "")
        public OperateParameter getOperateParameter() {
            return operateParameter;
        }

        public void setOperateParameter(OperateParameter operateParameter) {
            this.operateParameter = operateParameter;
        }

        @SerializedName("DestinationDataSource")
        private DataSource destinationDataSource ;

        public  CellsObjectOperateTaskParameter  destinationDataSource(DataSource  destinationDataSource) {
            this.destinationDataSource =  destinationDataSource;
            return this;
        }

        @ApiModelProperty(value = "")
        public DataSource getDestinationDataSource() {
            return destinationDataSource;
        }

        public void setDestinationDataSource(DataSource destinationDataSource) {
            this.destinationDataSource = destinationDataSource;
        }

        @SerializedName("DestinationWorkbook")
        private FileSource destinationWorkbook ;

        public  CellsObjectOperateTaskParameter  destinationWorkbook(FileSource  destinationWorkbook) {
            this.destinationWorkbook =  destinationWorkbook;
            return this;
        }

        @ApiModelProperty(value = "")
        public FileSource getDestinationWorkbook() {
            return destinationWorkbook;
        }

        public void setDestinationWorkbook(FileSource destinationWorkbook) {
            this.destinationWorkbook = destinationWorkbook;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            CellsObjectOperateTaskParameter cellsObjectOperateTaskParameter = (CellsObjectOperateTaskParameter) o;
            return
                Objects.equals(this.operateObject, cellsObjectOperateTaskParameter.operateObject) &&
                Objects.equals(this.operateParameter, cellsObjectOperateTaskParameter.operateParameter) &&
                Objects.equals(this.destinationDataSource, cellsObjectOperateTaskParameter.destinationDataSource) &&
                Objects.equals(this.destinationWorkbook, cellsObjectOperateTaskParameter.destinationWorkbook) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(operateObject, operateParameter, destinationDataSource, destinationWorkbook, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CellsObjectOperateTaskParameter {\n");
            sb.append("    operateObject: ").append(toIndentedString(getOperateObject())).append("\n");
            sb.append("    operateParameter: ").append(toIndentedString(getOperateParameter())).append("\n");
            sb.append("    destinationDataSource: ").append(toIndentedString(getDestinationDataSource())).append("\n");
            sb.append("    destinationWorkbook: ").append(toIndentedString(getDestinationWorkbook())).append("\n");
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

