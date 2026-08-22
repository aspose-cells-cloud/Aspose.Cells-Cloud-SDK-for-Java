package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** PageSectionsResponse — Represents the PageSections Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageSectionsResponse extends CellsCloudResponse {
    /** A property named PageSections of type List PageSection  to store a collection of PageSection objects. */
    @JsonProperty("PageSections")
    private List<PageSection> pageSections;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public List<PageSection> getPageSections() { return pageSections; }
    public PageSectionsResponse setPageSections(List<PageSection> pageSections) { this.pageSections = pageSections; return this; }

    public Integer getCode() { return code; }
    public PageSectionsResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public PageSectionsResponse setStatus(String status) { this.status = status; return this; }

}
