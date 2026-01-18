/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ProtectSheetParameter.java">
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


public class ProtectSheetParameter {
        @SerializedName("ProtectionType")
        private String protectionType ;

        public  ProtectSheetParameter  protectionType(String  protectionType) {
            this.protectionType =  protectionType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getProtectionType() {
            return protectionType;
        }

        public void setProtectionType(String protectionType) {
            this.protectionType = protectionType;
        }

        @SerializedName("Password")
        private String password ;

        public  ProtectSheetParameter  password(String  password) {
            this.password =  password;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @SerializedName("AllowEditArea")
        private List<String> allowEditArea ;

        public  ProtectSheetParameter  allowEditArea(List<String>  allowEditArea) {
            this.allowEditArea =  allowEditArea;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<String> getAllowEditArea() {
            return allowEditArea;
        }

        public void setAllowEditArea(List<String> allowEditArea) {
            this.allowEditArea = allowEditArea;
        }

        @SerializedName("AllowDeletingColumn")
        private String allowDeletingColumn ;

        public  ProtectSheetParameter  allowDeletingColumn(String  allowDeletingColumn) {
            this.allowDeletingColumn =  allowDeletingColumn;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAllowDeletingColumn() {
            return allowDeletingColumn;
        }

        public void setAllowDeletingColumn(String allowDeletingColumn) {
            this.allowDeletingColumn = allowDeletingColumn;
        }

        @SerializedName("AllowDeletingRow")
        private String allowDeletingRow ;

        public  ProtectSheetParameter  allowDeletingRow(String  allowDeletingRow) {
            this.allowDeletingRow =  allowDeletingRow;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAllowDeletingRow() {
            return allowDeletingRow;
        }

        public void setAllowDeletingRow(String allowDeletingRow) {
            this.allowDeletingRow = allowDeletingRow;
        }

        @SerializedName("AllowFiltering")
        private String allowFiltering ;

        public  ProtectSheetParameter  allowFiltering(String  allowFiltering) {
            this.allowFiltering =  allowFiltering;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAllowFiltering() {
            return allowFiltering;
        }

        public void setAllowFiltering(String allowFiltering) {
            this.allowFiltering = allowFiltering;
        }

        @SerializedName("AllowFormattingCell")
        private String allowFormattingCell ;

        public  ProtectSheetParameter  allowFormattingCell(String  allowFormattingCell) {
            this.allowFormattingCell =  allowFormattingCell;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAllowFormattingCell() {
            return allowFormattingCell;
        }

        public void setAllowFormattingCell(String allowFormattingCell) {
            this.allowFormattingCell = allowFormattingCell;
        }

        @SerializedName("AllowFormattingColumn")
        private String allowFormattingColumn ;

        public  ProtectSheetParameter  allowFormattingColumn(String  allowFormattingColumn) {
            this.allowFormattingColumn =  allowFormattingColumn;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAllowFormattingColumn() {
            return allowFormattingColumn;
        }

        public void setAllowFormattingColumn(String allowFormattingColumn) {
            this.allowFormattingColumn = allowFormattingColumn;
        }

        @SerializedName("AllowFormattingRow")
        private String allowFormattingRow ;

        public  ProtectSheetParameter  allowFormattingRow(String  allowFormattingRow) {
            this.allowFormattingRow =  allowFormattingRow;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAllowFormattingRow() {
            return allowFormattingRow;
        }

        public void setAllowFormattingRow(String allowFormattingRow) {
            this.allowFormattingRow = allowFormattingRow;
        }

        @SerializedName("AllowInsertingColumn")
        private String allowInsertingColumn ;

        public  ProtectSheetParameter  allowInsertingColumn(String  allowInsertingColumn) {
            this.allowInsertingColumn =  allowInsertingColumn;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAllowInsertingColumn() {
            return allowInsertingColumn;
        }

        public void setAllowInsertingColumn(String allowInsertingColumn) {
            this.allowInsertingColumn = allowInsertingColumn;
        }

        @SerializedName("AllowInsertingHyperlink")
        private String allowInsertingHyperlink ;

        public  ProtectSheetParameter  allowInsertingHyperlink(String  allowInsertingHyperlink) {
            this.allowInsertingHyperlink =  allowInsertingHyperlink;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAllowInsertingHyperlink() {
            return allowInsertingHyperlink;
        }

        public void setAllowInsertingHyperlink(String allowInsertingHyperlink) {
            this.allowInsertingHyperlink = allowInsertingHyperlink;
        }

        @SerializedName("AllowInsertingRow")
        private String allowInsertingRow ;

        public  ProtectSheetParameter  allowInsertingRow(String  allowInsertingRow) {
            this.allowInsertingRow =  allowInsertingRow;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAllowInsertingRow() {
            return allowInsertingRow;
        }

        public void setAllowInsertingRow(String allowInsertingRow) {
            this.allowInsertingRow = allowInsertingRow;
        }

        @SerializedName("AllowSelectingLockedCell")
        private String allowSelectingLockedCell ;

        public  ProtectSheetParameter  allowSelectingLockedCell(String  allowSelectingLockedCell) {
            this.allowSelectingLockedCell =  allowSelectingLockedCell;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAllowSelectingLockedCell() {
            return allowSelectingLockedCell;
        }

        public void setAllowSelectingLockedCell(String allowSelectingLockedCell) {
            this.allowSelectingLockedCell = allowSelectingLockedCell;
        }

        @SerializedName("AllowSelectingUnlockedCell")
        private String allowSelectingUnlockedCell ;

        public  ProtectSheetParameter  allowSelectingUnlockedCell(String  allowSelectingUnlockedCell) {
            this.allowSelectingUnlockedCell =  allowSelectingUnlockedCell;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAllowSelectingUnlockedCell() {
            return allowSelectingUnlockedCell;
        }

        public void setAllowSelectingUnlockedCell(String allowSelectingUnlockedCell) {
            this.allowSelectingUnlockedCell = allowSelectingUnlockedCell;
        }

        @SerializedName("AllowSorting")
        private String allowSorting ;

        public  ProtectSheetParameter  allowSorting(String  allowSorting) {
            this.allowSorting =  allowSorting;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAllowSorting() {
            return allowSorting;
        }

        public void setAllowSorting(String allowSorting) {
            this.allowSorting = allowSorting;
        }

        @SerializedName("AllowUsingPivotTable")
        private String allowUsingPivotTable ;

        public  ProtectSheetParameter  allowUsingPivotTable(String  allowUsingPivotTable) {
            this.allowUsingPivotTable =  allowUsingPivotTable;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAllowUsingPivotTable() {
            return allowUsingPivotTable;
        }

        public void setAllowUsingPivotTable(String allowUsingPivotTable) {
            this.allowUsingPivotTable = allowUsingPivotTable;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ProtectSheetParameter protectSheetParameter = (ProtectSheetParameter) o;
            return
                Objects.equals(this.protectionType, protectSheetParameter.protectionType) &&
                Objects.equals(this.password, protectSheetParameter.password) &&
                Objects.equals(this.allowEditArea, protectSheetParameter.allowEditArea) &&
                Objects.equals(this.allowDeletingColumn, protectSheetParameter.allowDeletingColumn) &&
                Objects.equals(this.allowDeletingRow, protectSheetParameter.allowDeletingRow) &&
                Objects.equals(this.allowFiltering, protectSheetParameter.allowFiltering) &&
                Objects.equals(this.allowFormattingCell, protectSheetParameter.allowFormattingCell) &&
                Objects.equals(this.allowFormattingColumn, protectSheetParameter.allowFormattingColumn) &&
                Objects.equals(this.allowFormattingRow, protectSheetParameter.allowFormattingRow) &&
                Objects.equals(this.allowInsertingColumn, protectSheetParameter.allowInsertingColumn) &&
                Objects.equals(this.allowInsertingHyperlink, protectSheetParameter.allowInsertingHyperlink) &&
                Objects.equals(this.allowInsertingRow, protectSheetParameter.allowInsertingRow) &&
                Objects.equals(this.allowSelectingLockedCell, protectSheetParameter.allowSelectingLockedCell) &&
                Objects.equals(this.allowSelectingUnlockedCell, protectSheetParameter.allowSelectingUnlockedCell) &&
                Objects.equals(this.allowSorting, protectSheetParameter.allowSorting) &&
                Objects.equals(this.allowUsingPivotTable, protectSheetParameter.allowUsingPivotTable);
      }

      @Override
      public int hashCode() {
        return Objects.hash(protectionType, password, allowEditArea, allowDeletingColumn, allowDeletingRow, allowFiltering, allowFormattingCell, allowFormattingColumn, allowFormattingRow, allowInsertingColumn, allowInsertingHyperlink, allowInsertingRow, allowSelectingLockedCell, allowSelectingUnlockedCell, allowSorting, allowUsingPivotTable);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ProtectSheetParameter {\n");
            sb.append("    protectionType: ").append(toIndentedString(getProtectionType())).append("\n");
            sb.append("    password: ").append(toIndentedString(getPassword())).append("\n");
            sb.append("    allowEditArea: ").append(toIndentedString(getAllowEditArea())).append("\n");
            sb.append("    allowDeletingColumn: ").append(toIndentedString(getAllowDeletingColumn())).append("\n");
            sb.append("    allowDeletingRow: ").append(toIndentedString(getAllowDeletingRow())).append("\n");
            sb.append("    allowFiltering: ").append(toIndentedString(getAllowFiltering())).append("\n");
            sb.append("    allowFormattingCell: ").append(toIndentedString(getAllowFormattingCell())).append("\n");
            sb.append("    allowFormattingColumn: ").append(toIndentedString(getAllowFormattingColumn())).append("\n");
            sb.append("    allowFormattingRow: ").append(toIndentedString(getAllowFormattingRow())).append("\n");
            sb.append("    allowInsertingColumn: ").append(toIndentedString(getAllowInsertingColumn())).append("\n");
            sb.append("    allowInsertingHyperlink: ").append(toIndentedString(getAllowInsertingHyperlink())).append("\n");
            sb.append("    allowInsertingRow: ").append(toIndentedString(getAllowInsertingRow())).append("\n");
            sb.append("    allowSelectingLockedCell: ").append(toIndentedString(getAllowSelectingLockedCell())).append("\n");
            sb.append("    allowSelectingUnlockedCell: ").append(toIndentedString(getAllowSelectingUnlockedCell())).append("\n");
            sb.append("    allowSorting: ").append(toIndentedString(getAllowSorting())).append("\n");
            sb.append("    allowUsingPivotTable: ").append(toIndentedString(getAllowUsingPivotTable())).append("\n");
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

