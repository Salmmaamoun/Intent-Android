package com.example.intent_route;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView tv;
ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=findViewById(R.id.txtCourse);
        im=findViewById(R.id.bg);
       Intent intent= getIntent() ;
       String txt=intent.getStringExtra("txt");
       tv.setText(txt);
       int img=intent.getIntExtra("img",0);
       im.setImageResource(img);

    }
}