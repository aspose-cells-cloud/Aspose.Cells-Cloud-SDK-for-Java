package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.BatchLockRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Batch unlocking files that meet specific matching conditions. */
public class PostBatchUnlockRequest implements RequestOption {
    private final BatchLockRequest batchLockRequest;

    public PostBatchUnlockRequest(BatchLockRequest batchLockRequest) {
        if (batchLockRequest == null) throw new IllegalArgumentException("batchLockRequest is required");
        this.batchLockRequest = batchLockRequest;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/batch/unlock";
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
        return batchLockRequest;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
