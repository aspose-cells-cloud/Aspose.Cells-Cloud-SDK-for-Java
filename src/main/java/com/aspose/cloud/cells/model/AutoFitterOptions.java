/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AutoFitterOptions.java">
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


public class AutoFitterOptions {
        @SerializedName("AutoFitMergedCellsType")
        private String autoFitMergedCellsType ;

        public  AutoFitterOptions  autoFitMergedCellsType(String  autoFitMergedCellsType) {
            this.autoFitMergedCellsType =  autoFitMergedCellsType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAutoFitMergedCellsType() {
            return autoFitMergedCellsType;
        }

        public void setAutoFitMergedCellsType(String autoFitMergedCellsType) {
            this.autoFitMergedCellsType = autoFitMergedCellsType;
        }

        @SerializedName("IgnoreHidden")
        private Boolean ignoreHidden ;

        public  AutoFitterOptions  ignoreHidden(Boolean  ignoreHidden) {
            this.ignoreHidden =  ignoreHidden;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIgnoreHidden() {
            return ignoreHidden;
        }

        public void setIgnoreHidden(Boolean ignoreHidden) {
            this.ignoreHidden = ignoreHidden;
        }

        @SerializedName("OnlyAuto")
        private Boolean onlyAuto ;

        public  AutoFitterOptions  onlyAuto(Boolean  onlyAuto) {
            this.onlyAuto =  onlyAuto;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getOnlyAuto() {
            return onlyAuto;
        }

        public void setOnlyAuto(Boolean onlyAuto) {
            this.onlyAuto = onlyAuto;
        }

        @SerializedName("DefaultEditLanguage")
        private String defaultEditLanguage ;

        public  AutoFitterOptions  defaultEditLanguage(String  defaultEditLanguage) {
            this.defaultEditLanguage =  defaultEditLanguage;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getDefaultEditLanguage() {
            return defaultEditLanguage;
        }

        public void setDefaultEditLanguage(String defaultEditLanguage) {
            this.defaultEditLanguage = defaultEditLanguage;
        }

        @SerializedName("MaxRowHeight")
        private Double maxRowHeight ;

        public  AutoFitterOptions  maxRowHeight(Double  maxRowHeight) {
            this.maxRowHeight =  maxRowHeight;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getMaxRowHeight() {
            return maxRowHeight;
        }

        public void setMaxRowHeight(Double maxRowHeight) {
            this.maxRowHeight = maxRowHeight;
        }

        @SerializedName("AutoFitWrappedTextType")
        private String autoFitWrappedTextType ;

        public  AutoFitterOptions  autoFitWrappedTextType(String  autoFitWrappedTextType) {
            this.autoFitWrappedTextType =  autoFitWrappedTextType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAutoFitWrappedTextType() {
            return autoFitWrappedTextType;
        }

        public void setAutoFitWrappedTextType(String autoFitWrappedTextType) {
            this.autoFitWrappedTextType = autoFitWrappedTextType;
        }

        @SerializedName("FormatStrategy")
        private String formatStrategy ;

        public  AutoFitterOptions  formatStrategy(String  formatStrategy) {
            this.formatStrategy =  formatStrategy;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getFormatStrategy() {
            return formatStrategy;
        }

        public void setFormatStrategy(String formatStrategy) {
            this.formatStrategy = formatStrategy;
        }

        @SerializedName("ForRendering")
        private Boolean forRendering ;

        public  AutoFitterOptions  forRendering(Boolean  forRendering) {
            this.forRendering =  forRendering;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getForRendering() {
            return forRendering;
        }

        public void setForRendering(Boolean forRendering) {
            this.forRendering = forRendering;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            AutoFitterOptions autoFitterOptions = (AutoFitterOptions) o;
            return
                Objects.equals(this.autoFitMergedCellsType, autoFitterOptions.autoFitMergedCellsType) &&
                Objects.equals(this.ignoreHidden, autoFitterOptions.ignoreHidden) &&
                Objects.equals(this.onlyAuto, autoFitterOptions.onlyAuto) &&
                Objects.equals(this.defaultEditLanguage, autoFitterOptions.defaultEditLanguage) &&
                Objects.equals(this.maxRowHeight, autoFitterOptions.maxRowHeight) &&
                Objects.equals(this.autoFitWrappedTextType, autoFitterOptions.autoFitWrappedTextType) &&
                Objects.equals(this.formatStrategy, autoFitterOptions.formatStrategy) &&
                Objects.equals(this.forRendering, autoFitterOptions.forRendering);
      }

      @Override
      public int hashCode() {
        return Objects.hash(autoFitMergedCellsType, ignoreHidden, onlyAuto, defaultEditLanguage, maxRowHeight, autoFitWrappedTextType, formatStrategy, forRendering);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AutoFitterOptions {\n");
            sb.append("    autoFitMergedCellsType: ").append(toIndentedString(getAutoFitMergedCellsType())).append("\n");
            sb.append("    ignoreHidden: ").append(toIndentedString(getIgnoreHidden())).append("\n");
            sb.append("    onlyAuto: ").append(toIndentedString(getOnlyAuto())).append("\n");
            sb.append("    defaultEditLanguage: ").append(toIndentedString(getDefaultEditLanguage())).append("\n");
            sb.append("    maxRowHeight: ").append(toIndentedString(getMaxRowHeight())).append("\n");
            sb.append("    autoFitWrappedTextType: ").append(toIndentedString(getAutoFitWrappedTextType())).append("\n");
            sb.append("    formatStrategy: ").append(toIndentedString(getFormatStrategy())).append("\n");
            sb.append("    forRendering: ").append(toIndentedString(getForRendering())).append("\n");
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

