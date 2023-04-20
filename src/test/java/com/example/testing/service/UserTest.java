package com.example.testing.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {



    @BeforeAll
    private static void initParams() {
        System.out.println("Start");
        String mail = "abc@skypro.ru";
        String login = "log";
    }


    //Создайте тест, который выполнит тестирование создания объекта User с передачей в него двух параметров. Такая функция лишь должна проверять устанавливаются ли данные при создании объекта;
    @Test
    void checkingObjectInitializationWithParameters() {
        User user1 = new User("aa@aaaa.ru", "login");
        Assertions.assertEquals("aa@aaaa.ru", user1.getMail());
        Assertions.assertEquals("login", user1.getLogin());
    }

    //Создайте аналогичный тест, который выполнит тестирование по созданию объекта без передачи в него параметров;
    @Test
    void checkingObjectInitializationWithoutParameters() {
        User userNull = new User();
        Assertions.assertNull(userNull.getLogin(), "Login must be null or empty");
        Assertions.assertNull(userNull.getMail(), "E-mail must be null or empty");
    }


    //  Создайте тест, который протестирует установлен ли корректный Email адрес в поле email в классе User. Некорректным будет считаться тот email, в котором нет знака @ или же знака точки
    @Test
    void thePresenceOfASignInTheObject() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new User("login", "email"));
    }

    //Создайте тест, который определяет, равны ли login и email (Они не должны быть равны).
//    @Test
//    void comparingLoginAndMail() {
//        mail = "abc@skypro.ru";
//        login = "log";
//        Assertions.assertNotEquals(mail, login);
//    }
    @Test
    void comparingLoginAndMail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new User("abc@skypro.ru", "abc@skypro.ru"));
    }


}