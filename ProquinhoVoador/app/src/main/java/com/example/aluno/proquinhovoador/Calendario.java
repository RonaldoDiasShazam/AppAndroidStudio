package com.example.aluno.proquinhovoador;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class Calendario extends AppCompatActivity {

    private int ano;
    private int mes;
    private int dia;
    private EditText campoFecha;
    private Button botonFecha;
    private static final int TIPO_DIALOGO = 0;
    private static DatePickerDialog.OnDateSetListener oyenteSelectorFecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);
        // obter uma indicação de controles Gui dentro do Layout
        campoFecha = (EditText) findViewById(R.id.campoFecha);
        botonFecha = (Button) findViewById(R.id.botonFecha);
        Calendar calendario = Calendar.getInstance();
        ano = calendario.get(Calendar.YEAR);
        mes = calendario.get(Calendar.MONTH);
        dia = calendario.get(Calendar.DAY_OF_MONTH);
        mostraFecha();
        oyenteSelectorFecha = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int monthofYear, int dayOfMonth) {
                ano = year;
                mes = monthofYear;
                dia = dayOfMonth;
                mostraFecha();
            }
        };
    }

    @Override
    protected Dialog onCreateDialog(int id) {
       switch (id){
           case 0:
               return new DatePickerDialog(this, oyenteSelectorFecha, ano, mes, dia);
       }
        return null;
    }

    public void mostrarCalendario(View control){
        showDialog(TIPO_DIALOGO);
    }


    public void mostraFecha(){
        campoFecha.setText(dia +"/"+ (mes+1)+"/"+ano);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.action_settings){
           return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
