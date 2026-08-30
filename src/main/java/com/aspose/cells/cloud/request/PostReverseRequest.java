package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Reverse rows or columns in Excel files and create output files in various formats. */
public class PostReverseRequest implements RequestOption {
    private final FormFile file;
    private final String rotateType;

    private String outFormat;
    private String password;
    private Boolean checkExcelRestriction;
    private String region;

    public PostReverseRequest(String file, String rotateType) {
        this(FormFile.ofPath(file), rotateType);
    }

    public PostReverseRequest(File file, String rotateType) {
        this(FormFile.of(file), rotateType);
    }

    public PostReverseRequest(FormFile file, String rotateType) {
        if (file == null) throw new IllegalArgumentException("file is required");
        if (rotateType == null || rotateType.isEmpty()) throw new IllegalArgumentException("rotateType is required");
        this.file = file;
        this.rotateType = rotateType;
    }

    public PostReverseRequest(byte[] file, String fileFileName, String rotateType) {
        this(FormFile.of(file, fileFileName), rotateType);
    }

    public PostReverseRequest setOutFormat(String outFormat) { this.outFormat = outFormat; return this; }
    public PostReverseRequest setPassword(String password) { this.password = password; return this; }
    public PostReverseRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }
    public PostReverseRequest setRegion(String region) { this.region = region; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/reverse";
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
