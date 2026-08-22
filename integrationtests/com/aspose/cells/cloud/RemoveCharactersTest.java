package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.RemoveCharactersByPositionRequest;
import com.aspose.cells.cloud.request.RemoveCharactersRequest;
import com.aspose.cells.cloud.request.RemoveDuplicateSubstringsRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for RemoveCharacters. */
class RemoveCharactersTest {
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
    void removeCharacters() {
        RemoveCharactersRequest request = new RemoveCharactersRequest("TestData/BookText.xlsx")
                .setRemoveTextMethod("RemoveCharacterSets")
                .setCharacterSets("NonPrintingCharacters")
                .setWorksheet("Text");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void removeDuplicateSubstrings() {
        RemoveDuplicateSubstringsRequest request = new RemoveDuplicateSubstringsRequest("TestData/BookText.xlsx", "Space")
                .setWorksheet("Text");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void removeCharactersWithFirstNCharacters() {
        RemoveCharactersByPositionRequest request = new RemoveCharactersByPositionRequest("TestData/BookText.xlsx")
                .setTheFirstNCharacters(5)
                .setTheLastNCharacters(3)
                .setWorksheet("Text");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void removeCharactersWithAllCharactersBeforeText() {
        RemoveCharactersByPositionRequest request = new RemoveCharactersByPositionRequest("TestData/BookText.xlsx")
                .setTheFirstNCharacters(0)
                .setTheLastNCharacters(0)
                .setAllCharactersBeforeText("Designed")
                .setAllCharactersAfterText("distance")
                .setWorksheet("Text");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void removeCharactersByPosition() {
        RemoveCharactersByPositionRequest request = new RemoveCharactersByPositionRequest("TestData/BookText.xlsx")
                .setTheFirstNCharacters(5)
                .setTheLastNCharacters(3);

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }
}
