package com.example.avion.funciona.Adapters;

import android.accounts.Account;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.avion.funciona.Entities.Accounts;
import com.example.avion.funciona.R;

import java.util.ArrayList;

public class AccountAdapter extends RecyclerView.Adapter<AccountViewHolder>{

    ArrayList<Accounts> accounts_list;



    public AccountAdapter(ArrayList<Accounts> accounts_list) { this.accounts_list= accounts_list;
    }

    @NonNull
    @Override
    public AccountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View account_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_account, parent, false);
        return new AccountViewHolder(account_view);
    }


    @Override
    public void onBindViewHolder(@NonNull AccountViewHolder holder, int position){
        holder.account_name.setText(accounts_list.get(position).getName());
        holder.account_initial.setText(accounts_list.get(position).getInitial());
        holder.account_in.setText(accounts_list.get(position).getMoneyIn());
        holder.account_off.setText(accounts_list.get(position).getMoneyOff());
    }

    @Override
    public int getItemCount() {
        return accounts_list.size();
    }


}