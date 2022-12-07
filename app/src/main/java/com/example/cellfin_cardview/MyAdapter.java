package com.example.cellfin_cardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    int[][] images;
    String[][] text;
    Context cons;

    public MyAdapter(int[][] images, String[][] text, Context cons) {
        this.images = images;
        this.text = text;
        this.cons = cons;
    }

    @NonNull


    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View Vh= LayoutInflater.from(cons).inflate(R.layout.child_layout,parent,false);
        return new MyViewHolder(Vh);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.i1.setImageResource(images[position][position]);
        holder.i2.setImageResource(images[position][position]);
        holder.i3.setImageResource(images[position][position]);
        holder.i4.setImageResource(images[position][position]);

        holder.t1.setText(text[position][position]);
        holder.t2.setText(text[position][position]);
        holder.t3.setText(text[position][position]);
        holder.t4.setText(text[position][position]);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView t1,t2,t3,t4;
        ImageView i1,i2,i3,i4;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.txt1);
            t2=itemView.findViewById(R.id.txt2);
            t3=itemView.findViewById(R.id.txt3);
            t4=itemView.findViewById(R.id.txt4);

            i1=itemView.findViewById(R.id.img1);
            i2=itemView.findViewById(R.id.img2);
            i3=itemView.findViewById(R.id.img3);
            i4=itemView.findViewById(R.id.img4);
        }
    }

}
