package com.user.discoverfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ContactoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
    }

    void verMain(View view){
        Intent intencion = new Intent(this, MainActivity.class);
        startActivity(intencion);
    }
}
