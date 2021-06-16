package com.kodilla.parametrized_tests.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    public boolean validateUsername(String username) {
        return username.matches("^[a-zA-Z0-9._-]{3,}$");
    }

    public boolean validateEmail(String email) {
        if (null != email) {
            String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
        return false;
    }

    public boolean usernameIsBlank(String username) {
        return username == null || username.trim().isEmpty();
    }

    public boolean emailAddressIsBlank(String email) {
        return email == null || email.trim().isEmpty();
    }

    public int getUsernameLengthWithoutSpaces(String input) {
        String value = input.replaceAll(" ", "");
        return value.length();
    }


}
