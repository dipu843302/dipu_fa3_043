package com.example.hdfc_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Create_account extends AppCompatActivity {
private Button submit;
private EditText name,AccountNo,BalanceT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        submit=findViewById(R.id.creat_submit);
        name=findViewById(R.id.name);
        AccountNo=findViewById(R.id.AccountNumber);
        BalanceT=findViewById(R.id.initialAmount);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1=name.getText().toString();
                String balanceT=BalanceT.getText().toString();
                String accountNo=AccountNo.getText().toString();
                Intent intent=new Intent(Create_account.this,Transaction_details.class);
                intent.putExtra("name1",name1);
                intent.putExtra("balanceT",balanceT);
                intent.putExtra("accountNo",accountNo);
                Toast.makeText(getApplicationContext(),"Account has created",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}