package com.example.a2016951707.androide03layouts;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.util.Log;
import android.app.AlertDialog;

public class Formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        Button enviar = findViewById(R.id.enviar);

        final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);

        alertBuilder.setIcon(R.drawable.summer);
        alertBuilder.setTitle("Aviso!");
        alertBuilder.setMessage("Deseja confirmar feed?");

        alertBuilder.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getBaseContext(), "Enviado", Toast.LENGTH_LONG).show();
            }
        });

        alertBuilder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getBaseContext(), "Cancelado", Toast.LENGTH_LONG).show();
            }
        });

        enviar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){

            AlertDialog dialog = alertBuilder.create();
            dialog.show();

    }
});


        }

}
