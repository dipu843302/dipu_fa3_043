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
private EditText name,amount,number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        submit=findViewById(R.id.creat_submit);
        name=findViewById(R.id.name);
        amount=findViewById(R.id.amount);
        number=findViewById(R.id.number);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1=name.getText().toString();
                String amount1=amount.getText().toString();
                String number1=number.getText().toString();
                Intent intent=new Intent(Create_account.this,MainActivity2.class);
                intent.putExtra("name",name1);
                intent.putExtra("number",number1);
                intent.putExtra("amount",amount1);
                Toast.makeText(getApplicationContext(),"Account has created",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}