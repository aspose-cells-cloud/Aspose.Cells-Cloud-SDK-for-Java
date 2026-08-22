package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.TrimContentOptions;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** The PostTrimContent API is designed to process and trim content within a specified range in a spreadsheet. This API allows users to remove extra spaces, line breaks, or other unnecessary characters from the content of selected cells. It is particularly useful for cleaning up data entries and ensuring consistency in spreadsheet formatting */
public class PostTrimContentRequest implements RequestOption {
    private final TrimContentOptions trimContentOptions;

    public PostTrimContentRequest(TrimContentOptions trimContentOptions) {
        if (trimContentOptions == null) throw new IllegalArgumentException("trimContentOptions is required");
        this.trimContentOptions = trimContentOptions;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/trimcontent";
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
        return trimContentOptions;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
