package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SpecifyWordsCountOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SpecifyWordsCountOptions {
    /** Gets or sets DataSource. */
    @JsonProperty("DataSource")
    private DataSource dataSource;

    /** Gets or sets FileInfo. */
    @JsonProperty("FileInfo")
    private FileInfo fileInfo;

    /** Gets or sets SearchWord. */
    @JsonProperty("SearchWord")
    private String searchWord;

    public DataSource getDataSource() { return dataSource; }
    public SpecifyWordsCountOptions setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileInfo getFileInfo() { return fileInfo; }
    public SpecifyWordsCountOptions setFileInfo(FileInfo fileInfo) { this.fileInfo = fileInfo; return this; }

    public String getSearchWord() { return searchWord; }
    public SpecifyWordsCountOptions setSearchWord(String searchWord) { this.searchWord = searchWord; return this; }

}
