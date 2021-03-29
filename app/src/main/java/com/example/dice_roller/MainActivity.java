package com.example.dice_roller;

public class MainActivity : AppCompatActivity
        {
            @override
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
        }

    protected void onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.B0 = this.findViewById(R.id.B0)
        this.qtyTV = this.findViewById(R.id.qtyTV)

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

