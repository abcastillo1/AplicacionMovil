package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainContent extends AppCompatActivity {

    private EditText et_main_usuario,et_main_contrasena;
    private Button btn_main_registrarse;

    private UsuarioAdapter adapter;
    private UsuarioModel model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        init();

        adapter=new UsuarioAdapter(getApplicationContext());
        model=new UsuarioModel();

        btn_main_registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = et_main_usuario.getText().toString();
                String contrasena=et_main_contrasena.getText().toString();
                boolean validarInterfaz = validarCampos(usuario,contrasena);
                if(validarInterfaz){
                    adapter.openRead();
                    //Iniciar de sesion con Base de datos
                    model=adapter.login(usuario, contrasena);
                    adapter.close();
                    //Cuando es diferente de nullo se accede pero ya no se crea otro usuario
                    if(model!=null){
                        Toast.makeText(MainContent.this, "usuario encontrado", Toast.LENGTH_SHORT).show();
                        Intent principal = new Intent(MainContent.this,PrincipalActivity.class);
                        principal.setFlags(principal.FLAG_ACTIVITY_NEW_TASK|principal.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(principal);
                    }else{
                        Toast.makeText(MainContent.this, "usuario no encontrado", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }

    public void init(){
        et_main_usuario=findViewById(R.id.et_main_usuario);
        et_main_contrasena=findViewById(R.id.et_main_contrasena);
        btn_main_registrarse=findViewById(R.id.btn_main_registrarse);

    }

    public boolean validarCampos(String usuario,String contrasena){
        if (usuario.isEmpty()||contrasena.isEmpty()){
            Toast.makeText(this,"Por favor ingrese su nombre y código",Toast.LENGTH_LONG).show();
            return false;
        }else if (usuario.length()<6||contrasena.length()<2){
            Toast.makeText(this,"Por favor ingrese su nombre y código válidos",Toast.LENGTH_LONG).show();
            return false;
        }else{
            return true;
        }
    }


}