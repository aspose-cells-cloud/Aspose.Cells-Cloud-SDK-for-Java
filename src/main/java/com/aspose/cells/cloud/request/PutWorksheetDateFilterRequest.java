package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Apply a date filter in the worksheet. */
public class PutWorksheetDateFilterRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final String range;
    private final Integer fieldIndex;
    private final String dateTimeGroupingType;

    private Integer year;
    private Integer month;
    private Integer day;
    private Integer hour;
    private Integer minute;
    private Integer second;
    private Boolean matchBlanks;
    private Boolean refresh;
    private String folder;
    private String storageName;

    public PutWorksheetDateFilterRequest(String name, String sheetName, String range, Integer fieldIndex, String dateTimeGroupingType) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (range == null || range.isEmpty()) throw new IllegalArgumentException("range is required");
        if (fieldIndex == null) throw new IllegalArgumentException("fieldIndex is required");
        if (dateTimeGroupingType == null || dateTimeGroupingType.isEmpty()) throw new IllegalArgumentException("dateTimeGroupingType is required");
        this.name = name;
        this.sheetName = sheetName;
        this.range = range;
        this.fieldIndex = fieldIndex;
        this.dateTimeGroupingType = dateTimeGroupingType;
    }

    public PutWorksheetDateFilterRequest setYear(Integer year) { this.year = year; return this; }
    public PutWorksheetDateFilterRequest setMonth(Integer month) { this.month = month; return this; }
    public PutWorksheetDateFilterRequest setDay(Integer day) { this.day = day; return this; }
    public PutWorksheetDateFilterRequest setHour(Integer hour) { this.hour = hour; return this; }
    public PutWorksheetDateFilterRequest setMinute(Integer minute) { this.minute = minute; return this; }
    public PutWorksheetDateFilterRequest setSecond(Integer second) { this.second = second; return this; }
    public PutWorksheetDateFilterRequest setMatchBlanks(Boolean matchBlanks) { this.matchBlanks = matchBlanks; return this; }
    public PutWorksheetDateFilterRequest setRefresh(Boolean refresh) { this.refresh = refresh; return this; }
    public PutWorksheetDateFilterRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutWorksheetDateFilterRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/autoFilter/dateFilter";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("range", range);
        query.put("fieldIndex", String.valueOf(fieldIndex));
        query.put("dateTimeGroupingType", dateTimeGroupingType);
        if (year != null) query.put("year", String.valueOf(year));
        if (month != null) query.put("month", String.valueOf(month));
        if (day != null) query.put("day", String.valueOf(day));
        if (hour != null) query.put("hour", String.valueOf(hour));
        if (minute != null) query.put("minute", String.valueOf(minute));
        if (second != null) query.put("second", String.valueOf(second));
        if (matchBlanks != null) query.put("matchBlanks", String.valueOf(matchBlanks));
        if (refresh != null) query.put("refresh", String.valueOf(refresh));
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
