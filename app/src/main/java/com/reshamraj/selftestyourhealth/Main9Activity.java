package com.reshamraj.selftestyourhealth;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.ConfigurationCompat;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.icu.util.ULocale;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.reshamraj.selftestyourhealth.Helper.LocaleHelper;

import java.util.Locale;

import io.paperdb.Paper;

import static android.app.Activity.*;


public class Main9Activity extends AppCompatActivity {
    public static final String SHARED_PREFS="sharedPrefes";
    public static final String TEXT="text";
    Button BtnNext, BtnChangeLang, setLang;
    String langkey, st,stt;
    TextView checktex, languageName, languageCode;
    Locale localee;
    double b=22;
    String gh;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main9);
        loadLocale();









        BtnNext=findViewById(R.id.NextHome);

        BtnChangeLang=findViewById(R.id.ChooseLang);
        BtnChangeLang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showChangeLanguageDialog();
            }
        });







        BtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main9Activity.this, LoginActivity.class);
                //String mesg=String langkey;
                //intent.putExtra("m_key",mesg);
                startActivity(intent);

            }
        });

    }

    public void showChangeLanguageDialog(){
        final String [] listitems= {"English","हिंदी","français", "Deutsche","પાસ", "தமிழ்","తెలుగు","मराठी", "ਪੰਜਾਬੀ" };
        AlertDialog.Builder mBuilder= new AlertDialog.Builder(Main9Activity.this);
        mBuilder.setTitle("Choose Language....");
        mBuilder.setSingleChoiceItems(listitems, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i==0){
                    setLocale("en");


                    recreate();


                }
                if (i==1) {
                    setLocale("hi");


                    recreate();

                }

                if (i==2) {
                    setLocale("fr");


                    recreate();

                }

                if (i==3) {
                    setLocale("de");


                    recreate();
                }
                if (i==4) {
                    setLocale("gu");


                    recreate();
                }
                if (i==5) {
                    setLocale("ta");


                    recreate();
                }
                if (i==6) {
                    setLocale("te");


                    recreate();
                }
                if (i==7) {
                    setLocale("mr");


                    recreate();
                }
                if (i==8) {
                    setLocale("pa");


                    recreate();
                }

                dialogInterface.dismiss();

            }
        });
        AlertDialog mDialog = mBuilder.create();

        mDialog.show();
    }

    public void setLocale(String lang) {
        Locale locale = new Locale(lang);

        Locale.setDefault(locale);


        Configuration config= new Configuration();
        //config.locale=locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        SharedPreferences.Editor editor=getSharedPreferences("Settings", MODE_PRIVATE).edit();
        editor.putString(text,lang);
        editor.apply();
    }
    public void loadLocale(){
        SharedPreferences prefes=getSharedPreferences("Settings", MODE_PRIVATE);
        String language = prefes.getString(text, "");


        setLocale(language);
    }


}
