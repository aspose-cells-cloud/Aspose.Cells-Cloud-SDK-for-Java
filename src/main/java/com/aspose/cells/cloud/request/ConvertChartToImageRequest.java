package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Converts a chart of spreadsheet on a local drive to image. */
public class ConvertChartToImageRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String worksheet;
    private final Integer chartIndex;
    private final String format;

    private String outPath;
    private String outStorageName;
    private String fontsLocation;
    private String region;
    private String password;

    public ConvertChartToImageRequest(String spreadsheet, String worksheet, Integer chartIndex, String format) {
        this(FormFile.ofPath(spreadsheet), worksheet, chartIndex, format);
    }

    public ConvertChartToImageRequest(File spreadsheet, String worksheet, Integer chartIndex, String format) {
        this(FormFile.of(spreadsheet), worksheet, chartIndex, format);
    }

    public ConvertChartToImageRequest(FormFile spreadsheet, String worksheet, Integer chartIndex, String format) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (worksheet == null || worksheet.isEmpty()) throw new IllegalArgumentException("worksheet is required");
        if (chartIndex == null) throw new IllegalArgumentException("chartIndex is required");
        if (format == null || format.isEmpty()) throw new IllegalArgumentException("format is required");
        this.spreadsheet = spreadsheet;
        this.worksheet = worksheet;
        this.chartIndex = chartIndex;
        this.format = format;
    }

    public ConvertChartToImageRequest(byte[] spreadsheet, String spreadsheetFileName, String worksheet, Integer chartIndex, String format) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), worksheet, chartIndex, format);
    }

    public ConvertChartToImageRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public ConvertChartToImageRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public ConvertChartToImageRequest setFontsLocation(String fontsLocation) { this.fontsLocation = fontsLocation; return this; }
    public ConvertChartToImageRequest setRegion(String region) { this.region = region; return this; }
    public ConvertChartToImageRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/convert/chart/image";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("worksheet", worksheet);
        query.put("chartIndex", String.valueOf(chartIndex));
        query.put("format", format);
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
