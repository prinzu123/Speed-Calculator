package com.example.speedcomparecalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    EditText  etnumber1, etnumber;
    String  strnumber1, strnumber, resultMessage;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculatorlayout);

        Button btnCompute = (Button) findViewById(R.id.btnCompute);

        btnCompute.setOnClickListener(this);

    }

    public void onClick(View v){
        Toast.makeText(this, "Calculating Speed...", Toast.LENGTH_SHORT).show();
        ComputeResult();
    }

    public void ComputeResult(){
        etnumber = (EditText) findViewById(R.id.etNumber);
        etnumber1 = (EditText) findViewById(R.id.etnumber1);
        if(etnumber.getText().toString().isEmpty() || etnumber1.getText().toString().isEmpty()){
            strnumber = "0";
            strnumber1 = "0";
        }
        else{
            strnumber = etnumber.getText().toString();
            strnumber1 = etnumber1.getText().toString();

        }
        int rawNumber =  Integer.parseInt(strnumber);
        int rawNumber1 = Integer.parseInt(strnumber1);


        float result =  (float) rawNumber / (float) rawNumber1;

        switch((int) result){
            case 10:
                result = 10;
                break;
            case 30:
                result = 30;
                break;
            case 50:
                result = 50;
                break;
            case 80:
                result = 80;
                break;
            case 100:
                result = 100;
                break;
            case 125:
                result = 125;
                break;
            case 150:
                result = 150;
                break;
            case 180:
                result = 170;
                break;
            case 200:
                result = 200;
                break;
            case 261:
                result = 261;
                break;
            case 372:
                result = 372;
                break;
            case 400:
                result = 400;
                break;
            case 550:
                result = 550;
                break;
            case 750:
                result = 750;
                break;
            case 900:
                result = 900;
                break;
            case 1235:
                result = 1235;
                break;
            case 2469:
                result = 2469;
                break;
            case 3000:
                result = 3000;
                break;
            case 4000:
                result = 4000;
                break;
            case 8273:
                result = 8273;
                break;
            case 12000:
                result = 12000;
                break;
            case 27700:
                result = 27700;
                break;
            case 39900:
                result = 39900;
                break;
            case 61000:
                result = 61000;
                break;
            case 107000:
                result = 107000;
                break;
            case 252000:
                result = 252000;
                break;
            case 700000:
                result = 700000;
                break;
            case 1600000:
                result = 1600000;
                break;
            case 2000000:
                result = 2000000;
                break;
            case 1079252849:
                result = 1079252849;
                break;
        }



        Intent intent;

        if(result <= 10) {
            intent = new Intent(Calculator.this, speed1.class);
        }
        else if (result <= 30) {
            intent = new Intent(Calculator.this, speed2.class);
        }
        else if (result <= 50) {
            intent = new Intent(Calculator.this, speed3.class);
        }
        else if (result <= 80) {
            intent = new Intent(Calculator.this, speed4.class);
        }
        else if (result <= 100) {
            intent = new Intent(Calculator.this, speed5.class);
        }
        else if (result <= 125) {
            intent = new Intent(Calculator.this, speed6.class);
        }
        else if (result <= 150) {
            intent = new Intent(Calculator.this, speed7.class);
        }
        else if (result <= 170) {
            intent = new Intent(Calculator.this, speed8.class);
        }
        else if (result <= 200) {
            intent = new Intent(Calculator.this, speed9.class);
        }
        else if (result <= 261) {
            intent = new Intent(Calculator.this, speed10.class);
        }
        else if (result <= 372) {
            intent = new Intent(Calculator.this, speed11.class);
        }
        else if (result <= 400) {
            intent = new Intent(Calculator.this, speed12.class);
        }
        else if (result <= 550) {
            intent = new Intent(Calculator.this, speed13.class);
        }
        else if (result <= 750) {
            intent = new Intent(Calculator.this, speed14.class);
        }
        else if (result <= 900) {
            intent = new Intent(Calculator.this, speed15.class);
        }
        else if (result <= 1235) {
            intent = new Intent(Calculator.this, speed16.class);
        }
        else if (result <= 2469) {
            intent = new Intent(Calculator.this, speed17.class);
        }
        else if (result <= 3000) {
            intent = new Intent(Calculator.this, speed18.class);
        }
        else if (result <= 4000) {
            intent = new Intent(Calculator.this, speed19.class);
        }
        else if (result <= 8273) {
            intent = new Intent(Calculator.this, speed20.class);
        }
        else if (result <= 12000) {
            intent = new Intent(Calculator.this, speed21.class);
        }
        else if (result <= 27700) {
            intent = new Intent(Calculator.this, speed22.class);
        }
        else if (result <= 39900) {
            intent = new Intent(Calculator.this, speed23.class);
        }
        else if (result <= 61000) {
            intent = new Intent(Calculator.this, speed24.class);
        }
        else if (result <= 107000) {
            intent = new Intent(Calculator.this, speed25.class);
        }
        else if (result <= 252000) {
            intent = new Intent(Calculator.this, speed26.class);
        }
        else if (result <= 700000) {
            intent = new Intent(Calculator.this, speed27.class);
        }
        else if (result <= 1600000) {
            intent = new Intent(Calculator.this, speed28.class);
        }
        else if (result <= 2000000) {
            intent = new Intent(Calculator.this, speed29.class);
        }
        else if (result <= 1079252849) {
            intent = new Intent(Calculator.this, speed30.class);
        }

        else {
            intent = new Intent(Calculator.this, Calculator.class);
        }

        resultMessage = (int) result + "Km/h" + " is your cruising speed ";

        Bundle args = new Bundle();
        args.putString("result", resultMessage);

        intent.putExtras(args);
        startActivity(intent);
        clearEditText();


    }

    public void clearEditText(){
        etnumber.getText().clear();
        etnumber1.getText().clear();
        etnumber.requestFocus();
    }

}
