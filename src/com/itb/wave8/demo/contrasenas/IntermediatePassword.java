package com.itb.wave8.demo.contrasenas;

public class IntermediatePassword extends Password {

    private static final String INTERMEDIATE_PATTERN = "^(?=.*[a-z])(?=.*[A-Z]).{8,20}$";
    private static final String INTERMEDIATE_PATTERN_HELP = "Password must contain at least one lowercase Latin character [a-z].\n" +
            "Password must contain at least one uppercase Latin character [A-Z].\n" +
            "Password must contain a length of at least 8 characters and a maximum of 20 characters.";


    public IntermediatePassword() {
        super(INTERMEDIATE_PATTERN,INTERMEDIATE_PATTERN_HELP);
    }
}
