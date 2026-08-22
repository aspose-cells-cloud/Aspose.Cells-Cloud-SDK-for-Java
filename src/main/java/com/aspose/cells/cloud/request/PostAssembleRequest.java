package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Assemble data files with template files to generate files in various formats. */
public class PostAssembleRequest implements RequestOption {
    private final FormFile file;
    private final String datasource;

    private String outFormat;
    private String password;
    private Boolean checkExcelRestriction;
    private String region;

    public PostAssembleRequest(String file, String datasource) {
        this(FormFile.ofPath(file), datasource);
    }

    public PostAssembleRequest(File file, String datasource) {
        this(FormFile.of(file), datasource);
    }

    public PostAssembleRequest(FormFile file, String datasource) {
        if (file == null) throw new IllegalArgumentException("file is required");
        if (datasource == null || datasource.isEmpty()) throw new IllegalArgumentException("datasource is required");
        this.file = file;
        this.datasource = datasource;
    }

    public PostAssembleRequest(byte[] file, String fileFileName, String datasource) {
        this(FormFile.of(file, fileFileName), datasource);
    }

    public PostAssembleRequest setOutFormat(String outFormat) { this.outFormat = outFormat; return this; }
    public PostAssembleRequest setPassword(String password) { this.password = password; return this; }
    public PostAssembleRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }
    public PostAssembleRequest setRegion(String region) { this.region = region; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/assemble";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("datasource", datasource);
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
