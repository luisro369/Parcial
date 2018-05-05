package com.example.avion.funciona.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.avion.funciona.R;

public class AccountViewHolder extends RecyclerView.ViewHolder {

    TextView account_name;
    TextView account_initial;
    TextView account_in;
    TextView account_off;


    public AccountViewHolder(View accountView){
        super(accountView);

        account_name = (TextView) accountView.findViewById(R.id.account_name);
        account_initial= (TextView)accountView.findViewById(R.id.account_initial);
        account_in= (TextView)accountView.findViewById(R.id.account_in);
        account_off= (TextView)accountView.findViewById(R.id.account_off);
    }


}
