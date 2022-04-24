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
    private ImageView imageView;
    private TextView opacite;
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Cette directive enlève la barre de titre
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
// Cette directive permet d'enlever la barre de notifications pour afficher l'application en plein écran
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//On définit le contenu de la vue APRES les instructions précédentes pour éviter un cr
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.imageView = (ImageView) this.findViewById(R.id.imageView4);
        this.opacite = (TextView) this.findViewById(R.id.opacite);

        this.button = (Button) this.findViewById(R.id.button);
        this.button2 = (Button) this.findViewById(R.id.button2);




        this.button.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                String value="12";
                Intent i = new Intent(MainActivity.this, accueil.class);
                i.putExtra("code",value);
                startActivity(i);

                //showImage1();
            }
        });

        this.button2.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                //this.setBackgroundColor(Color.parseColor("#2596be");;
                float opac = imageView.getAlpha();
                if (opac == 1.0f){
                    imageView.setAlpha(0.4f);
                    opac = imageView.getAlpha();
                    opacite.setText("Opacité : "+(opac));
                }
                else if(opac == 0.4f){
                    imageView.setAlpha(1.0f);
                    opac = imageView.getAlpha();
                    opacite.setText("Opacité : "+(opac));
                }
            }
        });


    }


    private void showImage1() {
        this.imageView.setImageResource(R.drawable.george);
    }

    private void showImage2() {
        this.imageView.setImageResource(R.drawable.scarlett);
    }
    }


