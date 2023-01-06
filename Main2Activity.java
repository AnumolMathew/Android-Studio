package com.example.sjcet.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;
    TextView t6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1=findViewById(R.id.tv1);
        t2=findViewById(R.id.tv2);
        t3=findViewById(R.id.tv3);
        t4=findViewById(R.id.tv4);
        t5=findViewById(R.id.tv5);
        t6=findViewById(R.id.tv6);

        Intent i=getIntent();
        String fname=i.getStringExtra("fname :");
        String lname=i.getStringExtra("lname :");
        String age=i.getStringExtra("age :");
        t2.setText(fname);
    }
}
