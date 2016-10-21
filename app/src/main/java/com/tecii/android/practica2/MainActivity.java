package com.tecii.android.practica2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText txtCap;
    public EditText txtTasa;
    public EditText txtPeriod;
    public TextView txtCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txtCap = (EditText)findViewById(R.id.txtCap);
        this.txtTasa = (EditText)findViewById(R.id.txtTasa);
        this.txtPeriod = (EditText)findViewById(R.id.txtPeriod);
        this.txtCalc = (TextView)findViewById(R.id.txtCalc);
    }

    public void calcular (View view){
        String capital = txtCap.getText().toString();
        String tasa = txtTasa.getText().toString();
        String period = txtPeriod.getText().toString();
        double c = Double.parseDouble(capital);
        double t = Double.parseDouble(tasa);
        double p = Double.parseDouble(period);
        double monto =c*Math.pow((1+t/100),p);
        String resu="El monto total es: " + monto;
        txtCalc.setText(resu);
    }
}
