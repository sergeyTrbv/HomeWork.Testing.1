package com.example.testing.service;

public class User {

    public String mail = "abc@skypro.ru";
    public String login = "log";


    public User(String mail, String login) {
        this.mail = mail;
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
