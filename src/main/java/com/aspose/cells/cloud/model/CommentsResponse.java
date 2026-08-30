package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CommentsResponse — Represents the Comments Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentsResponse extends CellsCloudResponse {
    /** Property Summary: "The Comments property represents an XML element named 'comments' within the class." */
    @JsonProperty("Comments")
    private Comments comments;

    public Comments getComments() { return comments; }
    public CommentsResponse setComments(Comments comments) { this.comments = comments; return this; }


    /** Covariant override: keeps fluent chains returning CommentsResponse. */
    @Override public CommentsResponse setCode(Integer code) { return (CommentsResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning CommentsResponse. */
    @Override public CommentsResponse setStatus(String status) { return (CommentsResponse) super.setStatus(status); }

}
