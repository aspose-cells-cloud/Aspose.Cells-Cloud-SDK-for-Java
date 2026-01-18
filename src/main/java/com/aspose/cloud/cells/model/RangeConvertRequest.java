/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="RangeConvertRequest.java">
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


public class RangeConvertRequest {
        @SerializedName("Source")
        private Range source ;

        public  RangeConvertRequest  source(Range  source) {
            this.source =  source;
            return this;
        }

        @ApiModelProperty(value = "")
        public Range getSource() {
            return source;
        }

        public void setSource(Range source) {
            this.source = source;
        }

        @SerializedName("ImageType")
        private String imageType ;

        public  RangeConvertRequest  imageType(String  imageType) {
            this.imageType =  imageType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getImageType() {
            return imageType;
        }

        public void setImageType(String imageType) {
            this.imageType = imageType;
        }

        @SerializedName("ImageOrPrintOptions")
        private ImageOrPrintOptions imageOrPrintOptions ;

        public  RangeConvertRequest  imageOrPrintOptions(ImageOrPrintOptions  imageOrPrintOptions) {
            this.imageOrPrintOptions =  imageOrPrintOptions;
            return this;
        }

        @ApiModelProperty(value = "")
        public ImageOrPrintOptions getImageOrPrintOptions() {
            return imageOrPrintOptions;
        }

        public void setImageOrPrintOptions(ImageOrPrintOptions imageOrPrintOptions) {
            this.imageOrPrintOptions = imageOrPrintOptions;
        }

        @SerializedName("PageSetup")
        private PageSetup pageSetup ;

        public  RangeConvertRequest  pageSetup(PageSetup  pageSetup) {
            this.pageSetup =  pageSetup;
            return this;
        }

        @ApiModelProperty(value = "")
        public PageSetup getPageSetup() {
            return pageSetup;
        }

        public void setPageSetup(PageSetup pageSetup) {
            this.pageSetup = pageSetup;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            RangeConvertRequest rangeConvertRequest = (RangeConvertRequest) o;
            return
                Objects.equals(this.source, rangeConvertRequest.source) &&
                Objects.equals(this.imageType, rangeConvertRequest.imageType) &&
                Objects.equals(this.imageOrPrintOptions, rangeConvertRequest.imageOrPrintOptions) &&
                Objects.equals(this.pageSetup, rangeConvertRequest.pageSetup);
      }

      @Override
      public int hashCode() {
        return Objects.hash(source, imageType, imageOrPrintOptions, pageSetup);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RangeConvertRequest {\n");
            sb.append("    source: ").append(toIndentedString(getSource())).append("\n");
            sb.append("    imageType: ").append(toIndentedString(getImageType())).append("\n");
            sb.append("    imageOrPrintOptions: ").append(toIndentedString(getImageOrPrintOptions())).append("\n");
            sb.append("    pageSetup: ").append(toIndentedString(getPageSetup())).append("\n");
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

