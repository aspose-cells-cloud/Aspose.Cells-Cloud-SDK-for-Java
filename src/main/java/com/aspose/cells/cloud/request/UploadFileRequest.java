package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** UploadFile request. */
public class UploadFileRequest implements RequestOption {
    private final FormFile uploadFiles;
    private final String path;

    private String storageName;

    public UploadFileRequest(String uploadFiles, String path) {
        this(FormFile.ofPath(uploadFiles), path);
    }

    public UploadFileRequest(File uploadFiles, String path) {
        this(FormFile.of(uploadFiles), path);
    }

    public UploadFileRequest(FormFile uploadFiles, String path) {
        if (uploadFiles == null) throw new IllegalArgumentException("uploadFiles is required");
        if (path == null || path.isEmpty()) throw new IllegalArgumentException("path is required");
        this.uploadFiles = uploadFiles;
        this.path = path;
    }

    public UploadFileRequest(byte[] uploadFiles, String uploadFilesFileName, String path) {
        this(FormFile.of(uploadFiles, uploadFilesFileName), path);
    }

    public UploadFileRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/storage/file/" + urlEncode(path);
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
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
        form.put("UploadFiles", uploadFiles);
        return form;
    }
}
