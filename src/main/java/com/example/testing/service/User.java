package com.example.testing.service;



public class User {

    private String mail;
    private String login;


    public User(String mail, String login) {
        if (!validateChar(mail)) {
            throw new IllegalArgumentException("Email " + mail + "Не содержит знака собака");
        } else {
            this.mail = mail;
        }if (login.equals(mail)){
            throw new IllegalArgumentException("Email " + mail + " не может быть равен Login "+ login);
        }
        this.login = login;
    }
    public User(){
    }

    public String getMail() {
        return mail;
    }

    public String getLogin() {
        return login;
    }

    public boolean validateChar(String value) {
        String symbol = "@";
        for (int i = 0; i < value.length(); i++) {
            if (value.contains(symbol)) {
                return true;
            }
        }
        return false;
    }
}
