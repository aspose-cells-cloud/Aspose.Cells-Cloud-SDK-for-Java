package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Replace specified text with new text in Excel files. */
public class PostReplaceRequest implements RequestOption {
    private final FormFile file;
    private final String text;
    private final String newtext;

    private String password;
    private String sheetname;
    private Boolean checkExcelRestriction;

    public PostReplaceRequest(String file, String text, String newtext) {
        this(FormFile.ofPath(file), text, newtext);
    }

    public PostReplaceRequest(File file, String text, String newtext) {
        this(FormFile.of(file), text, newtext);
    }

    public PostReplaceRequest(FormFile file, String text, String newtext) {
        if (file == null) throw new IllegalArgumentException("file is required");
        if (text == null || text.isEmpty()) throw new IllegalArgumentException("text is required");
        if (newtext == null || newtext.isEmpty()) throw new IllegalArgumentException("newtext is required");
        this.file = file;
        this.text = text;
        this.newtext = newtext;
    }

    public PostReplaceRequest(byte[] file, String fileFileName, String text, String newtext) {
        this(FormFile.of(file, fileFileName), text, newtext);
    }

    public PostReplaceRequest setPassword(String password) { this.password = password; return this; }
    public PostReplaceRequest setSheetname(String sheetname) { this.sheetname = sheetname; return this; }
    public PostReplaceRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/replace";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("text", text);
        query.put("newtext", newtext);
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
