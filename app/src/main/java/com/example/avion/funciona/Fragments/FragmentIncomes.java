package com.example.avion.funciona.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.avion.funciona.Adapters.IncomesAdapter;
import com.example.avion.funciona.Entities.Incomes;
import com.example.avion.funciona.R;

import java.util.ArrayList;

public class FragmentIncomes extends Fragment {
    RecyclerView recyclerViewIncomes;
    ArrayList<Incomes> incomes_list = new ArrayList<Incomes>();
    public FragmentIncomes() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_incomes, container, false);
        recyclerViewIncomes= (RecyclerView)view.findViewById(R.id.recycler_incomes);
        recyclerViewIncomes.setLayoutManager(new LinearLayoutManager(getContext()));
        fillList1();
        IncomesAdapter incomesAdapter = new IncomesAdapter(incomes_list);
        recyclerViewIncomes.setAdapter(incomesAdapter);

        return view;
    }

    private void fillList1(){
        incomes_list.add(new Incomes("Account 1", "123", "1", "2", "21"));
        incomes_list.add(new Incomes("Account 2", "123", "1", "2", "21"));
        incomes_list.add(new Incomes("Account 3", "123", "1", "2", "21"));
        incomes_list.add(new Incomes("Account 4", "123", "1", "2", "21"));
        incomes_list.add(new Incomes("Account 5", "123", "1", "2", "21"));
        incomes_list.add(new Incomes("Account 6", "123", "1", "2", "21"));
        incomes_list.add(new Incomes("Account 7", "123", "1", "2", "21"));
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
