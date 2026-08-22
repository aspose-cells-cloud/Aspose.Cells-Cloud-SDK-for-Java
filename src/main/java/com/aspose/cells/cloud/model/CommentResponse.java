package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CommentResponse — Represents the Comment Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentResponse extends CellsCloudResponse {
    /** The class has a public property "Comment" of type "Comment" that can be accessed and modified. */
    @JsonProperty("Comment")
    private Comment comment;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Comment getComment() { return comment; }
    public CommentResponse setComment(Comment comment) { this.comment = comment; return this; }

    public Integer getCode() { return code; }
    public CommentResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public CommentResponse setStatus(String status) { this.status = status; return this; }

}
