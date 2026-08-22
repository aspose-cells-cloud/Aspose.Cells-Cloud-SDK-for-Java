package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CheckBox — Represents a check box object in a worksheet. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckBox extends Shape {
    /** Gets or set checkbox' value. */
    @JsonProperty("CheckedValue")
    private String checkedValue;

    /** Indicates whether the combobox has 3-D shading. */
    @JsonProperty("Shadow")
    private Boolean shadow;

    /** Indicates if the checkbox is checked or not. */
    @JsonProperty("Value")
    private Boolean value;

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

    public String getCheckedValue() { return checkedValue; }
    public CheckBox setCheckedValue(String checkedValue) { this.checkedValue = checkedValue; return this; }

    public Boolean getShadow() { return shadow; }
    public CheckBox setShadow(Boolean shadow) { this.shadow = shadow; return this; }

    public Boolean getValue() { return value; }
    public CheckBox setValue(Boolean value) { this.value = value; return this; }

    public String getName() { return name; }
    public CheckBox setName(String name) { this.name = name; return this; }

    public String getMsoDrawingType() { return msoDrawingType; }
    public CheckBox setMsoDrawingType(String msoDrawingType) { this.msoDrawingType = msoDrawingType; return this; }

    public String getAutoShapeType() { return autoShapeType; }
    public CheckBox setAutoShapeType(String autoShapeType) { this.autoShapeType = autoShapeType; return this; }

    public String getPlacement() { return placement; }
    public CheckBox setPlacement(String placement) { this.placement = placement; return this; }

    public Integer getUpperLeftRow() { return upperLeftRow; }
    public CheckBox setUpperLeftRow(Integer upperLeftRow) { this.upperLeftRow = upperLeftRow; return this; }

    public Integer getTop() { return top; }
    public CheckBox setTop(Integer top) { this.top = top; return this; }

    public Integer getUpperLeftColumn() { return upperLeftColumn; }
    public CheckBox setUpperLeftColumn(Integer upperLeftColumn) { this.upperLeftColumn = upperLeftColumn; return this; }

    public Integer getLeft() { return left; }
    public CheckBox setLeft(Integer left) { this.left = left; return this; }

    public Integer getLowerRightRow() { return lowerRightRow; }
    public CheckBox setLowerRightRow(Integer lowerRightRow) { this.lowerRightRow = lowerRightRow; return this; }

    public Integer getBottom() { return bottom; }
    public CheckBox setBottom(Integer bottom) { this.bottom = bottom; return this; }

    public Integer getLowerRightColumn() { return lowerRightColumn; }
    public CheckBox setLowerRightColumn(Integer lowerRightColumn) { this.lowerRightColumn = lowerRightColumn; return this; }

    public Integer getRight() { return right; }
    public CheckBox setRight(Integer right) { this.right = right; return this; }

    public Integer getWidth() { return width; }
    public CheckBox setWidth(Integer width) { this.width = width; return this; }

    public Integer getHeight() { return height; }
    public CheckBox setHeight(Integer height) { this.height = height; return this; }

    public Integer getX() { return x; }
    public CheckBox setX(Integer x) { this.x = x; return this; }

    public Integer getY() { return y; }
    public CheckBox setY(Integer y) { this.y = y; return this; }

    public Double getRotationAngle() { return rotationAngle; }
    public CheckBox setRotationAngle(Double rotationAngle) { this.rotationAngle = rotationAngle; return this; }

    public String getHtmlText() { return htmlText; }
    public CheckBox setHtmlText(String htmlText) { this.htmlText = htmlText; return this; }

    public String getText() { return text; }
    public CheckBox setText(String text) { this.text = text; return this; }

    public String getAlternativeText() { return alternativeText; }
    public CheckBox setAlternativeText(String alternativeText) { this.alternativeText = alternativeText; return this; }

    public String getTextHorizontalAlignment() { return textHorizontalAlignment; }
    public CheckBox setTextHorizontalAlignment(String textHorizontalAlignment) { this.textHorizontalAlignment = textHorizontalAlignment; return this; }

    public String getTextHorizontalOverflow() { return textHorizontalOverflow; }
    public CheckBox setTextHorizontalOverflow(String textHorizontalOverflow) { this.textHorizontalOverflow = textHorizontalOverflow; return this; }

    public String getTextOrientationType() { return textOrientationType; }
    public CheckBox setTextOrientationType(String textOrientationType) { this.textOrientationType = textOrientationType; return this; }

    public String getTextVerticalAlignment() { return textVerticalAlignment; }
    public CheckBox setTextVerticalAlignment(String textVerticalAlignment) { this.textVerticalAlignment = textVerticalAlignment; return this; }

    public String getTextVerticalOverflow() { return textVerticalOverflow; }
    public CheckBox setTextVerticalOverflow(String textVerticalOverflow) { this.textVerticalOverflow = textVerticalOverflow; return this; }

    public Boolean getIsGroup() { return isGroup; }
    public CheckBox setIsGroup(Boolean isGroup) { this.isGroup = isGroup; return this; }

    public Boolean getIsHidden() { return isHidden; }
    public CheckBox setIsHidden(Boolean isHidden) { this.isHidden = isHidden; return this; }

    public Boolean getIsLockAspectRatio() { return isLockAspectRatio; }
    public CheckBox setIsLockAspectRatio(Boolean isLockAspectRatio) { this.isLockAspectRatio = isLockAspectRatio; return this; }

    public Boolean getIsLocked() { return isLocked; }
    public CheckBox setIsLocked(Boolean isLocked) { this.isLocked = isLocked; return this; }

    public Boolean getIsPrintable() { return isPrintable; }
    public CheckBox setIsPrintable(Boolean isPrintable) { this.isPrintable = isPrintable; return this; }

    public Boolean getIsTextWrapped() { return isTextWrapped; }
    public CheckBox setIsTextWrapped(Boolean isTextWrapped) { this.isTextWrapped = isTextWrapped; return this; }

    public Boolean getIsWordArt() { return isWordArt; }
    public CheckBox setIsWordArt(Boolean isWordArt) { this.isWordArt = isWordArt; return this; }

    public String getLinkedCell() { return linkedCell; }
    public CheckBox setLinkedCell(String linkedCell) { this.linkedCell = linkedCell; return this; }

    public Integer getZOrderPosition() { return zOrderPosition; }
    public CheckBox setZOrderPosition(Integer zOrderPosition) { this.zOrderPosition = zOrderPosition; return this; }

    public Font getFont() { return font; }
    public CheckBox setFont(Font font) { this.font = font; return this; }

    public String getHyperlink() { return hyperlink; }
    public CheckBox setHyperlink(String hyperlink) { this.hyperlink = hyperlink; return this; }

    public Link getLink() { return link; }
    public CheckBox setLink(Link link) { this.link = link; return this; }

}
