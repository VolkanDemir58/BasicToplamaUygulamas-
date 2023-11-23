package com.example.hafta6;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       Button btnTopla =findViewById(R.id.btnTopla);
       btnTopla.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               EditText edtSayi1=findViewById(R.id.edtSayi1);
               EditText edtSayi2=findViewById(R.id.edtSayi2);

               int sayi1=Integer.valueOf(edtSayi1.getText().toString());
               int sayi2=Integer.valueOf(edtSayi2.getText().toString());
               int sonuc =sayi1+sayi2;
               Toast.makeText(MainActivity2.this, "SONUC : "+sonuc, Toast.LENGTH_SHORT).show();

           }
       });



    }
}