package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.validator.NameValidation;

import static org.junit.Assert.assertFalse;

public class NameValidationFailTest {

    @Test
    public void ชื่อเป็นค่าว่าง() {
        NameValidation validation = new NameValidation();
        boolean result = validation.isEmpty("");
        assertFalse("ต้องไม่ผ่านนะ เพราะว่ามันมีค่าวไมว่าง !!", result);
    }

}
