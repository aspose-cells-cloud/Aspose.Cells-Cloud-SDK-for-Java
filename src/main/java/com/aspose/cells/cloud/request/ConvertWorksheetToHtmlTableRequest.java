package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Converts a worksheet of spreadsheet on a local drive to the HTML table file. */
public class ConvertWorksheetToHtmlTableRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String worksheet;

    private String region;
    private String password;

    public ConvertWorksheetToHtmlTableRequest(String spreadsheet, String worksheet) {
        this(FormFile.ofPath(spreadsheet), worksheet);
    }

    public ConvertWorksheetToHtmlTableRequest(File spreadsheet, String worksheet) {
        this(FormFile.of(spreadsheet), worksheet);
    }

    public ConvertWorksheetToHtmlTableRequest(FormFile spreadsheet, String worksheet) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (worksheet == null || worksheet.isEmpty()) throw new IllegalArgumentException("worksheet is required");
        this.spreadsheet = spreadsheet;
        this.worksheet = worksheet;
    }

    public ConvertWorksheetToHtmlTableRequest(byte[] spreadsheet, String spreadsheetFileName, String worksheet) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), worksheet);
    }

    public ConvertWorksheetToHtmlTableRequest setRegion(String region) { this.region = region; return this; }
    public ConvertWorksheetToHtmlTableRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/convert/worksheet/html-table";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("worksheet", worksheet);
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
