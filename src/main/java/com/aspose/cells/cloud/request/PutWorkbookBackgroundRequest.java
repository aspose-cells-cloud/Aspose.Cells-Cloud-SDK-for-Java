package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Set background in the workbook. */
public class PutWorkbookBackgroundRequest implements RequestOption {
    private final String name;

    private String picPath;
    private String imageAdaptOption;
    private String folder;
    private String storageName;
    private FormFile file;

    public PutWorkbookBackgroundRequest(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        this.name = name;
    }

    public PutWorkbookBackgroundRequest setPicPath(String picPath) { this.picPath = picPath; return this; }
    public PutWorkbookBackgroundRequest setImageAdaptOption(String imageAdaptOption) { this.imageAdaptOption = imageAdaptOption; return this; }
    public PutWorkbookBackgroundRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutWorkbookBackgroundRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public PutWorkbookBackgroundRequest setFile(String file) { this.file = (file == null || file.isEmpty()) ? null : FormFile.ofPath(file); return this; }
    public PutWorkbookBackgroundRequest setFile(File file) { this.file = FormFile.of(file); return this; }
    public PutWorkbookBackgroundRequest setFile(byte[] data, String fileName) { this.file = FormFile.of(data, fileName); return this; }
    public PutWorkbookBackgroundRequest setFile(FormFile file) { this.file = file; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/background";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (picPath != null && !picPath.isEmpty()) query.put("picPath", picPath);
        if (imageAdaptOption != null && !imageAdaptOption.isEmpty()) query.put("imageAdaptOption", imageAdaptOption);
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
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
        if (file != null) form.put("File", file);
        return form;
    }
}
