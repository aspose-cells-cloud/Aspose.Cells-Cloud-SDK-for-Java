/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AccessTokenResponse.java">
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


public class AccessTokenResponse {
  @SerializedName("expires")
  private String expires = null;

  @SerializedName("access_token")
  private String accessToken = null;

  @SerializedName("issued")
  private String issued = null;

  @SerializedName("clientRefreshTokenLifeTimeInMinutes")
  private String clientRefreshTokenLifeTimeInMinutes = null;

  @SerializedName("expires_in")
  private Long expiresIn = null;

  @SerializedName("token_type")
  private String tokenType = null;

  @SerializedName("client_id")
  private String clientId = null;

  @SerializedName("refresh_token")
  private String refreshToken = null;

  public AccessTokenResponse expires(String expires) {
    this.expires = expires;
    return this;
  }

  @ApiModelProperty(value = "")
  public String getExpires() {
    return expires;
  }

  public void setExpires(String expires) {
    this.expires = expires;
  }

  public AccessTokenResponse accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }


  @ApiModelProperty(value = "")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public AccessTokenResponse issued(String issued) {
    this.issued = issued;
    return this;
  }


  @ApiModelProperty(value = "")
  public String getIssued() {
    return issued;
  }

  public void setIssued(String issued) {
    this.issued = issued;
  }

  public AccessTokenResponse clientRefreshTokenLifeTimeInMinutes(String clientRefreshTokenLifeTimeInMinutes) {
    this.clientRefreshTokenLifeTimeInMinutes = clientRefreshTokenLifeTimeInMinutes;
    return this;
  }

  @ApiModelProperty(value = "")
  public String getClientRefreshTokenLifeTimeInMinutes() {
    return clientRefreshTokenLifeTimeInMinutes;
  }

  public void setClientRefreshTokenLifeTimeInMinutes(String clientRefreshTokenLifeTimeInMinutes) {
    this.clientRefreshTokenLifeTimeInMinutes = clientRefreshTokenLifeTimeInMinutes;
  }

  public AccessTokenResponse expiresIn(Long expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }


  @ApiModelProperty(value = "")
  public Long getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Long expiresIn) {
    this.expiresIn = expiresIn;
  }

  public AccessTokenResponse tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  @ApiModelProperty(value = "")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public AccessTokenResponse clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  @ApiModelProperty(value = "")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public AccessTokenResponse refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  @ApiModelProperty(value = "")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessTokenResponse accessTokenResponse = (AccessTokenResponse) o;
    return Objects.equals(this.expires, accessTokenResponse.expires) &&
        Objects.equals(this.accessToken, accessTokenResponse.accessToken) &&
        Objects.equals(this.issued, accessTokenResponse.issued) &&
        Objects.equals(this.clientRefreshTokenLifeTimeInMinutes, accessTokenResponse.clientRefreshTokenLifeTimeInMinutes) &&
        Objects.equals(this.expiresIn, accessTokenResponse.expiresIn) &&
        Objects.equals(this.tokenType, accessTokenResponse.tokenType) &&
        Objects.equals(this.clientId, accessTokenResponse.clientId) &&
        Objects.equals(this.refreshToken, accessTokenResponse.refreshToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expires, accessToken, issued, clientRefreshTokenLifeTimeInMinutes, expiresIn, tokenType, clientId, refreshToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessTokenResponse {\n");

    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    issued: ").append(toIndentedString(issued)).append("\n");
    sb.append("    clientRefreshTokenLifeTimeInMinutes: ").append(toIndentedString(clientRefreshTokenLifeTimeInMinutes)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
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


