package com.ei.pedro.personalapp;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Inicio extends Fragment implements View.OnClickListener{

    Button btnhabilitacoes, btninteresses, btncronologia, btndeondevenho, btnsobremim;

    public Inicio() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_inicio, container, false);
        btnhabilitacoes = view.findViewById(R.id.btn_habilitacoes);
        btnhabilitacoes.setOnClickListener(this);

        btninteresses = view.findViewById(R.id.btn_interesses);
        btninteresses.setOnClickListener(this);

        btncronologia = view.findViewById(R.id.btn_cronologia);
        btncronologia.setOnClickListener(this);

        btndeondevenho = view.findViewById(R.id.btn_deondevenho);
        btndeondevenho.setOnClickListener(this);

        btnsobremim = view.findViewById(R.id.btn_sobremim);
        btnsobremim.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_habilitacoes:
                Habilitacoes habilitacoes = new Habilitacoes();
                FragmentTransaction manager = getFragmentManager().beginTransaction();
                manager.replace(R.id.fragment_layout, habilitacoes, habilitacoes.getTag()).commit();
                break;

            case R.id.btn_interesses:
                Interesses interesses = new Interesses();
                manager = getFragmentManager().beginTransaction();
                manager.replace(R.id.fragment_layout, interesses, interesses.getTag()).commit();
                break;

            case R.id.btn_cronologia:
                Cronologia cronologia = new Cronologia();
                manager = getFragmentManager().beginTransaction();
                manager.replace(R.id.fragment_layout, cronologia, cronologia.getTag()).commit();
                break;

            case R.id.btn_deondevenho:
                DeOndeVenho deOndeVenho = new DeOndeVenho();
                manager = getFragmentManager().beginTransaction();
                manager.replace(R.id.fragment_layout, deOndeVenho, deOndeVenho.getTag()).commit();
                break;

            case R.id.btn_sobremim:
                SobreMim sobreMim = new SobreMim();
                manager = getFragmentManager().beginTransaction();
                manager.replace(R.id.fragment_layout, sobreMim, sobreMim.getTag()).commit();
                break;
        }

    }


}
