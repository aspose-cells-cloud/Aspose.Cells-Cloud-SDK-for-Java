package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Comment — Encapsulates the object that represents a cell comment. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Comment extends LinkElement {
    /** Property: CellName attribute with XmlElement tag in the class. */
    @JsonProperty("CellName")
    private String cellName;

    /** Gets and sets Name of the original comment author */
    @JsonProperty("Author")
    private String author;

    /** Gets and sets the html string which contains data and some formats in this comment. */
    @JsonProperty("HtmlNote")
    private String htmlNote;

    /** Represents the content of comment. */
    @JsonProperty("Note")
    private String note;

    /** Indicates if size of comment is adjusted automatically according to its content. */
    @JsonProperty("AutoSize")
    private Boolean autoSize;

    /** Represents if the comment is visible or not. */
    @JsonProperty("IsVisible")
    private Boolean isVisible;

    /** Represents the width of the comment, in unit of pixels. */
    @JsonProperty("Width")
    private Integer width;

    /** Represents the Height of the comment, in unit of pixels. */
    @JsonProperty("Height")
    private Integer height;

    /** Gets and sets the text horizontal alignment type of the comment. */
    @JsonProperty("TextHorizontalAlignment")
    private String textHorizontalAlignment;

    /** Gets and sets the text orientation type of the comment. */
    @JsonProperty("TextOrientationType")
    private String textOrientationType;

    /** Gets and sets the text vertical alignment type of the comment. */
    @JsonProperty("TextVerticalAlignment")
    private String textVerticalAlignment;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public String getCellName() { return cellName; }
    public Comment setCellName(String cellName) { this.cellName = cellName; return this; }

    public String getAuthor() { return author; }
    public Comment setAuthor(String author) { this.author = author; return this; }

    public String getHtmlNote() { return htmlNote; }
    public Comment setHtmlNote(String htmlNote) { this.htmlNote = htmlNote; return this; }

    public String getNote() { return note; }
    public Comment setNote(String note) { this.note = note; return this; }

    public Boolean getAutoSize() { return autoSize; }
    public Comment setAutoSize(Boolean autoSize) { this.autoSize = autoSize; return this; }

    public Boolean getIsVisible() { return isVisible; }
    public Comment setIsVisible(Boolean isVisible) { this.isVisible = isVisible; return this; }

    public Integer getWidth() { return width; }
    public Comment setWidth(Integer width) { this.width = width; return this; }

    public Integer getHeight() { return height; }
    public Comment setHeight(Integer height) { this.height = height; return this; }

    public String getTextHorizontalAlignment() { return textHorizontalAlignment; }
    public Comment setTextHorizontalAlignment(String textHorizontalAlignment) { this.textHorizontalAlignment = textHorizontalAlignment; return this; }

    public String getTextOrientationType() { return textOrientationType; }
    public Comment setTextOrientationType(String textOrientationType) { this.textOrientationType = textOrientationType; return this; }

    public String getTextVerticalAlignment() { return textVerticalAlignment; }
    public Comment setTextVerticalAlignment(String textVerticalAlignment) { this.textVerticalAlignment = textVerticalAlignment; return this; }

    public Link getLink() { return link; }
    public Comment setLink(Link link) { this.link = link; return this; }

}
