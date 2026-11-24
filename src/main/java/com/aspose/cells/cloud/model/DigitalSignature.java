/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DigitalSignature.java">
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

public class DigitalSignature {

    @SerializedName("Comments")
    @JsonProperty("Comments")
    private String comments;

    public DigitalSignature comments(String comments) {
        this.comments = comments;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @SerializedName("SignTime")
    @JsonProperty("SignTime")
    private String signTime;

    public DigitalSignature signTime(String signTime) {
        this.signTime = signTime;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSignTime() {
        return signTime;
    }

    public void setSignTime(String signTime) {
        this.signTime = signTime;
    }

    @SerializedName("Id")
    @JsonProperty("Id")
    private String id;

    public DigitalSignature id(String id) {
        this.id = id;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @SerializedName("Password")
    @JsonProperty("Password")
    private String password;

    public DigitalSignature password(String password) {
        this.password = password;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @SerializedName("Image")
    @JsonProperty("Image")
    private List<Integer> image;

    public DigitalSignature image(List<Integer> image) {
        this.image = image;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<Integer> getImage() {
        return image;
    }

    public void setImage(List<Integer> image) {
        this.image = image;
    }

    @SerializedName("ProviderId")
    @JsonProperty("ProviderId")
    private String providerId;

    public DigitalSignature providerId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    @SerializedName("IsValid")
    @JsonProperty("IsValid")
    private Boolean isValid;

    public DigitalSignature isValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    @SerializedName("XAdESType")
    @JsonProperty("XAdESType")
    private String xAdESType;

    public DigitalSignature xAdESType(String xAdESType) {
        this.xAdESType = xAdESType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getXAdESType() {
        return xAdESType;
    }

    public void setXAdESType(String xAdESType) {
        this.xAdESType = xAdESType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DigitalSignature other = (DigitalSignature) o;
        return Objects.equals(this.comments, other.comments)
            && Objects.equals(this.signTime, other.signTime)
            && Objects.equals(this.id, other.id)
            && Objects.equals(this.password, other.password)
            && Objects.equals(this.image, other.image)
            && Objects.equals(this.providerId, other.providerId)
            && Objects.equals(this.isValid, other.isValid)
            && Objects.equals(this.xAdESType, other.xAdESType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comments, signTime, id, password, image, providerId, isValid, xAdESType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DigitalSignature {\n");
        sb.append("    comments: ").append(comments).append("\n");
        sb.append("    signTime: ").append(signTime).append("\n");
        sb.append("    id: ").append(id).append("\n");
        sb.append("    password: ").append(password).append("\n");
        sb.append("    image: ").append(image).append("\n");
        sb.append("    providerId: ").append(providerId).append("\n");
        sb.append("    isValid: ").append(isValid).append("\n");
        sb.append("    xAdESType: ").append(xAdESType).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
