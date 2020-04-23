package com.reshamraj.selftestyourhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class Main4Activity extends AppCompatActivity {
    private Button button;
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;
    EditText editText;
    String userdata;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);







        radioGroup=findViewById(R.id.radioGroup1);
        textView =findViewById(R.id.text_gender_select);
        Button buttonApply=findViewById(R.id.Ok_g);
        buttonApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId= radioGroup.getCheckedRadioButtonId();



                radioButton=findViewById(radioId);

                userdata= (String) radioButton.getText();
                    //this is not used in this activity but still handling crash.//
                if(TextUtils.isEmpty(userdata)) {
                    textView.setError("Your message");
                    Toast.makeText(Main4Activity.this, "your have not provide your valid information. Please go back !", Toast.LENGTH_LONG).show();
                    return;
                }else{
                    textView.setText("Your data has been saved:"+ userdata);
                }


            }
        });

        button=(Button) findViewById(R.id.goB);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });


    }
    public void checkButton(View v){
        int radioId= radioGroup.getCheckedRadioButtonId();

        radioButton=findViewById(radioId);

        Toast.makeText(this,"selected gender is:" + radioButton.getText(), Toast.LENGTH_SHORT).show();

    }
    public void openActivity2(){
        Intent intent =new Intent(this, Main5Activity.class);
        startActivity(intent);

    }
}
