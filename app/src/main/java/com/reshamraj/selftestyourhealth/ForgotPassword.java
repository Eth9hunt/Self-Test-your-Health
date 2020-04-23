package com.reshamraj.selftestyourhealth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgotPassword extends AppCompatActivity {


    private Button ResetPasswordSendEmailButton;
    private EditText ResetEmailInput;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        mAuth=FirebaseAuth.getInstance();



        ResetPasswordSendEmailButton = (Button)findViewById(R.id.forget);
        ResetEmailInput=(EditText)findViewById(R.id.reset_emailText);

        ResetPasswordSendEmailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userEmail=ResetEmailInput.getText().toString();
                if (TextUtils.isEmpty(userEmail)){
                    Toast.makeText(ForgotPassword.this,"Please write your valid email address first", Toast.LENGTH_LONG).show();
                }else{
                    mAuth.sendPasswordResetEmail(userEmail).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {

                            if (task.isSuccessful()){
                                Toast.makeText(ForgotPassword.this,"Please check your email account.... if you want to reset your password.", Toast.LENGTH_LONG).show();
                                startActivity(new Intent(ForgotPassword.this,LoginActivity.class));

                            }else{
                                String message=task.getException().getMessage();
                                Toast.makeText(ForgotPassword.this," Something is wrong: Error Occured:"+message, Toast.LENGTH_LONG).show();
                            }


                        }
                    });
                }
            }
        });


    }
}
