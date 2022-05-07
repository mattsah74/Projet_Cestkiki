package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Regle extends AppCompatActivity {
    private Button jouer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Enlève la barre de titre
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        // Enlever la barre de notifications pour afficher l'application en plein écran
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //On définit le contenu de la vue APRES les instructions précédentes pour éviter un cr
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regle);

        this.jouer = (Button) this.findViewById(R.id.jouer);
        jouer.setBackgroundColor(Color.parseColor("#bb86fc"));


        this.jouer.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Regle.this, accueil.class);
                startActivity(i);
            }
        });

    }
}