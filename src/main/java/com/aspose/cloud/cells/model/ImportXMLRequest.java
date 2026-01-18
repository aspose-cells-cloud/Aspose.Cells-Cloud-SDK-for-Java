/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ImportXMLRequest.java">
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


public class ImportXMLRequest {
        @SerializedName("XMLFileSource")
        private DataSource xMLFileSource ;

        public  ImportXMLRequest  xMLFileSource(DataSource  xMLFileSource) {
            this.xMLFileSource =  xMLFileSource;
            return this;
        }

        @ApiModelProperty(value = "")
        public DataSource getXMLFileSource() {
            return xMLFileSource;
        }

        public void setXMLFileSource(DataSource xMLFileSource) {
            this.xMLFileSource = xMLFileSource;
        }

        @SerializedName("ImportPosition")
        private ImportPosition importPosition ;

        public  ImportXMLRequest  importPosition(ImportPosition  importPosition) {
            this.importPosition =  importPosition;
            return this;
        }

        @ApiModelProperty(value = "")
        public ImportPosition getImportPosition() {
            return importPosition;
        }

        public void setImportPosition(ImportPosition importPosition) {
            this.importPosition = importPosition;
        }

        @SerializedName("XMLContent")
        private String xMLContent ;

        public  ImportXMLRequest  xMLContent(String  xMLContent) {
            this.xMLContent =  xMLContent;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getXMLContent() {
            return xMLContent;
        }

        public void setXMLContent(String xMLContent) {
            this.xMLContent = xMLContent;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ImportXMLRequest importXMLRequest = (ImportXMLRequest) o;
            return
                Objects.equals(this.xMLFileSource, importXMLRequest.xMLFileSource) &&
                Objects.equals(this.importPosition, importXMLRequest.importPosition) &&
                Objects.equals(this.xMLContent, importXMLRequest.xMLContent);
      }

      @Override
      public int hashCode() {
        return Objects.hash(xMLFileSource, importPosition, xMLContent);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ImportXMLRequest {\n");
            sb.append("    xMLFileSource: ").append(toIndentedString(getXMLFileSource())).append("\n");
            sb.append("    importPosition: ").append(toIndentedString(getImportPosition())).append("\n");
            sb.append("    xMLContent: ").append(toIndentedString(getXMLContent())).append("\n");
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

