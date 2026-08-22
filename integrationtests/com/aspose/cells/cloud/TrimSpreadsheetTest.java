package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.TrimCharacterRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for TrimSpreadsheet. */
class TrimSpreadsheetTest {
    private static CellsCloudClient client;

    @BeforeAll
    static void setup() {
        String clientId = System.getenv("CellsCloudClientId");
        String clientSecret = System.getenv("CellsCloudClientSecret");
        String baseUrl = System.getenv("CellsCloudApiBaseUrl");
        Assumptions.assumeTrue(
                clientId != null && !clientId.isEmpty() && clientSecret != null && !clientSecret.isEmpty(),
                "CellsCloudClientId and CellsCloudClientSecret must be set to run integration tests");
        client = new CellsCloudClient(clientId, clientSecret,
                baseUrl == null || baseUrl.isEmpty() ? "https://api.aspose.cloud" : baseUrl);
    }

    @Test
    void trimCharacter() {
        TrimCharacterRequest request = new TrimCharacterRequest("TestData/BookText.xlsx")
                .setTrimLeading(true)
                .setTrimTrailing(true)
                .setTrimSpaceBetweenWordTo1(true)
                .setTrimNonBreakingSpaces(true)
                .setRemoveExtraLineBreaks(true)
                .setRemoveAllLineBreaks(true);

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void startTrimCharacter() {
        TrimCharacterRequest request = new TrimCharacterRequest("TestData/BookText.xlsx")
                .setTrimLeading(true)
                .setTrimTrailing(false)
                .setTrimSpaceBetweenWordTo1(false)
                .setTrimNonBreakingSpaces(true)
                .setRemoveExtraLineBreaks(true)
                .setRemoveAllLineBreaks(true);

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void trimWorksheet() {
        // TODO: API TrimWorksheetRange not found in the specification; case skipped.
    }

    @Test
    void trimRange() {
        // TODO: API TrimWorksheetRange not found in the specification; case skipped.
    }
}
