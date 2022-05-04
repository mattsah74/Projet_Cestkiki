package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
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
    private int categorie1, categorie2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prejeu);

        Bundle extras = getIntent().getExtras();
        categorie1 = extras.getInt("cat1"); // cela permet de recuperer la valeur de l'activité main
        categorie2 = extras.getInt("cat2");


        creer_part = (Button) findViewById(R.id.btn_creer);
        rejoindre = (Button) findViewById(R.id.btn_rejoindre);


        txt1 = (EditText) findViewById(R.id.txt_codeout);
        txt2 = (EditText) findViewById(R.id.txt_codein);
        code_grille = creercode();
        txt1.setText(code_grille);

        /*View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);*/



        this.creer_part.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                code_grille = coderejoindre(code_grille);
                Intent a = new Intent(prejeu.this, Grilledejeu.class);
                a.putExtra("cat1",categorie1);
                a.putExtra("cat2", categorie2);
                a.putExtra("codegrille", code_grille);
                startActivity(a);
            }});

        this.rejoindre.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (String.valueOf(txt2.getText()) !=""){
                    String code = String.valueOf(txt2.getText());
                    code_grille = coderejoindre(code);
                    Intent a = new Intent(prejeu.this, Grilledejeu.class);
                    a.putExtra("cat1",categorie1);
                    a.putExtra("cat2", categorie2);
                    a.putExtra("codegrille", code_grille);
                    startActivity(a);
                }



            }});



    }

    @SuppressLint("SetTextI18n")
    private String creercode(){

        int nombreAleatoire = 0;
        int tab [] ;
        tab = new int [30];
        int tour = 0; // 1 - 12, nb d'images sur la partie graphique.

        if (categorie1 == categorie2){
            while(tour<12){
                nombreAleatoire = (int)(Math.random() * (30));;

                if(nombreAleatoire < 15 && tab[nombreAleatoire]==0 && tab[nombreAleatoire + 15]==0){
                    tab[nombreAleatoire] = 1;
                    tour++;
                }
                else if(nombreAleatoire > 14 && tab[nombreAleatoire]==0 && tab[nombreAleatoire - 15]==0){
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
            String valHex = Integer.toString(valDec, 16); // conversion décimal -> hexa
            txt1.setText(String.valueOf(valHex));

            return valHex;

        }else{
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
            String valHex = Integer.toString(valDec, 16); // conversion décimal -> hexa
            txt1.setText(String.valueOf(valHex));

            return valHex;
    }}

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