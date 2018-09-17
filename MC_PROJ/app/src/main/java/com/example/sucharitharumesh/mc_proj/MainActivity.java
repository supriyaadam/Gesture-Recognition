package com.example.sucharitharumesh.mc_proj;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //new ParseTask().execute();

        Button UrLopen = (Button) findViewById(R.id.test);
        UrLopen.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "http://192.168.0.17:8000/";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        Button Visual = (Button) findViewById(R.id.visual);
        Visual.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View v) {
                try{
                    // TODO Auto-generated method stub
                    Intent newIntention = new Intent(MainActivity.this, Visualization.class);
                    startActivity(newIntention);

                } catch (Exception e){
                    Log.d("Visualization Failed:", e.getMessage());
                }


            }
        });

        Button Visualeat = (Button) findViewById(R.id.visualeat);
        Visualeat.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View v) {
                try{
                    // TODO Auto-generated method stub
                    Intent newIntention2 = new Intent(MainActivity.this, Eating.class);
                    startActivity(newIntention2);

                } catch (Exception e){
                    Log.d("Visualization Failed:", e.getMessage());
                }


            }
        });

        Button Visualbehave = (Button) findViewById(R.id.behave);
        Visualbehave.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View v) {
                try{
                    // TODO Auto-generated method stub
                    Intent newIntention3 = new Intent(MainActivity.this, Behaviour.class);
                    startActivity(newIntention3);

                } catch (Exception e){
                    Log.d("Visualization Failed:", e.getMessage());
                }


            }
        });






    }
}

