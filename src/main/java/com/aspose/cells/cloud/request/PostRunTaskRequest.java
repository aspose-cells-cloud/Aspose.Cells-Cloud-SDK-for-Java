package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.TaskData;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Run tasks. */
public class PostRunTaskRequest implements RequestOption {
    private final TaskData taskData;

    public PostRunTaskRequest(TaskData taskData) {
        if (taskData == null) throw new IllegalArgumentException("taskData is required");
        this.taskData = taskData;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/task/runtask";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        return new LinkedHashMap<>();
    }

    @Override
    public Map<String, String> getHeaderParameters() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        return headers;
    }

    @Override
    public Object getJsonBody() {
        return taskData;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
