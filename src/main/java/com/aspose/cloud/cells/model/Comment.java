/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Comment.java">
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


public class Comment  extends  LinkElement {
        @SerializedName("CellName")
        private String cellName ;

        public  Comment  cellName(String  cellName) {
            this.cellName =  cellName;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getCellName() {
            return cellName;
        }

        public void setCellName(String cellName) {
            this.cellName = cellName;
        }

        @SerializedName("Author")
        private String author ;

        public  Comment  author(String  author) {
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

        @SerializedName("HtmlNote")
        private String htmlNote ;

        public  Comment  htmlNote(String  htmlNote) {
            this.htmlNote =  htmlNote;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getHtmlNote() {
            return htmlNote;
        }

        public void setHtmlNote(String htmlNote) {
            this.htmlNote = htmlNote;
        }

        @SerializedName("Note")
        private String note ;

        public  Comment  note(String  note) {
            this.note =  note;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }

        @SerializedName("AutoSize")
        private Boolean autoSize ;

        public  Comment  autoSize(Boolean  autoSize) {
            this.autoSize =  autoSize;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getAutoSize() {
            return autoSize;
        }

        public void setAutoSize(Boolean autoSize) {
            this.autoSize = autoSize;
        }

        @SerializedName("IsVisible")
        private Boolean isVisible ;

        public  Comment  isVisible(Boolean  isVisible) {
            this.isVisible =  isVisible;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsVisible() {
            return isVisible;
        }

        public void setIsVisible(Boolean isVisible) {
            this.isVisible = isVisible;
        }

        @SerializedName("Width")
        private Integer width ;

        public  Comment  width(Integer  width) {
            this.width =  width;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        @SerializedName("Height")
        private Integer height ;

        public  Comment  height(Integer  height) {
            this.height =  height;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        @SerializedName("TextHorizontalAlignment")
        private String textHorizontalAlignment ;

        public  Comment  textHorizontalAlignment(String  textHorizontalAlignment) {
            this.textHorizontalAlignment =  textHorizontalAlignment;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getTextHorizontalAlignment() {
            return textHorizontalAlignment;
        }

        public void setTextHorizontalAlignment(String textHorizontalAlignment) {
            this.textHorizontalAlignment = textHorizontalAlignment;
        }

        @SerializedName("TextOrientationType")
        private String textOrientationType ;

        public  Comment  textOrientationType(String  textOrientationType) {
            this.textOrientationType =  textOrientationType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getTextOrientationType() {
            return textOrientationType;
        }

        public void setTextOrientationType(String textOrientationType) {
            this.textOrientationType = textOrientationType;
        }

        @SerializedName("TextVerticalAlignment")
        private String textVerticalAlignment ;

        public  Comment  textVerticalAlignment(String  textVerticalAlignment) {
            this.textVerticalAlignment =  textVerticalAlignment;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getTextVerticalAlignment() {
            return textVerticalAlignment;
        }

        public void setTextVerticalAlignment(String textVerticalAlignment) {
            this.textVerticalAlignment = textVerticalAlignment;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Comment comment = (Comment) o;
            return
                Objects.equals(this.cellName, comment.cellName) &&
                Objects.equals(this.author, comment.author) &&
                Objects.equals(this.htmlNote, comment.htmlNote) &&
                Objects.equals(this.note, comment.note) &&
                Objects.equals(this.autoSize, comment.autoSize) &&
                Objects.equals(this.isVisible, comment.isVisible) &&
                Objects.equals(this.width, comment.width) &&
                Objects.equals(this.height, comment.height) &&
                Objects.equals(this.textHorizontalAlignment, comment.textHorizontalAlignment) &&
                Objects.equals(this.textOrientationType, comment.textOrientationType) &&
                Objects.equals(this.textVerticalAlignment, comment.textVerticalAlignment) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(cellName, author, htmlNote, note, autoSize, isVisible, width, height, textHorizontalAlignment, textOrientationType, textVerticalAlignment, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Comment {\n");
            sb.append("    cellName: ").append(toIndentedString(getCellName())).append("\n");
            sb.append("    author: ").append(toIndentedString(getAuthor())).append("\n");
            sb.append("    htmlNote: ").append(toIndentedString(getHtmlNote())).append("\n");
            sb.append("    note: ").append(toIndentedString(getNote())).append("\n");
            sb.append("    autoSize: ").append(toIndentedString(getAutoSize())).append("\n");
            sb.append("    isVisible: ").append(toIndentedString(getIsVisible())).append("\n");
            sb.append("    width: ").append(toIndentedString(getWidth())).append("\n");
            sb.append("    height: ").append(toIndentedString(getHeight())).append("\n");
            sb.append("    textHorizontalAlignment: ").append(toIndentedString(getTextHorizontalAlignment())).append("\n");
            sb.append("    textOrientationType: ").append(toIndentedString(getTextOrientationType())).append("\n");
            sb.append("    textVerticalAlignment: ").append(toIndentedString(getTextVerticalAlignment())).append("\n");
            sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
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

