package com.coder.keyword.model;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 4012222497147014210L;

    private String username;

    private transient String passwd;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
