package com.example.sergiofaya.creaciondevariasactivities;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Sergio on 09/10/2017.
 */

public class MainActivity2 extends AppCompatActivity {

    public static String OBJETO_KEY = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.libro);
    }

    public void LanzaSegundaActividad(View view) {
        final Intent mIntent = new Intent(MainActivity2.this, SecondaryActivity2.class);
        Bundle bundle = new Bundle();

        EditText titulo = (EditText) findViewById(R.id.editTextTitulo);
        EditText autor = (EditText) findViewById(R.id.editTextAutor);
        EditText fecha = (EditText) findViewById(R.id.editTextFecha);


        Libro parcelable = new Libro(titulo.getText().toString(), autor.getText().toString(),fecha.getText().toString());
        mIntent.putExtra(OBJETO_KEY, parcelable);
        startActivity(mIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
}
