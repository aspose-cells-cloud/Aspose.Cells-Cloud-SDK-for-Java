package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ListBox — Represents a list box object. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListBox extends Shape {
    /** This property stores the input range for the class. */
    @JsonProperty("InputRange")
    private String inputRange;

    /** Gets the number of items in the list box. */
    @JsonProperty("ItemCount")
    private Integer itemCount;

    /** Specifies the amount by which the control's value is changed when the user clicks on the scrollbar's page up or page down region. */
    @JsonProperty("PageChange")
    private Integer pageChange;

    /** Gets the selected cells. Returns null if the input range is not set or no item is selected */
    @JsonProperty("SelectedCells")
    private List<LinkElement> selectedCells;

    /** Gets or sets the index number of the currently selected item in a list box or combo box. Zero-based. */
    @JsonProperty("SelectedIndex")
    private Integer selectedIndex;

    /** Gets or sets the selection mode of the specified list box. */
    @JsonProperty("SelectionType")
    private String selectionType;

    /** Indicates whether the combobox has 3-D shading. */
    @JsonProperty("Shadow")
    private Boolean shadow;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public String getInputRange() { return inputRange; }
    public ListBox setInputRange(String inputRange) { this.inputRange = inputRange; return this; }

    public Integer getItemCount() { return itemCount; }
    public ListBox setItemCount(Integer itemCount) { this.itemCount = itemCount; return this; }

    public Integer getPageChange() { return pageChange; }
    public ListBox setPageChange(Integer pageChange) { this.pageChange = pageChange; return this; }

    public List<LinkElement> getSelectedCells() { return selectedCells; }
    public ListBox setSelectedCells(List<LinkElement> selectedCells) { this.selectedCells = selectedCells; return this; }

    public Integer getSelectedIndex() { return selectedIndex; }
    public ListBox setSelectedIndex(Integer selectedIndex) { this.selectedIndex = selectedIndex; return this; }

    public String getSelectionType() { return selectionType; }
    public ListBox setSelectionType(String selectionType) { this.selectionType = selectionType; return this; }

    public Boolean getShadow() { return shadow; }
    public ListBox setShadow(Boolean shadow) { this.shadow = shadow; return this; }

    public Link getLink() { return link; }
    public ListBox setLink(Link link) { this.link = link; return this; }


    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setName(String name) { return (ListBox) super.setName(name); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setMsoDrawingType(String msoDrawingType) { return (ListBox) super.setMsoDrawingType(msoDrawingType); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setAutoShapeType(String autoShapeType) { return (ListBox) super.setAutoShapeType(autoShapeType); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setPlacement(String placement) { return (ListBox) super.setPlacement(placement); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setUpperLeftRow(Integer upperLeftRow) { return (ListBox) super.setUpperLeftRow(upperLeftRow); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setTop(Integer top) { return (ListBox) super.setTop(top); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setUpperLeftColumn(Integer upperLeftColumn) { return (ListBox) super.setUpperLeftColumn(upperLeftColumn); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setLeft(Integer left) { return (ListBox) super.setLeft(left); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setLowerRightRow(Integer lowerRightRow) { return (ListBox) super.setLowerRightRow(lowerRightRow); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setBottom(Integer bottom) { return (ListBox) super.setBottom(bottom); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setLowerRightColumn(Integer lowerRightColumn) { return (ListBox) super.setLowerRightColumn(lowerRightColumn); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setRight(Integer right) { return (ListBox) super.setRight(right); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setWidth(Integer width) { return (ListBox) super.setWidth(width); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setHeight(Integer height) { return (ListBox) super.setHeight(height); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setX(Integer x) { return (ListBox) super.setX(x); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setY(Integer y) { return (ListBox) super.setY(y); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setRotationAngle(Double rotationAngle) { return (ListBox) super.setRotationAngle(rotationAngle); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setHtmlText(String htmlText) { return (ListBox) super.setHtmlText(htmlText); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setText(String text) { return (ListBox) super.setText(text); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setAlternativeText(String alternativeText) { return (ListBox) super.setAlternativeText(alternativeText); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setTextHorizontalAlignment(String textHorizontalAlignment) { return (ListBox) super.setTextHorizontalAlignment(textHorizontalAlignment); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setTextHorizontalOverflow(String textHorizontalOverflow) { return (ListBox) super.setTextHorizontalOverflow(textHorizontalOverflow); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setTextOrientationType(String textOrientationType) { return (ListBox) super.setTextOrientationType(textOrientationType); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setTextVerticalAlignment(String textVerticalAlignment) { return (ListBox) super.setTextVerticalAlignment(textVerticalAlignment); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setTextVerticalOverflow(String textVerticalOverflow) { return (ListBox) super.setTextVerticalOverflow(textVerticalOverflow); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setIsGroup(Boolean isGroup) { return (ListBox) super.setIsGroup(isGroup); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setIsHidden(Boolean isHidden) { return (ListBox) super.setIsHidden(isHidden); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setIsLockAspectRatio(Boolean isLockAspectRatio) { return (ListBox) super.setIsLockAspectRatio(isLockAspectRatio); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setIsLocked(Boolean isLocked) { return (ListBox) super.setIsLocked(isLocked); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setIsPrintable(Boolean isPrintable) { return (ListBox) super.setIsPrintable(isPrintable); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setIsTextWrapped(Boolean isTextWrapped) { return (ListBox) super.setIsTextWrapped(isTextWrapped); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setIsWordArt(Boolean isWordArt) { return (ListBox) super.setIsWordArt(isWordArt); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setLinkedCell(String linkedCell) { return (ListBox) super.setLinkedCell(linkedCell); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setZOrderPosition(Integer zOrderPosition) { return (ListBox) super.setZOrderPosition(zOrderPosition); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setFont(Font font) { return (ListBox) super.setFont(font); }
    /** Covariant override: keeps fluent chains returning ListBox. */
    @Override public ListBox setHyperlink(String hyperlink) { return (ListBox) super.setHyperlink(hyperlink); }

}
