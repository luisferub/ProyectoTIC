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

        //Frisby

        // Pollo apanado

        int[] plato1_images = {
                R.drawable.pollo,
                R.drawable.pollo_relleno,
                R.drawable.alitas_apanadas

        };

        String[] plato1_headings = {
                "Un pollo apanado",
                "Pollo apanado relleno",
                "Alitas apanadas"

        };

        String[] plato1_desc = {
                "Valor: $30000",
                "Valor: $19900",
                "Valor: $10900"

        };

        // Sándwich de pollo

        int[] plato2_images = {
                R.drawable.sandwich_asado,
                R.drawable.sandwich_barbacoa,
                R.drawable.sandwich_especial

        };

        String[] plato2_headings = {
                "Sándwich de pollo asado",
                "Sándwich de pollo BBQ",
                "Sándwich de pollo especial"

        };

        String[] plato2_desc = {
                "Valor: $12000",
                "Valor: $12000",
                "Valor: $12000"

        };

        // Nuggets

        int[] plato3_images = {
                R.drawable.nuggets,
                R.drawable.nuggets_bbq,
                R.drawable.frisnack

        };

        String[] plato3_headings = {
                "Nuggets de pollo",
                "Nuggets de pollo BBQ",
                "Frisnack"

        };

        String[] plato3_desc = {
                "Valor: $10900",
                "Valor: $10900",
                "Valor: $10900"

        };

        //Mc Donalds

        // Hamburguesa

        int[] plato4_images = {
                R.drawable.hamburguesa,
                R.drawable.hamburguesa_pollo,
                R.drawable.hamburguesa_especial

        };

        String[] plato4_headings = {
                "Hamburguesa con queso",
                "Hamburguesa de pollo",
                "Hamburguesa especial"

        };

        String[] plato4_desc = {
                "Valor: $6000",
                "Valor: $8000",
                "Valor: $18900"

        };

        // Pizza

        int[] plato5_images = {
                R.drawable.pizza_napolitana,
                R.drawable.pizza_pepperoni,
                R.drawable.pizza_vegetariana

        };

        String[] plato5_headings = {
                "Pizza napolitana",
                "Pizza pepperoni",
                "Pizza vegetariana"

        };

        String[] plato5_desc = {
                "Valor: $20000",
                "Valor: $20000",
                "Valor: $20000"

        };

        // Helado

        int[] plato6_images = {
                R.drawable.mc_coloso,
                R.drawable.sundae,
                R.drawable.helado

        };

        String[] plato6_headings = {
                "Mc Coloso",
                "Sundae de chocolate",
                "McFlurry"

        };

        String[] plato6_desc = {
                "Valor: $6000",
                "Valor: $5000",
                "Valor: $7900"

        };

        //Tacos & BBQ

        // Burrito

        int[] plato7_images = {
                R.drawable.burritos_carne,
                R.drawable.burritos_cerdo,
                R.drawable.burritos_pollo

        };

        String[] plato7_headings = {
                "Burritos de carne",
                "Burritos de cerdo",
                "Burritos de pollo"

        };

        String[] plato7_desc = {
                "Valor: $8000",
                "Valor: $8000",
                "Valor: $9000"

        };

        // Quesadilla

        int[] plato8_images = {
                R.drawable.quesadilla_carne,
                R.drawable.quesadilla_pollo,
                R.drawable.quesadilla_bbq

        };

        String[] plato8_headings = {
                "Quesadilla de carne",
                "Quesadilla de pollo",
                "Quesadilla BBQ"

        };

        String[] plato8_desc = {
                "Valor: $12000",
                "Valor: $12000",
                "Valor: $12000"

        };

        // Tacos

        int[] plato9_images = {
                R.drawable.tacos_salmon,
                R.drawable.tacos_pollo,
                R.drawable.tacos_pastor

        };

        String[] plato9_headings = {
                "Tacos de salmón",
                "Tacos de pollo",
                "Tacos al pastor"

        };

        String[] plato9_desc = {
                "Valor: $12000",
                "Valor: $8000",
                "Valor: $6000"

        };

        int position = (int) (Math.random() * 3);

        TextView platoHeading = (TextView) findViewById(R.id.plato_head);
        TextView platoDesc = (TextView) findViewById(R.id.plato_desc);
        ImageView platoImageView = (ImageView) findViewById(R.id.plato_image);

        if(MenuActivity.aux==1) {
            if(Menu2Activity.auxiliar==1){
                platoImageView.setImageResource(plato1_images[position]);
                platoHeading.setText(plato1_headings[position]);
                platoDesc.setText(plato1_desc[position]);
                nombre=ClienteActivity.nom;
                pedido=plato1_headings[position];
                precio=plato1_desc[position];
                telefono=ClienteActivity.tel;
            }
            if(Menu2Activity.auxiliar==2){
                platoImageView.setImageResource(plato2_images[position]);
                platoHeading.setText(plato2_headings[position]);
                platoDesc.setText(plato2_desc[position]);
                nombre=ClienteActivity.nom;
                pedido=plato2_headings[position];
                precio=plato2_desc[position];
                telefono=ClienteActivity.tel;
            }
            if(Menu2Activity.auxiliar==3){
                platoImageView.setImageResource(plato3_images[position]);
                platoHeading.setText(plato3_headings[position]);
                platoDesc.setText(plato3_desc[position]);
                nombre=ClienteActivity.nom;
                pedido=plato3_headings[position];
                precio=plato3_desc[position];
                telefono=ClienteActivity.tel;
            }
        }


        if(MenuActivity.aux==2) {
            if(Menu2Activity.auxiliar==1){
                platoImageView.setImageResource(plato4_images[position]);
                platoHeading.setText(plato4_headings[position]);
                platoDesc.setText(plato4_desc[position]);
                nombre=ClienteActivity.nom;
                pedido=plato4_headings[position];
                precio=plato4_desc[position];
                telefono=ClienteActivity.tel;
            }
            if(Menu2Activity.auxiliar==2){
                platoImageView.setImageResource(plato5_images[position]);
                platoHeading.setText(plato5_headings[position]);
                platoDesc.setText(plato5_desc[position]);
                nombre=ClienteActivity.nom;
                pedido=plato5_headings[position];
                precio=plato5_desc[position];
                telefono=ClienteActivity.tel;
            }
            if(Menu2Activity.auxiliar==3){
                platoImageView.setImageResource(plato6_images[position]);
                platoHeading.setText(plato6_headings[position]);
                platoDesc.setText(plato6_desc[position]);
                nombre=ClienteActivity.nom;
                pedido=plato6_headings[position];
                precio=plato6_desc[position];
                telefono=ClienteActivity.tel;
            }
        }


        if(MenuActivity.aux==3) {
            if(Menu2Activity.auxiliar==1){
                platoImageView.setImageResource(plato7_images[position]);
                platoHeading.setText(plato7_headings[position]);
                platoDesc.setText(plato7_desc[position]);
                nombre=ClienteActivity.nom;
                pedido=plato7_headings[position];
                precio=plato7_desc[position];
                telefono=ClienteActivity.tel;
            }
            if(Menu2Activity.auxiliar==2){
                platoImageView.setImageResource(plato8_images[position]);
                platoHeading.setText(plato8_headings[position]);
                platoDesc.setText(plato8_desc[position]);
                nombre=ClienteActivity.nom;
                pedido=plato8_headings[position];
                precio=plato8_desc[position];
                telefono=ClienteActivity.tel;
            }
            if(Menu2Activity.auxiliar==3){
                platoImageView.setImageResource(plato9_images[position]);
                platoHeading.setText(plato9_headings[position]);
                platoDesc.setText(plato9_desc[position]);
                nombre=ClienteActivity.nom;
                pedido=plato9_headings[position];
                precio=plato9_desc[position];
                telefono=ClienteActivity.tel;
            }
        }
    }
}
