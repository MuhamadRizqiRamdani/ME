package com.example.me;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

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

}
