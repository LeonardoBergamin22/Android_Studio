package com.example.calcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double n1, n2, res;

    EditText edt_n1 = (EditText) findViewById(R.id.edt_n1);
    EditText edt_n2 = (EditText) findViewById(R.id.edt_n2);

    Button btn_somar = (Button) findViewById(R.id.btn_somar);
    Button btn_subtrair = (Button) findViewById(R.id.btn_subtrair);
    Button btn_multiplicar = (Button) findViewById(R.id.btn_multiplicar);
    Button btn_dividir = (Button) findViewById(R.id.btn_multiplicar);


    TextView txtV_res = (TextView) findViewById(R.id.txtV_res);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView txtV_res = (TextView) findViewById(R.id.txtV_res);


       /* btn_somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1= Double.parseDouble(edt_n1.getText().toString());
                n2= Double.parseDouble(edt_n2.getText().toString());
                res= n1+n2;
                txtV_res.setText(String.valueOf(res));
            }
        });

        btn_subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1= Double.parseDouble(edt_n1.getText().toString());
                n2= Double.parseDouble(edt_n2.getText().toString());
                res= n1-n2;
                txtV_res.setText(String.valueOf(res));
            }
        });
        btn_subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1= Double.parseDouble(edt_n1.getText().toString());
                n2= Double.parseDouble(edt_n2.getText().toString());
                res= n1-n2;
                txtV_res.setText(String.valueOf(res));

            }
});

        btn_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1= Double.parseDouble(edt_n1.getText().toString());
                n2= Double.parseDouble(edt_n2.getText().toString());
                res= n1*n2;
                txtV_res.setText(String.valueOf(res));

            }
        });
        btn_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1= Double.parseDouble(edt_n1.getText().toString());
                n2= Double.parseDouble(edt_n2.getText().toString());
                res= n1/n2;
                txtV_res.setText(String.valueOf(res));

            }
//        });*/

    }

    public void soma(View view) {
        n1 = Double.parseDouble(edt_n1.getText().toString());
        n2 = Double.parseDouble(edt_n2.getText().toString());
        res = n1 + n2;
        txtV_res.setText(String.valueOf(res));
    }

    public void subtrair(View view) {
        n1 = Double.parseDouble(edt_n1.getText().toString());
        n2 = Double.parseDouble(edt_n2.getText().toString());
        res = n1 - n2;
        txtV_res.setText(String.valueOf(res));
    }
    public void dividir(View view) {
        n1 = Double.parseDouble(edt_n1.getText().toString());
        n2 = Double.parseDouble(edt_n2.getText().toString());
        res = n1 / n2;
        txtV_res.setText(String.valueOf(res));
    }
    public void multiplicar(View view) {
        n1 = Double.parseDouble(edt_n1.getText().toString());
        n2 = Double.parseDouble(edt_n2.getText().toString());
        res = n1 * n2;
        txtV_res.setText(String.valueOf(res));
    }
}