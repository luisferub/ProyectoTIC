package com.user.discoverfood.Menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.user.discoverfood.R;

public class PlatoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plato);

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
                "Valor: $8000 c/u",
                "Valor: $12000 c/u",
                "Valor: $6000 c/u"

        };

        //Tacos & BBQ

        int[] plato3_images = {
                R.drawable.burritos,
                R.drawable.quesadilla,
                R.drawable.tacos_plato

        };

        String[] plato3_headings = {
                "Burritos de carne",
                "Quesadilla de carne",
                "Tacos al pastor"

        };

        String[] plato3_desc = {
                "Valor: $30000",
                "Valor: $45000",
                "Valor: $10900",
                "Valor: $6000",
                "Valor: $8000",
                "Valor: $7900",
                "Valor: $8000 c/u",
                "Valor: $12000 c/u",
                "Valor: $6000 c/u",

        };

        int position=(Menu2Activity.auxiliar)-1;

        TextView platoHeading = (TextView) findViewById(R.id.plato_head);
        TextView platoDesc = (TextView) findViewById(R.id.plato_desc);
        ImageView platoImageView = (ImageView) findViewById(R.id.plato_image);

        if(MenuActivity.aux==1) {
            platoImageView.setImageResource(plato1_images[position]);
            platoHeading.setText(plato1_headings[position]);
            platoDesc.setText(plato1_desc[position]);
        }
        if(MenuActivity.aux==2) {
            platoImageView.setImageResource(plato2_images[position]);
            platoHeading.setText(plato2_headings[position]);
            platoDesc.setText(plato2_desc[position]);
        }
        if(MenuActivity.aux==3) {
            platoImageView.setImageResource(plato3_images[position]);
            platoHeading.setText(plato3_headings[position]);
            platoDesc.setText(plato3_desc[position]);
        }
    }
}
