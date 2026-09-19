/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Name.java">
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


public class Name  extends  LinkElement {
        @SerializedName("Comment")
        private String comment ;

        public  Name  comment(String  comment) {
            this.comment =  comment;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        @SerializedName("WorksheetIndex")
        private Integer worksheetIndex ;

        public  Name  worksheetIndex(Integer  worksheetIndex) {
            this.worksheetIndex =  worksheetIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getWorksheetIndex() {
            return worksheetIndex;
        }

        public void setWorksheetIndex(Integer worksheetIndex) {
            this.worksheetIndex = worksheetIndex;
        }

        @SerializedName("IsReferred")
        private Boolean isReferred ;

        public  Name  isReferred(Boolean  isReferred) {
            this.isReferred =  isReferred;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsReferred() {
            return isReferred;
        }

        public void setIsReferred(Boolean isReferred) {
            this.isReferred = isReferred;
        }

        @SerializedName("IsVisible")
        private Boolean isVisible ;

        public  Name  isVisible(Boolean  isVisible) {
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

        @SerializedName("R1C1RefersTo")
        private String r1C1RefersTo ;

        public  Name  r1C1RefersTo(String  r1C1RefersTo) {
            this.r1C1RefersTo =  r1C1RefersTo;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getR1C1RefersTo() {
            return r1C1RefersTo;
        }

        public void setR1C1RefersTo(String r1C1RefersTo) {
            this.r1C1RefersTo = r1C1RefersTo;
        }

        @SerializedName("RefersTo")
        private String refersTo ;

        public  Name  refersTo(String  refersTo) {
            this.refersTo =  refersTo;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getRefersTo() {
            return refersTo;
        }

        public void setRefersTo(String refersTo) {
            this.refersTo = refersTo;
        }

        @SerializedName("Text")
        private String text ;

        public  Name  text(String  text) {
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

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Name name = (Name) o;
            return
                Objects.equals(this.comment, name.comment) &&
                Objects.equals(this.worksheetIndex, name.worksheetIndex) &&
                Objects.equals(this.isReferred, name.isReferred) &&
                Objects.equals(this.isVisible, name.isVisible) &&
                Objects.equals(this.r1C1RefersTo, name.r1C1RefersTo) &&
                Objects.equals(this.refersTo, name.refersTo) &&
                Objects.equals(this.text, name.text) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(comment, worksheetIndex, isReferred, isVisible, r1C1RefersTo, refersTo, text, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Name {\n");
            sb.append("    comment: ").append(toIndentedString(getComment())).append("\n");
            sb.append("    worksheetIndex: ").append(toIndentedString(getWorksheetIndex())).append("\n");
            sb.append("    isReferred: ").append(toIndentedString(getIsReferred())).append("\n");
            sb.append("    isVisible: ").append(toIndentedString(getIsVisible())).append("\n");
            sb.append("    r1C1RefersTo: ").append(toIndentedString(getR1C1RefersTo())).append("\n");
            sb.append("    refersTo: ").append(toIndentedString(getRefersTo())).append("\n");
            sb.append("    text: ").append(toIndentedString(getText())).append("\n");
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

