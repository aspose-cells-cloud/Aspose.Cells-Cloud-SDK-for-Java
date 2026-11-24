/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="WriteProtection.java">
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

public class WriteProtection {

    @SerializedName("Author")
    @JsonProperty("Author")
    private String author;

    public WriteProtection author(String author) {
        this.author = author;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @SerializedName("RecommendReadOnly")
    @JsonProperty("RecommendReadOnly")
    private Boolean recommendReadOnly;

    public WriteProtection recommendReadOnly(Boolean recommendReadOnly) {
        this.recommendReadOnly = recommendReadOnly;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getRecommendReadOnly() {
        return recommendReadOnly;
    }

    public void setRecommendReadOnly(Boolean recommendReadOnly) {
        this.recommendReadOnly = recommendReadOnly;
    }

    @SerializedName("IsWriteProtected")
    @JsonProperty("IsWriteProtected")
    private Boolean isWriteProtected;

    public WriteProtection isWriteProtected(Boolean isWriteProtected) {
        this.isWriteProtected = isWriteProtected;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsWriteProtected() {
        return isWriteProtected;
    }

    public void setIsWriteProtected(Boolean isWriteProtected) {
        this.isWriteProtected = isWriteProtected;
    }

    @SerializedName("Password")
    @JsonProperty("Password")
    private String password;

    public WriteProtection password(String password) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WriteProtection other = (WriteProtection) o;
        return Objects.equals(this.author, other.author)
            && Objects.equals(this.recommendReadOnly, other.recommendReadOnly)
            && Objects.equals(this.isWriteProtected, other.isWriteProtected)
            && Objects.equals(this.password, other.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, recommendReadOnly, isWriteProtected, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WriteProtection {\n");
        sb.append("    author: ").append(author).append("\n");
        sb.append("    recommendReadOnly: ").append(recommendReadOnly).append("\n");
        sb.append("    isWriteProtected: ").append(isWriteProtected).append("\n");
        sb.append("    password: ").append(password).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
