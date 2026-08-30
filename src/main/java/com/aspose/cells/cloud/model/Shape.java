package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Shape — Represents the msodrawing object. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Shape extends LinkElement {
    /** Gets and sets the name of the shape. */
    @JsonProperty("Name")
    private String name;

    /** Gets mso drawing type. */
    @JsonProperty("MsoDrawingType")
    private String msoDrawingType;

    /** Gets and sets the auto shape type. */
    @JsonProperty("AutoShapeType")
    private String autoShapeType;

    /** Represents the way the drawing object is attached to the cells below it. The property controls the placement of an object on a worksheet. */
    @JsonProperty("Placement")
    private String placement;

    /** Represents upper left corner row index. */
    @JsonProperty("UpperLeftRow")
    private Integer upperLeftRow;

    /** Represents the vertical offset of shape from its top row, in unit of pixels. */
    @JsonProperty("Top")
    private Integer top;

    /** Represents upper left corner column index. */
    @JsonProperty("UpperLeftColumn")
    private Integer upperLeftColumn;

    /** Represents the horizontal offset of shape from its left column, in unit of pixels. */
    @JsonProperty("Left")
    private Integer left;

    /** Represents lower right corner row index. */
    @JsonProperty("LowerRightRow")
    private Integer lowerRightRow;

    /** Represents the width of the shape's vertical offset from its lower bottom corner row, in unit of pixels. */
    @JsonProperty("Bottom")
    private Integer bottom;

    /** Represents lower right corner column index. */
    @JsonProperty("LowerRightColumn")
    private Integer lowerRightColumn;

    /** Represents the width of the shape's horizontal  offset from its lower right corner column, in unit of pixels. */
    @JsonProperty("Right")
    private Integer right;

    /** Represents the width of shape, in unit of pixels. */
    @JsonProperty("Width")
    private Integer width;

    /** Represents the height of shape, in unit of pixel. */
    @JsonProperty("Height")
    private Integer height;

    /** Gets and sets the horizontal offset of shape from worksheet left border,in unit of pixels. */
    @JsonProperty("X")
    private Integer x;

    /** Gets and sets the vertical offset of shape from worksheet top border,in unit of pixels. */
    @JsonProperty("Y")
    private Integer y;

    /** Gets and sets the rotation of the shape. */
    @JsonProperty("RotationAngle")
    private Double rotationAngle;

    /** Gets and sets the html string which contains data and some formats in this textbox. */
    @JsonProperty("HtmlText")
    private String htmlText;

    /** Represents the string in this TextBox object. */
    @JsonProperty("Text")
    private String text;

    /** Returns or sets the descriptive (alternative) text string of the  object. */
    @JsonProperty("AlternativeText")
    private String alternativeText;

    /** Gets and sets the text horizontal alignment type of the shape. */
    @JsonProperty("TextHorizontalAlignment")
    private String textHorizontalAlignment;

    /** Gets and sets the text horizontal overflow type of the shape which contains text. */
    @JsonProperty("TextHorizontalOverflow")
    private String textHorizontalOverflow;

    /** Gets and sets the text orientation type of the shape. */
    @JsonProperty("TextOrientationType")
    private String textOrientationType;

    /** Gets and sets the text vertical alignment type of the shape. */
    @JsonProperty("TextVerticalAlignment")
    private String textVerticalAlignment;

    /** Gets and sets the text vertical overflow type of the shape which contains text. */
    @JsonProperty("TextVerticalOverflow")
    private String textVerticalOverflow;

    /** Indicates whether the shape is a group. */
    @JsonProperty("IsGroup")
    private Boolean isGroup;

    /** Indicates whether the object is visible. */
    @JsonProperty("IsHidden")
    private Boolean isHidden;

    /** True means that don't allow changes in aspect ratio. */
    @JsonProperty("IsLockAspectRatio")
    private Boolean isLockAspectRatio;

    /** True if the object is locked, False if the object can be modified when the sheet is protected. */
    @JsonProperty("IsLocked")
    private Boolean isLocked;

    /** True if the object is printable */
    @JsonProperty("IsPrintable")
    private Boolean isPrintable;

    /** Gets and sets the text wrapped type of the shape which contains text. */
    @JsonProperty("IsTextWrapped")
    private Boolean isTextWrapped;

    /** Indicates whether this shape is a word art. */
    @JsonProperty("IsWordArt")
    private Boolean isWordArt;

    /** Gets or sets the worksheet range linked to the control's value. */
    @JsonProperty("LinkedCell")
    private String linkedCell;

    /** Returns the position of a shape in the z-order. */
    @JsonProperty("ZOrderPosition")
    private Integer zOrderPosition;

    /** Represents the font of shape. */
    @JsonProperty("Font")
    private Font font;

    /** Gets the hyperlink of the shape. */
    @JsonProperty("Hyperlink")
    private String hyperlink;

    public String getName() { return name; }
    public Shape setName(String name) { this.name = name; return this; }

    public String getMsoDrawingType() { return msoDrawingType; }
    public Shape setMsoDrawingType(String msoDrawingType) { this.msoDrawingType = msoDrawingType; return this; }

    public String getAutoShapeType() { return autoShapeType; }
    public Shape setAutoShapeType(String autoShapeType) { this.autoShapeType = autoShapeType; return this; }

    public String getPlacement() { return placement; }
    public Shape setPlacement(String placement) { this.placement = placement; return this; }

    public Integer getUpperLeftRow() { return upperLeftRow; }
    public Shape setUpperLeftRow(Integer upperLeftRow) { this.upperLeftRow = upperLeftRow; return this; }

    public Integer getTop() { return top; }
    public Shape setTop(Integer top) { this.top = top; return this; }

    public Integer getUpperLeftColumn() { return upperLeftColumn; }
    public Shape setUpperLeftColumn(Integer upperLeftColumn) { this.upperLeftColumn = upperLeftColumn; return this; }

    public Integer getLeft() { return left; }
    public Shape setLeft(Integer left) { this.left = left; return this; }

    public Integer getLowerRightRow() { return lowerRightRow; }
    public Shape setLowerRightRow(Integer lowerRightRow) { this.lowerRightRow = lowerRightRow; return this; }

    public Integer getBottom() { return bottom; }
    public Shape setBottom(Integer bottom) { this.bottom = bottom; return this; }

    public Integer getLowerRightColumn() { return lowerRightColumn; }
    public Shape setLowerRightColumn(Integer lowerRightColumn) { this.lowerRightColumn = lowerRightColumn; return this; }

    public Integer getRight() { return right; }
    public Shape setRight(Integer right) { this.right = right; return this; }

    public Integer getWidth() { return width; }
    public Shape setWidth(Integer width) { this.width = width; return this; }

    public Integer getHeight() { return height; }
    public Shape setHeight(Integer height) { this.height = height; return this; }

    public Integer getX() { return x; }
    public Shape setX(Integer x) { this.x = x; return this; }

    public Integer getY() { return y; }
    public Shape setY(Integer y) { this.y = y; return this; }

    public Double getRotationAngle() { return rotationAngle; }
    public Shape setRotationAngle(Double rotationAngle) { this.rotationAngle = rotationAngle; return this; }

    public String getHtmlText() { return htmlText; }
    public Shape setHtmlText(String htmlText) { this.htmlText = htmlText; return this; }

    public String getText() { return text; }
    public Shape setText(String text) { this.text = text; return this; }

    public String getAlternativeText() { return alternativeText; }
    public Shape setAlternativeText(String alternativeText) { this.alternativeText = alternativeText; return this; }

    public String getTextHorizontalAlignment() { return textHorizontalAlignment; }
    public Shape setTextHorizontalAlignment(String textHorizontalAlignment) { this.textHorizontalAlignment = textHorizontalAlignment; return this; }

    public String getTextHorizontalOverflow() { return textHorizontalOverflow; }
    public Shape setTextHorizontalOverflow(String textHorizontalOverflow) { this.textHorizontalOverflow = textHorizontalOverflow; return this; }

    public String getTextOrientationType() { return textOrientationType; }
    public Shape setTextOrientationType(String textOrientationType) { this.textOrientationType = textOrientationType; return this; }

    public String getTextVerticalAlignment() { return textVerticalAlignment; }
    public Shape setTextVerticalAlignment(String textVerticalAlignment) { this.textVerticalAlignment = textVerticalAlignment; return this; }

    public String getTextVerticalOverflow() { return textVerticalOverflow; }
    public Shape setTextVerticalOverflow(String textVerticalOverflow) { this.textVerticalOverflow = textVerticalOverflow; return this; }

    public Boolean getIsGroup() { return isGroup; }
    public Shape setIsGroup(Boolean isGroup) { this.isGroup = isGroup; return this; }

    public Boolean getIsHidden() { return isHidden; }
    public Shape setIsHidden(Boolean isHidden) { this.isHidden = isHidden; return this; }

    public Boolean getIsLockAspectRatio() { return isLockAspectRatio; }
    public Shape setIsLockAspectRatio(Boolean isLockAspectRatio) { this.isLockAspectRatio = isLockAspectRatio; return this; }

    public Boolean getIsLocked() { return isLocked; }
    public Shape setIsLocked(Boolean isLocked) { this.isLocked = isLocked; return this; }

    public Boolean getIsPrintable() { return isPrintable; }
    public Shape setIsPrintable(Boolean isPrintable) { this.isPrintable = isPrintable; return this; }

    public Boolean getIsTextWrapped() { return isTextWrapped; }
    public Shape setIsTextWrapped(Boolean isTextWrapped) { this.isTextWrapped = isTextWrapped; return this; }

    public Boolean getIsWordArt() { return isWordArt; }
    public Shape setIsWordArt(Boolean isWordArt) { this.isWordArt = isWordArt; return this; }

    public String getLinkedCell() { return linkedCell; }
    public Shape setLinkedCell(String linkedCell) { this.linkedCell = linkedCell; return this; }

    public Integer getZOrderPosition() { return zOrderPosition; }
    public Shape setZOrderPosition(Integer zOrderPosition) { this.zOrderPosition = zOrderPosition; return this; }

    public Font getFont() { return font; }
    public Shape setFont(Font font) { this.font = font; return this; }

    public String getHyperlink() { return hyperlink; }
    public Shape setHyperlink(String hyperlink) { this.hyperlink = hyperlink; return this; }


    /** Covariant override: keeps fluent chains returning Shape. */
    @Override public Shape setLink(Link link) { return (Shape) super.setLink(link); }

}
