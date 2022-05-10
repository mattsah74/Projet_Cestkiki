package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Grilledejeu extends AppCompatActivity {
    private TextView txt_popup;
    private Button oui, non;
    private int categorie1, categorie2;
    private ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12;
    private ImageView eto1, eto2, eto3, eto4,eto5, eto6, eto7, eto8, eto9, eto10, eto11, eto12 ;
    private ImageView popup_fond;
    private int debut =0;

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


        int[] tabposition = majcodegrille(code);

        popup_fond = (ImageView) findViewById(R.id.fondpopup);
        txt_popup = (TextView) findViewById(R.id.txt_popup);
        oui = (Button) findViewById(R.id.btn_popoui);
        non = (Button) findViewById(R.id.btn_popnon);


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

        eto1 = (ImageView) findViewById(R.id.eto1);
        eto2 = (ImageView) findViewById(R.id.eto2);
        eto3 = (ImageView) findViewById(R.id.eto3);
        eto4 = (ImageView) findViewById(R.id.eto4);
        eto5 = (ImageView) findViewById(R.id.eto5);
        eto6 = (ImageView) findViewById(R.id.eto6);
        eto7 = (ImageView) findViewById(R.id.eto7);
        eto8 = (ImageView) findViewById(R.id.eto8);
        eto9 = (ImageView) findViewById(R.id.eto9);
        eto10 = (ImageView) findViewById(R.id.eto10);
        eto11 = (ImageView) findViewById(R.id.eto11);
        eto12 = (ImageView) findViewById(R.id.eto12);

        eto1.bringToFront();
        eto2.bringToFront();
        eto3.bringToFront();
        eto4.bringToFront();
        eto5.bringToFront();
        eto6.bringToFront();
        eto7.bringToFront();
        eto8.bringToFront();
        eto9.bringToFront();
        eto10.bringToFront();
        eto11.bringToFront();
        eto12.bringToFront();



        afficherimage(img1,tabposition[0]);
        afficherimage(img8,tabposition[1]);
        afficherimage(img3,tabposition[2]);
        afficherimage(img10,tabposition[3]);
        afficherimage(img5,tabposition[4]);
        afficherimage(img12,tabposition[5]);

        afficherimage(img6,tabposition[6]);
        afficherimage(img7,tabposition[7]);
        afficherimage(img9,tabposition[8]);
        afficherimage(img2,tabposition[9]);
        afficherimage(img4,tabposition[10]);
        afficherimage(img11,tabposition[11]);

        /* View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions); */

        this.oui.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                txt_popup.setText("Bravo ! Tu as gagné ! N'hésite pas à rejouer ;)");
            }});

        this.non.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                popup_fond.setVisibility(View.INVISIBLE);
                txt_popup.setVisibility(View.INVISIBLE);
                oui.setVisibility(View.INVISIBLE);
                non.setVisibility(View.INVISIBLE);
            }});

        this.img1.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img1,1);
            }});

        this.img2.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img2,2);
            }});

        this.img3.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img3,3);
            }});

        this.img4.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img4,4);
            }});

        this.img5.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img5,5);
            }});

        this.img6.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img6,6);
            }});

        this.img7.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img7,7);
            }});

        this.img8.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img8,8);
            }});

        this.img9.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img9,9);
            }});

        this.img10.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img10,10);
            }});

        this.img11.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img11,11);
            }});

        this.img12.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                transpa(img12,12);
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
        //temp1.setText(""+aff);

        return tabfinal;
    }

    private void afficherimage(ImageView img, int place){ //fonction qui sert à afficher les images
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
            case 5:
                switch(place){
                    case 0:
                        img.setImageResource((R.drawable.cat5_im1));
                        break;
                    case 1:
                        img.setImageResource((R.drawable.cat5_im2));
                        break;
                    case 2:
                        img.setImageResource((R.drawable.cat5_im3));
                        break;
                    case 3:
                        img.setImageResource((R.drawable.cat5_im4));
                        break;
                    case 4:
                        img.setImageResource((R.drawable.cat5_im5));
                        break;
                    case 5:
                        img.setImageResource((R.drawable.cat5_im6));
                        break;
                    case 6:
                        img.setImageResource((R.drawable.cat5_im7));
                        break;
                    case 7:
                        img.setImageResource((R.drawable.cat5_im8));
                        break;
                    case 8:
                        img.setImageResource((R.drawable.cat5_im9));
                        break;
                    case 9:
                        img.setImageResource((R.drawable.cat5_im10));
                        break;
                    case 10:
                        img.setImageResource((R.drawable.cat5_im11));
                        break;
                    case 11:
                        img.setImageResource((R.drawable.cat5_im12));
                        break;
                    case 12:
                        img.setImageResource((R.drawable.cat5_im13));
                        break;
                    case 13:
                        img.setImageResource((R.drawable.cat5_im14));
                        break;
                    case 14:
                        img.setImageResource((R.drawable.cat5_im15));
                        break;
                }
                break;
            case 6:
                switch(place){
                    case 0:
                        img.setImageResource((R.drawable.cat6_im1));
                        break;
                    case 1:
                        img.setImageResource((R.drawable.cat6_im2));
                        break;
                    case 2:
                        img.setImageResource((R.drawable.cat6_im3));
                        break;
                    case 3:
                        img.setImageResource((R.drawable.cat6_im4));
                        break;
                    case 4:
                        img.setImageResource((R.drawable.cat6_im5));
                        break;
                    case 5:
                        img.setImageResource((R.drawable.cat6_im6));
                        break;
                    case 6:
                        img.setImageResource((R.drawable.cat6_im7));
                        break;
                    case 7:
                        img.setImageResource((R.drawable.cat6_im8));
                        break;
                    case 8:
                        img.setImageResource((R.drawable.cat6_im9));
                        break;
                    case 9:
                        img.setImageResource((R.drawable.cat6_im10));
                        break;
                    case 10:
                        img.setImageResource((R.drawable.cat6_im11));
                        break;
                    case 11:
                        img.setImageResource((R.drawable.cat6_im12));
                        break;
                    case 12:
                        img.setImageResource((R.drawable.cat6_im13));
                        break;
                    case 13:
                        img.setImageResource((R.drawable.cat6_im14));
                        break;
                    case 14:
                        img.setImageResource((R.drawable.cat6_im15));
                        break;
                }break;

            case 7:
                switch(place){
                    case 0:
                        img.setImageResource((R.drawable.cat7_im1));
                        break;
                    case 1:
                        img.setImageResource((R.drawable.cat7_im2));
                        break;
                    case 2:
                        img.setImageResource((R.drawable.cat7_im3));
                        break;
                    case 3:
                        img.setImageResource((R.drawable.cat7_im4));
                        break;
                    case 4:
                        img.setImageResource((R.drawable.cat7_im5));
                        break;
                    case 5:
                        img.setImageResource((R.drawable.cat7_im6));
                        break;
                    case 6:
                        img.setImageResource((R.drawable.cat7_im7));
                        break;
                    case 7:
                        img.setImageResource((R.drawable.cat7_im8));
                        break;
                    case 8:
                        img.setImageResource((R.drawable.cat7_im9));
                        break;
                    case 9:
                        img.setImageResource((R.drawable.cat7_im10));
                        break;
                    case 10:
                        img.setImageResource((R.drawable.cat7_im11));
                        break;
                    case 11:
                        img.setImageResource((R.drawable.cat7_im12));
                        break;
                    case 12:
                        img.setImageResource((R.drawable.cat7_im13));
                        break;
                    case 13:
                        img.setImageResource((R.drawable.cat7_im14));
                        break;
                    case 14:
                        img.setImageResource((R.drawable.cat7_im15));
                        break;
                }
                break;
            case 8:
                switch(place){
                    case 0:
                        img.setImageResource((R.drawable.cat8_im1));
                        break;
                    case 1:
                        img.setImageResource((R.drawable.cat8_im2));
                        break;
                    case 2:
                        img.setImageResource((R.drawable.cat8_im3));
                        break;
                    case 3:
                        img.setImageResource((R.drawable.cat8_im4));
                        break;
                    case 4:
                        img.setImageResource((R.drawable.cat8_im5));
                        break;
                    case 5:
                        img.setImageResource((R.drawable.cat8_im6));
                        break;
                    case 6:
                        img.setImageResource((R.drawable.cat8_im7));
                        break;
                    case 7:
                        img.setImageResource((R.drawable.cat8_im8));
                        break;
                    case 8:
                        img.setImageResource((R.drawable.cat8_im9));
                        break;
                    case 9:
                        img.setImageResource((R.drawable.cat8_im10));
                        break;
                    case 10:
                        img.setImageResource((R.drawable.cat8_im11));
                        break;
                    case 11:
                        img.setImageResource((R.drawable.cat8_im12));
                        break;
                    case 12:
                        img.setImageResource((R.drawable.cat8_im13));
                        break;
                    case 13:
                        img.setImageResource((R.drawable.cat8_im14));
                        break;
                    case 14:
                        img.setImageResource((R.drawable.cat8_im15));
                        break;
                }
                break;
        }
    }

    private void transpa(ImageView img, int a){ // fonction qui sert à afficher l'etoile
        if (debut ==0){
            switch(a){
                case 1:
                    eto1.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    eto2.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    eto3.setVisibility(View.VISIBLE);
                    break;
                case 4:
                    eto4.setVisibility(View.VISIBLE);
                    break;
                case 5:
                    eto5.setVisibility(View.VISIBLE);
                    break;
                case 6:
                    eto6.setVisibility(View.VISIBLE);
                    break;
                case 7:
                    eto7.setVisibility(View.VISIBLE);
                    break;
                case 8:
                    eto8.setVisibility(View.VISIBLE);
                    break;
                case 9:
                    eto9.setVisibility(View.VISIBLE);
                    break;
                case 10:
                    eto10.setVisibility(View.VISIBLE);
                    break;
                case 11:
                    eto11.setVisibility(View.VISIBLE);
                    break;
                case 12:
                    eto12.setVisibility(View.VISIBLE);

            }
            debut = 1;
        }
        else{
            float opac = img.getAlpha();
            if (opac == 1.0f){
                img.setAlpha(0.4f);
            }
            else if(opac == 0.4f){ img.setAlpha(1.0f); }
        }
        finpartie();
    }

    private void finpartie(){
        int temp=0;
        if (img1.getAlpha() == 0.4f){temp++;}
        if (img2.getAlpha() == 0.4f){temp++;}
        if (img3.getAlpha() == 0.4f){temp++;}
        if (img4.getAlpha() == 0.4f){temp++;}
        if (img5.getAlpha() == 0.4f){temp++;}
        if (img6.getAlpha() == 0.4f){temp++;}
        if (img7.getAlpha() == 0.4f){temp++;}
        if (img8.getAlpha() == 0.4f){temp++;}
        if (img9.getAlpha() == 0.4f){temp++;}
        if (img10.getAlpha() == 0.4f){temp++;}
        if (img11.getAlpha() == 0.4f){temp++;}
        if (img12.getAlpha() == 0.4f){temp++;}

        if (temp==11){
            popup_fond.setVisibility(View.VISIBLE);
            txt_popup.setVisibility(View.VISIBLE);
            oui.setVisibility(View.VISIBLE);
            non.setVisibility(View.VISIBLE);
            txt_popup.setText("Est ce que ce personnage était le bon ?");
            popup_fond.bringToFront();
            txt_popup.bringToFront();
            oui.bringToFront();
            non.bringToFront();
        }


    }

}

