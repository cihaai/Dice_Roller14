package com.example.dice_roller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private String currentqtyText;
    private TextView selectedDieTV;
    private TextView qtyTV;
    private TextView rollsTV;
    private TextView TotalTV;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.selectedDieTV = this.findViewById(R.id.SelectedDieTV);
        this.qtyTV = this.findViewById(R.id.qtyTV);
        this.qtyTV.setText("");
        this.currentqtyText = "";
        this.rollsTV = this.findViewById(R.id.RollsTV);
        this.rollsTV.setText("");
        this.TotalTV = this.findViewById(R.id.TotalTV);
        this.TotalTV.setText("");
        this.selectedDieTV.setText("");

    }

    public void onRollButtonPressed(View v)
    {
        String qtyString = this.qtyTV.getText().toString();
        String fullDiceString = this.selectedDieTV.getText().toString();
        String errorMsg = "";
        if(qtyString.length() == 0)
        {
            errorMsg = "You must enter a quantity before rolling.";
        }
        else if(fullDiceString.length()==0)
        {
            errorMsg = "You must select a Die before rolling.";
        }

        if (errorMsg.length() >0)
        {
            Toast t = Toast.makeText(this, errorMsg, Toast.LENGTH_LONG);
            t.show();
            return;
        }

        int qtyInt = Integer.parseInt(qtyString);
        int[] theRolls = new int[qtyInt];


        String trimmedDiceString = this.exactNumberOfSides(fullDiceString);
        int numberOfSidesInt = Integer.parseInt(trimmedDiceString);
        Random r = new Random();

        int total = 0;
        String individualRolls = "";
        for(int i = 0; i < qtyInt; i++)
        {
            theRolls [i] = r.nextInt(numberOfSidesInt)+1;
            this.rollsTV.setText(theRolls[i]);
            total = total + theRolls[i];

            if(individualRolls.length() == 0)
            {
                individualRolls = "" + theRolls[i];
            }
            else
            {
                individualRolls = individualRolls + " + " + theRolls[i];
            }
            this.rollsTV.setText(individualRolls);
            this.TotalTV.setText("" + total);
        }







        //qtyInt * new Random(numberOfSidesInt) = new int[View v];

        //this.RollsTV.setText(v.getTag().toString());

    }

    private String exactNumberOfSides(String dicetype)
    {
        String answer = "";
        for(int i = 1; i < dicetype.length(); i++)
        {
            answer += dicetype.charAt(i);
        }
        return answer;
    }
    public void diceButtonPressed(View v)
    {
        this.selectedDieTV.setText(v.getTag().toString());

    }

    public void clearButtonPressed(View v)
    {
        this.currentqtyText = "";
        this.qtyTV.setText(this.currentqtyText);
    }
    public void qtyButtonPressed(View v)
    {
        Button b = (Button)v;

        if(this.currentqtyText.length() == 0 && b.getText().equals("0"))
        {
            return;
        }
        this.currentqtyText += b.getText();
        this.qtyTV.setText(this.currentqtyText);

    }


}

