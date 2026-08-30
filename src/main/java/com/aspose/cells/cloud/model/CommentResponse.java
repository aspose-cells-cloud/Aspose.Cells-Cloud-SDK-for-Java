package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CommentResponse — Represents the Comment Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentResponse extends CellsCloudResponse {
    /** The class has a public property "Comment" of type "Comment" that can be accessed and modified. */
    @JsonProperty("Comment")
    private Comment comment;

    public Comment getComment() { return comment; }
    public CommentResponse setComment(Comment comment) { this.comment = comment; return this; }


    /** Covariant override: keeps fluent chains returning CommentResponse. */
    @Override public CommentResponse setCode(Integer code) { return (CommentResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning CommentResponse. */
    @Override public CommentResponse setStatus(String status) { return (CommentResponse) super.setStatus(status); }

}
