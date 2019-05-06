package com.user.discoverfood.Menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.user.discoverfood.MainActivity;
import com.user.discoverfood.R;
import java.util.*;

public class PlatoActivity extends AppCompatActivity {

    Button btnContinuar;

    public static ArrayList<String> nombrelista = new ArrayList<String>();
    public static ArrayList<String> preciolista = new ArrayList<String>();
    public static ArrayList<String> pedidolista = new ArrayList<String>();
    public static ArrayList<String> telefonolista = new ArrayList<String>();
    String nombre;
    String precio;
    String pedido;
    String telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plato);

        btnContinuar=(Button)findViewById(R.id.contButton);
        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombrelista.add(nombre);
                preciolista.add(precio);
                pedidolista.add(pedido);
                telefonolista.add(telefono);
                Toast.makeText(PlatoActivity.this,"Pedido ordenado satisfactoriamente", Toast.LENGTH_LONG).show();
                MainActivity.flag=1;
                finish();
            }
        });

        // Frisby

        int[] plato1_images = {
                R.drawable.pollo,
                R.drawable.picada,
                R.drawable.frisnack

        };

        String[] plato1_headings = {
                "Un pollo apanado",
                "Picada Frisby",
                "Frisnack"

        };

        String[] plato1_desc = {
                "Valor: $30000",
                "Valor: $45000",
                "Valor: $10900"

        };

        //Mc Donalds

        int[] plato2_images = {
                R.drawable.hamburguesa,
                R.drawable.hamburguesa_pollo,
                R.drawable.helado

        };

        String[] plato2_headings = {
                "Hamburguesa con queso",
                "Hamburguesa de pollo",
                "McFlurry"

        };

        String[] plato2_desc = {
                "Valor: $6000",
                "Valor: $8000",
                "Valor: $7900"

        };

        //Tacos & BBQ

        int[] plato3_images = {
                R.drawable.burritos,
                R.drawable.quesadilla,
                R.drawable.tacos_plato

        };

        String[] plato3_headings = {
                "Burritos de carne",
                "Quesadilla de pollo",
                "Tacos al pastor"

        };

        String[] plato3_desc = {
                "Valor: $8000 c/u",
                "Valor: $12000 c/u",
                "Valor: $6000 c/u"

        };

        int position=(Menu2Activity.auxiliar)-1;

        TextView platoHeading = (TextView) findViewById(R.id.plato_head);
        TextView platoDesc = (TextView) findViewById(R.id.plato_desc);
        ImageView platoImageView = (ImageView) findViewById(R.id.plato_image);

        if(MenuActivity.aux==1) {
            platoImageView.setImageResource(plato1_images[position]);
            platoHeading.setText(plato1_headings[position]);
            platoDesc.setText(plato1_desc[position]);
            nombre=ClienteActivity.nom;
            pedido=plato1_headings[position];
            precio=plato1_desc[position];
            telefono=ClienteActivity.tel;
        }
        if(MenuActivity.aux==2) {
            platoImageView.setImageResource(plato2_images[position]);
            platoHeading.setText(plato2_headings[position]);
            platoDesc.setText(plato2_desc[position]);
            nombre=ClienteActivity.nom;
            pedido=plato2_headings[position];
            precio=plato2_desc[position];
            telefono=ClienteActivity.tel;
        }
        if(MenuActivity.aux==3) {
            platoImageView.setImageResource(plato3_images[position]);
            platoHeading.setText(plato3_headings[position]);
            platoDesc.setText(plato3_desc[position]);
            nombre=ClienteActivity.nom;
            pedido=plato3_headings[position];
            precio=plato3_desc[position];
            telefono=ClienteActivity.tel;
        }
    }
}
