package cc.somkiat.basicunittesting.validator;

import android.util.Patterns;

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
        emailIsNotEmpty();
        emailFormat();
        return true;
    }

    public boolean emailIsNotEmpty() throws ValidateException {
        if(!email.isEmpty())
            return true;
        throw new ValidateException("Email is empty");

    }

    public boolean emailFormat() throws ValidateException {
        if(!Patterns.EMAIL_ADDRESS.matcher(this.email).matches())
            throw new ValidateException("Email is incorrect");
        return true;
    }


}
