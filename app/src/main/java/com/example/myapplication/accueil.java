package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class accueil extends AppCompatActivity {
    private Button cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8, jouer;
    private TextView txt1, txt2, txterreur;

    int tour = 0; // utilisé pour rentrer les caté selectionne dans rajoutcate

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Cette directive enlève la barre de titre
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);


        Bundle extras = getIntent().getExtras();
        String value = extras.getString("code"); // cela permet de recuperer la valeur de l'activité main


        int [] cateselec = {0, 0};



        txt1 = (TextView) findViewById(R.id.txt_cat1);
        txt2 = (TextView) findViewById(R.id.txt_cat2);
        txterreur = (TextView) findViewById(R.id.txt_erreur);

        this.cat1 = (Button) this.findViewById(R.id.cat1);
        this.cat2 = (Button) this.findViewById(R.id.cat2);
        this.cat3 = (Button) this.findViewById(R.id.cat3);
        this.cat4 = (Button) this.findViewById(R.id.cat4);
        this.cat5 = (Button) this.findViewById(R.id.cat5);
        this.cat6 = (Button) this.findViewById(R.id.cat6);
        this.cat7 = (Button) this.findViewById(R.id.cat7);
        this.cat8 = (Button) this.findViewById(R.id.cat8);
        this.jouer = (Button) this.findViewById(R.id.btn_jouer);


        this.cat1.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                rajoutcate(cateselec, 1);
                txt1.setText(String.valueOf(cateselec[0]));
                txt2.setText(String.valueOf(cateselec[1]));
                int test = majcat(cateselec);

            }});


        this.cat2.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                rajoutcate(cateselec, 2);
                txt1.setText(String.valueOf(cateselec[0]));
                txt2.setText(String.valueOf(cateselec[1]));
                int test = majcat(cateselec);

            }});

        this.cat3.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                rajoutcate(cateselec, 3);
                txt1.setText(String.valueOf(cateselec[0]));
                txt2.setText(String.valueOf(cateselec[1]));
                int test = majcat(cateselec);

            }});

        this.cat4.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                rajoutcate(cateselec, 4);
                txt1.setText(String.valueOf(cateselec[0]));
                txt2.setText(String.valueOf(cateselec[1]));
                int test = majcat(cateselec);

            }});

        this.cat5.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                rajoutcate(cateselec, 5);
                txt1.setText(String.valueOf(cateselec[0]));
                txt2.setText(String.valueOf(cateselec[1]));
                int test = majcat(cateselec);

            }});

        this.cat6.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                rajoutcate(cateselec, 6);
                txt1.setText(String.valueOf(cateselec[0]));
                txt2.setText(String.valueOf(cateselec[1]));
                int test = majcat(cateselec);

            }});

        this.cat7.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                rajoutcate(cateselec, 7);
                txt1.setText(String.valueOf(cateselec[0]));
                txt2.setText(String.valueOf(cateselec[1]));
                int test = majcat(cateselec);

            }});

        this.cat8.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                rajoutcate(cateselec, 8);
                txt1.setText(String.valueOf(cateselec[0]));
                txt2.setText(String.valueOf(cateselec[1]));
                int test = majcat(cateselec);

            }});

        this.jouer.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                if (cateselec[0]<cateselec[1]){
                    Intent a = new Intent(accueil.this, prejeu.class);
                    a.putExtra("cat1",cateselec[0]);
                    a.putExtra("cat2", cateselec[1]);
                    startActivity(a);
                }else{
                    Intent a = new Intent(accueil.this, prejeu.class);
                    a.putExtra("cat1",cateselec[1]);
                    a.putExtra("cat2", cateselec[0]);
                    startActivity(a);
                }

            }});


    }



    @SuppressLint("SetTextI18n")
    private void rajoutcate(int[] tab, int cat){  // fonction qui nous maj notre tableau avec les categories selectionnées

        if (tour==0){
            if(tab[0] != cat && tab[1] != cat){
                tab[0] = cat;
                tour = 1;
            }else{
                txterreur.setText("Vous ne pouvez pas selectionner les 2 mêmes catégories");
            }
        }else{
            if(tab[0] != cat && tab[1] != cat){
                tab[1] = cat;
                tour = 0;
            }else{
                txterreur.setText("Vous ne pouvez pas selectionner les 2 mêmes catégories");
            }
        }

    }

    private int majcat(int[] tab){  // fonctionn qui modifie le tableau pour le maj dans le cloud
        int tabfinal;
        tabfinal = 10*tab[0] + tab[1];
        return tabfinal;
    }
}