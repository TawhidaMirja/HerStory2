package com.example.tawhida.herstory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IslamicAttireActivity extends AppCompatActivity {

    Button btnModest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_islamic_attire);

        btnModest=findViewById(R.id.btn_modest);

        btnModest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IslamicAttireActivity.this,ProfileModestActivity.class);
                startActivity(intent);
            }
        });
    }
}
