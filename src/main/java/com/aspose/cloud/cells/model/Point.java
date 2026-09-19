/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Point.java">
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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;


public class Point {
  @SerializedName("X")
  private Integer X;

  public  Point  X(Integer  x) {
        this.X =  x;
        return this;
  }

    @ApiModelProperty(value = "")
    public Integer getX() {
        return this.X ;
    }

    public void setX(Integer  x) {
        this.X = x;
    }

  @SerializedName("Y")
  private Integer Y;

  public  Point  Y(Integer  y) {
        this.Y =  y;
        return this;
  }

    @ApiModelProperty(value = "")
    public Integer getY() {
        return this.Y ;
    }

    public void setY(Integer  y) {
        this.Y = y;
    }

  @SerializedName("IsEmpty")
  private Boolean IsEmpty ;

  public  Point  IsEmpty(Boolean  isEmpty) {
        this.IsEmpty =  isEmpty;
        return this;
  }

    @ApiModelProperty(value = "")
    public Boolean getIsEmpty() {
        return this.IsEmpty ;
    }

    public void setIsEmpty(Boolean  isEmpty) {
        this.IsEmpty = isEmpty;
    }  


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Point point = (Point) o;
    return Objects.equals(this.X, point.X) &&
        Objects.equals(this.Y, point.Y) &&
        Objects.equals(this.IsEmpty, point.IsEmpty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(X, Y, IsEmpty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Point {\n");

    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
    sb.append("    IsEmpty: ").append(toIndentedString(IsEmpty)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
