/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CellsCloudFileInfo.java">
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


public class CellsCloudFileInfo {
        @SerializedName("Name")
        private String name ;

        public  CellsCloudFileInfo  name(String  name) {
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

        @SerializedName("Size")
        private Long size ;

        public  CellsCloudFileInfo  size(Long  size) {
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

        @SerializedName("Folder")
        private String folder ;

        public  CellsCloudFileInfo  folder(String  folder) {
            this.folder =  folder;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getFolder() {
            return folder;
        }

        public void setFolder(String folder) {
            this.folder = folder;
        }

        @SerializedName("Storage")
        private String storage ;

        public  CellsCloudFileInfo  storage(String  storage) {
            this.storage =  storage;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getStorage() {
            return storage;
        }

        public void setStorage(String storage) {
            this.storage = storage;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            CellsCloudFileInfo cellsCloudFileInfo = (CellsCloudFileInfo) o;
            return
                Objects.equals(this.name, cellsCloudFileInfo.name) &&
                Objects.equals(this.size, cellsCloudFileInfo.size) &&
                Objects.equals(this.folder, cellsCloudFileInfo.folder) &&
                Objects.equals(this.storage, cellsCloudFileInfo.storage);
      }

      @Override
      public int hashCode() {
        return Objects.hash(name, size, folder, storage);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CellsCloudFileInfo {\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    size: ").append(toIndentedString(getSize())).append("\n");
            sb.append("    folder: ").append(toIndentedString(getFolder())).append("\n");
            sb.append("    storage: ").append(toIndentedString(getStorage())).append("\n");
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

