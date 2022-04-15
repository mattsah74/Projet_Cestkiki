package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class Grilledejeu extends AppCompatActivity {
    private TextView temp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grilledejeu);

        Bundle extras = getIntent().getExtras();
        int categorie1 = extras.getInt("cat1"); // cela permet de recuperer la valeur de l'activité main
        int categorie2 = extras.getInt("cat2");
        String code = extras.getString("codegrille");

        temp1 = (TextView) findViewById(R.id.temp);

        majcodegrille(code);
    }


    @SuppressLint("SetTextI18n")

    private void majcodegrille(String code){
        int[] tab = new int[12];
        int a = 0;
        int k = 0;
        for (char c:
             code.toCharArray()) {
            if (Character.toString(c) == "1"){
                tab[a] = k;
                a++;
            }
            k++;
        }

//        for(int i=0; i<30; i++){
//            if (code.substring(i,i+1) == "1"){
//                tab[a] = i;
//                a++;
//            }
//        }
        String temp="";
        for(int i=0; i<12;i++){
            temp = temp + tab[i];
        }
        temp1.setText(temp);
    }
}