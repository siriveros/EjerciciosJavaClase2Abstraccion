package com.itb.wave8.demo.contrasenas;

public class SimplePassword extends Password{

    private static final String SIMPLE_PATTERN = "^.{8,20}$";
    private static final String SIMPLE_PATTERN_HELP =
            "Password must contain a length of at least 8 characters and a maximum of 20 characters.";

    public SimplePassword() {
        super(SIMPLE_PATTERN,SIMPLE_PATTERN_HELP);
    }
}
