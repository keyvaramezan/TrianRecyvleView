package com.java.trian.recyvleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_test);
        ArrayList<String> names = new ArrayList();
        names.add("vahid malek");
        names.add("keyvan ramezan arab");
        names.add("zahra zolfaghari");
        names.add("pooya heydari");
        names.add("erfan akhabar");
        names.add("hamid allahyari");
        names.add("pooya dehkordi");
        names.add("masoomeh rahimi");
        names.add("seyed morteza roodbari chaharshanbe nia");
        names.add("sam shams");
        names.add("akram mosharafi");



        RecyclerView recycler = findViewById(R.id.recycler);
        TestAdapter  adapter = new TestAdapter(names);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(RecyclerViewTest.this,
                RecyclerView.VERTICAL, false));
    }
}
