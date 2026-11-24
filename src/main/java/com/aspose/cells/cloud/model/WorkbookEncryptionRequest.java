/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="WorkbookEncryptionRequest.java">
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

public class WorkbookEncryptionRequest {

    @SerializedName("EncryptionType")
    @JsonProperty("EncryptionType")
    private String encryptionType;

    public WorkbookEncryptionRequest encryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getEncryptionType() {
        return encryptionType;
    }

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    @SerializedName("KeyLength")
    @JsonProperty("KeyLength")
    private Integer keyLength;

    public WorkbookEncryptionRequest keyLength(Integer keyLength) {
        this.keyLength = keyLength;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getKeyLength() {
        return keyLength;
    }

    public void setKeyLength(Integer keyLength) {
        this.keyLength = keyLength;
    }

    @SerializedName("Password")
    @JsonProperty("Password")
    private String password;

    public WorkbookEncryptionRequest password(String password) {
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
        WorkbookEncryptionRequest other = (WorkbookEncryptionRequest) o;
        return Objects.equals(this.encryptionType, other.encryptionType)
            && Objects.equals(this.keyLength, other.keyLength)
            && Objects.equals(this.password, other.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encryptionType, keyLength, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkbookEncryptionRequest {\n");
        sb.append("    encryptionType: ").append(encryptionType).append("\n");
        sb.append("    keyLength: ").append(keyLength).append("\n");
        sb.append("    password: ").append(password).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
