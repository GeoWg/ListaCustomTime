package com.example.george.listacustomtime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class AtividadeDetalhe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade_detalhe);

        int timeId = 4;
        Intent it = getIntent();

        String[] time = new String[]{"AtleticoPR", "Palmeiras", "Coritiba"};

        String[] cidade = new String[]{"Curitiba", "São Paulo", "Curitiba"};

        String[] estado = new String[]{"PR", "SP", "PR"};

        String[] titulo = new String[]{"1", "3", "1"};

        EditText timeNome = (EditText)findViewById(R.id.etTime);
        EditText ecidade = (EditText)findViewById(R.id.etCidade);
        EditText eestado = (EditText)findViewById(R.id.etEstado);
        EditText etitulo = (EditText)findViewById(R.id.etTitulo);
        if(it != null){
            timeId = it.getIntExtra("timeId", 4);
        }
        if (timeId == 4) {
            timeNome.setText("");
            ecidade.setText("");
            eestado.setText("");
            etitulo.setText("");
            Toast.makeText(this, "Drink não encontrado", Toast.LENGTH_SHORT).show();
        } else {
            timeNome.setText(time[timeId]);
            ecidade.setText(cidade[timeId]);
            eestado.setText(estado[timeId]);
            etitulo.setText(titulo[timeId]);
        }
    }
}
