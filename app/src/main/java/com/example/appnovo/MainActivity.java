package com.example.appnovo;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    FloatingActionButton botaoFlutuante;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mBarra = (Toolbar) findViewById(R.id.tlbPrincipal);
        setSupportActionBar(mBarra);

    botaoFlutuante = (FloatingActionButton) findViewById(R.id.novoUser);

    botaoFlutuante.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "Clique no botão", Toast.LENGTH_SHORT).show();
        }
    });

    }
}
