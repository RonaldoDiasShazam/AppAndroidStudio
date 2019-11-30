package com.example.aluno.nomeesobrenome;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.security.Principal;
import java.security.SignatureException;

public class ProjetoSQL001 extends AppCompatActivity {

    EditText jNome, jSobrenome;
    TextView jTexto;
    Controle_BD controle_Bd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projeto_sql001);

        jNome = (EditText) findViewById(R.id.edtNome);
        jSobrenome = (EditText) findViewById(R.id.edtSobrenome);
        jTexto = (TextView) findViewById(R.id.txtTeste);
        controleBd = new Controle_BD(this,"",null,1);
    }

    public void btnClica(View view) {
        //Criado clicando alt+enter no xml
        switch (view.getId()){
            case R.id.btnAdicionar:
                try {
                    controleBd.inserirPessoas(jNome.getText().toString(), jSobrenome.getText().toString());
                }catch (SignatureException e){
                    Toast.makeText(ProjetoSQL001.this, "Já Existe", Toast.LENGTH_SHORT).show();
                }
                    break;
            case R.id.btnDeletar:
                controleBd.deletarPessoas(jNome.getText().toString());
                break;
            case R.id.btnAtualizar:
                AlertDialog.Builder mensagem = new AlertDialog.Builder(ProjetoSQL001.this);
                mensagem.setTitle("Digite o novo nome : ");
                final EditText novo_nome = new EditText(this);
                mensagem.setView(novo_nome);
                mensagem.setPositiveButton("OK", (dialogInterFace, i) > {
                        controleBd.atualizarPessoas(jNome.getText().toString(), novo_nome.getText().toString());
                });
                mensagem.show();
                break;
            case R.id.btnListar:
                controleBd.listarTodos(jTexto);
                break;
        }
    }
}
