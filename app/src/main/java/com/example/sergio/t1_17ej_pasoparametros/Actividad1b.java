package com.example.sergio.t1_17ej_pasoparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Actividad1b extends AppCompatActivity {

    Button aceptar, rechazar;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1b);

        txt = (TextView) findViewById(R.id.pregunta);
        aceptar = (Button) findViewById(R.id.act1_aceptar);
        rechazar = (Button) findViewById(R.id.act1_rechazar);

        Bundle b = getIntent().getExtras();
        String nombre = b.getString("nombre");
        txt.setText(getString(R.string.pregunta_aceptar,nombre));

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("resultado",true);
                setResult(RESULT_OK,intent);
                finish();
            }
        });

        rechazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("resultado",false);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
