package com.ei.pedro.personalapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Inicio extends Fragment implements View.OnClickListener{

    Button btnskills, btninteresses, btntimeline, btndeondevenho, btnsobremim;

    public Inicio() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_inicio, container, false);
        btnskills = view.findViewById(R.id.btn_skills);
        btnskills.setOnClickListener(this);

        btninteresses = view.findViewById(R.id.btn_interesses);
        btninteresses.setOnClickListener(this);

        btntimeline = view.findViewById(R.id.btn_timeline);
        btntimeline.setOnClickListener(this);

        btndeondevenho = view.findViewById(R.id.btn_deondevenho);
        btndeondevenho.setOnClickListener(this);

        btnsobremim = view.findViewById(R.id.btn_sobremim);
        btnsobremim.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_skills:
                Skills skills = new Skills();
                FragmentTransaction manager = getFragmentManager().beginTransaction();
                manager.replace(R.id.fragment_layout, skills, skills.getTag()).commit();
        }

        switch (v.getId()){
            case R.id.btn_timeline:
                Timeline timeline = new Timeline();
                FragmentTransaction manager = getFragmentManager().beginTransaction();
                manager.replace(R.id.fragment_layout, timeline, timeline.getTag()).commit();
        }

        switch (v.getId()){
            case R.id.btn_interesses:
                Interesses interesses = new Interesses();
                FragmentTransaction manager = getFragmentManager().beginTransaction();
                manager.replace(R.id.fragment_layout, interesses, interesses.getTag()).commit();
        }

        switch (v.getId()){
            case R.id.btn_deondevenho:
                DeOndeVenho deOndeVenho = new DeOndeVenho();
                FragmentTransaction manager = getFragmentManager().beginTransaction();
                manager.replace(R.id.fragment_layout, deOndeVenho, deOndeVenho.getTag()).commit();
        }

        switch (v.getId()){
            case R.id.btn_sobremim:
                SobreMim sobreMim = new SobreMim();
                FragmentTransaction manager = getFragmentManager().beginTransaction();
                manager.replace(R.id.fragment_layout, sobreMim, sobreMim.getTag()).commit();
        }
    }


}
