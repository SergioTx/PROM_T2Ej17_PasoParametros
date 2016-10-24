package com.example.sergio.t1_17ej_pasoparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Actividad1 extends AppCompatActivity {

    Button btn_verificar, btn_volver;
    EditText txt_nombre, txt_apellidos;
    TextView txt_condiciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);

        txt_condiciones = (TextView) findViewById(R.id.act1_condiciones);
        txt_nombre = (EditText) findViewById(R.id.act1_nombre);
        txt_apellidos = (EditText) findViewById(R.id.act1_apellidos);
        btn_verificar = (Button) findViewById(R.id.act1_verificar);
        btn_volver = (Button) findViewById(R.id.act1_volver);

        btn_verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Actividad1.this,Actividad1b.class);
                intent.putExtra("nombre",txt_nombre.getText().toString() + " " + txt_apellidos.getText().toString());
                startActivityForResult(intent,1);
            }
        });

        btn_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode == RESULT_OK){
            Bundle b = data.getExtras();
            boolean res = b.getBoolean("resultado");
            if (res){
                txt_condiciones.setText(getText(R.string.aceptas_condiciones) + " ACEPTADO");
            } else {
                txt_condiciones.setText(getText(R.string.aceptas_condiciones) + " RECHAZADO");
            }
        }
    }
}
