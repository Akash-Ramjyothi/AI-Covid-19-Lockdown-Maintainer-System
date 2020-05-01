package com.suvodeep.coronaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etText1;
    EditText etText2;
    Button btn,btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etText1 = findViewById(R.id.username);
        etText2 = findViewById(R.id.password);
        btn = findViewById(R.id.login);
        btn1 = findViewById(R.id.credits);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Check();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this,CredPage.class);
                startActivity(intent1);

            }
        });
    }
    public void Check(){
        if(etText1.getText().toString().equals("admin")&&
            etText2.getText().toString().equals("1234")) {
            Toast.makeText(this, "SUCCESS LOGIN", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,SecondPage.class);
            startActivity(intent);
        }
            else{
                Toast.makeText(this,"LOGIN FAILED",Toast.LENGTH_SHORT).show();

            }
        }
    }

