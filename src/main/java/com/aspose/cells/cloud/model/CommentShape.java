package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CommentShape — Represents the shape of the comment. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentShape extends Shape {
    /** Gets the comment object. */
    @JsonProperty("Comment")
    private LinkElement comment;

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

    public LinkElement getComment() { return comment; }
    public CommentShape setComment(LinkElement comment) { this.comment = comment; return this; }

    public String getName() { return name; }
    public CommentShape setName(String name) { this.name = name; return this; }

    public String getMsoDrawingType() { return msoDrawingType; }
    public CommentShape setMsoDrawingType(String msoDrawingType) { this.msoDrawingType = msoDrawingType; return this; }

    public String getAutoShapeType() { return autoShapeType; }
    public CommentShape setAutoShapeType(String autoShapeType) { this.autoShapeType = autoShapeType; return this; }

    public String getPlacement() { return placement; }
    public CommentShape setPlacement(String placement) { this.placement = placement; return this; }

    public Integer getUpperLeftRow() { return upperLeftRow; }
    public CommentShape setUpperLeftRow(Integer upperLeftRow) { this.upperLeftRow = upperLeftRow; return this; }

    public Integer getTop() { return top; }
    public CommentShape setTop(Integer top) { this.top = top; return this; }

    public Integer getUpperLeftColumn() { return upperLeftColumn; }
    public CommentShape setUpperLeftColumn(Integer upperLeftColumn) { this.upperLeftColumn = upperLeftColumn; return this; }

    public Integer getLeft() { return left; }
    public CommentShape setLeft(Integer left) { this.left = left; return this; }

    public Integer getLowerRightRow() { return lowerRightRow; }
    public CommentShape setLowerRightRow(Integer lowerRightRow) { this.lowerRightRow = lowerRightRow; return this; }

    public Integer getBottom() { return bottom; }
    public CommentShape setBottom(Integer bottom) { this.bottom = bottom; return this; }

    public Integer getLowerRightColumn() { return lowerRightColumn; }
    public CommentShape setLowerRightColumn(Integer lowerRightColumn) { this.lowerRightColumn = lowerRightColumn; return this; }

    public Integer getRight() { return right; }
    public CommentShape setRight(Integer right) { this.right = right; return this; }

    public Integer getWidth() { return width; }
    public CommentShape setWidth(Integer width) { this.width = width; return this; }

    public Integer getHeight() { return height; }
    public CommentShape setHeight(Integer height) { this.height = height; return this; }

    public Integer getX() { return x; }
    public CommentShape setX(Integer x) { this.x = x; return this; }

    public Integer getY() { return y; }
    public CommentShape setY(Integer y) { this.y = y; return this; }

    public Double getRotationAngle() { return rotationAngle; }
    public CommentShape setRotationAngle(Double rotationAngle) { this.rotationAngle = rotationAngle; return this; }

    public String getHtmlText() { return htmlText; }
    public CommentShape setHtmlText(String htmlText) { this.htmlText = htmlText; return this; }

    public String getText() { return text; }
    public CommentShape setText(String text) { this.text = text; return this; }

    public String getAlternativeText() { return alternativeText; }
    public CommentShape setAlternativeText(String alternativeText) { this.alternativeText = alternativeText; return this; }

    public String getTextHorizontalAlignment() { return textHorizontalAlignment; }
    public CommentShape setTextHorizontalAlignment(String textHorizontalAlignment) { this.textHorizontalAlignment = textHorizontalAlignment; return this; }

    public String getTextHorizontalOverflow() { return textHorizontalOverflow; }
    public CommentShape setTextHorizontalOverflow(String textHorizontalOverflow) { this.textHorizontalOverflow = textHorizontalOverflow; return this; }

    public String getTextOrientationType() { return textOrientationType; }
    public CommentShape setTextOrientationType(String textOrientationType) { this.textOrientationType = textOrientationType; return this; }

    public String getTextVerticalAlignment() { return textVerticalAlignment; }
    public CommentShape setTextVerticalAlignment(String textVerticalAlignment) { this.textVerticalAlignment = textVerticalAlignment; return this; }

    public String getTextVerticalOverflow() { return textVerticalOverflow; }
    public CommentShape setTextVerticalOverflow(String textVerticalOverflow) { this.textVerticalOverflow = textVerticalOverflow; return this; }

    public Boolean getIsGroup() { return isGroup; }
    public CommentShape setIsGroup(Boolean isGroup) { this.isGroup = isGroup; return this; }

    public Boolean getIsHidden() { return isHidden; }
    public CommentShape setIsHidden(Boolean isHidden) { this.isHidden = isHidden; return this; }

    public Boolean getIsLockAspectRatio() { return isLockAspectRatio; }
    public CommentShape setIsLockAspectRatio(Boolean isLockAspectRatio) { this.isLockAspectRatio = isLockAspectRatio; return this; }

    public Boolean getIsLocked() { return isLocked; }
    public CommentShape setIsLocked(Boolean isLocked) { this.isLocked = isLocked; return this; }

    public Boolean getIsPrintable() { return isPrintable; }
    public CommentShape setIsPrintable(Boolean isPrintable) { this.isPrintable = isPrintable; return this; }

    public Boolean getIsTextWrapped() { return isTextWrapped; }
    public CommentShape setIsTextWrapped(Boolean isTextWrapped) { this.isTextWrapped = isTextWrapped; return this; }

    public Boolean getIsWordArt() { return isWordArt; }
    public CommentShape setIsWordArt(Boolean isWordArt) { this.isWordArt = isWordArt; return this; }

    public String getLinkedCell() { return linkedCell; }
    public CommentShape setLinkedCell(String linkedCell) { this.linkedCell = linkedCell; return this; }

    public Integer getZOrderPosition() { return zOrderPosition; }
    public CommentShape setZOrderPosition(Integer zOrderPosition) { this.zOrderPosition = zOrderPosition; return this; }

    public Font getFont() { return font; }
    public CommentShape setFont(Font font) { this.font = font; return this; }

    public String getHyperlink() { return hyperlink; }
    public CommentShape setHyperlink(String hyperlink) { this.hyperlink = hyperlink; return this; }

    public Link getLink() { return link; }
    public CommentShape setLink(Link link) { this.link = link; return this; }

}
