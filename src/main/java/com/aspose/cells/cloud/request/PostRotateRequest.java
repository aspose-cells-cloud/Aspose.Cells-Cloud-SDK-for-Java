package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Rotate rows, columns, or other objects in Excel files and save them in various formats. */
public class PostRotateRequest implements RequestOption {
    private final FormFile file;
    private final String rotateType;

    private String outFormat;
    private String password;
    private Boolean checkExcelRestriction;
    private String region;

    public PostRotateRequest(String file, String rotateType) {
        this(FormFile.ofPath(file), rotateType);
    }

    public PostRotateRequest(File file, String rotateType) {
        this(FormFile.of(file), rotateType);
    }

    public PostRotateRequest(FormFile file, String rotateType) {
        if (file == null) throw new IllegalArgumentException("file is required");
        if (rotateType == null || rotateType.isEmpty()) throw new IllegalArgumentException("rotateType is required");
        this.file = file;
        this.rotateType = rotateType;
    }

    public PostRotateRequest(byte[] file, String fileFileName, String rotateType) {
        this(FormFile.of(file, fileFileName), rotateType);
    }

    public PostRotateRequest setOutFormat(String outFormat) { this.outFormat = outFormat; return this; }
    public PostRotateRequest setPassword(String password) { this.password = password; return this; }
    public PostRotateRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }
    public PostRotateRequest setRegion(String region) { this.region = region; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/rotate";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("rotateType", rotateType);
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
