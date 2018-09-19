package com.example.george.listacustomtime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] time = {
            "AtleticoPR\n"+ "ahudhuahudad",
            "Palmeiras",
            "Coritiba"
    };

    String[] cidade ={
            "Curitiba-PR",
            "Sao paulo-SP",
            "Curitiba-PR",
    };

    Integer[] imageId = {
            R.drawable.atletico,
            R.drawable.palmeiras,
            R.drawable.coritiba,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListCell adapter = new ListCell(MainActivity.this, time, cidade, imageId);
        list = (ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3){
                Intent it = new Intent(MainActivity.this,AtividadeDetalhe.class);
                it.putExtra("timeId", arg2);
                startActivity(it);
                Toast.makeText(MainActivity.this, "Clicou na " +time[+ arg2], Toast.LENGTH_SHORT).show();
            }
        });

    }
}
