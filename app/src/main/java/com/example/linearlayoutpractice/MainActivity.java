package com.example.linearlayoutpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printInformation(View v) {
        EditText fName = findViewById(R.id.firstName);
        EditText lName = findViewById(R.id.lastName);
        EditText phoneNum = findViewById(R.id.phone);
        TextView output = findViewById(R.id.outputText);

        String _fName = fName.getText().toString();
        String _lName = lName.getText().toString();
        String _phone = phoneNum.getText().toString();

        if (_fName.length() == 0 || _lName.length() == 0 || _phone.length() == 0) {
            output.setText("Please input your information");
        }
        else {
            String summary = _fName + " " + _lName + " your phone number is " + _phone;
            output.setText(summary);
        }
    }
}
