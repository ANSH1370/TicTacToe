package com.anshroid.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstPage extends AppCompatActivity {
    Button btnStart;
    TextView t1,t2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        btnStart = findViewById(R.id.Start);
        Intent formUser = getIntent();
        String User1 = formUser.getStringExtra(UserName.EXTRA_1);
        String User2 = formUser.getStringExtra(UserName.EXTRA_2);
        System.out.println(User2+" "+User1);

        t1 = findViewById(R.id.U1);
        t2 = findViewById(R.id.U2);

        t1.setText(User1+" :- X");
        t2.setText(User2+" :- O");
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNext = new Intent(FirstPage.this,MainActivity.class);
                iNext.putExtra("name1",User1);
                iNext.putExtra("name2",User2);
                startActivity(iNext);
            }
        });


    }
}