package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RangeConvertRequest — Indicates range copy request */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RangeConvertRequest {
    /** Source range. */
    @JsonProperty("Source")
    private Range source;

    /** Target range. */
    @JsonProperty("ImageType")
    private String imageType;

    /** Represents the paste special options. */
    @JsonProperty("ImageOrPrintOptions")
    private ImageOrPrintOptions imageOrPrintOptions;

    /** Gets or sets PageSetup. */
    @JsonProperty("PageSetup")
    private PageSetup pageSetup;

    public Range getSource() { return source; }
    public RangeConvertRequest setSource(Range source) { this.source = source; return this; }

    public String getImageType() { return imageType; }
    public RangeConvertRequest setImageType(String imageType) { this.imageType = imageType; return this; }

    public ImageOrPrintOptions getImageOrPrintOptions() { return imageOrPrintOptions; }
    public RangeConvertRequest setImageOrPrintOptions(ImageOrPrintOptions imageOrPrintOptions) { this.imageOrPrintOptions = imageOrPrintOptions; return this; }

    public PageSetup getPageSetup() { return pageSetup; }
    public RangeConvertRequest setPageSetup(PageSetup pageSetup) { this.pageSetup = pageSetup; return this; }

}
