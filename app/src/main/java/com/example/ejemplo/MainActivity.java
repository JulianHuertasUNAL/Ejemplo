package com.example.ejemplo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Atributos de tipo EditText y TextView
    private EditText recibirValor1;
    private EditText recibirValor2;
    private TextView mostrarSuma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Conexión entre la parte gráfica y la lógica
        recibirValor1 = (EditText)findViewById(R.id.numero_1);
        recibirValor2 = (EditText)findViewById(R.id.numero_2);
        mostrarSuma = (TextView)findViewById(R.id.resultado);
    }

    //Método para sumar
    public void Sumar(View view){
        int num1 = Integer.parseInt(recibirValor1.getText().toString());
        int num2 = Integer.parseInt(recibirValor2.getText().toString());

        int suma = num1 + num2;

        String result = Integer.toString(suma);
        mostrarSuma.setText(result);
    }
}

