package com.example.hdfc_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
private Button Create,Deposit,Withdraw,Transfer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Create=findViewById(R.id.create);
        Deposit=findViewById(R.id.deposit);
        Withdraw=findViewById(R.id.withdraw);
        Transfer=findViewById(R.id.transaction);
        Create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,Create_account.class);
                startActivity(intent);
            }
        });
    }
}