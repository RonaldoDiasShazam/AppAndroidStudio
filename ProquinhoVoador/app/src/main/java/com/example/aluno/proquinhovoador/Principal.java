package com.example.aluno.proquinhovoador;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

    }

    public void fazCalendario(View view) {
        Intent intent = new Intent(this, Calendario.class);
        startActivity(intent);
    }


   public void fazAnotacao(View view) {
       Intent intent = new Intent(this, Anotacao.class);
       startActivity(intent);
   }

    public void fazCalculadora(View view){
        Intent intent = new Intent(this, Calculadora.class);
        startActivity(intent);
    }


}
