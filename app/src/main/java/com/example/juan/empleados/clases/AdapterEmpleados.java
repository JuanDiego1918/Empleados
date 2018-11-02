package com.example.juan.empleados.clases;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.juan.empleados.R;

import java.util.ArrayList;

public class AdapterEmpleados extends RecyclerView.Adapter<AdapterEmpleados.AdapterHolder> {

    ArrayList<Empleados> listaEmpleado;
    Context context;

    public AdapterEmpleados(ArrayList<Empleados> listaEmpleado, Context context) {
        this.listaEmpleado = listaEmpleado;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterEmpleados.AdapterHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.modelo_empleado, null, false);
        return new AdapterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterEmpleados.AdapterHolder adapterHolder, int i) {
        adapterHolder.nombre.setText("Nombre: " + listaEmpleado.get(i).getNombre());
        adapterHolder.cedula.setText("Cedula:  " + listaEmpleado.get(i).getCedula());
        adapterHolder.edad.setText("Edad: " + listaEmpleado.get(i).getAñosDeTrabajo());
        adapterHolder.dependencia.setText("Dependencia: " + listaEmpleado.get(i).getDependencia());
        adapterHolder.genero.setText("Genero: " + listaEmpleado.get(i).getGenero());
        adapterHolder.imagen.setImageDrawable(context.getDrawable(R.drawable.persona));
    }

    @Override
    public int getItemCount() {
        return listaEmpleado.size();
    }

    public class AdapterHolder extends RecyclerView.ViewHolder {
        TextView nombre, cedula, edad, dependencia, genero;
        ImageView imagen;

        public AdapterHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.nombreAdapter);
            cedula = itemView.findViewById(R.id.cedulaAdapter);
            edad = itemView.findViewById(R.id.EdadAdapter);
            dependencia = itemView.findViewById(R.id.DependenciaAdapter);
            genero = itemView.findViewById(R.id.GeneroAdapter);
            imagen = itemView.findViewById(R.id.foto);
        }
    }
}
