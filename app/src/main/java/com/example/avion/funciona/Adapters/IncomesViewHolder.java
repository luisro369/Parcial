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
    TextView textViewQuantity11;
    TextView textViewQuantity21;
    TextView textViewQuantity31;
    TextView textViewPrice11;
    TextView textViewPrice21;
    TextView textViewPrice31;
    TextView textViewSubtotal11;
    TextView textViewSubtotal21;
    TextView textViewSubtotal31;

    public IncomesViewHolder(View incomesView){
        super(incomesView);

        account_nameIn =  incomesView.findViewById(R.id.account_nameIn);
        textViewProduct11=  incomesView.findViewById(R.id.textViewProduct11);
        textViewProduct21=  incomesView.findViewById(R.id.textViewProduct21);
        textViewProduct31= incomesView.findViewById(R.id.textViewProduct31);
        textViewQuantity11= incomesView.findViewById(R.id.textViewQuantity11);
        textViewQuantity21= incomesView.findViewById(R.id.textViewQuantity21);
        textViewQuantity31= incomesView.findViewById(R.id.textViewQuantity31);
        textViewPrice11= incomesView.findViewById(R.id.textViewPrice11);
        textViewPrice21= incomesView.findViewById(R.id.textViewPrice21);
        textViewPrice31= incomesView.findViewById(R.id.textViewPrice31);
        textViewSubtotal11=incomesView.findViewById(R.id.textViewSubtotal11);
        textViewSubtotal21=incomesView.findViewById(R.id.textViewSubtotal21);
        textViewSubtotal31=incomesView.findViewById(R.id.textViewSubtotal31);
    }
}
