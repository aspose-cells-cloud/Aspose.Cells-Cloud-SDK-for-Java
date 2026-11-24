/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CommentShape.java">
 *   Copyright (c) 2026 Aspose.Cells Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------
 */

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CommentShape extends Shape {

    @SerializedName("Comment")
    @JsonProperty("Comment")
    private LinkElement comment;

    public CommentShape comment(LinkElement comment) {
        this.comment = comment;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getComment() {
        return comment;
    }

    public void setComment(LinkElement comment) {
        this.comment = comment;
    }

    @SerializedName("link")
    @JsonProperty("link")
    private Link link;

    public CommentShape link(Link link) {
        this.link = link;
        return this;
    }

    @ApiModelProperty(value = "")
    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        CommentShape other = (CommentShape) o;
        return Objects.equals(this.comment, other.comment)
            && Objects.equals(this.link, other.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comment, link, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommentShape {\n");
        sb.append("    comment: ").append(comment).append("\n");
        sb.append("    link: ").append(link).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
