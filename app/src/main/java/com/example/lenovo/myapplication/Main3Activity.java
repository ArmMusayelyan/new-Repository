package com.example.lenovo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItem;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class Main3Activity extends AppCompatActivity {

    private TextView textbiceps;
    private TextView textvotq;
    private TextView textus;
    private TextView textmejq;
    private TextView textviz;
    private TextView textkrcqavandak;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textbiceps=(TextView)findViewById(R.id.textbiceps);
        textvotq=(TextView)findViewById(R.id.textvotq);
        textmejq=(TextView)findViewById(R.id.textmejq);
        textus=(TextView)findViewById(R.id.textus);
        textviz=(TextView)findViewById(R.id.textviz);
        textkrcqavandak=(TextView)findViewById(R.id.textkrcqavandak);
        textbiceps.setMovementMethod(new ScrollingMovementMethod());





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.dzerq){
            textbiceps.setVisibility(View.VISIBLE);


        }
return true;
    }

}
