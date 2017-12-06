package cc.somkiat.basicunittesting.validator;

import java.util.regex.Pattern;

import cc.somkiat.basicunittesting.exception.ValidateException;

/**
 * Created by Amoeba on 11/10/2017.
 */

public class NameValidation {

    public String name;

    public NameValidation(String text){
        this.name = text;
    }

    public boolean validate() throws ValidateException {
        nameIsNotEmpty();
        nameFormat();
        return true;
    }

    public boolean nameIsNotEmpty() throws ValidateException {
        if(!this.name.isEmpty())
            return true;
        throw new ValidateException("Name is empty please enter name");
    }

    public boolean nameFormat() throws ValidateException {
        if(!Pattern.matches("^[a-zA-Z]+$", this.name)){
            throw new ValidateException("Name is incorrect format");
        }
        return true;
    }

}
