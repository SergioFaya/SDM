package com.example.sergiofaya.materialdesign;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkPassword(View view){

        EditText passw = (EditText) findViewById(R.id.txtPassword);
        EditText repassw = (EditText) findViewById(R.id.txtPassword);

        if(passw.getText().toString().equals(repassw.getText().toString())){
            Snackbar.make(view,"Correcto neni", Snackbar.LENGTH_LONG).show();
        }else{
            Snackbar.make(view,"La contraseña "+ passw +"esta mal", Snackbar.LENGTH_LONG).show();
        }

    }
}
