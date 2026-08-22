package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.DataTransformationRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Transform spreadsheet data is mainly used to pivot columns, unpivot columns. */
public class PostDataTransformationRequest implements RequestOption {
    private final DataTransformationRequest dataTransformationRequest;

    public PostDataTransformationRequest(DataTransformationRequest dataTransformationRequest) {
        if (dataTransformationRequest == null) throw new IllegalArgumentException("dataTransformationRequest is required");
        this.dataTransformationRequest = dataTransformationRequest;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/datatransformation";
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
        return dataTransformationRequest;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
