package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.SaveOptions;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Save an Excel file in various formats. */
public class PostWorkbookSaveAsRequest implements RequestOption {
    private final String name;
    private final String newfilename;

    private SaveOptions saveOptions;
    private Boolean isAutoFitRows;
    private Boolean isAutoFitColumns;
    private String folder;
    private String storageName;
    private String outStorageName;
    private Boolean checkExcelRestriction;
    private String region;
    private Boolean pageWideFitOnPerSheet;
    private Boolean pageTallFitOnPerSheet;
    private Boolean onePagePerSheet;
    private String fontsLocation;

    public PostWorkbookSaveAsRequest(String name, String newfilename) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (newfilename == null || newfilename.isEmpty()) throw new IllegalArgumentException("newfilename is required");
        this.name = name;
        this.newfilename = newfilename;
    }

    public PostWorkbookSaveAsRequest setSaveOptions(SaveOptions saveOptions) { this.saveOptions = saveOptions; return this; }
    public PostWorkbookSaveAsRequest setIsAutoFitRows(Boolean isAutoFitRows) { this.isAutoFitRows = isAutoFitRows; return this; }
    public PostWorkbookSaveAsRequest setIsAutoFitColumns(Boolean isAutoFitColumns) { this.isAutoFitColumns = isAutoFitColumns; return this; }
    public PostWorkbookSaveAsRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorkbookSaveAsRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public PostWorkbookSaveAsRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public PostWorkbookSaveAsRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }
    public PostWorkbookSaveAsRequest setRegion(String region) { this.region = region; return this; }
    public PostWorkbookSaveAsRequest setPageWideFitOnPerSheet(Boolean pageWideFitOnPerSheet) { this.pageWideFitOnPerSheet = pageWideFitOnPerSheet; return this; }
    public PostWorkbookSaveAsRequest setPageTallFitOnPerSheet(Boolean pageTallFitOnPerSheet) { this.pageTallFitOnPerSheet = pageTallFitOnPerSheet; return this; }
    public PostWorkbookSaveAsRequest setOnePagePerSheet(Boolean onePagePerSheet) { this.onePagePerSheet = onePagePerSheet; return this; }
    public PostWorkbookSaveAsRequest setFontsLocation(String fontsLocation) { this.fontsLocation = fontsLocation; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/SaveAs";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("newfilename", newfilename);
        if (isAutoFitRows != null) query.put("isAutoFitRows", String.valueOf(isAutoFitRows));
        if (isAutoFitColumns != null) query.put("isAutoFitColumns", String.valueOf(isAutoFitColumns));
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
        if (outStorageName != null && !outStorageName.isEmpty()) query.put("outStorageName", outStorageName);
        if (checkExcelRestriction != null) query.put("checkExcelRestriction", String.valueOf(checkExcelRestriction));
        if (region != null && !region.isEmpty()) query.put("region", region);
        if (pageWideFitOnPerSheet != null) query.put("pageWideFitOnPerSheet", String.valueOf(pageWideFitOnPerSheet));
        if (pageTallFitOnPerSheet != null) query.put("pageTallFitOnPerSheet", String.valueOf(pageTallFitOnPerSheet));
        if (onePagePerSheet != null) query.put("onePagePerSheet", String.valueOf(onePagePerSheet));
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
        return saveOptions;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
