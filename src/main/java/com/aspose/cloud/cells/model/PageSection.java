/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PageSection.java">
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


public class PageSection {
        @SerializedName("Section")
        private Integer section ;

        public  PageSection  section(Integer  section) {
            this.section =  section;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getSection() {
            return section;
        }

        public void setSection(Integer section) {
            this.section = section;
        }

        @SerializedName("Context")
        private String context ;

        public  PageSection  context(String  context) {
            this.context =  context;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getContext() {
            return context;
        }

        public void setContext(String context) {
            this.context = context;
        }

        @SerializedName("Picture")
        private String picture ;

        public  PageSection  picture(String  picture) {
            this.picture =  picture;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }

        @SerializedName("FisrtPageContext")
        private String fisrtPageContext ;

        public  PageSection  fisrtPageContext(String  fisrtPageContext) {
            this.fisrtPageContext =  fisrtPageContext;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getFisrtPageContext() {
            return fisrtPageContext;
        }

        public void setFisrtPageContext(String fisrtPageContext) {
            this.fisrtPageContext = fisrtPageContext;
        }

        @SerializedName("EvenPageContext")
        private String evenPageContext ;

        public  PageSection  evenPageContext(String  evenPageContext) {
            this.evenPageContext =  evenPageContext;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getEvenPageContext() {
            return evenPageContext;
        }

        public void setEvenPageContext(String evenPageContext) {
            this.evenPageContext = evenPageContext;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            PageSection pageSection = (PageSection) o;
            return
                Objects.equals(this.section, pageSection.section) &&
                Objects.equals(this.context, pageSection.context) &&
                Objects.equals(this.picture, pageSection.picture) &&
                Objects.equals(this.fisrtPageContext, pageSection.fisrtPageContext) &&
                Objects.equals(this.evenPageContext, pageSection.evenPageContext);
      }

      @Override
      public int hashCode() {
        return Objects.hash(section, context, picture, fisrtPageContext, evenPageContext);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PageSection {\n");
            sb.append("    section: ").append(toIndentedString(getSection())).append("\n");
            sb.append("    context: ").append(toIndentedString(getContext())).append("\n");
            sb.append("    picture: ").append(toIndentedString(getPicture())).append("\n");
            sb.append("    fisrtPageContext: ").append(toIndentedString(getFisrtPageContext())).append("\n");
            sb.append("    evenPageContext: ").append(toIndentedString(getEvenPageContext())).append("\n");
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

