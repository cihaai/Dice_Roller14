package com.example.dice_roller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button B0;
    private Button B1;
    private Button B2;
    private Button B3;
    private Button B4;
    private Button B5;
    private Button B6;
    private Button B7;
    private Button B8;
    private Button B9;
    private TextView qtyTV;


    public void onCreate()
    {
        setContentView(R.layout.activity_main);

        this.B0 = this.findViewById(R.id.B0);
        this.B1 = this.findViewById(R.id.B1);
        this.B2 = this.findViewById(R.id.B2);
        this.B3 = this.findViewById(R.id.B3);
        this.B4 = this.findViewById(R.id.B4);
        this.B5 = this.findViewById(R.id.B5);
        this.B6 = this.findViewById(R.id.B6);
        this.B7 = this.findViewById(R.id.B7);
        this.B8 = this.findViewById(R.id.B8);
        this.B9 = this.findViewById(R.id.B9)     ;
        this.qtyTV = this.findViewById(R.id.qtyTV);

    }

    public void qtyButtonPressed(View v)
    {
        if(v == this.B0)
        {
            this.qtyTV.setText("0");
        }
        if(v == this.B1)
        {
        this.qtyTV.setText("1");
        }
        if(v == this.B2)
        {
        this.qtyTV.setText("2");
        }
        if(v == this.B3)
        {
        this.qtyTV.setText("3");
        }
        if(v == this.B4)
        {
        this.qtyTV.setText("4");
        }
        if(v == this.B5)
        {
        this.qtyTV.setText("5");
        }
        if(v == this.B6)
        {
        this.qtyTV.setText("7");
        }
        if(v == this.B8)
        {
        this.qtyTV.setText("8");
        }
        if(v == this.B9)
        {
        this.qtyTV.setText("9");
        }

    }


}

