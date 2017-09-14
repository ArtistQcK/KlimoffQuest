package com.example.artist.klimoffquest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mInfoTextView;
    TextView mResultEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       mInfoTextView = (TextView)findViewById(R.id.mInfoTextView);
        mResultEditText = (TextView)findViewById(R.id.mResultEditText);

    }


    public void onClick(View view) {


        byte x = 64;
        byte y;
        int i;

        i = x << 2; // сдвиг влево
        y = (byte) (x << 2); // сдвиг влево с приведением


        mInfoTextView.append("i равно: " + i + "\n");
        mInfoTextView.append("y равно: " + y);
    }
    private void TestUpLoad(){
        int b = 3+3;
        int c = 1+1;
        int g = 1+1;
        int q = 1+1;

        String test = "test";

        boolean True = false;
    }
}
