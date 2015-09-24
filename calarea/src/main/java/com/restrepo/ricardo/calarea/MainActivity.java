package com.restrepo.ricardo.calarea;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.LinearLayout;
        import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private LinearLayout altura;
    private LinearLayout base;
    private LinearLayout radio;
    private LinearLayout lado;
    private RadioButton r1,r2,r3,r4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        altura = (LinearLayout)findViewById(R.id.lAltura);
        base = (LinearLayout)findViewById(R.id.lBase);
        radio = (LinearLayout)findViewById(R.id.lRadio);
        lado = (LinearLayout)findViewById(R.id.lLado);
        r1=(RadioButton)findViewById(R.id.rCuadro);
        r2=(RadioButton)findViewById(R.id.rTriangulo);
        r3=(RadioButton)findViewById(R.id.rRectangulo);
        r4=(RadioButton)findViewById(R.id.rCirculo);

    }

    public void desactivar(){
        lado.setVisibility(View.GONE);
        altura.setVisibility(View.GONE);
        base.setVisibility(View.GONE);
        radio.setVisibility(View.GONE);
    }

    public void cuadro(View v){
        desactivar();
        if (r1.isChecked())
        {
            lado.setVisibility(View.VISIBLE);
        }


    }

    public void triangulo(View v){
        desactivar();
        if (r2.isChecked())
        {
            altura.setVisibility(View.VISIBLE);
            base.setVisibility(View.VISIBLE);
        }

    }

    public void rectangulo(View v){
        desactivar();
        if (r3.isChecked())
        {
            altura.setVisibility(View.VISIBLE);
            base.setVisibility(View.VISIBLE);
        }

    }

    public void circulo(View v){
        desactivar();
        if (r4.isChecked())
        {
            radio.setVisibility(View.VISIBLE);
        }

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
