package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Excel file digital signature. */
public class PostDigitalSignatureRequest implements RequestOption {
    private final String name;
    private final String digitalsignaturefile;
    private final String password;

    private String folder;
    private String storageName;

    public PostDigitalSignatureRequest(String name, String digitalsignaturefile, String password) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (digitalsignaturefile == null || digitalsignaturefile.isEmpty()) throw new IllegalArgumentException("digitalsignaturefile is required");
        if (password == null || password.isEmpty()) throw new IllegalArgumentException("password is required");
        this.name = name;
        this.digitalsignaturefile = digitalsignaturefile;
        this.password = password;
    }

    public PostDigitalSignatureRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostDigitalSignatureRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/digitalsignature";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("digitalsignaturefile", digitalsignaturefile);
        query.put("password", password);
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
        return query;
    }

    @Override
    public Map<String, String> getHeaderParameters() {
        return new HashMap<>();
    }

    @Override
    public Object getJsonBody() {
        return null;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
