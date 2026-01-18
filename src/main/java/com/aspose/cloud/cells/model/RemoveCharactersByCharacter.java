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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class RemoveCharactersByCharacter {
        @SerializedName("RemoveTextMethod")
        private String removeTextMethod ;

        public  RemoveCharactersByCharacter  removeTextMethod(String  removeTextMethod) {
            this.removeTextMethod =  removeTextMethod;
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
        private List<String> removeCharacters ;

        public  RemoveCharactersByCharacter  removeCharacters(List<String>  removeCharacters) {
            this.removeCharacters =  removeCharacters;
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
        private String removeCharacterSetsType ;

        public  RemoveCharactersByCharacter  removeCharacterSetsType(String  removeCharacterSetsType) {
            this.removeCharacterSetsType =  removeCharacterSetsType;
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
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            RemoveCharactersByCharacter removeCharactersByCharacter = (RemoveCharactersByCharacter) o;
            return
                Objects.equals(this.removeTextMethod, removeCharactersByCharacter.removeTextMethod) &&
                Objects.equals(this.removeCharacters, removeCharactersByCharacter.removeCharacters) &&
                Objects.equals(this.removeCharacterSetsType, removeCharactersByCharacter.removeCharacterSetsType);
      }

      @Override
      public int hashCode() {
        return Objects.hash(removeTextMethod, removeCharacters, removeCharacterSetsType);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RemoveCharactersByCharacter {\n");
            sb.append("    removeTextMethod: ").append(toIndentedString(getRemoveTextMethod())).append("\n");
            sb.append("    removeCharacters: ").append(toIndentedString(getRemoveCharacters())).append("\n");
            sb.append("    removeCharacterSetsType: ").append(toIndentedString(getRemoveCharacterSetsType())).append("\n");
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

