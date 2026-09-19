/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TilePicOption.java">
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


public class TilePicOption {
        @SerializedName("OffsetX")
        private Double offsetX ;

        public  TilePicOption  offsetX(Double  offsetX) {
            this.offsetX =  offsetX;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getOffsetX() {
            return offsetX;
        }

        public void setOffsetX(Double offsetX) {
            this.offsetX = offsetX;
        }

        @SerializedName("OffsetY")
        private Double offsetY ;

        public  TilePicOption  offsetY(Double  offsetY) {
            this.offsetY =  offsetY;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getOffsetY() {
            return offsetY;
        }

        public void setOffsetY(Double offsetY) {
            this.offsetY = offsetY;
        }

        @SerializedName("ScaleX")
        private Double scaleX ;

        public  TilePicOption  scaleX(Double  scaleX) {
            this.scaleX =  scaleX;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getScaleX() {
            return scaleX;
        }

        public void setScaleX(Double scaleX) {
            this.scaleX = scaleX;
        }

        @SerializedName("ScaleY")
        private Double scaleY ;

        public  TilePicOption  scaleY(Double  scaleY) {
            this.scaleY =  scaleY;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getScaleY() {
            return scaleY;
        }

        public void setScaleY(Double scaleY) {
            this.scaleY = scaleY;
        }

        @SerializedName("AlignmentType")
        private String alignmentType ;

        public  TilePicOption  alignmentType(String  alignmentType) {
            this.alignmentType =  alignmentType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAlignmentType() {
            return alignmentType;
        }

        public void setAlignmentType(String alignmentType) {
            this.alignmentType = alignmentType;
        }

        @SerializedName("MirrorType")
        private String mirrorType ;

        public  TilePicOption  mirrorType(String  mirrorType) {
            this.mirrorType =  mirrorType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getMirrorType() {
            return mirrorType;
        }

        public void setMirrorType(String mirrorType) {
            this.mirrorType = mirrorType;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            TilePicOption tilePicOption = (TilePicOption) o;
            return
                Objects.equals(this.offsetX, tilePicOption.offsetX) &&
                Objects.equals(this.offsetY, tilePicOption.offsetY) &&
                Objects.equals(this.scaleX, tilePicOption.scaleX) &&
                Objects.equals(this.scaleY, tilePicOption.scaleY) &&
                Objects.equals(this.alignmentType, tilePicOption.alignmentType) &&
                Objects.equals(this.mirrorType, tilePicOption.mirrorType);
      }

      @Override
      public int hashCode() {
        return Objects.hash(offsetX, offsetY, scaleX, scaleY, alignmentType, mirrorType);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TilePicOption {\n");
            sb.append("    offsetX: ").append(toIndentedString(getOffsetX())).append("\n");
            sb.append("    offsetY: ").append(toIndentedString(getOffsetY())).append("\n");
            sb.append("    scaleX: ").append(toIndentedString(getScaleX())).append("\n");
            sb.append("    scaleY: ").append(toIndentedString(getScaleY())).append("\n");
            sb.append("    alignmentType: ").append(toIndentedString(getAlignmentType())).append("\n");
            sb.append("    mirrorType: ").append(toIndentedString(getMirrorType())).append("\n");
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

