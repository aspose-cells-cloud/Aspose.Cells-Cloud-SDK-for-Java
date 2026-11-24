/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="UrlPathSink.java">
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

package com.aspose.cells.cloud.datasource;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.net.HttpURLConnection;
import java.net.URI;

/**
 * Uploads the result with an HTTP {@code PUT} to a URL.
 *
 * <p>Useful for pre-signed cloud-storage URLs (AWS S3, Aliyun OSS, ...). A
 * non-2xx response is reported as an {@link UncheckedIOException}.</p>
 */
public final class UrlPathSink implements DataSink {

    private final String url;
    private final String contentType;
    private final int timeoutMillis;

    /**
     * @param url the destination URL
     */
    public UrlPathSink(String url) {
        this(url, "application/octet-stream", 0);
    }

    /**
     * @param url           the destination URL
     * @param contentType   the request content type
     * @param timeoutMillis the connect/read timeout in milliseconds (0 = no timeout)
     */
    public UrlPathSink(String url, String contentType, int timeoutMillis) {
        if (url == null || url.isEmpty()) {
            throw new IllegalArgumentException("url is required");
        }
        this.url = url;
        this.contentType = contentType == null ? "application/octet-stream" : contentType;
        this.timeoutMillis = timeoutMillis;
    }

    @Override
    public void write(byte[] data) {
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) URI.create(url).toURL().openConnection();
            connection.setRequestMethod("PUT");
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type", contentType);
            if (timeoutMillis > 0) {
                connection.setConnectTimeout(timeoutMillis);
                connection.setReadTimeout(timeoutMillis);
            }
            try (OutputStream out = connection.getOutputStream()) {
                out.write(data == null ? new byte[0] : data);
            }
            int status = connection.getResponseCode();
            if (status < 200 || status >= 300) {
                throw new UncheckedIOException(new IOException(
                        "upload to URL failed with status " + status));
            }
        } catch (IOException e) {
            throw new UncheckedIOException("failed to upload spreadsheet: " + url, e);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
