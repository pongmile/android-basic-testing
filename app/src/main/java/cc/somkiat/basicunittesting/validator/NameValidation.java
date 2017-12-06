package cc.somkiat.basicunittesting.validator;

import java.util.regex.Pattern;

import cc.somkiat.basicunittesting.exception.ValidateException;

public class NameValidation {

    public String name;

    public NameValidation(String text){
        this.name = text;
    }

    public boolean validate() throws ValidateException {
        nameIsNull();
        nameIsNotEmpty();
        nameFormat();
        return true;
    }

    public boolean nameIsNull() throws ValidateException {
        if(this.name != null)
            throw new ValidateException("Name is Null, Please input again");
        return true;
    }

    public boolean nameIsNotEmpty() throws ValidateException {
        if(!this.name.isEmpty())
            return true;
        throw new ValidateException("Name is Empty String, Please input again");
    }

    public boolean nameFormat() throws ValidateException {
        if(!Pattern.matches("^[a-zA-Z]+$", this.name)){
            throw new ValidateException("Name is Alphabet Characters, Please input again");
        }
        return true;
    }

}
