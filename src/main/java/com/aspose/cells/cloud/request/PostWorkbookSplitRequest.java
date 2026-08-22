package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Split the workbook with a specific format. */
public class PostWorkbookSplitRequest implements RequestOption {
    private final String name;

    private String format;
    private String outFolder;
    private Integer from;
    private Integer to;
    private Integer horizontalResolution;
    private Integer verticalResolution;
    private String splitNameRule;
    private String folder;
    private String storageName;
    private String outStorageName;

    public PostWorkbookSplitRequest(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        this.name = name;
    }

    public PostWorkbookSplitRequest setFormat(String format) { this.format = format; return this; }
    public PostWorkbookSplitRequest setOutFolder(String outFolder) { this.outFolder = outFolder; return this; }
    public PostWorkbookSplitRequest setFrom(Integer from) { this.from = from; return this; }
    public PostWorkbookSplitRequest setTo(Integer to) { this.to = to; return this; }
    public PostWorkbookSplitRequest setHorizontalResolution(Integer horizontalResolution) { this.horizontalResolution = horizontalResolution; return this; }
    public PostWorkbookSplitRequest setVerticalResolution(Integer verticalResolution) { this.verticalResolution = verticalResolution; return this; }
    public PostWorkbookSplitRequest setSplitNameRule(String splitNameRule) { this.splitNameRule = splitNameRule; return this; }
    public PostWorkbookSplitRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorkbookSplitRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public PostWorkbookSplitRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/split";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (format != null && !format.isEmpty()) query.put("format", format);
        if (outFolder != null && !outFolder.isEmpty()) query.put("outFolder", outFolder);
        if (from != null) query.put("from", String.valueOf(from));
        if (to != null) query.put("to", String.valueOf(to));
        if (horizontalResolution != null) query.put("horizontalResolution", String.valueOf(horizontalResolution));
        if (verticalResolution != null) query.put("verticalResolution", String.valueOf(verticalResolution));
        if (splitNameRule != null && !splitNameRule.isEmpty()) query.put("splitNameRule", splitNameRule);
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
        if (outStorageName != null && !outStorageName.isEmpty()) query.put("outStorageName", outStorageName);
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
