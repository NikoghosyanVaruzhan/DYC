package com.example.dyc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button loginbutton, singupbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        singupbutton=(Button) findViewById(R.id.singupbutton);
        singupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensingup();
            }
        });
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        loginbutton=findViewById(R.id.loginbutton);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    openhomepage();
            }
        });
    }
    public void openhomepage(){
        Intent intent1;
        intent1 = new Intent(this, HomepPage.class);
        startActivity(intent1);
    }
    public void opensingup(){
        Intent intent=new Intent(this, SingUp.class);
        startActivity(intent);
    }
}