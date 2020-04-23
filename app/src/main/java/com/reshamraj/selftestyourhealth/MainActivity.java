package com.reshamraj.selftestyourhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import  java.util.*;

import static android.view.View.VISIBLE;


public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    TextView Show1;
    double n0=0, n1=1, n2=2, n3=3, result=0;

    SeekBar seek_bar;

    RatingBar ratingbarv;

    TextView message, message1, seekm, ratings, message3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        View sb1=findViewById(R.id.seekBar);
        sb1.setVisibility(View.GONE);
        View sv1=findViewById(R.id.Seekval);
        sv1.setVisibility(View.GONE);

        View rtb=findViewById(R.id.ratingBar);
        rtb.setVisibility(View.GONE);

        View fbo=findViewById(R.id.feedback1);
        fbo.setVisibility(View.GONE);

        View fs=findViewById(R.id.feedscore);
        fs.setVisibility(View.GONE);

        View sbbt1=findViewById(R.id.submitend);
        sbbt1.setVisibility(View.GONE);



        View entt11=findViewById(R.id.enter1);
        entt11.setVisibility(View.GONE);

        View entt22=findViewById(R.id.enter2);
        entt22.setVisibility(View.GONE);






        View b2=findViewById(R.id.yes1);
        b2.setVisibility(View.GONE);

        View b4=findViewById(R.id.No1);
        b4.setVisibility(View.GONE);

        View b16=findViewById(R.id.yes2);
        b16.setVisibility(View.GONE);

        View b17=findViewById(R.id.no2);
        b17.setVisibility(View.GONE);

        View dcot1=findViewById(R.id.doctor);
        dcot1.setVisibility(View.GONE);


        View Nurse1=findViewById(R.id.Nurse1);
        Nurse1.setVisibility(View.GONE);

        View WardP1=findViewById(R.id.WardP1);
        WardP1.setVisibility(View.GONE);

        View PTD1=findViewById(R.id.PTD1);
        PTD1.setVisibility(View.GONE);

        View HSP1=findViewById(R.id.Hsp1);
        HSP1.setVisibility(View.GONE);

        View Police1=findViewById(R.id.Police1);
        Police1.setVisibility(View.GONE);

        View None1=findViewById(R.id.None1);
        None1.setVisibility(View.GONE);

        View b2wet=findViewById(R.id.dry);
        b2wet.setVisibility(View.GONE);

        View b4wet=findViewById(R.id.wet);
        b4wet.setVisibility(View.GONE);


        View b2wetha=findViewById(R.id.Headache1);
        b2wetha.setVisibility(View.GONE);

        View b4wetba=findViewById(R.id.bodyache);
        b4wetba.setVisibility(View.GONE);

        View b2wetbo=findViewById(R.id.both);
        b2wetbo.setVisibility(View.GONE);

        View b4wetnon=findViewById(R.id.non9);
        b4wetnon.setVisibility(View.GONE);




        View b4177=findViewById(R.id.no4);
        b4177.setVisibility(View.GONE);

        View b4166=findViewById(R.id.yes4);
        b4166.setVisibility(View.GONE);

        View b54177=findViewById(R.id.no5);
        b54177.setVisibility(View.GONE);

        View b54166=findViewById(R.id.yes5);
        b54166.setVisibility(View.GONE);

        View b64177=findViewById(R.id.no6);
        b64177.setVisibility(View.GONE);

        View b64166=findViewById(R.id.yes6);
        b64166.setVisibility(View.GONE);

        View b74177=findViewById(R.id.no7);
        b74177.setVisibility(View.GONE);

        View b74166=findViewById(R.id.yes7);
        b74166.setVisibility(View.GONE);

        View b84177=findViewById(R.id.no8);
        b84177.setVisibility(View.GONE);

        View b84166=findViewById(R.id.yes8);
        b84166.setVisibility(View.GONE);

        View b94177=findViewById(R.id.no9);
        b94177.setVisibility(View.GONE);

        View b94166=findViewById(R.id.yes9);
        b94166.setVisibility(View.GONE);

        View b941665=findViewById(R.id.Restart1);
        b941665.setVisibility(View.GONE);







        View bb1243144=findViewById(R.id.Asse1);
        bb1243144.setVisibility(View.GONE);




        message1=(TextView)findViewById(R.id.opf1);

        message=(TextView)findViewById(R.id.Quest1);

        ratings=(TextView)findViewById(R.id.feedscore);

        message3=(TextView)findViewById(R.id.text1);

        Button buttonendd=findViewById(R.id.submitend);


        Button button51=findViewById(R.id.enter1);
        Button button52=findViewById(R.id.enter2);

        Button button1=findViewById(R.id.yes1);
        Button button2=findViewById(R.id.No1);
        Button button3=findViewById(R.id.StartB);
        Button button4=findViewById(R.id.Restart1);
        Button button5=findViewById(R.id.yes2);
        Button button6=findViewById(R.id.no2);
        Button buttondoct = findViewById(R.id.doctor);
        Button buttonnurse=findViewById(R.id.Nurse1);
        Button buttonHsp=findViewById(R.id.Hsp1);
        Button buttonTransp=findViewById(R.id.PTD1);
        Button buttonWard=findViewById(R.id.WardP1);
        Button buttonPolice= findViewById(R.id.Police1);
        Button buttonNon=findViewById(R.id.None1);

        Button buttondry=findViewById(R.id.dry);
        Button buttonwet=findViewById(R.id.wet);

        Button button9=findViewById(R.id.yes4);
        Button button10=findViewById(R.id.no4);
        Button button11=findViewById(R.id.yes5);
        Button button12=findViewById(R.id.no5);
        Button button13=findViewById(R.id.yes6);
        Button button14=findViewById(R.id.no6);
        Button button15=findViewById(R.id.yes7);
        Button button16=findViewById(R.id.no7);
        Button button17=findViewById(R.id.yes8);
        Button button18=findViewById(R.id.no8);
        Button button19=findViewById(R.id.yes9);///yes9 redundant
        Button button20=findViewById(R.id.no9);///no9 redundant




        Button headache1=findViewById(R.id.Headache1);
        Button bodyache1=findViewById(R.id.bodyache);
        Button both11=findViewById(R.id.both);
        Button none22=findViewById(R.id.non9);



        Button Asse=findViewById(R.id.Asse1);

        button51.setOnClickListener(this);
        button52.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

        button6.setOnClickListener(this);

        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this); //button19 redundant
        button20.setOnClickListener(this); //button 20 redundant




        buttondoct.setOnClickListener(this);
        buttonnurse.setOnClickListener(this);
        buttonHsp.setOnClickListener(this);
        buttonTransp.setOnClickListener(this);
        buttonWard.setOnClickListener(this);
        buttonPolice.setOnClickListener(this);
        buttonNon.setOnClickListener(this);

        buttondry.setOnClickListener(this);
        buttonwet.setOnClickListener(this);

        headache1.setOnClickListener(this);
        bodyache1.setOnClickListener(this);
        both11.setOnClickListener(this);
        none22.setOnClickListener(this);
        buttonendd.setOnClickListener(this);


        Asse.setOnClickListener(this);

        ratingbarv=(RatingBar)findViewById(R.id.ratingBar);

        seek_bar=(SeekBar) findViewById(R.id.seekBar);
        seekm=(TextView)findViewById(R.id.Seekval);

        seek_bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {


            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                seekm.setText(seek_bar.getProgress()/10+"/"+seek_bar.getMax()/10);

            }



            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Seeking your response", Toast.LENGTH_LONG).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }




    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.StartB:
                result=result*0;

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View b4=findViewById(R.id.No1);
                b4.setVisibility(VISIBLE);

                View b5=findViewById(R.id.yes1);
                b5.setVisibility(VISIBLE);

                View b941665r=findViewById(R.id.Restart1);
                b941665r.setVisibility(VISIBLE);
                message.setText(R.string.q1);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                View bbs=findViewById(R.id.StartB);
                bbs.setVisibility(View.GONE);
                break;

            case R.id.yes1:
                result=result+n3;
                message.setText(R.string.q2);


                View b77=findViewById(R.id.No1);
                b77.setVisibility(View.GONE);
                View b133=findViewById(R.id.yes1);
                b133.setVisibility(View.GONE);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                View b11=findViewById(R.id.yes2);
                b11.setVisibility(VISIBLE);

                View b12=findViewById(R.id.no2);
                b12.setVisibility(VISIBLE);

                break;

            case R.id.No1:
                result=result+0;
                message.setText(R.string.q2);

                View b7=findViewById(R.id.No1);
                b7.setVisibility(View.GONE);
                View b13=findViewById(R.id.yes1);
                b13.setVisibility(View.GONE);


                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View b14=findViewById(R.id.yes2);
                b14.setVisibility(VISIBLE);


                View b15=findViewById(R.id.no2);
                b15.setVisibility(VISIBLE);


                break;

            case R.id.yes2:
                result=result+n3;

                message.setText(R.string.q3);
                View b777=findViewById(R.id.no2);
                b777.setVisibility(View.GONE);
                View b1333=findViewById(R.id.yes2);
                b1333.setVisibility(View.GONE);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View b144doc=findViewById(R.id.doctor);
                b144doc.setVisibility(VISIBLE);


                View b155nur=findViewById(R.id.Nurse1);
                b155nur.setVisibility(VISIBLE);

                View b155war=findViewById(R.id.WardP1);
                b155war.setVisibility(VISIBLE);

                View b155ptd=findViewById(R.id.PTD1);
                b155ptd.setVisibility(VISIBLE);

                View b155hsp=findViewById(R.id.Hsp1);
                b155hsp.setVisibility(VISIBLE);

                View b155pol=findViewById(R.id.Police1);
                b155pol.setVisibility(VISIBLE);

                View b155non=findViewById(R.id.None1);
                b155non.setVisibility(VISIBLE);
                break;

            case R.id.no2:
                result=result+n0;
                message.setText(R.string.q3);
                View bb777=findViewById(R.id.no2);
                bb777.setVisibility(View.GONE);
                View bb1333=findViewById(R.id.yes2);
                bb1333.setVisibility(View.GONE);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View b144rrdoc=findViewById(R.id.doctor);
                b144rrdoc.setVisibility(VISIBLE);


                View brr155nur=findViewById(R.id.Nurse1);
                brr155nur.setVisibility(VISIBLE);

                View brr155war=findViewById(R.id.WardP1);
                brr155war.setVisibility(VISIBLE);

                View brr155ptd=findViewById(R.id.PTD1);
                brr155ptd.setVisibility(VISIBLE);

                View brr155hsp=findViewById(R.id.Hsp1);
                brr155hsp.setVisibility(VISIBLE);

                View brr155pol=findViewById(R.id.Police1);
                brr155pol.setVisibility(VISIBLE);

                View brr155non=findViewById(R.id.None1);
                brr155non.setVisibility(VISIBLE);
                break;
            case R.id.doctor:
                result=result+n2;
                message.setText(R.string.q4);

                View dcot11=findViewById(R.id.doctor);
                dcot11.setVisibility(View.GONE);


                View Nurse11=findViewById(R.id.Nurse1);
                Nurse11.setVisibility(View.GONE);

                View WardP11=findViewById(R.id.WardP1);
                WardP11.setVisibility(View.GONE);

                View PTD11=findViewById(R.id.PTD1);
                PTD11.setVisibility(View.GONE);

                View HSP11=findViewById(R.id.Hsp1);
                HSP11.setVisibility(View.GONE);

                View b155polg=findViewById(R.id.Police1);
                b155polg.setVisibility(View.GONE);

                View b155nong=findViewById(R.id.None1);
                b155nong.setVisibility(View.GONE);


                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View bb3144=findViewById(R.id.yes4);
                bb3144.setVisibility(VISIBLE);


                View bb3155=findViewById(R.id.no4);
                bb3155.setVisibility(VISIBLE);

                break;
            case R.id.yes4:
                result=result+n2;
                message.setText(R.string.q5);

                View bb43777=findViewById(R.id.no4);
                bb43777.setVisibility(View.GONE);
                View bb431333=findViewById(R.id.yes4);
                bb431333.setVisibility(View.GONE);


                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View bb43144=findViewById(R.id.yes5);
                bb43144.setVisibility(VISIBLE);


                View bb43155=findViewById(R.id.no5);
                bb43155.setVisibility(VISIBLE);

                break;

            case R.id.Nurse1:
                result=result+n2;
                message.setText(R.string.q4);

                View dcot1=findViewById(R.id.doctor);
                dcot1.setVisibility(View.GONE);


                View Nurse1=findViewById(R.id.Nurse1);
                Nurse1.setVisibility(View.GONE);

                View WardP1=findViewById(R.id.WardP1);
                WardP1.setVisibility(View.GONE);

                View PTD1=findViewById(R.id.PTD1);
                PTD1.setVisibility(View.GONE);

                View HSP1=findViewById(R.id.Hsp1);
                HSP1.setVisibility(View.GONE);

                View b155polgg=findViewById(R.id.Police1);
                b155polgg.setVisibility(View.GONE);

                View b155nongg=findViewById(R.id.None1);
                b155nongg.setVisibility(View.GONE);


                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View bbb3144=findViewById(R.id.yes4);
                bbb3144.setVisibility(VISIBLE);


                View bb3b155=findViewById(R.id.no4);
                bb3b155.setVisibility(VISIBLE);

                break;

            case R.id.Hsp1:
                result=result+n2;
                message.setText(R.string.q4);
                View dcot1110=findViewById(R.id.doctor);
                dcot1110.setVisibility(View.GONE);


                View Nurse1110=findViewById(R.id.Nurse1);
                Nurse1110.setVisibility(View.GONE);

                View WardP0110=findViewById(R.id.WardP1);
                WardP0110.setVisibility(View.GONE);

                View PTD0110=findViewById(R.id.PTD1);
                PTD0110.setVisibility(View.GONE);

                View HSP0110=findViewById(R.id.Hsp1);
                HSP0110.setVisibility(View.GONE);

                View b155polgf=findViewById(R.id.Police1);
                b155polgf.setVisibility(View.GONE);

                View b155nongf=findViewById(R.id.None1);
                b155nongf.setVisibility(View.GONE);


                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View bbbb3144=findViewById(R.id.yes4);
                bbbb3144.setVisibility(VISIBLE);


                View bbb3b155=findViewById(R.id.no4);
                bbb3b155.setVisibility(VISIBLE);

                break;
            case R.id.WardP1:

                result=result+n2;
                message.setText(R.string.q4);
                View dcot1110w=findViewById(R.id.doctor);
                dcot1110w.setVisibility(View.GONE);


                View Nurse1110w=findViewById(R.id.Nurse1);
                Nurse1110w.setVisibility(View.GONE);

                View WardP0110w=findViewById(R.id.WardP1);
                WardP0110w.setVisibility(View.GONE);

                View PTD0110w=findViewById(R.id.PTD1);
                PTD0110w.setVisibility(View.GONE);

                View HSP0110w=findViewById(R.id.Hsp1);
                HSP0110w.setVisibility(View.GONE);

                View b155polgfw=findViewById(R.id.Police1);
                b155polgfw.setVisibility(View.GONE);

                View b155nongfw=findViewById(R.id.None1);
                b155nongfw.setVisibility(View.GONE);


                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View bbbb3144w=findViewById(R.id.yes4);
                bbbb3144w.setVisibility(VISIBLE);


                View bbb3b155w=findViewById(R.id.no4);
                bbb3b155w.setVisibility(VISIBLE);

            case R.id.Police1:
                result=result+n2;
                message.setText(R.string.q4);
                View dcot1110p=findViewById(R.id.doctor);
                dcot1110p.setVisibility(View.GONE);


                View Nurse1110p=findViewById(R.id.Nurse1);
                Nurse1110p.setVisibility(View.GONE);

                View WardP0110p=findViewById(R.id.WardP1);
                WardP0110p.setVisibility(View.GONE);

                View PTD0110p=findViewById(R.id.PTD1);
                PTD0110p.setVisibility(View.GONE);

                View HSP0110p=findViewById(R.id.Hsp1);
                HSP0110p.setVisibility(View.GONE);

                View b155polgfp=findViewById(R.id.Police1);
                b155polgfp.setVisibility(View.GONE);

                View b155nongfp=findViewById(R.id.None1);
                b155nongfp.setVisibility(View.GONE);


                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View bbbb3144p=findViewById(R.id.yes4);
                bbbb3144p.setVisibility(VISIBLE);


                View bbb3b155p=findViewById(R.id.no4);
                bbb3b155p.setVisibility(VISIBLE);

            case R.id.PTD1:
                result=result+n2;
                message.setText(R.string.q4);
                View dcot1110pp=findViewById(R.id.doctor);
                dcot1110pp.setVisibility(View.GONE);


                View Nurse1110pp=findViewById(R.id.Nurse1);
                Nurse1110pp.setVisibility(View.GONE);

                View WardP0110pp=findViewById(R.id.WardP1);
                WardP0110pp.setVisibility(View.GONE);

                View PTD0110pp=findViewById(R.id.PTD1);
                PTD0110pp.setVisibility(View.GONE);

                View HSP0110pp=findViewById(R.id.Hsp1);
                HSP0110pp.setVisibility(View.GONE);

                View b155polgfpp=findViewById(R.id.Police1);
                b155polgfpp.setVisibility(View.GONE);

                View b155nongfpp=findViewById(R.id.None1);
                b155nongfpp.setVisibility(View.GONE);


                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View bbbb3144pp=findViewById(R.id.yes4);
                bbbb3144pp.setVisibility(VISIBLE);


                View bbb3b155pp=findViewById(R.id.no4);
                bbb3b155pp.setVisibility(VISIBLE);

            case R.id.None1:
                result=result+n0;
                message.setText(R.string.q4);
                View dcot1110No=findViewById(R.id.doctor);
                dcot1110No.setVisibility(View.GONE);


                View Nurse1110nn=findViewById(R.id.Nurse1);
                Nurse1110nn.setVisibility(View.GONE);

                View WardP0110nn=findViewById(R.id.WardP1);
                WardP0110nn.setVisibility(View.GONE);

                View PTD0110nn=findViewById(R.id.PTD1);
                PTD0110nn.setVisibility(View.GONE);

                View HSP0110nn=findViewById(R.id.Hsp1);
                HSP0110nn.setVisibility(View.GONE);

                View b155polgfnn=findViewById(R.id.Police1);
                b155polgfnn.setVisibility(View.GONE);

                View b155nongfnn=findViewById(R.id.None1);
                b155nongfnn.setVisibility(View.GONE);


                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View bbbb3144nn=findViewById(R.id.yes4);
                bbbb3144nn.setVisibility(VISIBLE);


                View bbb3b155nn=findViewById(R.id.no4);
                bbb3b155nn.setVisibility(VISIBLE);

            case R.id.no4:
                result=result+n0;
                message.setText(R.string.q5);

                View bbb43777=findViewById(R.id.no4);
                bbb43777.setVisibility(View.GONE);
                View bbb431333=findViewById(R.id.yes4);
                bbb431333.setVisibility(View.GONE);


                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View bbb43144=findViewById(R.id.yes5);
                bbb43144.setVisibility(VISIBLE);


                View bb43b155=findViewById(R.id.no5);
                bb43b155.setVisibility(VISIBLE);

                break;


            case R.id.yes5:
                result=result+n1;
                message.setText(R.string.q6);

                View bb543777=findViewById(R.id.no5);
                bb543777.setVisibility(View.GONE);
                View bb5431333=findViewById(R.id.yes5);
                bb5431333.setVisibility(View.GONE);


                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View bb543144=findViewById(R.id.yes6);
                bb543144.setVisibility(VISIBLE);


                View bb543155=findViewById(R.id.no6);
                bb543155.setVisibility(VISIBLE);

                break;

            case R.id.no5:
                result=result+n0;
                message.setText(R.string.q6);

                View bbb543777=findViewById(R.id.no5);
                bbb543777.setVisibility(View.GONE);
                View bbb5431333=findViewById(R.id.yes5);
                bbb5431333.setVisibility(View.GONE);


                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View bbb543144=findViewById(R.id.yes6);
                bbb543144.setVisibility(VISIBLE);


                View bb543b155=findViewById(R.id.no6);
                bb543b155.setVisibility(VISIBLE);

                break;

            case R.id.yes6:
                result=result+n1;
                message.setText("");

                View bb643777=findViewById(R.id.no6);
                bb643777.setVisibility(View.GONE);
                View bb6431333=findViewById(R.id.yes6);
                bb6431333.setVisibility(View.GONE);


                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View b2wet=findViewById(R.id.dry);
                b2wet.setVisibility(VISIBLE);

                View b4wet=findViewById(R.id.wet);
                b4wet.setVisibility(VISIBLE);



                break;

            case R.id.dry:
                result=result+n1;
                message.setText(getString(R.string.q7) +
                        " (A sore throat is pain, scratchiness or irritation of the throat that often worsens when you swallow.)).. ? ");

                View b2wetdd=findViewById(R.id.dry);
                b2wetdd.setVisibility(View.GONE);

                View b4wetff=findViewById(R.id.wet);
                b4wetff.setVisibility(View.GONE);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                View bb643144wddr=findViewById(R.id.yes7);
                bb643144wddr.setVisibility(VISIBLE);


                View bb643155wddr=findViewById(R.id.no7);
                bb643155wddr.setVisibility(VISIBLE);

                break;

            case R.id.wet:
                result=result+n0;
                message.setText(R.string.q7);

                View b2wetddd=findViewById(R.id.dry);
                b2wetddd.setVisibility(View.GONE);

                View b4wetffd=findViewById(R.id.wet);
                b4wetffd.setVisibility(View.GONE);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }



                View bb643144wdd=findViewById(R.id.yes7);
                bb643144wdd.setVisibility(VISIBLE);


                View bb643155wdd=findViewById(R.id.no7);
                bb643155wdd.setVisibility(VISIBLE);
                break;

            case R.id.no6:
                result=result+n0;
                message.setText(R.string.q7);


                View bb6b43777=findViewById(R.id.no6);
                bb6b43777.setVisibility(View.GONE);
                View bb6b431333=findViewById(R.id.yes6);
                bb6b431333.setVisibility(View.GONE);


                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View bbb643144=findViewById(R.id.yes7);
                bbb643144.setVisibility(VISIBLE);


                View bb643b155=findViewById(R.id.no7);
                bb643b155.setVisibility(VISIBLE);

                break;

            case R.id.yes7:
                result=result+n1;
                message.setText(R.string.q8);

                View bb743777=findViewById(R.id.no7);
                bb743777.setVisibility(View.GONE);
                View bb7431333=findViewById(R.id.yes7);
                bb7431333.setVisibility(View.GONE);


                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View bb743144=findViewById(R.id.yes8);
                bb743144.setVisibility(VISIBLE);


                View bb743155=findViewById(R.id.no8);
                bb743155.setVisibility(VISIBLE);

                break;

            case R.id.no7:
                result=result+n0;
                message.setText(R.string.q8);

                View bbb743777=findViewById(R.id.no7);
                bbb743777.setVisibility(View.GONE);
                View bbb7431333=findViewById(R.id.yes7);
                bbb7431333.setVisibility(View.GONE);


                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View bbb743144=findViewById(R.id.yes8);
                bbb743144.setVisibility(VISIBLE);


                View bb743b155=findViewById(R.id.no8);
                bb743b155.setVisibility(VISIBLE);

                break;

            case R.id.yes8:
                result=result+n1;
                message.setText(R.string.q9);

                View bb843777=findViewById(R.id.no8);
                bb843777.setVisibility(View.GONE);
                View bb8431333=findViewById(R.id.yes8);
                bb8431333.setVisibility(View.GONE);


                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View b2wethae=findViewById(R.id.Headache1);
                b2wethae.setVisibility(VISIBLE);

                View b4wetbae=findViewById(R.id.bodyache);
                b4wetbae.setVisibility(VISIBLE);

                View b2wetboe=findViewById(R.id.both);
                b2wetboe.setVisibility(VISIBLE);

                View b4wetnone=findViewById(R.id.non9);
                b4wetnone.setVisibility(VISIBLE);


                break;

            case R.id.no8:
                result=result+n0;
                message.setText(R.string.q9);

                View bbb843777=findViewById(R.id.no8);
                bbb843777.setVisibility(View.GONE);
                View bbb8431333=findViewById(R.id.yes8);
                bbb8431333.setVisibility(View.GONE);


                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View b2wetha11=findViewById(R.id.Headache1);
                b2wetha11.setVisibility(VISIBLE);

                View b4wetba21=findViewById(R.id.bodyache);
                b4wetba21.setVisibility(VISIBLE);

                View b2wetbo31=findViewById(R.id.both);
                b2wetbo31.setVisibility(VISIBLE);

                View b4wetnon41=findViewById(R.id.non9);
                b4wetnon41.setVisibility(VISIBLE);

                break;

            case R.id.Headache1:
                result=result+n1;
                message.setText(R.string.Q10);

                View b2wethah=findViewById(R.id.Headache1);
                b2wethah.setVisibility(View.GONE);

                View b4wetbab=findViewById(R.id.bodyache);
                b4wetbab.setVisibility(View.GONE);

                View b2wetbob=findViewById(R.id.both);
                b2wetbob.setVisibility(View.GONE);

                View b4wetnonn=findViewById(R.id.non9);
                b4wetnonn.setVisibility(View.GONE);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View sv12=findViewById(R.id.Seekval);
                sv12.setVisibility(VISIBLE);
                View sb112=findViewById(R.id.seekBar);
                sb112.setVisibility(VISIBLE);

                View enter11o1=findViewById(R.id.enter1);
                enter11o1.setVisibility(VISIBLE);

                break;

            case R.id.bodyache:
                result=result+n1;
                message.setText(R.string.q10);

                View b2wethahbafg=findViewById(R.id.Headache1);
                b2wethahbafg.setVisibility(View.GONE);

                View b4wetbabbafg=findViewById(R.id.bodyache);
                b4wetbabbafg.setVisibility(View.GONE);

                View b2wetbobbafg=findViewById(R.id.both);
                b2wetbobbafg.setVisibility(View.GONE);

                View b4wetnonnbafg=findViewById(R.id.non9);
                b4wetnonnbafg.setVisibility(View.GONE);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View sv122=findViewById(R.id.Seekval);
                sv122.setVisibility(VISIBLE);
                View sb1122=findViewById(R.id.seekBar);
                sb1122.setVisibility(VISIBLE);

                View entero111=findViewById(R.id.enter1);
                entero111.setVisibility(VISIBLE);

                break;
            case R.id.both:
                result=result+n1;
                message.setText(R.string.q10);

                View b2wethahbafg6=findViewById(R.id.Headache1);
                b2wethahbafg6.setVisibility(View.GONE);

                View b4wetbabbafg6=findViewById(R.id.bodyache);
                b4wetbabbafg6.setVisibility(View.GONE);

                View b2wetbobbafg6=findViewById(R.id.both);
                b2wetbobbafg6.setVisibility(View.GONE);

                View b4wetnonnbafg6=findViewById(R.id.non9);
                b4wetnonnbafg6.setVisibility(View.GONE);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View svv12=findViewById(R.id.Seekval);
                svv12.setVisibility(VISIBLE);
                View sbb112=findViewById(R.id.seekBar);
                sbb112.setVisibility(VISIBLE);

                View entere111=findViewById(R.id.enter1);
                entere111.setVisibility(VISIBLE);

                break;

            case R.id.non9:
                result=result+n0;
                message.setText(R.string.q10);

                View b2wethahbafg7=findViewById(R.id.Headache1);
                b2wethahbafg7.setVisibility(View.GONE);

                View b4wetbabbafg7=findViewById(R.id.bodyache);
                b4wetbabbafg7.setVisibility(View.GONE);

                View b2wetbobbafg7=findViewById(R.id.both);
                b2wetbobbafg7.setVisibility(View.GONE);

                View b4wetnonnbafg7=findViewById(R.id.non9);
                b4wetnonnbafg7.setVisibility(View.GONE);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                View asv12=findViewById(R.id.Seekval);
                asv12.setVisibility(VISIBLE);
                View xsb112=findViewById(R.id.seekBar);
                xsb112.setVisibility(VISIBLE);

                View enter111=findViewById(R.id.enter1);
                enter111.setVisibility(VISIBLE);

                break;

            case R.id.enter1:

                int numm1=seek_bar.getProgress()/10;
                if (numm1>7){
                    result=result-n1;

                }else if(numm1>3){
                    result=result+n0;

                }else {
                    result=result+n1;
                }





                View enter1191=findViewById(R.id.enter1);
                enter1191.setVisibility(View.GONE);

                View entert0=findViewById(R.id.enter2);
                entert0.setVisibility(VISIBLE);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                seek_bar.setProgress(0);






                message.setText(R.string.Q11);

                break;


            case R.id.enter2:

                int numm2=seek_bar.getProgress()/10;
                if (numm2>7){
                    result=result-n1;

                }else if(numm2>3){
                    result=result+n0;

                }else {
                    result=result+n1;
                }

                message3.setText("");

                View esv12=findViewById(R.id.Seekval);
                esv12.setVisibility(View.GONE);
                View fsb112=findViewById(R.id.seekBar);
                fsb112.setVisibility(View.GONE);


                View ett21=findViewById(R.id.enter2);
                ett21.setVisibility(View.GONE);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }




                seek_bar.setProgress(0);

                message.setText(R.string.Your_asses);

                View bbb1243144as=findViewById(R.id.Asse1);
                bbb1243144as.setVisibility(VISIBLE);

                break;





           case R.id.Asse1:
                message.setText(getString(R.string.yout_score)+result);

                View bbbas1243144=findViewById(R.id.Asse1);
                bbbas1243144.setVisibility(View.GONE);
                View Tbbbas1243144=findViewById(R.id.text1);
                Tbbbas1243144.setVisibility(VISIBLE);
                if (result>10){
                    message3.setText(R.string.call_doctor);
                    message1.setText(R.string.consult_doctor);
                }else if(result>5){
                    message3.setText(R.string.you_safe);
                    message1.setText(R.string.be_careful);

                }else {
                    message3.setText(R.string.congrats_score);
                    message1.setText(R.string.out_danger);
                }

               View rtb2=findViewById(R.id.ratingBar);
               rtb2.setVisibility(VISIBLE);


               View fboog=findViewById(R.id.feedback1);
               fboog.setVisibility(VISIBLE);

               View fssg=findViewById(R.id.feedscore);
               fssg.setVisibility(VISIBLE);

               View sbbt11g=findViewById(R.id.submitend);
               sbbt11g.setVisibility(VISIBLE);

               break;
            case R.id.submitend:

                Toast.makeText(MainActivity.this, R.string.response_thanks, Toast.LENGTH_LONG).show();

                break;



            case R.id.Restart1:
                result=result*0;
                View b9=findViewById(R.id.StartB);
                b9.setVisibility(View.VISIBLE);
                message.setText("");



                View b18=findViewById(R.id.yes1);
                b18.setVisibility(View.GONE);

                View sb12=findViewById(R.id.seekBar);
                sb12.setVisibility(View.GONE);

                View b19=findViewById(R.id.No1);
                b19.setVisibility(View.GONE);

                View b20=findViewById(R.id.yes2);
                b20.setVisibility(View.GONE);

                View b21=findViewById(R.id.no2);
                b21.setVisibility(View.GONE);

                View dcoto1=findViewById(R.id.doctor);
                dcoto1.setVisibility(View.GONE);


                View Nurseo1=findViewById(R.id.Nurse1);
                Nurseo1.setVisibility(View.GONE);

                View WardPo1=findViewById(R.id.WardP1);
                WardPo1.setVisibility(View.GONE);

                View PTDo1=findViewById(R.id.PTD1);
                PTDo1.setVisibility(View.GONE);

                View HSPo1=findViewById(R.id.Hsp1);
                HSPo1.setVisibility(View.GONE);

                View b155polgp=findViewById(R.id.Police1);
                b155polgp.setVisibility(View.GONE);

                View b155nongpi=findViewById(R.id.None1);
                b155nongpi.setVisibility(View.GONE);

                View b2wet1=findViewById(R.id.dry);
                b2wet1.setVisibility(View.GONE);

                View b4wet1=findViewById(R.id.wet);
                b4wet1.setVisibility(View.GONE);


                View b4177=findViewById(R.id.no4);
                b4177.setVisibility(View.GONE);

                View b4166=findViewById(R.id.yes4);
                b4166.setVisibility(View.GONE);

                View b54177=findViewById(R.id.no5);
                b54177.setVisibility(View.GONE);

                View b54166=findViewById(R.id.yes5);
                b54166.setVisibility(View.GONE);

                View b64177=findViewById(R.id.no6);
                b64177.setVisibility(View.GONE);

                View b64166=findViewById(R.id.yes6);
                b64166.setVisibility(View.GONE);

                View b74177=findViewById(R.id.no7);
                b74177.setVisibility(View.GONE);

                View b74166=findViewById(R.id.yes7);
                b74166.setVisibility(View.GONE);

                View b84177=findViewById(R.id.no8);
                b84177.setVisibility(View.GONE);

                View b84166=findViewById(R.id.yes8);
                b84166.setVisibility(View.GONE);

                View b94177=findViewById(R.id.no9);
                b94177.setVisibility(View.GONE);

                View b94166=findViewById(R.id.yes9);
                b94166.setVisibility(View.GONE);


                

                View b2wetha1=findViewById(R.id.Headache1);
                b2wetha1.setVisibility(View.GONE);

                View b4wetba2=findViewById(R.id.bodyache);
                b4wetba2.setVisibility(View.GONE);

                View b2wetbo3=findViewById(R.id.both);
                b2wetbo3.setVisibility(View.GONE);

                View b4wetnon4=findViewById(R.id.non9);
                b4wetnon4.setVisibility(View.GONE);



                View bba1243144=findViewById(R.id.Asse1);
                bba1243144.setVisibility(View.GONE);

                View ett2en1=findViewById(R.id.enter2);
                ett2en1.setVisibility(View.GONE);

                View hsv12=findViewById(R.id.Seekval);
                hsv12.setVisibility(View.GONE);
                View hsb112=findViewById(R.id.seekBar);
                hsb112.setVisibility(View.GONE);

                View ett2en111=findViewById(R.id.enter1);
                ett2en111.setVisibility(View.GONE);

                View rtbb=findViewById(R.id.ratingBar);
                rtbb.setVisibility(View.GONE);

                View fbooe=findViewById(R.id.feedback1);
                fbooe.setVisibility(View.GONE);

                View fsse=findViewById(R.id.feedscore);
                fsse.setVisibility(View.GONE);

                View sbbt11e=findViewById(R.id.submitend);
                sbbt11e.setVisibility(View.GONE);

                View Ttbbbas1243144=findViewById(R.id.text1);
                Ttbbbas1243144.setVisibility(VISIBLE);

                seek_bar.setProgress(0);


                message1.setText("");



                break;
        }

    }
}
