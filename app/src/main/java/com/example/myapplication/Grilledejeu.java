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
    private int nbrestant, categorie1, categorie2;

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
        int nbcatrestant = nbrestant(tabposition);



        this.test.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
               int[] tabposition = majcodegrille(code);
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

        temp1.setText(aff);

        return tabfinal;
    }

    private void afficherimage(ImageView img, int place){
        int cat = categorie1;
        if(place>=15){
            place = place -15; //pour choisir dans la 2eme categorie
            cat = categorie2; // la categorie ou l'on pioche nos images est passé a la 2eme categorie selectionnées
        }
        switch (cat){
            case 1:
                switch(place){
                    case 0:
                        //img.setImageResource((R.drawable.cate1_im1));
                    case 1:
                        //img.setImageResource((R.drawable.cate1_im2));
                    case 2:
                        //img.setImageResource((R.drawable.cate1_im3));
                    case 3:
                        //img.setImageResource((R.drawable.cate1_im4));

                }
            case 2:
                switch(place){
                    case 0:
                        //img.setImageResource((R.drawable.cate2_im1));
                    case 1:
                        //img.setImageResource((R.drawable.cate2_im2));
                    case 2:
                        //img.setImageResource((R.drawable.cate2_im3));
                    case 3:
                        //img.setImageResource((R.drawable.cate2_im4));

                }
        }
    }



    private int nbrestant(int[] liste){
        int nb=0;
        for(int i=0; i<12; i++){
            if (liste[i]<15){
                nb ++;
            }
        }
        return nb;
    }
}












