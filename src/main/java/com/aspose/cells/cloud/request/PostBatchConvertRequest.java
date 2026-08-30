package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.BatchConvertRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Batch converting files that meet specific matching conditions. */
public class PostBatchConvertRequest implements RequestOption {
    private final BatchConvertRequest batchConvertRequest;

    public PostBatchConvertRequest(BatchConvertRequest batchConvertRequest) {
        if (batchConvertRequest == null) throw new IllegalArgumentException("batchConvertRequest is required");
        this.batchConvertRequest = batchConvertRequest;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/batch/convert";
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
        return batchConvertRequest;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }

    @Override public boolean isBinaryResponse() { return true; }
}
