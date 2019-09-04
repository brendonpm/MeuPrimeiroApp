package br.senac.go.brendonmontalvao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class CronogramaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cronograma);

        Intent intent = getIntent();
        if(intent.hasExtra("teste")){
            Bundle extras = intent.getExtras();
            int argInt = extras.getInt("teste",-1);
            if(argInt == -1){
                throw new IllegalStateException("argumento n é inteiro");
            }

            TextView textToBold = findViewById(argInt);
            textToBold.setTypeface(textToBold.getTypeface(), Typeface.BOLD);
            //Toast.makeText(this,"Este pe o arg: " + arg, Toast.LENGTH_SHORT).show();
        }




    }
}
