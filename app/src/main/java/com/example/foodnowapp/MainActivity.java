package com.example.foodnowapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab()
                .setIcon(R.drawable.icon_home)
                .setText("Home"));
        tabLayout.addTab(tabLayout.newTab()
                .setIcon(R.drawable.icon_order)
                .setText("Order"));
        tabLayout.addTab(tabLayout.newTab()
                .setIcon(R.drawable.ic_user)
                .setText("Profile"));

        //gọi Home khi vừa mở lên.
        displayContent(0);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                displayContent(tabLayout.getSelectedTabPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    void displayContent(int tabPosition) {
        Fragment fragment = null;

        switch (tabPosition) {
            case 0: fragment = new FragmentHomeList();
                break;
            case 1: fragment = new FragmentOrder();
                break;
            case 2: fragment = new FragmentProfile();
                break;
                default:
                    return;
        }

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content, fragment);
        fragmentTransaction.commit();
    }
}
