package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.ConvertWorksheetOptions;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** PostConvertWorksheetToImage request. */
public class PostConvertWorksheetToImageRequest implements RequestOption {
    private final ConvertWorksheetOptions convertWorksheetOptions;

    private String fontsLocation;

    public PostConvertWorksheetToImageRequest(ConvertWorksheetOptions convertWorksheetOptions) {
        if (convertWorksheetOptions == null) throw new IllegalArgumentException("convertWorksheetOptions is required");
        this.convertWorksheetOptions = convertWorksheetOptions;
    }

    public PostConvertWorksheetToImageRequest setFontsLocation(String fontsLocation) { this.fontsLocation = fontsLocation; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/convertWorksheetToImage";
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
        return convertWorksheetOptions;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
