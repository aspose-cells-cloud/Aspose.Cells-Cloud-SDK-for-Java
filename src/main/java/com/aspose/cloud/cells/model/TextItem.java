/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TextItem.java">
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


public class TextItem {
        @SerializedName("Filename")
        private String filename ;

        public  TextItem  filename(String  filename) {
            this.filename =  filename;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getFilename() {
            return filename;
        }

        public void setFilename(String filename) {
            this.filename = filename;
        }

        @SerializedName("Worksheet")
        private String worksheet ;

        public  TextItem  worksheet(String  worksheet) {
            this.worksheet =  worksheet;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getWorksheet() {
            return worksheet;
        }

        public void setWorksheet(String worksheet) {
            this.worksheet = worksheet;
        }

        @SerializedName("Position")
        private String position ;

        public  TextItem  position(String  position) {
            this.position =  position;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        @SerializedName("Content")
        private String content ;

        public  TextItem  content(String  content) {
            this.content =  content;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            TextItem textItem = (TextItem) o;
            return
                Objects.equals(this.filename, textItem.filename) &&
                Objects.equals(this.worksheet, textItem.worksheet) &&
                Objects.equals(this.position, textItem.position) &&
                Objects.equals(this.content, textItem.content);
      }

      @Override
      public int hashCode() {
        return Objects.hash(filename, worksheet, position, content);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TextItem {\n");
            sb.append("    filename: ").append(toIndentedString(getFilename())).append("\n");
            sb.append("    worksheet: ").append(toIndentedString(getWorksheet())).append("\n");
            sb.append("    position: ").append(toIndentedString(getPosition())).append("\n");
            sb.append("    content: ").append(toIndentedString(getContent())).append("\n");
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

