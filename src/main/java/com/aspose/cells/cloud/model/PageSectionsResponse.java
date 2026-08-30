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

    public List<PageSection> getPageSections() { return pageSections; }
    public PageSectionsResponse setPageSections(List<PageSection> pageSections) { this.pageSections = pageSections; return this; }


    /** Covariant override: keeps fluent chains returning PageSectionsResponse. */
    @Override public PageSectionsResponse setCode(Integer code) { return (PageSectionsResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning PageSectionsResponse. */
    @Override public PageSectionsResponse setStatus(String status) { return (PageSectionsResponse) super.setStatus(status); }

}
