package com.example.bai_ktck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class List extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView listview;
        ArrayList<List_model>arrayList;
        List_adapter adapter;
        listview = findViewById(R.id.listview);
        arrayList = new ArrayList<>();

        arrayList.add(new List_model(R.drawable.h1,"Nguyễn Thanh Tùng","Sơn Tùng MTP","Việt Nam","10 "));
        arrayList.add(new List_model(R.drawable.h2,"Nguyễn Việt Hoàng","MoNo","Việt Nam","8 "));
        arrayList.add(new List_model(R.drawable.h3,"Nguyễn Hoàng Sơn","SooBin Hoàng Sơn","Việt Nam","10 "));
        arrayList.add(new List_model(R.drawable.h4,"Phan Thị Mỹ Tam","Mỹ Tâm","Việt Nam","10 "));
        arrayList.add(new List_model(R.drawable.h5,"Abel Makkonen Tesfaye","The Weeknd","Canada","10 "));
        arrayList.add(new List_model(R.drawable.h6,"Justin Drew Bieber","Justin Bieber","Canada","10 "));
        arrayList.add(new List_model(R.drawable.h7,"Lê Nguyễn Trung Đan","BinZ","Việt Nam","10"));
        arrayList.add(new List_model(R.drawable.h8,"Nguyễn Đức Phúc","Đức Phúc","Việt Nam","9"));
        arrayList.add(new List_model(R.drawable.h9,"Nguyễn Phước Thịnh","Noo Phước Thịnh","Việt Nam","10"));
        arrayList.add(new List_model(R.drawable.h10,"Nguyễn Khoa Tóc Tiên","Tóc Tiên","Việt Nam","10"));

        adapter = new List_adapter(List.this,R.layout.itemlist,arrayList);
        listview.setAdapter(adapter);
    }
}