package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CommentShapeResponse — Represents the CommentShape Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentShapeResponse extends CellsCloudResponse {
    /** The class has a public property named Comment of type CommentShape that can be accessed and modified. */
    @JsonProperty("Comment")
    private CommentShape comment;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public CommentShape getComment() { return comment; }
    public CommentShapeResponse setComment(CommentShape comment) { this.comment = comment; return this; }

    public Integer getCode() { return code; }
    public CommentShapeResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public CommentShapeResponse setStatus(String status) { this.status = status; return this; }

}
