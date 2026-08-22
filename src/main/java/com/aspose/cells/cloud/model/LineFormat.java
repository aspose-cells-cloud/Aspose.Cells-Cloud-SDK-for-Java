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

    /** Gets or sets Type. */
    @JsonProperty("Type")
    private String type;

    /** Gets or sets SolidFill. */
    @JsonProperty("SolidFill")
    private SolidFill solidFill;

    /** Gets or sets PatternFill. */
    @JsonProperty("PatternFill")
    private PatternFill patternFill;

    /** Gets or sets TextureFill. */
    @JsonProperty("TextureFill")
    private TextureFill textureFill;

    /** Gets or sets GradientFill. */
    @JsonProperty("GradientFill")
    private GradientFill gradientFill;

    /** Gets or sets ImageData. */
    @JsonProperty("ImageData")
    private String imageData;

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

    public String getType() { return type; }
    public LineFormat setType(String type) { this.type = type; return this; }

    public SolidFill getSolidFill() { return solidFill; }
    public LineFormat setSolidFill(SolidFill solidFill) { this.solidFill = solidFill; return this; }

    public PatternFill getPatternFill() { return patternFill; }
    public LineFormat setPatternFill(PatternFill patternFill) { this.patternFill = patternFill; return this; }

    public TextureFill getTextureFill() { return textureFill; }
    public LineFormat setTextureFill(TextureFill textureFill) { this.textureFill = textureFill; return this; }

    public GradientFill getGradientFill() { return gradientFill; }
    public LineFormat setGradientFill(GradientFill gradientFill) { this.gradientFill = gradientFill; return this; }

    public String getImageData() { return imageData; }
    public LineFormat setImageData(String imageData) { this.imageData = imageData; return this; }

}
