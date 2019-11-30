package com.example.aluno.proquinhovoador;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Anotacao extends AppCompatActivity {

    EditText ettext;
    Button btCriar;
    ListView listView;

    private ArrayList<String> notas = new ArrayList<String>();
    ArrayAdapter<String> adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anotacao);

        ettext = (EditText) findViewById(R.id.etttext);
        btCriar = (Button) findViewById(R.id.btCriar);
        listView = (ListView) findViewById(R.id.listView);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, notas);
        listView.setAdapter(adapter);

        btCriar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoNota = ettext.getText().toString();
                if(textoNota.length() > 0){
                    ettext.setText("");
                    ettext.findFocus();
                    notas.add(textoNota);
                    adapter.notifyDataSetChanged();
                }

            }
        });


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> aparent, View view, int position, long id) {

                AlertDialog.Builder abd = new AlertDialog.Builder(Anotacao.this);
                abd.setTitle("Nota");
                abd.setMessage("Você deseja apagar o BANG ?");
                final int positionToRemove = position;
                abd.setNegativeButton("Não", null);
                abd.setPositiveButton("Sim", new AlertDialog.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which){
                        notas.remove(positionToRemove);
                        adapter.notifyDataSetChanged();
                    }
                });
            abd.show();
            }
        });

    }
}
