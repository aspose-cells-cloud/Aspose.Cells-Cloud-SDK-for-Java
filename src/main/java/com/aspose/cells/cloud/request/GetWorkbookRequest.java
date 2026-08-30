package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Retrieve workbooks in various formats. */
public class GetWorkbookRequest implements RequestOption {
    private final String name;

    private String format;
    private String password;
    private Boolean isAutoFit;
    private Boolean onlySaveTable;
    private String folder;
    private String outPath;
    private String storageName;
    private String outStorageName;
    private Boolean checkExcelRestriction;
    private String region;
    private Boolean pageWideFitOnPerSheet;
    private Boolean pageTallFitOnPerSheet;
    private Boolean onePagePerSheet;
    private Boolean onlyAutofitTable;
    private String fontsLocation;

    public GetWorkbookRequest(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        this.name = name;
    }

    public GetWorkbookRequest setFormat(String format) { this.format = format; return this; }
    public GetWorkbookRequest setPassword(String password) { this.password = password; return this; }
    public GetWorkbookRequest setIsAutoFit(Boolean isAutoFit) { this.isAutoFit = isAutoFit; return this; }
    public GetWorkbookRequest setOnlySaveTable(Boolean onlySaveTable) { this.onlySaveTable = onlySaveTable; return this; }
    public GetWorkbookRequest setFolder(String folder) { this.folder = folder; return this; }
    public GetWorkbookRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public GetWorkbookRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public GetWorkbookRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public GetWorkbookRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }
    public GetWorkbookRequest setRegion(String region) { this.region = region; return this; }
    public GetWorkbookRequest setPageWideFitOnPerSheet(Boolean pageWideFitOnPerSheet) { this.pageWideFitOnPerSheet = pageWideFitOnPerSheet; return this; }
    public GetWorkbookRequest setPageTallFitOnPerSheet(Boolean pageTallFitOnPerSheet) { this.pageTallFitOnPerSheet = pageTallFitOnPerSheet; return this; }
    public GetWorkbookRequest setOnePagePerSheet(Boolean onePagePerSheet) { this.onePagePerSheet = onePagePerSheet; return this; }
    public GetWorkbookRequest setOnlyAutofitTable(Boolean onlyAutofitTable) { this.onlyAutofitTable = onlyAutofitTable; return this; }
    public GetWorkbookRequest setFontsLocation(String fontsLocation) { this.fontsLocation = fontsLocation; return this; }

    @Override public String getMethod() { return "GET"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name);
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (format != null && !format.isEmpty()) query.put("format", format);
        if (password != null && !password.isEmpty()) query.put("password", password);
        if (isAutoFit != null) query.put("isAutoFit", String.valueOf(isAutoFit));
        if (onlySaveTable != null) query.put("onlySaveTable", String.valueOf(onlySaveTable));
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (outPath != null && !outPath.isEmpty()) query.put("outPath", outPath);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
        if (outStorageName != null && !outStorageName.isEmpty()) query.put("outStorageName", outStorageName);
        if (checkExcelRestriction != null) query.put("checkExcelRestriction", String.valueOf(checkExcelRestriction));
        if (region != null && !region.isEmpty()) query.put("region", region);
        if (pageWideFitOnPerSheet != null) query.put("pageWideFitOnPerSheet", String.valueOf(pageWideFitOnPerSheet));
        if (pageTallFitOnPerSheet != null) query.put("pageTallFitOnPerSheet", String.valueOf(pageTallFitOnPerSheet));
        if (onePagePerSheet != null) query.put("onePagePerSheet", String.valueOf(onePagePerSheet));
        if (onlyAutofitTable != null) query.put("onlyAutofitTable", String.valueOf(onlyAutofitTable));
        if (fontsLocation != null && !fontsLocation.isEmpty()) query.put("FontsLocation", fontsLocation);
        return query;
    }

    @Override
    public Map<String, String> getHeaderParameters() {
        return new HashMap<>();
    }

    @Override
    public Object getJsonBody() {
        return null;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }

    @Override public boolean isBinaryResponse() { return true; }
}
