package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.TextWaterMarkerRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Set water marker in the workbook. */
public class PutWorkbookWaterMarkerRequest implements RequestOption {
    private final String name;
    private final TextWaterMarkerRequest textWaterMarkerRequest;

    private String folder;
    private String storageName;

    public PutWorkbookWaterMarkerRequest(String name, TextWaterMarkerRequest textWaterMarkerRequest) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (textWaterMarkerRequest == null) throw new IllegalArgumentException("textWaterMarkerRequest is required");
        this.name = name;
        this.textWaterMarkerRequest = textWaterMarkerRequest;
    }

    public PutWorkbookWaterMarkerRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutWorkbookWaterMarkerRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/watermarker";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
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
        return textWaterMarkerRequest;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
