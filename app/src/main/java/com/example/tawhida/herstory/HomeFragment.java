package com.example.tawhida.herstory;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }



    VideoView vv_display;
    MediaController mController;
    TextView crafter;
    TextView Bakeryshop ;
    TextView Bag;
    TextView jwellary;
    TextView Hijab;
    TextView Attire;
    TextView Beautyandcare;
    TextView Painter;
    TextView Womanscloset;
    TextView Handmadeproduct;
    TextView Kidscorner;
    TextView Homemadeproduct;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_home, container, false);

        vv_display = (VideoView) v.findViewById(R.id.vv_display);
        vv_display.setVideoPath("android.resource://" + "com.example.tawhida.herstory" + "/" + R.raw.video);
        mController = new MediaController(getActivity());
        mController.setAnchorView(vv_display);
        vv_display.setMediaController(mController);
        vv_display.start();

        crafter = (TextView) v.findViewById(R.id.Crafter);


        crafter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), CraftActivity.class);
                intent.putExtra("shop no", "One");
                Toast.makeText(getActivity(),"Opening",Toast.LENGTH_SHORT).show();
                startActivity(intent);


            }
        });


        Bakeryshop = (TextView) v.findViewById(R.id.baker);


        Bakeryshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), BakeryShopActivity.class);
                intent.putExtra("shop no", "Two");
                Toast.makeText(getActivity(),"Opening",Toast.LENGTH_SHORT).show();
                startActivity(intent);


            }
        });
        Bag = (TextView) v.findViewById(R.id.f_bag);


        Bag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), BagActivity.class);
                intent.putExtra("shop no", "Three");
                Toast.makeText(getActivity(),"Opening",Toast.LENGTH_SHORT).show();
                startActivity(intent);


            }
        });

        jwellary = (TextView) v. findViewById(R.id.Jwellary);


        jwellary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), JwellaryActivity.class);
                intent.putExtra("shop no", "Four");
                Toast.makeText(getActivity(),"Opening",Toast.LENGTH_SHORT).show();
                startActivity(intent);


            }
        });
        Hijab = (TextView) v.findViewById(R.id.Hijab);


        Hijab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), HijabActivity.class);
                intent.putExtra("shop no", "five");
                Toast.makeText(getActivity(),"Opening",Toast.LENGTH_SHORT).show();
                startActivity(intent);


            }
        });

        Attire = (TextView) v.findViewById(R.id.Attire);

        Attire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), IslamicAttireActivity.class);
                intent.putExtra("shop no", "Six");
                Toast.makeText(getActivity(),"Opening",Toast.LENGTH_SHORT).show();
                startActivity(intent);


            }
        });


        Beautyandcare = (TextView) v.findViewById(R.id.Beauty);


        Beautyandcare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), BeautyActivity.class);
                intent.putExtra("shop no", "Seven");
                Toast.makeText(getActivity(),"Opening",Toast.LENGTH_SHORT).show();
                startActivity(intent);


            }
        });
        Painter = (TextView) v.findViewById(R.id.painter);


        Painter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), PainterActivity.class);
                intent.putExtra("shop no", "Eight");
                Toast.makeText(getActivity(),"Opening",Toast.LENGTH_SHORT).show();
                startActivity(intent);


            }
        });
        Womanscloset = (TextView) v.findViewById(R.id.wmn);


        Womanscloset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), ClosetActivity.class);
                intent.putExtra("shop no", "Nine");
                Toast.makeText(getActivity(),"Opening",Toast.LENGTH_SHORT).show();
                startActivity(intent);


            }
        });
        Handmadeproduct = (TextView) v.findViewById(R.id.Bunon);


        Handmadeproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), HandmpActivity.class);
                intent.putExtra("shop no", "Ten");
                Toast.makeText(getActivity(),"Opening",Toast.LENGTH_SHORT).show();
                startActivity(intent);


            }
        });
        Kidscorner = (TextView) v.findViewById(R.id.kiddo);


        Kidscorner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), KidsActivity.class);
                intent.putExtra("shop no", "Eleven");
                Toast.makeText(getActivity(),"Opening",Toast.LENGTH_SHORT).show();
                startActivity(intent);


            }
        });
        Homemadeproduct = (TextView) v.findViewById(R.id.hmp);


        Homemadeproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), HmpActivity.class);
                intent.putExtra("shop no", "Twelve");
                Toast.makeText(getActivity(),"Opening",Toast.LENGTH_SHORT).show();
                startActivity(intent);


            }
        });
        return  v;
    }

}
