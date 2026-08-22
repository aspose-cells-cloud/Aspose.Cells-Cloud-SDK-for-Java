package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RangeCopyRequest — Indicates range copy request */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RangeCopyRequest {
    /** copydata, copystyle, copyto, copyvalue. */
    @JsonProperty("Operate")
    private String operate;

    /** Source range. */
    @JsonProperty("Source")
    private Range source;

    /** Target range. */
    @JsonProperty("Target")
    private Range target;

    /** Gets or sets TargetWorkbook. */
    @JsonProperty("TargetWorkbook")
    private String targetWorkbook;

    /** Represents the paste special options. */
    @JsonProperty("PasteOptions")
    private PasteOptions pasteOptions;

    public String getOperate() { return operate; }
    public RangeCopyRequest setOperate(String operate) { this.operate = operate; return this; }

    public Range getSource() { return source; }
    public RangeCopyRequest setSource(Range source) { this.source = source; return this; }

    public Range getTarget() { return target; }
    public RangeCopyRequest setTarget(Range target) { this.target = target; return this; }

    public String getTargetWorkbook() { return targetWorkbook; }
    public RangeCopyRequest setTargetWorkbook(String targetWorkbook) { this.targetWorkbook = targetWorkbook; return this; }

    public PasteOptions getPasteOptions() { return pasteOptions; }
    public RangeCopyRequest setPasteOptions(PasteOptions pasteOptions) { this.pasteOptions = pasteOptions; return this; }

}
