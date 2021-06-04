package com.example.me;
/*
    NIM             : 10118069
    Nama            : Muhamad Rizqi Ramdani
    Kelas           : IF2
    TGl Pengerjaan  : 4 juni 2021
  */
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.me.dummy.Gallery;
import com.example.me.entity.AdapterGallery;
import com.example.me.entity.LocalImages;
import com.example.me.entity.gallery;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {
    private RecyclerView rv;
    private ArrayList<gallery> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gallery,container,false);
        rv = view.findViewById(R.id.rv_gallery);
        rv.setHasFixedSize(true);
        list.addAll(Gallery.getListData());
        ShowListGallery();
        return view;
    }

    void ShowListGallery(){
        rv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        AdapterGallery galleryAdapter = new AdapterGallery(list);
        rv.setAdapter(galleryAdapter);
    }
}
