package com.user.discoverfood.Menu;

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
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);

        n=(EditText)findViewById(R.id.etn);
        t=(EditText)findViewById(R.id.ett);
        btn=(Button)findViewById(R.id.btnc);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nom = n.getText().toString().trim();
                String tel = t.getText().toString().trim();
                if(TextUtils.isEmpty(nom) || TextUtils.isEmpty(tel)){
                    Toast.makeText(ClienteActivity.this,"Ingrese su nombre y su telefono", Toast.LENGTH_LONG).show();
                }
                else {
                    verMenu();
                }
            }
        });
    }

    void verMenu(){
        Intent intencion = new Intent(this, MenuActivity.class);
        startActivity(intencion);
    }

}
