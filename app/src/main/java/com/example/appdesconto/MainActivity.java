package com.example.appdesconto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editNome;
    private EditText editPorcentagem;
    private EditText editValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = (EditText) findViewById(R.id.editText);
        editPorcentagem = (EditText) findViewById(R.id.editText3);
        editValor = (EditText) findViewById(R.id.editText2);

    }
public void ativarToast(View view) {
        String primeiro = editValor.getText().toString();
        String segundo = editPorcentagem.getText().toString();
        int primeiroNumero = Integer.parseInt(primeiro);
        int segundoNumero = Integer.parseInt(segundo);
        int resultadoDoCalcular = primeiroNumero - (primeiroNumero * segundoNumero / 100);
    Toast.makeText(MainActivity.this, editNome.getText() + "! Total com desconto R$ " + resultadoDoCalcular, + Toast.LENGTH_LONG).show();
 }
}
