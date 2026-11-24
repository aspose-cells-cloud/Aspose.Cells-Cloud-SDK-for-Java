/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="BytesSink.java">
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

import java.io.ByteArrayOutputStream;

/**
 * Collects the result in memory.
 */
public final class BytesSink implements DataSink {

    private final ByteArrayOutputStream buffer = new ByteArrayOutputStream();

    @Override
    public void write(byte[] data) {
        if (data != null && data.length > 0) {
            buffer.write(data, 0, data.length);
        }
    }

    /** @return the collected bytes. */
    public byte[] value() {
        return buffer.toByteArray();
    }

    /** @return the collected bytes. */
    public byte[] toBytes() {
        return value();
    }

    /** @return the number of bytes collected so far. */
    public int size() {
        return buffer.size();
    }
}
