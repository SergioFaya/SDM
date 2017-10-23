package com.example.sergio.loginsession1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative);
    }

    public void checkPassword(View view){
        EditText editPasww = (EditText) findViewById(R.id.passwdText);
        EditText editRePasww = (EditText) findViewById(R.id.RePasswText);
        if(editPasww.getText().toString().equals(editRePasww.getText().toString())) {
            Toast.makeText(getApplicationContext(), R.string.wrong,Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(), R.string.right, Toast.LENGTH_SHORT).show();
        }
    }
}