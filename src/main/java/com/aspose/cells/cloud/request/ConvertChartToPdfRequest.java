package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Converts a chart of spreadsheet on a local drive to pdf. */
public class ConvertChartToPdfRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String worksheet;
    private final Integer chartIndex;

    private String outPath;
    private String outStorageName;
    private String fontsLocation;
    private String region;
    private String password;

    public ConvertChartToPdfRequest(String spreadsheet, String worksheet, Integer chartIndex) {
        this(FormFile.ofPath(spreadsheet), worksheet, chartIndex);
    }

    public ConvertChartToPdfRequest(File spreadsheet, String worksheet, Integer chartIndex) {
        this(FormFile.of(spreadsheet), worksheet, chartIndex);
    }

    public ConvertChartToPdfRequest(FormFile spreadsheet, String worksheet, Integer chartIndex) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (worksheet == null || worksheet.isEmpty()) throw new IllegalArgumentException("worksheet is required");
        if (chartIndex == null) throw new IllegalArgumentException("chartIndex is required");
        this.spreadsheet = spreadsheet;
        this.worksheet = worksheet;
        this.chartIndex = chartIndex;
    }

    public ConvertChartToPdfRequest(byte[] spreadsheet, String spreadsheetFileName, String worksheet, Integer chartIndex) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), worksheet, chartIndex);
    }

    public ConvertChartToPdfRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public ConvertChartToPdfRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public ConvertChartToPdfRequest setFontsLocation(String fontsLocation) { this.fontsLocation = fontsLocation; return this; }
    public ConvertChartToPdfRequest setRegion(String region) { this.region = region; return this; }
    public ConvertChartToPdfRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/convert/chart/pdf";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("worksheet", worksheet);
        query.put("chartIndex", String.valueOf(chartIndex));
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
