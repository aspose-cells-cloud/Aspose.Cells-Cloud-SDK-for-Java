package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.BatchSplitRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Batch splitting files that meet specific matching conditions. */
public class PostBatchSplitRequest implements RequestOption {
    private final BatchSplitRequest batchSplitRequest;

    public PostBatchSplitRequest(BatchSplitRequest batchSplitRequest) {
        if (batchSplitRequest == null) throw new IllegalArgumentException("batchSplitRequest is required");
        this.batchSplitRequest = batchSplitRequest;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/batch/split";
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
        return batchSplitRequest;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
