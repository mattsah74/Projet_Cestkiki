package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity<image1> extends AppCompatActivity {
    private ImageView imageView;
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

        this.imageView = (ImageView) this.findViewById(R.id.imageView1);

        this.button = (Button) this.findViewById(R.id.button);


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


    }


    private void showImage1() {
        this.imageView.setImageResource(R.drawable.scarlett);
    }

    private void showImage2() {
        this.imageView.setImageResource(R.drawable.scarlett);
    }
    }


