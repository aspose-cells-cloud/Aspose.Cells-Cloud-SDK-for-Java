# **Spreadsheet Cloud API: fillReport**

Takes a JSON array of objects (or a single object), creates a worksheet with a bold header row,

## **Quick Start**

- **Base URL**: `http://api.aspose.cloud/v4.0`
- **Authentication Method**: `JWT (OAuth2, application)`  **Token URL**: `https://api.aspose.cloud/connect/token`
- **Example** 

## **Interface Details**

### **Endpoint** 

```
PUT http://api.aspose.cloud/v4.0/cells/report/fill
```

### **Function Description**
Takes a JSON array of objects (or a single object), creates a worksheet with a bold header row,
writes the data, converts the range into an Excel table and returns the result in the requested
format. Column order follows the `columns` parameter when provided, otherwise the property order
of the records.
            
## **Input**
            
- **data** (form string or file): JSON array of flat objects, e.g.
  `[{"name":"Alice","age":30},{"name":"Bob","age":25}]`.
- **format** (query, default `xlsx`): output format, e.g. `xlsx`, `pdf`, `csv`.
- **columns** (query, optional): comma separated column names to select/order columns.
- **filename** (query, optional): output file name (${Field} placeholders resolve against the first record).
            
## **Example**
            
```
curl -X PUT "https://api.aspose.cloud/v4.0/cells/report/fill?format=xlsx" \
  -F "data=[{\"name\":\"Alice\",\"age\":30},{\"name\":\"Bob\",\"age\":25}]"
```
            
## **Error Handling**
            
- **400 Bad Request**: missing or invalid data, empty array, records without properties
  (and no `columns` given), or unsupported format.
- **401 Unauthorized**: Authentication has failed, or no credentials were provided.

### The request parameters of **fillReport** API are: 

| Parameter Name | Type | Path/Query String/HTTPBody | Description | 
| :- | :- | :- |:- | 
|data|File|FormData|Report data: a JSON string or a JSON file containing a single object, an array of objects, or the { ReportObjectName, ReportDatas } envelope.|
|format|String|Query|The output format of the generated spreadsheet (default: xlsx).|
|columns|String|Query|Optional comma separated list of columns to select and order.|
|filename|String|Query|Output file name, optionally with ${Field} / {Field} placeholders.|
|outPath|String|Query|(Optional) The folder path where the workbook is stored. The default is null.|
|outStorageName|String|Query|Output file Storage Name.|
|region|String|Query|Spreadsheet region/language setting (e.g., `en-US`, `fr-FR`). Influences number formatting, date parsing, and locale‑specific behavior.|
|password|String|Query|The password for opening spreadsheet file.|

### **Response Description**
```json
{
File
}
```

## OpenAPI Specification

The [OpenAPI Specification](https://reference.aspose.cloud/cells/#/ReportController/FillReport) defines a publicly accessible programming interface and lets you carry out REST interactions directly from a web browser.

[[Back to API list]](../DeveloperGuide.md#api-reference)  
[[Back to README]](../../README.md)
