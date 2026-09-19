/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Hyperlink.java">
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


public class Hyperlink  extends  LinkElement {
        @SerializedName("Address")
        private String address ;

        public  Hyperlink  address(String  address) {
            this.address =  address;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @SerializedName("Area")
        private CellArea area ;

        public  Hyperlink  area(CellArea  area) {
            this.area =  area;
            return this;
        }

        @ApiModelProperty(value = "")
        public CellArea getArea() {
            return area;
        }

        public void setArea(CellArea area) {
            this.area = area;
        }

        @SerializedName("ScreenTip")
        private String screenTip ;

        public  Hyperlink  screenTip(String  screenTip) {
            this.screenTip =  screenTip;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getScreenTip() {
            return screenTip;
        }

        public void setScreenTip(String screenTip) {
            this.screenTip = screenTip;
        }

        @SerializedName("TextToDisplay")
        private String textToDisplay ;

        public  Hyperlink  textToDisplay(String  textToDisplay) {
            this.textToDisplay =  textToDisplay;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getTextToDisplay() {
            return textToDisplay;
        }

        public void setTextToDisplay(String textToDisplay) {
            this.textToDisplay = textToDisplay;
        }

        @SerializedName("LinkType")
        private String linkType ;

        public  Hyperlink  linkType(String  linkType) {
            this.linkType =  linkType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getLinkType() {
            return linkType;
        }

        public void setLinkType(String linkType) {
            this.linkType = linkType;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Hyperlink hyperlink = (Hyperlink) o;
            return
                Objects.equals(this.address, hyperlink.address) &&
                Objects.equals(this.area, hyperlink.area) &&
                Objects.equals(this.screenTip, hyperlink.screenTip) &&
                Objects.equals(this.textToDisplay, hyperlink.textToDisplay) &&
                Objects.equals(this.linkType, hyperlink.linkType) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(address, area, screenTip, textToDisplay, linkType, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Hyperlink {\n");
            sb.append("    address: ").append(toIndentedString(getAddress())).append("\n");
            sb.append("    area: ").append(toIndentedString(getArea())).append("\n");
            sb.append("    screenTip: ").append(toIndentedString(getScreenTip())).append("\n");
            sb.append("    textToDisplay: ").append(toIndentedString(getTextToDisplay())).append("\n");
            sb.append("    linkType: ").append(toIndentedString(getLinkType())).append("\n");
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

