package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Export Excel internal elements or the workbook itself to various format files. */
public class PostExportRequest implements RequestOption {
    private final FormFile file;

    private String objectType;
    private String format;
    private String password;
    private Boolean checkExcelRestriction;
    private String region;
    private String fontsLocation;

    public PostExportRequest(String file) {
        this(FormFile.ofPath(file));
    }

    public PostExportRequest(File file) {
        this(FormFile.of(file));
    }

    public PostExportRequest(FormFile file) {
        if (file == null) throw new IllegalArgumentException("file is required");
        this.file = file;
    }

    public PostExportRequest(byte[] file, String fileFileName) {
        this(FormFile.of(file, fileFileName));
    }

    public PostExportRequest setObjectType(String objectType) { this.objectType = objectType; return this; }
    public PostExportRequest setFormat(String format) { this.format = format; return this; }
    public PostExportRequest setPassword(String password) { this.password = password; return this; }
    public PostExportRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }
    public PostExportRequest setRegion(String region) { this.region = region; return this; }
    public PostExportRequest setFontsLocation(String fontsLocation) { this.fontsLocation = fontsLocation; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/export";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (objectType != null && !objectType.isEmpty()) query.put("objectType", objectType);
        if (format != null && !format.isEmpty()) query.put("format", format);
        if (password != null && !password.isEmpty()) query.put("password", password);
        if (checkExcelRestriction != null) query.put("checkExcelRestriction", String.valueOf(checkExcelRestriction));
        if (region != null && !region.isEmpty()) query.put("region", region);
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
}
