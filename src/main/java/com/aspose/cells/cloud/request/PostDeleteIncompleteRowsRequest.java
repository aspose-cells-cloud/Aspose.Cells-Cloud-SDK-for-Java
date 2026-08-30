package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.DeleteIncompleteRowsRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Deleting incomplete rows of spreadsheet files is mainly used to eliminate incomplete rows in tables and ranges. */
public class PostDeleteIncompleteRowsRequest implements RequestOption {
    private final DeleteIncompleteRowsRequest deleteIncompleteRowsRequest;

    public PostDeleteIncompleteRowsRequest(DeleteIncompleteRowsRequest deleteIncompleteRowsRequest) {
        if (deleteIncompleteRowsRequest == null) throw new IllegalArgumentException("deleteIncompleteRowsRequest is required");
        this.deleteIncompleteRowsRequest = deleteIncompleteRowsRequest;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/deleteincompleterows";
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
        return deleteIncompleteRowsRequest;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
