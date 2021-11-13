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
    Button baseBtn, btnTen, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, reset;
    Button bBtn, btnTe, btnT, btnTh, btnFou, btnFiv, btnS, btnSe, btnE, btnN;
    Chronometer chrono,chrono2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        baseBtn = (Button)findViewById(R.id.baseBtn);
        btnTwo = (Button)findViewById(R.id.btnTwo);
        btnThree = (Button)findViewById(R.id.btnThree);
        btnFour = (Button)findViewById(R.id.btnFour);
        btnFive = (Button)findViewById(R.id.btnFive);
        btnSix = (Button)findViewById(R.id.btnSix);
        btnSeven = (Button)findViewById(R.id.btnSeven);
        btnNine = (Button)findViewById(R.id.btnNine);
        btnEight = (Button)findViewById(R.id.btnEight);
        btnTen = (Button)findViewById(R.id.btnTen);
        chrono = (Chronometer)findViewById(R.id.chronometer1);
        reset = (Button)findViewById(R.id.reset);

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

        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("TAG1").setIndicator("1단계");
        tabSpec1.setContent(R.id.one);
        tabHost.addTab(tabSpec1);

        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("TAG2").setIndicator("2단계");
        tabSpec2.setContent(R.id.two);
        tabHost.addTab(tabSpec2);

        TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("TAG3").setIndicator("3단계");
        tabSpec3.setContent(R.id.three);
        tabHost.addTab(tabSpec3);


        baseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chrono.setBase(SystemClock.elapsedRealtime());
                chrono.start();
                chrono.setTextColor(Color.RED);

                btnTwo.setVisibility(View.VISIBLE);
                baseBtn.setVisibility(View.INVISIBLE);
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnThree.setVisibility(View.VISIBLE);
                btnTwo.setVisibility(View.INVISIBLE);
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFour.setVisibility(View.VISIBLE);
                btnThree.setVisibility(View.INVISIBLE);
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFive.setVisibility(View.VISIBLE);
                btnFour.setVisibility(View.INVISIBLE);
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSix.setVisibility(View.VISIBLE);
                btnFive.setVisibility(View.INVISIBLE);
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSeven.setVisibility(View.VISIBLE);
                btnSix.setVisibility(View.INVISIBLE);
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnEight.setVisibility(View.VISIBLE);
                btnSeven.setVisibility(View.INVISIBLE);
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnNine.setVisibility(View.VISIBLE);
                btnEight.setVisibility(View.INVISIBLE);
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTen.setVisibility(View.VISIBLE);
                btnNine.setVisibility(View.INVISIBLE);
            }
        });



        btnTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chrono.stop();
                chrono.setTextColor(Color.BLUE);

                reset.setVisibility(View.VISIBLE);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



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

                reset.setVisibility(View.VISIBLE);
            }
        });

    }
}