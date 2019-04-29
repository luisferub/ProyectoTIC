package com.user.discoverfood.Repartidor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.user.discoverfood.R;

import java.util.List;

class Filtro {

    String nombre;
    String precio;
    String pedido;
    String telefono;

    boolean selected = false;

    public Filtro(String nombre, String precio, String pedido, String telefono) {
        super();
        this.nombre=nombre;
        this.precio=precio;
        this.pedido=pedido;
        this.telefono=telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public String getPedido() {
        return pedido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public void setPrecio(String precio) {
        this.precio=precio;
    }

    public void setPedido(String pedido) {
        this.pedido=pedido;
    }

    public void setTelefono(String telefono) {
        this.telefono=telefono;
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
        super(context, R.layout.single_listview_item2,filtroList);
        this.filtroList=filtroList;
        this.context=context;
    }

    private static class FiltroHolder {
        public TextView filtroNombre;
        public TextView filtroPrecio;
        public TextView filtroPedido;
        public TextView filtroTelefono;
        public CheckBox cBox;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        FiltroHolder holder = new FiltroHolder();

        if(convertView == null){

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v=inflater.inflate(R.layout.single_listview_item2, null);

            holder.filtroNombre=(TextView) v.findViewById(R.id.nombre);
            holder.filtroPrecio=(TextView) v.findViewById(R.id.precio);
            holder.filtroPedido=(TextView) v.findViewById(R.id.pedido);
            holder.filtroTelefono=(TextView) v.findViewById(R.id.telefono);
            holder.cBox=(CheckBox) v.findViewById(R.id.cbox);

            holder.cBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) context);

        }
        else {
            holder=(FiltroHolder) v.getTag();
        }

        Filtro f = filtroList.get(position);
        holder.filtroNombre.setText(f.getNombre());
        holder.filtroPrecio.setText(f.getPrecio());
        holder.filtroPedido.setText(f.getPedido());
        holder.filtroTelefono.setText(f.getTelefono());
        holder.cBox.setChecked(f.isSelected());
        holder.cBox.setTag(f);

        return v;
    }
}
