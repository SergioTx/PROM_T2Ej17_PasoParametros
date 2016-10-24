package com.example.sergio.t1_17ej_pasoparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad2b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2b);

        Bundle b = getIntent().getExtras();

        TextView correcto = (TextView) findViewById(R.id.act2_correcto);

        String user = b.getString("user");
        String pass = b.getString("pass");

        if (user.equalsIgnoreCase("sergio") && pass.equals("1234")) {
            correcto.setText(getText(R.string.correcto));
        } else {
            correcto.setText(getText(R.string.incorrecto));
        }

        Button volver = (Button) findViewById(R.id.act2_volver);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
