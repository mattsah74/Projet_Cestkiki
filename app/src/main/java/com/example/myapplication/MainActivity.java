package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity<image1> extends AppCompatActivity {
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Cette directive enlève la barre de titre
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
// Cette directive permet d'enlever la barre de notifications pour afficher l'application en plein écran
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//On définit le contenu de la vue APRES les instructions précédentes pour éviter un cr
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.button = (Button) this.findViewById(R.id.button);


        this.button.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, accueil.class);
                startActivity(i);
            }
        });
    }
}



