/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="WorkbookEncryptionRequest.java">
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


public class WorkbookEncryptionRequest {
        @SerializedName("EncryptionType")
        private String encryptionType ;

        public  WorkbookEncryptionRequest  encryptionType(String  encryptionType) {
            this.encryptionType =  encryptionType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getEncryptionType() {
            return encryptionType;
        }

        public void setEncryptionType(String encryptionType) {
            this.encryptionType = encryptionType;
        }

        @SerializedName("KeyLength")
        private Integer keyLength ;

        public  WorkbookEncryptionRequest  keyLength(Integer  keyLength) {
            this.keyLength =  keyLength;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getKeyLength() {
            return keyLength;
        }

        public void setKeyLength(Integer keyLength) {
            this.keyLength = keyLength;
        }

        @SerializedName("Password")
        private String password ;

        public  WorkbookEncryptionRequest  password(String  password) {
            this.password =  password;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            WorkbookEncryptionRequest workbookEncryptionRequest = (WorkbookEncryptionRequest) o;
            return
                Objects.equals(this.encryptionType, workbookEncryptionRequest.encryptionType) &&
                Objects.equals(this.keyLength, workbookEncryptionRequest.keyLength) &&
                Objects.equals(this.password, workbookEncryptionRequest.password);
      }

      @Override
      public int hashCode() {
        return Objects.hash(encryptionType, keyLength, password);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WorkbookEncryptionRequest {\n");
            sb.append("    encryptionType: ").append(toIndentedString(getEncryptionType())).append("\n");
            sb.append("    keyLength: ").append(toIndentedString(getKeyLength())).append("\n");
            sb.append("    password: ").append(toIndentedString(getPassword())).append("\n");
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

