package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.ExtractTextOptions;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Effortlessly extract text and numbers from Excel cells with precise options. This API allows extraction of first/last characters, text between delimiters, and numbers from strings, with output as static values or formulas. */
public class PostExtractTextRequest implements RequestOption {
    private final ExtractTextOptions extractTextOptions;

    public PostExtractTextRequest(ExtractTextOptions extractTextOptions) {
        if (extractTextOptions == null) throw new IllegalArgumentException("extractTextOptions is required");
        this.extractTextOptions = extractTextOptions;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/extracttext";
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
        return extractTextOptions;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
