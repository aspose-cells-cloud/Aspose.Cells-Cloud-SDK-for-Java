/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="RemoveCharactersByCharacter.java">
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

public class RemoveCharactersByCharacter {

    @SerializedName("RemoveTextMethod")
    @JsonProperty("RemoveTextMethod")
    private String removeTextMethod;

    public RemoveCharactersByCharacter removeTextMethod(String removeTextMethod) {
        this.removeTextMethod = removeTextMethod;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getRemoveTextMethod() {
        return removeTextMethod;
    }

    public void setRemoveTextMethod(String removeTextMethod) {
        this.removeTextMethod = removeTextMethod;
    }

    @SerializedName("RemoveCharacters")
    @JsonProperty("RemoveCharacters")
    private List<String> removeCharacters;

    public RemoveCharactersByCharacter removeCharacters(List<String> removeCharacters) {
        this.removeCharacters = removeCharacters;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<String> getRemoveCharacters() {
        return removeCharacters;
    }

    public void setRemoveCharacters(List<String> removeCharacters) {
        this.removeCharacters = removeCharacters;
    }

    @SerializedName("RemoveCharacterSetsType")
    @JsonProperty("RemoveCharacterSetsType")
    private String removeCharacterSetsType;

    public RemoveCharactersByCharacter removeCharacterSetsType(String removeCharacterSetsType) {
        this.removeCharacterSetsType = removeCharacterSetsType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getRemoveCharacterSetsType() {
        return removeCharacterSetsType;
    }

    public void setRemoveCharacterSetsType(String removeCharacterSetsType) {
        this.removeCharacterSetsType = removeCharacterSetsType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RemoveCharactersByCharacter other = (RemoveCharactersByCharacter) o;
        return Objects.equals(this.removeTextMethod, other.removeTextMethod)
            && Objects.equals(this.removeCharacters, other.removeCharacters)
            && Objects.equals(this.removeCharacterSetsType, other.removeCharacterSetsType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(removeTextMethod, removeCharacters, removeCharacterSetsType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveCharactersByCharacter {\n");
        sb.append("    removeTextMethod: ").append(removeTextMethod).append("\n");
        sb.append("    removeCharacters: ").append(removeCharacters).append("\n");
        sb.append("    removeCharacterSetsType: ").append(removeCharacterSetsType).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
