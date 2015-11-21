package com.desarrollo.svasquez.calculadora;

import android.hardware.Camera;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.ExecutorCompletionService;

public class MainActivity extends AppCompatActivity {


    private EditText numero1, numero2;
    private Button btsuma, btresta, btmultiplicacion, btdivision;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        inicializarVariablesCalculadora();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void inicializarVariablesCalculadora() {
        numero1 = (EditText) findViewById(R.id.editTextNUmeroUno);
        numero2 = (EditText) findViewById(R.id.editTextNUmeroDos);
        resultado = (TextView) findViewById(R.id.textViewResultado);

        btsuma = (Button) findViewById(R.id.buttonSuma);
        btresta = (Button) findViewById(R.id.buttonResta);
        btmultiplicacion = (Button) findViewById(R.id.buttonMultiplicacion);
        btdivision = (Button) findViewById(R.id.buttonDivision);

    }


    public void onClickSuma(View view) {
        try {
            int n1 = Integer.valueOf(numero1.getText().toString());
            int n2 = Integer.valueOf(numero2.getText().toString());
            int suma = n1 + n2;
            resultado.setText("La suma es " + suma);
        } catch (Exception e) {
            resultado.setText(e.getMessage());
        }

    }


    public void onClickResta(View ciew) {
        try {
            int n1 = Integer.valueOf(numero1.getText().toString());
            int n2 = Integer.valueOf(numero2.getText().toString());
            int resta = n2 - n1;
            resultado.setText("La resta es " + resta);
        } catch (Exception e) {
            resultado.setText(e.getMessage());
        }
    }

    public void onClickMultiplicacion(View view) {
        try {
            int n1 = Integer.valueOf(numero1.getText().toString());
            int n2 = Integer.valueOf(numero2.getText().toString());

            int multiplicacion = n1 * n2;
            resultado.setText("La multiplicacion es " + multiplicacion);
        } catch (Exception e) {
            resultado.setText(e.getMessage());
        }


    }

    public void onClickDivision(View view) {
        try {
            float n1 = Integer.valueOf(numero1.getText().toString());
            float n2 = Integer.valueOf(numero2.getText().toString());

            float division = n2 / n1;
            System.out.println(n1);
            System.out.println(n2);
            resultado.setText("La division es " + division);
        } catch (Exception e) {
            resultado.setText(e.getMessage());
        }

    }


}
