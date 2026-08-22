package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LineShape — Represents the line shape. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LineShape extends Shape {
    /** Gets and sets the begin arrow head length of the line. */
    @JsonProperty("BeginArrowheadLength")
    private String beginArrowheadLength;

    /** Gets and sets the begin arrow head style of the line. */
    @JsonProperty("BeginArrowheadStyle")
    private String beginArrowheadStyle;

    /** Gets and sets the begin arrow head width of the line. */
    @JsonProperty("BeginArrowheadWidth")
    private String beginArrowheadWidth;

    /** Gets and sets the end arrow head length of the line. */
    @JsonProperty("EndArrowheadLength")
    private String endArrowheadLength;

    /** Gets and sets the end arrow head style of the line. */
    @JsonProperty("EndArrowheadStyle")
    private String endArrowheadStyle;

    /** Gets and sets the end arrow head width of the line. */
    @JsonProperty("EndArrowheadWidth")
    private String endArrowheadWidth;

    /** Gets or sets Name. */
    @JsonProperty("Name")
    private String name;

    /** Gets or sets MsoDrawingType. */
    @JsonProperty("MsoDrawingType")
    private String msoDrawingType;

    /** Gets or sets AutoShapeType. */
    @JsonProperty("AutoShapeType")
    private String autoShapeType;

    /** Gets or sets Placement. */
    @JsonProperty("Placement")
    private String placement;

    /** Gets or sets UpperLeftRow. */
    @JsonProperty("UpperLeftRow")
    private Integer upperLeftRow;

    /** Gets or sets Top. */
    @JsonProperty("Top")
    private Integer top;

    /** Gets or sets UpperLeftColumn. */
    @JsonProperty("UpperLeftColumn")
    private Integer upperLeftColumn;

    /** Gets or sets Left. */
    @JsonProperty("Left")
    private Integer left;

    /** Gets or sets LowerRightRow. */
    @JsonProperty("LowerRightRow")
    private Integer lowerRightRow;

    /** Gets or sets Bottom. */
    @JsonProperty("Bottom")
    private Integer bottom;

    /** Gets or sets LowerRightColumn. */
    @JsonProperty("LowerRightColumn")
    private Integer lowerRightColumn;

    /** Gets or sets Right. */
    @JsonProperty("Right")
    private Integer right;

    /** Gets or sets Width. */
    @JsonProperty("Width")
    private Integer width;

    /** Gets or sets Height. */
    @JsonProperty("Height")
    private Integer height;

    /** Gets or sets X. */
    @JsonProperty("X")
    private Integer x;

    /** Gets or sets Y. */
    @JsonProperty("Y")
    private Integer y;

    /** Gets or sets RotationAngle. */
    @JsonProperty("RotationAngle")
    private Double rotationAngle;

    /** Gets or sets HtmlText. */
    @JsonProperty("HtmlText")
    private String htmlText;

    /** Gets or sets Text. */
    @JsonProperty("Text")
    private String text;

    /** Gets or sets AlternativeText. */
    @JsonProperty("AlternativeText")
    private String alternativeText;

    /** Gets or sets TextHorizontalAlignment. */
    @JsonProperty("TextHorizontalAlignment")
    private String textHorizontalAlignment;

    /** Gets or sets TextHorizontalOverflow. */
    @JsonProperty("TextHorizontalOverflow")
    private String textHorizontalOverflow;

    /** Gets or sets TextOrientationType. */
    @JsonProperty("TextOrientationType")
    private String textOrientationType;

    /** Gets or sets TextVerticalAlignment. */
    @JsonProperty("TextVerticalAlignment")
    private String textVerticalAlignment;

    /** Gets or sets TextVerticalOverflow. */
    @JsonProperty("TextVerticalOverflow")
    private String textVerticalOverflow;

    /** Gets or sets IsGroup. */
    @JsonProperty("IsGroup")
    private Boolean isGroup;

    /** Gets or sets IsHidden. */
    @JsonProperty("IsHidden")
    private Boolean isHidden;

    /** Gets or sets IsLockAspectRatio. */
    @JsonProperty("IsLockAspectRatio")
    private Boolean isLockAspectRatio;

    /** Gets or sets IsLocked. */
    @JsonProperty("IsLocked")
    private Boolean isLocked;

    /** Gets or sets IsPrintable. */
    @JsonProperty("IsPrintable")
    private Boolean isPrintable;

    /** Gets or sets IsTextWrapped. */
    @JsonProperty("IsTextWrapped")
    private Boolean isTextWrapped;

    /** Gets or sets IsWordArt. */
    @JsonProperty("IsWordArt")
    private Boolean isWordArt;

    /** Gets or sets LinkedCell. */
    @JsonProperty("LinkedCell")
    private String linkedCell;

    /** Gets or sets ZOrderPosition. */
    @JsonProperty("ZOrderPosition")
    private Integer zOrderPosition;

    /** Gets or sets Font. */
    @JsonProperty("Font")
    private Font font;

    /** Gets or sets Hyperlink. */
    @JsonProperty("Hyperlink")
    private String hyperlink;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public String getBeginArrowheadLength() { return beginArrowheadLength; }
    public LineShape setBeginArrowheadLength(String beginArrowheadLength) { this.beginArrowheadLength = beginArrowheadLength; return this; }

    public String getBeginArrowheadStyle() { return beginArrowheadStyle; }
    public LineShape setBeginArrowheadStyle(String beginArrowheadStyle) { this.beginArrowheadStyle = beginArrowheadStyle; return this; }

    public String getBeginArrowheadWidth() { return beginArrowheadWidth; }
    public LineShape setBeginArrowheadWidth(String beginArrowheadWidth) { this.beginArrowheadWidth = beginArrowheadWidth; return this; }

    public String getEndArrowheadLength() { return endArrowheadLength; }
    public LineShape setEndArrowheadLength(String endArrowheadLength) { this.endArrowheadLength = endArrowheadLength; return this; }

    public String getEndArrowheadStyle() { return endArrowheadStyle; }
    public LineShape setEndArrowheadStyle(String endArrowheadStyle) { this.endArrowheadStyle = endArrowheadStyle; return this; }

    public String getEndArrowheadWidth() { return endArrowheadWidth; }
    public LineShape setEndArrowheadWidth(String endArrowheadWidth) { this.endArrowheadWidth = endArrowheadWidth; return this; }

    public String getName() { return name; }
    public LineShape setName(String name) { this.name = name; return this; }

    public String getMsoDrawingType() { return msoDrawingType; }
    public LineShape setMsoDrawingType(String msoDrawingType) { this.msoDrawingType = msoDrawingType; return this; }

    public String getAutoShapeType() { return autoShapeType; }
    public LineShape setAutoShapeType(String autoShapeType) { this.autoShapeType = autoShapeType; return this; }

    public String getPlacement() { return placement; }
    public LineShape setPlacement(String placement) { this.placement = placement; return this; }

    public Integer getUpperLeftRow() { return upperLeftRow; }
    public LineShape setUpperLeftRow(Integer upperLeftRow) { this.upperLeftRow = upperLeftRow; return this; }

    public Integer getTop() { return top; }
    public LineShape setTop(Integer top) { this.top = top; return this; }

    public Integer getUpperLeftColumn() { return upperLeftColumn; }
    public LineShape setUpperLeftColumn(Integer upperLeftColumn) { this.upperLeftColumn = upperLeftColumn; return this; }

    public Integer getLeft() { return left; }
    public LineShape setLeft(Integer left) { this.left = left; return this; }

    public Integer getLowerRightRow() { return lowerRightRow; }
    public LineShape setLowerRightRow(Integer lowerRightRow) { this.lowerRightRow = lowerRightRow; return this; }

    public Integer getBottom() { return bottom; }
    public LineShape setBottom(Integer bottom) { this.bottom = bottom; return this; }

    public Integer getLowerRightColumn() { return lowerRightColumn; }
    public LineShape setLowerRightColumn(Integer lowerRightColumn) { this.lowerRightColumn = lowerRightColumn; return this; }

    public Integer getRight() { return right; }
    public LineShape setRight(Integer right) { this.right = right; return this; }

    public Integer getWidth() { return width; }
    public LineShape setWidth(Integer width) { this.width = width; return this; }

    public Integer getHeight() { return height; }
    public LineShape setHeight(Integer height) { this.height = height; return this; }

    public Integer getX() { return x; }
    public LineShape setX(Integer x) { this.x = x; return this; }

    public Integer getY() { return y; }
    public LineShape setY(Integer y) { this.y = y; return this; }

    public Double getRotationAngle() { return rotationAngle; }
    public LineShape setRotationAngle(Double rotationAngle) { this.rotationAngle = rotationAngle; return this; }

    public String getHtmlText() { return htmlText; }
    public LineShape setHtmlText(String htmlText) { this.htmlText = htmlText; return this; }

    public String getText() { return text; }
    public LineShape setText(String text) { this.text = text; return this; }

    public String getAlternativeText() { return alternativeText; }
    public LineShape setAlternativeText(String alternativeText) { this.alternativeText = alternativeText; return this; }

    public String getTextHorizontalAlignment() { return textHorizontalAlignment; }
    public LineShape setTextHorizontalAlignment(String textHorizontalAlignment) { this.textHorizontalAlignment = textHorizontalAlignment; return this; }

    public String getTextHorizontalOverflow() { return textHorizontalOverflow; }
    public LineShape setTextHorizontalOverflow(String textHorizontalOverflow) { this.textHorizontalOverflow = textHorizontalOverflow; return this; }

    public String getTextOrientationType() { return textOrientationType; }
    public LineShape setTextOrientationType(String textOrientationType) { this.textOrientationType = textOrientationType; return this; }

    public String getTextVerticalAlignment() { return textVerticalAlignment; }
    public LineShape setTextVerticalAlignment(String textVerticalAlignment) { this.textVerticalAlignment = textVerticalAlignment; return this; }

    public String getTextVerticalOverflow() { return textVerticalOverflow; }
    public LineShape setTextVerticalOverflow(String textVerticalOverflow) { this.textVerticalOverflow = textVerticalOverflow; return this; }

    public Boolean getIsGroup() { return isGroup; }
    public LineShape setIsGroup(Boolean isGroup) { this.isGroup = isGroup; return this; }

    public Boolean getIsHidden() { return isHidden; }
    public LineShape setIsHidden(Boolean isHidden) { this.isHidden = isHidden; return this; }

    public Boolean getIsLockAspectRatio() { return isLockAspectRatio; }
    public LineShape setIsLockAspectRatio(Boolean isLockAspectRatio) { this.isLockAspectRatio = isLockAspectRatio; return this; }

    public Boolean getIsLocked() { return isLocked; }
    public LineShape setIsLocked(Boolean isLocked) { this.isLocked = isLocked; return this; }

    public Boolean getIsPrintable() { return isPrintable; }
    public LineShape setIsPrintable(Boolean isPrintable) { this.isPrintable = isPrintable; return this; }

    public Boolean getIsTextWrapped() { return isTextWrapped; }
    public LineShape setIsTextWrapped(Boolean isTextWrapped) { this.isTextWrapped = isTextWrapped; return this; }

    public Boolean getIsWordArt() { return isWordArt; }
    public LineShape setIsWordArt(Boolean isWordArt) { this.isWordArt = isWordArt; return this; }

    public String getLinkedCell() { return linkedCell; }
    public LineShape setLinkedCell(String linkedCell) { this.linkedCell = linkedCell; return this; }

    public Integer getZOrderPosition() { return zOrderPosition; }
    public LineShape setZOrderPosition(Integer zOrderPosition) { this.zOrderPosition = zOrderPosition; return this; }

    public Font getFont() { return font; }
    public LineShape setFont(Font font) { this.font = font; return this; }

    public String getHyperlink() { return hyperlink; }
    public LineShape setHyperlink(String hyperlink) { this.hyperlink = hyperlink; return this; }

    public Link getLink() { return link; }
    public LineShape setLink(Link link) { this.link = link; return this; }

}
