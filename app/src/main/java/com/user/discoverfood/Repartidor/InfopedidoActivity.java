package com.user.discoverfood.Repartidor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.user.discoverfood.R;

public class InfopedidoActivity extends AppCompatActivity {

    TextView nombre, precio, pedido, telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infopedido);

        nombre = (TextView) findViewById(R.id.nombre);
        nombre.setText(RepartidorActivity.nombreAux);

        precio = (TextView) findViewById(R.id.precio);
        precio.setText(RepartidorActivity.precioAux);

        pedido = (TextView) findViewById(R.id.pedido);
        pedido.setText(RepartidorActivity.pedidoAux);

        telefono = (TextView) findViewById(R.id.telefono);
        telefono.setText(RepartidorActivity.telefonoAux);
    }
}
