package br.senac.go.brendonmontalvao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PrimeiraTela extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_tela);


    }

    @Override
    protected void onStart() {
        super.onStart();

        findViewById(R.id.editText).setEnabled(true);


    }

    public void tela2(View view){


        Intent intent = new Intent(this, CronogramaActivity.class);

        intent.putExtra("teste",R.id.textView4);

        EditText text = findViewById(R.id.editText);
        Toast.makeText(this, text.getText(), Toast.LENGTH_SHORT).show();


        startActivity(intent);

    }
    public void telaSobre(View view){

        Intent intent = new Intent(this, SobreActivity.class);

        intent.putExtra("teste",R.id.textView4);

        EditText text = findViewById(R.id.editText);

        text.setText("blablabla");

        findViewById(R.id.editText).setEnabled(false);

        startActivity(intent);

    }
}
