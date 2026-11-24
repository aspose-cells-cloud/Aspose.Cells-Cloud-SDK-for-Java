/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FilesUploadResult.java">
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

public class FilesUploadResult {

    @SerializedName("Uploaded")
    @JsonProperty("Uploaded")
    private List<String> uploaded;

    public FilesUploadResult uploaded(List<String> uploaded) {
        this.uploaded = uploaded;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<String> getUploaded() {
        return uploaded;
    }

    public void setUploaded(List<String> uploaded) {
        this.uploaded = uploaded;
    }

    @SerializedName("Errors")
    @JsonProperty("Errors")
    private List<Error> errors;

    public FilesUploadResult errors(List<Error> errors) {
        this.errors = errors;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FilesUploadResult other = (FilesUploadResult) o;
        return Objects.equals(this.uploaded, other.uploaded)
            && Objects.equals(this.errors, other.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploaded, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FilesUploadResult {\n");
        sb.append("    uploaded: ").append(uploaded).append("\n");
        sb.append("    errors: ").append(errors).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
