package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.AnalyzeExcelRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Perform business analysis of data in Excel files. */
public class PostAnalyzeExcelRequest implements RequestOption {
    private final AnalyzeExcelRequest analyzeExcelRequest;

    public PostAnalyzeExcelRequest(AnalyzeExcelRequest analyzeExcelRequest) {
        if (analyzeExcelRequest == null) throw new IllegalArgumentException("analyzeExcelRequest is required");
        this.analyzeExcelRequest = analyzeExcelRequest;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/analyze";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        return new LinkedHashMap<>();
    }

    @Override
    public Map<String, String> getHeaderParameters() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        return headers;
    }

    @Override
    public Object getJsonBody() {
        return analyzeExcelRequest;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
