package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CommentsResponse — Represents the Comments Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentsResponse extends CellsCloudResponse {
    /** Property Summary: "The Comments property represents an XML element named 'comments' within the class." */
    @JsonProperty("Comments")
    private Comments comments;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Comments getComments() { return comments; }
    public CommentsResponse setComments(Comments comments) { this.comments = comments; return this; }

    public Integer getCode() { return code; }
    public CommentsResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public CommentsResponse setStatus(String status) { this.status = status; return this; }

}
