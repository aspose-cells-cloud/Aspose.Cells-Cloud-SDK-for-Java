package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** FilterColumn — Represents a filter for a single column. The Filter object is a member of the Filters collection */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FilterColumn {
    /** Gets and sets the column offset in the range. */
    @JsonProperty("FieldIndex")
    private Integer fieldIndex;

    /** Gets and sets the type fo filtering data. */
    @JsonProperty("FilterType")
    private String filterType;

    /** This class contains a property named "MultipleFilters" of type "MultipleFilters" that can be both read and written. */
    @JsonProperty("MultipleFilters")
    private MultipleFilters multipleFilters;

    /** Gets or sets ColorFilter. */
    @JsonProperty("ColorFilter")
    private ColorFilter colorFilter;

    /** Gets or sets CustomFilters. */
    @JsonProperty("CustomFilters")
    private List<CustomFilter> customFilters;

    /** Gets or sets DynamicFilter. */
    @JsonProperty("DynamicFilter")
    private DynamicFilter dynamicFilter;

    /** Gets or sets IconFilter. */
    @JsonProperty("IconFilter")
    private IconFilter iconFilter;

    /** Gets or sets Top10Filter. */
    @JsonProperty("Top10Filter")
    private Top10Filter top10Filter;

    /** Indicates whether the AutoFilter button for this column is visible. */
    @JsonProperty("Visibledropdown")
    private String visibledropdown;

    public Integer getFieldIndex() { return fieldIndex; }
    public FilterColumn setFieldIndex(Integer fieldIndex) { this.fieldIndex = fieldIndex; return this; }

    public String getFilterType() { return filterType; }
    public FilterColumn setFilterType(String filterType) { this.filterType = filterType; return this; }

    public MultipleFilters getMultipleFilters() { return multipleFilters; }
    public FilterColumn setMultipleFilters(MultipleFilters multipleFilters) { this.multipleFilters = multipleFilters; return this; }

    public ColorFilter getColorFilter() { return colorFilter; }
    public FilterColumn setColorFilter(ColorFilter colorFilter) { this.colorFilter = colorFilter; return this; }

    public List<CustomFilter> getCustomFilters() { return customFilters; }
    public FilterColumn setCustomFilters(List<CustomFilter> customFilters) { this.customFilters = customFilters; return this; }

    public DynamicFilter getDynamicFilter() { return dynamicFilter; }
    public FilterColumn setDynamicFilter(DynamicFilter dynamicFilter) { this.dynamicFilter = dynamicFilter; return this; }

    public IconFilter getIconFilter() { return iconFilter; }
    public FilterColumn setIconFilter(IconFilter iconFilter) { this.iconFilter = iconFilter; return this; }

    public Top10Filter getTop10Filter() { return top10Filter; }
    public FilterColumn setTop10Filter(Top10Filter top10Filter) { this.top10Filter = top10Filter; return this; }

    public String getVisibledropdown() { return visibledropdown; }
    public FilterColumn setVisibledropdown(String visibledropdown) { this.visibledropdown = visibledropdown; return this; }

}
