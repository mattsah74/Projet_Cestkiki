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

import org.w3c.dom.Text;

public class accueil extends AppCompatActivity {
    private Button cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8, jouer;
    private TextView txterreur, affichcate;

    int tour = 0; // utilisé pour rentrer les caté selectionne dans rajoutcate

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Cette directive enlève la barre de titre
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        int [] cateselec = {0, 0};

        txterreur = (TextView) findViewById(R.id.txt_erreur);
        affichcate = (TextView) findViewById(R.id.affichcate);

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
                majcat(cateselec);
            }});


        this.cat2.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                rajoutcate(cateselec, 2);
                majcat(cateselec);
            }});

        this.cat3.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                rajoutcate(cateselec, 3);
                majcat(cateselec);
            }});

        this.cat4.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                rajoutcate(cateselec, 4);
                majcat(cateselec);

            }});

        this.cat5.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                rajoutcate(cateselec, 5);
                majcat(cateselec);

            }});

        this.cat6.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                rajoutcate(cateselec, 6);
                majcat(cateselec);

            }});

        this.cat7.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                rajoutcate(cateselec, 7);
                majcat(cateselec);
            }});

        this.cat8.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                rajoutcate(cateselec, 8);
                majcat(cateselec);
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

    private void majcat(int[] cate){  // fonction qui modifie le tableau pour le maj dans le cloud
        String[] tab = new String[2];
        switch(cate[0]){
            case 0:
                tab[1]= " ";
                tab[0]= " ";
                break;
            case 1:
                tab[0]= "acteur";
                break;
            case 2:
                tab[0]= "rappeur";
                break;
            case 3:
                tab[0]= "footballeur";
                break;
            case 4:;
                tab[0]= "manga / anime";
                break;
            case 5:
                tab[0]= "autres";
                break;
            case 6:
                tab[0]= "autres";
                break;
            case 7:
                tab[0]= "autres";
                break;
            case 8:
                tab[0]= "autres";
                break;
        }
        switch(cate[1]){
            case 0:
                tab[1]= "encore une autre ?";
                break;
            case 1:
                tab[1]= "acteur.";
                break;
            case 2:
                tab[1]= "rappeur.";
                break;
            case 3:
                tab[1]= "footballeur.";
                break;
            case 4:;
                tab[1]= "manga / anime.";
                break;
            case 5:
                tab[1]= "autres.";
                break;
            case 6:
                tab[1]= "autres.";
                break;
            case 7:
                tab[1]= "autres.";
                break;
            case 8:
                tab[1]= "autres.";
                break;
        }
        affichcate.setText("Vous avez choisi les catégories: "+tab[0]+" et "+tab[1]);
    }
}