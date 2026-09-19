/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="RenderingWatermark.java">
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


public class RenderingWatermark {
        @SerializedName("Rotation")
        private Double rotation ;

        public  RenderingWatermark  rotation(Double  rotation) {
            this.rotation =  rotation;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getRotation() {
            return rotation;
        }

        public void setRotation(Double rotation) {
            this.rotation = rotation;
        }

        @SerializedName("ScaleToPagePercent")
        private Integer scaleToPagePercent ;

        public  RenderingWatermark  scaleToPagePercent(Integer  scaleToPagePercent) {
            this.scaleToPagePercent =  scaleToPagePercent;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getScaleToPagePercent() {
            return scaleToPagePercent;
        }

        public void setScaleToPagePercent(Integer scaleToPagePercent) {
            this.scaleToPagePercent = scaleToPagePercent;
        }

        @SerializedName("Opacity")
        private Double opacity ;

        public  RenderingWatermark  opacity(Double  opacity) {
            this.opacity =  opacity;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getOpacity() {
            return opacity;
        }

        public void setOpacity(Double opacity) {
            this.opacity = opacity;
        }

        @SerializedName("IsBackground")
        private Boolean isBackground ;

        public  RenderingWatermark  isBackground(Boolean  isBackground) {
            this.isBackground =  isBackground;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsBackground() {
            return isBackground;
        }

        public void setIsBackground(Boolean isBackground) {
            this.isBackground = isBackground;
        }

        @SerializedName("Text")
        private String text ;

        public  RenderingWatermark  text(String  text) {
            this.text =  text;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        @SerializedName("Font")
        private RenderingFont font ;

        public  RenderingWatermark  font(RenderingFont  font) {
            this.font =  font;
            return this;
        }

        @ApiModelProperty(value = "")
        public RenderingFont getFont() {
            return font;
        }

        public void setFont(RenderingFont font) {
            this.font = font;
        }

        @SerializedName("Image")
        private byte[] image ;

        public  RenderingWatermark  image(byte[]  image) {
            this.image =  image;
            return this;
        }

        @ApiModelProperty(value = "")
        public byte[] getImage() {
            return image;
        }

        public void setImage(byte[] image) {
            this.image = image;
        }

        @SerializedName("HAlignment")
        private String hAlignment ;

        public  RenderingWatermark  hAlignment(String  hAlignment) {
            this.hAlignment =  hAlignment;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getHAlignment() {
            return hAlignment;
        }

        public void setHAlignment(String hAlignment) {
            this.hAlignment = hAlignment;
        }

        @SerializedName("VAlignment")
        private String vAlignment ;

        public  RenderingWatermark  vAlignment(String  vAlignment) {
            this.vAlignment =  vAlignment;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getVAlignment() {
            return vAlignment;
        }

        public void setVAlignment(String vAlignment) {
            this.vAlignment = vAlignment;
        }

        @SerializedName("OffsetX")
        private Double offsetX ;

        public  RenderingWatermark  offsetX(Double  offsetX) {
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

        public  RenderingWatermark  offsetY(Double  offsetY) {
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

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            RenderingWatermark renderingWatermark = (RenderingWatermark) o;
            return
                Objects.equals(this.rotation, renderingWatermark.rotation) &&
                Objects.equals(this.scaleToPagePercent, renderingWatermark.scaleToPagePercent) &&
                Objects.equals(this.opacity, renderingWatermark.opacity) &&
                Objects.equals(this.isBackground, renderingWatermark.isBackground) &&
                Objects.equals(this.text, renderingWatermark.text) &&
                Objects.equals(this.font, renderingWatermark.font) &&
                Objects.equals(this.image, renderingWatermark.image) &&
                Objects.equals(this.hAlignment, renderingWatermark.hAlignment) &&
                Objects.equals(this.vAlignment, renderingWatermark.vAlignment) &&
                Objects.equals(this.offsetX, renderingWatermark.offsetX) &&
                Objects.equals(this.offsetY, renderingWatermark.offsetY);
      }

      @Override
      public int hashCode() {
        return Objects.hash(rotation, scaleToPagePercent, opacity, isBackground, text, font, image, hAlignment, vAlignment, offsetX, offsetY);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RenderingWatermark {\n");
            sb.append("    rotation: ").append(toIndentedString(getRotation())).append("\n");
            sb.append("    scaleToPagePercent: ").append(toIndentedString(getScaleToPagePercent())).append("\n");
            sb.append("    opacity: ").append(toIndentedString(getOpacity())).append("\n");
            sb.append("    isBackground: ").append(toIndentedString(getIsBackground())).append("\n");
            sb.append("    text: ").append(toIndentedString(getText())).append("\n");
            sb.append("    font: ").append(toIndentedString(getFont())).append("\n");
            sb.append("    image: ").append(toIndentedString(getImage())).append("\n");
            sb.append("    hAlignment: ").append(toIndentedString(getHAlignment())).append("\n");
            sb.append("    vAlignment: ").append(toIndentedString(getVAlignment())).append("\n");
            sb.append("    offsetX: ").append(toIndentedString(getOffsetX())).append("\n");
            sb.append("    offsetY: ").append(toIndentedString(getOffsetY())).append("\n");
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

