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

public class Grilledejeu extends AppCompatActivity {
    private TextView temp1;
    private Button test;

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
        test = (Button) findViewById(R.id.btn_test);

        this.test.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
               majcodegrille(code);
            }});


    }


    @SuppressLint("SetTextI18n")

    private void majcodegrille(String code){
        int[] tab = new int[12];
        int a = 0;
        int k = 0;

        char[] temp = new char[12];

        for(int i=0; i<12;i++){
            temp[i] = code.charAt(i);
            tab[i] = Character.getNumericValue(temp[i]);
        }

        for(int i=0; i<12; i++){
            a += tab[i]*((int) Math.pow(10,i));
        }
        temp1.setText(tab[3]);
    }
}












