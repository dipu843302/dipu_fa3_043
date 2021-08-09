package com.example.hdfc_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Withdraw_amount extends AppCompatActivity {
private Button deduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdraw_amount);
        deduct=findViewById(R.id.deduct);
        deduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Withdraw_amount.this,MainActivity2.class);
                Toast.makeText(getApplicationContext(),"Amount Withdraw Successfully",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}