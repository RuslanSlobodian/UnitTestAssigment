package org.example;

import java.util.regex.Pattern;

public class Main {
    public boolean checkEmail(String text) {
        return Pattern.compile("^[A-Za-z]+[A-Za-z0-9]*(\\.[A-Za-z0-9]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
                .matcher(text)
                .matches();
    }
}