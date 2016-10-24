package com.example.sergio.t1_17ej_pasoparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Actividad3 extends AppCompatActivity {

    int correctas = 0, incorrectas = 0;
    int num1,num2;
    TextView txt_correctasIncorrectas;
    EditText sum1,sum2,res;
    Button comprobar;

    /**
     * NO ARRANCA, PROBAR A VOLVER A CREAR LA ACTIVIDAD Y PEGAR DE NUEVO EL CONTENIDO SIN LAS CABECERAS
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);

        txt_correctasIncorrectas = (TextView) findViewById(R.id.correctasIncorrectas);
        sum1 = (EditText) findViewById(R.id.act3_num1); //primer sumando
        sum2 = (EditText) findViewById(R.id.act3_num2); //segundo sumando
        res = (EditText) findViewById(R.id.act3_res); //resultado
        comprobar = (Button) findViewById(R.id.act3_comprobar);

        num1 = aleat1a100();
        num2 = aleat1a100();
        sum1.setText(num1);
        sum2.setText(num2);


        txt_correctasIncorrectas.setText(getString(R.string.correctas_incorrectas,correctas,incorrectas));

        /*comprobar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultado = Integer.parseInt(res.getText().toString());
                Intent intent = new Intent(Actividad3.this, Actividad3b.class);
                intent.putExtra("num1",num1);
                intent.putExtra("num2",num2);
                intent.putExtra("res",resultado);
                startActivityForResult(intent,100);
            }
        });*/
    }

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 100 && resultCode == RESULT_OK){

        }
    }*/

    private int aleat1a100(){
        return (int) Math.ceil(Math.random()*100);
    }
}
