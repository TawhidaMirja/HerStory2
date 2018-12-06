package com.example.tawhida.herstory;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Tawhida on 12/3/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {



    private Context mContext;
    private List<Modest>mdata;

    public RecyclerViewAdapter(Context mContext,List<Modest>mdata) {
        this.mContext = mContext;
        this.mdata = mdata;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_modest,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.tv_modest_title.setText(mdata.get(position).getTitle());
        holder.img_modest_thumbnail.setImageResource(mdata.get(position).getThumbnail());
        holder .cardView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

            }
        });
     }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_modest_title;
        ImageView img_modest_thumbnail;
        CardView cardView;

     public MyViewHolder(View itemView){
         super(itemView);

         tv_modest_title = itemView.findViewById(R.id.mod_title_kaf);
         img_modest_thumbnail = itemView.findViewById(R.id.mod_img_kaf);
         cardView  = itemView.findViewById(R.id.cardview_id);
     }
 }
}
