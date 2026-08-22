package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** RemoveCharactersByCharacter — Class summary: The features include fast and reliable performance, high-quality camera with portrait mode, long-lasting battery life, and a durable water-resistant design. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveCharactersByCharacter {
    /** Property: "RemoveTextMethod" is serialized using a string representation of the enum value. */
    @JsonProperty("RemoveTextMethod")
    private String removeTextMethod;

    /** Gets or sets RemoveCharacters. */
    @JsonProperty("RemoveCharacters")
    private List<String> removeCharacters;

    /** Gets or sets RemoveCharacterSetsType. */
    @JsonProperty("RemoveCharacterSetsType")
    private String removeCharacterSetsType;

    public String getRemoveTextMethod() { return removeTextMethod; }
    public RemoveCharactersByCharacter setRemoveTextMethod(String removeTextMethod) { this.removeTextMethod = removeTextMethod; return this; }

    public List<String> getRemoveCharacters() { return removeCharacters; }
    public RemoveCharactersByCharacter setRemoveCharacters(List<String> removeCharacters) { this.removeCharacters = removeCharacters; return this; }

    public String getRemoveCharacterSetsType() { return removeCharacterSetsType; }
    public RemoveCharactersByCharacter setRemoveCharacterSetsType(String removeCharacterSetsType) { this.removeCharacterSetsType = removeCharacterSetsType; return this; }

}
