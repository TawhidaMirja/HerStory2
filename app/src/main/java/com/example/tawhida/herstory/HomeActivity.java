package com.example.tawhida.herstory;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity{

    VideoView vv_display;
    MediaController mController;
    TextView attire ;
    TextView crafter;
    TextView jwellary;
    TextView Bakeryshop;
    TextView Homemadeproduct;





    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        vv_display = (VideoView) findViewById(R.id.vv_display);
        vv_display.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video);
        mController = new MediaController(this);
        mController.setAnchorView(vv_display);
        vv_display.setMediaController(mController);
        vv_display.start();

        attire = (TextView) findViewById(R.id.Attire);


        attire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, IslamicAttireActivity.class);
                intent.putExtra("shop no", "One");
                Toast.makeText(HomeActivity.this,"Opening",Toast.LENGTH_SHORT).show();
                startActivity(intent);


            }
        });

        crafter = (TextView) findViewById(R.id.Crafter);


        crafter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, CraftActivity.class);
                intent.putExtra("shop no", "two");
                Toast.makeText(HomeActivity.this,"Opening",Toast.LENGTH_SHORT).show();
                startActivity(intent);


            }
        });

        jwellary = (TextView) findViewById(R.id.Jwellary);


        jwellary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, JwellaryActivity.class);
                intent.putExtra("shop no", "Three");
                Toast.makeText(HomeActivity.this,"Opening",Toast.LENGTH_SHORT).show();
                startActivity(intent);


            }
        });
        Bakeryshop = (TextView) findViewById(R.id.baker);


        Bakeryshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, BakeryShopActivity.class);
                intent.putExtra("shop no", "Four");
                Toast.makeText(HomeActivity.this,"Opening",Toast.LENGTH_SHORT).show();
                startActivity(intent);


            }
        });
        Homemadeproduct= (TextView) findViewById(R.id.hmp);


        Homemadeproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, HmpActivity.class);
                intent.putExtra("shop no", "five");
                Toast.makeText(HomeActivity.this,"Opening",Toast.LENGTH_SHORT).show();
                startActivity(intent);


            }
        });

    }

    }