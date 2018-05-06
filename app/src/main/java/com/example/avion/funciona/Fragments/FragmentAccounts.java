package com.example.avion.funciona.Fragments;

import android.accounts.Account;
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

import com.example.avion.funciona.Activities.AddAccount;
import com.example.avion.funciona.Adapters.AccountAdapter;
import com.example.avion.funciona.R;

import java.util.ArrayList;

public class FragmentAccounts extends Fragment {

    RecyclerView recyclerView;
    ArrayList<Account> accounts_list = new ArrayList<Account>();

    public FragmentAccounts() {
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
        View view = inflater.inflate(R.layout.fragment_accounts, container, false);
        //return inflater.inflate(R.layout.fragment_accounts, container, false);

        recyclerView= (RecyclerView)view.findViewById(R.id.recycler_accounts);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        fillList();

        AccountAdapter accountAdapter = new AccountAdapter(accounts_list);
        recyclerView.setAdapter(accountAdapter);

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
        accounts_list.add(new Account("Cuenta 1", 20.0, 5.0, 8.5 ));
        accounts_list.add(new Account("Cuenta 2", 50.0, 45.0, 12.5 ));
        accounts_list.add(new Account("Cuenta 3", 200.0, 50.0, 8.3 ));
        accounts_list.add(new Account("Cuenta 4", 70.0, 25.0, 18.5 ));


    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}





