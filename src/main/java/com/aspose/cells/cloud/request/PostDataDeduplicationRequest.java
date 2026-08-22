package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.DataDeduplicationRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Data deduplication of spreadsheet files is mainly used to eliminate duplicate data in tables and ranges. */
public class PostDataDeduplicationRequest implements RequestOption {
    private final DataDeduplicationRequest dataDeduplicationRequest;

    public PostDataDeduplicationRequest(DataDeduplicationRequest dataDeduplicationRequest) {
        if (dataDeduplicationRequest == null) throw new IllegalArgumentException("dataDeduplicationRequest is required");
        this.dataDeduplicationRequest = dataDeduplicationRequest;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/datadeduplication";
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
        return dataDeduplicationRequest;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
