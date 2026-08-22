package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** DataTransformationRequest — Data Transformation Request */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataTransformationRequest {
    /** Indicates the source of the mount data. */
    @JsonProperty("FileInfo")
    private FileInfo fileInfo;

    /** Indicates the source of the mount data. */
    @JsonProperty("DataSource")
    private DataSource dataSource;

    /** Indicates load data. */
    @JsonProperty("LoadData")
    private LoadData loadData;

    /** Indicates applied step list. */
    @JsonProperty("AppliedSteps")
    private List<AppliedStep> appliedSteps;

    /** This class has a property named "Region" of type string with both a getter and a setter. */
    @JsonProperty("Region")
    private String region;

    /** Indicates output format */
    @JsonProperty("OutFormat")
    private String outFormat;

    public FileInfo getFileInfo() { return fileInfo; }
    public DataTransformationRequest setFileInfo(FileInfo fileInfo) { this.fileInfo = fileInfo; return this; }

    public DataSource getDataSource() { return dataSource; }
    public DataTransformationRequest setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public LoadData getLoadData() { return loadData; }
    public DataTransformationRequest setLoadData(LoadData loadData) { this.loadData = loadData; return this; }

    public List<AppliedStep> getAppliedSteps() { return appliedSteps; }
    public DataTransformationRequest setAppliedSteps(List<AppliedStep> appliedSteps) { this.appliedSteps = appliedSteps; return this; }

    public String getRegion() { return region; }
    public DataTransformationRequest setRegion(String region) { this.region = region; return this; }

    public String getOutFormat() { return outFormat; }
    public DataTransformationRequest setOutFormat(String outFormat) { this.outFormat = outFormat; return this; }

}
