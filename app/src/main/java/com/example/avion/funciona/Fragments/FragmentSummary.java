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
import com.example.avion.funciona.Entities.Summary;
import com.example.avion.funciona.R;

import java.util.ArrayList;

public class FragmentSummary extends Fragment {
    RecyclerView recycler;
    ArrayList<Summary> summary_list = new ArrayList<Summary>();

    public FragmentSummary() { }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_summary, container,false);

        recycler = (RecyclerView) view.findViewById(R.id.recycler_summary);
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        fillList();
        SummaryAdapter summaryAdapter = new SummaryAdapter(summary_list);
        recycler.setAdapter(summaryAdapter);

        return view;
    }

    private void fillList(){
        summary_list.add(new Summary("Account 1", "+$200.00", "$1000.00", "$800.00"));
        summary_list.add(new Summary("Account 2", "-$50.00", "$200.00", "$250.00"));
        summary_list.add(new Summary("Account 3", "+$20.00", "500.00", "$480.00"));
        summary_list.add(new Summary("Account 4", "-$1.00", "$570.00", "$571.00"));
        summary_list.add(new Summary("Account 5", "+$2.00", "$405.00", "$403.00"));
        summary_list.add(new Summary("Account 6", "+$10.00", "$75.00", "$65.00"));
        summary_list.add(new Summary("Account 7", "+$0.50", "$205.00", "$249.50"));
    }
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}

