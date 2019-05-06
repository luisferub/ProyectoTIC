package com.user.discoverfood.Menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Toast;
import com.user.discoverfood.R;
import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity implements android.widget.CompoundButton.OnCheckedChangeListener {

    static int aux=0;
    int contador=0;
    ListView lv;
    ArrayList<Filtro> filtroList;
    ListAdapter ftadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btn;

        lv = (ListView) findViewById(R.id.listview);
        displayfiltroList();

        btn=(Button)findViewById(R.id.contButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aux==0){
                    Toast.makeText(MenuActivity.this,"Por favor elija una opción", Toast.LENGTH_LONG).show();
                }
                else if(contador==1){
                    verMenu2();
                    finish();
                }
                else{
                    Toast.makeText(MenuActivity.this,"Por favor elija solamente una opción", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    void verMenu2(){
        Intent intencion = new Intent(this, Menu2Activity.class);
        startActivity(intencion);
    }

    private void displayfiltroList(){
        filtroList = new ArrayList<Filtro>();
        filtroList.add(new Filtro("Pollo"));
        filtroList.add(new Filtro("Comida Rapida"));
        filtroList.add(new Filtro("Comida Mexicana"));

        ftadapter= new ListAdapter(filtroList, this);
        lv.setAdapter(ftadapter);
    }

    @Override
    public void  onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        int pos = lv.getPositionForView(buttonView);
        if(pos != ListView.INVALID_POSITION){
            Filtro f = filtroList.get(pos);
            f.setSelected(isChecked);
            boolean bool=isChecked;
            if(bool==true){
                contador++;
            }
            if(bool==false){
                contador--;
            }
            if(contador==0){
                aux=0;
            }
            if(contador==1){
                for(int i=0; i<filtroList.size(); i++){
                    Filtro I = filtroList.get(i);
                    if(I.isSelected()==true){
                        aux=i+1;
                    }
                }
            }
        }
    }
}
