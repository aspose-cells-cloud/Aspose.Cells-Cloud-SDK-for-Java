package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Split Excel spreadsheet files based on worksheets and create output files in various formats. */
public class PostSplitRequest implements RequestOption {
    private final FormFile file;
    private final String outFormat;

    private String password;
    private Integer from;
    private Integer to;
    private Boolean checkExcelRestriction;
    private String region;

    public PostSplitRequest(String file, String outFormat) {
        this(FormFile.ofPath(file), outFormat);
    }

    public PostSplitRequest(File file, String outFormat) {
        this(FormFile.of(file), outFormat);
    }

    public PostSplitRequest(FormFile file, String outFormat) {
        if (file == null) throw new IllegalArgumentException("file is required");
        if (outFormat == null || outFormat.isEmpty()) throw new IllegalArgumentException("outFormat is required");
        this.file = file;
        this.outFormat = outFormat;
    }

    public PostSplitRequest(byte[] file, String fileFileName, String outFormat) {
        this(FormFile.of(file, fileFileName), outFormat);
    }

    public PostSplitRequest setPassword(String password) { this.password = password; return this; }
    public PostSplitRequest setFrom(Integer from) { this.from = from; return this; }
    public PostSplitRequest setTo(Integer to) { this.to = to; return this; }
    public PostSplitRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }
    public PostSplitRequest setRegion(String region) { this.region = region; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/split";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("outFormat", outFormat);
        if (password != null && !password.isEmpty()) query.put("password", password);
        if (from != null) query.put("from", String.valueOf(from));
        if (to != null) query.put("to", String.valueOf(to));
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
