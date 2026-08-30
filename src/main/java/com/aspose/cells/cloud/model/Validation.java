package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Validation — Represents data validation.settings. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Validation extends LinkElement {
    /** Represents the validation alert style. */
    @JsonProperty("AlertStyle")
    private String alertStyle;

    /** Represents a collection of Aspose.Cells.CellArea which contains the data validation settings. */
    @JsonProperty("AreaList")
    private List<CellArea> areaList;

    /** Represents the data validation error message. */
    @JsonProperty("ErrorMessage")
    private String errorMessage;

    /** Represents the title of the data-validation error dialog box. */
    @JsonProperty("ErrorTitle")
    private String errorTitle;

    /** Represents the value or expression associated with the data validation. */
    @JsonProperty("Formula1")
    private String formula1;

    /** Represents the value or expression associated with the data validation. */
    @JsonProperty("Formula2")
    private String formula2;

    /** Indicates whether blank values are permitted by the range data validation. */
    @JsonProperty("IgnoreBlank")
    private Boolean ignoreBlank;

    /** Indicates whether data validation displays a drop-down list that contains acceptable values. */
    @JsonProperty("InCellDropDown")
    private Boolean inCellDropDown;

    /** Represents the data validation input message. */
    @JsonProperty("InputMessage")
    private String inputMessage;

    /** Represents the title of the data-validation input dialog box. */
    @JsonProperty("InputTitle")
    private String inputTitle;

    /** Represents the operator for the data validation. */
    @JsonProperty("Operator")
    private String operator;

    /** Indicates whether the data validation error message will be displayed whenever the user enters invalid data. */
    @JsonProperty("ShowError")
    private Boolean showError;

    /** Indicates whether the data validation input message will be displayed whenever the user selects a cell in the data validation range. */
    @JsonProperty("ShowInput")
    private Boolean showInput;

    /** Represents the data validation type. */
    @JsonProperty("Type")
    private String type;

    /** Represents the first value associated with the data validation. */
    @JsonProperty("Value1")
    private String value1;

    /** Represents the second value associated with the data validation. */
    @JsonProperty("Value2")
    private String value2;

    public String getAlertStyle() { return alertStyle; }
    public Validation setAlertStyle(String alertStyle) { this.alertStyle = alertStyle; return this; }

    public List<CellArea> getAreaList() { return areaList; }
    public Validation setAreaList(List<CellArea> areaList) { this.areaList = areaList; return this; }

    public String getErrorMessage() { return errorMessage; }
    public Validation setErrorMessage(String errorMessage) { this.errorMessage = errorMessage; return this; }

    public String getErrorTitle() { return errorTitle; }
    public Validation setErrorTitle(String errorTitle) { this.errorTitle = errorTitle; return this; }

    public String getFormula1() { return formula1; }
    public Validation setFormula1(String formula1) { this.formula1 = formula1; return this; }

    public String getFormula2() { return formula2; }
    public Validation setFormula2(String formula2) { this.formula2 = formula2; return this; }

    public Boolean getIgnoreBlank() { return ignoreBlank; }
    public Validation setIgnoreBlank(Boolean ignoreBlank) { this.ignoreBlank = ignoreBlank; return this; }

    public Boolean getInCellDropDown() { return inCellDropDown; }
    public Validation setInCellDropDown(Boolean inCellDropDown) { this.inCellDropDown = inCellDropDown; return this; }

    public String getInputMessage() { return inputMessage; }
    public Validation setInputMessage(String inputMessage) { this.inputMessage = inputMessage; return this; }

    public String getInputTitle() { return inputTitle; }
    public Validation setInputTitle(String inputTitle) { this.inputTitle = inputTitle; return this; }

    public String getOperator() { return operator; }
    public Validation setOperator(String operator) { this.operator = operator; return this; }

    public Boolean getShowError() { return showError; }
    public Validation setShowError(Boolean showError) { this.showError = showError; return this; }

    public Boolean getShowInput() { return showInput; }
    public Validation setShowInput(Boolean showInput) { this.showInput = showInput; return this; }

    public String getType() { return type; }
    public Validation setType(String type) { this.type = type; return this; }

    public String getValue1() { return value1; }
    public Validation setValue1(String value1) { this.value1 = value1; return this; }

    public String getValue2() { return value2; }
    public Validation setValue2(String value2) { this.value2 = value2; return this; }


    /** Covariant override: keeps fluent chains returning Validation. */
    @Override public Validation setLink(Link link) { return (Validation) super.setLink(link); }

}
