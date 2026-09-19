/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="WriteProtection.java">
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


public class WriteProtection {
        @SerializedName("Author")
        private String author ;

        public  WriteProtection  author(String  author) {
            this.author =  author;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        @SerializedName("RecommendReadOnly")
        private Boolean recommendReadOnly ;

        public  WriteProtection  recommendReadOnly(Boolean  recommendReadOnly) {
            this.recommendReadOnly =  recommendReadOnly;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getRecommendReadOnly() {
            return recommendReadOnly;
        }

        public void setRecommendReadOnly(Boolean recommendReadOnly) {
            this.recommendReadOnly = recommendReadOnly;
        }

        @SerializedName("IsWriteProtected")
        private Boolean isWriteProtected ;

        public  WriteProtection  isWriteProtected(Boolean  isWriteProtected) {
            this.isWriteProtected =  isWriteProtected;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsWriteProtected() {
            return isWriteProtected;
        }

        public void setIsWriteProtected(Boolean isWriteProtected) {
            this.isWriteProtected = isWriteProtected;
        }

        @SerializedName("Password")
        private String password ;

        public  WriteProtection  password(String  password) {
            this.password =  password;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            WriteProtection writeProtection = (WriteProtection) o;
            return
                Objects.equals(this.author, writeProtection.author) &&
                Objects.equals(this.recommendReadOnly, writeProtection.recommendReadOnly) &&
                Objects.equals(this.isWriteProtected, writeProtection.isWriteProtected) &&
                Objects.equals(this.password, writeProtection.password);
      }

      @Override
      public int hashCode() {
        return Objects.hash(author, recommendReadOnly, isWriteProtected, password);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WriteProtection {\n");
            sb.append("    author: ").append(toIndentedString(getAuthor())).append("\n");
            sb.append("    recommendReadOnly: ").append(toIndentedString(getRecommendReadOnly())).append("\n");
            sb.append("    isWriteProtected: ").append(toIndentedString(getIsWriteProtected())).append("\n");
            sb.append("    password: ").append(toIndentedString(getPassword())).append("\n");
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

