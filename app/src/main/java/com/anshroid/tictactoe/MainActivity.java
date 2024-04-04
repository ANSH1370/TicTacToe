package com.anshroid.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.lang.UCharacter;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, restart;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    String user1,user2;
    TextView txt;
    int flag = 0, count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findIds();

        Intent fromFirstPage = getIntent();

        user1 = fromFirstPage.getStringExtra("name1");
        user2 = fromFirstPage.getStringExtra("name2");
        indicateName(user1);
    }

    private void findIds() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        restart = findViewById(R.id.res);
        txt = findViewById(R.id.name);

    }
    public void indicateName(String str){

        txt.setText(str+"'s Turn");
    }

    public void check(View v) {
        Button btnCurrent = (Button) v;
        count++;
        if (btnCurrent.getText().equals("")) {
            if (flag == 0) {

                btnCurrent.setText("X");
                indicateName(user2);
                flag = 1;
            } else {

                btnCurrent.setText("O");
                indicateName(user1);
                flag = 0;
            }

            if (count >= 5 && count != 9) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is : " + b1, Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            newGame();
                        }
                    },3000);

                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    Toast.makeText(this, "Winner is : " + b4, Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            newGame();
                        }
                    },3000);
                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    Toast.makeText(this, "Winner is : " + b7, Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            newGame();
                        }
                    },3000);
                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is : " + b1, Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            newGame();
                        }
                    },3000);
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    Toast.makeText(this, "Winner is : " + b2, Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            newGame();
                        }
                    },3000);
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    Toast.makeText(this, "Winner is : " + b3, Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            newGame();
                        }
                    },3000);
                } else if (b1.equals(b5) && b5.equals(b9) && !b9.equals("")) {
                    Toast.makeText(this, "Winner is : " + b1, Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            newGame();
                        }
                    },3000);
                } else if (b3.equals(b5) && b5.equals(b7) && !b7.equals("")) {
                    Toast.makeText(this, "Winner is : " + b3, Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            newGame();
                        }
                    },3000);
                }
            }
            if (count == 9) {
                Toast.makeText(this, "Match Draw", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void newGame() {
        count = 0;
        flag = 0;
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
    }

    public void draw(View v) {
        Toast.makeText(this, "Restarting..", Toast.LENGTH_SHORT).show();
        count = 0;
        flag = 0;
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
    }
    public void exit(View v){
        finishAffinity();
    }
}