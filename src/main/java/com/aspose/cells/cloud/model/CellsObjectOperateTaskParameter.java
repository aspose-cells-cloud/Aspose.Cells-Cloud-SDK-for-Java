/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CellsObjectOperateTaskParameter.java">
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

public class CellsObjectOperateTaskParameter extends TaskParameter {

    @SerializedName("OperateObject")
    @JsonProperty("OperateObject")
    private OperateObject operateObject;

    public CellsObjectOperateTaskParameter operateObject(OperateObject operateObject) {
        this.operateObject = operateObject;
        return this;
    }

    @ApiModelProperty(value = "")
    public OperateObject getOperateObject() {
        return operateObject;
    }

    public void setOperateObject(OperateObject operateObject) {
        this.operateObject = operateObject;
    }

    @SerializedName("OperateParameter")
    @JsonProperty("OperateParameter")
    private OperateParameter operateParameter;

    public CellsObjectOperateTaskParameter operateParameter(OperateParameter operateParameter) {
        this.operateParameter = operateParameter;
        return this;
    }

    @ApiModelProperty(value = "")
    public OperateParameter getOperateParameter() {
        return operateParameter;
    }

    public void setOperateParameter(OperateParameter operateParameter) {
        this.operateParameter = operateParameter;
    }

    @SerializedName("DestinationDataSource")
    @JsonProperty("DestinationDataSource")
    private DataSource destinationDataSource;

    public CellsObjectOperateTaskParameter destinationDataSource(DataSource destinationDataSource) {
        this.destinationDataSource = destinationDataSource;
        return this;
    }

    @ApiModelProperty(value = "")
    public DataSource getDestinationDataSource() {
        return destinationDataSource;
    }

    public void setDestinationDataSource(DataSource destinationDataSource) {
        this.destinationDataSource = destinationDataSource;
    }

    @SerializedName("DestinationWorkbook")
    @JsonProperty("DestinationWorkbook")
    private FileSource destinationWorkbook;

    public CellsObjectOperateTaskParameter destinationWorkbook(FileSource destinationWorkbook) {
        this.destinationWorkbook = destinationWorkbook;
        return this;
    }

    @ApiModelProperty(value = "")
    public FileSource getDestinationWorkbook() {
        return destinationWorkbook;
    }

    public void setDestinationWorkbook(FileSource destinationWorkbook) {
        this.destinationWorkbook = destinationWorkbook;
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
        CellsObjectOperateTaskParameter other = (CellsObjectOperateTaskParameter) o;
        return Objects.equals(this.operateObject, other.operateObject)
            && Objects.equals(this.operateParameter, other.operateParameter)
            && Objects.equals(this.destinationDataSource, other.destinationDataSource)
            && Objects.equals(this.destinationWorkbook, other.destinationWorkbook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operateObject, operateParameter, destinationDataSource, destinationWorkbook, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CellsObjectOperateTaskParameter {\n");
        sb.append("    operateObject: ").append(operateObject).append("\n");
        sb.append("    operateParameter: ").append(operateParameter).append("\n");
        sb.append("    destinationDataSource: ").append(destinationDataSource).append("\n");
        sb.append("    destinationWorkbook: ").append(destinationWorkbook).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
