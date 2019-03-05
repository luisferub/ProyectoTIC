package com.user.discoverfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void verMenu(View view){
        Intent intencion = new Intent(this, MenuActivity.class);
        startActivity(intencion);
    }

    void verRestaurantes(View view){
        Intent intencion = new Intent(this, MapsActivity.class);
        startActivity(intencion);
    }

    void verLogin(View view){
        Intent intencion = new Intent(this, LoginActivity.class);
        startActivity(intencion);
    }

    void verContacto(View view){
        Intent intencion = new Intent(this, ContactoActivity.class);
        startActivity(intencion);
    }
}
