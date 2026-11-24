/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SaveOptionsData.java">
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

public class SaveOptionsData {

    @SerializedName("SaveOptions")
    @JsonProperty("SaveOptions")
    private SaveOptions saveOptions;

    public SaveOptionsData saveOptions(SaveOptions saveOptions) {
        this.saveOptions = saveOptions;
        return this;
    }

    @ApiModelProperty(value = "")
    public SaveOptions getSaveOptions() {
        return saveOptions;
    }

    public void setSaveOptions(SaveOptions saveOptions) {
        this.saveOptions = saveOptions;
    }

    @SerializedName("Filename")
    @JsonProperty("Filename")
    private String filename;

    public SaveOptionsData filename(String filename) {
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

    @SerializedName("StorageName")
    @JsonProperty("StorageName")
    private String storageName;

    public SaveOptionsData storageName(String storageName) {
        this.storageName = storageName;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SaveOptionsData other = (SaveOptionsData) o;
        return Objects.equals(this.saveOptions, other.saveOptions)
            && Objects.equals(this.filename, other.filename)
            && Objects.equals(this.storageName, other.storageName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saveOptions, filename, storageName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SaveOptionsData {\n");
        sb.append("    saveOptions: ").append(saveOptions).append("\n");
        sb.append("    filename: ").append(filename).append("\n");
        sb.append("    storageName: ").append(storageName).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
