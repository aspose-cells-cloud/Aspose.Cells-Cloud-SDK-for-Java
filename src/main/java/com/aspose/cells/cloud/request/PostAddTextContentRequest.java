package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.AddTextOptions;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Adds text content to a specified location within a document. It requires an object that defines the text to be added and the insertion location. */
public class PostAddTextContentRequest implements RequestOption {
    private final AddTextOptions addTextOptions;

    public PostAddTextContentRequest(AddTextOptions addTextOptions) {
        if (addTextOptions == null) throw new IllegalArgumentException("addTextOptions is required");
        this.addTextOptions = addTextOptions;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/addtext";
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
        return addTextOptions;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
