package com.example.dyc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SingUp extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        button=(Button) findViewById(R.id.singupbutton1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openogin();
            }
        });
    }
    public void openogin(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
        Toast.makeText(SingUp.this, "SingUp Successful!", Toast.LENGTH_SHORT).show();
    }
}