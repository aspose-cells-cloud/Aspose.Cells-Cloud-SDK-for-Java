package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** PageSetup — excel print page setting */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageSetup {
    /** Represents if elements of the document will be printed in black and white. */
    @JsonProperty("BlackAndWhite")
    private Boolean blackAndWhite;

    /** Represents the size of the bottom margin, in unit of centimeters. */
    @JsonProperty("BottomMargin")
    private Double bottomMargin;

    /** Represent if the sheet is printed centered horizontally. */
    @JsonProperty("CenterHorizontally")
    private Boolean centerHorizontally;

    /** Represent if the sheet is printed centered vertically. */
    @JsonProperty("CenterVertically")
    private Boolean centerVertically;

    /** Represents the first page number that will be used when this sheet is printed. */
    @JsonProperty("FirstPageNumber")
    private Integer firstPageNumber;

    /** Represents  the number of pages tall the worksheet will be scaled to when it's printed. The default value is 1. */
    @JsonProperty("FitToPagesTall")
    private Integer fitToPagesTall;

    /** Represents the number of pages wide the worksheet will be scaled to when it's printed. The default value is 1. */
    @JsonProperty("FitToPagesWide")
    private Integer fitToPagesWide;

    /** Represents the distance from the bottom of the page to the footer, in unit of centimeters. */
    @JsonProperty("FooterMargin")
    private Double footerMargin;

    /** Represents the distance from the top of the page to the header, in unit of centimeters. */
    @JsonProperty("HeaderMargin")
    private Double headerMargin;

    /** Indicates whether the first the page number is automatically assigned. */
    @JsonProperty("IsAutoFirstPageNumber")
    private Boolean isAutoFirstPageNumber;

    /** Indicates whether header and footer margins are aligned with the page margins. If this property is true, the left header and footer will be aligned with the left margin, and the right header and footer will be aligned with the right margin. This option is enabled by default. */
    @JsonProperty("IsHFAlignMargins")
    private Boolean isHFAlignMargins;

    /** True means that the header/footer of the first page is different with other pages. */
    @JsonProperty("IsHFDiffFirst")
    private Boolean isHFDiffFirst;

    /** True means that the header/footer of the odd pages is different with odd pages. */
    @JsonProperty("IsHFDiffOddEven")
    private Boolean isHFDiffOddEven;

    /** Indicates whether header and footer are scaled with document scaling. Only applies for Excel 2007. */
    @JsonProperty("IsHFScaleWithDoc")
    private Boolean isHFScaleWithDoc;

    /** If this property is False, the FitToPagesWide and FitToPagesTall properties control how the worksheet is scaled. */
    @JsonProperty("IsPercentScale")
    private Boolean isPercentScale;

    /** Represents the size of the left margin, in unit of centimeters. */
    @JsonProperty("LeftMargin")
    private Double leftMargin;

    /** Represents the order that Microsoft Excel uses to number pages when printing a large worksheet. */
    @JsonProperty("Order")
    private String order;

    /** Represents page print orientation. */
    @JsonProperty("Orientation")
    private String orientation;

    /** Represents the size of the paper. */
    @JsonProperty("PaperSize")
    private String paperSize;

    /** Represents the range to be printed. */
    @JsonProperty("PrintArea")
    private String printArea;

    /** Represents the way comments are printed with the sheet. */
    @JsonProperty("PrintComments")
    private String printComments;

    /** Get and sets number of copies to print. */
    @JsonProperty("PrintCopies")
    private Integer printCopies;

    /** Represents if the sheet will be printed without graphics. */
    @JsonProperty("PrintDraft")
    private Boolean printDraft;

    /** Specifies the type of print error displayed. */
    @JsonProperty("PrintErrors")
    private String printErrors;

    /** Represents if cell gridlines are printed on the page. */
    @JsonProperty("PrintGridlines")
    private Boolean printGridlines;

    /** Represents if row and column headings are printed with this page. */
    @JsonProperty("PrintHeadings")
    private Boolean printHeadings;

    /** Represents the print quality. */
    @JsonProperty("PrintQuality")
    private Integer printQuality;

    /** Represents the columns that contain the cells to be repeated on the left side of each page. */
    @JsonProperty("PrintTitleColumns")
    private String printTitleColumns;

    /** Represents the rows that contain the cells to be repeated at the top of each page. */
    @JsonProperty("PrintTitleRows")
    private String printTitleRows;

    /** Represents the size of the right margin, in unit of centimeters. */
    @JsonProperty("RightMargin")
    private Double rightMargin;

    /** Represents the size of the top margin, in unit of centimeters. */
    @JsonProperty("TopMargin")
    private Double topMargin;

    /** Represents the scaling factor in percent. It should be between 10 and 400. */
    @JsonProperty("Zoom")
    private Integer zoom;

    /** Represents the page header. */
    @JsonProperty("Header")
    private List<PageSection> header;

    /** Represents the page footor. */
    @JsonProperty("Footer")
    private List<PageSection> footer;

    public Boolean getBlackAndWhite() { return blackAndWhite; }
    public PageSetup setBlackAndWhite(Boolean blackAndWhite) { this.blackAndWhite = blackAndWhite; return this; }

    public Double getBottomMargin() { return bottomMargin; }
    public PageSetup setBottomMargin(Double bottomMargin) { this.bottomMargin = bottomMargin; return this; }

    public Boolean getCenterHorizontally() { return centerHorizontally; }
    public PageSetup setCenterHorizontally(Boolean centerHorizontally) { this.centerHorizontally = centerHorizontally; return this; }

    public Boolean getCenterVertically() { return centerVertically; }
    public PageSetup setCenterVertically(Boolean centerVertically) { this.centerVertically = centerVertically; return this; }

    public Integer getFirstPageNumber() { return firstPageNumber; }
    public PageSetup setFirstPageNumber(Integer firstPageNumber) { this.firstPageNumber = firstPageNumber; return this; }

    public Integer getFitToPagesTall() { return fitToPagesTall; }
    public PageSetup setFitToPagesTall(Integer fitToPagesTall) { this.fitToPagesTall = fitToPagesTall; return this; }

    public Integer getFitToPagesWide() { return fitToPagesWide; }
    public PageSetup setFitToPagesWide(Integer fitToPagesWide) { this.fitToPagesWide = fitToPagesWide; return this; }

    public Double getFooterMargin() { return footerMargin; }
    public PageSetup setFooterMargin(Double footerMargin) { this.footerMargin = footerMargin; return this; }

    public Double getHeaderMargin() { return headerMargin; }
    public PageSetup setHeaderMargin(Double headerMargin) { this.headerMargin = headerMargin; return this; }

    public Boolean getIsAutoFirstPageNumber() { return isAutoFirstPageNumber; }
    public PageSetup setIsAutoFirstPageNumber(Boolean isAutoFirstPageNumber) { this.isAutoFirstPageNumber = isAutoFirstPageNumber; return this; }

    public Boolean getIsHFAlignMargins() { return isHFAlignMargins; }
    public PageSetup setIsHFAlignMargins(Boolean isHFAlignMargins) { this.isHFAlignMargins = isHFAlignMargins; return this; }

    public Boolean getIsHFDiffFirst() { return isHFDiffFirst; }
    public PageSetup setIsHFDiffFirst(Boolean isHFDiffFirst) { this.isHFDiffFirst = isHFDiffFirst; return this; }

    public Boolean getIsHFDiffOddEven() { return isHFDiffOddEven; }
    public PageSetup setIsHFDiffOddEven(Boolean isHFDiffOddEven) { this.isHFDiffOddEven = isHFDiffOddEven; return this; }

    public Boolean getIsHFScaleWithDoc() { return isHFScaleWithDoc; }
    public PageSetup setIsHFScaleWithDoc(Boolean isHFScaleWithDoc) { this.isHFScaleWithDoc = isHFScaleWithDoc; return this; }

    public Boolean getIsPercentScale() { return isPercentScale; }
    public PageSetup setIsPercentScale(Boolean isPercentScale) { this.isPercentScale = isPercentScale; return this; }

    public Double getLeftMargin() { return leftMargin; }
    public PageSetup setLeftMargin(Double leftMargin) { this.leftMargin = leftMargin; return this; }

    public String getOrder() { return order; }
    public PageSetup setOrder(String order) { this.order = order; return this; }

    public String getOrientation() { return orientation; }
    public PageSetup setOrientation(String orientation) { this.orientation = orientation; return this; }

    public String getPaperSize() { return paperSize; }
    public PageSetup setPaperSize(String paperSize) { this.paperSize = paperSize; return this; }

    public String getPrintArea() { return printArea; }
    public PageSetup setPrintArea(String printArea) { this.printArea = printArea; return this; }

    public String getPrintComments() { return printComments; }
    public PageSetup setPrintComments(String printComments) { this.printComments = printComments; return this; }

    public Integer getPrintCopies() { return printCopies; }
    public PageSetup setPrintCopies(Integer printCopies) { this.printCopies = printCopies; return this; }

    public Boolean getPrintDraft() { return printDraft; }
    public PageSetup setPrintDraft(Boolean printDraft) { this.printDraft = printDraft; return this; }

    public String getPrintErrors() { return printErrors; }
    public PageSetup setPrintErrors(String printErrors) { this.printErrors = printErrors; return this; }

    public Boolean getPrintGridlines() { return printGridlines; }
    public PageSetup setPrintGridlines(Boolean printGridlines) { this.printGridlines = printGridlines; return this; }

    public Boolean getPrintHeadings() { return printHeadings; }
    public PageSetup setPrintHeadings(Boolean printHeadings) { this.printHeadings = printHeadings; return this; }

    public Integer getPrintQuality() { return printQuality; }
    public PageSetup setPrintQuality(Integer printQuality) { this.printQuality = printQuality; return this; }

    public String getPrintTitleColumns() { return printTitleColumns; }
    public PageSetup setPrintTitleColumns(String printTitleColumns) { this.printTitleColumns = printTitleColumns; return this; }

    public String getPrintTitleRows() { return printTitleRows; }
    public PageSetup setPrintTitleRows(String printTitleRows) { this.printTitleRows = printTitleRows; return this; }

    public Double getRightMargin() { return rightMargin; }
    public PageSetup setRightMargin(Double rightMargin) { this.rightMargin = rightMargin; return this; }

    public Double getTopMargin() { return topMargin; }
    public PageSetup setTopMargin(Double topMargin) { this.topMargin = topMargin; return this; }

    public Integer getZoom() { return zoom; }
    public PageSetup setZoom(Integer zoom) { this.zoom = zoom; return this; }

    public List<PageSection> getHeader() { return header; }
    public PageSetup setHeader(List<PageSection> header) { this.header = header; return this; }

    public List<PageSection> getFooter() { return footer; }
    public PageSetup setFooter(List<PageSection> footer) { this.footer = footer; return this; }

}
