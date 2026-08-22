package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.CheckExternalReferenceOptions;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Export Excel internal elements or the workbook itself to various format files. */
public class CheckWrokbookExternalReferenceRequest implements RequestOption {
    private final CheckExternalReferenceOptions checkExternalReferenceOptions;

    public CheckWrokbookExternalReferenceRequest(CheckExternalReferenceOptions checkExternalReferenceOptions) {
        if (checkExternalReferenceOptions == null) throw new IllegalArgumentException("checkExternalReferenceOptions is required");
        this.checkExternalReferenceOptions = checkExternalReferenceOptions;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/checkexternalreference";
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
        return checkExternalReferenceOptions;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
