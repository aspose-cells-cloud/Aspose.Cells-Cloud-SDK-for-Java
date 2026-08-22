# Development Guide

## Project Overview

This SDK is generated from `aspose.cells.cloud.specification.json` (461 operations, 42 controllers,
483 data models) and mirrors the structure of the Aspose.Cells Cloud SDK for Go, translated to Java.

## Directory Structure

```
cells-cloud-sdk-java/
├── pom.xml                                     # Maven build
├── src/main/java/com/aspose/cells/cloud/
│   ├── CellsCloudClient.java
│   ├── Configuration.java
│   ├── RequestOption.java                      # interface
│   ├── RichResponse.java
│   ├── ApiException.java
│   ├── model/                                  # 483 model classes
│   └── request/                                # 461 request classes
├── src/test/java/com/aspose/cells/cloud/       # unit tests (JUnit 5)
├── integrationtests/                           # integration tests (JUnit 5, JSON-driven)
├── testdata/                                   # sample XLSX / CSV files
├── generate_models.py                          # model generation script
├── generate_requests.py                        # request generation script
├── generate_tests.py                           # test generation script
└── references/                                 # generation rules (see ../references)
```

## Code Generation

### Prerequisites

- JDK 8+ and Maven (or Gradle).
- The API specification file: `aspose.cells.cloud.specification.json`.
- Generation scripts in the project root.

### Generate Models

```bash
python3 generate_models.py
```

Reads the `Models` array and generates one `.java` per model under
`src/main/java/com/aspose/cells/cloud/model/`. Each model follows
[references/model_generation_rules.md](../references/model_generation_rules.md).

### Generate Requests

```bash
python3 generate_requests.py
```

Reads the `Operations` array and generates one request class per operation under
`src/main/java/com/aspose/cells/cloud/request/`, following
[references/request_generation_rules.md](../references/request_generation_rules.md).

### Generate Tests

```bash
python3 generate_tests.py
```

Reads `TestingData/` JSON files and generates JUnit cases under `integrationtests/`, following
[references/test_generation_rules.md](../references/test_generation_rules.md).

## Type Mapping

| Spec `DataType.Identifier` | Go type | Java type |
|----------------------------|---------|-----------|
| `String` | `string` | `String` |
| `Boolean` | `*bool` | `Boolean` |
| `Integer` | `*int32` | `Integer` |
| `Long` | `*int64` | `Long` |
| `Floating` | `*float64` | `Double` |
| `DateTime` | `time.Time` | `java.time.OffsetDateTime` (ISO 8601) |
| `Byte` | `byte` | `Integer` (a single byte, 0..255, e.g. `Color.R`) |
| `Array` of `Byte` | `[]byte` | `byte[]` (a binary blob, e.g. `RenderingWatermark.Image`) |
| `Class` (Reference) | `*Ref` | `Ref` |
| `Container` (Reference) | `[]Ref` | `List<Ref>` |
| `Array` (ElementDataType) | `[]T` | `List<T>` |
| `Object` / `Any` | `map[string]interface{}` / `interface{}` | `Map<String, Object>` / `Object` |

> **Nullability is free in Java.** Boxed types (`Integer`, `Boolean`, `Long`, `Double`) are reference
> types that can be `null`; a `null` field is omitted from JSON via
> `@JsonInclude(JsonInclude.Include.NON_NULL)`. This reproduces the Go SDK's `omitempty` on pointer
> fields without any pointer-helper.

## Key Design Patterns

### Request Interface

Every request class implements `RequestOption`:

```java
package com.aspose.cells.cloud;

import java.util.Map;

public interface RequestOption {
    String getMethod();                  // GET/POST/PUT/DELETE
    String getApiVersion();              // "v3.0" or "v4.0" (from the operation's APIVersion)
    String getPath();                    // with {param} already substituted
    Map<String, String> getQueryParameters();
    Map<String, String> getHeaderParameters();
    Object getJsonBody();                // null when no body
    Map<String, Object> getMultipartForm();   // null/empty when no form; file values are FormFile/File/byte[]
}
```

> **API version is per operation.** The specification declares an `APIVersion` on each operation
> (`v3.0` for the 338 spreadsheet-processing operations, `v4.0` for the 119 storage/file operations).
> The generated request class returns that value from `getApiVersion()` **and** embeds it in
> `getPath()` as the leading path segment, so `getPath()` reads `/v3.0/cells/...` for v3.0 operations
> and `/v4.0/cells/...` for v4.0 operations. `CellsCloudClient` therefore joins only the base URL and
> the request path (e.g. `https://api.aspose.cloud/v3.0/cells/...` vs
> `https://api.aspose.cloud/v4.0/cells/storage/...`).

### Required & Optional Parameters

Required parameters are constructor arguments, validated in the constructor (the analog of the Go SDK
returning `nil` on a missing required arg). Optional parameters are fluent setters returning `this`:

```java
PostClearContentsRequest request = new PostClearContentsRequest("Book1.xlsx", "Sheet1")
    .setRange("A1:C10")        // optional
    .setFolder("TestData/In"); // optional
```

This mirrors the Go SDK's `WithCommonParameter` / `NewXxxRequest(required..., opts...)` pattern with
Java's constructor + fluent-setter idiom.

### Parameter Type Rules

| Parameter Type | Required | Optional |
|---------------|----------|----------|
| string | `String` (validated non-empty) | `String` (null/empty = omitted) |
| integer / boolean / floating | `Integer` / `Boolean` / `Double` (validated non-null) | boxed type (null = omitted) |
| Class | `Model` (validated non-null) | `Model` (null = omitted) |
| Container / Array | `List<T>` | `List<T>` |

### Model Serialization

Models use Jackson annotations: `@JsonProperty("WireName")` on each field plus
`@JsonInclude(NON_NULL)` on the class so null fields are omitted. See
[references/model_generation_rules.md](../references/model_generation_rules.md).

## Adding New APIs

1. Add the operation (and any new models) to `aspose.cells.cloud.specification.json`.
2. Run `python3 generate_models.py` to (re)generate model classes.
3. Run `python3 generate_requests.py` to (re)generate request classes.
4. Add test data to `TestingData/` and run `python3 generate_tests.py`.
5. Build and run checks:

```bash
mvn -q compile
mvn -q test
```

## Contributing

1. Follow the naming and layout conventions in `CLAUDE.md`.
2. Models use private fields + `get`/`set` accessors and Jackson annotations.
3. Requests implement `RequestOption`; validate required constructor params.
4. Never throw a raw `RuntimeException` in library code — throw `ApiException`.
5. Run `mvn -q compile` and `mvn -q test` before submitting changes.
