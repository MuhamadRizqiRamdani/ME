package com.example.me;
/*
    NIM             : 10118069
    Nama            : Muhamad Rizqi Ramdani
    Kelas           : IF2
    TGl Pengerjaan  : 4 juni 2021
  */
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    private BottomNavigationView.OnNavigationItemSelectedListener navigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            Fragment f = null;
            switch (item.getItemId()) {
                case R.id.home_menu:
                    f = new HomeFragment();
                    break;
                case R.id.daily_activity_menu:
                    f = new DailyActivityFragment();
                    break;
                case R.id.gallery_menu:
                    f = new GalleryFragment();
                    break;
                case R.id.music_video_menu:
                    f = new MusicVideoFragment();
                    break;
                case R.id.profile_menu:
                    f = new ProfileFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, f).commit();
            return true;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new HomeFragment());
        bottomNavigationView = findViewById(R.id.bn_main);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);

    }

    private boolean loadFragment(Fragment f) {
        if (f != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container, f)
                    .commit();
            return true;
        }
        return false;
    }

    public void insta(View view){
        Intent instagram = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/saddap_1/"));
        startActivity(instagram);
    }

    public void email(View view){
        Intent mail = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:rizqiramdani1000@gmail.com"));
        startActivity(mail);
    }

    public void maps(View view) {
        Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/GHCDtc4kCdgXdLNB6"));
        startActivity(map);
    }

    public void telp(View view) {
        Intent wa = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/089509523635"));
        startActivity(wa);
    }

}
