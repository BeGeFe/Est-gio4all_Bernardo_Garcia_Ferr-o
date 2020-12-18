package com.bernardogarciaferrao19.formacaoandroidbernardogarciaferrao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.TextView;

import java.sql.Timestamp;

public class MainActivity extends AppCompatActivity {
View view;
TextView campoTexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

public void timestamp(View view){
    Timestamp  tempo_timestamp = new Timestamp(System.nanoTime());
    String tempo_string;
    char ultima_caractere;

    tempo_string = tempo_timestamp.toString();
    ultima_caractere = tempo_string.charAt ( tempo_string.length () -1);

    campoTexto = findViewById(R.id.campoTexto);
    view= findViewById(R.id.view);




if(ultima_caractere == '0'){
    view.setBackgroundResource(R.color.white);
    campoTexto.setTextColor(Color.parseColor("#000000")); //Enquanto a cor de fundo não é preto, o texto "4all" possui a cor preta, quando o fundo vira preto, ele muda para cor branca.
    }
else if(ultima_caractere == '1'){
    view.setBackgroundResource(R.color.black);
    campoTexto.setTextColor(Color.parseColor("#FFFFFF")); //Muda a cor da frase "4all" para branco, para poder ser visualizado no fundo preto.
    }
else if(ultima_caractere == '2'){
    view.setBackgroundResource(R.color.blue);
    campoTexto.setTextColor(Color.parseColor("#000000"));
}
else if(ultima_caractere == '3'){
    view.setBackgroundResource(R.color.green);
    campoTexto.setTextColor(Color.parseColor("#000000"));
}
else if(ultima_caractere == '4'){
    view.setBackgroundResource(R.color.pink);
    campoTexto.setTextColor(Color.parseColor("#000000"));
}
else if(ultima_caractere == '5'){
    view.setBackgroundResource(R.color.red);
    campoTexto.setTextColor(Color.parseColor("#000000"));
}
else if(ultima_caractere == '6'){
    view.setBackgroundResource(R.color.purple);
    campoTexto.setTextColor(Color.parseColor("#000000"));
}
else if(ultima_caractere == '7'){
    view.setBackgroundResource(R.color.yellow);
    campoTexto.setTextColor(Color.parseColor("#000000"));
}
else if(ultima_caractere == '8'){
    view.setBackgroundResource(R.color.gray);
    campoTexto.setTextColor(Color.parseColor("#000000"));
}
else if(ultima_caractere == '9'){
    view.setBackgroundResource(R.color.lilac);
    campoTexto.setTextColor(Color.parseColor("#000000"));
}
}
}

