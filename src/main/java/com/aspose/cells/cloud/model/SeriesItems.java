package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** SeriesItems — Class Summary: - Features: Active class participation, group projects, quizzes, and final exam. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeriesItems extends LinkElement {
    /** This property allows setting and getting data for the category. */
    @JsonProperty("CategoryData")
    private String categoryData;

    /** Gets or sets IsColorVaried. */
    @JsonProperty("IsColorVaried")
    private Boolean isColorVaried;

    /** Gets or sets SecondCatergoryData. */
    @JsonProperty("SecondCatergoryData")
    private String secondCatergoryData;

    /** Gets or sets SeriesList. */
    @JsonProperty("SeriesList")
    private List<Series> seriesList;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public String getCategoryData() { return categoryData; }
    public SeriesItems setCategoryData(String categoryData) { this.categoryData = categoryData; return this; }

    public Boolean getIsColorVaried() { return isColorVaried; }
    public SeriesItems setIsColorVaried(Boolean isColorVaried) { this.isColorVaried = isColorVaried; return this; }

    public String getSecondCatergoryData() { return secondCatergoryData; }
    public SeriesItems setSecondCatergoryData(String secondCatergoryData) { this.secondCatergoryData = secondCatergoryData; return this; }

    public List<Series> getSeriesList() { return seriesList; }
    public SeriesItems setSeriesList(List<Series> seriesList) { this.seriesList = seriesList; return this; }

    public Link getLink() { return link; }
    public SeriesItems setLink(Link link) { this.link = link; return this; }

}
