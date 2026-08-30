package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** AI task decomposition: Convert user objectives to sequential action plans with formatted file export. */
public class DecomposeUserTaskRequest implements RequestOption {
    private final String taskDescription;

    private String region;
    private String password;

    public DecomposeUserTaskRequest(String taskDescription) {
        if (taskDescription == null || taskDescription.isEmpty()) throw new IllegalArgumentException("taskDescription is required");
        this.taskDescription = taskDescription;
    }

    public DecomposeUserTaskRequest setRegion(String region) { this.region = region; return this; }
    public DecomposeUserTaskRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/cells/ai/task/decompose";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (region != null && !region.isEmpty()) query.put("region", region);
        if (password != null && !password.isEmpty()) query.put("password", password);
        return query;
    }

    @Override
    public Map<String, String> getHeaderParameters() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        return headers;
    }

    @Override
    public Object getJsonBody() {
        return taskDescription;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }

    @Override public boolean isBinaryResponse() { return true; }
}
