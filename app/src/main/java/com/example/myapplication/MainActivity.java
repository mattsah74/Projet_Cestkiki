package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity<image1> extends AppCompatActivity {
    private ImageView imageView;
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.imageView = (ImageView) this.findViewById(R.id.imageView1);

        this.button = (Button) this.findViewById(R.id.button);


        this.button.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
//                Intent i = new Intent (MainActivity.this, accueil.class);
//                startActivity(i);
                showImage1();
            }
        });


    }


    private void showImage1() {
        this.imageView.setImageResource(R.drawable.scarlett);
    }

    private void showImage2() {
        this.imageView.setImageResource(R.drawable.scarlett);
    }
    }


