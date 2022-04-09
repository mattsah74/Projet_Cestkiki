package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class prejeu extends AppCompatActivity {
    private TextView cat1, cat2;
    private Button creer_part;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prejeu);

        Bundle extras = getIntent().getExtras();
        int categorie1 = extras.getInt("cat1"); // cela permet de recuperer la valeur de l'activité main
        int categorie2 = extras.getInt("cat2");

        this.creer_part = (Button) this.findViewById(R.id.btn_creer);


        this.creer_part.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

            }});

    }
}