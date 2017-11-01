package com.example.srinivasareddy.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class Main22Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Traveller");

        final String place=getIntent().getStringExtra("file");
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        WebView webView=(WebView)findViewById(R.id.wv);

        webView.loadUrl("file:///android_res/raw/" + place + ".html");

        String cks=place;


        String[] idck=cks.split("\\_");
        int asd=Integer.parseInt(idck[1]);
        ImageView fiv = (ImageView) findViewById(R.id.flagiv);


        if (asd == 0) {
            int flagid = getResources().getIdentifier(place, "drawable", getApplicationContext().getPackageName());
            fiv.setImageResource(flagid);
            fiv.setVisibility(View.VISIBLE);
        }
        if (asd == 1) {
            int foodid = getResources().getIdentifier(place, "drawable", getApplicationContext().getPackageName());
            fiv.setImageResource(foodid);
            fiv.setVisibility(View.VISIBLE);
        }

            if (asd == 2) {
                int climateid = getResources().getIdentifier(place, "drawable", getApplicationContext().getPackageName());
                fiv.setImageResource(climateid);
                fiv.setVisibility(View.VISIBLE);
            }
                if (asd == 3) {
                    int trafficid = getResources().getIdentifier(place, "drawable", getApplicationContext().getPackageName());
                    fiv.setImageResource(trafficid);
                    fiv.setVisibility(View.VISIBLE);
                }






    }

}
