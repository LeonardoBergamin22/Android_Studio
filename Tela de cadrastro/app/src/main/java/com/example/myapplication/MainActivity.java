package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_cadrastrar=(Button)findViewById(R.id.btn_cadrastar);

        TextView nomeview=(TextView)findViewById(R.id.nomeview);
        TextView sobrenomeview=(TextView)findViewById(R.id.sobrenomeview);
        TextView enderecoview=(TextView)findViewById(R.id.enderecoview);
        TextView telefoneview=(TextView) findViewById(R.id.telefoneview);


        EditText nomecadratro=(EditText)findViewById(R.id.nomecadrastro);
        EditText sobrenomecadrastro=(EditText)findViewById(R.id.sobrenomecadrastro);
        EditText enderecocadratro=(EditText)findViewById(R.id.enderecocadrastro);
        EditText telefonecadrastro=(EditText)findViewById(R.id.telefonecadrastro);

        btn_cadrastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nomeview.setText(nomecadratro.getText());
                sobrenomeview.setText(sobrenomecadrastro.getText());
                enderecoview.setText(enderecocadratro.getText());
                telefoneview.setText(telefonecadrastro.getText());
            }
        });
    }
}