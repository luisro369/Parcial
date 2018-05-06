package com.example.avion.funciona.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.avion.funciona.Activities.AddItemStock;
import com.example.avion.funciona.Adapters.StockAdapter;
import com.example.avion.funciona.Adapters.SummaryAdapter;
import com.example.avion.funciona.Entities.Item;
import com.example.avion.funciona.R;

import java.util.ArrayList;

public class FragmentSummary extends Fragment {
    //------------------variables--------------
    RecyclerView recicler;
    ArrayList<Item> summary_list = new ArrayList<Item>();

    //------------------variables--------------

    public FragmentSummary() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment_summary, container, false);
        View view = inflater.inflate(R.layout.fragment_summary, container,false);
        //=============declarando arrays de cardview===================

        recicler = (RecyclerView) view.findViewById(R.id.recycler_summary);
        recicler.setLayoutManager(new LinearLayoutManager(getContext()));
        llenarLista();
        SummaryAdapter summaryAdapter = new SummaryAdapter(summary_list);
        recicler.setAdapter(summaryAdapter);

        return view;
    }

    private void llenarLista(){
        summary_list.add(new Item("I0001", "Chikorita", "1", "$99.99", "$50.00", R.drawable.chikorita));
        summary_list.add(new Item("I0002", "ONI", "3", "$14.50","$7.75", R.drawable.oni));
        summary_list.add(new Item("I0003", "Mastur Ch33f", "10", "$0.99", "$0.25", R.drawable.uni));
        summary_list.add(new Item("I0001", "Chikorita", "1", "$99.99", "50.00", R.drawable.chikorita));
        summary_list.add(new Item("I0002", "ONI", "3", "$14.50","$7.75", R.drawable.oni));
        summary_list.add(new Item("I0003", "Mastur Ch33f", "10", "$0.99", "$0.25", R.drawable.uni));

    }
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}

