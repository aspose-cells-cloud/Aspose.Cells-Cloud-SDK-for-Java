package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AutoFitterOptions — Represents all auto fitter options. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutoFitterOptions {
    /** Gets and set the type of auto fitting row height of merged cells. */
    @JsonProperty("AutoFitMergedCellsType")
    private String autoFitMergedCellsType;

    /** Ignores the hidden rows/columns. */
    @JsonProperty("IgnoreHidden")
    private Boolean ignoreHidden;

    /** Indicates whether only fit the rows which height are not customed. */
    @JsonProperty("OnlyAuto")
    private Boolean onlyAuto;

    /** Gets or sets default edit language. */
    @JsonProperty("DefaultEditLanguage")
    private String defaultEditLanguage;

    /** Gets and sets the max row height(in unit of Point) when autofitting rows. */
    @JsonProperty("MaxRowHeight")
    private Double maxRowHeight;

    /** Gets and sets the type of auto fitting wrapped text. */
    @JsonProperty("AutoFitWrappedTextType")
    private String autoFitWrappedTextType;

    /** Gets and sets the formatted strategy. */
    @JsonProperty("FormatStrategy")
    private String formatStrategy;

    /** Indicates whether fit for rendering purpose. */
    @JsonProperty("ForRendering")
    private Boolean forRendering;

    public String getAutoFitMergedCellsType() { return autoFitMergedCellsType; }
    public AutoFitterOptions setAutoFitMergedCellsType(String autoFitMergedCellsType) { this.autoFitMergedCellsType = autoFitMergedCellsType; return this; }

    public Boolean getIgnoreHidden() { return ignoreHidden; }
    public AutoFitterOptions setIgnoreHidden(Boolean ignoreHidden) { this.ignoreHidden = ignoreHidden; return this; }

    public Boolean getOnlyAuto() { return onlyAuto; }
    public AutoFitterOptions setOnlyAuto(Boolean onlyAuto) { this.onlyAuto = onlyAuto; return this; }

    public String getDefaultEditLanguage() { return defaultEditLanguage; }
    public AutoFitterOptions setDefaultEditLanguage(String defaultEditLanguage) { this.defaultEditLanguage = defaultEditLanguage; return this; }

    public Double getMaxRowHeight() { return maxRowHeight; }
    public AutoFitterOptions setMaxRowHeight(Double maxRowHeight) { this.maxRowHeight = maxRowHeight; return this; }

    public String getAutoFitWrappedTextType() { return autoFitWrappedTextType; }
    public AutoFitterOptions setAutoFitWrappedTextType(String autoFitWrappedTextType) { this.autoFitWrappedTextType = autoFitWrappedTextType; return this; }

    public String getFormatStrategy() { return formatStrategy; }
    public AutoFitterOptions setFormatStrategy(String formatStrategy) { this.formatStrategy = formatStrategy; return this; }

    public Boolean getForRendering() { return forRendering; }
    public AutoFitterOptions setForRendering(Boolean forRendering) { this.forRendering = forRendering; return this; }

}
