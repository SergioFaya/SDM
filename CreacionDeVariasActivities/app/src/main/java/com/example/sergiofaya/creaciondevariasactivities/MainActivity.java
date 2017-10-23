package com.example.sergiofaya.creaciondevariasactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.content.*;
import android.view.*;
import android.app.ActivityOptions;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static String OBJETO_KEY = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LanzaSegundaActividad(View view) {
        final Intent mIntent = new Intent(MainActivity.this, SecondaryActivity.class);
        Bundle bundle = new Bundle();
        EditText text = (EditText) findViewById(R.id.txtBundle);
        bundle.putString("value", text.getText().toString());
        mIntent.putExtras(bundle);
        startActivity(mIntent,ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
}
