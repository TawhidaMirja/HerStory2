package com.example.tawhida.herstory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ModestActivity extends AppCompatActivity {

    private TextView tvtitle,tvcate,tvdesc;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modest);

        tvtitle = findViewById(R.id.mtitle);
        tvcate = findViewById(R.id.mcate);
        tvdesc = findViewById(R.id.mdesc);
        img = findViewById(R.id.modestthumbnail);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");

        tvtitle.setText("Title");
        tvdesc.setText("Description");
        img.setImageResource(image);
    }
}
