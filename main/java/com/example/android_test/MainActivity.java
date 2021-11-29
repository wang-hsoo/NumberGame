package com.example.android_test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    Button bBtn, btnTe, btnT, btnTh, btnFou, btnFiv, btnS, btnSe, btnE, btnN;
    Chronometer chrono,chrono2;
    Button[] btn = new Button[50];
    Integer[] num = {R.id.btn1,R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7 ,R.id.btn8, R.id.btn9, R.id.btn10,
            R.id.btn11,R.id.btn12, R.id.btn13, R.id.btn14, R.id.btn15, R.id.btn16, R.id.btn17 ,R.id.btn18, R.id.btn19, R.id.btn20,
            R.id.btn21,R.id.btn22, R.id.btn23, R.id.btn24, R.id.btn25, R.id.btn26, R.id.btn27 ,R.id.btn28, R.id.btn29, R.id.btn30,
            R.id.btn31,R.id.btn32, R.id.btn33, R.id.btn34, R.id.btn35, R.id.btn36, R.id.btn37 ,R.id.btn38, R.id.btn39, R.id.btn40,
            R.id.btn41,R.id.btn42, R.id.btn43, R.id.btn44, R.id.btn45, R.id.btn46, R.id.btn47 ,R.id.btn48, R.id.btn49, R.id.btn50,};

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

        TabHost tabHost = getTabHost();

        // Tabhost
        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("TAG1").setIndicator("1단계");
        tabSpec1.setContent(R.id.one);
        tabHost.addTab(tabSpec1);

        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("TAG2").setIndicator("2단계");
        tabSpec2.setContent(R.id.two);
        tabHost.addTab(tabSpec2);

        TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("TAG3").setIndicator("3단계");
        tabSpec3.setContent(R.id.three);
        tabHost.addTab(tabSpec3);


        //1단계
        for ( i = 0; i < num.length; i++){
            int index;
            index = i;

            if (btn[index].isClickable() == true){

                btn[index].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                                btn[index].setVisibility(View.INVISIBLE);

                                if (btn[index] == btn[0]) {
                                    chrono.setBase(SystemClock.elapsedRealtime());
                                    chrono.start();
                                    chrono.setTextColor(Color.RED);
                                }

                                if (btn[index] == btn[49]) {
                                    chrono.stop();
                                    chrono.setTextColor(Color.BLUE);
                                }

                                    btn[index + 1].setClickable(true);

                            }
                });
                break;

            }

                continue;
        }




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