package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class accueil extends AppCompatActivity {
    private Button cat1;
    private Button cat2;
    private TextView txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int [] cateselec = {0, 0};

        txt1 = (TextView) findViewById(R.id.txt_cat1);
        txt2 = (TextView) findViewById(R.id.txt_cat2);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        this.cat1 = (Button) this.findViewById(R.id.cat1);
        this.cat2 = (Button) this.findViewById(R.id.cat2);

        this.cat1.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                rajoutcate(cateselec, 1);
                txt1.setText(String.valueOf(cateselec[0]));
                txt2.setText(String.valueOf(cateselec[1]));
        }});


        this.cat2.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                rajoutcate(cateselec, 2);
                txt1.setText(String.valueOf(cateselec[0]));
                txt2.setText(String.valueOf(cateselec[1]));
            }});


    }
    private void rajoutcate(int[] tab, int cat){  // fonction qui nous maj notre tableau avec les categories selectionnées
        if (tab[0] == 0 ){
            if (tab[0]<cat ){
                tab[1] = cat;
            } else{
                int inter = tab[0];
                tab[0] = cat;
                tab[1] = inter;

            }
        } else{
            tab[1] = cat;
        }

    }
}