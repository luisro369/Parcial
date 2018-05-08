package com.example.avion.funciona.Activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.avion.funciona.Fragments.FRagmentStock;
import com.example.avion.funciona.Fragments.FragmentAccounts;
import com.example.avion.funciona.Fragments.FragmentExpenses;
import com.example.avion.funciona.Fragments.FragmentIncomes;
import com.example.avion.funciona.Fragments.FragmentSummary;
import com.example.avion.funciona.Fragments.Menus;
import com.example.avion.funciona.Fragments.Selects;
import com.example.avion.funciona.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,
        Menus.OnFragmentInteractionListener,
        Selects.OnFragmentInteractionListener,
        FRagmentStock.OnFragmentInteractionListener,
        FragmentSummary.OnFragmentInteractionListener,
        FragmentAccounts.OnFragmentInteractionListener,
        FragmentExpenses.OnFragmentInteractionListener,
        FragmentIncomes.OnFragmentInteractionListener
{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //-------------------------------------
        //declarando los linearlayouts y diciendoles que al dar click se vayan al metodo onClick
        LinearLayout summary = (LinearLayout) findViewById(R.id.summary_portrait);
        summary.setOnClickListener(this);
        LinearLayout accounts = (LinearLayout) findViewById(R.id.accounts_portrait);
        accounts.setOnClickListener(this);
        LinearLayout incomes = (LinearLayout) findViewById(R.id.incomes_portrait);
        incomes.setOnClickListener(this);
        LinearLayout expenses = (LinearLayout) findViewById(R.id.expenses_portrait);
        expenses.setOnClickListener(this);
        LinearLayout stock = (LinearLayout) findViewById(R.id.stock_portrait);
        stock.setOnClickListener(this);
        //------------------------------
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onClick(View v) {
        //creando fragment transacction para poder manejar al fragmento
        FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
        /*hacemos switch de los ids de los linearLayout, y para cada
        caso verificar si estamos en modo portrait o en modo landscape
        Si estamos en portrait mandar a llamar al contenedor2 (activity)
        y le mandamos un valor en put extra de 1 para que una funcion
        en el contenedor2 haga un switch de que fragment reemplazar
        Y si estamos en landscape solo reemplazar el fragment2*/
        switch(v.getId()){
            //--------Summary-----------
            case R.id.summary_portrait:
                if(findViewById(R.id.layout_default) != null){
                    Intent intent = new Intent(this, ContenedorActivity.class);
                    intent.putExtra("summary",1);
                    startActivity(intent);
                    break;
                }//verificando si estoy en landscape
                else{
                    fr.replace(R.id.landscape2, new FragmentSummary());
                    fr.addToBackStack(null);
                    fr.commit();
                    break;
                }
                //--------Accounts---------
            case R.id.accounts_portrait:
                if(findViewById(R.id.layout_default) != null){
                    Intent intent = new Intent(this, ContenedorActivity.class);
                    intent.putExtra("account",2);
                    startActivity(intent);
                    break;
                }//verificando si estoy en landscape
                else{
                    fr.replace(R.id.landscape2, new FragmentAccounts());
                    fr.addToBackStack(null);
                    fr.commit();
                    break;
                }
                //------Incomes-----------
            case R.id.incomes_portrait:
                if(findViewById(R.id.layout_default) != null){
                    Intent intent = new Intent(this, ContenedorActivity.class);
                    intent.putExtra("incomes",3);
                    startActivity(intent);
                    break;
                }//verificando si estoy en landscape
                else{
                    fr.replace(R.id.landscape2, new FragmentIncomes());
                    fr.addToBackStack(null);
                    fr.commit();
                    break;
                }
                //-----Expenses----------
            case R.id.expenses_portrait:
                if(findViewById(R.id.layout_default) != null){
                    Intent intent = new Intent(this, ContenedorActivity.class);
                    intent.putExtra("expenses", 4);
                    startActivity(intent);
                    break;
                }//verificando si estoy en landscape
                else{
                    fr.replace(R.id.landscape2, new FragmentExpenses());
                    fr.addToBackStack(null);
                    fr.commit();
                    break;
                }
                //----------Stocks-----------
            case R.id.stock_portrait:
                if(findViewById(R.id.layout_default) != null){
                    Intent intent = new Intent(this, ContenedorActivity.class);
                    intent.putExtra("stock",5);
                    startActivity(intent);
                    break;
                }//verificando si estoy en landscape
                else{
                    fr.replace(R.id.landscape2, new FRagmentStock());
                    fr.addToBackStack(null);
                    fr.commit();
                    break;
                }
        }//switch

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast.makeText(this,"llamada aqui",Toast.LENGTH_SHORT).show();
    }
}
