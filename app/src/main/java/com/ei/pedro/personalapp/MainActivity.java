package com.ei.pedro.personalapp;

import android.app.Dialog;
import android.content.ClipData;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Dialog popup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        popup = new Dialog(this);

        Inicio inicio = new Inicio();
        android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.fragment_layout, inicio, inicio.getTag()).commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_github) {
            return true;
        }
        if (id == R.id.action_linkedin) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_inicio) {
            Toast.makeText(this, "Inicio", Toast.LENGTH_SHORT).show();

            Inicio inicio = new Inicio();
            android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.fragment_layout, inicio, inicio.getTag()).commit();

        } else if (id == R.id.nav_skills) {
            Toast.makeText(this, "Skills", Toast.LENGTH_SHORT).show();

            Habilitacoes habilitacoes = new Habilitacoes();
            android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.fragment_layout, habilitacoes, habilitacoes.getTag())
                    .commit();
        } else if (id == R.id.nav_cronologia) {
            Toast.makeText(this, "Cronologia", Toast.LENGTH_SHORT).show();

            Cronologia cronologia = new Cronologia();
            android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.fragment_layout, cronologia, cronologia.getTag())
                    .commit();

        } else if (id == R.id.nav_interesses) {
            Toast.makeText(this, "Interesses", Toast.LENGTH_SHORT).show();

            Interesses interesses = new Interesses();
            android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.fragment_layout, interesses, interesses.getTag())
                    .commit();

        } else if (id == R.id.nav_deondevenho) {
            Toast.makeText(this, "De onde venho", Toast.LENGTH_SHORT).show();

            DeOndeVenho deOndeVenho = new DeOndeVenho();
            android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.fragment_layout, deOndeVenho, deOndeVenho.getTag())
                    .commit();

        } else if (id == R.id.nav_sobremim) {
            Toast.makeText(this, "Sobre mim", Toast.LENGTH_SHORT).show();

            SobreMim sobreMim = new SobreMim();
            android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.fragment_layout, sobreMim, sobreMim.getTag())
                    .commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    //------------------- Abrir popup quando clicar no elemento
    public void showPopup(View v){
        TextView fecharPopup;

        switch(v.getId()){
            //---------- Popups interesses
            case R.id.interesse_computador:
                popup.setContentView(R.layout.popup_programacao);
                fecharPopup = (TextView) popup.findViewById(R.id.fechar_popup_programacao);
                fecharPopup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popup.dismiss();
                    }
                });
                break;

            case R.id.interesses_futebol:
                popup.setContentView(R.layout.popup_futebol);
                fecharPopup = (TextView) popup.findViewById(R.id.fechar_popup_futebol);
                fecharPopup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popup.dismiss();
                    }
                });
                break;

            case R.id.interesses_correr:
                popup.setContentView(R.layout.popup_correr);
                fecharPopup = (TextView) popup.findViewById(R.id.fechar_popup_correr);
                fecharPopup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popup.dismiss();
                    }
                });
                break;

            case R.id.interesses_jogar:
                popup.setContentView(R.layout.popup_jogar);
                fecharPopup = (TextView) popup.findViewById(R.id.fechar_popup_jogar);
                fecharPopup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popup.dismiss();
                    }
                });
                break;

            case R.id.interesses_comer:
                popup.setContentView(R.layout.popup_comida);
                fecharPopup = (TextView) popup.findViewById(R.id.fechar_popup_comida);
                fecharPopup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popup.dismiss();
                    }
                });
                break;

            case R.id.interesses_video:
                popup.setContentView(R.layout.popup_video);
                fecharPopup = (TextView) popup.findViewById(R.id.fechar_popup_video);
                fecharPopup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popup.dismiss();
                    }
                });
                break;


            //---------------- Popup imagem habilitações
            case R.id.pic_ipvc:
                popup.setContentView(R.layout.popup_ipvc);
                fecharPopup = (TextView) popup.findViewById(R.id.fechar_popup);
                fecharPopup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popup.dismiss();
                    }
                });
                break;

        }
        popup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popup.show();

    }
}
