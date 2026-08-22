package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.ConvertWorkbookOptions;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** PostConvertWorkbook request. */
public class PostConvertWorkbookRequest implements RequestOption {
    private final ConvertWorkbookOptions convertWorkbookOptions;

    private String fontsLocation;

    public PostConvertWorkbookRequest(ConvertWorkbookOptions convertWorkbookOptions) {
        if (convertWorkbookOptions == null) throw new IllegalArgumentException("convertWorkbookOptions is required");
        this.convertWorkbookOptions = convertWorkbookOptions;
    }

    public PostConvertWorkbookRequest setFontsLocation(String fontsLocation) { this.fontsLocation = fontsLocation; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/convertWorkbook";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (fontsLocation != null && !fontsLocation.isEmpty()) query.put("FontsLocation", fontsLocation);
        return query;
    }

    @Override
    public Map<String, String> getHeaderParameters() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        return headers;
    }

    @Override
    public Object getJsonBody() {
        return convertWorkbookOptions;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
