package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.WordCaseOptions;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Managing inconsistent text case in spreadsheets (Excel, Google Sheets, CSV) can be frustrating, especially with large datasets. The PostUpdateWordCase WEB API solves this by automating text case conversions, ensuring clean and standardized data. */
public class PostUpdateWordCaseRequest implements RequestOption {
    private final WordCaseOptions wordCaseOptions;

    public PostUpdateWordCaseRequest(WordCaseOptions wordCaseOptions) {
        if (wordCaseOptions == null) throw new IllegalArgumentException("wordCaseOptions is required");
        this.wordCaseOptions = wordCaseOptions;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/updatewordcase";
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
        return wordCaseOptions;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
