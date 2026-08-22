package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.BatchProtectRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Batch protecting files that meet specific matching conditions. */
public class PostBatchProtectRequest implements RequestOption {
    private final BatchProtectRequest batchProtectRequest;

    public PostBatchProtectRequest(BatchProtectRequest batchProtectRequest) {
        if (batchProtectRequest == null) throw new IllegalArgumentException("batchProtectRequest is required");
        this.batchProtectRequest = batchProtectRequest;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/batch/protect";
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
        return batchProtectRequest;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
