package com.user.discoverfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RepartidorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repartidor);
    }

    void verPedidos(View view){
        Intent intencion = new Intent(this, PedidosActivity.class);
        startActivity(intencion);
    }

    void verMapa(View view){
        Intent intencion = new Intent(this, MapsActivity.class);
        startActivity(intencion);
    }

    void verInformacion(View view){
        Intent intencion = new Intent(this, InformacionActivity.class);
        startActivity(intencion);
    }

}
