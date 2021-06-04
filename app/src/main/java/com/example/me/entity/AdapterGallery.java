package com.example.me.entity;
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

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import com.bumptech.glide.request.RequestOptions;
import com.example.me.R;

public class AdapterGallery extends RecyclerView.Adapter<AdapterGallery.ListViewHolder>{
    private ArrayList<gallery> picList;

    public AdapterGallery(ArrayList<gallery> picList) {
        this.picList = picList;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int i) {
        gallery day = picList.get(i);
        Glide.with(holder.itemView.getContext())
                .load(day.getGalleryItems())
                .apply(new RequestOptions().override(1000,1000))
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return picList.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        public ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_gallery);
        }
    }
}
