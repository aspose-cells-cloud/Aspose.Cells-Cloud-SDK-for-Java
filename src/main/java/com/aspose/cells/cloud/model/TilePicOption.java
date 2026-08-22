package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TilePicOption — Represents tile picture as texture. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TilePicOption {
    /** Gets or sets the X offset for tiling picture. */
    @JsonProperty("OffsetX")
    private Double offsetX;

    /** Gets or sets the Y offset for tiling picture. */
    @JsonProperty("OffsetY")
    private Double offsetY;

    /** Gets or sets the X scale for tiling picture. */
    @JsonProperty("ScaleX")
    private Double scaleX;

    /** Gets or sets the Y scale for tiling picture. */
    @JsonProperty("ScaleY")
    private Double scaleY;

    /** Gets or sets the alignment for tiling. */
    @JsonProperty("AlignmentType")
    private String alignmentType;

    /** Gets or sets the mirror type for tiling. */
    @JsonProperty("MirrorType")
    private String mirrorType;

    public Double getOffsetX() { return offsetX; }
    public TilePicOption setOffsetX(Double offsetX) { this.offsetX = offsetX; return this; }

    public Double getOffsetY() { return offsetY; }
    public TilePicOption setOffsetY(Double offsetY) { this.offsetY = offsetY; return this; }

    public Double getScaleX() { return scaleX; }
    public TilePicOption setScaleX(Double scaleX) { this.scaleX = scaleX; return this; }

    public Double getScaleY() { return scaleY; }
    public TilePicOption setScaleY(Double scaleY) { this.scaleY = scaleY; return this; }

    public String getAlignmentType() { return alignmentType; }
    public TilePicOption setAlignmentType(String alignmentType) { this.alignmentType = alignmentType; return this; }

    public String getMirrorType() { return mirrorType; }
    public TilePicOption setMirrorType(String mirrorType) { this.mirrorType = mirrorType; return this; }

}
