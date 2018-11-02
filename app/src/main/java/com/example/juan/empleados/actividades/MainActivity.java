package com.example.juan.empleados.actividades;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.juan.empleados.R;
import com.example.juan.empleados.clases.Empleados;
import com.example.juan.empleados.fragments.BusquedaFragment;
import com.example.juan.empleados.fragments.ListaFragment;
import com.example.juan.empleados.interfaces.Navegacion;

public class MainActivity extends AppCompatActivity implements BusquedaFragment.OnFragmentInteractionListener, ListaFragment.OnFragmentInteractionListener,Navegacion {

    private Fragment miFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miFragment = new BusquedaFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.pantalla, miFragment).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void pantalla(Empleados empleados) {
        Bundle miBundle=new Bundle();
        miFragment=new ListaFragment();
        miBundle.putSerializable("objeto",empleados);
        miFragment.setArguments(miBundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.pantalla, miFragment).commit();
    }
}
