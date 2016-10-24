package com.example.sergio.t1_17ej_pasoparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {

    Button btn_startSession;
    EditText txt_user,txt_pass;
    TextView txt_error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        btn_startSession = (Button) findViewById(R.id.iniciarSesion);
        txt_user = (EditText) findViewById(R.id.user);
        txt_pass = (EditText) findViewById(R.id.pass);
        txt_error = (TextView) findViewById(R.id.txt_act2error);

        btn_startSession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txt_pass.getText().toString().equals("") || txt_user.getText().toString().equals("")){
                    txt_error.setText(R.string.user_pass_vacios);
                } else {
                    Intent intent = new Intent(Actividad2.this, Actividad2b.class);
                    intent.putExtra("user",txt_user.getText().toString());
                    intent.putExtra("pass",txt_pass.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }
}
