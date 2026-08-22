package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RenderingWatermark model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RenderingWatermark {
    /** Gets or sets Rotation. */
    @JsonProperty("Rotation")
    private Double rotation;

    /** Gets or sets ScaleToPagePercent. */
    @JsonProperty("ScaleToPagePercent")
    private Integer scaleToPagePercent;

    /** Gets or sets Opacity. */
    @JsonProperty("Opacity")
    private Double opacity;

    /** Gets or sets IsBackground. */
    @JsonProperty("IsBackground")
    private Boolean isBackground;

    /** Gets or sets Text. */
    @JsonProperty("Text")
    private String text;

    /** Gets or sets Font. */
    @JsonProperty("Font")
    private RenderingFont font;

    /** Gets or sets Image. */
    @JsonProperty("Image")
    private byte[] image;

    /** Gets or sets HAlignment. */
    @JsonProperty("HAlignment")
    private String hAlignment;

    /** Gets or sets VAlignment. */
    @JsonProperty("VAlignment")
    private String vAlignment;

    /** Gets or sets OffsetX. */
    @JsonProperty("OffsetX")
    private Double offsetX;

    /** Gets or sets OffsetY. */
    @JsonProperty("OffsetY")
    private Double offsetY;

    public Double getRotation() { return rotation; }
    public RenderingWatermark setRotation(Double rotation) { this.rotation = rotation; return this; }

    public Integer getScaleToPagePercent() { return scaleToPagePercent; }
    public RenderingWatermark setScaleToPagePercent(Integer scaleToPagePercent) { this.scaleToPagePercent = scaleToPagePercent; return this; }

    public Double getOpacity() { return opacity; }
    public RenderingWatermark setOpacity(Double opacity) { this.opacity = opacity; return this; }

    public Boolean getIsBackground() { return isBackground; }
    public RenderingWatermark setIsBackground(Boolean isBackground) { this.isBackground = isBackground; return this; }

    public String getText() { return text; }
    public RenderingWatermark setText(String text) { this.text = text; return this; }

    public RenderingFont getFont() { return font; }
    public RenderingWatermark setFont(RenderingFont font) { this.font = font; return this; }

    public byte[] getImage() { return image; }
    public RenderingWatermark setImage(byte[] image) { this.image = image; return this; }

    public String getHAlignment() { return hAlignment; }
    public RenderingWatermark setHAlignment(String hAlignment) { this.hAlignment = hAlignment; return this; }

    public String getVAlignment() { return vAlignment; }
    public RenderingWatermark setVAlignment(String vAlignment) { this.vAlignment = vAlignment; return this; }

    public Double getOffsetX() { return offsetX; }
    public RenderingWatermark setOffsetX(Double offsetX) { this.offsetX = offsetX; return this; }

    public Double getOffsetY() { return offsetY; }
    public RenderingWatermark setOffsetY(Double offsetY) { this.offsetY = offsetY; return this; }

}
