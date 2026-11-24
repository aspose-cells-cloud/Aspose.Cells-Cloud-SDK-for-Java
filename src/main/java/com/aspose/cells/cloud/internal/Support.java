/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Support.java">
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

package com.aspose.cells.cloud.internal;

import com.aspose.cells.cloud.CellsCloudClient;
import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.RichResponse;
import com.aspose.cells.cloud.WorkbookRef;
import com.aspose.cells.cloud.datasource.DataSink;
import com.aspose.cells.cloud.datasource.DataSource;

import java.util.ArrayList;
import java.util.List;

/**
 * Shared execution, I/O and validation helpers for the facade packages.
 *
 * <p>The generated request classes are executed through
 * {@link CellsCloudClient#call(RequestOption)}, which already throws
 * {@code ApiException} on non-2xx responses.</p>
 */
public final class Support {

    private Support() {
        // Utility holder — no instances.
    }

    /**
     * Throws {@link IllegalArgumentException} when {@code condition} is false.
     *
     * @param condition the condition that must hold
     * @param message   the message used when it does not
     */
    public static void require(boolean condition, String message) {
        if (!condition) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Executes a generated request; non-2xx responses surface as
     * {@code ApiException} from the SDK client.
     *
     * @param client  the SDK client
     * @param request the request to execute
     * @return the rich response
     */
    public static RichResponse doChecked(CellsCloudClient client, RequestOption request) {
        require(client != null, "client is required");
        return client.call(request);
    }

    /**
     * @param response a successful response
     * @return the raw response body bytes
     */
    public static byte[] responseBytes(RichResponse response) {
        return response.getBody();
    }

    /**
     * Normalizes a data source to bytes.
     *
     * @param source the source
     * @return the source bytes
     */
    public static byte[] readSource(DataSource source) {
        require(source != null, "data source is required");
        return source.read();
    }

    /**
     * Writes bytes to a data sink.
     *
     * @param sink the sink
     * @param data the bytes to write
     */
    public static void writeSink(DataSink sink, byte[] data) {
        require(sink != null, "data sink is required");
        sink.write(data);
    }

    /**
     * Validates that a cloud workbook reference has a file name.
     *
     * @param ref the workbook reference
     * @return the same reference
     */
    public static WorkbookRef requireWorkbook(WorkbookRef ref) {
        require(ref != null && ref.getName() != null && !ref.getName().isEmpty(),
                "workbook name is required");
        return ref;
    }

    /**
     * Expands a workbook location into request options ({@code folder} and
     * {@code storageName}), mirroring the Go/Python facades.
     *
     * @param ref the workbook reference (may be {@code null})
     * @return the request options to apply
     */
    public static Option[] workbookParams(WorkbookRef ref) {
        List<Option> params = new ArrayList<>();
        if (ref != null) {
            if (ref.getFolder() != null && !ref.getFolder().isEmpty()) {
                params.add(Options.commonParameter("folder", ref.getFolder()));
            }
            if (ref.getStorageName() != null && !ref.getStorageName().isEmpty()) {
                params.add(Options.commonParameter("storageName", ref.getStorageName()));
            }
        }
        return params.toArray(new Option[0]);
    }
}
