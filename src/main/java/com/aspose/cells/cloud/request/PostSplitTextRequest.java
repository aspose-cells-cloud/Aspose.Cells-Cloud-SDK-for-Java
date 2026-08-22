package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.SplitTextOptions;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Efficiently divides Excel cell content into columns or rows based on specified delimiters or patterns. Supports Character-based splitting, Custom string splitting, Mask and wildcard splitting for pattern-based division, Line break division, Column or row splitting, Delimiter removal or retention. */
public class PostSplitTextRequest implements RequestOption {
    private final SplitTextOptions splitTextOptions;

    public PostSplitTextRequest(SplitTextOptions splitTextOptions) {
        if (splitTextOptions == null) throw new IllegalArgumentException("splitTextOptions is required");
        this.splitTextOptions = splitTextOptions;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/splittext";
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
        return splitTextOptions;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
