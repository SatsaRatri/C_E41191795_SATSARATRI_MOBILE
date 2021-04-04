package com.example.listviewactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;


import android.os.Bundle;

import java.util.ArrayList;

public class recyclerview extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();
        recyclerView= (RecyclerView) findViewById(R.id.recycler_view);
        adapter= new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(recyclerview.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Dicky Kurnia Ramadhan", "E41191553", "085156186156"));
        mahasiswaArrayList.add(new Mahasiswa("Satsa Ratri Hastutik", "E41191795", "081339011430"));
        mahasiswaArrayList.add(new Mahasiswa("Ulfiatun Hasanah", "E41191524", "085749253627"));
        mahasiswaArrayList.add(new Mahasiswa("Ezra Alannathaniel", "E41191741", "085157815688"));
        mahasiswaArrayList.add(new Mahasiswa("Naufal Akbar Kardieno Yasamita ", "E41191784", "082143404737"));
        mahasiswaArrayList.add(new Mahasiswa("Nur Syahbana R", "E41191868", "0895366755164"));

    }



}