package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AnalyzedColumnDescription — Represents description of analyzed column. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnalyzedColumnDescription {
    /** Column index. */
    @JsonProperty("Index")
    private Integer index;

    /** The true position index value of the column. */
    @JsonProperty("ColumnIndex")
    private Integer columnIndex;

    /** This class has a public property "Title" of type string with a default value of an empty string. */
    @JsonProperty("Title")
    private String title;

    /** When the repetition rate is high, can it be viewed as a group display? */
    @JsonProperty("RepetitionRate")
    private Double repetitionRate;

    /** The column type is identified, and the attributes of the column are determined after data analysis. */
    @JsonProperty("ColumnDataDataType")
    private String columnDataDataType;

    /** Gets or sets NumberCategoryType. */
    @JsonProperty("NumberCategoryType")
    private String numberCategoryType;

    /** Gets or sets TextCategoryType. */
    @JsonProperty("TextCategoryType")
    private String textCategoryType;

    /** Gets or sets StyleNumber. */
    @JsonProperty("StyleNumber")
    private Integer styleNumber;

    /** Column data exception description. */
    @JsonProperty("columnDataExceptionDescription")
    private String columnDataExceptionDescription;

    public Integer getIndex() { return index; }
    public AnalyzedColumnDescription setIndex(Integer index) { this.index = index; return this; }

    public Integer getColumnIndex() { return columnIndex; }
    public AnalyzedColumnDescription setColumnIndex(Integer columnIndex) { this.columnIndex = columnIndex; return this; }

    public String getTitle() { return title; }
    public AnalyzedColumnDescription setTitle(String title) { this.title = title; return this; }

    public Double getRepetitionRate() { return repetitionRate; }
    public AnalyzedColumnDescription setRepetitionRate(Double repetitionRate) { this.repetitionRate = repetitionRate; return this; }

    public String getColumnDataDataType() { return columnDataDataType; }
    public AnalyzedColumnDescription setColumnDataDataType(String columnDataDataType) { this.columnDataDataType = columnDataDataType; return this; }

    public String getNumberCategoryType() { return numberCategoryType; }
    public AnalyzedColumnDescription setNumberCategoryType(String numberCategoryType) { this.numberCategoryType = numberCategoryType; return this; }

    public String getTextCategoryType() { return textCategoryType; }
    public AnalyzedColumnDescription setTextCategoryType(String textCategoryType) { this.textCategoryType = textCategoryType; return this; }

    public Integer getStyleNumber() { return styleNumber; }
    public AnalyzedColumnDescription setStyleNumber(Integer styleNumber) { this.styleNumber = styleNumber; return this; }

    public String getColumnDataExceptionDescription() { return columnDataExceptionDescription; }
    public AnalyzedColumnDescription setColumnDataExceptionDescription(String columnDataExceptionDescription) { this.columnDataExceptionDescription = columnDataExceptionDescription; return this; }

}
