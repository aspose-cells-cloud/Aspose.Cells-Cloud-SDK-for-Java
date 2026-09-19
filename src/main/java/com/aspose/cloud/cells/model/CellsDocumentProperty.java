/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CellsDocumentProperty.java">
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


public class CellsDocumentProperty {
        @SerializedName("Name")
        private String name ;

        public  CellsDocumentProperty  name(String  name) {
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

        @SerializedName("Value")
        private String value ;

        public  CellsDocumentProperty  value(String  value) {
            this.value =  value;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @SerializedName("IsLinkedToContent")
        private String isLinkedToContent ;

        public  CellsDocumentProperty  isLinkedToContent(String  isLinkedToContent) {
            this.isLinkedToContent =  isLinkedToContent;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getIsLinkedToContent() {
            return isLinkedToContent;
        }

        public void setIsLinkedToContent(String isLinkedToContent) {
            this.isLinkedToContent = isLinkedToContent;
        }

        @SerializedName("Source")
        private String source ;

        public  CellsDocumentProperty  source(String  source) {
            this.source =  source;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        @SerializedName("Type")
        private String type ;

        public  CellsDocumentProperty  type(String  type) {
            this.type =  type;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @SerializedName("IsGeneratedName")
        private String isGeneratedName ;

        public  CellsDocumentProperty  isGeneratedName(String  isGeneratedName) {
            this.isGeneratedName =  isGeneratedName;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getIsGeneratedName() {
            return isGeneratedName;
        }

        public void setIsGeneratedName(String isGeneratedName) {
            this.isGeneratedName = isGeneratedName;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            CellsDocumentProperty cellsDocumentProperty = (CellsDocumentProperty) o;
            return
                Objects.equals(this.name, cellsDocumentProperty.name) &&
                Objects.equals(this.value, cellsDocumentProperty.value) &&
                Objects.equals(this.isLinkedToContent, cellsDocumentProperty.isLinkedToContent) &&
                Objects.equals(this.source, cellsDocumentProperty.source) &&
                Objects.equals(this.type, cellsDocumentProperty.type) &&
                Objects.equals(this.isGeneratedName, cellsDocumentProperty.isGeneratedName);
      }

      @Override
      public int hashCode() {
        return Objects.hash(name, value, isLinkedToContent, source, type, isGeneratedName);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CellsDocumentProperty {\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    value: ").append(toIndentedString(getValue())).append("\n");
            sb.append("    isLinkedToContent: ").append(toIndentedString(getIsLinkedToContent())).append("\n");
            sb.append("    source: ").append(toIndentedString(getSource())).append("\n");
            sb.append("    type: ").append(toIndentedString(getType())).append("\n");
            sb.append("    isGeneratedName: ").append(toIndentedString(getIsGeneratedName())).append("\n");
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

