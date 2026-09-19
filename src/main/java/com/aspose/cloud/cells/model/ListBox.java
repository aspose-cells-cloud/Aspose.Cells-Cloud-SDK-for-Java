/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ListBox.java">
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


public class ListBox  extends  Shape {
        @SerializedName("InputRange")
        private String inputRange ;

        public  ListBox  inputRange(String  inputRange) {
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

        @SerializedName("ItemCount")
        private Integer itemCount ;

        public  ListBox  itemCount(Integer  itemCount) {
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

        @SerializedName("PageChange")
        private Integer pageChange ;

        public  ListBox  pageChange(Integer  pageChange) {
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

        @SerializedName("SelectedCells")
        private List<LinkElement> selectedCells ;

        public  ListBox  selectedCells(List<LinkElement>  selectedCells) {
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

        @SerializedName("SelectedIndex")
        private Integer selectedIndex ;

        public  ListBox  selectedIndex(Integer  selectedIndex) {
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

        @SerializedName("SelectionType")
        private String selectionType ;

        public  ListBox  selectionType(String  selectionType) {
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

        @SerializedName("Shadow")
        private Boolean shadow ;

        public  ListBox  shadow(Boolean  shadow) {
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

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ListBox listBox = (ListBox) o;
            return
                Objects.equals(this.inputRange, listBox.inputRange) &&
                Objects.equals(this.itemCount, listBox.itemCount) &&
                Objects.equals(this.pageChange, listBox.pageChange) &&
                Objects.equals(this.selectedCells, listBox.selectedCells) &&
                Objects.equals(this.selectedIndex, listBox.selectedIndex) &&
                Objects.equals(this.selectionType, listBox.selectionType) &&
                Objects.equals(this.shadow, listBox.shadow) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(inputRange, itemCount, pageChange, selectedCells, selectedIndex, selectionType, shadow, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ListBox {\n");
            sb.append("    inputRange: ").append(toIndentedString(getInputRange())).append("\n");
            sb.append("    itemCount: ").append(toIndentedString(getItemCount())).append("\n");
            sb.append("    pageChange: ").append(toIndentedString(getPageChange())).append("\n");
            sb.append("    selectedCells: ").append(toIndentedString(getSelectedCells())).append("\n");
            sb.append("    selectedIndex: ").append(toIndentedString(getSelectedIndex())).append("\n");
            sb.append("    selectionType: ").append(toIndentedString(getSelectionType())).append("\n");
            sb.append("    shadow: ").append(toIndentedString(getShadow())).append("\n");
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

