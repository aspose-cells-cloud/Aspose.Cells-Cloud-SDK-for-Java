/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ResultDestination.java">
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


public class ResultDestination {
        @SerializedName("DestinationType")
        private String destinationType ;

        public  ResultDestination  destinationType(String  destinationType) {
            this.destinationType =  destinationType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getDestinationType() {
            return destinationType;
        }

        public void setDestinationType(String destinationType) {
            this.destinationType = destinationType;
        }

        @SerializedName("InputFile")
        private String inputFile ;

        public  ResultDestination  inputFile(String  inputFile) {
            this.inputFile =  inputFile;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getInputFile() {
            return inputFile;
        }

        public void setInputFile(String inputFile) {
            this.inputFile = inputFile;
        }

        @SerializedName("OutputFile")
        private String outputFile ;

        public  ResultDestination  outputFile(String  outputFile) {
            this.outputFile =  outputFile;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getOutputFile() {
            return outputFile;
        }

        public void setOutputFile(String outputFile) {
            this.outputFile = outputFile;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ResultDestination resultDestination = (ResultDestination) o;
            return
                Objects.equals(this.destinationType, resultDestination.destinationType) &&
                Objects.equals(this.inputFile, resultDestination.inputFile) &&
                Objects.equals(this.outputFile, resultDestination.outputFile);
      }

      @Override
      public int hashCode() {
        return Objects.hash(destinationType, inputFile, outputFile);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ResultDestination {\n");
            sb.append("    destinationType: ").append(toIndentedString(getDestinationType())).append("\n");
            sb.append("    inputFile: ").append(toIndentedString(getInputFile())).append("\n");
            sb.append("    outputFile: ").append(toIndentedString(getOutputFile())).append("\n");
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

