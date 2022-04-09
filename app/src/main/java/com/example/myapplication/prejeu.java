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
    private Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prejeu);

        Bundle extras = getIntent().getExtras();
        String categorie1 = extras.getString("cat1"); // cela permet de recuperer la valeur de l'activité main
        String categorie2 = extras.getString("cat2");

        cat1 = (TextView) findViewById(R.id.catetest1);
        cat2 = (TextView) findViewById(R.id.catetest2);

        this.btn1 = (Button) this.findViewById(R.id.btn1);


        this.btn1.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                cat1.setText(categorie1);
                cat2.setText(categorie2);

            }});

    }
}