package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Unlock Excel files. */
public class PostUnlockRequest implements RequestOption {
    private final FormFile file;
    private final String password;

    public PostUnlockRequest(String file, String password) {
        this(FormFile.ofPath(file), password);
    }

    public PostUnlockRequest(File file, String password) {
        this(FormFile.of(file), password);
    }

    public PostUnlockRequest(FormFile file, String password) {
        if (file == null) throw new IllegalArgumentException("file is required");
        if (password == null || password.isEmpty()) throw new IllegalArgumentException("password is required");
        this.file = file;
        this.password = password;
    }

    public PostUnlockRequest(byte[] file, String fileFileName, String password) {
        this(FormFile.of(file, fileFileName), password);
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/unlock";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("password", password);
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
