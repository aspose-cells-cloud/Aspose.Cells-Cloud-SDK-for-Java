package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** OleObject — Represents an OleObject in a worksheet. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OleObject extends Shape {
    /** True if the specified object is displayed as an icon and the image will not be auto changed. */
    @JsonProperty("DisplayAsIcon")
    private Boolean displayAsIcon;

    /** Gets and sets the file type of the embedded ole object data */
    @JsonProperty("FileFormatType")
    private String fileFormatType;

    /** Gets or sets the path and name of the source file for the linked image. */
    @JsonProperty("ImageSourceFullName")
    private String imageSourceFullName;

    /** True indicates that the size of the ole object will be auto changed as the size of snapshot of the embedded content when the ole object is activated. */
    @JsonProperty("IsAutoSize")
    private Boolean isAutoSize;

    /** Returns true if the OleObject links to the file. */
    @JsonProperty("IsLink")
    private Boolean isLink;

    /** Gets or sets the ProgID of the OLE object. */
    @JsonProperty("ProgID")
    private String progID;

    /** Returns the source full name of the source file for the linked OLE object. */
    @JsonProperty("SourceFullName")
    private String sourceFullName;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Boolean getDisplayAsIcon() { return displayAsIcon; }
    public OleObject setDisplayAsIcon(Boolean displayAsIcon) { this.displayAsIcon = displayAsIcon; return this; }

    public String getFileFormatType() { return fileFormatType; }
    public OleObject setFileFormatType(String fileFormatType) { this.fileFormatType = fileFormatType; return this; }

    public String getImageSourceFullName() { return imageSourceFullName; }
    public OleObject setImageSourceFullName(String imageSourceFullName) { this.imageSourceFullName = imageSourceFullName; return this; }

    public Boolean getIsAutoSize() { return isAutoSize; }
    public OleObject setIsAutoSize(Boolean isAutoSize) { this.isAutoSize = isAutoSize; return this; }

    public Boolean getIsLink() { return isLink; }
    public OleObject setIsLink(Boolean isLink) { this.isLink = isLink; return this; }

    public String getProgID() { return progID; }
    public OleObject setProgID(String progID) { this.progID = progID; return this; }

    public String getSourceFullName() { return sourceFullName; }
    public OleObject setSourceFullName(String sourceFullName) { this.sourceFullName = sourceFullName; return this; }

    public Link getLink() { return link; }
    public OleObject setLink(Link link) { this.link = link; return this; }


    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setName(String name) { return (OleObject) super.setName(name); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setMsoDrawingType(String msoDrawingType) { return (OleObject) super.setMsoDrawingType(msoDrawingType); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setAutoShapeType(String autoShapeType) { return (OleObject) super.setAutoShapeType(autoShapeType); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setPlacement(String placement) { return (OleObject) super.setPlacement(placement); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setUpperLeftRow(Integer upperLeftRow) { return (OleObject) super.setUpperLeftRow(upperLeftRow); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setTop(Integer top) { return (OleObject) super.setTop(top); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setUpperLeftColumn(Integer upperLeftColumn) { return (OleObject) super.setUpperLeftColumn(upperLeftColumn); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setLeft(Integer left) { return (OleObject) super.setLeft(left); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setLowerRightRow(Integer lowerRightRow) { return (OleObject) super.setLowerRightRow(lowerRightRow); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setBottom(Integer bottom) { return (OleObject) super.setBottom(bottom); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setLowerRightColumn(Integer lowerRightColumn) { return (OleObject) super.setLowerRightColumn(lowerRightColumn); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setRight(Integer right) { return (OleObject) super.setRight(right); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setWidth(Integer width) { return (OleObject) super.setWidth(width); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setHeight(Integer height) { return (OleObject) super.setHeight(height); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setX(Integer x) { return (OleObject) super.setX(x); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setY(Integer y) { return (OleObject) super.setY(y); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setRotationAngle(Double rotationAngle) { return (OleObject) super.setRotationAngle(rotationAngle); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setHtmlText(String htmlText) { return (OleObject) super.setHtmlText(htmlText); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setText(String text) { return (OleObject) super.setText(text); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setAlternativeText(String alternativeText) { return (OleObject) super.setAlternativeText(alternativeText); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setTextHorizontalAlignment(String textHorizontalAlignment) { return (OleObject) super.setTextHorizontalAlignment(textHorizontalAlignment); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setTextHorizontalOverflow(String textHorizontalOverflow) { return (OleObject) super.setTextHorizontalOverflow(textHorizontalOverflow); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setTextOrientationType(String textOrientationType) { return (OleObject) super.setTextOrientationType(textOrientationType); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setTextVerticalAlignment(String textVerticalAlignment) { return (OleObject) super.setTextVerticalAlignment(textVerticalAlignment); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setTextVerticalOverflow(String textVerticalOverflow) { return (OleObject) super.setTextVerticalOverflow(textVerticalOverflow); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setIsGroup(Boolean isGroup) { return (OleObject) super.setIsGroup(isGroup); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setIsHidden(Boolean isHidden) { return (OleObject) super.setIsHidden(isHidden); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setIsLockAspectRatio(Boolean isLockAspectRatio) { return (OleObject) super.setIsLockAspectRatio(isLockAspectRatio); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setIsLocked(Boolean isLocked) { return (OleObject) super.setIsLocked(isLocked); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setIsPrintable(Boolean isPrintable) { return (OleObject) super.setIsPrintable(isPrintable); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setIsTextWrapped(Boolean isTextWrapped) { return (OleObject) super.setIsTextWrapped(isTextWrapped); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setIsWordArt(Boolean isWordArt) { return (OleObject) super.setIsWordArt(isWordArt); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setLinkedCell(String linkedCell) { return (OleObject) super.setLinkedCell(linkedCell); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setZOrderPosition(Integer zOrderPosition) { return (OleObject) super.setZOrderPosition(zOrderPosition); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setFont(Font font) { return (OleObject) super.setFont(font); }
    /** Covariant override: keeps fluent chains returning OleObject. */
    @Override public OleObject setHyperlink(String hyperlink) { return (OleObject) super.setHyperlink(hyperlink); }

}
