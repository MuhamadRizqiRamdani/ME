package com.example.me;
/*
    NIM             : 10118069
    Nama            : Muhamad Rizqi Ramdani
    Kelas           : IF2
    TGl Pengerjaan  : 4 juni 2021
  */

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter2 extends RecyclerView.Adapter{
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_daily2, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder)holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return OurData.friendlist_daily.length;
    }


    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView mItemText;
        public ImageView mItemImage;

        public ListViewHolder(View itemView){
            super(itemView);
            mItemText = (TextView) itemView.findViewById(R.id.item_daily_activity_friendlist);
            mItemImage = (ImageView) itemView.findViewById(R.id.item_daily_image_friendlist);
            itemView.setOnClickListener(this);
        }

        public void bindView(int position){
            mItemText.setText(OurData.friendlist_daily[position]);
            mItemImage.setImageResource(OurData.firendlistDailyPicturePath[position]);


        }



        @Override
        public void onClick(View v) {

        }
    }
}
