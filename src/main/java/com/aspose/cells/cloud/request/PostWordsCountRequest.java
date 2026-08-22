package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.WordsCountOptions;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** PostWordsCount request. */
public class PostWordsCountRequest implements RequestOption {
    private final WordsCountOptions wordsCountOptions;

    public PostWordsCountRequest(WordsCountOptions wordsCountOptions) {
        if (wordsCountOptions == null) throw new IllegalArgumentException("wordsCountOptions is required");
        this.wordsCountOptions = wordsCountOptions;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/wordscount";
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
        return wordsCountOptions;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
