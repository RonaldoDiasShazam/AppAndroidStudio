package com.example.aluno.calendario;


import android.app.DatePickerDialog;
        import android.net.Uri;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.DatePicker;
        import android.widget.EditText;
        import android.widget.Button;
        import android.widget.TextView;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_actividad_principal);
        // obter uma indicação de controles GUI dentro do Layout
        campoFecha = (EditText) findViewById(R.id.campoFecha);
        botonFecha = (Button) findViewById(R.id.botonFecha);
        Calendar calendario = Calendar.getInstance();
        ano = calendario.get(Calendar.YEAR);
        mes = calendario.get(Calendar.MONTH);
        dia = calendario.get(Calendar.DAY_OF_MONTH);
        mostraFecha();
    }

    public void mostraFecha() {
        campoFecha.setText(dia +"/"+ mes+"/"+ano); //21:45
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if is present
        getMenuInflater().inflate(R.menu.menu_MainActivity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}