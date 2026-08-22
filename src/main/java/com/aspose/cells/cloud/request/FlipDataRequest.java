package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Transposes a specified data range (rows become columns, columns become rows). */
public class FlipDataRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String worksheet;
    private final String cellArea;

    private Boolean horizontal;
    private String outPath;
    private String outStorageName;
    private String region;
    private String password;

    public FlipDataRequest(String spreadsheet, String worksheet, String cellArea) {
        this(FormFile.ofPath(spreadsheet), worksheet, cellArea);
    }

    public FlipDataRequest(File spreadsheet, String worksheet, String cellArea) {
        this(FormFile.of(spreadsheet), worksheet, cellArea);
    }

    public FlipDataRequest(FormFile spreadsheet, String worksheet, String cellArea) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (worksheet == null || worksheet.isEmpty()) throw new IllegalArgumentException("worksheet is required");
        if (cellArea == null || cellArea.isEmpty()) throw new IllegalArgumentException("cellArea is required");
        this.spreadsheet = spreadsheet;
        this.worksheet = worksheet;
        this.cellArea = cellArea;
    }

    public FlipDataRequest(byte[] spreadsheet, String spreadsheetFileName, String worksheet, String cellArea) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), worksheet, cellArea);
    }

    public FlipDataRequest setHorizontal(Boolean horizontal) { this.horizontal = horizontal; return this; }
    public FlipDataRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public FlipDataRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public FlipDataRequest setRegion(String region) { this.region = region; return this; }
    public FlipDataRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/flip";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("worksheet", worksheet);
        query.put("cellArea", cellArea);
        if (horizontal != null) query.put("Horizontal", String.valueOf(horizontal));
        if (outPath != null && !outPath.isEmpty()) query.put("outPath", outPath);
        if (outStorageName != null && !outStorageName.isEmpty()) query.put("outStorageName", outStorageName);
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
