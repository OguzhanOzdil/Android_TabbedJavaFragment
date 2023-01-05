package com.ozzyozdil.tabbedjavafragment;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.ozzyozdil.tabbedjavafragment.ui.main.SectionsPagerAdapter;
import com.ozzyozdil.tabbedjavafragment.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());  // Fragment Adapter

        ViewPager viewPager = binding.viewPager;   // Fragment burada gözükecek
        viewPager.setAdapter(sectionsPagerAdapter);

        TabLayout tabs = binding.tabs;  // Fragment butonları bu tabın üstünde olacak
        tabs.setupWithViewPager(viewPager);

        FloatingActionButton fab = binding.fab;  // Alttaki mesaj butonu
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });
    }
}