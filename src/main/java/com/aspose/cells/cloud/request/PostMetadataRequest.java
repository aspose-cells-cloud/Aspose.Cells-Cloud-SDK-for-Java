package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.CellsDocumentProperty;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/** Update document properties in Excel file, and save them is various formats. */
public class PostMetadataRequest implements RequestOption {
    private final FormFile file;
    private final List<CellsDocumentProperty> cellsDocuments;

    private String password;
    private Boolean checkExcelRestriction;
    private String outFormat;
    private String region;

    public PostMetadataRequest(String file, List<CellsDocumentProperty> cellsDocuments) {
        this(FormFile.ofPath(file), cellsDocuments);
    }

    public PostMetadataRequest(File file, List<CellsDocumentProperty> cellsDocuments) {
        this(FormFile.of(file), cellsDocuments);
    }

    public PostMetadataRequest(FormFile file, List<CellsDocumentProperty> cellsDocuments) {
        if (file == null) throw new IllegalArgumentException("file is required");
        if (cellsDocuments == null) throw new IllegalArgumentException("cellsDocuments is required");
        this.file = file;
        this.cellsDocuments = cellsDocuments;
    }

    public PostMetadataRequest(byte[] file, String fileFileName, List<CellsDocumentProperty> cellsDocuments) {
        this(FormFile.of(file, fileFileName), cellsDocuments);
    }

    public PostMetadataRequest setPassword(String password) { this.password = password; return this; }
    public PostMetadataRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }
    public PostMetadataRequest setOutFormat(String outFormat) { this.outFormat = outFormat; return this; }
    public PostMetadataRequest setRegion(String region) { this.region = region; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/metadata/update";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (password != null && !password.isEmpty()) query.put("password", password);
        if (checkExcelRestriction != null) query.put("checkExcelRestriction", String.valueOf(checkExcelRestriction));
        if (outFormat != null && !outFormat.isEmpty()) query.put("outFormat", outFormat);
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
        return cellsDocuments;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        Map<String, Object> form = new HashMap<>();
        form.put("File", file);
        return form;
    }

    @Override public String getJsonBodyPartName() { return "cellsDocuments"; }
}
