package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RemoveCharactersByPosition model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveCharactersByPosition {
    /** Gets or sets TheFirstNCharacters. */
    @JsonProperty("TheFirstNCharacters")
    private Integer theFirstNCharacters;

    /** Gets or sets TheLastNCharacters. */
    @JsonProperty("TheLastNCharacters")
    private Integer theLastNCharacters;

    /** Gets or sets AllCharactersBeforeText. */
    @JsonProperty("AllCharactersBeforeText")
    private String allCharactersBeforeText;

    /** Gets or sets AllCharactersAfterText. */
    @JsonProperty("AllCharactersAfterText")
    private String allCharactersAfterText;

    public Integer getTheFirstNCharacters() { return theFirstNCharacters; }
    public RemoveCharactersByPosition setTheFirstNCharacters(Integer theFirstNCharacters) { this.theFirstNCharacters = theFirstNCharacters; return this; }

    public Integer getTheLastNCharacters() { return theLastNCharacters; }
    public RemoveCharactersByPosition setTheLastNCharacters(Integer theLastNCharacters) { this.theLastNCharacters = theLastNCharacters; return this; }

    public String getAllCharactersBeforeText() { return allCharactersBeforeText; }
    public RemoveCharactersByPosition setAllCharactersBeforeText(String allCharactersBeforeText) { this.allCharactersBeforeText = allCharactersBeforeText; return this; }

    public String getAllCharactersAfterText() { return allCharactersAfterText; }
    public RemoveCharactersByPosition setAllCharactersAfterText(String allCharactersAfterText) { this.allCharactersAfterText = allCharactersAfterText; return this; }

}
