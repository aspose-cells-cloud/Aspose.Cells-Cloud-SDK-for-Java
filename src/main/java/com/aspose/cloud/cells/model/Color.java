/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Color.java">
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


public class Color {
        @SerializedName("A")
        private Integer a ;

        public  Color  a(Integer  a) {
            this.a =  a;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getA() {
            return a;
        }

        public void setA(Integer a) {
            this.a = a;
        }

        @SerializedName("R")
        private Integer r ;

        public  Color  r(Integer  r) {
            this.r =  r;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getR() {
            return r;
        }

        public void setR(Integer r) {
            this.r = r;
        }

        @SerializedName("G")
        private Integer g ;

        public  Color  g(Integer  g) {
            this.g =  g;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getG() {
            return g;
        }

        public void setG(Integer g) {
            this.g = g;
        }

        @SerializedName("B")
        private Integer b ;

        public  Color  b(Integer  b) {
            this.b =  b;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getB() {
            return b;
        }

        public void setB(Integer b) {
            this.b = b;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Color color = (Color) o;
            return
                Objects.equals(this.a, color.a) &&
                Objects.equals(this.r, color.r) &&
                Objects.equals(this.g, color.g) &&
                Objects.equals(this.b, color.b);
      }

      @Override
      public int hashCode() {
        return Objects.hash(a, r, g, b);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Color {\n");
            sb.append("    a: ").append(toIndentedString(getA())).append("\n");
            sb.append("    r: ").append(toIndentedString(getR())).append("\n");
            sb.append("    g: ").append(toIndentedString(getG())).append("\n");
            sb.append("    b: ").append(toIndentedString(getB())).append("\n");
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

