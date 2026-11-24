/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="UrlUtils.java">
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

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * UrlUtils — URL-encoding helpers shared by the generated request classes.
 */
public final class UrlUtils {

    private UrlUtils() {
    }

    /**
     * URL-encodes a single path segment. Spaces are encoded as {@code %20} (rather than {@code +}),
     * and forward slashes are preserved so that multi-segment storage paths stay intact.
     *
     * @param value the value to encode
     * @return the encoded value
     */
    public static String urlEncode(String value) {
        if (value == null) {
            return "";
        }
        try {
            return URLEncoder.encode(value, "UTF-8")
                    .replace("+", "%20")
                    .replace("%2F", "/")
                    .replace("%2f", "/");
        } catch (UnsupportedEncodingException e) {
            // UTF-8 is required by the JVM; this branch is effectively unreachable.
            return value;
        }
    }
}
