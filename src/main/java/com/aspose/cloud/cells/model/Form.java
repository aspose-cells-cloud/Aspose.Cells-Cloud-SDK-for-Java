/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Form.java">
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


public class Form  extends  Shape {
        @SerializedName("FormType")
        private String formType ;

        public  Form  formType(String  formType) {
            this.formType =  formType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getFormType() {
            return formType;
        }

        public void setFormType(String formType) {
            this.formType = formType;
        }

        @SerializedName("CheckedValue")
        private String checkedValue ;

        public  Form  checkedValue(String  checkedValue) {
            this.checkedValue =  checkedValue;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getCheckedValue() {
            return checkedValue;
        }

        public void setCheckedValue(String checkedValue) {
            this.checkedValue = checkedValue;
        }

        @SerializedName("Shadow")
        private Boolean shadow ;

        public  Form  shadow(Boolean  shadow) {
            this.shadow =  shadow;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getShadow() {
            return shadow;
        }

        public void setShadow(Boolean shadow) {
            this.shadow = shadow;
        }

        @SerializedName("InputRange")
        private String inputRange ;

        public  Form  inputRange(String  inputRange) {
            this.inputRange =  inputRange;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getInputRange() {
            return inputRange;
        }

        public void setInputRange(String inputRange) {
            this.inputRange = inputRange;
        }

        @SerializedName("SelectedIndex")
        private Integer selectedIndex ;

        public  Form  selectedIndex(Integer  selectedIndex) {
            this.selectedIndex =  selectedIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getSelectedIndex() {
            return selectedIndex;
        }

        public void setSelectedIndex(Integer selectedIndex) {
            this.selectedIndex = selectedIndex;
        }

        @SerializedName("SelectedValue")
        private String selectedValue ;

        public  Form  selectedValue(String  selectedValue) {
            this.selectedValue =  selectedValue;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSelectedValue() {
            return selectedValue;
        }

        public void setSelectedValue(String selectedValue) {
            this.selectedValue = selectedValue;
        }

        @SerializedName("SelectedCell")
        private LinkElement selectedCell ;

        public  Form  selectedCell(LinkElement  selectedCell) {
            this.selectedCell =  selectedCell;
            return this;
        }

        @ApiModelProperty(value = "")
        public LinkElement getSelectedCell() {
            return selectedCell;
        }

        public void setSelectedCell(LinkElement selectedCell) {
            this.selectedCell = selectedCell;
        }

        @SerializedName("DropDownLines")
        private Integer dropDownLines ;

        public  Form  dropDownLines(Integer  dropDownLines) {
            this.dropDownLines =  dropDownLines;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getDropDownLines() {
            return dropDownLines;
        }

        public void setDropDownLines(Integer dropDownLines) {
            this.dropDownLines = dropDownLines;
        }

        @SerializedName("ItemCount")
        private Integer itemCount ;

        public  Form  itemCount(Integer  itemCount) {
            this.itemCount =  itemCount;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getItemCount() {
            return itemCount;
        }

        public void setItemCount(Integer itemCount) {
            this.itemCount = itemCount;
        }

        @SerializedName("SelectedCells")
        private List<LinkElement> selectedCells ;

        public  Form  selectedCells(List<LinkElement>  selectedCells) {
            this.selectedCells =  selectedCells;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<LinkElement> getSelectedCells() {
            return selectedCells;
        }

        public void setSelectedCells(List<LinkElement> selectedCells) {
            this.selectedCells = selectedCells;
        }

        @SerializedName("SelectionType")
        private String selectionType ;

        public  Form  selectionType(String  selectionType) {
            this.selectionType =  selectionType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSelectionType() {
            return selectionType;
        }

        public void setSelectionType(String selectionType) {
            this.selectionType = selectionType;
        }

        @SerializedName("IsChecked")
        private Boolean isChecked ;

        public  Form  isChecked(Boolean  isChecked) {
            this.isChecked =  isChecked;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsChecked() {
            return isChecked;
        }

        public void setIsChecked(Boolean isChecked) {
            this.isChecked = isChecked;
        }

        @SerializedName("CurrentValue")
        private Integer currentValue ;

        public  Form  currentValue(Integer  currentValue) {
            this.currentValue =  currentValue;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getCurrentValue() {
            return currentValue;
        }

        public void setCurrentValue(Integer currentValue) {
            this.currentValue = currentValue;
        }

        @SerializedName("Min")
        private Integer min ;

        public  Form  min(Integer  min) {
            this.min =  min;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getMin() {
            return min;
        }

        public void setMin(Integer min) {
            this.min = min;
        }

        @SerializedName("Max")
        private Integer max ;

        public  Form  max(Integer  max) {
            this.max =  max;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getMax() {
            return max;
        }

        public void setMax(Integer max) {
            this.max = max;
        }

        @SerializedName("IncrementalChange")
        private Integer incrementalChange ;

        public  Form  incrementalChange(Integer  incrementalChange) {
            this.incrementalChange =  incrementalChange;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getIncrementalChange() {
            return incrementalChange;
        }

        public void setIncrementalChange(Integer incrementalChange) {
            this.incrementalChange = incrementalChange;
        }

        @SerializedName("PageChange")
        private Integer pageChange ;

        public  Form  pageChange(Integer  pageChange) {
            this.pageChange =  pageChange;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getPageChange() {
            return pageChange;
        }

        public void setPageChange(Integer pageChange) {
            this.pageChange = pageChange;
        }

        @SerializedName("IsHorizontal")
        private Boolean isHorizontal ;

        public  Form  isHorizontal(Boolean  isHorizontal) {
            this.isHorizontal =  isHorizontal;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsHorizontal() {
            return isHorizontal;
        }

        public void setIsHorizontal(Boolean isHorizontal) {
            this.isHorizontal = isHorizontal;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Form form = (Form) o;
            return
                Objects.equals(this.formType, form.formType) &&
                Objects.equals(this.checkedValue, form.checkedValue) &&
                Objects.equals(this.shadow, form.shadow) &&
                Objects.equals(this.inputRange, form.inputRange) &&
                Objects.equals(this.selectedIndex, form.selectedIndex) &&
                Objects.equals(this.selectedValue, form.selectedValue) &&
                Objects.equals(this.selectedCell, form.selectedCell) &&
                Objects.equals(this.dropDownLines, form.dropDownLines) &&
                Objects.equals(this.itemCount, form.itemCount) &&
                Objects.equals(this.selectedCells, form.selectedCells) &&
                Objects.equals(this.selectionType, form.selectionType) &&
                Objects.equals(this.isChecked, form.isChecked) &&
                Objects.equals(this.currentValue, form.currentValue) &&
                Objects.equals(this.min, form.min) &&
                Objects.equals(this.max, form.max) &&
                Objects.equals(this.incrementalChange, form.incrementalChange) &&
                Objects.equals(this.pageChange, form.pageChange) &&
                Objects.equals(this.isHorizontal, form.isHorizontal) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(formType, checkedValue, shadow, inputRange, selectedIndex, selectedValue, selectedCell, dropDownLines, itemCount, selectedCells, selectionType, isChecked, currentValue, min, max, incrementalChange, pageChange, isHorizontal, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Form {\n");
            sb.append("    formType: ").append(toIndentedString(getFormType())).append("\n");
            sb.append("    checkedValue: ").append(toIndentedString(getCheckedValue())).append("\n");
            sb.append("    shadow: ").append(toIndentedString(getShadow())).append("\n");
            sb.append("    inputRange: ").append(toIndentedString(getInputRange())).append("\n");
            sb.append("    selectedIndex: ").append(toIndentedString(getSelectedIndex())).append("\n");
            sb.append("    selectedValue: ").append(toIndentedString(getSelectedValue())).append("\n");
            sb.append("    selectedCell: ").append(toIndentedString(getSelectedCell())).append("\n");
            sb.append("    dropDownLines: ").append(toIndentedString(getDropDownLines())).append("\n");
            sb.append("    itemCount: ").append(toIndentedString(getItemCount())).append("\n");
            sb.append("    selectedCells: ").append(toIndentedString(getSelectedCells())).append("\n");
            sb.append("    selectionType: ").append(toIndentedString(getSelectionType())).append("\n");
            sb.append("    isChecked: ").append(toIndentedString(getIsChecked())).append("\n");
            sb.append("    currentValue: ").append(toIndentedString(getCurrentValue())).append("\n");
            sb.append("    min: ").append(toIndentedString(getMin())).append("\n");
            sb.append("    max: ").append(toIndentedString(getMax())).append("\n");
            sb.append("    incrementalChange: ").append(toIndentedString(getIncrementalChange())).append("\n");
            sb.append("    pageChange: ").append(toIndentedString(getPageChange())).append("\n");
            sb.append("    isHorizontal: ").append(toIndentedString(getIsHorizontal())).append("\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    msoDrawingType: ").append(toIndentedString(getMsoDrawingType())).append("\n");
            sb.append("    autoShapeType: ").append(toIndentedString(getAutoShapeType())).append("\n");
            sb.append("    placement: ").append(toIndentedString(getPlacement())).append("\n");
            sb.append("    upperLeftRow: ").append(toIndentedString(getUpperLeftRow())).append("\n");
            sb.append("    top: ").append(toIndentedString(getTop())).append("\n");
            sb.append("    upperLeftColumn: ").append(toIndentedString(getUpperLeftColumn())).append("\n");
            sb.append("    left: ").append(toIndentedString(getLeft())).append("\n");
            sb.append("    lowerRightRow: ").append(toIndentedString(getLowerRightRow())).append("\n");
            sb.append("    bottom: ").append(toIndentedString(getBottom())).append("\n");
            sb.append("    lowerRightColumn: ").append(toIndentedString(getLowerRightColumn())).append("\n");
            sb.append("    right: ").append(toIndentedString(getRight())).append("\n");
            sb.append("    width: ").append(toIndentedString(getWidth())).append("\n");
            sb.append("    height: ").append(toIndentedString(getHeight())).append("\n");
            sb.append("    x: ").append(toIndentedString(getX())).append("\n");
            sb.append("    y: ").append(toIndentedString(getY())).append("\n");
            sb.append("    rotationAngle: ").append(toIndentedString(getRotationAngle())).append("\n");
            sb.append("    htmlText: ").append(toIndentedString(getHtmlText())).append("\n");
            sb.append("    text: ").append(toIndentedString(getText())).append("\n");
            sb.append("    alternativeText: ").append(toIndentedString(getAlternativeText())).append("\n");
            sb.append("    textHorizontalAlignment: ").append(toIndentedString(getTextHorizontalAlignment())).append("\n");
            sb.append("    textHorizontalOverflow: ").append(toIndentedString(getTextHorizontalOverflow())).append("\n");
            sb.append("    textOrientationType: ").append(toIndentedString(getTextOrientationType())).append("\n");
            sb.append("    textVerticalAlignment: ").append(toIndentedString(getTextVerticalAlignment())).append("\n");
            sb.append("    textVerticalOverflow: ").append(toIndentedString(getTextVerticalOverflow())).append("\n");
            sb.append("    isGroup: ").append(toIndentedString(getIsGroup())).append("\n");
            sb.append("    isHidden: ").append(toIndentedString(getIsHidden())).append("\n");
            sb.append("    isLockAspectRatio: ").append(toIndentedString(getIsLockAspectRatio())).append("\n");
            sb.append("    isLocked: ").append(toIndentedString(getIsLocked())).append("\n");
            sb.append("    isPrintable: ").append(toIndentedString(getIsPrintable())).append("\n");
            sb.append("    isTextWrapped: ").append(toIndentedString(getIsTextWrapped())).append("\n");
            sb.append("    isWordArt: ").append(toIndentedString(getIsWordArt())).append("\n");
            sb.append("    linkedCell: ").append(toIndentedString(getLinkedCell())).append("\n");
            sb.append("    zOrderPosition: ").append(toIndentedString(getZOrderPosition())).append("\n");
            sb.append("    font: ").append(toIndentedString(getFont())).append("\n");
            sb.append("    hyperlink: ").append(toIndentedString(getHyperlink())).append("\n");
            sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
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

