package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class accueil extends AppCompatActivity {
    private Button cat1;
    private Button cat2;
    private TextView txt1, txt2, txterreur;
    SharedPreferences cloud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        cloud = getApplicationContext().getSharedPreferences("cloud", 0);
        SharedPreferences.Editor editor = cloud.edit();

        Bundle extras = getIntent().getExtras();
        String value = extras.getString("code");


        int [] cateselec = {0, 0};
        int tab_cat_sauv = 0;


        txt1 = (TextView) findViewById(R.id.txt_cat1);
        txt2 = (TextView) findViewById(R.id.txt_cat2);
        txterreur = (TextView) findViewById(R.id.txt_erreur);

        this.cat1 = (Button) this.findViewById(R.id.cat1);
        this.cat2 = (Button) this.findViewById(R.id.cat2);


        this.cat1.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                /*rajoutcate(cateselec, 1);
//                txt1.setText(String.valueOf(cateselec[0]));
//                txt2.setText(String.valueOf(cateselec[1]));
                int test = majcat(cateselec);
                editor.putInt("cateselec", test);
                editor.apply();
                int inter = cloud.getInt("cateselec", 0)%10;
                txt1.setText(String.valueOf((cloud.getInt("cateselec", 0)- inter)%10));
                txt2.setText(String.valueOf(inter));
                //cloud.getInt()*/

                txterreur.setText(value);


            }});


        this.cat2.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
/*//                rajoutcate(cateselec, 2);
//                txt1.setText(String.valueOf(cateselec[0]));
//                txt2.setText(String.valueOf(cateselec[1]));
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    String value = extras.getString("code");
                    txterreur.setText(value);
                    //The key argument here must match that used in the other activity
                }*/
                txterreur.setText(value);

            }});


    }
    @SuppressLint("SetTextI18n")
    private void rajoutcate(int[] tab, int cat){  // fonction qui nous maj notre tableau avec les categories selectionnées
        if(tab[0] != cat && tab[1] != cat){
            if (tab[0] != 0 ){
                if (tab[0]<cat ){
                    tab[1] = cat;
                } else{
                    int inter = tab[0];
                    tab[0] = cat;
                    tab[1] = inter;

                }
            } else{
                tab[0] = cat;
            }
        }else{
            txterreur.setText("Vous ne pouvez pas selectionner les 2 mêmes catégories");
        }
    }

    private int majcat(int[] tab){  // fonctionn qui modifie le tableau pour le maj dans le cloud
        int tabfinal = tab[0];
        tabfinal = 10*tab[0] + tab[1];
        return tabfinal;
    }
}