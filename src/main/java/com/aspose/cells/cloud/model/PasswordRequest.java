package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PasswordRequest — Used for password data transfer. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PasswordRequest {
    /** Password. */
    @JsonProperty("Password")
    private String password;

    public String getPassword() { return password; }
    public PasswordRequest setPassword(String password) { this.password = password; return this; }

}
