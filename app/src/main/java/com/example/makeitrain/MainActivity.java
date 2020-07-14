package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

//    private Button showMoney;
//    private Button showTag;

    private TextView moneyText;
    private int moneyCounter = 0;
    private Button newButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 //       setContentView(R.layout.activity_main);
        moneyText = findViewById(R.id.money_text);
        setContentView(R.layout.another_layout);

        newButton = findViewById(R.id.button);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Log.d("NewButton", "onClick: HOLA");

            }
        });
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
        Toast.makeText(getApplicationContext(), R.string.app_name, Toast.LENGTH_SHORT)
                .show();

//        Log.d("MYTAG", "onClick: SHOW TAG");
    }

    public void makeItRain(View view) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        moneyCounter += 1000;
        moneyText.setText(numberFormat.format(moneyCounter));

//        if (moneyCounter >= 10000) {
//            moneyText.setTextColor(getResources().getColor(R.color.myColor));
//            Toast.makeText(getApplicationContext(), "WHOA YOU'RE RICH!!", Toast.LENGTH_SHORT)
//                    .show();
//        }

        switch (moneyCounter) {
            case 5000 :
                moneyText.setTextColor(Color.BLACK);
                break;
            case 6000 :
                moneyText.setTextColor(Color.CYAN);
                break;
            case 9000 :
                moneyText.setTextColor(Color.MAGENTA);
                break;
            case 10000 :
                moneyText.setTextColor(getResources().getColor(R.color.myColor));
                Toast.makeText(getApplicationContext(), "WHOA YOU'RE RICH!!", Toast.LENGTH_SHORT)
                      .show();
            default:
                break;
        }

//        Log.d("MIR", "makeItRain: Tapped " + moneyCounter);
    }
}