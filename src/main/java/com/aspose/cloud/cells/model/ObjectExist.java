/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ObjectExist.java">
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


public class ObjectExist {
        @SerializedName("Exists")
        private Boolean exists ;

        public  ObjectExist  exists(Boolean  exists) {
            this.exists =  exists;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getExists() {
            return exists;
        }

        public void setExists(Boolean exists) {
            this.exists = exists;
        }

        @SerializedName("IsFolder")
        private Boolean isFolder ;

        public  ObjectExist  isFolder(Boolean  isFolder) {
            this.isFolder =  isFolder;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsFolder() {
            return isFolder;
        }

        public void setIsFolder(Boolean isFolder) {
            this.isFolder = isFolder;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ObjectExist objectExist = (ObjectExist) o;
            return
                Objects.equals(this.exists, objectExist.exists) &&
                Objects.equals(this.isFolder, objectExist.isFolder);
      }

      @Override
      public int hashCode() {
        return Objects.hash(exists, isFolder);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ObjectExist {\n");
            sb.append("    exists: ").append(toIndentedString(getExists())).append("\n");
            sb.append("    isFolder: ").append(toIndentedString(getIsFolder())).append("\n");
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

