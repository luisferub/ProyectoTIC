package com.user.discoverfood.Menu;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.user.discoverfood.R;
import org.w3c.dom.Text;

import java.util.List;

class Filtro {

    String nombre;
    boolean selected = false;

    public Filtro(String nombre) {
        super();
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected=selected;
    }

}

public class ListAdapter extends ArrayAdapter<Filtro> {

    private List<Filtro> filtroList;
    private Context context;

    public ListAdapter(List<Filtro> filtroList, Context context) {
        super(context, R.layout.single_listview_item,filtroList);
        this.filtroList=filtroList;
        this.context=context;
    }

    private static class FiltroHolder {
        public TextView filtroNombre;
        public CheckBox cBox;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        FiltroHolder holder = new FiltroHolder();

        if(convertView == null){

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v=inflater.inflate(R.layout.single_listview_item, null);

            holder.filtroNombre=(TextView) v.findViewById(R.id.tview);
            holder.cBox=(CheckBox) v.findViewById(R.id.cbox);

            holder.cBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) context);

        }
        else {
            holder=(FiltroHolder) v.getTag();
        }

        Filtro f = filtroList.get(position);
        holder.filtroNombre.setText(f.getNombre());
        holder.cBox.setChecked(f.isSelected());
        holder.cBox.setTag(f);

        return v;
    }
}
