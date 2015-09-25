package com.restrepo.ricardo.cpromedio;

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

        final EditText Quices = (EditText) findViewById(R.id.eQuices);
        final EditText Exposiciones = (EditText) findViewById(R.id.eExposiciones);
        final EditText Practicas = (EditText) findViewById(R.id.ePracticas);
        final EditText ProyectoF = (EditText) findViewById(R.id.eProyectoF);
        Button Cargar = (Button) findViewById(R.id.bCargar);
        final TextView TNombre = (TextView) findViewById(R.id.tNombre);

        Cargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String name;
                //name = Nombre.getText().toString();
                double quices;
                double exposiciones;
                double practicas;
                double proyectof;
                double resultado;
                quices = Double.parseDouble(Quices.getText().toString());
                exposiciones = Double.parseDouble(Exposiciones.getText().toString());
                practicas = Double.parseDouble(Practicas.getText().toString());
                proyectof = Double.parseDouble(ProyectoF.getText().toString());
                quices = quices * .15;
                exposiciones = exposiciones * .1;
                practicas = practicas * .4;
                proyectof = proyectof * .35;
                resultado = quices + exposiciones + practicas + proyectof;
                TNombre.setText(String.valueOf(resultado));
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
