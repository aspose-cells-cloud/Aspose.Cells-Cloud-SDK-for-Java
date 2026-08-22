package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Workbook — Represents a root object to create an Excel spreadsheet. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Workbook {
    /** Gets and sets the current file name. */
    @JsonProperty("FileName")
    private String fileName;

    /** A property of type List Link  named Links is specified to be serialized as an XmlElement with the tag "link". */
    @JsonProperty("Links")
    private List<Link> links;

    /** Gets the  collection in the spreadsheet. */
    @JsonProperty("Worksheets")
    private LinkElement worksheets;

    /** Gets or sets the default  object of the workbook. */
    @JsonProperty("DefaultStyle")
    private LinkElement defaultStyle;

    /** Gets or sets DocumentProperties. */
    @JsonProperty("DocumentProperties")
    private LinkElement documentProperties;

    /** Gets or sets Names. */
    @JsonProperty("Names")
    private LinkElement names;

    /** Represents the workbook settings. */
    @JsonProperty("Settings")
    private LinkElement settings;

    /** Gets or sets IsWriteProtected. */
    @JsonProperty("IsWriteProtected")
    private String isWriteProtected;

    /** Gets or sets IsProtected. */
    @JsonProperty("IsProtected")
    private String isProtected;

    /** Gets or sets IsEncryption. */
    @JsonProperty("IsEncryption")
    private String isEncryption;

    /** Gets or sets Password. */
    @JsonProperty("Password")
    private String password;

    public String getFileName() { return fileName; }
    public Workbook setFileName(String fileName) { this.fileName = fileName; return this; }

    public List<Link> getLinks() { return links; }
    public Workbook setLinks(List<Link> links) { this.links = links; return this; }

    public LinkElement getWorksheets() { return worksheets; }
    public Workbook setWorksheets(LinkElement worksheets) { this.worksheets = worksheets; return this; }

    public LinkElement getDefaultStyle() { return defaultStyle; }
    public Workbook setDefaultStyle(LinkElement defaultStyle) { this.defaultStyle = defaultStyle; return this; }

    public LinkElement getDocumentProperties() { return documentProperties; }
    public Workbook setDocumentProperties(LinkElement documentProperties) { this.documentProperties = documentProperties; return this; }

    public LinkElement getNames() { return names; }
    public Workbook setNames(LinkElement names) { this.names = names; return this; }

    public LinkElement getSettings() { return settings; }
    public Workbook setSettings(LinkElement settings) { this.settings = settings; return this; }

    public String getIsWriteProtected() { return isWriteProtected; }
    public Workbook setIsWriteProtected(String isWriteProtected) { this.isWriteProtected = isWriteProtected; return this; }

    public String getIsProtected() { return isProtected; }
    public Workbook setIsProtected(String isProtected) { this.isProtected = isProtected; return this; }

    public String getIsEncryption() { return isEncryption; }
    public Workbook setIsEncryption(String isEncryption) { this.isEncryption = isEncryption; return this; }

    public String getPassword() { return password; }
    public Workbook setPassword(String password) { this.password = password; return this; }

}
