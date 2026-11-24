/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="OdsSaveOptions.java">
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

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class OdsSaveOptions extends SaveOptions {

    @SerializedName("GeneratorType")
    @JsonProperty("GeneratorType")
    private String generatorType;

    public OdsSaveOptions generatorType(String generatorType) {
        this.generatorType = generatorType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getGeneratorType() {
        return generatorType;
    }

    public void setGeneratorType(String generatorType) {
        this.generatorType = generatorType;
    }

    @SerializedName("OdfStrictVersion")
    @JsonProperty("OdfStrictVersion")
    private String odfStrictVersion;

    public OdsSaveOptions odfStrictVersion(String odfStrictVersion) {
        this.odfStrictVersion = odfStrictVersion;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getOdfStrictVersion() {
        return odfStrictVersion;
    }

    public void setOdfStrictVersion(String odfStrictVersion) {
        this.odfStrictVersion = odfStrictVersion;
    }

    @SerializedName("IgnorePivotTables")
    @JsonProperty("IgnorePivotTables")
    private Boolean ignorePivotTables;

    public OdsSaveOptions ignorePivotTables(Boolean ignorePivotTables) {
        this.ignorePivotTables = ignorePivotTables;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIgnorePivotTables() {
        return ignorePivotTables;
    }

    public void setIgnorePivotTables(Boolean ignorePivotTables) {
        this.ignorePivotTables = ignorePivotTables;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        OdsSaveOptions other = (OdsSaveOptions) o;
        return Objects.equals(this.generatorType, other.generatorType)
            && Objects.equals(this.odfStrictVersion, other.odfStrictVersion)
            && Objects.equals(this.ignorePivotTables, other.ignorePivotTables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(generatorType, odfStrictVersion, ignorePivotTables, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OdsSaveOptions {\n");
        sb.append("    generatorType: ").append(generatorType).append("\n");
        sb.append("    odfStrictVersion: ").append(odfStrictVersion).append("\n");
        sb.append("    ignorePivotTables: ").append(ignorePivotTables).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
