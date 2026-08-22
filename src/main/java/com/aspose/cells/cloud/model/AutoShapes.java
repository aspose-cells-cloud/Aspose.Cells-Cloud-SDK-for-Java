package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** AutoShapes — Sure! Just provide me with the features you would like me to summarize into one sentence. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutoShapes extends LinkElement {
    /** Property Summary: Contains a list of LinkElement objects identified by the XML element "autoshape". */
    @JsonProperty("AutoShapeList")
    private List<LinkElement> autoShapeList;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public List<LinkElement> getAutoShapeList() { return autoShapeList; }
    public AutoShapes setAutoShapeList(List<LinkElement> autoShapeList) { this.autoShapeList = autoShapeList; return this; }

    public Link getLink() { return link; }
    public AutoShapes setLink(Link link) { this.link = link; return this; }

}
