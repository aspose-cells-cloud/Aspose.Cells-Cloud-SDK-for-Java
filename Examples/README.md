# Aspose.Cells Cloud Java SDK examples

New-model examples migrated from the legacy `cells.cloud-sdk-java/examples`
directory. Each class is a standalone `main` that creates a `CellsCloudClient`
and executes one generated request class.

The examples are compiled as an extra source root of the SDK build, but are
excluded from the published SDK jar.

## Prerequisites

- JDK 17+
- Maven 3.8+
- Aspose.Cells Cloud credentials from
  <https://dashboard.aspose.cloud/#/applications>

Set the credentials for the current shell:

```bash
export CellsCloudClientId=your-client-id
export CellsCloudClientSecret=your-client-secret
# Optional; defaults to https://api.aspose.cloud
export CellsCloudApiBaseUrl=https://api.aspose.cloud
```

PowerShell:

```powershell
$env:CellsCloudClientId="your-client-id"
$env:CellsCloudClientSecret="your-client-secret"
```

## Build

From the SDK root:

```bash
cd sdks/java_sdk
mvn -o -q -DskipTests compile
```

This compiles the SDK, the smoke tests, and every example.

## Run an example

The `exec-maven-plugin` is configured in the SDK POM:

```bash
cd sdks/java_sdk
mvn -o -q exec:java \
  -Dexec.mainClass=com.aspose.cells.cloud.examples.Example30_GetWorksheetCell
```

Examples read local workbooks by their bare file name (for example
`Book1.xlsx`). Copy the fixtures you need into the SDK root, which is the
working directory used by `exec:java`:

```bash
cp testdata/*.xlsx .
```

The class name is the file name without the `.java` suffix.

## Layout

The example sources are flat files directly under this directory; Maven adds
`examples` as a source root while the classes declare the package
`com.aspose.cells.cloud.examples`.

- `Example30_*.java` – cloud-file operations: upload a workbook, then call the
  operation.
- `Example40_*.java` – local-file operations that attach the workbook directly
  to the request.

All examples use the new model:

```java
CellsCloudClient client = new CellsCloudClient(clientId, clientSecret, baseUrl);
client.call(new GetWorksheetCellRequest("A1", "Book1.xlsx", "Sheet1"));
```
