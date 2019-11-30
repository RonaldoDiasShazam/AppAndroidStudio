package com.example.aluno.proquinhovoador;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {

    private EditText edtNum1, edtNum2; // Plain text
    private TextView txtResultado; // Text View
    double n1 = 0 , n2 = 0, soma, subi, multip, divid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        edtNum1 = (EditText) findViewById(R.id.edtNum1);
        edtNum2 = (EditText) findViewById(R.id.edtNum2);
        txtResultado = (TextView) findViewById(R.id.txtResultado);
    }

    // adicao: é o onClick
    public void adicao(View view){
        String num1 = (edtNum1.getText().toString());
        String num2 = (edtNum2.getText().toString());
        n1 = Double.parseDouble(num1);
        n2 = Double.parseDouble(num2);
        // está pegando o valor dos edt, que veio text(xml) e convertendo
        // para integer
        soma = (n1 + n2);
        txtResultado.setText(String.valueOf(soma));
        // aqui é onde o text Resultado irá receber o valor da soma
    }


    public void sub(View view){
        String num1 = (edtNum1.getText().toString());
        String num2 = (edtNum2.getText().toString());
        n1 = Double.parseDouble(num1);
        n2 = Double.parseDouble(num2);

        subi = (n1 - n2);
        txtResultado.setText( String.valueOf(subi));

    }

    public void divi(View view){
        String num1 = (edtNum1.getText().toString());
        String num2 = (edtNum2.getText().toString());
        n1 = Double.parseDouble(num1);
        n2 = Double.parseDouble(num2);

        divid = (n1 / n2);
        txtResultado.setText(String.valueOf(divid));

    }


    public void multi(View view){
        String num1 = (edtNum1.getText().toString());
        String num2 = (edtNum2.getText().toString());
        n1 = Double.parseDouble(num1);
        n2 = Double.parseDouble(num2);

        multip = (n1 * n2);
        txtResultado.setText(String.valueOf(multip));

    }

}

