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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class RemoveCharactersByPosition {
        @SerializedName("TheFirstNCharacters")
        private Integer theFirstNCharacters ;

        public  RemoveCharactersByPosition  theFirstNCharacters(Integer  theFirstNCharacters) {
            this.theFirstNCharacters =  theFirstNCharacters;
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
        private Integer theLastNCharacters ;

        public  RemoveCharactersByPosition  theLastNCharacters(Integer  theLastNCharacters) {
            this.theLastNCharacters =  theLastNCharacters;
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
        private String allCharactersBeforeText ;

        public  RemoveCharactersByPosition  allCharactersBeforeText(String  allCharactersBeforeText) {
            this.allCharactersBeforeText =  allCharactersBeforeText;
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
        private String allCharactersAfterText ;

        public  RemoveCharactersByPosition  allCharactersAfterText(String  allCharactersAfterText) {
            this.allCharactersAfterText =  allCharactersAfterText;
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
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            RemoveCharactersByPosition removeCharactersByPosition = (RemoveCharactersByPosition) o;
            return
                Objects.equals(this.theFirstNCharacters, removeCharactersByPosition.theFirstNCharacters) &&
                Objects.equals(this.theLastNCharacters, removeCharactersByPosition.theLastNCharacters) &&
                Objects.equals(this.allCharactersBeforeText, removeCharactersByPosition.allCharactersBeforeText) &&
                Objects.equals(this.allCharactersAfterText, removeCharactersByPosition.allCharactersAfterText);
      }

      @Override
      public int hashCode() {
        return Objects.hash(theFirstNCharacters, theLastNCharacters, allCharactersBeforeText, allCharactersAfterText);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RemoveCharactersByPosition {\n");
            sb.append("    theFirstNCharacters: ").append(toIndentedString(getTheFirstNCharacters())).append("\n");
            sb.append("    theLastNCharacters: ").append(toIndentedString(getTheLastNCharacters())).append("\n");
            sb.append("    allCharactersBeforeText: ").append(toIndentedString(getAllCharactersBeforeText())).append("\n");
            sb.append("    allCharactersAfterText: ").append(toIndentedString(getAllCharactersAfterText())).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
        * Convert the given object to string with each line indented by 4 spaces
        * (except the first line).
        */
        private String toIndentedString(java.lang.Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }


}

