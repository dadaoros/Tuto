package com.pruebas.primerospasos;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int numero=0;
    private TextView texto2;
    private Button boton1;
    private EditText etext;
    public static final String TEXTO_PRUEBA="TTEDX";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents(savedInstanceState);
    }

    private void initComponents(Bundle savedState) {
        TextView texto1= (TextView) findViewById(R.id.texto1);
        texto2= (TextView) findViewById(R.id.texto2);
        boton1 = (Button) findViewById(R.id.boton1);
        etext = (EditText)  findViewById(R.id.etext);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento1 = new Intent(getActivityContext(),LoginActivity.class);
                intento1.putExtra(TEXTO_PRUEBA,etext.getText().toString());
                startActivity(intento1);

            }
        });
        texto1.setText("texto 1 de pruebas");
    }

    @Override
    protected void onResume() {
        super.onResume();
        numero++;
        Log.d("Actividad","onResume "+numero);
        texto2.setText("numero"+numero);

        //Intent intento1 = new Intent(this);

    }
    public Context getActivityContext(){
        return this;
    }
}
