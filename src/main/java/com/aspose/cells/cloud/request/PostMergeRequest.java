package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Merge cells in the worksheet. */
public class PostMergeRequest implements RequestOption {
    private final FormFile file;

    private String outFormat;
    private Boolean mergeToOneSheet;
    private String password;
    private Boolean checkExcelRestriction;
    private String region;

    public PostMergeRequest(String file) {
        this(FormFile.ofPath(file));
    }

    public PostMergeRequest(File file) {
        this(FormFile.of(file));
    }

    public PostMergeRequest(FormFile file) {
        if (file == null) throw new IllegalArgumentException("file is required");
        this.file = file;
    }

    public PostMergeRequest(byte[] file, String fileFileName) {
        this(FormFile.of(file, fileFileName));
    }

    public PostMergeRequest setOutFormat(String outFormat) { this.outFormat = outFormat; return this; }
    public PostMergeRequest setMergeToOneSheet(Boolean mergeToOneSheet) { this.mergeToOneSheet = mergeToOneSheet; return this; }
    public PostMergeRequest setPassword(String password) { this.password = password; return this; }
    public PostMergeRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }
    public PostMergeRequest setRegion(String region) { this.region = region; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/merge";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (outFormat != null && !outFormat.isEmpty()) query.put("outFormat", outFormat);
        if (mergeToOneSheet != null) query.put("mergeToOneSheet", String.valueOf(mergeToOneSheet));
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
