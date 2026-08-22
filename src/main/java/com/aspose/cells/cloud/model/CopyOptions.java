package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CopyOptions — Represents the copy options. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CopyOptions {
    /** Indicates whether copying column width in unit of characters. */
    @JsonProperty("ColumnCharacterWidth")
    private Boolean columnCharacterWidth;

    /** If the formula is not valid for the dest destination, only copy values. */
    @JsonProperty("CopyInvalidFormulasAsValues")
    private Boolean copyInvalidFormulasAsValues;

    /** Indicates whether copying the names. */
    @JsonProperty("CopyNames")
    private Boolean copyNames;

    /** Indicates whether extend ranges when copying the range to adjacent range. */
    @JsonProperty("ExtendToAdjacentRange")
    private Boolean extendToAdjacentRange;

    /** When copying the range in the same file and the chart refers to the source sheet, False means the copied chart's data source will not be changed. True means the copied chart's data source refers to the destination sheet. */
    @JsonProperty("ReferToDestinationSheet")
    private Boolean referToDestinationSheet;

    /** In ms excel, when copying formulas which refer to other worksheets while copying a worksheet to another one, the copied formulas should refer to source workbook. However, for some situations user may need the copied formulas refer to worksheets with the same name in the same workbook, such as when those worksheets have been copied before this copy operation, then this property should be kept as true. */
    @JsonProperty("ReferToSheetWithSameName")
    private Boolean referToSheetWithSameName;

    /** Gets or sets CopyTheme. */
    @JsonProperty("CopyTheme")
    private Boolean copyTheme;

    public Boolean getColumnCharacterWidth() { return columnCharacterWidth; }
    public CopyOptions setColumnCharacterWidth(Boolean columnCharacterWidth) { this.columnCharacterWidth = columnCharacterWidth; return this; }

    public Boolean getCopyInvalidFormulasAsValues() { return copyInvalidFormulasAsValues; }
    public CopyOptions setCopyInvalidFormulasAsValues(Boolean copyInvalidFormulasAsValues) { this.copyInvalidFormulasAsValues = copyInvalidFormulasAsValues; return this; }

    public Boolean getCopyNames() { return copyNames; }
    public CopyOptions setCopyNames(Boolean copyNames) { this.copyNames = copyNames; return this; }

    public Boolean getExtendToAdjacentRange() { return extendToAdjacentRange; }
    public CopyOptions setExtendToAdjacentRange(Boolean extendToAdjacentRange) { this.extendToAdjacentRange = extendToAdjacentRange; return this; }

    public Boolean getReferToDestinationSheet() { return referToDestinationSheet; }
    public CopyOptions setReferToDestinationSheet(Boolean referToDestinationSheet) { this.referToDestinationSheet = referToDestinationSheet; return this; }

    public Boolean getReferToSheetWithSameName() { return referToSheetWithSameName; }
    public CopyOptions setReferToSheetWithSameName(Boolean referToSheetWithSameName) { this.referToSheetWithSameName = referToSheetWithSameName; return this; }

    public Boolean getCopyTheme() { return copyTheme; }
    public CopyOptions setCopyTheme(Boolean copyTheme) { this.copyTheme = copyTheme; return this; }

}
