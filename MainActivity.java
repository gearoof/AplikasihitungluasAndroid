package com.example.lenovo.dicodingapphitungluas;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtP, txtL;
    private Button btnhitung;
    private TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtP = (EditText)findViewById(R.id.txtP);
        txtL = (EditText)findViewById(R.id.txtL);
        btnhitung = (Button)findViewById(R.id.btnhitung);
        txtHasil = (TextView)findViewById(R.id.txtHasil);

        btnhitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String Panjang = txtP.getText().toString().trim();
                String Lebar = txtL.getText().toString().trim();
                double p = Double.parseDouble(Panjang);
                double l = Double.parseDouble(Lebar);
                double luas = p*l;
                txtHasil.setText ("Luas ="+luas);
            }
        });
    }
}
