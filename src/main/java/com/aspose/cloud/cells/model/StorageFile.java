/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="StorageFile.java">
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


public class StorageFile {
        @SerializedName("Name")
        private String name ;

        public  StorageFile  name(String  name) {
            this.name =  name;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @SerializedName("IsFolder")
        private Boolean isFolder ;

        public  StorageFile  isFolder(Boolean  isFolder) {
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

        @SerializedName("ModifiedDate")
        private OffsetDateTime modifiedDate ;

        public  StorageFile  modifiedDate(OffsetDateTime  modifiedDate) {
            this.modifiedDate =  modifiedDate;
            return this;
        }

        @ApiModelProperty(value = "")
        public OffsetDateTime getModifiedDate() {
            return modifiedDate;
        }

        public void setModifiedDate(OffsetDateTime modifiedDate) {
            this.modifiedDate = modifiedDate;
        }

        @SerializedName("Size")
        private Long size ;

        public  StorageFile  size(Long  size) {
            this.size =  size;
            return this;
        }

        @ApiModelProperty(value = "")
        public Long getSize() {
            return size;
        }

        public void setSize(Long size) {
            this.size = size;
        }

        @SerializedName("Path")
        private String path ;

        public  StorageFile  path(String  path) {
            this.path =  path;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            StorageFile storageFile = (StorageFile) o;
            return
                Objects.equals(this.name, storageFile.name) &&
                Objects.equals(this.isFolder, storageFile.isFolder) &&
                Objects.equals(this.modifiedDate, storageFile.modifiedDate) &&
                Objects.equals(this.size, storageFile.size) &&
                Objects.equals(this.path, storageFile.path);
      }

      @Override
      public int hashCode() {
        return Objects.hash(name, isFolder, modifiedDate, size, path);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class StorageFile {\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    isFolder: ").append(toIndentedString(getIsFolder())).append("\n");
            sb.append("    modifiedDate: ").append(toIndentedString(getModifiedDate())).append("\n");
            sb.append("    size: ").append(toIndentedString(getSize())).append("\n");
            sb.append("    path: ").append(toIndentedString(getPath())).append("\n");
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

