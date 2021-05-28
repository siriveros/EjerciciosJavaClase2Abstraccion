package com.itb.wave8.demo.contrasenas;

public class Password {

    protected String pattern;
    protected String value;
    protected String patternHelp;

    public static final String DEFAULT_PATTERN_MESSAGE = "No se proporcionado ayuda para el patron";

    public Password() {
        this.pattern = "";
        this.value = "";
        this.patternHelp = this.DEFAULT_PATTERN_MESSAGE;
    }

    public Password(String pattern){
        this.pattern = pattern;
        this.patternHelp = this.DEFAULT_PATTERN_MESSAGE;
    }

    public Password(String pattern, String patternHelp) {
        this.pattern = pattern;
        this.patternHelp = patternHelp;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) throws Exception {
        if(!this.validatePassword(value)){
            throw new Exception("Error la contraseña no cumple con los estandares\n Ayuda: " + patternHelp);
        }
        this.value = value;
    }

    public boolean validatePassword(String password){
        return password.matches(pattern);
    }
}
