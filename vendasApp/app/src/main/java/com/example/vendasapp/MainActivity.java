package com.example.vendasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double vsufite,vlapis,vborracha,vcaneta, vtotal;

    CheckBox cb_sufite, cb_lapis, cb_borracha, cb_caneta;
    EditText edt_sufite, edt_lapis, edt_borracha, edt_caneta;
    TextView txtV_res;
    Button btn_calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb_sufite = (CheckBox) findViewById(R.id.cb_sufite);
        cb_lapis = (CheckBox) findViewById(R.id.cb_lapis);
        cb_borracha = (CheckBox) findViewById(R.id.cb_borracha);
        cb_caneta = (CheckBox) findViewById(R.id.cb_caneta);

        edt_sufite = (EditText) findViewById(R.id.edt_sufite);
        edt_lapis = (EditText) findViewById(R.id.edt_lapis);
        edt_borracha = (EditText) findViewById(R.id.edt_borracha);
        edt_caneta = (EditText) findViewById(R.id.edt_caneta);

        btn_calcular = (Button)findViewById(R.id.btn_calcular);

        txtV_res = (TextView) findViewById(R.id.txtV_res);

        vsufite=0.15;
        vlapis = 1.20;
        vborracha = 1.15;
        vcaneta = 2.10;

        cb_sufite.setText(cb_sufite.getText().toString() + vsufite);
        cb_lapis.setText(cb_lapis.getText().toString() + vlapis);
        cb_borracha.setText(cb_borracha.getText().toString() + vborracha);
        cb_caneta.setText(cb_caneta.getText().toString() + vcaneta);
    }

    public void somar(View v){
        vtotal=0;

        if(cb_sufite.isChecked()){
            vtotal+= vsufite * Double.parseDouble(edt_sufite.getText().toString());
        }
        if(cb_lapis.isChecked()){
            vtotal += vlapis * Double.parseDouble(edt_lapis.getText().toString());
        }
        if(cb_borracha.isChecked()){
            vtotal += vborracha * Double.parseDouble(edt_borracha.getText().toString());
        }
        if(cb_caneta.isChecked()){
            vtotal += vcaneta * Double.parseDouble(edt_caneta.getText().toString());
        }
        txtV_res.setText("Valor total: R$" + vtotal);


        /*
        AlertDialog.Builder cxMsg = new AlertDialog.Builder(this);
        cxMsg.setMessage("Alerta de Invasão!");
        cxMsg.setNeutralButton("OK",null);
        cxMsg.show();

        Toast.makeText(this,"Alerta",Toast.LENGTH_LONG).show();
        */


    }

}