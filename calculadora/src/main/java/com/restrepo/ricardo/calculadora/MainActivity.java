package com.restrepo.ricardo.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Nombre = (EditText) findViewById(R.id.eNombre1);
        Button Cargar = (Button) findViewById(R.id.bCargar);
        final TextView TNombre = (TextView) findViewById(R.id.tNombre);

        Cargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String name;
                //name = Nombre.getText().toString();
                double numero;
                numero = Double.parseDouble(Nombre.getText().toString());
                numero = numero *10;
                TNombre.setText(String.valueOf(numero));
            }
        });
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
}
