package com.itb.wave8.demo.contrasenas;

public class StrongPassword extends Password{

    private static final String STRONG_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
    private static final String STRONG_PATTERN_HELP = "Password must contain at least one digit [0-9].\n" +
            "Password must contain at least one lowercase Latin character [a-z].\n" +
            "Password must contain at least one uppercase Latin character [A-Z].\n" +
            "Password must contain at least one special character like ! @ # & ( ).\n" +
            "Password must contain a length of at least 8 characters and a maximum of 20 characters.";

    public StrongPassword() {
        super(STRONG_PATTERN,STRONG_PATTERN_HELP);
    }
}
