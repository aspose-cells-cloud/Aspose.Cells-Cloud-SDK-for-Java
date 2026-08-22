package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.CharacterCountOptions;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** PostCharacterCount request. */
public class PostCharacterCountRequest implements RequestOption {
    private final CharacterCountOptions characterCountOptions;

    public PostCharacterCountRequest(CharacterCountOptions characterCountOptions) {
        if (characterCountOptions == null) throw new IllegalArgumentException("characterCountOptions is required");
        this.characterCountOptions = characterCountOptions;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/charactercount";
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
        return characterCountOptions;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
