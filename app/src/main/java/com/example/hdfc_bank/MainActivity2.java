package com.example.hdfc_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
private Button Create,Deposit,Withdraw,detals;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Create=findViewById(R.id.create);
        Deposit=findViewById(R.id.deposit);
        Withdraw=findViewById(R.id.withdraw);
        detals=findViewById(R.id.details);
        Create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,Create_account.class);
                startActivity(intent);
            }
        });
        Deposit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,Deposit_money.class);
                startActivity(intent);
            }
        });
        Withdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,Withdraw_amount.class);
                startActivity(intent);
            }
        });
        detals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,Transaction_details.class);
                startActivity(intent);
            }
        });
    }
}