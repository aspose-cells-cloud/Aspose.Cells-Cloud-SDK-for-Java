/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Validation.java">
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

public class Validation extends LinkElement {

    @SerializedName("AlertStyle")
    @JsonProperty("AlertStyle")
    private String alertStyle;

    public Validation alertStyle(String alertStyle) {
        this.alertStyle = alertStyle;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getAlertStyle() {
        return alertStyle;
    }

    public void setAlertStyle(String alertStyle) {
        this.alertStyle = alertStyle;
    }

    @SerializedName("AreaList")
    @JsonProperty("AreaList")
    private List<CellArea> areaList;

    public Validation areaList(List<CellArea> areaList) {
        this.areaList = areaList;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<CellArea> getAreaList() {
        return areaList;
    }

    public void setAreaList(List<CellArea> areaList) {
        this.areaList = areaList;
    }

    @SerializedName("ErrorMessage")
    @JsonProperty("ErrorMessage")
    private String errorMessage;

    public Validation errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @SerializedName("ErrorTitle")
    @JsonProperty("ErrorTitle")
    private String errorTitle;

    public Validation errorTitle(String errorTitle) {
        this.errorTitle = errorTitle;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getErrorTitle() {
        return errorTitle;
    }

    public void setErrorTitle(String errorTitle) {
        this.errorTitle = errorTitle;
    }

    @SerializedName("Formula1")
    @JsonProperty("Formula1")
    private String formula1;

    public Validation formula1(String formula1) {
        this.formula1 = formula1;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getFormula1() {
        return formula1;
    }

    public void setFormula1(String formula1) {
        this.formula1 = formula1;
    }

    @SerializedName("Formula2")
    @JsonProperty("Formula2")
    private String formula2;

    public Validation formula2(String formula2) {
        this.formula2 = formula2;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getFormula2() {
        return formula2;
    }

    public void setFormula2(String formula2) {
        this.formula2 = formula2;
    }

    @SerializedName("IgnoreBlank")
    @JsonProperty("IgnoreBlank")
    private Boolean ignoreBlank;

    public Validation ignoreBlank(Boolean ignoreBlank) {
        this.ignoreBlank = ignoreBlank;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIgnoreBlank() {
        return ignoreBlank;
    }

    public void setIgnoreBlank(Boolean ignoreBlank) {
        this.ignoreBlank = ignoreBlank;
    }

    @SerializedName("InCellDropDown")
    @JsonProperty("InCellDropDown")
    private Boolean inCellDropDown;

    public Validation inCellDropDown(Boolean inCellDropDown) {
        this.inCellDropDown = inCellDropDown;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getInCellDropDown() {
        return inCellDropDown;
    }

    public void setInCellDropDown(Boolean inCellDropDown) {
        this.inCellDropDown = inCellDropDown;
    }

    @SerializedName("InputMessage")
    @JsonProperty("InputMessage")
    private String inputMessage;

    public Validation inputMessage(String inputMessage) {
        this.inputMessage = inputMessage;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getInputMessage() {
        return inputMessage;
    }

    public void setInputMessage(String inputMessage) {
        this.inputMessage = inputMessage;
    }

    @SerializedName("InputTitle")
    @JsonProperty("InputTitle")
    private String inputTitle;

    public Validation inputTitle(String inputTitle) {
        this.inputTitle = inputTitle;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getInputTitle() {
        return inputTitle;
    }

    public void setInputTitle(String inputTitle) {
        this.inputTitle = inputTitle;
    }

    @SerializedName("Operator")
    @JsonProperty("Operator")
    private String operator;

    public Validation operator(String operator) {
        this.operator = operator;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @SerializedName("ShowError")
    @JsonProperty("ShowError")
    private Boolean showError;

    public Validation showError(Boolean showError) {
        this.showError = showError;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowError() {
        return showError;
    }

    public void setShowError(Boolean showError) {
        this.showError = showError;
    }

    @SerializedName("ShowInput")
    @JsonProperty("ShowInput")
    private Boolean showInput;

    public Validation showInput(Boolean showInput) {
        this.showInput = showInput;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowInput() {
        return showInput;
    }

    public void setShowInput(Boolean showInput) {
        this.showInput = showInput;
    }

    @SerializedName("Type")
    @JsonProperty("Type")
    private String type;

    public Validation type(String type) {
        this.type = type;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @SerializedName("Value1")
    @JsonProperty("Value1")
    private String value1;

    public Validation value1(String value1) {
        this.value1 = value1;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    @SerializedName("Value2")
    @JsonProperty("Value2")
    private String value2;

    public Validation value2(String value2) {
        this.value2 = value2;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
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
        Validation other = (Validation) o;
        return Objects.equals(this.alertStyle, other.alertStyle)
            && Objects.equals(this.areaList, other.areaList)
            && Objects.equals(this.errorMessage, other.errorMessage)
            && Objects.equals(this.errorTitle, other.errorTitle)
            && Objects.equals(this.formula1, other.formula1)
            && Objects.equals(this.formula2, other.formula2)
            && Objects.equals(this.ignoreBlank, other.ignoreBlank)
            && Objects.equals(this.inCellDropDown, other.inCellDropDown)
            && Objects.equals(this.inputMessage, other.inputMessage)
            && Objects.equals(this.inputTitle, other.inputTitle)
            && Objects.equals(this.operator, other.operator)
            && Objects.equals(this.showError, other.showError)
            && Objects.equals(this.showInput, other.showInput)
            && Objects.equals(this.type, other.type)
            && Objects.equals(this.value1, other.value1)
            && Objects.equals(this.value2, other.value2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alertStyle, areaList, errorMessage, errorTitle, formula1, formula2, ignoreBlank, inCellDropDown, inputMessage, inputTitle, operator, showError, showInput, type, value1, value2, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Validation {\n");
        sb.append("    alertStyle: ").append(alertStyle).append("\n");
        sb.append("    areaList: ").append(areaList).append("\n");
        sb.append("    errorMessage: ").append(errorMessage).append("\n");
        sb.append("    errorTitle: ").append(errorTitle).append("\n");
        sb.append("    formula1: ").append(formula1).append("\n");
        sb.append("    formula2: ").append(formula2).append("\n");
        sb.append("    ignoreBlank: ").append(ignoreBlank).append("\n");
        sb.append("    inCellDropDown: ").append(inCellDropDown).append("\n");
        sb.append("    inputMessage: ").append(inputMessage).append("\n");
        sb.append("    inputTitle: ").append(inputTitle).append("\n");
        sb.append("    operator: ").append(operator).append("\n");
        sb.append("    showError: ").append(showError).append("\n");
        sb.append("    showInput: ").append(showInput).append("\n");
        sb.append("    type: ").append(type).append("\n");
        sb.append("    value1: ").append(value1).append("\n");
        sb.append("    value2: ").append(value2).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
