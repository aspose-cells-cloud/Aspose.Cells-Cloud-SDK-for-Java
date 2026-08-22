package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.DataCleansingRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Data cleansing of spreadsheet files is a data management process used to identify, correct, and remove errors, incompleteness, duplicates, or inaccuracies in tables and ranges. */
public class PostDataCleansingRequest implements RequestOption {
    private final DataCleansingRequest dataCleansingRequest;

    public PostDataCleansingRequest(DataCleansingRequest dataCleansingRequest) {
        if (dataCleansingRequest == null) throw new IllegalArgumentException("dataCleansingRequest is required");
        this.dataCleansingRequest = dataCleansingRequest;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/datacleansing";
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
        return dataCleansingRequest;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
