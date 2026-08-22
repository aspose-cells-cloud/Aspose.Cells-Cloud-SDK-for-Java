package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.DataFillRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Data filling for spreadsheet files is primarily used to fill empty data in tables and ranges. */
public class PostDataFillRequest implements RequestOption {
    private final DataFillRequest dataFillRequest;

    public PostDataFillRequest(DataFillRequest dataFillRequest) {
        if (dataFillRequest == null) throw new IllegalArgumentException("dataFillRequest is required");
        this.dataFillRequest = dataFillRequest;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/datafill";
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
        return dataFillRequest;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
