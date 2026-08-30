package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Convert the workbook from the requested content into files in different formats. */
public class PutConvertWorkbookRequest implements RequestOption {
    private final FormFile file;
    private final String format;

    private String password;
    private String outPath;
    private String storageName;
    private Boolean checkExcelRestriction;
    private String streamFormat;
    private String region;
    private Boolean pageWideFitOnPerSheet;
    private Boolean pageTallFitOnPerSheet;
    private String sheetName;
    private Integer pageIndex;
    private Boolean onePagePerSheet;
    private Boolean autoRowsFit;
    private Boolean autoColumnsFit;
    private String fontsLocation;

    public PutConvertWorkbookRequest(String file, String format) {
        this(FormFile.ofPath(file), format);
    }

    public PutConvertWorkbookRequest(File file, String format) {
        this(FormFile.of(file), format);
    }

    public PutConvertWorkbookRequest(FormFile file, String format) {
        if (file == null) throw new IllegalArgumentException("file is required");
        if (format == null || format.isEmpty()) throw new IllegalArgumentException("format is required");
        this.file = file;
        this.format = format;
    }

    public PutConvertWorkbookRequest(byte[] file, String fileFileName, String format) {
        this(FormFile.of(file, fileFileName), format);
    }

    public PutConvertWorkbookRequest setPassword(String password) { this.password = password; return this; }
    public PutConvertWorkbookRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public PutConvertWorkbookRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public PutConvertWorkbookRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }
    public PutConvertWorkbookRequest setStreamFormat(String streamFormat) { this.streamFormat = streamFormat; return this; }
    public PutConvertWorkbookRequest setRegion(String region) { this.region = region; return this; }
    public PutConvertWorkbookRequest setPageWideFitOnPerSheet(Boolean pageWideFitOnPerSheet) { this.pageWideFitOnPerSheet = pageWideFitOnPerSheet; return this; }
    public PutConvertWorkbookRequest setPageTallFitOnPerSheet(Boolean pageTallFitOnPerSheet) { this.pageTallFitOnPerSheet = pageTallFitOnPerSheet; return this; }
    public PutConvertWorkbookRequest setSheetName(String sheetName) { this.sheetName = sheetName; return this; }
    public PutConvertWorkbookRequest setPageIndex(Integer pageIndex) { this.pageIndex = pageIndex; return this; }
    public PutConvertWorkbookRequest setOnePagePerSheet(Boolean onePagePerSheet) { this.onePagePerSheet = onePagePerSheet; return this; }
    public PutConvertWorkbookRequest setAutoRowsFit(Boolean autoRowsFit) { this.autoRowsFit = autoRowsFit; return this; }
    public PutConvertWorkbookRequest setAutoColumnsFit(Boolean autoColumnsFit) { this.autoColumnsFit = autoColumnsFit; return this; }
    public PutConvertWorkbookRequest setFontsLocation(String fontsLocation) { this.fontsLocation = fontsLocation; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/convert";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("format", format);
        if (password != null && !password.isEmpty()) query.put("password", password);
        if (outPath != null && !outPath.isEmpty()) query.put("outPath", outPath);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
        if (checkExcelRestriction != null) query.put("checkExcelRestriction", String.valueOf(checkExcelRestriction));
        if (streamFormat != null && !streamFormat.isEmpty()) query.put("streamFormat", streamFormat);
        if (region != null && !region.isEmpty()) query.put("region", region);
        if (pageWideFitOnPerSheet != null) query.put("pageWideFitOnPerSheet", String.valueOf(pageWideFitOnPerSheet));
        if (pageTallFitOnPerSheet != null) query.put("pageTallFitOnPerSheet", String.valueOf(pageTallFitOnPerSheet));
        if (sheetName != null && !sheetName.isEmpty()) query.put("sheetName", sheetName);
        if (pageIndex != null) query.put("pageIndex", String.valueOf(pageIndex));
        if (onePagePerSheet != null) query.put("onePagePerSheet", String.valueOf(onePagePerSheet));
        if (autoRowsFit != null) query.put("AutoRowsFit", String.valueOf(autoRowsFit));
        if (autoColumnsFit != null) query.put("AutoColumnsFit", String.valueOf(autoColumnsFit));
        if (fontsLocation != null && !fontsLocation.isEmpty()) query.put("FontsLocation", fontsLocation);
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
        form.put("File", file);
        return form;
    }

    @Override public boolean isBinaryResponse() { return true; }
}
