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
        super.onSaveInstanceState(outState);    }

    RecyclerView recyclerViewExpenses;
    ArrayList<Expenses> expenses_list = new ArrayList<Expenses>();
    public FragmentExpenses() {  }

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
        expenses_list.add(new Expenses("Account 1", "$800.00", "Provider 1", "Product 1", "1", "$800.00", "2323"));
        expenses_list.add(new Expenses("Account 2", "$250.00", "Provider 2", "Product 2", "1", "$250.00","23" ));
        expenses_list.add(new Expenses("Account 3", "$480.00", "Provider 3", "Product 3", "1", "$480.00", "43" ));
        expenses_list.add(new Expenses("Account 4", "$571.00", "Provider 4", "Product 4", "1", "$571.00", "32"));
        expenses_list.add(new Expenses("Account 5", "$403.00", "Provider 5", "Product 5", "1", "$403.00", "32"));
        expenses_list.add(new Expenses("Account 6", "$65.00", "Provider 6", "Product 6", "1", "$65.00", "32"));
        expenses_list.add(new Expenses("Account 7", "$249.50", "Provider 7", "Product 7", "1", "$249.50", "32"));

    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


}
