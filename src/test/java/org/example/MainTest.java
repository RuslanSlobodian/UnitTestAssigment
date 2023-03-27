package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main main;

    MainTest() {
        main = new Main();
    }

    @ParameterizedTest
    @CsvSource({
            "username@gmail.com",
            "user.name@gmail.com",
            "username1@gmail.com",
            "user1name@gmail.com",
            "username@1gmail.com",
            "username@gmail1.com",
            "USERNAME@GMAIL.COM",
            "username@te.ua",
            "username@tk.te.ua",
            "u@gmai.com"
    })
    void checkEmailPositiveTest(String text) {
        assertTrue(main.checkEmail(text));
    }

    @ParameterizedTest
    @CsvSource({
            "1username@gmail.com",
            "username.@gmail.com",
            "user..name@gmail.com",
            ".username@gmail.com",
            "user.name@gmail.com.",
            "user.name@.gmail.com",
            "username.gmail.com",
            "юзер@gmail.com",
            "username@gmail",
            "username@gmail.c"
    })
    void checkEmailNegativeTest(String text) {
        assertFalse(main.checkEmail(text));
    }
}