package com.example.avion.funciona.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

import com.example.avion.funciona.R;

public class AddAccount extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.add_account);

            DisplayMetrics dm= new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(dm);

            int width = dm.widthPixels;
            int height = dm.heightPixels;

            getWindow().setLayout((int) (width*.8), (int) (height*.6));


        }
    }


