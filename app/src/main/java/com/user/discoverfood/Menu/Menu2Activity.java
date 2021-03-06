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

public class Menu2Activity extends AppCompatActivity implements android.widget.CompoundButton.OnCheckedChangeListener {

    static int auxiliar=0;
    int contador=0;
    ListView lv;
    ArrayList<Filtro> filtroList;
    ListAdapter ftadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        Button btn;

        lv = (ListView) findViewById(R.id.listview);
        displayfiltroList();

        btn=(Button)findViewById(R.id.contButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(auxiliar==0){
                    Toast.makeText(Menu2Activity.this,"Por favor elija una opción", Toast.LENGTH_LONG).show();
                }
                else if(contador==1){
                    verPlato();
                    finish();
                }
                else {
                    Toast.makeText(Menu2Activity.this,"Por favor elija solamente una opción", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    void verPlato(){
        Intent intencion = new Intent(this, PlatoActivity.class);
        startActivity(intencion);
    }

    private void displayfiltroList(){
        filtroList = new ArrayList<Filtro>();

        if(MenuActivity.aux ==1) {
            filtroList.add(new Filtro("Pollo apanado"));
            filtroList.add(new Filtro("Sándwich de pollo"));
            filtroList.add(new Filtro("Nuggets"));
        }
        if(MenuActivity.aux==2) {
            filtroList.add(new Filtro("Hamburguesa"));
            filtroList.add(new Filtro("Pizza"));
            filtroList.add(new Filtro("Helado"));
        }
        if (MenuActivity.aux==3){
            filtroList.add(new Filtro("Burrito"));
            filtroList.add(new Filtro("Quesadilla"));
            filtroList.add(new Filtro("Tacos"));
        }

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
                auxiliar=0;
            }
            if(contador==1){
                for(int i=0; i<filtroList.size(); i++){
                    Filtro I = filtroList.get(i);
                    if(I.isSelected()==true){
                        auxiliar=i+1;
                    }
                }
            }
        }
    }
}
