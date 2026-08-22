package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.ProtectWorkbookRequest;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Excel files encryption. */
public class PostProtectRequest implements RequestOption {
    private final FormFile file;
    private final ProtectWorkbookRequest protectWorkbookRequest;

    private String password;

    public PostProtectRequest(String file, ProtectWorkbookRequest protectWorkbookRequest) {
        this(FormFile.ofPath(file), protectWorkbookRequest);
    }

    public PostProtectRequest(File file, ProtectWorkbookRequest protectWorkbookRequest) {
        this(FormFile.of(file), protectWorkbookRequest);
    }

    public PostProtectRequest(FormFile file, ProtectWorkbookRequest protectWorkbookRequest) {
        if (file == null) throw new IllegalArgumentException("file is required");
        if (protectWorkbookRequest == null) throw new IllegalArgumentException("protectWorkbookRequest is required");
        this.file = file;
        this.protectWorkbookRequest = protectWorkbookRequest;
    }

    public PostProtectRequest(byte[] file, String fileFileName, ProtectWorkbookRequest protectWorkbookRequest) {
        this(FormFile.of(file, fileFileName), protectWorkbookRequest);
    }

    public PostProtectRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/protect";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (password != null && !password.isEmpty()) query.put("password", password);
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
        return protectWorkbookRequest;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        Map<String, Object> form = new HashMap<>();
        form.put("File", file);
        return form;
    }
}
