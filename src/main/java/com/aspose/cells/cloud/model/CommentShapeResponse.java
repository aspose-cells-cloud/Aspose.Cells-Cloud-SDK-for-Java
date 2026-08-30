package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CommentShapeResponse — Represents the CommentShape Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentShapeResponse extends CellsCloudResponse {
    /** The class has a public property named Comment of type CommentShape that can be accessed and modified. */
    @JsonProperty("Comment")
    private CommentShape comment;

    public CommentShape getComment() { return comment; }
    public CommentShapeResponse setComment(CommentShape comment) { this.comment = comment; return this; }


    /** Covariant override: keeps fluent chains returning CommentShapeResponse. */
    @Override public CommentShapeResponse setCode(Integer code) { return (CommentShapeResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning CommentShapeResponse. */
    @Override public CommentShapeResponse setStatus(String status) { return (CommentShapeResponse) super.setStatus(status); }

}
