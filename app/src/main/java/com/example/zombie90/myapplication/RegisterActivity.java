package com.example.zombie90.myapplication;

import android.content.Intent;
import android.graphics.drawable.RippleDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText et_email, et_username, et_password;
        TextView tv_register;
        Button btn_registerform;

        et_email = (EditText)findViewById(R.id.et_email);
        et_username = (EditText)findViewById(R.id.et_username);
        et_password = (EditText)findViewById(R.id.et_password);
        tv_register = (TextView)findViewById(R.id.tv_register);
        btn_registerform = (Button)findViewById(R.id.btn_registerform);


        tv_register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                finish();
            }
        });

        btn_registerform.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                finish();
            }
        });

    }
}
