package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.CheckFormulaErrorOptions;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** CheckWorkbookFormulaErrors request. */
public class CheckWorkbookFormulaErrorsRequest implements RequestOption {
    private final CheckFormulaErrorOptions formulaErrorOptions;

    public CheckWorkbookFormulaErrorsRequest(CheckFormulaErrorOptions formulaErrorOptions) {
        if (formulaErrorOptions == null) throw new IllegalArgumentException("formulaErrorOptions is required");
        this.formulaErrorOptions = formulaErrorOptions;
    }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/checkformulaerrors";
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
        return formulaErrorOptions;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
