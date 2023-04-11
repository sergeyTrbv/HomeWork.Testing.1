package com.example.testing.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private static String mail ;
    private static String login;

    @BeforeAll
    private static void initParams() {
        System.out.println("Start");
        mail = "abc@skypro.ru";
        login = "log";
    }

    static User user = new User(mail,login);

//Создайте тест, который выполнит тестирование создания объекта User с передачей в него двух параметров. Такая функция лишь должна проверять устанавливаются ли данные при создании объекта;
    @Test
    void checkingObjectInitialization() {
        Assertions.assertNotNull(user);
    }

//Создайте аналогичный тест, который выполнит тестирование по созданию объекта без передачи в него параметров;


//Создайте тест, который протестирует установлен ли корректный Email адрес в поле email в классе User. Некорректным будет считаться тот email, в котором нет знака @ или же знака точки
    @Test
    void thePresenceOfASignInTheObject() {
        Assertions.assertTrue(user.validateChar(mail));
    }

//Создайте тест, который определяет, равны ли login и email (Они не должны быть равны).
    @Test
    void comparingLoginAndMail() {
        Assertions.assertNotEquals(mail, login);
    }


}