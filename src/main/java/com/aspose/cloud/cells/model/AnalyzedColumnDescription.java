/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AnalyzedColumnDescription.java">
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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class AnalyzedColumnDescription {
        @SerializedName("Index")
        private Integer index ;

        public  AnalyzedColumnDescription  index(Integer  index) {
            this.index =  index;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getIndex() {
            return index;
        }

        public void setIndex(Integer index) {
            this.index = index;
        }

        @SerializedName("ColumnIndex")
        private Integer columnIndex ;

        public  AnalyzedColumnDescription  columnIndex(Integer  columnIndex) {
            this.columnIndex =  columnIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getColumnIndex() {
            return columnIndex;
        }

        public void setColumnIndex(Integer columnIndex) {
            this.columnIndex = columnIndex;
        }

        @SerializedName("Title")
        private String title ;

        public  AnalyzedColumnDescription  title(String  title) {
            this.title =  title;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @SerializedName("RepetitionRate")
        private Double repetitionRate ;

        public  AnalyzedColumnDescription  repetitionRate(Double  repetitionRate) {
            this.repetitionRate =  repetitionRate;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getRepetitionRate() {
            return repetitionRate;
        }

        public void setRepetitionRate(Double repetitionRate) {
            this.repetitionRate = repetitionRate;
        }

        @SerializedName("ColumnDataDataType")
        private String columnDataDataType ;

        public  AnalyzedColumnDescription  columnDataDataType(String  columnDataDataType) {
            this.columnDataDataType =  columnDataDataType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getColumnDataDataType() {
            return columnDataDataType;
        }

        public void setColumnDataDataType(String columnDataDataType) {
            this.columnDataDataType = columnDataDataType;
        }

        @SerializedName("NumberCategoryType")
        private String numberCategoryType ;

        public  AnalyzedColumnDescription  numberCategoryType(String  numberCategoryType) {
            this.numberCategoryType =  numberCategoryType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getNumberCategoryType() {
            return numberCategoryType;
        }

        public void setNumberCategoryType(String numberCategoryType) {
            this.numberCategoryType = numberCategoryType;
        }

        @SerializedName("TextCategoryType")
        private String textCategoryType ;

        public  AnalyzedColumnDescription  textCategoryType(String  textCategoryType) {
            this.textCategoryType =  textCategoryType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getTextCategoryType() {
            return textCategoryType;
        }

        public void setTextCategoryType(String textCategoryType) {
            this.textCategoryType = textCategoryType;
        }

        @SerializedName("StyleNumber")
        private Integer styleNumber ;

        public  AnalyzedColumnDescription  styleNumber(Integer  styleNumber) {
            this.styleNumber =  styleNumber;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getStyleNumber() {
            return styleNumber;
        }

        public void setStyleNumber(Integer styleNumber) {
            this.styleNumber = styleNumber;
        }

        @SerializedName("ColumnDataExceptionDescription")
        private String columnDataExceptionDescription ;

        public  AnalyzedColumnDescription  columnDataExceptionDescription(String  columnDataExceptionDescription) {
            this.columnDataExceptionDescription =  columnDataExceptionDescription;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getColumnDataExceptionDescription() {
            return columnDataExceptionDescription;
        }

        public void setColumnDataExceptionDescription(String columnDataExceptionDescription) {
            this.columnDataExceptionDescription = columnDataExceptionDescription;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            AnalyzedColumnDescription analyzedColumnDescription = (AnalyzedColumnDescription) o;
            return
                Objects.equals(this.index, analyzedColumnDescription.index) &&
                Objects.equals(this.columnIndex, analyzedColumnDescription.columnIndex) &&
                Objects.equals(this.title, analyzedColumnDescription.title) &&
                Objects.equals(this.repetitionRate, analyzedColumnDescription.repetitionRate) &&
                Objects.equals(this.columnDataDataType, analyzedColumnDescription.columnDataDataType) &&
                Objects.equals(this.numberCategoryType, analyzedColumnDescription.numberCategoryType) &&
                Objects.equals(this.textCategoryType, analyzedColumnDescription.textCategoryType) &&
                Objects.equals(this.styleNumber, analyzedColumnDescription.styleNumber) &&
                Objects.equals(this.columnDataExceptionDescription, analyzedColumnDescription.columnDataExceptionDescription);
      }

      @Override
      public int hashCode() {
        return Objects.hash(index, columnIndex, title, repetitionRate, columnDataDataType, numberCategoryType, textCategoryType, styleNumber, columnDataExceptionDescription);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AnalyzedColumnDescription {\n");
            sb.append("    index: ").append(toIndentedString(getIndex())).append("\n");
            sb.append("    columnIndex: ").append(toIndentedString(getColumnIndex())).append("\n");
            sb.append("    title: ").append(toIndentedString(getTitle())).append("\n");
            sb.append("    repetitionRate: ").append(toIndentedString(getRepetitionRate())).append("\n");
            sb.append("    columnDataDataType: ").append(toIndentedString(getColumnDataDataType())).append("\n");
            sb.append("    numberCategoryType: ").append(toIndentedString(getNumberCategoryType())).append("\n");
            sb.append("    textCategoryType: ").append(toIndentedString(getTextCategoryType())).append("\n");
            sb.append("    styleNumber: ").append(toIndentedString(getStyleNumber())).append("\n");
            sb.append("    columnDataExceptionDescription: ").append(toIndentedString(getColumnDataExceptionDescription())).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
        * Convert the given object to string with each line indented by 4 spaces
        * (except the first line).
        */
        private String toIndentedString(java.lang.Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }


}

