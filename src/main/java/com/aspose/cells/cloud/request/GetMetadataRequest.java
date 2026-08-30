package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Get cells document properties. */
public class GetMetadataRequest implements RequestOption {
    private final FormFile file;

    private String type;
    private String password;
    private Boolean checkExcelRestriction;

    public GetMetadataRequest(String file) {
        this(FormFile.ofPath(file));
    }

    public GetMetadataRequest(File file) {
        this(FormFile.of(file));
    }

    public GetMetadataRequest(FormFile file) {
        if (file == null) throw new IllegalArgumentException("file is required");
        this.file = file;
    }

    public GetMetadataRequest(byte[] file, String fileFileName) {
        this(FormFile.of(file, fileFileName));
    }

    public GetMetadataRequest setType(String type) { this.type = type; return this; }
    public GetMetadataRequest setPassword(String password) { this.password = password; return this; }
    public GetMetadataRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/metadata/get";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (type != null && !type.isEmpty()) query.put("type", type);
        if (password != null && !password.isEmpty()) query.put("password", password);
        if (checkExcelRestriction != null) query.put("checkExcelRestriction", String.valueOf(checkExcelRestriction));
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
