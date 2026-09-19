/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="BatchProtectRequest.java">
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


public class BatchProtectRequest {
        @SerializedName("SourceFolder")
        private String sourceFolder ;

        public  BatchProtectRequest  sourceFolder(String  sourceFolder) {
            this.sourceFolder =  sourceFolder;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSourceFolder() {
            return sourceFolder;
        }

        public void setSourceFolder(String sourceFolder) {
            this.sourceFolder = sourceFolder;
        }

        @SerializedName("SourceStorage")
        private String sourceStorage ;

        public  BatchProtectRequest  sourceStorage(String  sourceStorage) {
            this.sourceStorage =  sourceStorage;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSourceStorage() {
            return sourceStorage;
        }

        public void setSourceStorage(String sourceStorage) {
            this.sourceStorage = sourceStorage;
        }

        @SerializedName("MatchCondition")
        private MatchConditionRequest matchCondition ;

        public  BatchProtectRequest  matchCondition(MatchConditionRequest  matchCondition) {
            this.matchCondition =  matchCondition;
            return this;
        }

        @ApiModelProperty(value = "")
        public MatchConditionRequest getMatchCondition() {
            return matchCondition;
        }

        public void setMatchCondition(MatchConditionRequest matchCondition) {
            this.matchCondition = matchCondition;
        }

        @SerializedName("ProtectionType")
        private String protectionType ;

        public  BatchProtectRequest  protectionType(String  protectionType) {
            this.protectionType =  protectionType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getProtectionType() {
            return protectionType;
        }

        public void setProtectionType(String protectionType) {
            this.protectionType = protectionType;
        }

        @SerializedName("Password")
        private String password ;

        public  BatchProtectRequest  password(String  password) {
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

        @SerializedName("OutFolder")
        private String outFolder ;

        public  BatchProtectRequest  outFolder(String  outFolder) {
            this.outFolder =  outFolder;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getOutFolder() {
            return outFolder;
        }

        public void setOutFolder(String outFolder) {
            this.outFolder = outFolder;
        }

        @SerializedName("OutStorage")
        private String outStorage ;

        public  BatchProtectRequest  outStorage(String  outStorage) {
            this.outStorage =  outStorage;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getOutStorage() {
            return outStorage;
        }

        public void setOutStorage(String outStorage) {
            this.outStorage = outStorage;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            BatchProtectRequest batchProtectRequest = (BatchProtectRequest) o;
            return
                Objects.equals(this.sourceFolder, batchProtectRequest.sourceFolder) &&
                Objects.equals(this.sourceStorage, batchProtectRequest.sourceStorage) &&
                Objects.equals(this.matchCondition, batchProtectRequest.matchCondition) &&
                Objects.equals(this.protectionType, batchProtectRequest.protectionType) &&
                Objects.equals(this.password, batchProtectRequest.password) &&
                Objects.equals(this.outFolder, batchProtectRequest.outFolder) &&
                Objects.equals(this.outStorage, batchProtectRequest.outStorage);
      }

      @Override
      public int hashCode() {
        return Objects.hash(sourceFolder, sourceStorage, matchCondition, protectionType, password, outFolder, outStorage);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BatchProtectRequest {\n");
            sb.append("    sourceFolder: ").append(toIndentedString(getSourceFolder())).append("\n");
            sb.append("    sourceStorage: ").append(toIndentedString(getSourceStorage())).append("\n");
            sb.append("    matchCondition: ").append(toIndentedString(getMatchCondition())).append("\n");
            sb.append("    protectionType: ").append(toIndentedString(getProtectionType())).append("\n");
            sb.append("    password: ").append(toIndentedString(getPassword())).append("\n");
            sb.append("    outFolder: ").append(toIndentedString(getOutFolder())).append("\n");
            sb.append("    outStorage: ").append(toIndentedString(getOutStorage())).append("\n");
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

