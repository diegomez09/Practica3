package com.example.practica3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    schedule sh;
    user us;
    boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     final    EditText txt = findViewById(R.id.txt);
         Button btnAgregar = findViewById(R.id.btnAgregar);
         Button btnBuscar = findViewById(R.id.btnBuscar);

        sh = new schedule();
        us = new user();

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                us.setName(String.valueOf(txt.getText()));
                //System.out.println(txt.getText());
                sh.add(us);
                // Toast.makeText(getApplication(),"Hola:"+txt.getText(),Toast.LENGTH_LONG);
                Toast.makeText(getApplication(), txt.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = sh.search((txt.getText()).toString());
                Toast.makeText(getApplication(), "It's: "+flag,Toast.LENGTH_LONG).show();
                //Toast.makeText(getApplication(), "Its", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
