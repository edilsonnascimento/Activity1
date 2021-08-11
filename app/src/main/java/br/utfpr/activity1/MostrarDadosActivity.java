package br.utfpr.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MostrarDadosActivity extends AppCompatActivity {

    public static final String FRASE = "FRASE";
    private EditText editTextFrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_dados);

        setTitle(R.string.titulo_mostrar_frase);
        editTextFrase = findViewById(R.id.textParametroRecebido);

        //Recupera o intent do Activiyt
        Intent intent = getIntent();

        //Valores do intent
        Bundle bundle = intent.getExtras();
        if(bundle != null) {
            String frase = bundle.getString(FRASE);
            editTextFrase.setText(frase);
        }

    }

    public void voltar(View view){
        finish();
    }
}