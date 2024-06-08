package com.example.listviewgridview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AdapterList myAdapter;
    private List<ItemList> itemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        //Inisialisasi daftar item
        itemList = new ArrayList<>();
        itemList.add(new ItemList("Indonesia Merdeka",
                "Indonesia Merdeka Tahun 1945",
                "https://via.placeholder.com/150"));
        itemList.add(new ItemList("STT Bandung",
                "Sekolah Tinggi Teknologi Bandung berdiri pada tahun 1991",
                "https://via.placeholder.com/150"));
        itemList.add(new ItemList("Lebaran 2023",
                "1 Syawal tahun ini jatuh pada tanggal 22 April 2023",
                "https://via.placeholder.com/150"));

        //Inisialisai adapter RecyclerView
        myAdapter = new AdapterList(itemList);
        recyclerView.setAdapter((RecyclerView.Adapter) myAdapter);
    }
}