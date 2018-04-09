package com.coder.keyword.model;

import java.io.Serializable;

public class User1 implements Serializable {

    private static final long serialVersionUID = 7470738077799547943L;

    public static String username;

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
