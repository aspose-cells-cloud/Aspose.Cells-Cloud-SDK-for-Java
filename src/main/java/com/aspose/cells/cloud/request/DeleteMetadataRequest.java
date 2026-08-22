package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Delete cells document properties in Excel file, and save them is various formats. */
public class DeleteMetadataRequest implements RequestOption {
    private final FormFile file;

    private String type;
    private String outFormat;
    private String password;
    private Boolean checkExcelRestriction;

    public DeleteMetadataRequest(String file) {
        this(FormFile.ofPath(file));
    }

    public DeleteMetadataRequest(File file) {
        this(FormFile.of(file));
    }

    public DeleteMetadataRequest(FormFile file) {
        if (file == null) throw new IllegalArgumentException("file is required");
        this.file = file;
    }

    public DeleteMetadataRequest(byte[] file, String fileFileName) {
        this(FormFile.of(file, fileFileName));
    }

    public DeleteMetadataRequest setType(String type) { this.type = type; return this; }
    public DeleteMetadataRequest setOutFormat(String outFormat) { this.outFormat = outFormat; return this; }
    public DeleteMetadataRequest setPassword(String password) { this.password = password; return this; }
    public DeleteMetadataRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/metadata/delete";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (type != null && !type.isEmpty()) query.put("type", type);
        if (outFormat != null && !outFormat.isEmpty()) query.put("outFormat", outFormat);
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
