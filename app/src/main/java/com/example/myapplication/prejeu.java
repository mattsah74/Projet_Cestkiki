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

public class prejeu extends AppCompatActivity {
    private TextView txt1, txt2;
    private Button creer_part, rejoindre;
    private String code_grille;


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
                code_grille = creercode();
                txt1.setText(code_grille);

            }});

        this.rejoindre.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                code_grille = coderejoindre("10E3A42C");
                txt1.setText(code_grille);
            }});

    }

    @SuppressLint("SetTextI18n")
    private String creercode(){

        int nombreAleatoire = 0;
        int tab [];
        tab = new int [30]; // !!! Il faut qu'il se crée en fonction du nombre ntot !!!
        int valide = 1;
        int tour = 0; // 1 - 12, nb d'images sur la partie graphique.

        while(tour<12){
            nombreAleatoire = (int)(Math.random() * (30));;
            if(tab[nombreAleatoire]==0){
                tab[nombreAleatoire] = 1;
                tour++;
            }
        }

        // CREATION DU BINAIRE ET TRADUCTION EN HEXADECIMAL


        String s = "";
        for (int i: tab) {
            s = s + String.valueOf(i);
        }



        //valeur max = 31 chiffres.

        int valDec = Integer.parseInt(s, 2); // conversion binaire -> décimal
        //System.out.println("Le nb décimal est " + valDec);
        String valHex = Integer.toString(valDec, 16); // conversion décimal -> hexa
        // System.out.println("Le nb hexadécimal est " + valHex);
        txt1.setText(String.valueOf(valHex));

        return valHex;


    }

    private String coderejoindre (String valHex){
        int deci = Integer.parseInt(valHex,16);   // conversion hexa -> décimal
        //System.out.println("Le nb décimal est " + deci);

        String binaire = Integer.toBinaryString(deci);
        // System.out.println("Le nb binaire est " + binaire);

        int taille = binaire.length();

        if (taille != 30){
            int nombreajout = 30 - taille;

            for (int i = 0; i < nombreajout; i++){
                binaire = "0" + binaire;
            }
        }

        return binaire;


    }
}