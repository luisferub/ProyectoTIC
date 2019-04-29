package com.user.discoverfood.Repartidor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.user.discoverfood.MapsActivity;
import com.user.discoverfood.R;

public class Repartidor2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repartidor2);
    }

    void verMapa(View view){
        Intent intencion = new Intent(this, MapsActivity.class);
        startActivity(intencion);
    }

    void verInfopedido(View view){
        Intent intencion = new Intent(this, InfopedidoActivity.class);
        startActivity(intencion);
    }

}
