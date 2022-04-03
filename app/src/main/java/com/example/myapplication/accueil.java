package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class accueil<image1> extends AppCompatActivity {
    private Button cat1;
    private Button cat2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int [] cateselec = new int[2];
        cateselec[0] = 0;
        cateselec[1] = 0;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        this.cat1 = (Button) this.findViewById(R.id.cat1);
        this.cat2 = (Button) this.findViewById(R.id.cat2);

        this.cat1.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                rajoutcate(cateselec, 1);
        }});


        this.cat2.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                rajoutcate(cateselec, 2);
            }});


    }
    private void rajoutcate(int[] tab, int cat){
        if (tab[0] != 0){
            if (tab[0]<cat){
                tab[1] = cat;
            }
            else{
                int inter = tab[0];
                tab[0] = cat;
                tab[1] = inter;
            }
        }
        else{
            tab[1] = cat;
        }
    }
}