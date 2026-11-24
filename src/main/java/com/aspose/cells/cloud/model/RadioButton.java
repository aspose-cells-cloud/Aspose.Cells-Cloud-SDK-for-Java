/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="RadioButton.java">
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

public class RadioButton extends Shape {

    @SerializedName("GroupBox")
    @JsonProperty("GroupBox")
    private GroupBox groupBox;

    public RadioButton groupBox(GroupBox groupBox) {
        this.groupBox = groupBox;
        return this;
    }

    @ApiModelProperty(value = "")
    public GroupBox getGroupBox() {
        return groupBox;
    }

    public void setGroupBox(GroupBox groupBox) {
        this.groupBox = groupBox;
    }

    @SerializedName("IsChecked")
    @JsonProperty("IsChecked")
    private Boolean isChecked;

    public RadioButton isChecked(Boolean isChecked) {
        this.isChecked = isChecked;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Boolean isChecked) {
        this.isChecked = isChecked;
    }

    @SerializedName("Shadow")
    @JsonProperty("Shadow")
    private Boolean shadow;

    public RadioButton shadow(Boolean shadow) {
        this.shadow = shadow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShadow() {
        return shadow;
    }

    public void setShadow(Boolean shadow) {
        this.shadow = shadow;
    }

    @SerializedName("link")
    @JsonProperty("link")
    private Link link;

    public RadioButton link(Link link) {
        this.link = link;
        return this;
    }

    @ApiModelProperty(value = "")
    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
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
        RadioButton other = (RadioButton) o;
        return Objects.equals(this.groupBox, other.groupBox)
            && Objects.equals(this.isChecked, other.isChecked)
            && Objects.equals(this.shadow, other.shadow)
            && Objects.equals(this.link, other.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupBox, isChecked, shadow, link, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RadioButton {\n");
        sb.append("    groupBox: ").append(groupBox).append("\n");
        sb.append("    isChecked: ").append(isChecked).append("\n");
        sb.append("    shadow: ").append(shadow).append("\n");
        sb.append("    link: ").append(link).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
