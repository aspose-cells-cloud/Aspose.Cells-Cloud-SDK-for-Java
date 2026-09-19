/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DataFillValue.java">
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


public class DataFillValue {
        @SerializedName("DefaultBoolean")
        private Boolean defaultBoolean ;

        public  DataFillValue  defaultBoolean(Boolean  defaultBoolean) {
            this.defaultBoolean =  defaultBoolean;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getDefaultBoolean() {
            return defaultBoolean;
        }

        public void setDefaultBoolean(Boolean defaultBoolean) {
            this.defaultBoolean = defaultBoolean;
        }

        @SerializedName("DefaultString")
        private String defaultString ;

        public  DataFillValue  defaultString(String  defaultString) {
            this.defaultString =  defaultString;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getDefaultString() {
            return defaultString;
        }

        public void setDefaultString(String defaultString) {
            this.defaultString = defaultString;
        }

        @SerializedName("DefaultNumber")
        private Integer defaultNumber ;

        public  DataFillValue  defaultNumber(Integer  defaultNumber) {
            this.defaultNumber =  defaultNumber;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getDefaultNumber() {
            return defaultNumber;
        }

        public void setDefaultNumber(Integer defaultNumber) {
            this.defaultNumber = defaultNumber;
        }

        @SerializedName("DefaultDouble")
        private Double defaultDouble ;

        public  DataFillValue  defaultDouble(Double  defaultDouble) {
            this.defaultDouble =  defaultDouble;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getDefaultDouble() {
            return defaultDouble;
        }

        public void setDefaultDouble(Double defaultDouble) {
            this.defaultDouble = defaultDouble;
        }

        @SerializedName("DefaultDate")
        private String defaultDate ;

        public  DataFillValue  defaultDate(String  defaultDate) {
            this.defaultDate =  defaultDate;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getDefaultDate() {
            return defaultDate;
        }

        public void setDefaultDate(String defaultDate) {
            this.defaultDate = defaultDate;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            DataFillValue dataFillValue = (DataFillValue) o;
            return
                Objects.equals(this.defaultBoolean, dataFillValue.defaultBoolean) &&
                Objects.equals(this.defaultString, dataFillValue.defaultString) &&
                Objects.equals(this.defaultNumber, dataFillValue.defaultNumber) &&
                Objects.equals(this.defaultDouble, dataFillValue.defaultDouble) &&
                Objects.equals(this.defaultDate, dataFillValue.defaultDate);
      }

      @Override
      public int hashCode() {
        return Objects.hash(defaultBoolean, defaultString, defaultNumber, defaultDouble, defaultDate);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DataFillValue {\n");
            sb.append("    defaultBoolean: ").append(toIndentedString(getDefaultBoolean())).append("\n");
            sb.append("    defaultString: ").append(toIndentedString(getDefaultString())).append("\n");
            sb.append("    defaultNumber: ").append(toIndentedString(getDefaultNumber())).append("\n");
            sb.append("    defaultDouble: ").append(toIndentedString(getDefaultDouble())).append("\n");
            sb.append("    defaultDate: ").append(toIndentedString(getDefaultDate())).append("\n");
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

