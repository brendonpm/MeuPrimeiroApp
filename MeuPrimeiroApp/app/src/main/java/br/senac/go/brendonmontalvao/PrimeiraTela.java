package br.senac.go.brendonmontalvao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class PrimeiraTela extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_tela);



    }

    public void tela2(View view){

        Intent intent = new Intent(this, CronogramaActivity.class);

        intent.putExtra("teste",R.id.textView4);

        startActivity(intent);

    }
}
