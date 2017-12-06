package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.exception.ValidateException;
import cc.somkiat.basicunittesting.validator.EmailValidation;
import cc.somkiat.basicunittesting.validator.NameValidation;

import static junit.framework.Assert.assertTrue;

public class EmailValidationTest {

    @Test
    public void EmailIsNotEmpty() throws ValidateException {
        EmailValidation emailValidation = new EmailValidation("Pongmile@pongsa.com");
        assertTrue("Email is Empty String", emailValidation.emailIsNotEmpty());
    }

    @Test(expected = ValidateException.class)
    public void EmailIsEmpty() throws ValidateException{
        EmailValidation emailValidation = new EmailValidation("");
        emailValidation.emailIsNotEmpty();
    }

    @Test
    public void EmailIsCorrect() throws ValidateException{
        EmailValidation emailValidation = new EmailValidation("Pongsakorn@hotmail.com");
        assertTrue("Email Pattern is incorrect", emailValidation.emailFormat());
    }

    @Test(expected = ValidateException.class)
    public void EmailIsIncorrect() throws ValidateException{
        EmailValidation emailValidation = new EmailValidation("");
        emailValidation.emailFormat();
    }
    @Test
    public void EmailIsNull() throws ValidateException {
        EmailValidation emailValidation = new EmailValidation(null);
        assertTrue("Name is Null", emailValidation.emailIsNull());
    }
    @Test(expected = ValidateException.class)
    public void emailIsNull() throws ValidateException{
        EmailValidation emailValidation = new EmailValidation("");
        emailValidation.emailIsNull();
    }
}
