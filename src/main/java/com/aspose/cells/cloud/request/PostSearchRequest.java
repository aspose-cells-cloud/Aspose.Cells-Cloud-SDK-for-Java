package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Search for specified text within Excel files. */
public class PostSearchRequest implements RequestOption {
    private final FormFile file;
    private final String text;

    private String password;
    private String sheetname;
    private Boolean checkExcelRestriction;

    public PostSearchRequest(String file, String text) {
        this(FormFile.ofPath(file), text);
    }

    public PostSearchRequest(File file, String text) {
        this(FormFile.of(file), text);
    }

    public PostSearchRequest(FormFile file, String text) {
        if (file == null) throw new IllegalArgumentException("file is required");
        if (text == null || text.isEmpty()) throw new IllegalArgumentException("text is required");
        this.file = file;
        this.text = text;
    }

    public PostSearchRequest(byte[] file, String fileFileName, String text) {
        this(FormFile.of(file, fileFileName), text);
    }

    public PostSearchRequest setPassword(String password) { this.password = password; return this; }
    public PostSearchRequest setSheetname(String sheetname) { this.sheetname = sheetname; return this; }
    public PostSearchRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/search";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("text", text);
        if (password != null && !password.isEmpty()) query.put("password", password);
        if (sheetname != null && !sheetname.isEmpty()) query.put("sheetname", sheetname);
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
