package com.example.me.dummy;

import java.util.ArrayList;
import com.example.me.R;
import com.example.me.entity.gallery;

public class Gallery {
    private static int[] galleryItems ={

            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo

    };

    public static ArrayList<gallery> getListData(){
        ArrayList<gallery> list = new ArrayList<>();
        for (int position = 0; position < galleryItems.length; position++){
            gallery day = new gallery();
            day.setGalleryItems(galleryItems[position]);
            list.add(day);
        }
        return list;
    }
}
