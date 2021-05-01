package com.example.proyecto;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


public class UsuarioAdapter {

    //nombre de la base de datos
    private final String DB_NAME = "PROYECTO_APP";
    //version de la base de datos
    private final int DB_VERSION = 1;
    //nombre de la tabla
    public static final String TABLE_NAME = "usuario";
    //nombre de la tabla
    public static final String c_NOMBRE="nombre";
    public static final String c_CODIGO="codigo";


    public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ("
            + c_CODIGO + " TEXT PRIMARY KEY, "
            + c_NOMBRE + " TEXT);";
    private static SQLiteDatabase database;
    private static MyDbHelper helper;
    private final Context context;
    private UsuarioModel model;


    public UsuarioAdapter(Context context) {
        this.context = context;
        helper=new MyDbHelper(context, DB_NAME, null, DB_VERSION);
    }

    public void openRead(){
        database=helper.getReadableDatabase();
    }
    public void openWrite(){
        database=helper.getWritableDatabase();
    }
    public void close(){
        database.close();
    }


    public UsuarioModel login(String usuario,String codigo){

        String where= "nombre = ? AND codigo = ?";
        Cursor cursor = database.query(TABLE_NAME,null, where, new String[]{usuario, codigo},null, null, null);
        if(cursor.getCount() < 1){
            return null;
        }else{
            cursor.moveToFirst();
            model=new UsuarioModel();
            model.set_contrasena(cursor.getString(cursor.getColumnIndex("codigo")));
            model.set_nombre(cursor.getString(cursor.getColumnIndex("nombre")));
            return model;

        }
    }

    public long insert(UsuarioModel model){
        ContentValues values = new ContentValues();
        values.put("nombre", model.get_nombre());
        values.put("codigo", model.get_contrasena());

        return database.insert(TABLE_NAME,null,values);
    }
}


