/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DateTimeGroupItem.java">
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


public class DateTimeGroupItem  extends  MultipleFilter {
        @SerializedName("DateTimeGroupingType")
        private String dateTimeGroupingType ;

        public  DateTimeGroupItem  dateTimeGroupingType(String  dateTimeGroupingType) {
            this.dateTimeGroupingType =  dateTimeGroupingType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getDateTimeGroupingType() {
            return dateTimeGroupingType;
        }

        public void setDateTimeGroupingType(String dateTimeGroupingType) {
            this.dateTimeGroupingType = dateTimeGroupingType;
        }

        @SerializedName("Day")
        private Integer day ;

        public  DateTimeGroupItem  day(Integer  day) {
            this.day =  day;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getDay() {
            return day;
        }

        public void setDay(Integer day) {
            this.day = day;
        }

        @SerializedName("Hour")
        private Integer hour ;

        public  DateTimeGroupItem  hour(Integer  hour) {
            this.hour =  hour;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getHour() {
            return hour;
        }

        public void setHour(Integer hour) {
            this.hour = hour;
        }

        @SerializedName("Minute")
        private Integer minute ;

        public  DateTimeGroupItem  minute(Integer  minute) {
            this.minute =  minute;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getMinute() {
            return minute;
        }

        public void setMinute(Integer minute) {
            this.minute = minute;
        }

        @SerializedName("Month")
        private Integer month ;

        public  DateTimeGroupItem  month(Integer  month) {
            this.month =  month;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getMonth() {
            return month;
        }

        public void setMonth(Integer month) {
            this.month = month;
        }

        @SerializedName("Second")
        private Integer second ;

        public  DateTimeGroupItem  second(Integer  second) {
            this.second =  second;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getSecond() {
            return second;
        }

        public void setSecond(Integer second) {
            this.second = second;
        }

        @SerializedName("Year")
        private Integer year ;

        public  DateTimeGroupItem  year(Integer  year) {
            this.year =  year;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getYear() {
            return year;
        }

        public void setYear(Integer year) {
            this.year = year;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            DateTimeGroupItem dateTimeGroupItem = (DateTimeGroupItem) o;
            return
                Objects.equals(this.dateTimeGroupingType, dateTimeGroupItem.dateTimeGroupingType) &&
                Objects.equals(this.day, dateTimeGroupItem.day) &&
                Objects.equals(this.hour, dateTimeGroupItem.hour) &&
                Objects.equals(this.minute, dateTimeGroupItem.minute) &&
                Objects.equals(this.month, dateTimeGroupItem.month) &&
                Objects.equals(this.second, dateTimeGroupItem.second) &&
                Objects.equals(this.year, dateTimeGroupItem.year) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(dateTimeGroupingType, day, hour, minute, month, second, year, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DateTimeGroupItem {\n");
            sb.append("    dateTimeGroupingType: ").append(toIndentedString(getDateTimeGroupingType())).append("\n");
            sb.append("    day: ").append(toIndentedString(getDay())).append("\n");
            sb.append("    hour: ").append(toIndentedString(getHour())).append("\n");
            sb.append("    minute: ").append(toIndentedString(getMinute())).append("\n");
            sb.append("    month: ").append(toIndentedString(getMonth())).append("\n");
            sb.append("    second: ").append(toIndentedString(getSecond())).append("\n");
            sb.append("    year: ").append(toIndentedString(getYear())).append("\n");
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

