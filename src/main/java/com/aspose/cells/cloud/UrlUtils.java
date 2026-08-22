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
