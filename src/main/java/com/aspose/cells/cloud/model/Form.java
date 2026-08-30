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

    public Link getLink() { return link; }
    public Form setLink(Link link) { this.link = link; return this; }


    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setName(String name) { return (Form) super.setName(name); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setMsoDrawingType(String msoDrawingType) { return (Form) super.setMsoDrawingType(msoDrawingType); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setAutoShapeType(String autoShapeType) { return (Form) super.setAutoShapeType(autoShapeType); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setPlacement(String placement) { return (Form) super.setPlacement(placement); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setUpperLeftRow(Integer upperLeftRow) { return (Form) super.setUpperLeftRow(upperLeftRow); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setTop(Integer top) { return (Form) super.setTop(top); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setUpperLeftColumn(Integer upperLeftColumn) { return (Form) super.setUpperLeftColumn(upperLeftColumn); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setLeft(Integer left) { return (Form) super.setLeft(left); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setLowerRightRow(Integer lowerRightRow) { return (Form) super.setLowerRightRow(lowerRightRow); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setBottom(Integer bottom) { return (Form) super.setBottom(bottom); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setLowerRightColumn(Integer lowerRightColumn) { return (Form) super.setLowerRightColumn(lowerRightColumn); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setRight(Integer right) { return (Form) super.setRight(right); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setWidth(Integer width) { return (Form) super.setWidth(width); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setHeight(Integer height) { return (Form) super.setHeight(height); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setX(Integer x) { return (Form) super.setX(x); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setY(Integer y) { return (Form) super.setY(y); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setRotationAngle(Double rotationAngle) { return (Form) super.setRotationAngle(rotationAngle); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setHtmlText(String htmlText) { return (Form) super.setHtmlText(htmlText); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setText(String text) { return (Form) super.setText(text); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setAlternativeText(String alternativeText) { return (Form) super.setAlternativeText(alternativeText); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setTextHorizontalAlignment(String textHorizontalAlignment) { return (Form) super.setTextHorizontalAlignment(textHorizontalAlignment); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setTextHorizontalOverflow(String textHorizontalOverflow) { return (Form) super.setTextHorizontalOverflow(textHorizontalOverflow); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setTextOrientationType(String textOrientationType) { return (Form) super.setTextOrientationType(textOrientationType); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setTextVerticalAlignment(String textVerticalAlignment) { return (Form) super.setTextVerticalAlignment(textVerticalAlignment); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setTextVerticalOverflow(String textVerticalOverflow) { return (Form) super.setTextVerticalOverflow(textVerticalOverflow); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setIsGroup(Boolean isGroup) { return (Form) super.setIsGroup(isGroup); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setIsHidden(Boolean isHidden) { return (Form) super.setIsHidden(isHidden); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setIsLockAspectRatio(Boolean isLockAspectRatio) { return (Form) super.setIsLockAspectRatio(isLockAspectRatio); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setIsLocked(Boolean isLocked) { return (Form) super.setIsLocked(isLocked); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setIsPrintable(Boolean isPrintable) { return (Form) super.setIsPrintable(isPrintable); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setIsTextWrapped(Boolean isTextWrapped) { return (Form) super.setIsTextWrapped(isTextWrapped); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setIsWordArt(Boolean isWordArt) { return (Form) super.setIsWordArt(isWordArt); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setLinkedCell(String linkedCell) { return (Form) super.setLinkedCell(linkedCell); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setZOrderPosition(Integer zOrderPosition) { return (Form) super.setZOrderPosition(zOrderPosition); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setFont(Font font) { return (Form) super.setFont(font); }
    /** Covariant override: keeps fluent chains returning Form. */
    @Override public Form setHyperlink(String hyperlink) { return (Form) super.setHyperlink(hyperlink); }

}
