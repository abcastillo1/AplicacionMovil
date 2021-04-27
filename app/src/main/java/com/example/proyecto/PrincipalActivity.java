package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrincipalActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView cardIniciar, cardRegistros, cardEncuestar, cardAcercade, cardCredito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
       //Definir Cards
        cardIniciar=(CardView) findViewById(R.id.cardIniciar);
        cardEncuestar=(CardView) findViewById(R.id.cardEncuestar);
        cardRegistros=(CardView) findViewById(R.id.cardRegistros);
        cardAcercade=(CardView) findViewById(R.id.cardAcercade);
        cardCredito=(CardView) findViewById(R.id.cardCredito);

        cardIniciar.setOnClickListener(this);
        cardEncuestar.setOnClickListener(this);
        cardRegistros.setOnClickListener(this);
        cardAcercade.setOnClickListener(this);
        cardCredito.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.cardIniciar: i=new Intent(this,MiPerfil.class);startActivity(i);break;
            case R.id. cardEncuestar: i=new Intent(this,MiEncuesta.class);startActivity(i);break;
           // case R.id.cardRegistros: i=new Intent(this,MiRegistro.class);startActivity(i);break;
           // case R.id.cardAcercade: i=new Intent(this,Acercade.class);startActivity(i);break;
           // case R.id.cardCredito: i=new Intent(this,Credito.class);startActivity(i);break;

            default:break;
        }

    }
}