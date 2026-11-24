/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CellsCloudFileInfo.java">
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

public class CellsCloudFileInfo {

    @SerializedName("Name")
    @JsonProperty("Name")
    private String name;

    public CellsCloudFileInfo name(String name) {
        this.name = name;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @SerializedName("Size")
    @JsonProperty("Size")
    private Long size;

    public CellsCloudFileInfo size(Long size) {
        this.size = size;
        return this;
    }

    @ApiModelProperty(value = "")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    @SerializedName("Folder")
    @JsonProperty("Folder")
    private String folder;

    public CellsCloudFileInfo folder(String folder) {
        this.folder = folder;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    @SerializedName("Storage")
    @JsonProperty("Storage")
    private String storage;

    public CellsCloudFileInfo storage(String storage) {
        this.storage = storage;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CellsCloudFileInfo other = (CellsCloudFileInfo) o;
        return Objects.equals(this.name, other.name)
            && Objects.equals(this.size, other.size)
            && Objects.equals(this.folder, other.folder)
            && Objects.equals(this.storage, other.storage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, folder, storage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CellsCloudFileInfo {\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    size: ").append(size).append("\n");
        sb.append("    folder: ").append(folder).append("\n");
        sb.append("    storage: ").append(storage).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
