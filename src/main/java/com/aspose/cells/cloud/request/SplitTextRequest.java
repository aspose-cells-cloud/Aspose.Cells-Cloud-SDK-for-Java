package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Indicates performing text segmentation on the specified area according to the segmentation method, and outputting to the designated interval. */
public class SplitTextRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String delimiters;

    private Boolean keepDelimitersInResultingCells;
    private String keepDelimitersPosition;
    private String howToSplit;
    private String outPositionRange;
    private String worksheet;
    private String range;
    private String outPath;
    private String outStorageName;
    private String region;
    private String password;

    public SplitTextRequest(String spreadsheet, String delimiters) {
        this(FormFile.ofPath(spreadsheet), delimiters);
    }

    public SplitTextRequest(File spreadsheet, String delimiters) {
        this(FormFile.of(spreadsheet), delimiters);
    }

    public SplitTextRequest(FormFile spreadsheet, String delimiters) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (delimiters == null || delimiters.isEmpty()) throw new IllegalArgumentException("delimiters is required");
        this.spreadsheet = spreadsheet;
        this.delimiters = delimiters;
    }

    public SplitTextRequest(byte[] spreadsheet, String spreadsheetFileName, String delimiters) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), delimiters);
    }

    public SplitTextRequest setKeepDelimitersInResultingCells(Boolean keepDelimitersInResultingCells) { this.keepDelimitersInResultingCells = keepDelimitersInResultingCells; return this; }
    public SplitTextRequest setKeepDelimitersPosition(String keepDelimitersPosition) { this.keepDelimitersPosition = keepDelimitersPosition; return this; }
    public SplitTextRequest setHowToSplit(String howToSplit) { this.howToSplit = howToSplit; return this; }
    public SplitTextRequest setOutPositionRange(String outPositionRange) { this.outPositionRange = outPositionRange; return this; }
    public SplitTextRequest setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }
    public SplitTextRequest setRange(String range) { this.range = range; return this; }
    public SplitTextRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public SplitTextRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public SplitTextRequest setRegion(String region) { this.region = region; return this; }
    public SplitTextRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/content/split/text";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("delimiters", delimiters);
        if (keepDelimitersInResultingCells != null) query.put("keepDelimitersInResultingCells", String.valueOf(keepDelimitersInResultingCells));
        if (keepDelimitersPosition != null && !keepDelimitersPosition.isEmpty()) query.put("keepDelimitersPosition", keepDelimitersPosition);
        if (howToSplit != null && !howToSplit.isEmpty()) query.put("HowToSplit", howToSplit);
        if (outPositionRange != null && !outPositionRange.isEmpty()) query.put("outPositionRange", outPositionRange);
        if (worksheet != null && !worksheet.isEmpty()) query.put("worksheet", worksheet);
        if (range != null && !range.isEmpty()) query.put("range", range);
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
