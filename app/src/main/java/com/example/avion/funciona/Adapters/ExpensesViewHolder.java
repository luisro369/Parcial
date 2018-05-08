package com.example.avion.funciona.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.avion.funciona.R;

public class ExpensesViewHolder extends RecyclerView.ViewHolder {

    TextView account_nameEx;
    TextView textViewProduct1;
    TextView textViewProduct2;
    TextView textViewProduct3;
    TextView textViewQuantity1;
    TextView textViewQuantity2;
    TextView textViewQuantity3;
    TextView textViewPrice1;
    TextView textViewPrice2;
    TextView textViewPrice3;
    TextView textViewSubtotal1;
    TextView textViewSubtotal2;
    TextView textViewSubtotal3;

    public ExpensesViewHolder(View expensesView){
        super(expensesView);

        account_nameEx = (TextView) expensesView.findViewById(R.id.account_nameEx);
        textViewProduct1= (TextView) expensesView.findViewById(R.id.textViewProduct1);
        textViewProduct2= (TextView) expensesView.findViewById(R.id.textViewProduct2);
        textViewProduct3= (TextView) expensesView.findViewById(R.id.textViewProduct3);
        textViewQuantity1=(TextView) expensesView.findViewById(R.id.textViewQuantity1);
        textViewQuantity2=(TextView) expensesView.findViewById(R.id.textViewQuantity2);
        textViewQuantity3=(TextView) expensesView.findViewById(R.id.textViewQuantity3);
        textViewPrice1=(TextView) expensesView.findViewById(R.id.textViewPrice1);
        textViewPrice2=(TextView) expensesView.findViewById(R.id.textViewPrice2);
        textViewPrice3=(TextView) expensesView.findViewById(R.id.textViewPrice3);
        textViewSubtotal1=(TextView)expensesView.findViewById(R.id.textViewSubtotal1);
        textViewSubtotal2=(TextView)expensesView.findViewById(R.id.textViewSubtotal2);
        textViewSubtotal3=(TextView)expensesView.findViewById(R.id.textViewSubtotal3);
    }

}
