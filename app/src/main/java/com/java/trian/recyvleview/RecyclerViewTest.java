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
        ArrayList<PersonClass> names = new ArrayList();

        names.add(new PersonClass("vahid", "malek", 1L,"091212211421151", R.mipmap.ic_launcher));
        names.add(new PersonClass("keyvan", "ramezan arab", 2L,"091212211421151", R.mipmap.ic_launcher));
        names.add(new PersonClass("zahra", "zolfaghari", 3L,"091212211421151", R.mipmap.ic_launcher));
        names.add(new PersonClass("pooya", "heydari", 4L,"091212211421151", R.mipmap.ic_launcher));
        names.add(new PersonClass("erfan", "akhbar", 5L,"091212211421151", R.mipmap.ic_launcher));
        names.add(new PersonClass("hamid", "allahyari", 6L,"091212211421151", R.mipmap.ic_launcher));
        names.add(new PersonClass("pooya", "dehkordi", 7L,"091212211421151", R.mipmap.ic_launcher));
        names.add(new PersonClass("masoomeh", "rahimi", 8L,"091212211421151", R.mipmap.ic_launcher));
        names.add(new PersonClass("morteza", "sroodbari", 9L,"091212211421151", R.mipmap.ic_launcher));
        names.add(new PersonClass("sam", "shams", 10L,"091212211421151", R.mipmap.ic_launcher));
        names.add(new PersonClass("akram", "mosharafi", 11L,"091212211421151", R.mipmap.ic_launcher));


        RecyclerView recycler = findViewById(R.id.recycler);
        TestAdapter  adapter = new TestAdapter(names);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(RecyclerViewTest.this,
                RecyclerView.VERTICAL, false));
    }
}
