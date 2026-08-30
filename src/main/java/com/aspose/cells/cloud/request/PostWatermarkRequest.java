package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Add Text Watermark to Excel files and generate output files in various formats. */
public class PostWatermarkRequest implements RequestOption {
    private final FormFile file;
    private final String text;
    private final String color;

    private String outFormat;
    private String password;
    private Boolean checkExcelRestriction;
    private String region;

    public PostWatermarkRequest(String file, String text, String color) {
        this(FormFile.ofPath(file), text, color);
    }

    public PostWatermarkRequest(File file, String text, String color) {
        this(FormFile.of(file), text, color);
    }

    public PostWatermarkRequest(FormFile file, String text, String color) {
        if (file == null) throw new IllegalArgumentException("file is required");
        if (text == null || text.isEmpty()) throw new IllegalArgumentException("text is required");
        if (color == null || color.isEmpty()) throw new IllegalArgumentException("color is required");
        this.file = file;
        this.text = text;
        this.color = color;
    }

    public PostWatermarkRequest(byte[] file, String fileFileName, String text, String color) {
        this(FormFile.of(file, fileFileName), text, color);
    }

    public PostWatermarkRequest setOutFormat(String outFormat) { this.outFormat = outFormat; return this; }
    public PostWatermarkRequest setPassword(String password) { this.password = password; return this; }
    public PostWatermarkRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }
    public PostWatermarkRequest setRegion(String region) { this.region = region; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/watermark";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("text", text);
        query.put("color", color);
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
