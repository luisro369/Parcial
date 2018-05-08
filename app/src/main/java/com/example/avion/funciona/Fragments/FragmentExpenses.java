package com.example.avion.funciona.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.avion.funciona.Adapters.AccountAdapter;
import com.example.avion.funciona.Adapters.ExpensesAdapter;
import com.example.avion.funciona.Entities.Expenses;
import com.example.avion.funciona.R;

import java.util.ArrayList;


public class FragmentExpenses extends Fragment {

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);



    }

    RecyclerView recyclerViewExpenses;
    ArrayList<Expenses> expenses_list = new ArrayList<Expenses>();
    public FragmentExpenses() {
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
        View view = inflater.inflate(R.layout.fragment_expenses, container, false);
        recyclerViewExpenses= (RecyclerView)view.findViewById(R.id.recycler_expenses);
        recyclerViewExpenses.setLayoutManager(new LinearLayoutManager(getContext()));
        fillList();
        ExpensesAdapter expensesAdapter = new ExpensesAdapter(expenses_list);
        recyclerViewExpenses.setAdapter(expensesAdapter);

        return view;

    }


    private void fillList(){
        expenses_list.add(new Expenses("Account 1", "233", "343", "weeqw", "34", "233", "2323"));
        expenses_list.add(new Expenses("Cuenta 2", "50.0", "45.0", "12.5", "78", "45","23" ));
        expenses_list.add(new Expenses("Cuenta 3", "200.0", "50.0", "8.3", "84", "43", "43" ));
        expenses_list.add(new Expenses("Cuenta 4", "70.0", "25.0", "18.5 ", "45", "23", "32"));

    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


}
