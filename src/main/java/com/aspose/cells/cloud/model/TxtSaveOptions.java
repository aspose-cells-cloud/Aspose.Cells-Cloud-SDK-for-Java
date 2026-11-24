/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TxtSaveOptions.java">
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

public class TxtSaveOptions extends SaveOptions {

    @SerializedName("QuoteType")
    @JsonProperty("QuoteType")
    private String quoteType;

    public TxtSaveOptions quoteType(String quoteType) {
        this.quoteType = quoteType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getQuoteType() {
        return quoteType;
    }

    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    @SerializedName("Separator")
    @JsonProperty("Separator")
    private String separator;

    public TxtSaveOptions separator(String separator) {
        this.separator = separator;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    @SerializedName("SeparatorString")
    @JsonProperty("SeparatorString")
    private String separatorString;

    public TxtSaveOptions separatorString(String separatorString) {
        this.separatorString = separatorString;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSeparatorString() {
        return separatorString;
    }

    public void setSeparatorString(String separatorString) {
        this.separatorString = separatorString;
    }

    @SerializedName("AlwaysQuoted")
    @JsonProperty("AlwaysQuoted")
    private Boolean alwaysQuoted;

    public TxtSaveOptions alwaysQuoted(Boolean alwaysQuoted) {
        this.alwaysQuoted = alwaysQuoted;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAlwaysQuoted() {
        return alwaysQuoted;
    }

    public void setAlwaysQuoted(Boolean alwaysQuoted) {
        this.alwaysQuoted = alwaysQuoted;
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
        TxtSaveOptions other = (TxtSaveOptions) o;
        return Objects.equals(this.quoteType, other.quoteType)
            && Objects.equals(this.separator, other.separator)
            && Objects.equals(this.separatorString, other.separatorString)
            && Objects.equals(this.alwaysQuoted, other.alwaysQuoted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quoteType, separator, separatorString, alwaysQuoted, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TxtSaveOptions {\n");
        sb.append("    quoteType: ").append(quoteType).append("\n");
        sb.append("    separator: ").append(separator).append("\n");
        sb.append("    separatorString: ").append(separatorString).append("\n");
        sb.append("    alwaysQuoted: ").append(alwaysQuoted).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
