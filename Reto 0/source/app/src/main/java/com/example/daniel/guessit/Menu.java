package com.example.daniel.guessit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void lanzarMensajeCorto(){
        Toast.makeText(this,"Soy un texto, qué emoción",Toast.LENGTH_LONG).show();
    }

    public void llamarSegundoActivity(View view){
        lanzarMensajeCorto();
        Intent intent = new Intent(this,SegundoActivity.class);
        startActivity(intent);
    }
}
