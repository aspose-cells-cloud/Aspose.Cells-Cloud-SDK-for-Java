/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AboveAverage.java">
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


public class AboveAverage {
        @SerializedName("IsAboveAverage")
        private Boolean isAboveAverage ;

        public  AboveAverage  isAboveAverage(Boolean  isAboveAverage) {
            this.isAboveAverage =  isAboveAverage;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsAboveAverage() {
            return isAboveAverage;
        }

        public void setIsAboveAverage(Boolean isAboveAverage) {
            this.isAboveAverage = isAboveAverage;
        }

        @SerializedName("IsEqualAverage")
        private Boolean isEqualAverage ;

        public  AboveAverage  isEqualAverage(Boolean  isEqualAverage) {
            this.isEqualAverage =  isEqualAverage;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsEqualAverage() {
            return isEqualAverage;
        }

        public void setIsEqualAverage(Boolean isEqualAverage) {
            this.isEqualAverage = isEqualAverage;
        }

        @SerializedName("StdDev")
        private Integer stdDev ;

        public  AboveAverage  stdDev(Integer  stdDev) {
            this.stdDev =  stdDev;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getStdDev() {
            return stdDev;
        }

        public void setStdDev(Integer stdDev) {
            this.stdDev = stdDev;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            AboveAverage aboveAverage = (AboveAverage) o;
            return
                Objects.equals(this.isAboveAverage, aboveAverage.isAboveAverage) &&
                Objects.equals(this.isEqualAverage, aboveAverage.isEqualAverage) &&
                Objects.equals(this.stdDev, aboveAverage.stdDev);
      }

      @Override
      public int hashCode() {
        return Objects.hash(isAboveAverage, isEqualAverage, stdDev);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AboveAverage {\n");
            sb.append("    isAboveAverage: ").append(toIndentedString(getIsAboveAverage())).append("\n");
            sb.append("    isEqualAverage: ").append(toIndentedString(getIsEqualAverage())).append("\n");
            sb.append("    stdDev: ").append(toIndentedString(getStdDev())).append("\n");
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

