package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LineFormat — Represents all setting of the line. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LineFormat extends FillFormat {
    /** Gets and sets the begin arrow length type of the line. */
    @JsonProperty("BeginArrowheadLength")
    private String beginArrowheadLength;

    /** Gets and sets the begin arrow type of the line. */
    @JsonProperty("BeginArrowheadStyle")
    private String beginArrowheadStyle;

    /** Gets and sets the begin arrow width type of the line. */
    @JsonProperty("BeginArrowheadWidth")
    private String beginArrowheadWidth;

    /** Specifies the ending caps. */
    @JsonProperty("CapType")
    private String capType;

    /** Specifies the line compound type. */
    @JsonProperty("CompoundType")
    private String compoundType;

    /** Specifies the line dash type. */
    @JsonProperty("DashStyle")
    private String dashStyle;

    /** Gets and sets the end arrow length type of the line. */
    @JsonProperty("EndArrowheadLength")
    private String endArrowheadLength;

    /** Gets and sets the end arrow type of the line. */
    @JsonProperty("EndArrowheadStyle")
    private String endArrowheadStyle;

    /** Gets and sets the end arrow width type of the line. */
    @JsonProperty("EndArrowheadWidth")
    private String endArrowheadWidth;

    /** Specifies the line join type. */
    @JsonProperty("JoinType")
    private String joinType;

    /** Gets or sets the weight of the line in unit of points. */
    @JsonProperty("Weight")
    private Double weight;

    public String getBeginArrowheadLength() { return beginArrowheadLength; }
    public LineFormat setBeginArrowheadLength(String beginArrowheadLength) { this.beginArrowheadLength = beginArrowheadLength; return this; }

    public String getBeginArrowheadStyle() { return beginArrowheadStyle; }
    public LineFormat setBeginArrowheadStyle(String beginArrowheadStyle) { this.beginArrowheadStyle = beginArrowheadStyle; return this; }

    public String getBeginArrowheadWidth() { return beginArrowheadWidth; }
    public LineFormat setBeginArrowheadWidth(String beginArrowheadWidth) { this.beginArrowheadWidth = beginArrowheadWidth; return this; }

    public String getCapType() { return capType; }
    public LineFormat setCapType(String capType) { this.capType = capType; return this; }

    public String getCompoundType() { return compoundType; }
    public LineFormat setCompoundType(String compoundType) { this.compoundType = compoundType; return this; }

    public String getDashStyle() { return dashStyle; }
    public LineFormat setDashStyle(String dashStyle) { this.dashStyle = dashStyle; return this; }

    public String getEndArrowheadLength() { return endArrowheadLength; }
    public LineFormat setEndArrowheadLength(String endArrowheadLength) { this.endArrowheadLength = endArrowheadLength; return this; }

    public String getEndArrowheadStyle() { return endArrowheadStyle; }
    public LineFormat setEndArrowheadStyle(String endArrowheadStyle) { this.endArrowheadStyle = endArrowheadStyle; return this; }

    public String getEndArrowheadWidth() { return endArrowheadWidth; }
    public LineFormat setEndArrowheadWidth(String endArrowheadWidth) { this.endArrowheadWidth = endArrowheadWidth; return this; }

    public String getJoinType() { return joinType; }
    public LineFormat setJoinType(String joinType) { this.joinType = joinType; return this; }

    public Double getWeight() { return weight; }
    public LineFormat setWeight(Double weight) { this.weight = weight; return this; }


    /** Covariant override: keeps fluent chains returning LineFormat. */
    @Override public LineFormat setType(String type) { return (LineFormat) super.setType(type); }
    /** Covariant override: keeps fluent chains returning LineFormat. */
    @Override public LineFormat setSolidFill(SolidFill solidFill) { return (LineFormat) super.setSolidFill(solidFill); }
    /** Covariant override: keeps fluent chains returning LineFormat. */
    @Override public LineFormat setPatternFill(PatternFill patternFill) { return (LineFormat) super.setPatternFill(patternFill); }
    /** Covariant override: keeps fluent chains returning LineFormat. */
    @Override public LineFormat setTextureFill(TextureFill textureFill) { return (LineFormat) super.setTextureFill(textureFill); }
    /** Covariant override: keeps fluent chains returning LineFormat. */
    @Override public LineFormat setGradientFill(GradientFill gradientFill) { return (LineFormat) super.setGradientFill(gradientFill); }
    /** Covariant override: keeps fluent chains returning LineFormat. */
    @Override public LineFormat setImageData(String imageData) { return (LineFormat) super.setImageData(imageData); }

}
