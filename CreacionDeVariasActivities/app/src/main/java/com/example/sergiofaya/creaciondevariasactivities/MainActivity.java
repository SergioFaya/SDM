package com.example.sergiofaya.creaciondevariasactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.content.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LanzaSegundaActividad(View view){
        final Intent mIntent = new Intent(MainActivity.this, SecondaryActivity.class);
        startActivity(mIntent);
    }
}
