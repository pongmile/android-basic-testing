package cc.somkiat.basicunittesting;


public class InputValidation {

    boolean validate(String email) {
        return isEmailNull(email) && isEmailEmpty(email);
    }

    boolean isEmailEmpty(String email) {
        return "".equals(email.trim());
    }

    boolean isEmailNull(String email) {
        if(!(email != null)) return true;
        return false;
    }

}
