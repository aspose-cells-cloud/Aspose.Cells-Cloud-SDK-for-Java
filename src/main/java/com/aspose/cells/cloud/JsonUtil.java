/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="JsonUtil.java">
 *   Copyright (c) 2026 Aspose.Cells Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------
 */

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
