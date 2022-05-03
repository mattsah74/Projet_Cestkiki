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
    private Button button, regle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Enlève la barre de titre
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        // Enlever la barre de notifications pour afficher l'application en plein écran
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //On définit le contenu de la vue APRES les instructions précédentes pour éviter un cr
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            @Override
            public void onSystemUiVisibilityChange(int visibility) {
                // Note that system bars will only be "visible" if none of the
                // LOW_PROFILE, HIDE_NAVIGATION, or FULLSCREEN flags are set.
                if ((visibility & View.SYSTEM_UI_FLAG_FULLSCREEN) == 0) {
                    int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN;
                    decorView.setSystemUiVisibility(uiOptions);
                }
            }
        });*/


        this.button = (Button) this.findViewById(R.id.button);


        this.button.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, accueil.class);
                startActivity(i);
            }
        });

        this.regle = (Button) this.findViewById(R.id.regle);


        this.regle.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Regle.class);
                startActivity(i);
            }
        });
    }
}



