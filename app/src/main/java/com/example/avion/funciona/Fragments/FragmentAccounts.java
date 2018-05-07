package com.example.avion.funciona.Fragments;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.avion.funciona.Activities.AddAccount;
import com.example.avion.funciona.Adapters.AccountAdapter;
import com.example.avion.funciona.Entities.Accounts;
import com.example.avion.funciona.R;

import java.util.ArrayList;

public class FragmentAccounts extends Fragment {

    RecyclerView recyclerView;
    ArrayList<Accounts> accounts_list = new ArrayList<Accounts>();

    public FragmentAccounts() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        //return inflater.inflate(R.layout.fragment_accounts, container, false);
        View view = inflater.inflate(R.layout.fragment_accounts, container, false);
        recyclerView= (RecyclerView)view.findViewById(R.id.recycler_accounts);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        fillList();
        AccountAdapter accountAdapter = new AccountAdapter(accounts_list);
        recyclerView.setAdapter(accountAdapter);
       // AccountAdapter accountAdapter = new AccountAdapter(getActivity(), accounts_list);
        //recyclerView.setAdapter(accountAdapter);


        FloatingActionButton fab2 = (FloatingActionButton)view.findViewById(R.id.floatingActionButtonAc);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent account_intent = new Intent (getContext(), AddAccount.class);
                startActivity(account_intent);
            }
        });

        return view;
    }

    private void fillList(){
        accounts_list.add(new Accounts("Cuenta 1", "200", "50", "85"));
        accounts_list.add(new Accounts("Cuenta 2", "50.0", "45.0", "12.5" ));
        accounts_list.add(new Accounts("Cuenta 3", "200.0", "50.0", "8.3" ));
        accounts_list.add(new Accounts("Cuenta 4", "70.0", "25.0", "18.5 "));

    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}





