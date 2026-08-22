package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.SpecifyWordsCountOptions;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** PostSpecifyWordsCount request. */
public class PostSpecifyWordsCountRequest implements RequestOption {
    private final SpecifyWordsCountOptions specifyWordsCountOptions;

    public PostSpecifyWordsCountRequest(SpecifyWordsCountOptions specifyWordsCountOptions) {
        if (specifyWordsCountOptions == null) throw new IllegalArgumentException("specifyWordsCountOptions is required");
        this.specifyWordsCountOptions = specifyWordsCountOptions;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/specifywordscount";
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
        return specifyWordsCountOptions;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
