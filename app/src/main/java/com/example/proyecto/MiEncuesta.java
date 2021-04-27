package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MiEncuesta extends AppCompatActivity {

    private CheckBox check_otros;
    private View campo_otros;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_encuesta);

        check_otros = (CheckBox) findViewById(R.id.check_otros);
        campo_otros = findViewById(R.id.campo_otros);

        check_otros.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                campo_otros.setVisibility(isChecked ? View.VISIBLE : View.GONE);
            }
        });


    }
}