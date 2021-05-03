package com.example.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MenuEncuestas extends AppCompatActivity implements View.OnClickListener{

    private Button encuesta1,encuesta2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_encuestas);
        init();
    }
    private void init(){
        encuesta1=(Button) findViewById(R.id.encuesta1);
        encuesta2=(Button) findViewById(R.id.encuesta2);

        encuesta1.setOnClickListener(this);
        encuesta2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.encuesta1: i=new Intent(this,MiEncuesta.class);startActivity(i);break;
            case R.id.encuesta2: Toast.makeText(MenuEncuestas.this, "No está disponible", Toast.LENGTH_LONG).show();;break;

            default:break;
        }

    }
}