package com.example.juan.empleados.fragments;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.juan.empleados.R;
import com.example.juan.empleados.clases.AdapterEmpleados;
import com.example.juan.empleados.clases.Empleados;
import com.example.juan.empleados.interfaces.Navegacion;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ListaFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ListaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListaFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public ListaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ListaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ListaFragment newInstance(String param1, String param2) {
        ListaFragment fragment = new ListaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    private RecyclerView recyclerEmpleado;
    View view;
    ArrayList<Empleados> listaEmpleados;
    Navegacion navegacion;
    Activity activity;
    Empleados miEmpleados;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_lista, container, false);
        recyclerEmpleado = view.findViewById(R.id.recyler);


        Bundle miBundle=getArguments();
        miEmpleados=(Empleados) miBundle.getSerializable("objeto");
        

        //llenarRecycler();
        return view;
    }

    private void llenarRecycler() {
        listaEmpleados = new ArrayList<>();

        miEmpleados = new Empleados(2 * 4, "Oficina", "Tecnico en Secretariado", "Victor Manuel Garcia", "1098313772", "Masculino");
        listaEmpleados.add(miEmpleados);
        miEmpleados = new Empleados(3 * 4, "Portero", "Seguridad", "Ronald ....", "1098313772", "Masculino");
        listaEmpleados.add(miEmpleados);
        miEmpleados = new Empleados(4 * 4, "Secretaria", "Tecnico en Secretariado", "Camila Rodriguez", "1098313772", "Femenino");
        listaEmpleados.add(miEmpleados);
        miEmpleados = new Empleados(5 * 4, "Desarrollador", "Tecnico en Sistemas", "Sebastian Gamez", "1098313772", "Masculino");
        listaEmpleados.add(miEmpleados);
        miEmpleados = new Empleados(6 * 4, "Tester", "Tecnico en Sistemas", "Carlos Perez", "1098313772", "Masculino");
        listaEmpleados.add(miEmpleados);
        miEmpleados = new Empleados(7 * 4, "Documentación", "Tecnico en Sistemas", "Jaison Quiroga", "1098313772", "Masculino");
        listaEmpleados.add(miEmpleados);

        AdapterEmpleados miAdapterEmpleados = new AdapterEmpleados(listaEmpleados, getContext());
        recyclerEmpleado.setAdapter(miAdapterEmpleados);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof Activity){
            activity=(Activity) context;
            navegacion=(Navegacion) activity;
        }
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
