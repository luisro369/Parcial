package com.example.avion.funciona.Activities;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.avion.funciona.Adapters.StockAdapter;
import com.example.avion.funciona.Entities.Item;
import com.example.avion.funciona.Fragments.FRagmentStock;
import com.example.avion.funciona.Fragments.FragmentAccounts;
import com.example.avion.funciona.Fragments.FragmentExpenses;
import com.example.avion.funciona.Fragments.FragmentIncomes;
import com.example.avion.funciona.Fragments.FragmentSummary;
import com.example.avion.funciona.Fragments.Menus;
import com.example.avion.funciona.Fragments.Selects;
import com.example.avion.funciona.R;

import java.util.ArrayList;

public class ContenedorActivity extends AppCompatActivity implements Menus.OnFragmentInteractionListener,Selects.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor);

        //===============================elegir que fragment meter en los lugares correspondientes============
        Bundle boton = getIntent().getExtras();
        FragmentTransaction fr = getSupportFragmentManager().beginTransaction();

        if(boton.getInt("summary") == 1){
            fr.replace(R.id.contenedor2, new FragmentSummary());
            fr.addToBackStack(null);
            fr.commit();
        }//if summary
        else if(boton.getInt("account") == 2){
            fr.replace(R.id.contenedor2, new FragmentAccounts());
            //fr.addToBackStack(null);
            fr.commit();
        }//if accounts
        else if(boton.getInt("incomes") == 3){
            fr.replace(R.id.contenedor2, new FragmentIncomes());
            //fr.addToBackStack(null);
            fr.commit();
        }//if incomes
        else if(boton.getInt("expenses") == 4){
            fr.replace(R.id.contenedor2, new FragmentExpenses());
            //fr.addToBackStack(null);
            fr.commit();
        }//if expenses
        else if(boton.getInt("stock") == 5){
            fr.replace(R.id.contenedor2, new FRagmentStock());
            //fr.addToBackStack(null);
            fr.commit();
        }//if stock

    }//on create


    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

}
