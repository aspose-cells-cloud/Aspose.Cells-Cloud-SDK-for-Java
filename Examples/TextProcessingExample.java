package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.CellsCloudClient;
import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.request.AddTextRequest;
import com.aspose.cells.cloud.request.ConvertTextRequest;
import com.aspose.cells.cloud.request.TrimCharacterRequest;
import com.aspose.cells.cloud.request.UpdateWordCaseRequest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Text processing on a local spreadsheet: trimming, word case, adding text and
 * text conversion.
 *
 * <p>Each request attaches the workbook bytes and returns the updated workbook,
 * which is written to {@code outN.xlsx}. Results can be chained by feeding one
 * output into the next call.</p>
 */
public final class TextProcessingExample {

    private static final String INPUT = "BookText.xlsx";

    public static void main(String[] args) throws IOException {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));

        // Trim leading/trailing characters and repeated spaces in the whole file.
        TrimCharacterRequest trimAll = new TrimCharacterRequest(FormFile.ofPath(INPUT));
        trimAll.setTrimLeading(true);
        trimAll.setTrimTrailing(true);
        trimAll.setTrimSpaceBetweenWordTo1(true);
        run(client, "out.xlsx", trimAll);

        // Trim a single cell range.
        TrimCharacterRequest trimRange = new TrimCharacterRequest(FormFile.ofPath(INPUT));
        trimRange.setTrimLeading(true);
        trimRange.setTrimTrailing(true);
        trimRange.setTrimSpaceBetweenWordTo1(true);
        trimRange.setWorksheet("Text");
        trimRange.setRange("J6:J6");
        run(client, "out1.xlsx", trimRange);

        // Trim trailing characters and extra line breaks in a single cell.
        TrimCharacterRequest trimCell = new TrimCharacterRequest(FormFile.ofPath(INPUT));
        trimCell.setTrimLeading(true);
        trimCell.setTrimTrailing(false);
        trimCell.setTrimSpaceBetweenWordTo1(true);
        trimCell.setRemoveExtraLineBreaks(true);
        trimCell.setWorksheet("Text");
        trimCell.setRange("J7:J7");
        run(client, "out2.xlsx", trimCell);

        // Change the word case of a cell, chaining each result into the next call.
        run(client, "out3.xlsx", wordCase(INPUT, "UpperCase"));
        run(client, "out4.xlsx", wordCase("out3.xlsx", "LowerCase"));
        run(client, "out5.xlsx", wordCase("out4.xlsx", "ProperCase"));
        run(client, "out6.xlsx", wordCase("out5.xlsx", "SentenceCase"));

        // Add text at the beginning of the workbook.
        run(client, "out7.xlsx",
                new AddTextRequest("AtTheBeginning", FormFile.ofPath(INPUT), "Hello, "));

        // Add text after the selected text.
        AddTextRequest afterText =
                new AddTextRequest("AfterText", FormFile.ofPath(INPUT), "!");
        afterText.setSelectText("hello world");
        run(client, "out8.xlsx", afterText);

        // Add text at the end of a cell range.
        AddTextRequest atTheEnd = new AddTextRequest("AtTheEnd", FormFile.ofPath(INPUT), "!");
        atTheEnd.setWorksheet("Text");
        atTheEnd.setRange("A1:J7");
        run(client, "out9.xlsx", atTheEnd);

        // Convert numbers to text.
        run(client, "out10.xlsx",
                new ConvertTextRequest("ConvertNumberToText", FormFile.ofPath(INPUT)));

        // Convert characters.
        ConvertTextRequest characters =
                new ConvertTextRequest("ConvertCharacters", FormFile.ofPath(INPUT));
        characters.setSourceCharacters("1");
        characters.setTargetCharacters("Hello World");
        characters.setWorksheet("Text");
        characters.setRange("A1:J7");
        run(client, "out11.xlsx", characters);

        // Convert line breaks.
        ConvertTextRequest linebreak =
                new ConvertTextRequest("ConvertLinebreak", FormFile.ofPath(INPUT));
        linebreak.setSourceCharacters("");
        linebreak.setTargetCharacters("Linebreak");
        run(client, "out12.xlsx", linebreak);

        // Convert whitespace.
        ConvertTextRequest whitespace =
                new ConvertTextRequest("ConvertWriteSpace", FormFile.ofPath(INPUT));
        whitespace.setSourceCharacters("");
        whitespace.setTargetCharacters("WriteSpace");
        run(client, "out13.xlsx", whitespace);
    }

    private static UpdateWordCaseRequest wordCase(String input, String wordCaseType) {
        UpdateWordCaseRequest request =
                new UpdateWordCaseRequest(FormFile.ofPath(input), wordCaseType);
        request.setWorksheet("Text");
        request.setRange("J7:J7");
        return request;
    }

    /** Executes a local content request and writes the returned workbook to {@code outPath}. */
    private static void run(CellsCloudClient client, String outPath, RequestOption request)
            throws IOException {
        byte[] body = client.call(request).getBody();
        Files.write(Paths.get(outPath), body);
        System.out.println("Saved " + outPath + ".");
    }
}
