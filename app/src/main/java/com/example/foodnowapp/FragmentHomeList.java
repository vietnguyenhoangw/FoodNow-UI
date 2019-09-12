package com.example.foodnowapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FragmentHomeList extends Fragment {

    ListView listViewHome;
    ArrayList<Home> homeArrayList;
    HomeAdapter homeAdapter;

    public FragmentHomeList() {
        // Required empty public constructor
    }

    public static FragmentHomeList newInstance() {
        return new FragmentHomeList();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listViewHome = view.findViewById(R.id.listViewHome);
        homeArrayList = new ArrayList<>();
        homeAdapter = new HomeAdapter(getContext(), R.layout.home_item, homeArrayList);

        homeArrayList.add(new Home(R.drawable.ic_circlek, "Circle K", "Hà Nội"));
        homeArrayList.add(new Home(R.drawable.ic_highland, "High Land", "Hải Phòng"));
        homeArrayList.add(new Home(R.drawable.ic_ministop, "Mini Stop", "Hồ Chí Minh"));
        homeArrayList.add(new Home(R.drawable.ic_seveneleven, "SEVENELEVEn", "Cà Mau"));
        homeArrayList.add(new Home(R.drawable.ic_vinmart, "VinMart", "Bạc Liêu"));
        homeArrayList.add(new Home(R.drawable.ic_circlek, "High Land", "Yên Bái"));
        homeArrayList.add(new Home(R.drawable.ic_highland, "Mini Stop", "Vĩnh Phúc"));

        listViewHome.setAdapter(homeAdapter);

        listViewHome.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                click(i);
            }
        });
    }

    public void click(int i) {
        Toast.makeText(getContext(), i + "", Toast.LENGTH_SHORT).show();
    }
}
