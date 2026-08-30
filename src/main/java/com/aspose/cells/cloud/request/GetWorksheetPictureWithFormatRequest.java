package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Retrieve a picture by number in the worksheet. */
public class GetWorksheetPictureWithFormatRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer pictureNumber;
    private final String format;

    private String folder;
    private String storageName;

    public GetWorksheetPictureWithFormatRequest(String name, String sheetName, Integer pictureNumber, String format) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (pictureNumber == null) throw new IllegalArgumentException("pictureNumber is required");
        if (format == null || format.isEmpty()) throw new IllegalArgumentException("format is required");
        this.name = name;
        this.sheetName = sheetName;
        this.pictureNumber = pictureNumber;
        this.format = format;
    }

    public GetWorksheetPictureWithFormatRequest setFolder(String folder) { this.folder = folder; return this; }
    public GetWorksheetPictureWithFormatRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "GET"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/pictures/" + urlEncode(String.valueOf(pictureNumber));
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("format", format);
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
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
