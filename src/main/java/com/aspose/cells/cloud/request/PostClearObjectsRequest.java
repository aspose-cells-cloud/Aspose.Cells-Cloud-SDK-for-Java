package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Clear internal elements in Excel files and generate output files in various formats. */
public class PostClearObjectsRequest implements RequestOption {
    private final FormFile file;
    private final String objecttype;

    private String sheetname;
    private String outFormat;
    private String password;
    private Boolean checkExcelRestriction;
    private String region;

    public PostClearObjectsRequest(String file, String objecttype) {
        this(FormFile.ofPath(file), objecttype);
    }

    public PostClearObjectsRequest(File file, String objecttype) {
        this(FormFile.of(file), objecttype);
    }

    public PostClearObjectsRequest(FormFile file, String objecttype) {
        if (file == null) throw new IllegalArgumentException("file is required");
        if (objecttype == null || objecttype.isEmpty()) throw new IllegalArgumentException("objecttype is required");
        this.file = file;
        this.objecttype = objecttype;
    }

    public PostClearObjectsRequest(byte[] file, String fileFileName, String objecttype) {
        this(FormFile.of(file, fileFileName), objecttype);
    }

    public PostClearObjectsRequest setSheetname(String sheetname) { this.sheetname = sheetname; return this; }
    public PostClearObjectsRequest setOutFormat(String outFormat) { this.outFormat = outFormat; return this; }
    public PostClearObjectsRequest setPassword(String password) { this.password = password; return this; }
    public PostClearObjectsRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }
    public PostClearObjectsRequest setRegion(String region) { this.region = region; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/clearobjects";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("objecttype", objecttype);
        if (sheetname != null && !sheetname.isEmpty()) query.put("sheetname", sheetname);
        if (outFormat != null && !outFormat.isEmpty()) query.put("outFormat", outFormat);
        if (password != null && !password.isEmpty()) query.put("password", password);
        if (checkExcelRestriction != null) query.put("checkExcelRestriction", String.valueOf(checkExcelRestriction));
        if (region != null && !region.isEmpty()) query.put("region", region);
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
