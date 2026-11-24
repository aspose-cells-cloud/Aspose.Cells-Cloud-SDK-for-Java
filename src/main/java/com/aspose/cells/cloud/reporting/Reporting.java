/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Reporting.java">
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

package com.aspose.cells.cloud.reporting;

import com.aspose.cells.cloud.CellsCloudClient;
import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RichResponse;
import com.aspose.cells.cloud.datasource.BytesSource;
import com.aspose.cells.cloud.datasource.DataSink;
import com.aspose.cells.cloud.datasource.DataSource;
import com.aspose.cells.cloud.datasource.FilePathSource;
import com.aspose.cells.cloud.internal.Option;
import com.aspose.cells.cloud.internal.Options;
import com.aspose.cells.cloud.internal.RequestAdapter;
import com.aspose.cells.cloud.internal.Support;
import com.aspose.cells.cloud.request.AggregateCellsByColorRequest;
import com.aspose.cells.cloud.request.CalculationFormulaRequest;
import com.aspose.cells.cloud.request.CategorizeSpreadsheetRequest;
import com.aspose.cells.cloud.request.MathCalculateRequest;
import com.aspose.cells.cloud.request.ReportAIAnalysisRequest;
import com.aspose.cells.cloud.request.SummarizeSpreadsheetRequest;

/**
 * AI report-analysis and calculation facades (v4.0 API).
 *
 * <p>Response-returning operations return the raw {@link RichResponse}; use
 * {@link RichResponse#toString()} for markdown text or
 * {@link RichResponse#getJson(Class)} for JSON bodies.</p>
 */
public final class Reporting {

    private Reporting() {
        // Static facade — no instances.
    }

    /**
     * Runs an AI report analysis and returns the response (markdown text).
     *
     * <p>Uses {@code PUT /v4.0/cells/ai/report/analysis}.</p>
     */
    public static RichResponse reportAnalysis(CellsCloudClient client, DataSource src,
                                              Option... options) {
        Support.require(src != null, "source is required");
        return execute(client, new ReportAIAnalysisRequest(spreadsheet(src)), options);
    }

    /** Convenience overload reading a local path. */
    public static RichResponse reportAnalysis(CellsCloudClient client, String srcPath,
                                              Option... options) {
        return reportAnalysis(client, new FilePathSource(srcPath), options);
    }

    /** Convenience overload reading an in-memory byte array. */
    public static RichResponse reportAnalysis(CellsCloudClient client, byte[] src,
                                              Option... options) {
        return reportAnalysis(client, new BytesSource(src), options);
    }

    /**
     * Generates an AI summary and writes the markdown text to {@code sink}.
     *
     * <p>Uses {@code PUT /v4.0/cells/ai/summarize/spreadsheet}.</p>
     */
    public static void summarize(CellsCloudClient client, DataSource src, DataSink sink,
                                 Option... options) {
        Support.require(src != null && sink != null, "source and sink are required");
        RichResponse response = execute(client, new SummarizeSpreadsheetRequest(spreadsheet(src)),
                options);
        Support.writeSink(sink, Support.responseBytes(response));
    }

    /** Convenience overload reading from a local path and writing to a local path. */
    public static void summarize(CellsCloudClient client, String srcPath, String sinkPath,
                                 Option... options) {
        summarize(client, new FilePathSource(srcPath),
                new com.aspose.cells.cloud.datasource.FilePathSink(sinkPath), options);
    }

    /** Convenience overload reading an in-memory byte array. */
    public static void summarize(CellsCloudClient client, byte[] src, DataSink sink,
                                 Option... options) {
        summarize(client, new BytesSource(src), sink, options);
    }

    /**
     * Aggregates cells by color and returns the response. Scope the aggregation
     * with {@link ReportingOptions#worksheet}, {@link ReportingOptions#range},
     * {@link ReportingOptions#operation} and
     * {@link ReportingOptions#colorPosition}.
     *
     * <p>Uses {@code PUT /v4.0/cells/calculate/aggergate/color}.</p>
     */
    public static RichResponse aggregateByColor(CellsCloudClient client, DataSource src,
                                                Option... options) {
        Support.require(src != null, "source is required");
        return execute(client, new AggregateCellsByColorRequest(spreadsheet(src)), options);
    }

    /** Convenience overload reading a local path. */
    public static RichResponse aggregateByColor(CellsCloudClient client, String srcPath,
                                                Option... options) {
        return aggregateByColor(client, new FilePathSource(srcPath), options);
    }

    /** Convenience overload reading an in-memory byte array. */
    public static RichResponse aggregateByColor(CellsCloudClient client, byte[] src,
                                                Option... options) {
        return aggregateByColor(client, new BytesSource(src), options);
    }

    /**
     * Runs a math calculation over {@code value} and returns the response.
     * {@code operation} is one of {@code Add}, {@code Minus}, {@code Multiply},
     * {@code Divide} or {@code Percentage}.
     *
     * <p>Uses {@code PUT /v4.0/cells/calculate/math}.</p>
     */
    public static RichResponse mathCalculate(CellsCloudClient client, DataSource src,
                                             String operation, String value,
                                             Option... options) {
        Support.require(src != null, "source is required");
        return execute(client, new MathCalculateRequest(operation, spreadsheet(src), value),
                options);
    }

    /** Convenience overload reading a local path. */
    public static RichResponse mathCalculate(CellsCloudClient client, String srcPath,
                                             String operation, String value,
                                             Option... options) {
        return mathCalculate(client, new FilePathSource(srcPath), operation, value, options);
    }

    /** Convenience overload reading an in-memory byte array. */
    public static RichResponse mathCalculate(CellsCloudClient client, byte[] src,
                                             String operation, String value,
                                             Option... options) {
        return mathCalculate(client, new BytesSource(src), operation, value, options);
    }

    /**
     * Evaluates a formula against a worksheet of a local spreadsheet and returns
     * the response.
     *
     * <p>Uses {@code PUT /v4.0/cells/calculate/formula}.</p>
     */
    public static RichResponse calculateFormula(CellsCloudClient client, DataSource src,
                                                String worksheet, String formula,
                                                Option... options) {
        Support.require(src != null, "source is required");
        return execute(client, new CalculationFormulaRequest(formula, spreadsheet(src), worksheet),
                options);
    }

    /** Convenience overload reading a local path. */
    public static RichResponse calculateFormula(CellsCloudClient client, String srcPath,
                                                String worksheet, String formula,
                                                Option... options) {
        return calculateFormula(client, new FilePathSource(srcPath), worksheet, formula, options);
    }

    /** Convenience overload reading an in-memory byte array. */
    public static RichResponse calculateFormula(CellsCloudClient client, byte[] src,
                                                String worksheet, String formula,
                                                Option... options) {
        return calculateFormula(client, new BytesSource(src), worksheet, formula, options);
    }

    /**
     * Uses AI to classify the values of {@code targetColumn} into logical groups
     * and returns the resulting spreadsheet response. Scope with
     * {@link ReportingOptions#sheetName} and
     * {@link ReportingOptions#newColumnName}.
     *
     * <p>Uses {@code PUT /v4.0/cells/ai/categorize/spreadsheet}.</p>
     */
    public static RichResponse categorizeSpreadsheet(CellsCloudClient client, DataSource src,
                                                     String targetColumn, Option... options) {
        Support.require(src != null, "source is required");
        return execute(client, new CategorizeSpreadsheetRequest(spreadsheet(src), targetColumn),
                options);
    }

    /** Convenience overload reading a local path. */
    public static RichResponse categorizeSpreadsheet(CellsCloudClient client, String srcPath,
                                                     String targetColumn, Option... options) {
        return categorizeSpreadsheet(client, new FilePathSource(srcPath), targetColumn, options);
    }

    /** Convenience overload reading an in-memory byte array. */
    public static RichResponse categorizeSpreadsheet(CellsCloudClient client, byte[] src,
                                                     String targetColumn, Option... options) {
        return categorizeSpreadsheet(client, new BytesSource(src), targetColumn, options);
    }

    private static FormFile spreadsheet(DataSource src) {
        return FormFile.of(Support.readSource(src), "Spreadsheet");
    }

    private static RichResponse execute(CellsCloudClient client,
                                        com.aspose.cells.cloud.RequestOption generated,
                                        Option... options) {
        RequestAdapter request = new RequestAdapter(generated);
        Options.apply(request, options);
        return Support.doChecked(client, request);
    }
}
