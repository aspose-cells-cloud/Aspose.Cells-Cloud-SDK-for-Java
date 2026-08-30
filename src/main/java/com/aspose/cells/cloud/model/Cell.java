package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cell — Encapsulates the object that represents a single Workbook cell. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cell extends LinkElement {
    /** Gets the name of the cell. */
    @JsonProperty("Name")
    private String name;

    /** Gets row number (zero based) of the cell. */
    @JsonProperty("Row")
    private Integer row;

    /** Gets column number (zero based) of the cell. */
    @JsonProperty("Column")
    private Integer column;

    /** Gets the value contained in this cell. */
    @JsonProperty("Value")
    private String value;

    /** Represents cell value type. */
    @JsonProperty("Type")
    private String type;

    /** Gets or sets a formula of the . */
    @JsonProperty("Formula")
    private String formula;

    /** Represents if the specified cell contains formula. */
    @JsonProperty("IsFormula")
    private Boolean isFormula;

    /** Checks if a cell is part of a merged range or not. */
    @JsonProperty("IsMerged")
    private Boolean isMerged;

    /** Indicates the cell's formula is and array formula and it is the first cell of the array. */
    @JsonProperty("IsArrayHeader")
    private Boolean isArrayHeader;

    /** Indicates whether the cell formula is an array formula. */
    @JsonProperty("IsInArray")
    private Boolean isInArray;

    /** Checks if the value of this cell is an error. */
    @JsonProperty("IsErrorValue")
    private Boolean isErrorValue;

    /** Indicates whether this cell is part of table formula. */
    @JsonProperty("IsInTable")
    private Boolean isInTable;

    /** Indicates if the cell's style is set. If return false, it means this cell has a default cell format. */
    @JsonProperty("IsStyleSet")
    private Boolean isStyleSet;

    /** Gets and sets the html string which contains data and some formats in this cell. */
    @JsonProperty("HtmlString")
    private String htmlString;

    /** This class property represents a style element with the specified XML element name. */
    @JsonProperty("Style")
    private LinkElement style;

    /** Gets the parent worksheet. */
    @JsonProperty("Worksheet")
    private String worksheet;

    public String getName() { return name; }
    public Cell setName(String name) { this.name = name; return this; }

    public Integer getRow() { return row; }
    public Cell setRow(Integer row) { this.row = row; return this; }

    public Integer getColumn() { return column; }
    public Cell setColumn(Integer column) { this.column = column; return this; }

    public String getValue() { return value; }
    public Cell setValue(String value) { this.value = value; return this; }

    public String getType() { return type; }
    public Cell setType(String type) { this.type = type; return this; }

    public String getFormula() { return formula; }
    public Cell setFormula(String formula) { this.formula = formula; return this; }

    public Boolean getIsFormula() { return isFormula; }
    public Cell setIsFormula(Boolean isFormula) { this.isFormula = isFormula; return this; }

    public Boolean getIsMerged() { return isMerged; }
    public Cell setIsMerged(Boolean isMerged) { this.isMerged = isMerged; return this; }

    public Boolean getIsArrayHeader() { return isArrayHeader; }
    public Cell setIsArrayHeader(Boolean isArrayHeader) { this.isArrayHeader = isArrayHeader; return this; }

    public Boolean getIsInArray() { return isInArray; }
    public Cell setIsInArray(Boolean isInArray) { this.isInArray = isInArray; return this; }

    public Boolean getIsErrorValue() { return isErrorValue; }
    public Cell setIsErrorValue(Boolean isErrorValue) { this.isErrorValue = isErrorValue; return this; }

    public Boolean getIsInTable() { return isInTable; }
    public Cell setIsInTable(Boolean isInTable) { this.isInTable = isInTable; return this; }

    public Boolean getIsStyleSet() { return isStyleSet; }
    public Cell setIsStyleSet(Boolean isStyleSet) { this.isStyleSet = isStyleSet; return this; }

    public String getHtmlString() { return htmlString; }
    public Cell setHtmlString(String htmlString) { this.htmlString = htmlString; return this; }

    public LinkElement getStyle() { return style; }
    public Cell setStyle(LinkElement style) { this.style = style; return this; }

    public String getWorksheet() { return worksheet; }
    public Cell setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }


    /** Covariant override: keeps fluent chains returning Cell. */
    @Override public Cell setLink(Link link) { return (Cell) super.setLink(link); }

}
