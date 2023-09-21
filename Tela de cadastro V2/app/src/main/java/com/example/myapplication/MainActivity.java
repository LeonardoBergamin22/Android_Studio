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

        EditText edt_nome=(EditText) findViewById(R.id.edt_nome);
        EditText edt_sobrenome=(EditText) findViewById(R.id.edt_sobrenome);
        EditText edt_fone=(EditText) findViewById(R.id.edt_fone);
        EditText edt_endereco=(EditText) findViewById(R.id.edt_endereco);

        Button btn_cadastro =(Button) findViewById(R.id.btn_cadrastro);
        Button btn_confirmar =(Button) findViewById(R.id.btn_confirmar);

        TextView txtV_nome =( TextView) findViewById(R.id.txtV_nome);
        TextView txtV_sobrenome =( TextView) findViewById(R.id.txtV_sobrenome);
        TextView txtV_fone =( TextView) findViewById(R.id.txtV_fone);
        TextView txtV_endereco =( TextView) findViewById(R.id.txtV_endereco);

        btn_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtV_nome.setText(edt_nome.getText());
                txtV_sobrenome.setText(edt_sobrenome.getText());
                txtV_fone.setText(edt_fone.getText());
                txtV_endereco.setText(edt_endereco.getText());

                btn_confirmar.setVisibility(View.VISIBLE);
            }
        });
    }
}