package com.aspose.cells.cloud;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * JsonUtil — the single shared Jackson {@link ObjectMapper} for the SDK.
 *
 * <p>Every component that serializes or deserializes JSON uses this one mapper so the
 * configuration is consistent across the client and the response type:</p>
 * <ul>
 *   <li>{@link JavaTimeModule} — {@link java.time.OffsetDateTime} support;</li>
 *   <li>{@link JsonInclude.Include#NON_NULL} — reproduces the Go SDK's {@code omitempty} behavior;</li>
 *   <li>{@code WRITE_DATES_AS_TIMESTAMPS} disabled — dates serialize as ISO 8601, matching the wire spec;</li>
 *   <li>{@code FAIL_ON_UNKNOWN_PROPERTIES} disabled — tolerant of forward-compatible API responses.</li>
 * </ul>
 */
public final class JsonUtil {

    /** The shared, fully configured mapper. */
    public static final ObjectMapper MAPPER = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    private JsonUtil() {
        // Utility holder — no instances.
    }
}
