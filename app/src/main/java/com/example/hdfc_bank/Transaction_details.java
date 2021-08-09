package com.example.hdfc_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Transaction_details extends AppCompatActivity {
private TextView myname,myaccount,mybalance;
private Button back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_details);
        myname=findViewById(R.id.dipu);
        myaccount=findViewById(R.id.oneTh);
        mybalance=findViewById(R.id.balance1);
        myname.setText(getIntent().getStringExtra("name1"));
        myaccount.setText(getIntent().getStringExtra("accountNo"));
        mybalance.setText(getIntent().getStringExtra("balanceT"));
//        back1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(Transaction_details.this,MainActivity2.class);
//                startActivity(intent);
//            }
//        });
    }
}