package com.reshamraj.selftestyourhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;


public class Main3Activity extends AppCompatActivity {
TextView texx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    texx=(TextView)findViewById(R.id.text_show1);
        Button but = (Button) findViewById(R.id.get_b1);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new doit().execute();

            }
        });



    }

    public class doit extends AsyncTask<Void,Void,Void>{
String words;
        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc= Jsoup.connect("https://reshamelectronics.wixsite.com/rrs1").get();


         words=doc.text();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }


        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

        texx.setText(words.substring(101));

        }
    }
}
