package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;

public class MiEncuesta extends AppCompatActivity {

    private CheckBox check_otros,check_otros1,check_si,check_si1;
    private View campo_otros,campo_otros1;
    private LinearLayout textPregunta11,textPregunta13;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_encuesta);

        check_otros = (CheckBox) findViewById(R.id.check_otros);
        campo_otros = findViewById(R.id.campo_otros);

        check_otros1 = (CheckBox) findViewById(R.id.check_otros1);
        campo_otros1 = findViewById(R.id.campo_otros1);

        check_si = (CheckBox) findViewById(R.id.check_si);
        textPregunta11 = findViewById(R.id.textPregunta11);

        check_si1 = (CheckBox) findViewById(R.id.check_si1);
        textPregunta13 = findViewById(R.id.textPregunta13);

        //Si da en otros se mostrará una caja de texto
        check_otros.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                campo_otros.setVisibility(isChecked ? View.VISIBLE : View.GONE);
            }
        });

        //Si da en otros se mostrará una caja de texto
        check_otros1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                campo_otros1.setVisibility(isChecked ? View.VISIBLE : View.GONE);
            }
        });

        //Si da en "si" se mostrará una pregunta más
        check_si.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                textPregunta11.setVisibility(isChecked ? View.VISIBLE : View.GONE);
            }
        });

        //Si da en "si" se mostrará una pregunta más
        check_si1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                textPregunta13.setVisibility(isChecked ? View.VISIBLE : View.GONE);
            }
        });

    }
}