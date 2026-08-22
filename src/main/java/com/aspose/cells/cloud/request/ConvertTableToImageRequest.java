package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Converts a table of spreadsheet on a local drive to the image file. */
public class ConvertTableToImageRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String worksheet;
    private final String tableName;
    private final String format;

    private String outPath;
    private String outStorageName;
    private String fontsLocation;
    private Boolean autoRowsFit;
    private Boolean autoColumnsFit;
    private String region;
    private String password;

    public ConvertTableToImageRequest(String spreadsheet, String worksheet, String tableName, String format) {
        this(FormFile.ofPath(spreadsheet), worksheet, tableName, format);
    }

    public ConvertTableToImageRequest(File spreadsheet, String worksheet, String tableName, String format) {
        this(FormFile.of(spreadsheet), worksheet, tableName, format);
    }

    public ConvertTableToImageRequest(FormFile spreadsheet, String worksheet, String tableName, String format) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (worksheet == null || worksheet.isEmpty()) throw new IllegalArgumentException("worksheet is required");
        if (tableName == null || tableName.isEmpty()) throw new IllegalArgumentException("tableName is required");
        if (format == null || format.isEmpty()) throw new IllegalArgumentException("format is required");
        this.spreadsheet = spreadsheet;
        this.worksheet = worksheet;
        this.tableName = tableName;
        this.format = format;
    }

    public ConvertTableToImageRequest(byte[] spreadsheet, String spreadsheetFileName, String worksheet, String tableName, String format) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), worksheet, tableName, format);
    }

    public ConvertTableToImageRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public ConvertTableToImageRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public ConvertTableToImageRequest setFontsLocation(String fontsLocation) { this.fontsLocation = fontsLocation; return this; }
    public ConvertTableToImageRequest setAutoRowsFit(Boolean autoRowsFit) { this.autoRowsFit = autoRowsFit; return this; }
    public ConvertTableToImageRequest setAutoColumnsFit(Boolean autoColumnsFit) { this.autoColumnsFit = autoColumnsFit; return this; }
    public ConvertTableToImageRequest setRegion(String region) { this.region = region; return this; }
    public ConvertTableToImageRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/convert/table/image";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("worksheet", worksheet);
        query.put("tableName", tableName);
        query.put("format", format);
        if (outPath != null && !outPath.isEmpty()) query.put("outPath", outPath);
        if (outStorageName != null && !outStorageName.isEmpty()) query.put("outStorageName", outStorageName);
        if (fontsLocation != null && !fontsLocation.isEmpty()) query.put("fontsLocation", fontsLocation);
        if (autoRowsFit != null) query.put("AutoRowsFit", String.valueOf(autoRowsFit));
        if (autoColumnsFit != null) query.put("AutoColumnsFit", String.valueOf(autoColumnsFit));
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
