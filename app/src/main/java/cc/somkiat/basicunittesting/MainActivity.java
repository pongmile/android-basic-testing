package cc.somkiat.basicunittesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import cc.somkiat.basicunittesting.exception.ValidateException;
import cc.somkiat.basicunittesting.validator.EmailValidation;
import cc.somkiat.basicunittesting.validator.NameValidation;


public class MainActivity extends AppCompatActivity {

    EditText userNameInput;
    EditText emailInput;
    NameValidation nameValidator;
    EmailValidation emailValidator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameInput = findViewById(R.id.userNameInput);
        emailInput = findViewById(R.id.emailInput);

        nameValidator = new NameValidation(userNameInput.getText().toString());
        emailValidator = new EmailValidation(emailInput.getText().toString());
    }

    public void onSaveClick(View view) {
        try {
            nameValidator.validate();
            emailValidator.validate();
            displayResult(nameValidator.validate(), emailValidator.validate());
        } catch (ValidateException e) {
            Log.e("error", e.getMessage());
        }
    }

    public void onRevertClick(View view) {
        userNameInput.setText("");
        emailInput.setText("");
    }

    private void displayResult(boolean nameResult, boolean emailResult) {
        if (!nameResult) {
            Toast.makeText(this, (CharSequence) nameValidator, Toast.LENGTH_SHORT).show();
        }

        if (!emailResult) {
            Toast.makeText(this, (CharSequence) emailValidator, Toast.LENGTH_SHORT).show();
        }
    }
}
