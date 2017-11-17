package cc.somkiat.basicunittesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSaveClick(View view) {
        //TODO
        List<MyValidator> validators = new ArrayList<>();
        validators.add(new ValidateEmailNull());
        validators.add(new ValidateEmailEmpty());

        for (MyValidator validator: validators) {
            if(validator.isValid("")) {
                validator.getErrorMessage();
                //return "Error"
            }
        }


    }

    public void onRevertClick(View view) {
        //TODO
    }
}
