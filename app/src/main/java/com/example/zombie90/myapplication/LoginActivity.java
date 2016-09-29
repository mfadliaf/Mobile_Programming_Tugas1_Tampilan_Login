package com.example.zombie90.myapplication;


import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText et_username, et_password;
    Button btn_register, btn_login, btn_facebook, btn_gmail, btn_twitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_username = (EditText)findViewById(R.id.et_username);
        et_password = (EditText)findViewById(R.id.et_password);
        btn_register = (Button)findViewById(R.id.btn_register);
        btn_login = (Button)findViewById(R.id.btn_login);
        btn_facebook = (Button)findViewById(R.id.btn_facebook);
        btn_gmail = (Button)findViewById(R.id.btn_gmail);
        btn_twitter = (Button)findViewById(R.id.btn_twitter);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {

            String username = et_username.getText().toString();
            String password = et_password.getText().toString();
            @Override
            public void onClick(View v) {
                if((!username.equals("admin"))&&(!password.equals("1234")))
                {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),"Login Berhasil", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                    builder.setMessage("Login Failed")
                            .setNegativeButton("Retry", null)
                            .create()
                            .show();
                }
            }


        });

        btn_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uriUrl = Uri.parse("https://www.facebook.com/muhammadfadli.afghany");
                Intent browse_intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(browse_intent);
            }
            });

        btn_gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uriUrl = Uri.parse("https://mail.google.com");
                Intent browse_intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(browse_intent);
            }
        });

        btn_twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.twitter.com/");
                Intent browse_intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(browse_intent);
            }
        });
    }
}
