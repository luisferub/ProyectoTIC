package com.user.discoverfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.user.discoverfood.Menu.PlatoActivity;
import com.user.discoverfood.Repartidor.AuxiliarActivity;
import com.user.discoverfood.Repartidor.RepartidorActivity;

/**
 * A login screen that offers login via username/password.
 */
public class LoginActivity extends AppCompatActivity {

    // UI references.
    private EditText mPasswordView, mUsername;
    private View mProgressView;
    private View mLoginFormView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Set up the login form.
        mUsername = (EditText) findViewById(R.id.txtUsername);
        mPasswordView = (EditText) findViewById(R.id.txtPassword);

        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String Username = mUsername.getText().toString();
                String Pass = mPasswordView.getText().toString();
                if(Username.equalsIgnoreCase("usuario") && Pass.equals("12345")) {
                    if(MainActivity.flag==1){
                        Intent intencion = new Intent(LoginActivity.this, RepartidorActivity.class);
                        startActivity(intencion);
                        Toast.makeText(LoginActivity.this,"Inicio de sesión correcto", Toast.LENGTH_LONG).show();
                    }
                    else{
                        Intent intencion = new Intent(LoginActivity.this, AuxiliarActivity.class);
                        startActivity(intencion);
                        Toast.makeText(LoginActivity.this,"Inicio de sesión correcto", Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(LoginActivity.this,"Usuario o Contraseña incorrectos", Toast.LENGTH_LONG).show();
                }
            }
        });

        mLoginFormView = findViewById(R.id.login_form);
        mProgressView = findViewById(R.id.login_progress);
    }

}

