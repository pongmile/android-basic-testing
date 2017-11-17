package cc.somkiat.basicunittesting;

public class ValidateEmailEmpty implements MyValidator {

    @Override
    public boolean isValid(String input) {
        return "".equals(input.trim());
    }

    @Override
    public String getErrorMessage() {
        return "Empty na";
    }
}
