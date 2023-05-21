package com.example.lpfoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView img1;
    RelativeLayout r1;
    Button btn;
    EditText kAdi,kSifre,eMail;
    String kullanAdi,kullanSifre,kullanEmail,DogruKAdi="Melike",DogruSifre="12345";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btngir);
        kAdi=findViewById(R.id.editTextTextPersonName);
        kSifre=findViewById(R.id.editTextTextPassword);
        eMail=findViewById(R.id.editTextTextEmailAddress);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kullanAdi=kAdi.getText().toString();
                kullanSifre=kSifre.getText().toString();
                kullanEmail=eMail.getText().toString();
                if(!TextUtils.isEmpty(kullanAdi) && !TextUtils.isEmpty(kullanSifre)) {
                    if(kullanAdi.equals(DogruKAdi) && kullanSifre.equals(DogruSifre)) {
                        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                        intent.putExtra()
                        startActivity(intent);
                    }else
                        Toast.makeText(MainActivity.this, "Kullanıcı Adı veya Şifreyi Yanlış Girdiniz!", Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(MainActivity.this, "Kullanıcı adı ve Şifre Boş Olamaz!", Toast.LENGTH_SHORT).show();

            }
        });
    }
}