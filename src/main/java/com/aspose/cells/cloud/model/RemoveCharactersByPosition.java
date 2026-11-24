/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="RemoveCharactersByPosition.java">
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

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class RemoveCharactersByPosition {

    @SerializedName("TheFirstNCharacters")
    @JsonProperty("TheFirstNCharacters")
    private Integer theFirstNCharacters;

    public RemoveCharactersByPosition theFirstNCharacters(Integer theFirstNCharacters) {
        this.theFirstNCharacters = theFirstNCharacters;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getTheFirstNCharacters() {
        return theFirstNCharacters;
    }

    public void setTheFirstNCharacters(Integer theFirstNCharacters) {
        this.theFirstNCharacters = theFirstNCharacters;
    }

    @SerializedName("TheLastNCharacters")
    @JsonProperty("TheLastNCharacters")
    private Integer theLastNCharacters;

    public RemoveCharactersByPosition theLastNCharacters(Integer theLastNCharacters) {
        this.theLastNCharacters = theLastNCharacters;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getTheLastNCharacters() {
        return theLastNCharacters;
    }

    public void setTheLastNCharacters(Integer theLastNCharacters) {
        this.theLastNCharacters = theLastNCharacters;
    }

    @SerializedName("AllCharactersBeforeText")
    @JsonProperty("AllCharactersBeforeText")
    private String allCharactersBeforeText;

    public RemoveCharactersByPosition allCharactersBeforeText(String allCharactersBeforeText) {
        this.allCharactersBeforeText = allCharactersBeforeText;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getAllCharactersBeforeText() {
        return allCharactersBeforeText;
    }

    public void setAllCharactersBeforeText(String allCharactersBeforeText) {
        this.allCharactersBeforeText = allCharactersBeforeText;
    }

    @SerializedName("AllCharactersAfterText")
    @JsonProperty("AllCharactersAfterText")
    private String allCharactersAfterText;

    public RemoveCharactersByPosition allCharactersAfterText(String allCharactersAfterText) {
        this.allCharactersAfterText = allCharactersAfterText;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getAllCharactersAfterText() {
        return allCharactersAfterText;
    }

    public void setAllCharactersAfterText(String allCharactersAfterText) {
        this.allCharactersAfterText = allCharactersAfterText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RemoveCharactersByPosition other = (RemoveCharactersByPosition) o;
        return Objects.equals(this.theFirstNCharacters, other.theFirstNCharacters)
            && Objects.equals(this.theLastNCharacters, other.theLastNCharacters)
            && Objects.equals(this.allCharactersBeforeText, other.allCharactersBeforeText)
            && Objects.equals(this.allCharactersAfterText, other.allCharactersAfterText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(theFirstNCharacters, theLastNCharacters, allCharactersBeforeText, allCharactersAfterText);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveCharactersByPosition {\n");
        sb.append("    theFirstNCharacters: ").append(theFirstNCharacters).append("\n");
        sb.append("    theLastNCharacters: ").append(theLastNCharacters).append("\n");
        sb.append("    allCharactersBeforeText: ").append(allCharactersBeforeText).append("\n");
        sb.append("    allCharactersAfterText: ").append(allCharactersAfterText).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
