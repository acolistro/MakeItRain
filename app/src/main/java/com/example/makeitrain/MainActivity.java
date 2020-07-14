package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

//    private Button showMoney;
//    private Button showTag;

    private TextView moneyText;
    private int moneyCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moneyText = findViewById(R.id.money_text);
//        showMoney = findViewById(R.id.make_rain);
//        showTag = findViewById(R.id.show_tag);

//        showMoney.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d("MYTAG", "onClick: SHOW MONEY");
//            }
//        });
    }

    public void showTag(View view) {
        Log.d("MYTAG", "onClick: SHOW TAG");
    }

    public void makeItRain(View view) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        moneyCounter += 1000;
        moneyText.setText(numberFormat.format(moneyCounter));

        Log.d("MIR", "makeItRain: Tapped " + moneyCounter);
    }
}