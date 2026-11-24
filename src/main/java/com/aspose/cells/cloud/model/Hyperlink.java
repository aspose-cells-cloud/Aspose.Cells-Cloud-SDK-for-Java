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

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Hyperlink extends LinkElement {

    @SerializedName("Address")
    @JsonProperty("Address")
    private String address;

    public Hyperlink address(String address) {
        this.address = address;
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
    @JsonProperty("Area")
    private CellArea area;

    public Hyperlink area(CellArea area) {
        this.area = area;
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
    @JsonProperty("ScreenTip")
    private String screenTip;

    public Hyperlink screenTip(String screenTip) {
        this.screenTip = screenTip;
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
    @JsonProperty("TextToDisplay")
    private String textToDisplay;

    public Hyperlink textToDisplay(String textToDisplay) {
        this.textToDisplay = textToDisplay;
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
    @JsonProperty("LinkType")
    private String linkType;

    public Hyperlink linkType(String linkType) {
        this.linkType = linkType;
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Hyperlink other = (Hyperlink) o;
        return Objects.equals(this.address, other.address)
            && Objects.equals(this.area, other.area)
            && Objects.equals(this.screenTip, other.screenTip)
            && Objects.equals(this.textToDisplay, other.textToDisplay)
            && Objects.equals(this.linkType, other.linkType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, area, screenTip, textToDisplay, linkType, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Hyperlink {\n");
        sb.append("    address: ").append(address).append("\n");
        sb.append("    area: ").append(area).append("\n");
        sb.append("    screenTip: ").append(screenTip).append("\n");
        sb.append("    textToDisplay: ").append(textToDisplay).append("\n");
        sb.append("    linkType: ").append(linkType).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
