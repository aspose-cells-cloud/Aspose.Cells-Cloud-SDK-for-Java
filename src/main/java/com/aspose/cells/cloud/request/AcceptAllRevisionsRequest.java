package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** AcceptAllRevisions request. */
public class AcceptAllRevisionsRequest implements RequestOption {
    private final FormFile spreadsheet;

    private String outPath;
    private String outStorageName;
    private String fontsLocation;
    private String region;
    private String password;

    public AcceptAllRevisionsRequest(String spreadsheet) {
        this(FormFile.ofPath(spreadsheet));
    }

    public AcceptAllRevisionsRequest(File spreadsheet) {
        this(FormFile.of(spreadsheet));
    }

    public AcceptAllRevisionsRequest(FormFile spreadsheet) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        this.spreadsheet = spreadsheet;
    }

    public AcceptAllRevisionsRequest(byte[] spreadsheet, String spreadsheetFileName) {
        this(FormFile.of(spreadsheet, spreadsheetFileName));
    }

    public AcceptAllRevisionsRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public AcceptAllRevisionsRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public AcceptAllRevisionsRequest setFontsLocation(String fontsLocation) { this.fontsLocation = fontsLocation; return this; }
    public AcceptAllRevisionsRequest setRegion(String region) { this.region = region; return this; }
    public AcceptAllRevisionsRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/spreadsheet/accept-all-revisions";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (outPath != null && !outPath.isEmpty()) query.put("outPath", outPath);
        if (outStorageName != null && !outStorageName.isEmpty()) query.put("outStorageName", outStorageName);
        if (fontsLocation != null && !fontsLocation.isEmpty()) query.put("fontsLocation", fontsLocation);
        if (region != null && !region.isEmpty()) query.put("region", region);
        if (password != null && !password.isEmpty()) query.put("password", password);
        return query;
    }

    @Override
    public Map<String, String> getHeaderParameters() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "multipart/form-data");
        return headers;
    }

    @Override
    public Object getJsonBody() {
        return null;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        Map<String, Object> form = new HashMap<>();
        form.put("Spreadsheet", spreadsheet);
        return form;
    }
}
