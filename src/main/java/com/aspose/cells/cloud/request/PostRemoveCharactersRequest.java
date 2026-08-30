package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.RemoveCharactersOptions;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** A comprehensive set of tools for cleaning text content within selected cells. It allows users to remove specific characters, character sets, and substrings, ensuring that the text is standardized and free from unwanted symbols or sequences. */
public class PostRemoveCharactersRequest implements RequestOption {
    private final RemoveCharactersOptions removeCharactersOptions;

    public PostRemoveCharactersRequest(RemoveCharactersOptions removeCharactersOptions) {
        if (removeCharactersOptions == null) throw new IllegalArgumentException("removeCharactersOptions is required");
        this.removeCharactersOptions = removeCharactersOptions;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/removecharacters";
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
        return removeCharactersOptions;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
