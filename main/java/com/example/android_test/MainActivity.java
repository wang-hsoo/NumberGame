package com.example.android_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.IntentCompat;

import android.app.Activity;
import android.app.TabActivity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends TabActivity {

    Button bBtn, btnTe, btnT, btnTh, btnFou, btnFiv, btnS, btnSe, btnE, btnN, restart, restart2;
    Integer[] num =  {R.id.btn1,R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7 ,R.id.btn8, R.id.btn9, R.id.btn10};
    Button[] btn = new Button[10];
    Chronometer chrono,chrono2;





    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chrono = (Chronometer)findViewById(R.id.chronometer1);

        for (i = 0; i < num.length; i++){
            btn[i] = findViewById(num[i]);
        }



        bBtn = (Button)findViewById(R.id.bBtn);
        btnT = (Button)findViewById(R.id.btnT);
        btnTh = (Button)findViewById(R.id.btnTh);
        btnFou = (Button)findViewById(R.id.btnFou);
        btnFiv = (Button)findViewById(R.id.btnFiv);
        btnS = (Button)findViewById(R.id.btnS);
        btnSe = (Button)findViewById(R.id.btnSe);
        btnN = (Button)findViewById(R.id.btnN);
        btnE = (Button)findViewById(R.id.btnE);
        btnTe = (Button)findViewById(R.id.btnTe);
        chrono2 = (Chronometer)findViewById(R.id.chronometer2);
        restart = (Button)findViewById(R.id.restart);
        restart2 = (Button)findViewById(R.id.restart2);

        TabHost tabHost = getTabHost();

        // Tabhost
        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("TAG1").setIndicator("1단계");
        tabSpec1.setContent(R.id.one);
        tabHost.addTab(tabSpec1);

        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("TAG2").setIndicator("2단계");
        tabSpec2.setContent(R.id.two);
        tabHost.addTab(tabSpec2);



        //1단계



       btn[0].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               chrono.setBase(SystemClock.elapsedRealtime());
               chrono.start();
               chrono.setTextColor(Color.RED);

               btn[0].setVisibility(View.INVISIBLE);
               btn[1].setVisibility(View.VISIBLE);
           }
       });

        btn[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                btn[1].setVisibility(View.INVISIBLE);
                btn[2].setVisibility(View.VISIBLE);
            }
        });

        btn[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                btn[2].setVisibility(View.INVISIBLE);
                btn[3].setVisibility(View.VISIBLE);
            }
        });

        btn[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                btn[3].setVisibility(View.INVISIBLE);
                btn[4].setVisibility(View.VISIBLE);
            }
        });

        btn[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                btn[4].setVisibility(View.INVISIBLE);
                btn[5].setVisibility(View.VISIBLE);
            }
        });

        btn[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                btn[5].setVisibility(View.INVISIBLE);
                btn[6].setVisibility(View.VISIBLE);
            }
        });

        btn[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                btn[6].setVisibility(View.INVISIBLE);
                btn[7].setVisibility(View.VISIBLE);
            }
        });

        btn[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                btn[7].setVisibility(View.INVISIBLE);
                btn[8].setVisibility(View.VISIBLE);
            }
        });

        btn[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                btn[8].setVisibility(View.INVISIBLE);
                btn[9].setVisibility(View.VISIBLE);
            }
        });

        btn[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chrono.stop();
                chrono.setTextColor(Color.BLUE);


            }
        });


        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        });

        restart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        });







        //2단계
        bBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chrono2.setBase(SystemClock.elapsedRealtime());
                chrono2.start();
                chrono2.setTextColor(Color.RED);

                btnT.setVisibility(View.VISIBLE);
                btnTh.setVisibility(View.VISIBLE);
                btnTh.setClickable(false);
                bBtn.setVisibility(View.INVISIBLE);
            }
        });

        btnT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTh.setClickable(true);
                btnT.setVisibility(View.INVISIBLE);
            }
        });

        btnTh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFou.setVisibility(View.VISIBLE);
                btnFiv.setVisibility(View.VISIBLE);
                btnFiv.setClickable(false);
                btnTh.setVisibility(View.INVISIBLE);
            }
        });

        btnFou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFiv.setClickable(true);
                btnFou.setVisibility(View.INVISIBLE);
            }
        });

        btnFiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnS.setVisibility(View.VISIBLE);
                btnSe.setVisibility(View.VISIBLE);
                btnSe.setClickable(false);
                btnFiv.setVisibility(View.INVISIBLE);
            }
        });

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSe.setClickable(true);
                btnS.setVisibility(View.INVISIBLE);
            }
        });

        btnSe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnE.setVisibility(View.VISIBLE);
                btnN.setVisibility(View.VISIBLE);
                btnN.setClickable(false);
                btnSe.setVisibility(View.INVISIBLE);
            }
        });

        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTe.setVisibility(View.VISIBLE);
                btnN.setClickable(true);
                btnTe.setClickable(false);
                btnE.setVisibility(View.INVISIBLE);
            }
        });

        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnN.setVisibility(View.INVISIBLE);
                btnTe.setClickable(true);
            }
        });



        btnTe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chrono2.stop();
                chrono2.setTextColor(Color.BLUE);

            }
        });

    }



}