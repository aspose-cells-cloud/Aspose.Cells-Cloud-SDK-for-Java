/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PageSetup.java">
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


public class PageSetup {
        @SerializedName("BlackAndWhite")
        private Boolean blackAndWhite ;

        public  PageSetup  blackAndWhite(Boolean  blackAndWhite) {
            this.blackAndWhite =  blackAndWhite;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getBlackAndWhite() {
            return blackAndWhite;
        }

        public void setBlackAndWhite(Boolean blackAndWhite) {
            this.blackAndWhite = blackAndWhite;
        }

        @SerializedName("BottomMargin")
        private Double bottomMargin ;

        public  PageSetup  bottomMargin(Double  bottomMargin) {
            this.bottomMargin =  bottomMargin;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getBottomMargin() {
            return bottomMargin;
        }

        public void setBottomMargin(Double bottomMargin) {
            this.bottomMargin = bottomMargin;
        }

        @SerializedName("CenterHorizontally")
        private Boolean centerHorizontally ;

        public  PageSetup  centerHorizontally(Boolean  centerHorizontally) {
            this.centerHorizontally =  centerHorizontally;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getCenterHorizontally() {
            return centerHorizontally;
        }

        public void setCenterHorizontally(Boolean centerHorizontally) {
            this.centerHorizontally = centerHorizontally;
        }

        @SerializedName("CenterVertically")
        private Boolean centerVertically ;

        public  PageSetup  centerVertically(Boolean  centerVertically) {
            this.centerVertically =  centerVertically;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getCenterVertically() {
            return centerVertically;
        }

        public void setCenterVertically(Boolean centerVertically) {
            this.centerVertically = centerVertically;
        }

        @SerializedName("FirstPageNumber")
        private Integer firstPageNumber ;

        public  PageSetup  firstPageNumber(Integer  firstPageNumber) {
            this.firstPageNumber =  firstPageNumber;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getFirstPageNumber() {
            return firstPageNumber;
        }

        public void setFirstPageNumber(Integer firstPageNumber) {
            this.firstPageNumber = firstPageNumber;
        }

        @SerializedName("FitToPagesTall")
        private Integer fitToPagesTall ;

        public  PageSetup  fitToPagesTall(Integer  fitToPagesTall) {
            this.fitToPagesTall =  fitToPagesTall;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getFitToPagesTall() {
            return fitToPagesTall;
        }

        public void setFitToPagesTall(Integer fitToPagesTall) {
            this.fitToPagesTall = fitToPagesTall;
        }

        @SerializedName("FitToPagesWide")
        private Integer fitToPagesWide ;

        public  PageSetup  fitToPagesWide(Integer  fitToPagesWide) {
            this.fitToPagesWide =  fitToPagesWide;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getFitToPagesWide() {
            return fitToPagesWide;
        }

        public void setFitToPagesWide(Integer fitToPagesWide) {
            this.fitToPagesWide = fitToPagesWide;
        }

        @SerializedName("FooterMargin")
        private Double footerMargin ;

        public  PageSetup  footerMargin(Double  footerMargin) {
            this.footerMargin =  footerMargin;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getFooterMargin() {
            return footerMargin;
        }

        public void setFooterMargin(Double footerMargin) {
            this.footerMargin = footerMargin;
        }

        @SerializedName("HeaderMargin")
        private Double headerMargin ;

        public  PageSetup  headerMargin(Double  headerMargin) {
            this.headerMargin =  headerMargin;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getHeaderMargin() {
            return headerMargin;
        }

        public void setHeaderMargin(Double headerMargin) {
            this.headerMargin = headerMargin;
        }

        @SerializedName("IsAutoFirstPageNumber")
        private Boolean isAutoFirstPageNumber ;

        public  PageSetup  isAutoFirstPageNumber(Boolean  isAutoFirstPageNumber) {
            this.isAutoFirstPageNumber =  isAutoFirstPageNumber;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsAutoFirstPageNumber() {
            return isAutoFirstPageNumber;
        }

        public void setIsAutoFirstPageNumber(Boolean isAutoFirstPageNumber) {
            this.isAutoFirstPageNumber = isAutoFirstPageNumber;
        }

        @SerializedName("IsHFAlignMargins")
        private Boolean isHFAlignMargins ;

        public  PageSetup  isHFAlignMargins(Boolean  isHFAlignMargins) {
            this.isHFAlignMargins =  isHFAlignMargins;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsHFAlignMargins() {
            return isHFAlignMargins;
        }

        public void setIsHFAlignMargins(Boolean isHFAlignMargins) {
            this.isHFAlignMargins = isHFAlignMargins;
        }

        @SerializedName("IsHFDiffFirst")
        private Boolean isHFDiffFirst ;

        public  PageSetup  isHFDiffFirst(Boolean  isHFDiffFirst) {
            this.isHFDiffFirst =  isHFDiffFirst;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsHFDiffFirst() {
            return isHFDiffFirst;
        }

        public void setIsHFDiffFirst(Boolean isHFDiffFirst) {
            this.isHFDiffFirst = isHFDiffFirst;
        }

        @SerializedName("IsHFDiffOddEven")
        private Boolean isHFDiffOddEven ;

        public  PageSetup  isHFDiffOddEven(Boolean  isHFDiffOddEven) {
            this.isHFDiffOddEven =  isHFDiffOddEven;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsHFDiffOddEven() {
            return isHFDiffOddEven;
        }

        public void setIsHFDiffOddEven(Boolean isHFDiffOddEven) {
            this.isHFDiffOddEven = isHFDiffOddEven;
        }

        @SerializedName("IsHFScaleWithDoc")
        private Boolean isHFScaleWithDoc ;

        public  PageSetup  isHFScaleWithDoc(Boolean  isHFScaleWithDoc) {
            this.isHFScaleWithDoc =  isHFScaleWithDoc;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsHFScaleWithDoc() {
            return isHFScaleWithDoc;
        }

        public void setIsHFScaleWithDoc(Boolean isHFScaleWithDoc) {
            this.isHFScaleWithDoc = isHFScaleWithDoc;
        }

        @SerializedName("IsPercentScale")
        private Boolean isPercentScale ;

        public  PageSetup  isPercentScale(Boolean  isPercentScale) {
            this.isPercentScale =  isPercentScale;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsPercentScale() {
            return isPercentScale;
        }

        public void setIsPercentScale(Boolean isPercentScale) {
            this.isPercentScale = isPercentScale;
        }

        @SerializedName("LeftMargin")
        private Double leftMargin ;

        public  PageSetup  leftMargin(Double  leftMargin) {
            this.leftMargin =  leftMargin;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getLeftMargin() {
            return leftMargin;
        }

        public void setLeftMargin(Double leftMargin) {
            this.leftMargin = leftMargin;
        }

        @SerializedName("Order")
        private String order ;

        public  PageSetup  order(String  order) {
            this.order =  order;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getOrder() {
            return order;
        }

        public void setOrder(String order) {
            this.order = order;
        }

        @SerializedName("Orientation")
        private String orientation ;

        public  PageSetup  orientation(String  orientation) {
            this.orientation =  orientation;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getOrientation() {
            return orientation;
        }

        public void setOrientation(String orientation) {
            this.orientation = orientation;
        }

        @SerializedName("PaperSize")
        private String paperSize ;

        public  PageSetup  paperSize(String  paperSize) {
            this.paperSize =  paperSize;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPaperSize() {
            return paperSize;
        }

        public void setPaperSize(String paperSize) {
            this.paperSize = paperSize;
        }

        @SerializedName("PrintArea")
        private String printArea ;

        public  PageSetup  printArea(String  printArea) {
            this.printArea =  printArea;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPrintArea() {
            return printArea;
        }

        public void setPrintArea(String printArea) {
            this.printArea = printArea;
        }

        @SerializedName("PrintComments")
        private String printComments ;

        public  PageSetup  printComments(String  printComments) {
            this.printComments =  printComments;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPrintComments() {
            return printComments;
        }

        public void setPrintComments(String printComments) {
            this.printComments = printComments;
        }

        @SerializedName("PrintCopies")
        private Integer printCopies ;

        public  PageSetup  printCopies(Integer  printCopies) {
            this.printCopies =  printCopies;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getPrintCopies() {
            return printCopies;
        }

        public void setPrintCopies(Integer printCopies) {
            this.printCopies = printCopies;
        }

        @SerializedName("PrintDraft")
        private Boolean printDraft ;

        public  PageSetup  printDraft(Boolean  printDraft) {
            this.printDraft =  printDraft;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getPrintDraft() {
            return printDraft;
        }

        public void setPrintDraft(Boolean printDraft) {
            this.printDraft = printDraft;
        }

        @SerializedName("PrintErrors")
        private String printErrors ;

        public  PageSetup  printErrors(String  printErrors) {
            this.printErrors =  printErrors;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPrintErrors() {
            return printErrors;
        }

        public void setPrintErrors(String printErrors) {
            this.printErrors = printErrors;
        }

        @SerializedName("PrintGridlines")
        private Boolean printGridlines ;

        public  PageSetup  printGridlines(Boolean  printGridlines) {
            this.printGridlines =  printGridlines;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getPrintGridlines() {
            return printGridlines;
        }

        public void setPrintGridlines(Boolean printGridlines) {
            this.printGridlines = printGridlines;
        }

        @SerializedName("PrintHeadings")
        private Boolean printHeadings ;

        public  PageSetup  printHeadings(Boolean  printHeadings) {
            this.printHeadings =  printHeadings;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getPrintHeadings() {
            return printHeadings;
        }

        public void setPrintHeadings(Boolean printHeadings) {
            this.printHeadings = printHeadings;
        }

        @SerializedName("PrintQuality")
        private Integer printQuality ;

        public  PageSetup  printQuality(Integer  printQuality) {
            this.printQuality =  printQuality;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getPrintQuality() {
            return printQuality;
        }

        public void setPrintQuality(Integer printQuality) {
            this.printQuality = printQuality;
        }

        @SerializedName("PrintTitleColumns")
        private String printTitleColumns ;

        public  PageSetup  printTitleColumns(String  printTitleColumns) {
            this.printTitleColumns =  printTitleColumns;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPrintTitleColumns() {
            return printTitleColumns;
        }

        public void setPrintTitleColumns(String printTitleColumns) {
            this.printTitleColumns = printTitleColumns;
        }

        @SerializedName("PrintTitleRows")
        private String printTitleRows ;

        public  PageSetup  printTitleRows(String  printTitleRows) {
            this.printTitleRows =  printTitleRows;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPrintTitleRows() {
            return printTitleRows;
        }

        public void setPrintTitleRows(String printTitleRows) {
            this.printTitleRows = printTitleRows;
        }

        @SerializedName("RightMargin")
        private Double rightMargin ;

        public  PageSetup  rightMargin(Double  rightMargin) {
            this.rightMargin =  rightMargin;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getRightMargin() {
            return rightMargin;
        }

        public void setRightMargin(Double rightMargin) {
            this.rightMargin = rightMargin;
        }

        @SerializedName("TopMargin")
        private Double topMargin ;

        public  PageSetup  topMargin(Double  topMargin) {
            this.topMargin =  topMargin;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getTopMargin() {
            return topMargin;
        }

        public void setTopMargin(Double topMargin) {
            this.topMargin = topMargin;
        }

        @SerializedName("Zoom")
        private Integer zoom ;

        public  PageSetup  zoom(Integer  zoom) {
            this.zoom =  zoom;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getZoom() {
            return zoom;
        }

        public void setZoom(Integer zoom) {
            this.zoom = zoom;
        }

        @SerializedName("Header")
        private List<PageSection> header ;

        public  PageSetup  header(List<PageSection>  header) {
            this.header =  header;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<PageSection> getHeader() {
            return header;
        }

        public void setHeader(List<PageSection> header) {
            this.header = header;
        }

        @SerializedName("Footer")
        private List<PageSection> footer ;

        public  PageSetup  footer(List<PageSection>  footer) {
            this.footer =  footer;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<PageSection> getFooter() {
            return footer;
        }

        public void setFooter(List<PageSection> footer) {
            this.footer = footer;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            PageSetup pageSetup = (PageSetup) o;
            return
                Objects.equals(this.blackAndWhite, pageSetup.blackAndWhite) &&
                Objects.equals(this.bottomMargin, pageSetup.bottomMargin) &&
                Objects.equals(this.centerHorizontally, pageSetup.centerHorizontally) &&
                Objects.equals(this.centerVertically, pageSetup.centerVertically) &&
                Objects.equals(this.firstPageNumber, pageSetup.firstPageNumber) &&
                Objects.equals(this.fitToPagesTall, pageSetup.fitToPagesTall) &&
                Objects.equals(this.fitToPagesWide, pageSetup.fitToPagesWide) &&
                Objects.equals(this.footerMargin, pageSetup.footerMargin) &&
                Objects.equals(this.headerMargin, pageSetup.headerMargin) &&
                Objects.equals(this.isAutoFirstPageNumber, pageSetup.isAutoFirstPageNumber) &&
                Objects.equals(this.isHFAlignMargins, pageSetup.isHFAlignMargins) &&
                Objects.equals(this.isHFDiffFirst, pageSetup.isHFDiffFirst) &&
                Objects.equals(this.isHFDiffOddEven, pageSetup.isHFDiffOddEven) &&
                Objects.equals(this.isHFScaleWithDoc, pageSetup.isHFScaleWithDoc) &&
                Objects.equals(this.isPercentScale, pageSetup.isPercentScale) &&
                Objects.equals(this.leftMargin, pageSetup.leftMargin) &&
                Objects.equals(this.order, pageSetup.order) &&
                Objects.equals(this.orientation, pageSetup.orientation) &&
                Objects.equals(this.paperSize, pageSetup.paperSize) &&
                Objects.equals(this.printArea, pageSetup.printArea) &&
                Objects.equals(this.printComments, pageSetup.printComments) &&
                Objects.equals(this.printCopies, pageSetup.printCopies) &&
                Objects.equals(this.printDraft, pageSetup.printDraft) &&
                Objects.equals(this.printErrors, pageSetup.printErrors) &&
                Objects.equals(this.printGridlines, pageSetup.printGridlines) &&
                Objects.equals(this.printHeadings, pageSetup.printHeadings) &&
                Objects.equals(this.printQuality, pageSetup.printQuality) &&
                Objects.equals(this.printTitleColumns, pageSetup.printTitleColumns) &&
                Objects.equals(this.printTitleRows, pageSetup.printTitleRows) &&
                Objects.equals(this.rightMargin, pageSetup.rightMargin) &&
                Objects.equals(this.topMargin, pageSetup.topMargin) &&
                Objects.equals(this.zoom, pageSetup.zoom) &&
                Objects.equals(this.header, pageSetup.header) &&
                Objects.equals(this.footer, pageSetup.footer);
      }

      @Override
      public int hashCode() {
        return Objects.hash(blackAndWhite, bottomMargin, centerHorizontally, centerVertically, firstPageNumber, fitToPagesTall, fitToPagesWide, footerMargin, headerMargin, isAutoFirstPageNumber, isHFAlignMargins, isHFDiffFirst, isHFDiffOddEven, isHFScaleWithDoc, isPercentScale, leftMargin, order, orientation, paperSize, printArea, printComments, printCopies, printDraft, printErrors, printGridlines, printHeadings, printQuality, printTitleColumns, printTitleRows, rightMargin, topMargin, zoom, header, footer);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PageSetup {\n");
            sb.append("    blackAndWhite: ").append(toIndentedString(getBlackAndWhite())).append("\n");
            sb.append("    bottomMargin: ").append(toIndentedString(getBottomMargin())).append("\n");
            sb.append("    centerHorizontally: ").append(toIndentedString(getCenterHorizontally())).append("\n");
            sb.append("    centerVertically: ").append(toIndentedString(getCenterVertically())).append("\n");
            sb.append("    firstPageNumber: ").append(toIndentedString(getFirstPageNumber())).append("\n");
            sb.append("    fitToPagesTall: ").append(toIndentedString(getFitToPagesTall())).append("\n");
            sb.append("    fitToPagesWide: ").append(toIndentedString(getFitToPagesWide())).append("\n");
            sb.append("    footerMargin: ").append(toIndentedString(getFooterMargin())).append("\n");
            sb.append("    headerMargin: ").append(toIndentedString(getHeaderMargin())).append("\n");
            sb.append("    isAutoFirstPageNumber: ").append(toIndentedString(getIsAutoFirstPageNumber())).append("\n");
            sb.append("    isHFAlignMargins: ").append(toIndentedString(getIsHFAlignMargins())).append("\n");
            sb.append("    isHFDiffFirst: ").append(toIndentedString(getIsHFDiffFirst())).append("\n");
            sb.append("    isHFDiffOddEven: ").append(toIndentedString(getIsHFDiffOddEven())).append("\n");
            sb.append("    isHFScaleWithDoc: ").append(toIndentedString(getIsHFScaleWithDoc())).append("\n");
            sb.append("    isPercentScale: ").append(toIndentedString(getIsPercentScale())).append("\n");
            sb.append("    leftMargin: ").append(toIndentedString(getLeftMargin())).append("\n");
            sb.append("    order: ").append(toIndentedString(getOrder())).append("\n");
            sb.append("    orientation: ").append(toIndentedString(getOrientation())).append("\n");
            sb.append("    paperSize: ").append(toIndentedString(getPaperSize())).append("\n");
            sb.append("    printArea: ").append(toIndentedString(getPrintArea())).append("\n");
            sb.append("    printComments: ").append(toIndentedString(getPrintComments())).append("\n");
            sb.append("    printCopies: ").append(toIndentedString(getPrintCopies())).append("\n");
            sb.append("    printDraft: ").append(toIndentedString(getPrintDraft())).append("\n");
            sb.append("    printErrors: ").append(toIndentedString(getPrintErrors())).append("\n");
            sb.append("    printGridlines: ").append(toIndentedString(getPrintGridlines())).append("\n");
            sb.append("    printHeadings: ").append(toIndentedString(getPrintHeadings())).append("\n");
            sb.append("    printQuality: ").append(toIndentedString(getPrintQuality())).append("\n");
            sb.append("    printTitleColumns: ").append(toIndentedString(getPrintTitleColumns())).append("\n");
            sb.append("    printTitleRows: ").append(toIndentedString(getPrintTitleRows())).append("\n");
            sb.append("    rightMargin: ").append(toIndentedString(getRightMargin())).append("\n");
            sb.append("    topMargin: ").append(toIndentedString(getTopMargin())).append("\n");
            sb.append("    zoom: ").append(toIndentedString(getZoom())).append("\n");
            sb.append("    header: ").append(toIndentedString(getHeader())).append("\n");
            sb.append("    footer: ").append(toIndentedString(getFooter())).append("\n");
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

