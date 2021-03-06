package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;

public class MiEncuesta extends AppCompatActivity {

    private CheckBox check_otros,check_otros1,check_si,check_si1,check_si2,check_si3,check_rio,check_otros2,check_cisterna,check_tanque,check_si4,check_si5,
                     check_animales,check_animal_consumo,check_animal_venta, check_riego,check_sembrio_consumo,check_sembrio_venta;

    private View campo_otros,campo_otros1,texto_info19;

    private LinearLayout textPregunta11,textPregunta13,textPregunta15,textPregunta17,textPregunta19,textPregunta20,textPregunta22,textPregunta23,textPregunta24,
                     textPregunta25,textPregunta26,textPregunta27,textPregunta30,textPregunta32,textPregunta33,textPregunta34,textPregunta35,textPregunta36,textPregunta37;


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

        check_si2 = (CheckBox) findViewById(R.id.check_si2);
        textPregunta15 = findViewById(R.id.textPregunta15);

        check_si3 = (CheckBox) findViewById(R.id.check_si3);
        textPregunta17 = findViewById(R.id.textPregunta17);

        check_rio = (CheckBox) findViewById(R.id.check_rio);
        textPregunta19 = findViewById(R.id.textPregunta19);

        check_otros2 = (CheckBox) findViewById(R.id.check_otros2);
        textPregunta20 = findViewById(R.id.textPregunta20);

        check_cisterna = (CheckBox) findViewById(R.id.check_cisterna);
        textPregunta22 = findViewById(R.id.textPregunta22);

        check_tanque = (CheckBox) findViewById(R.id.check_tanque);
        textPregunta23 = findViewById(R.id.textPregunta23);
        textPregunta24 = findViewById(R.id.textPregunta24);
        texto_info19= findViewById(R.id.texto_info19);
        textPregunta25= findViewById(R.id.textPregunta25);

        check_si4 = (CheckBox) findViewById(R.id.check_si4);
        textPregunta26= findViewById(R.id.textPregunta26);
        textPregunta27= findViewById(R.id.textPregunta27);

        check_si5 = (CheckBox) findViewById(R.id.check_si5);
        textPregunta30= findViewById(R.id.textPregunta30);

        check_animales = (CheckBox) findViewById(R.id.check_animales);
        textPregunta32= findViewById(R.id.textPregunta32);

        check_animal_consumo = (CheckBox) findViewById(R.id.check_animal_consumo);
        textPregunta33= findViewById(R.id.textPregunta33);

        check_animal_venta = (CheckBox) findViewById(R.id.check_animal_venta);
        textPregunta34 = findViewById(R.id.textPregunta34);

        check_riego = (CheckBox) findViewById(R.id.check_riego);
        textPregunta35 = findViewById(R.id.textPregunta35);

        check_sembrio_consumo= (CheckBox) findViewById(R.id.check_sembrio_consumo);
        textPregunta36 = findViewById(R.id.textPregunta36);

        check_sembrio_venta= (CheckBox) findViewById(R.id.check_sembrio_venta);
        textPregunta37 = findViewById(R.id.textPregunta37);

        //Si da en otros se mostrar?? una caja de texto
        check_otros.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                campo_otros.setVisibility(isChecked ? View.VISIBLE : View.GONE);
            }
        });

        //Si da en otros se mostrar?? una caja de texto
        check_otros1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                campo_otros1.setVisibility(isChecked ? View.VISIBLE : View.GONE);
            }
        });

        //Si da en "si" se mostrar?? una pregunta m??s
        check_si.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                textPregunta11.setVisibility(isChecked ? View.VISIBLE : View.GONE);
            }
        });

        //Si da en "si" se mostrar?? una pregunta m??s
        check_si1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                textPregunta13.setVisibility(isChecked ? View.VISIBLE : View.GONE);
            }
        });


        check_si2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                textPregunta15.setVisibility(isChecked ? View.VISIBLE : View.GONE);
            }
        });

        check_si3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                textPregunta17.setVisibility(isChecked ? View.VISIBLE : View.GONE);
            }
        });

        check_rio.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                textPregunta19.setVisibility(isChecked ? View.VISIBLE : View.GONE);
            }
        });

        check_otros2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                textPregunta20.setVisibility(isChecked ? View.VISIBLE : View.GONE);
            }
        });

        check_cisterna.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                textPregunta22.setVisibility(isChecked ? View.VISIBLE : View.GONE);
                textPregunta24.setVisibility(isChecked ? View.VISIBLE : View.GONE);
                texto_info19.setVisibility(isChecked ? View.VISIBLE : View.GONE);
                textPregunta25.setVisibility(isChecked ? View.VISIBLE : View.GONE);
            }
        });

        check_tanque.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                textPregunta23.setVisibility(isChecked ? View.VISIBLE : View.GONE);
                textPregunta24.setVisibility(isChecked ? View.VISIBLE : View.GONE);
                texto_info19.setVisibility(isChecked ? View.VISIBLE : View.GONE);
                textPregunta25.setVisibility(isChecked ? View.VISIBLE : View.GONE);
            }
        });

        check_si4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                textPregunta26.setVisibility(isChecked ? View.VISIBLE : View.GONE);
                textPregunta27.setVisibility(isChecked ? View.VISIBLE : View.GONE);
            }
        });

        check_si5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                textPregunta30.setVisibility(isChecked ? View.VISIBLE : View.GONE);

            }
        });

        //En el caso de tener animales que consumen agua indicar:
        check_animales.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                textPregunta32.setVisibility(isChecked ? View.VISIBLE : View.GONE);

            }
        });

        //animales para consumo
        check_animal_consumo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                textPregunta33.setVisibility(isChecked ? View.VISIBLE : View.GONE);

            }
        });

        //animales para venta
        check_animal_venta.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                textPregunta34.setVisibility(isChecked ? View.VISIBLE : View.GONE);

            }
        });
        //En el caso de tener sembrios que consumen agua indicar:
        check_riego.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                textPregunta35.setVisibility(isChecked ? View.VISIBLE : View.GONE);

            }
        });
        //sembrios para consumo
        check_sembrio_consumo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                textPregunta36.setVisibility(isChecked ? View.VISIBLE : View.GONE);

            }
        });
        //sembrios para venta
        check_sembrio_venta.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                textPregunta37.setVisibility(isChecked ? View.VISIBLE : View.GONE);

            }
        });



    }
}