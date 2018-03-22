package com.example.a2016951707.androide03layouts;

import android.content.Intent;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button noticia = findViewById(R.id.noticia);
        Button formulario = findViewById(R.id.formulario);
        Button tempo = findViewById(R.id.tempo);


        noticia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){

                Intent intent = new Intent(MainActivity.this, Noticia.class);
                startActivity(intent);

            }
        });

        formulario.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){

                Intent intent = new Intent(MainActivity.this, Formulario.class);
                startActivity(intent);

            }
        });

        tempo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){

                Intent intent = new Intent(MainActivity.this, Tempo.class);
                startActivity(intent);

            }
        });



    }
}