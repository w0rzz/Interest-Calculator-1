package com.example.interestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        findViewById(R.id.tv).setVisibility(View.INVISIBLE);
        
        EditText edtAmount, edtPeriod;
        Button bt;
        
        int period;
        double totalRepayment;
        double interestRate = 10;
    }
    
    edtAmount = findViewById(R.id.EditTv1);
    edtPeriod = findViewById(R.id.EditTv2);
    button = findViewById(R.id.bt);
    
    public void buttonClicked(View v)
    {
        calculateInterest();
        findViewById(R.id.tv).setText(totalRepayment.toString());
        findViewById(R.id.tv).setVisibility(View.VISIBLE);
    }

    public void calculateInterest()
    {
        months = Integer.parseInt(edtPeriod.getText()) * 12;

        double oprt = 1 + (interestRate * months);

    //    double monthlyTop = interestRate * pow((1 + interestRate), months);
    //    double monthlyBottom = pow(1 + interestRate, months) - 1;

        totalRepayment = Double.parseDouble(editAmount.getText()) * oprt;
   
    }
}

