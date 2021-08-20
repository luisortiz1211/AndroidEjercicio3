package com.example.ejercicio3;

import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText valor1text, valor2text;
    TextView restext;
    Button calcularButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1text=(EditText) findViewById(R.id.valor1Text);
        valor2text=(EditText) findViewById(R.id.valor2Text);
        restext=(TextView) findViewById(R.id.resText);
        calcularButton=(Button) findViewById(R.id.calcularButton);
        calcularButton.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View v){
        double valor1=Double.parseDouble(valor1text.getText().toString());
        double valor2=Double.parseDouble(valor2text.getText().toString());
        double res=valor1+valor2;
       restext.setText(""+res);

    }

}