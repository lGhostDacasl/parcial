package com.example.parcial_1ercorte_daniel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    TextView Texto1;
    TextView Texto2;
    Button par;
    Button impar;
    Button Nuevo;
    TextView Nuevo1;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        findViewById(R.id.Texto1);
        findViewById(R.id.Texto2);
        findViewById(R.id.impar);
        findViewById(R.id.par);
        findViewById(R.id.Texto2);

    par.setOnClickListener(new View.OnClickListener(){

        public void onClick(View view) {
            int a;
            for (int i=1; i<5;i++){
                a= i*2;
                Texto1.setText(Integer.toString(a));
            }
        }
    });





    }
}