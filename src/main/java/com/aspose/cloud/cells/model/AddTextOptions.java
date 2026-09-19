/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AddTextOptions.java">
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


public class AddTextOptions  extends  BaseOperateOptions {
        @SerializedName("DataSource")
        private DataSource dataSource ;

        public  AddTextOptions  dataSource(DataSource  dataSource) {
            this.dataSource =  dataSource;
            return this;
        }

        @ApiModelProperty(value = "")
        public DataSource getDataSource() {
            return dataSource;
        }

        public void setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
        }

        @SerializedName("FileInfo")
        private FileInfo fileInfo ;

        public  AddTextOptions  fileInfo(FileInfo  fileInfo) {
            this.fileInfo =  fileInfo;
            return this;
        }

        @ApiModelProperty(value = "")
        public FileInfo getFileInfo() {
            return fileInfo;
        }

        public void setFileInfo(FileInfo fileInfo) {
            this.fileInfo = fileInfo;
        }

        @SerializedName("ScopeOptions")
        private ScopeOptions scopeOptions ;

        public  AddTextOptions  scopeOptions(ScopeOptions  scopeOptions) {
            this.scopeOptions =  scopeOptions;
            return this;
        }

        @ApiModelProperty(value = "")
        public ScopeOptions getScopeOptions() {
            return scopeOptions;
        }

        public void setScopeOptions(ScopeOptions scopeOptions) {
            this.scopeOptions = scopeOptions;
        }

        @SerializedName("Text")
        private String text ;

        public  AddTextOptions  text(String  text) {
            this.text =  text;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        @SerializedName("SelectPoistion")
        private String selectPoistion ;

        public  AddTextOptions  selectPoistion(String  selectPoistion) {
            this.selectPoistion =  selectPoistion;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSelectPoistion() {
            return selectPoistion;
        }

        public void setSelectPoistion(String selectPoistion) {
            this.selectPoistion = selectPoistion;
        }

        @SerializedName("SelectText")
        private String selectText ;

        public  AddTextOptions  selectText(String  selectText) {
            this.selectText =  selectText;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSelectText() {
            return selectText;
        }

        public void setSelectText(String selectText) {
            this.selectText = selectText;
        }

        @SerializedName("SkipEmptyCells")
        private Boolean skipEmptyCells ;

        public  AddTextOptions  skipEmptyCells(Boolean  skipEmptyCells) {
            this.skipEmptyCells =  skipEmptyCells;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getSkipEmptyCells() {
            return skipEmptyCells;
        }

        public void setSkipEmptyCells(Boolean skipEmptyCells) {
            this.skipEmptyCells = skipEmptyCells;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            AddTextOptions addTextOptions = (AddTextOptions) o;
            return
                Objects.equals(this.dataSource, addTextOptions.dataSource) &&
                Objects.equals(this.fileInfo, addTextOptions.fileInfo) &&
                Objects.equals(this.scopeOptions, addTextOptions.scopeOptions) &&
                Objects.equals(this.text, addTextOptions.text) &&
                Objects.equals(this.selectPoistion, addTextOptions.selectPoistion) &&
                Objects.equals(this.selectText, addTextOptions.selectText) &&
                Objects.equals(this.skipEmptyCells, addTextOptions.skipEmptyCells) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(dataSource, fileInfo, scopeOptions, text, selectPoistion, selectText, skipEmptyCells, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddTextOptions {\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    dataSource: ").append(toIndentedString(getDataSource())).append("\n");
            sb.append("    fileInfo: ").append(toIndentedString(getFileInfo())).append("\n");
            sb.append("    scopeOptions: ").append(toIndentedString(getScopeOptions())).append("\n");
            sb.append("    text: ").append(toIndentedString(getText())).append("\n");
            sb.append("    selectPoistion: ").append(toIndentedString(getSelectPoistion())).append("\n");
            sb.append("    selectText: ").append(toIndentedString(getSelectText())).append("\n");
            sb.append("    skipEmptyCells: ").append(toIndentedString(getSkipEmptyCells())).append("\n");
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

