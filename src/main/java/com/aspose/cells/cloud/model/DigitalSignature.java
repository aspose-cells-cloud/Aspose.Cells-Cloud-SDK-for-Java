package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DigitalSignature — Signature in file. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DigitalSignature {
    /** The purpose to signature. */
    @JsonProperty("Comments")
    private String comments;

    /** The time when the document was signed. */
    @JsonProperty("SignTime")
    private String signTime;

    /** Specifies a GUID which can be cross-referenced with the GUID of the signature line stored in the document content. Default value is Empty (all zeroes) Guid. */
    @JsonProperty("Id")
    private String id;

    /** Specifies the text of actual signature in the digital signature. Default value is Empty. */
    @JsonProperty("Password")
    private String password;

    /** Specifies an image for the digital signature. Default value is null. */
    @JsonProperty("Image")
    private byte[] image;

    /** Specifies the class ID of the signature provider. Default value is Empty (all zeroes) Guid. */
    @JsonProperty("ProviderId")
    private String providerId;

    /** If this digital signature is valid and the document has not been tampered with, this value will be true. */
    @JsonProperty("IsValid")
    private Boolean isValid;

    /** XAdES type. Default value is None(XAdES is off). */
    @JsonProperty("XAdESType")
    private String xAdESType;

    public String getComments() { return comments; }
    public DigitalSignature setComments(String comments) { this.comments = comments; return this; }

    public String getSignTime() { return signTime; }
    public DigitalSignature setSignTime(String signTime) { this.signTime = signTime; return this; }

    public String getId() { return id; }
    public DigitalSignature setId(String id) { this.id = id; return this; }

    public String getPassword() { return password; }
    public DigitalSignature setPassword(String password) { this.password = password; return this; }

    public byte[] getImage() { return image; }
    public DigitalSignature setImage(byte[] image) { this.image = image; return this; }

    public String getProviderId() { return providerId; }
    public DigitalSignature setProviderId(String providerId) { this.providerId = providerId; return this; }

    public Boolean getIsValid() { return isValid; }
    public DigitalSignature setIsValid(Boolean isValid) { this.isValid = isValid; return this; }

    public String getXAdESType() { return xAdESType; }
    public DigitalSignature setXAdESType(String xAdESType) { this.xAdESType = xAdESType; return this; }

}
