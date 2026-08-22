package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Merge spreadsheet files in folder of cloud storage into a specified format file. */
public class MergeSpreadsheetsInRemoteFolderRequest implements RequestOption {
    private final String folder;

    private String fileMatchExpression;
    private String outFormat;
    private Boolean mergeInOneSheet;
    private String storageName;
    private String outPath;
    private String outStorageName;
    private String fontsLocation;
    private String region;
    private String password;

    public MergeSpreadsheetsInRemoteFolderRequest(String folder) {
        if (folder == null || folder.isEmpty()) throw new IllegalArgumentException("folder is required");
        this.folder = folder;
    }

    public MergeSpreadsheetsInRemoteFolderRequest setFileMatchExpression(String fileMatchExpression) { this.fileMatchExpression = fileMatchExpression; return this; }
    public MergeSpreadsheetsInRemoteFolderRequest setOutFormat(String outFormat) { this.outFormat = outFormat; return this; }
    public MergeSpreadsheetsInRemoteFolderRequest setMergeInOneSheet(Boolean mergeInOneSheet) { this.mergeInOneSheet = mergeInOneSheet; return this; }
    public MergeSpreadsheetsInRemoteFolderRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public MergeSpreadsheetsInRemoteFolderRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public MergeSpreadsheetsInRemoteFolderRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public MergeSpreadsheetsInRemoteFolderRequest setFontsLocation(String fontsLocation) { this.fontsLocation = fontsLocation; return this; }
    public MergeSpreadsheetsInRemoteFolderRequest setRegion(String region) { this.region = region; return this; }
    public MergeSpreadsheetsInRemoteFolderRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/merge/remote-spreadsheets";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("folder", folder);
        if (fileMatchExpression != null && !fileMatchExpression.isEmpty()) query.put("fileMatchExpression", fileMatchExpression);
        if (outFormat != null && !outFormat.isEmpty()) query.put("outFormat", outFormat);
        if (mergeInOneSheet != null) query.put("mergeInOneSheet", String.valueOf(mergeInOneSheet));
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
        if (outPath != null && !outPath.isEmpty()) query.put("outPath", outPath);
        if (outStorageName != null && !outStorageName.isEmpty()) query.put("outStorageName", outStorageName);
        if (fontsLocation != null && !fontsLocation.isEmpty()) query.put("fontsLocation", fontsLocation);
        if (region != null && !region.isEmpty()) query.put("region", region);
        if (password != null && !password.isEmpty()) query.put("password", password);
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
}
