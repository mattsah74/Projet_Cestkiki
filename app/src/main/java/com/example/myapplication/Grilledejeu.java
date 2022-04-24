package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Grilledejeu extends AppCompatActivity {
    private TextView temp1;
    private Button test;
    private int categorie1, categorie2;
    private ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grilledejeu);

        Bundle extras = getIntent().getExtras();
        categorie1 = extras.getInt("cat1"); // cela permet de recuperer la valeur de l'activité main
        categorie2 = extras.getInt("cat2");
        String code = extras.getString("codegrille");

        temp1 = (TextView) findViewById(R.id.temp);
        test = (Button) findViewById(R.id.btn_test);

        int[] tabposition = majcodegrille(code);
        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        img3 = (ImageView) findViewById(R.id.img3);
        img4 = (ImageView) findViewById(R.id.img4);
        img5 = (ImageView) findViewById(R.id.img5);
        img6 = (ImageView) findViewById(R.id.img6);
        img7 = (ImageView) findViewById(R.id.img7);
        img8 = (ImageView) findViewById(R.id.img8);
        img9 = (ImageView) findViewById(R.id.img9);
        img10 = (ImageView) findViewById(R.id.img10);
        img11 = (ImageView) findViewById(R.id.img11);
        img12 = (ImageView) findViewById(R.id.img12);

        afficherimage(img1,tabposition[0]);
        afficherimage(img2,tabposition[3]);
        afficherimage(img3,tabposition[5]);
        afficherimage(img4,tabposition[7]);
        afficherimage(img5,tabposition[9]);
        afficherimage(img6,tabposition[11]);

        afficherimage(img7,tabposition[2]);
        afficherimage(img8,tabposition[4]);
        afficherimage(img9,tabposition[6]);
        afficherimage(img10,tabposition[8]);
        afficherimage(img11,tabposition[10]);
        afficherimage(img12,tabposition[12]);





        test.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

            }});


        img1.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img1);
            }});

        this.img2.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img2);
            }});

        this.img3.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img3);
            }});

        this.img4.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img4);
            }});

        this.img5.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img5);
            }});

        this.img6.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img6);
            }});

        this.img7.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img7);
            }});

        this.img8.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img8);
            }});

        this.img9.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img9);
            }});

        this.img10.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img10);
            }});

        this.img11.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img11);
            }});

        this.img12.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img12);
            }});

    }


    @SuppressLint("SetTextI18n")

    private int[] majcodegrille(String code){
        int[] tabfinal = new int[12];
        int a = 0;

        for (int i=0; i<30; i++){ // rentre dans mon tableau uniquement les positions des images a afficher
            if(code.charAt(i)=='1'){
                tabfinal[a]=i;
                a++;
            }
        }

        String aff = ""; //sert pour l'affichage des positions
        for (int i=0; i<12; i++){
            aff +=(","+tabfinal[i]);
        }

        return tabfinal;
    }

    private void afficherimage(ImageView img, int place){
        int cat = categorie1;
        if(place>=15){
            place = place -15; //pour choisir dans la 2eme categorie
            cat = categorie2; // la categorie ou l'on pioche nos images est passé a la 2eme categorie selectionnées
        }
        System.out.println("la cat est"+cat);
        System.out.println("l'image est"+place);
        switch (cat){
            case 1:
                switch(place){
                    case 0:
                        img.setImageResource((R.drawable.cat1_im1));
                        break;
                    case 1:
                        img.setImageResource((R.drawable.cat1_im2));
                        break;
                    case 2:
                        img.setImageResource((R.drawable.cat1_im3));
                        break;
                    case 3:
                        img.setImageResource((R.drawable.cat1_im4));
                        break;
                    case 4:
                        img.setImageResource((R.drawable.cat1_im5));
                        break;
                    case 5:
                        img.setImageResource((R.drawable.cat1_im6));
                        break;
                    case 6:
                        img.setImageResource((R.drawable.cat1_im7));
                        break;
                    case 7:
                        img.setImageResource((R.drawable.cat1_im8));
                        break;
                    case 8:
                        img.setImageResource((R.drawable.cat1_im9));
                        break;
                    case 9:
                        img.setImageResource((R.drawable.cat1_im10));
                        break;
                    case 10:
                        img.setImageResource((R.drawable.cat1_im11));
                        break;
                    case 11:
                        img.setImageResource((R.drawable.cat1_im12));
                        break;
                    case 12:
                        img.setImageResource((R.drawable.cat1_im13));
                        break;
                    case 13:
                        img.setImageResource((R.drawable.cat1_im14));
                        break;
                    case 14:
                        img.setImageResource((R.drawable.cat1_im15));
                        break;

                }
                break;
            case 2:
                switch(place){
                    case 0:
                        img.setImageResource((R.drawable.cat2_im1));
                        break;
                    case 1:
                        img.setImageResource((R.drawable.cat2_im2));
                        break;
                    case 2:
                        img.setImageResource((R.drawable.cat2_im3));
                        break;
                    case 3:
                        img.setImageResource((R.drawable.cat2_im4));
                        break;
                    case 4:
                        img.setImageResource((R.drawable.cat2_im5));
                        break;
                    case 5:
                        img.setImageResource((R.drawable.cat2_im6));
                        break;
                    case 6:
                        img.setImageResource((R.drawable.cat2_im7));
                        break;
                    case 7:
                        img.setImageResource((R.drawable.cat2_im8));
                        break;
                    case 8:
                        img.setImageResource((R.drawable.cat2_im9));
                        break;
                    case 9:
                        img.setImageResource((R.drawable.cat2_im10));
                        break;
                    case 10:
                        img.setImageResource((R.drawable.cat2_im11));
                        break;
                    case 11:
                        img.setImageResource((R.drawable.cat2_im12));
                        break;
                    case 12:
                        img.setImageResource((R.drawable.cat2_im13));
                        break;
                    case 13:
                        img.setImageResource((R.drawable.cat2_im14));
                        break;
                    case 14:
                        img.setImageResource((R.drawable.cat2_im15));
                        break;
                }
                break;
            case 3:
                switch(place){
                    case 0:
                        img.setImageResource((R.drawable.cat3_im1));
                        break;
                    case 1:
                        img.setImageResource((R.drawable.cat3_im2));
                        break;
                    case 2:
                        img.setImageResource((R.drawable.cat3_im3));
                        break;
                    case 3:
                        img.setImageResource((R.drawable.cat3_im4));
                        break;
                    case 4:
                        img.setImageResource((R.drawable.cat3_im5));
                        break;
                    case 5:
                        img.setImageResource((R.drawable.cat3_im6));
                        break;
                    case 6:
                        img.setImageResource((R.drawable.cat3_im7));
                        break;
                    case 7:
                        img.setImageResource((R.drawable.cat3_im8));
                        break;
                    case 8:
                        img.setImageResource((R.drawable.cat3_im9));
                        break;
                    case 9:
                        img.setImageResource((R.drawable.cat3_im10));
                        break;
                    case 10:
                        img.setImageResource((R.drawable.cat3_im11));
                        break;
                    case 11:
                        img.setImageResource((R.drawable.cat3_im12));
                        break;
                    case 12:
                        img.setImageResource((R.drawable.cat3_im13));
                        break;
                    case 13:
                        img.setImageResource((R.drawable.cat3_im14));
                        break;
                    case 14:
                        img.setImageResource((R.drawable.cat3_im15));
                        break;
                }
                break;
            case 4:
                switch(place){
                    case 0:
                        img.setImageResource((R.drawable.cat4_im1));
                        break;
                    case 1:
                        img.setImageResource((R.drawable.cat4_im2));
                        break;
                    case 2:
                        img.setImageResource((R.drawable.cat4_im3));
                        break;
                    case 3:
                        img.setImageResource((R.drawable.cat4_im4));
                        break;
                    case 4:
                        img.setImageResource((R.drawable.cat4_im5));
                        break;
                    case 5:
                        img.setImageResource((R.drawable.cat4_im6));
                        break;
                    case 6:
                        img.setImageResource((R.drawable.cat4_im7));
                        break;
                    case 7:
                        img.setImageResource((R.drawable.cat4_im8));
                        break;
                    case 8:
                        img.setImageResource((R.drawable.cat4_im9));
                        break;
                    case 9:
                        img.setImageResource((R.drawable.cat4_im10));
                        break;
                    case 10:
                        img.setImageResource((R.drawable.cat4_im11));
                        break;
                    case 11:
                        img.setImageResource((R.drawable.cat4_im12));
                        break;
                    case 12:
                        img.setImageResource((R.drawable.cat4_im13));
                        break;
                    case 13:
                        img.setImageResource((R.drawable.cat4_im14));
                        break;
                    case 14:
                        img.setImageResource((R.drawable.cat4_im15));
                        break;
                }
                break;
        }
    }

    private void transpa(ImageView img){
        float opac = img.getAlpha();
        if (opac == 1.0f){
            img.setAlpha(0.4f);
        }
        else if(opac == 0.4f){
            img.setAlpha(1.0f);
        }
    }

}

