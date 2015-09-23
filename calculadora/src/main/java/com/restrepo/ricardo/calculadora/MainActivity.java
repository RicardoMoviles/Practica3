package com.restrepo.ricardo.calculadora;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioselGroup;
    private RadioButton r1,r2,r3,r4;
    private Button Cargar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText Numero1 = (EditText) findViewById(R.id.eNumero1);
        final EditText Numero2 = (EditText) findViewById(R.id.eNumero2);
        Button Cargar = (Button) findViewById(R.id.bCargar);
        r1=(RadioButton)findViewById(R.id.rSuma);
        r2=(RadioButton)findViewById(R.id.rResta);
        r3=(RadioButton)findViewById(R.id.rMultiplicacion);
        r4=(RadioButton)findViewById(R.id.rDivision);
        final TextView TNombre = (TextView) findViewById(R.id.tNombre);



        Cargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String name;
                //name = Nombre.getText().toString();
                double numero1;
                double numero2;
                double resultado;
                numero1 = Double.parseDouble(Numero1.getText().toString());
                numero2 = Double.parseDouble(Numero2.getText().toString());
                if (r1.isChecked()) {
                    resultado = numero1 + numero2;
                    TNombre.setText(String.valueOf(resultado));
                }else if(r2.isChecked()) {
                    resultado = numero1 - numero2;
                    TNombre.setText(String.valueOf(resultado));
                }else if(r3.isChecked()) {
                    resultado = numero1 * numero2;
                    TNombre.setText(String.valueOf(resultado));
                }else if(r4.isChecked()) {
                    resultado = numero1 / numero2;
                    TNombre.setText(String.valueOf(resultado));
                }


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
