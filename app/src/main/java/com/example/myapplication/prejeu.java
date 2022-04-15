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
//        int[] tab = new int[30];
//        Arrays.fill(tab,0);
//        int code = 0;
//        int nb = 0;
//
//        Random random = new Random();
//        int graine = random.nextInt();
//        random.setSeed(graine);
//        while(nb!=12){
//            nb = 0;
//            int x = random.nextInt(30);
//            if(tab[x]==0){
//                tab[x] = 1;
//            }
//            for(int k=0; k<30; k++){
//                nb = nb + tab[k];
//            }
//        }
//        for(int i=0; i<30; i++){
//            code = code + tab[i]*(Math.pow(2,(int) i));
//        }



        int nombreAleatoire = 0;
        int tab [];
        tab = new int [31]; // !!! Il faut qu'il se crée en fonction du nombre ntot !!!
        int valide = 1;
        int tour = 0; // 1 - 12, nb d'images sur la partie graphique.

        while(tour < 12){
            nombreAleatoire = 1 + (int)(Math.random() * ((31 - 1) + 1)); //Je génère un nombre aléatoire compris entre [1;31]
            nombreAleatoire -= 1;
            //System.out.println(nombreAleatoire); // Pour vérifier le nb de tours.

            for (int i = 0; i < tour ; i++){
                if (tab[nombreAleatoire] == 1){
                    valide = 0;
                    //System.out.println("Déjà tiré"); // Test d'existence.
                    break;

                }else{
                    valide = 1;
                }
            }

            if (valide == 1){
                tab[nombreAleatoire] = 1;
                tour += 1;
            }
        }

        // CREATION DU BINAIRE ET TRADUCTION EN HEXADECIMAL

        for (int i = 0; i < 31; i++){
            //System.out.print(tab[i]);
        }

        //int nbbinaire = 0;
        //for (int i = 0; i <48; i++){
        //    nbbinaire += tab[i]*10^i;
        //}

        String s = "";
        for (int i: tab) {
            s = s + String.valueOf(i);
        }

        //System.out.println(" ");
        //System.out.println("Voici la chaîne binaire :");
        //System.out.println(s);

        //int nbbinaire = Integer.valueOf(s);
        //System.out.println("Voici le Nombre binaire :");
        //System.out.println(nbbinaire);



        //valeur max = 31 chiffres.

        int valDec = Integer.parseInt(s, 2); // conversion binaire -> décimal
        //System.out.println("Le nb décimal est " + valDec);
        String valHex = Integer.toString(valDec, 16); // conversion décimal -> hexa
       // System.out.println("Le nb hexadécimal est " + valHex);
        txt1.setText(String.valueOf(valHex));

    }
}