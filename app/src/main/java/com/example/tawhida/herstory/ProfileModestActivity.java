package com.example.tawhida.herstory;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ProfileModestActivity extends AppCompatActivity {

    List<Modest> firstModest;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_modest);



        firstModest = new ArrayList<>();
        firstModest.add(new Modest("Kaftan","Category","Description",R.drawable.kaftan));
        firstModest.add(new Modest("Abaya","Category","Description",R.drawable.abaya));
        firstModest.add(new Modest("Abayaa","Category","Description",R.drawable.abayaa));
        firstModest.add(new Modest("Hajj","Category","Description",R.drawable.hajj));
        firstModest.add(new Modest("AyeshaGown","Category","Description",R.drawable.ayeshagown));
        firstModest.add(new Modest("Denim","Category","Description",R.drawable.denim));
        firstModest.add(new Modest("Jilbab","Category","Description",R.drawable.jilbab));

        RecyclerView myrv = findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,firstModest);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}
