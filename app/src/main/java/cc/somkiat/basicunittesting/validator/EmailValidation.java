package cc.somkiat.basicunittesting.validator;

import android.util.Patterns;

import java.util.regex.Pattern;

import cc.somkiat.basicunittesting.exception.ValidateException;

/**
 * Created by Amoeba on 11/15/2017.
 */

public class EmailValidation {

    private String email;
    public EmailValidation(String email){
        this.email = email;
    }

    public boolean validate() throws ValidateException {
        emailIsNull();
        emailIsNotEmpty();
        emailFormat();
        return true;
    }
    public boolean emailIsNull() throws ValidateException {
        if(this.email != null)
            throw new ValidateException("Email is Null, Please input again");
        return true;
    }

    public boolean emailIsNotEmpty() throws ValidateException {
        if(!email.isEmpty())
            return true;
        throw new ValidateException("Name is Empty String, Please input again");

    }

    public boolean emailFormat() throws ValidateException {
        String emailPattern = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}";

        if (!Pattern.matches(emailPattern, email)) {
            throw new ValidateException("Email Pattern is incorrect");
        }
        return true;
    }


}
