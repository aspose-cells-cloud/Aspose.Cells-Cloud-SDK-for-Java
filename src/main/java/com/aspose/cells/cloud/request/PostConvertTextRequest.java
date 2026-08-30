package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.ConvertTextOptions;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Enhance Excel data through essential text conversions: convert text to numbers, replace characters and line breaks, and remove accents. */
public class PostConvertTextRequest implements RequestOption {
    private final ConvertTextOptions convertTextOptions;

    public PostConvertTextRequest(ConvertTextOptions convertTextOptions) {
        if (convertTextOptions == null) throw new IllegalArgumentException("convertTextOptions is required");
        this.convertTextOptions = convertTextOptions;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/converttext";
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
        return convertTextOptions;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
