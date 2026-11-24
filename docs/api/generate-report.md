# **Spreadsheet Cloud API: generateReport**

Upload an Excel template containing Smart Markers (e.g., &amp;=Data.FieldName) plus the data for one

## **Quick Start**

- **Base URL**: `http://api.aspose.cloud/v4.0`
- **Authentication Method**: `JWT (OAuth2, application)`  **Token URL**: `https://api.aspose.cloud/connect/token`
- **Example** 

## **Interface Details**

### **Endpoint** 

```
PUT http://api.aspose.cloud/v4.0/cells/report/generate
```

### **Function Description**
Upload an Excel template containing Smart Markers (e.g., &amp;=Data.FieldName) plus the data for one
report, and receive the rendered report in the requested format. One call, one file.
            
## **Input**
            
- **template** (form file): Excel workbook with Smart Markers.
- **data** (form string or file): a JSON object, a one-element JSON array, or the
  { ReportObjectName, ReportDatas } envelope. For multiple records use `/report/generate/batch`.
- **format** (query, default `xlsx`): any supported output format, e.g. `xlsx`, `pdf`, `html`.
- **reportObjectName** (query, optional): the Smart Marker data source name. When omitted it is
  inferred from the template; if the template uses several data sources the request is rejected.
- **filename** (query, optional): output file name; supports ${Field} / {Field} placeholders
  resolved against the record (e.g. `invoice_${customer}`). The extension always follows `format`.
            
## **Example**
            
```
curl -X PUT "https://api.aspose.cloud/v4.0/cells/report/generate?format=pdf" \
  -F "template=@invoice_template.xlsx" \
  -F "data={\"customer\":\"Alice\",\"amount\":10000}"
```
            
## **Error Handling**
            
- **400 Bad Request**: missing template or data, invalid JSON, data containing more than one
  record, template without smart markers, ambiguous data source name, or unsupported format.
- **401 Unauthorized**: Authentication has failed, or no credentials were provided.

### The request parameters of **generateReport** API are: 

| Parameter Name | Type | Path/Query String/HTTPBody | Description | 
| :- | :- | :- |:- | 
|data|File|FormData|Report data: a JSON string or a JSON file containing a single object, an array of objects, or the { ReportObjectName, ReportDatas } envelope.|
|template|File|FormData|Upload report template file: an Excel workbook containing smart markers (e.g., &=Data.FieldName).|
|format|String|Query|The output format of the generated report (default: xlsx).|
|reportObjectName|String|Query|The Smart Marker data source name; inferred from the template when omitted.|
|filename|String|Query|Output file name, optionally with ${Field} / {Field} placeholders.|
|outPath|String|Query|(Optional) The folder path where the workbook is stored. The default is null.|
|outStorageName|String|Query|Output file Storage Name.|
|AutoRowsFit|Boolean|Query|(Optional) Autofits all rows in worksheets.|
|AutoColumnsFit|Boolean|Query|(Optional) Autofits all columns in worksheets.|
|region|String|Query|Spreadsheet region/language setting (e.g., `en-US`, `fr-FR`). Influences number formatting, date parsing, and locale‑specific behavior.|
|password|String|Query|The password for opening spreadsheet file.|

### **Response Description**
```json
{
File
}
```

## OpenAPI Specification

The [OpenAPI Specification](https://reference.aspose.cloud/cells/#/ReportController/GenerateReport) defines a publicly accessible programming interface and lets you carry out REST interactions directly from a web browser.

[[Back to API list]](../DeveloperGuide.md#api-reference)  
[[Back to README]](../../README.md)
