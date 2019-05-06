package com.user.discoverfood.Menu;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.user.discoverfood.R;

public class ClienteActivity extends AppCompatActivity {

    EditText n,t;
    Button btn, volver;

    static String nom;
    static String tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);

        n=(EditText)findViewById(R.id.etn);
        t=(EditText)findViewById(R.id.ett);
        btn=(Button)findViewById(R.id.btnc);
        volver=(Button)findViewById(R.id.prevButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nom = n.getText().toString().trim();
                tel = t.getText().toString().trim();
                if(TextUtils.isEmpty(nom) || TextUtils.isEmpty(tel)){
                    Toast.makeText(ClienteActivity.this,"Ingrese su nombre y su telefono", Toast.LENGTH_LONG).show();
                }
                else {
                    verMenu();
                }
            }
        });

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    void verMenu(){
        Intent intencion = new Intent(this, MenuActivity.class);
        startActivity(intencion);
    }

}
