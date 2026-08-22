package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Compress files and generate target files in various formats, supported file formats are include Xls, Xlsx, Xlsm, Xlsb, Ods and more. */
public class PostCompressRequest implements RequestOption {
    private final FormFile file;

    private Integer compressLevel;
    private String password;
    private Boolean checkExcelRestriction;

    public PostCompressRequest(String file) {
        this(FormFile.ofPath(file));
    }

    public PostCompressRequest(File file) {
        this(FormFile.of(file));
    }

    public PostCompressRequest(FormFile file) {
        if (file == null) throw new IllegalArgumentException("file is required");
        this.file = file;
    }

    public PostCompressRequest(byte[] file, String fileFileName) {
        this(FormFile.of(file, fileFileName));
    }

    public PostCompressRequest setCompressLevel(Integer compressLevel) { this.compressLevel = compressLevel; return this; }
    public PostCompressRequest setPassword(String password) { this.password = password; return this; }
    public PostCompressRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/compress";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (compressLevel != null) query.put("CompressLevel", String.valueOf(compressLevel));
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
