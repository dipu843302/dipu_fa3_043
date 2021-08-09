package com.example.hdfc_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Create_account extends AppCompatActivity {
private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        submit=findViewById(R.id.creat_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Create_account.this,MainActivity2.class);
                Toast.makeText(getApplicationContext(),"Account has created",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}