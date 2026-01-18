/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Top10.java">
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


public class Top10 {
        @SerializedName("IsBottom")
        private Boolean isBottom ;

        public  Top10  isBottom(Boolean  isBottom) {
            this.isBottom =  isBottom;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsBottom() {
            return isBottom;
        }

        public void setIsBottom(Boolean isBottom) {
            this.isBottom = isBottom;
        }

        @SerializedName("IsPercent")
        private Boolean isPercent ;

        public  Top10  isPercent(Boolean  isPercent) {
            this.isPercent =  isPercent;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsPercent() {
            return isPercent;
        }

        public void setIsPercent(Boolean isPercent) {
            this.isPercent = isPercent;
        }

        @SerializedName("Rank")
        private Integer rank ;

        public  Top10  rank(Integer  rank) {
            this.rank =  rank;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getRank() {
            return rank;
        }

        public void setRank(Integer rank) {
            this.rank = rank;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Top10 top10 = (Top10) o;
            return
                Objects.equals(this.isBottom, top10.isBottom) &&
                Objects.equals(this.isPercent, top10.isPercent) &&
                Objects.equals(this.rank, top10.rank);
      }

      @Override
      public int hashCode() {
        return Objects.hash(isBottom, isPercent, rank);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Top10 {\n");
            sb.append("    isBottom: ").append(toIndentedString(getIsBottom())).append("\n");
            sb.append("    isPercent: ").append(toIndentedString(getIsPercent())).append("\n");
            sb.append("    rank: ").append(toIndentedString(getRank())).append("\n");
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

