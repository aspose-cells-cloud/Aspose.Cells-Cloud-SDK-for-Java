/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DigitalSignature.java">
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


public class DigitalSignature {
        @SerializedName("Comments")
        private String comments ;

        public  DigitalSignature  comments(String  comments) {
            this.comments =  comments;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getComments() {
            return comments;
        }

        public void setComments(String comments) {
            this.comments = comments;
        }

        @SerializedName("SignTime")
        private String signTime ;

        public  DigitalSignature  signTime(String  signTime) {
            this.signTime =  signTime;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSignTime() {
            return signTime;
        }

        public void setSignTime(String signTime) {
            this.signTime = signTime;
        }

        @SerializedName("Id")
        private String id ;

        public  DigitalSignature  id(String  id) {
            this.id =  id;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        @SerializedName("Password")
        private String password ;

        public  DigitalSignature  password(String  password) {
            this.password =  password;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @SerializedName("Image")
        private byte[] image ;

        public  DigitalSignature  image(byte[]  image) {
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

        @SerializedName("ProviderId")
        private String providerId ;

        public  DigitalSignature  providerId(String  providerId) {
            this.providerId =  providerId;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getProviderId() {
            return providerId;
        }

        public void setProviderId(String providerId) {
            this.providerId = providerId;
        }

        @SerializedName("IsValid")
        private Boolean isValid ;

        public  DigitalSignature  isValid(Boolean  isValid) {
            this.isValid =  isValid;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsValid() {
            return isValid;
        }

        public void setIsValid(Boolean isValid) {
            this.isValid = isValid;
        }

        @SerializedName("XAdESType")
        private String xAdESType ;

        public  DigitalSignature  xAdESType(String  xAdESType) {
            this.xAdESType =  xAdESType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getXAdESType() {
            return xAdESType;
        }

        public void setXAdESType(String xAdESType) {
            this.xAdESType = xAdESType;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            DigitalSignature digitalSignature = (DigitalSignature) o;
            return
                Objects.equals(this.comments, digitalSignature.comments) &&
                Objects.equals(this.signTime, digitalSignature.signTime) &&
                Objects.equals(this.id, digitalSignature.id) &&
                Objects.equals(this.password, digitalSignature.password) &&
                Objects.equals(this.image, digitalSignature.image) &&
                Objects.equals(this.providerId, digitalSignature.providerId) &&
                Objects.equals(this.isValid, digitalSignature.isValid) &&
                Objects.equals(this.xAdESType, digitalSignature.xAdESType);
      }

      @Override
      public int hashCode() {
        return Objects.hash(comments, signTime, id, password, image, providerId, isValid, xAdESType);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DigitalSignature {\n");
            sb.append("    comments: ").append(toIndentedString(getComments())).append("\n");
            sb.append("    signTime: ").append(toIndentedString(getSignTime())).append("\n");
            sb.append("    id: ").append(toIndentedString(getId())).append("\n");
            sb.append("    password: ").append(toIndentedString(getPassword())).append("\n");
            sb.append("    image: ").append(toIndentedString(getImage())).append("\n");
            sb.append("    providerId: ").append(toIndentedString(getProviderId())).append("\n");
            sb.append("    isValid: ").append(toIndentedString(getIsValid())).append("\n");
            sb.append("    xAdESType: ").append(toIndentedString(getXAdESType())).append("\n");
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

