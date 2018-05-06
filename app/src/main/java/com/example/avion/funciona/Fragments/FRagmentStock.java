package com.example.avion.funciona.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.avion.funciona.Activities.AddItemStock;
import com.example.avion.funciona.Adapters.StockAdapter;
import com.example.avion.funciona.Entities.Item;
import com.example.avion.funciona.R;

import java.util.ArrayList;

public class FRagmentStock extends Fragment {
    //------------------variables--------------
    RecyclerView recicler;
    ArrayList<Item> item_list = new ArrayList<Item>();

    //------------------variables--------------
    public FRagmentStock() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_stock, container, false);//original
        View view = inflater.inflate(R.layout.fragment_stock, container,false);
        //=============declarando arrays de cardview===================

        recicler = (RecyclerView) view.findViewById(R.id.recycler_stock);
        recicler.setLayoutManager(new LinearLayoutManager(getContext()));
        llenarLista();
        StockAdapter stockAdapter = new StockAdapter(item_list);
        recicler.setAdapter(stockAdapter);

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stock_intent = new Intent(getContext(), AddItemStock.class);
                startActivity(stock_intent);
            }
        });


        return view;
    }

    private void llenarLista(){
        item_list.add(new Item("I0001", "Chikorita", "1", "$99.99", "$50.00", R.drawable.chikorita));
        item_list.add(new Item("I0002", "ONI", "3", "$14.50","$7.75", R.drawable.oni));
        item_list.add(new Item("I0003", "Mastur Ch33f", "10", "$0.99", "$0.25", R.drawable.uni));
        item_list.add(new Item("I0001", "Chikorita", "1", "$99.99", "50.00", R.drawable.chikorita));
        item_list.add(new Item("I0002", "ONI", "3", "$14.50","$7.75", R.drawable.oni));
        item_list.add(new Item("I0003", "Mastur Ch33f", "10", "$0.99", "$0.25", R.drawable.uni));

    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
