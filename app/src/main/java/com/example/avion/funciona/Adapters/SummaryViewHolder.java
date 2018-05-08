package com.example.avion.funciona.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.avion.funciona.R;



public class SummaryViewHolder extends RecyclerView.ViewHolder{

    TextView nameSum;
    TextView status;
    TextView incomeSum;
    TextView expensesSum;


    public SummaryViewHolder(View itemView) {
        super(itemView);

        nameSum =  itemView.findViewById(R.id.nameSum);
        status = itemView.findViewById(R.id.statusSum);
        incomeSum = itemView.findViewById(R.id.totalInSum);
        expensesSum =  itemView.findViewById(R.id.totalExSum);

    }
}
