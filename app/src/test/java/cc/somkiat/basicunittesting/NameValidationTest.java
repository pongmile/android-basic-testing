package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.exception.ValidateException;
import cc.somkiat.basicunittesting.validator.NameValidation;


import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class NameValidationTest {

    @Test
    public void NameIsNotEmpty() throws ValidateException {
        NameValidation nameValidation = new NameValidation("Pongmile pongsa");
        assertTrue("Name is Empty String", nameValidation.nameIsNotEmpty());
    }

    @Test(expected = ValidateException.class)
    public void NameIsEmpty() throws ValidateException{
        NameValidation nameValidation = new NameValidation("");
        nameValidation.nameIsNotEmpty();
    }

    @Test
    public void NameIsCorrect() throws ValidateException{
        NameValidation nameValidation = new NameValidation("Pongsakorn");
        assertTrue("Name is Alphabet Characters", nameValidation.nameFormat());
    }

    @Test(expected = ValidateException.class)
    public void NameIsIncorrect() throws ValidateException{
        NameValidation nameValidation = new NameValidation("");
        nameValidation.nameFormat();
    }
    @Test
    public void NameIsNull() throws ValidateException {
        NameValidation nameValidation = new NameValidation(null);
        assertTrue("Name is Null", nameValidation.nameIsNull());
    }
    @Test(expected = ValidateException.class)
    public void nameIsNull() throws ValidateException{
        NameValidation nameValidation = new NameValidation("");
        nameValidation.nameIsNull();
    }
}
