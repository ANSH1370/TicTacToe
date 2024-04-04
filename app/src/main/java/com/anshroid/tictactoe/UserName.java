package com.anshroid.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.*;

public class UserName extends AppCompatActivity {

    public static final String EXTRA_1 = "U1";
    public static final String EXTRA_2 = "U2";
    Button btnNext;
    EditText Use1,Use2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_name);
        btnNext = findViewById(R.id.next);
        Use1 = findViewById(R.id.User1);
        Use2 = findViewById(R.id.User2);
        Intent iNext = new Intent(UserName.this,FirstPage.class);


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String u1 = Use1.getText().toString();
                String u2 = Use2.getText().toString();


                iNext.putExtra(EXTRA_1,u1);
                iNext.putExtra(EXTRA_2,u2);
                startActivity(iNext);
            }
        });


    }

}