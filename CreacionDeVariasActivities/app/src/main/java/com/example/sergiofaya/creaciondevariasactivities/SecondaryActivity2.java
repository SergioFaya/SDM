package com.example.sergiofaya.creaciondevariasactivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import junit.framework.TestCase;

import org.w3c.dom.Text;

/**
 * Created by Sergio on 09/10/2017.
 */

public class SecondaryActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.libro2);
        Bundle bundle = getIntent().getExtras();
        Libro l = bundle.getParcelable(MainActivity2.OBJETO_KEY);
        TextView titulo = (TextView) findViewById(R.id.viewTitulo);
        TextView autor = (TextView) findViewById(R.id.viewAutor);
        TextView fecha = (TextView) findViewById(R.id.viewFecha);

        autor.setText(l.getFecha().toString());
        fecha.setText(l.getAutor().toString());
        titulo.setText(l.getTitulo().toString());
    }
}
