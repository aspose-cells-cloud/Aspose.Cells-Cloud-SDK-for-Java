package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.RemoveDuplicatesOptions;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Efficiently remove duplicate substrings from Excel cells. Select a range, specify delimiters, and apply options to eliminate repeated text segments. */
public class PostRemoveDuplicatesRequest implements RequestOption {
    private final RemoveDuplicatesOptions removeDuplicatesOptions;

    public PostRemoveDuplicatesRequest(RemoveDuplicatesOptions removeDuplicatesOptions) {
        if (removeDuplicatesOptions == null) throw new IllegalArgumentException("removeDuplicatesOptions is required");
        this.removeDuplicatesOptions = removeDuplicatesOptions;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/removeduplicates";
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
        return removeDuplicatesOptions;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
