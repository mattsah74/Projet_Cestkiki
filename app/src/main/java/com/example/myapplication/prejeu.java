package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

public class prejeu extends AppCompatActivity {
    private TextView txt1, txt2;
    private Button creer_part, rejoindre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prejeu);

        Bundle extras = getIntent().getExtras();
        int categorie1 = extras.getInt("cat1"); // cela permet de recuperer la valeur de l'activité main
        int categorie2 = extras.getInt("cat2");

        creer_part = (Button) findViewById(R.id.btn_creer);
        rejoindre = (Button) findViewById(R.id.btn_rejoindre);


        txt1 = (EditText) findViewById(R.id.txt_codeout);
        txt2 = (EditText) findViewById(R.id.txt_codein);




        this.creer_part.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                creercode();
            }});

        this.rejoindre.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                creercode();
            }});

    }

    @SuppressLint("SetTextI18n")
    private void creercode(){
        int[] tab = new int[30];
        Arrays.fill(tab,0);
        int code = 0;
        int nb = 0;

        Random random = new Random();
        int graine = random.nextInt();
        random.setSeed(graine);
        while(nb!=12){
            nb = 0;
            int x = random.nextInt(30);
            if(tab[x]==0){
                tab[x] = 1;
            }
            for(int k=0; k<30; k++){
                nb = nb + tab[k];
            }
        }
        for(int i=0; i<30; i++){
            code = code + tab[i]*(10^i);
        }
        txt1.setText(String.valueOf(code));

    }
}