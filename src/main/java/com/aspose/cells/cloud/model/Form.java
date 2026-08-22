package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Form — I'm happy to help! Please provide the features you would like me to summarize into one sentence for the class. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Form extends Shape {
    /** A property named "FormType" of type string which can be both accessed and modified. */
    @JsonProperty("FormType")
    private String formType;

    /** Gets or sets CheckedValue. */
    @JsonProperty("CheckedValue")
    private String checkedValue;

    /** Gets or sets Shadow. */
    @JsonProperty("Shadow")
    private Boolean shadow;

    /** Gets or sets InputRange. */
    @JsonProperty("InputRange")
    private String inputRange;

    /** Gets or sets SelectedIndex. */
    @JsonProperty("SelectedIndex")
    private Integer selectedIndex;

    /** Gets or sets SelectedValue. */
    @JsonProperty("SelectedValue")
    private String selectedValue;

    /** Gets or sets SelectedCell. */
    @JsonProperty("SelectedCell")
    private LinkElement selectedCell;

    /** Gets or sets DropDownLines. */
    @JsonProperty("DropDownLines")
    private Integer dropDownLines;

    /** Gets or sets ItemCount. */
    @JsonProperty("ItemCount")
    private Integer itemCount;

    /** Gets or sets SelectedCells. */
    @JsonProperty("SelectedCells")
    private List<LinkElement> selectedCells;

    /** Gets or sets SelectionType. */
    @JsonProperty("SelectionType")
    private String selectionType;

    /** Gets or sets IsChecked. */
    @JsonProperty("IsChecked")
    private Boolean isChecked;

    /** Gets or sets CurrentValue. */
    @JsonProperty("CurrentValue")
    private Integer currentValue;

    /** Gets or sets Min. */
    @JsonProperty("Min")
    private Integer min;

    /** Gets or sets Max. */
    @JsonProperty("Max")
    private Integer max;

    /** Gets or sets IncrementalChange. */
    @JsonProperty("IncrementalChange")
    private Integer incrementalChange;

    /** Gets or sets PageChange. */
    @JsonProperty("PageChange")
    private Integer pageChange;

    /** Gets or sets IsHorizontal. */
    @JsonProperty("IsHorizontal")
    private Boolean isHorizontal;

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

    public String getFormType() { return formType; }
    public Form setFormType(String formType) { this.formType = formType; return this; }

    public String getCheckedValue() { return checkedValue; }
    public Form setCheckedValue(String checkedValue) { this.checkedValue = checkedValue; return this; }

    public Boolean getShadow() { return shadow; }
    public Form setShadow(Boolean shadow) { this.shadow = shadow; return this; }

    public String getInputRange() { return inputRange; }
    public Form setInputRange(String inputRange) { this.inputRange = inputRange; return this; }

    public Integer getSelectedIndex() { return selectedIndex; }
    public Form setSelectedIndex(Integer selectedIndex) { this.selectedIndex = selectedIndex; return this; }

    public String getSelectedValue() { return selectedValue; }
    public Form setSelectedValue(String selectedValue) { this.selectedValue = selectedValue; return this; }

    public LinkElement getSelectedCell() { return selectedCell; }
    public Form setSelectedCell(LinkElement selectedCell) { this.selectedCell = selectedCell; return this; }

    public Integer getDropDownLines() { return dropDownLines; }
    public Form setDropDownLines(Integer dropDownLines) { this.dropDownLines = dropDownLines; return this; }

    public Integer getItemCount() { return itemCount; }
    public Form setItemCount(Integer itemCount) { this.itemCount = itemCount; return this; }

    public List<LinkElement> getSelectedCells() { return selectedCells; }
    public Form setSelectedCells(List<LinkElement> selectedCells) { this.selectedCells = selectedCells; return this; }

    public String getSelectionType() { return selectionType; }
    public Form setSelectionType(String selectionType) { this.selectionType = selectionType; return this; }

    public Boolean getIsChecked() { return isChecked; }
    public Form setIsChecked(Boolean isChecked) { this.isChecked = isChecked; return this; }

    public Integer getCurrentValue() { return currentValue; }
    public Form setCurrentValue(Integer currentValue) { this.currentValue = currentValue; return this; }

    public Integer getMin() { return min; }
    public Form setMin(Integer min) { this.min = min; return this; }

    public Integer getMax() { return max; }
    public Form setMax(Integer max) { this.max = max; return this; }

    public Integer getIncrementalChange() { return incrementalChange; }
    public Form setIncrementalChange(Integer incrementalChange) { this.incrementalChange = incrementalChange; return this; }

    public Integer getPageChange() { return pageChange; }
    public Form setPageChange(Integer pageChange) { this.pageChange = pageChange; return this; }

    public Boolean getIsHorizontal() { return isHorizontal; }
    public Form setIsHorizontal(Boolean isHorizontal) { this.isHorizontal = isHorizontal; return this; }

    public String getName() { return name; }
    public Form setName(String name) { this.name = name; return this; }

    public String getMsoDrawingType() { return msoDrawingType; }
    public Form setMsoDrawingType(String msoDrawingType) { this.msoDrawingType = msoDrawingType; return this; }

    public String getAutoShapeType() { return autoShapeType; }
    public Form setAutoShapeType(String autoShapeType) { this.autoShapeType = autoShapeType; return this; }

    public String getPlacement() { return placement; }
    public Form setPlacement(String placement) { this.placement = placement; return this; }

    public Integer getUpperLeftRow() { return upperLeftRow; }
    public Form setUpperLeftRow(Integer upperLeftRow) { this.upperLeftRow = upperLeftRow; return this; }

    public Integer getTop() { return top; }
    public Form setTop(Integer top) { this.top = top; return this; }

    public Integer getUpperLeftColumn() { return upperLeftColumn; }
    public Form setUpperLeftColumn(Integer upperLeftColumn) { this.upperLeftColumn = upperLeftColumn; return this; }

    public Integer getLeft() { return left; }
    public Form setLeft(Integer left) { this.left = left; return this; }

    public Integer getLowerRightRow() { return lowerRightRow; }
    public Form setLowerRightRow(Integer lowerRightRow) { this.lowerRightRow = lowerRightRow; return this; }

    public Integer getBottom() { return bottom; }
    public Form setBottom(Integer bottom) { this.bottom = bottom; return this; }

    public Integer getLowerRightColumn() { return lowerRightColumn; }
    public Form setLowerRightColumn(Integer lowerRightColumn) { this.lowerRightColumn = lowerRightColumn; return this; }

    public Integer getRight() { return right; }
    public Form setRight(Integer right) { this.right = right; return this; }

    public Integer getWidth() { return width; }
    public Form setWidth(Integer width) { this.width = width; return this; }

    public Integer getHeight() { return height; }
    public Form setHeight(Integer height) { this.height = height; return this; }

    public Integer getX() { return x; }
    public Form setX(Integer x) { this.x = x; return this; }

    public Integer getY() { return y; }
    public Form setY(Integer y) { this.y = y; return this; }

    public Double getRotationAngle() { return rotationAngle; }
    public Form setRotationAngle(Double rotationAngle) { this.rotationAngle = rotationAngle; return this; }

    public String getHtmlText() { return htmlText; }
    public Form setHtmlText(String htmlText) { this.htmlText = htmlText; return this; }

    public String getText() { return text; }
    public Form setText(String text) { this.text = text; return this; }

    public String getAlternativeText() { return alternativeText; }
    public Form setAlternativeText(String alternativeText) { this.alternativeText = alternativeText; return this; }

    public String getTextHorizontalAlignment() { return textHorizontalAlignment; }
    public Form setTextHorizontalAlignment(String textHorizontalAlignment) { this.textHorizontalAlignment = textHorizontalAlignment; return this; }

    public String getTextHorizontalOverflow() { return textHorizontalOverflow; }
    public Form setTextHorizontalOverflow(String textHorizontalOverflow) { this.textHorizontalOverflow = textHorizontalOverflow; return this; }

    public String getTextOrientationType() { return textOrientationType; }
    public Form setTextOrientationType(String textOrientationType) { this.textOrientationType = textOrientationType; return this; }

    public String getTextVerticalAlignment() { return textVerticalAlignment; }
    public Form setTextVerticalAlignment(String textVerticalAlignment) { this.textVerticalAlignment = textVerticalAlignment; return this; }

    public String getTextVerticalOverflow() { return textVerticalOverflow; }
    public Form setTextVerticalOverflow(String textVerticalOverflow) { this.textVerticalOverflow = textVerticalOverflow; return this; }

    public Boolean getIsGroup() { return isGroup; }
    public Form setIsGroup(Boolean isGroup) { this.isGroup = isGroup; return this; }

    public Boolean getIsHidden() { return isHidden; }
    public Form setIsHidden(Boolean isHidden) { this.isHidden = isHidden; return this; }

    public Boolean getIsLockAspectRatio() { return isLockAspectRatio; }
    public Form setIsLockAspectRatio(Boolean isLockAspectRatio) { this.isLockAspectRatio = isLockAspectRatio; return this; }

    public Boolean getIsLocked() { return isLocked; }
    public Form setIsLocked(Boolean isLocked) { this.isLocked = isLocked; return this; }

    public Boolean getIsPrintable() { return isPrintable; }
    public Form setIsPrintable(Boolean isPrintable) { this.isPrintable = isPrintable; return this; }

    public Boolean getIsTextWrapped() { return isTextWrapped; }
    public Form setIsTextWrapped(Boolean isTextWrapped) { this.isTextWrapped = isTextWrapped; return this; }

    public Boolean getIsWordArt() { return isWordArt; }
    public Form setIsWordArt(Boolean isWordArt) { this.isWordArt = isWordArt; return this; }

    public String getLinkedCell() { return linkedCell; }
    public Form setLinkedCell(String linkedCell) { this.linkedCell = linkedCell; return this; }

    public Integer getZOrderPosition() { return zOrderPosition; }
    public Form setZOrderPosition(Integer zOrderPosition) { this.zOrderPosition = zOrderPosition; return this; }

    public Font getFont() { return font; }
    public Form setFont(Font font) { this.font = font; return this; }

    public String getHyperlink() { return hyperlink; }
    public Form setHyperlink(String hyperlink) { this.hyperlink = hyperlink; return this; }

    public Link getLink() { return link; }
    public Form setLink(Link link) { this.link = link; return this; }

}
