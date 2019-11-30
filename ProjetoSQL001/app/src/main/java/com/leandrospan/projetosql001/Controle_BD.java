package com.leandrospan.projetosql001;

import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObservable;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.TextView;

/**
 * Created by Leandro on 19/05/2017.
 */

public class Controle_BD extends SQLiteOpenHelper{
    //implementar os métodos e o construtor

    public Controle_BD(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        //super(context, "nomeDoBanco.db", factory, version);
        super(context, "banco.db", factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //Criação do banco
        sqLiteDatabase.execSQL("CREATE TABLE PESSOAS(CODIGO INTEGER PRIMARY KEY AUTOINCREMENT, NOME TEXT UNIQUE, SOBRENOME TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //Quando o programa for criado
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS PESSOAS;");
        onCreate(sqLiteDatabase);
    }

    public void inserirPessoas(String nome, String sobrenome){
        ContentValues valores = new ContentValues();
        valores.put("NOME", nome);
        valores.put("SOBRENOME", sobrenome);
        //this.getWritableDatabase().insertOrThrow(tabela,colunanula,valores);
        this.getWritableDatabase().insertOrThrow("PESSOAS", "", valores);
    }

    public void deletarPessoas(String nome){
        //delete(tabela, clausula where, null)
        this.getWritableDatabase().delete("PESSOAS","NOME='" + nome + "'", null);
    }

    public void atualizarPessoas(String nomeAntigo, String nomeNovo){
        this.getWritableDatabase().execSQL("UPDATE PESSOAS SET NOME = '" + nomeNovo + "' WHERE SOBRENOME = '" + nomeAntigo + "'");
    }

    public void listarTodos(TextView saida){
        Cursor indice = this.getReadableDatabase().rawQuery("SELECT * FROM PESSOAS", null);
        saida.setText("");
        while (indice.moveToNext()){
            //getString(1) refere-se ao número da coluna na tabela, neste caso coluna nome
            saida.append(indice.getString(1) + " " + indice.getString(2) + "\n");
        }
    }
}
