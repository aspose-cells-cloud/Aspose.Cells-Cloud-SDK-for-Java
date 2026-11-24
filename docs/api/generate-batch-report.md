# **Spreadsheet Cloud API: generateBatchReport**

Renders the template once per record and returns either an archive of files or one aggregated

## **Quick Start**

- **Base URL**: `http://api.aspose.cloud/v4.0`
- **Authentication Method**: `JWT (OAuth2, application)`  **Token URL**: `https://api.aspose.cloud/connect/token`
- **Example** 

## **Interface Details**

### **Endpoint** 

```
PUT http://api.aspose.cloud/v4.0/cells/report/generate/batch
```

### **Function Description**
Renders the template once per record and returns either an archive of files or one aggregated
workbook, controlled by `mode`:
            
- **files** (default): one report file per record; returned as a ZIP archive when `zipOutput` is true.
- **sheets**: one worksheet per record inside a single workbook.
- **single**: all records appended into one worksheet of a single workbook.
            
## **Input**
            
- **template** (form file): Excel workbook with Smart Markers.
- **data** (form string or file): JSON array of record objects (a single object or the
  { ReportObjectName, ReportDatas } envelope is also accepted).
- **format** (query, default `xlsx`): output format of every generated report, e.g. `pdf`.
- **mode** (query, default `files`): `files`, `sheets` or `single`.
- **zipOutput** (query, default `true`): pack per-record files into one ZIP. Required to be true
  for `files` mode with several records unless `outPath` is used.
- **filename** (query, optional): file name template with ${Field} / {Field} placeholders
  (e.g. `invoice_${customer}`); duplicate names are suffixed automatically.
- **sheetName** (query, optional): worksheet name template for `sheets` / `single` modes.
- **reportObjectName** (query, optional): Smart Marker data source name; inferred when omitted.
            
## **Example**
            
```
curl -X PUT "https://api.aspose.cloud/v4.0/cells/report/generate/batch?format=pdf&amp;zipOutput=true" \
  -F "template=@invoice_template.xlsx" \
  -F "data=@customers.json"
```
            
## **Error Handling**
            
- **400 Bad Request**: missing template or data, invalid JSON, invalid `mode` or `format`,
  `zipOutput=false` with several files and no `outPath`, template without smart markers,
  or the record / output size limits exceeded.
- **401 Unauthorized**: Authentication has failed, or no credentials were provided.

### The request parameters of **generateBatchReport** API are: 

| Parameter Name | Type | Path/Query String/HTTPBody | Description | 
| :- | :- | :- |:- | 
|data|File|FormData|Report data: a JSON string or a JSON file containing a single object, an array of objects, or the { ReportObjectName, ReportDatas } envelope.|
|template|File|FormData|Upload report template file: an Excel workbook containing smart markers (e.g., &=Data.FieldName).|
|format|String|Query|The output format of every generated report (default: xlsx).|
|mode|String|Query|Output mode: files (one file per record), sheets (one worksheet per record) or single (all records in one worksheet).|
|zipOutput|Boolean|Query|Pack per-record files into a single ZIP archive (files mode only).|
|reportObjectName|String|Query|The Smart Marker data source name; inferred from the template when omitted.|
|filename|String|Query|File name template with ${Field} / {Field} placeholders.|
|sheetName|String|Query|Worksheet name template with ${Field} / {Field} placeholders (sheets/single modes).|
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

The [OpenAPI Specification](https://reference.aspose.cloud/cells/#/ReportController/GenerateBatchReport) defines a publicly accessible programming interface and lets you carry out REST interactions directly from a web browser.

[[Back to API list]](../DeveloperGuide.md#api-reference)  
[[Back to README]](../../README.md)
