package com.vijay.first.TodoApplication.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "vijay.config")
@Component
public class privateconfig {

    private String name;
    private String Password;
    private String Email;
    private int EmailExpires;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getEmailExpires() {
        return EmailExpires;
    }

    public void setEmailExpires(int emailExpires) {
        EmailExpires = emailExpires;
    }

    @Override
    public String toString() {
        return "privateconfig{" +
                "name='" + name + '\'' +
                ", Password='" + Password + '\'' +
                ", Email='" + Email + '\'' +
                ", EmailExpires=" + EmailExpires +
                '}';
    }
}
