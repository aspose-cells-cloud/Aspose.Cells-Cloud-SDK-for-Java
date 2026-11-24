/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FileInfo.java">
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

public class FileInfo {

    @SerializedName("Filename")
    @JsonProperty("Filename")
    private String filename;

    public FileInfo filename(String filename) {
        this.filename = filename;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @SerializedName("FileSize")
    @JsonProperty("FileSize")
    private Long fileSize;

    public FileInfo fileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    @ApiModelProperty(value = "")
    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    @SerializedName("FileContent")
    @JsonProperty("FileContent")
    private String fileContent;

    public FileInfo fileContent(String fileContent) {
        this.fileContent = fileContent;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FileInfo other = (FileInfo) o;
        return Objects.equals(this.filename, other.filename)
            && Objects.equals(this.fileSize, other.fileSize)
            && Objects.equals(this.fileContent, other.fileContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filename, fileSize, fileContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileInfo {\n");
        sb.append("    filename: ").append(filename).append("\n");
        sb.append("    fileSize: ").append(fileSize).append("\n");
        sb.append("    fileContent: ").append(fileContent).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
