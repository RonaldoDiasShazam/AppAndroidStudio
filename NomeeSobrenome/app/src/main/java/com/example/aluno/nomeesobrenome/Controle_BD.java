package com.example.aluno.nomeesobrenome;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Aluno on 03/10/2017.
 */
public class Controle_BD extends SQLiteOpenHelper {
    //implementar os métodos e o construtor

    public Controle_BD(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        //super(context, "nomeDoBanco.db", factory, version);
        super(context, "banco.db", factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //Criação do banco
        sqLiteDatabase.execSQL("CREATE TABLE PESSOAS(CODIGO INTEGER PRIMARY KEY AUTOINCREMENT, NOME TEXT UNIQUE, SOBRENOME TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase)
}
