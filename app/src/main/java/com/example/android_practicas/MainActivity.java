package com.example.android_practicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double result, op1, op2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etSaludo = findViewById(R.id.etSaludo);
        EditText etSaludo2 = findViewById(R.id.etSaludo2);

        TextView operador=findViewById(R.id.txtOperador);
        TextView resultTxt=findViewById(R.id.txtResultado);

        Button btnCalculo=findViewById(R.id.btnCalculo);
        Button suma = findViewById(R.id.btnSuma);
        Button resta = findViewById(R.id.btnResta);
        Button multiplicar=findViewById(R.id.btnMultiplicar);
        Button dividir=findViewById(R.id.btnDividir);

        suma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                op1=Double.parseDouble(etSaludo.getText().toString());
                op2=Double.parseDouble(etSaludo2.getText().toString());
                operador.setText("+");
                result=SumarText(op1, op2);
            }
        });

        resta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                op1=Double.parseDouble(etSaludo.getText().toString());
                op2=Double.parseDouble(etSaludo2.getText().toString());
                operador.setText("-");
                result=RestarText(op1, op2);
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                op1=Double.parseDouble(etSaludo.getText().toString());
                op2=Double.parseDouble(etSaludo2.getText().toString());
                operador.setText("*");
                result=MultiplicarText(op1, op2);
            }
        });

        dividir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                op1=Double.parseDouble(etSaludo.getText().toString());
                op2=Double.parseDouble(etSaludo2.getText().toString());
                operador.setText("/");
                result=DividirText(op1, op2);
            }
        });

        btnCalculo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                resultTxt.setText(String.valueOf(result));
            }
        });
    }

    public double SumarText(double a, double b){
        return a+b;
    }
    public double RestarText(double a, double b){
        return a-b;
    }
    public double MultiplicarText(double a, double b){
        return a*b;
    }
    public double DividirText(double a, double b){
        return a/b;
    }
}