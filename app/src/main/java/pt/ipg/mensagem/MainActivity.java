package pt.ipg.mensagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void enviaMensagem(View view) {
        Intent intent = new Intent(this, MostraMensagemActivity.class);

        EditText txtMensagem = (EditText) findViewById(R.id.txtMensagem);


        String mensagem = txtMensagem.getText().toString();

        intent.putExtra("MENSAGEM",mensagem);

        //todo:enviar mensagem


        //Colocar mensagem aparecer na textview



        startActivity(intent);
    }
}
