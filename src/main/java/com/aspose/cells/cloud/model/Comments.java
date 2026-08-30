package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Comments — Encapsulates a collection of  objects. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Comments extends LinkElement {
    /** Property Summary: The CommentList property is annotated to be serialized as XML elements under the tag "comment" and holds a collection of LinkElement objects. */
    @JsonProperty("CommentList")
    private List<LinkElement> commentList;

    public List<LinkElement> getCommentList() { return commentList; }
    public Comments setCommentList(List<LinkElement> commentList) { this.commentList = commentList; return this; }


    /** Covariant override: keeps fluent chains returning Comments. */
    @Override public Comments setLink(Link link) { return (Comments) super.setLink(link); }

}
