package com.example.sergiofaya.creaciondevariasactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        TextView view = (TextView) findViewById(R.id.labelBundleReceiver);
        Bundle mBundleRecibido = getIntent().getExtras();
        view.setText(mBundleRecibido.get("value").toString());
    }

    public void kill(View view){
        this.finish();
    }
}
