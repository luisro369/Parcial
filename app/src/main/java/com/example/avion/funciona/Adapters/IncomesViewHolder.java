package com.example.avion.funciona.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.avion.funciona.R;

public class IncomesViewHolder extends RecyclerView.ViewHolder {

    TextView account_nameIn;
    TextView textViewProduct11;
    TextView textViewProduct21;
    TextView textViewProduct31;

    TextView textViewSubtotal11;
    TextView textViewSubtotal21;
    TextView textViewSubtotal31;

    public IncomesViewHolder(View incomesView){
        super(incomesView);

        account_nameIn =  incomesView.findViewById(R.id.account_nameIn);
        textViewProduct11=  incomesView.findViewById(R.id.textViewProduct11);
        textViewProduct21=  incomesView.findViewById(R.id.textViewProduct21);
        textViewProduct31= incomesView.findViewById(R.id.textViewProduct31);

        textViewSubtotal11=incomesView.findViewById(R.id.textViewSubtotal11);
        textViewSubtotal21=incomesView.findViewById(R.id.textViewSubtotal21);
        textViewSubtotal31=incomesView.findViewById(R.id.textViewSubtotal31);
    }
}
