package cc.somkiat.basicunittesting;

public class ValidateEmailNull implements MyValidator {

    @Override
    public boolean isValid(String input) {
        if(input == null) return true;
        return false;
    }

    @Override
    public String getErrorMessage() {
        return "Null na";
    }
}
