package com.example.testing.service;

import java.io.IOException;

public class User {

    public String mail = "abc@skypro.ru";
    public String login = "log";


    public User(String mail, String login) {
        if (!User.validateChar(mail)) {
            throw new IllegalArgumentException("Email " + mail + "Не содержит знака собака");
        } else {
            this.mail = mail;
        }
        this.login = login;
    }

    public String getMail() {
        return mail;
    }

    public String getLogin() {
        return login;
    }

    public static boolean validateChar(String value) {
        String symbol = "@";
        for (int i = 0; i < value.length(); i++) {
            if (value.contains(symbol)) {
                return true;
            }
        }
        return false;
    }
}
