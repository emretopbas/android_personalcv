package com.example.MyCv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton  personal, work, reference, education;
    Context context = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personal = findViewById(R.id.personal);
        education = findViewById(R.id.education);
        reference = findViewById(R.id.reference);
        work =  findViewById(R.id.work);

        personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent personalact = new Intent(context,personalActivity.class);
                startActivity(personalact);
            }
        });

        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eduact = new Intent(context,educationActivity.class);
                startActivity(eduact);
            }
        });

        work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent workact = new Intent(context, workActivity.class);
                startActivity(workact);
            }
        });

        reference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent refact = new Intent(context,refactivity.class);
                startActivity(refact);
            }
        });
    }
}