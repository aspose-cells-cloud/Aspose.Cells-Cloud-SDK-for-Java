/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TextureFill.java">
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


public class TextureFill {
        @SerializedName("Type")
        private String type ;

        public  TextureFill  type(String  type) {
            this.type =  type;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @SerializedName("Transparency")
        private Double transparency ;

        public  TextureFill  transparency(Double  transparency) {
            this.transparency =  transparency;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getTransparency() {
            return transparency;
        }

        public void setTransparency(Double transparency) {
            this.transparency = transparency;
        }

        @SerializedName("Scale")
        private Double scale ;

        public  TextureFill  scale(Double  scale) {
            this.scale =  scale;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getScale() {
            return scale;
        }

        public void setScale(Double scale) {
            this.scale = scale;
        }

        @SerializedName("TilePicOption")
        private TilePicOption tilePicOption ;

        public  TextureFill  tilePicOption(TilePicOption  tilePicOption) {
            this.tilePicOption =  tilePicOption;
            return this;
        }

        @ApiModelProperty(value = "")
        public TilePicOption getTilePicOption() {
            return tilePicOption;
        }

        public void setTilePicOption(TilePicOption tilePicOption) {
            this.tilePicOption = tilePicOption;
        }

        @SerializedName("PicFormatOption")
        private PicFormatOption picFormatOption ;

        public  TextureFill  picFormatOption(PicFormatOption  picFormatOption) {
            this.picFormatOption =  picFormatOption;
            return this;
        }

        @ApiModelProperty(value = "")
        public PicFormatOption getPicFormatOption() {
            return picFormatOption;
        }

        public void setPicFormatOption(PicFormatOption picFormatOption) {
            this.picFormatOption = picFormatOption;
        }

        @SerializedName("Image")
        private LinkElement image ;

        public  TextureFill  image(LinkElement  image) {
            this.image =  image;
            return this;
        }

        @ApiModelProperty(value = "")
        public LinkElement getImage() {
            return image;
        }

        public void setImage(LinkElement image) {
            this.image = image;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            TextureFill textureFill = (TextureFill) o;
            return
                Objects.equals(this.type, textureFill.type) &&
                Objects.equals(this.transparency, textureFill.transparency) &&
                Objects.equals(this.scale, textureFill.scale) &&
                Objects.equals(this.tilePicOption, textureFill.tilePicOption) &&
                Objects.equals(this.picFormatOption, textureFill.picFormatOption) &&
                Objects.equals(this.image, textureFill.image);
      }

      @Override
      public int hashCode() {
        return Objects.hash(type, transparency, scale, tilePicOption, picFormatOption, image);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TextureFill {\n");
            sb.append("    type: ").append(toIndentedString(getType())).append("\n");
            sb.append("    transparency: ").append(toIndentedString(getTransparency())).append("\n");
            sb.append("    scale: ").append(toIndentedString(getScale())).append("\n");
            sb.append("    tilePicOption: ").append(toIndentedString(getTilePicOption())).append("\n");
            sb.append("    picFormatOption: ").append(toIndentedString(getPicFormatOption())).append("\n");
            sb.append("    image: ").append(toIndentedString(getImage())).append("\n");
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

