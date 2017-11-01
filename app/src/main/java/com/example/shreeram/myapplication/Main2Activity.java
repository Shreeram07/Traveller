package com.example.srinivasareddy.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Traveller");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final int location=getIntent().getIntExtra("loc",-1);
        final String licloc="loc"+location;

        ListView lstv=(ListView)findViewById(R.id.listsec);

        int lar=getResources().getIdentifier(licloc, "array", getApplicationContext().getPackageName());
        String[] srccc=getResources().getStringArray(lar);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.seclist,srccc);
        lstv.setAdapter(adapter);



        lstv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Main2Activity.this, com.example.srinivasareddy.myapplication.Main22Activity.class);
                intent.putExtra("file",licloc+"_"+position);
                startActivity(intent);
            }
        });

    }

}
