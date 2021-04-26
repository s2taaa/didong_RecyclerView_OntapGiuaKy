package com.example.onthi4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    private ArrayList<Product> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList = new ArrayList<>();
        arrayList.add(new Product("tuong vy","xjnhgai",2,R.drawable.ff8c8e08925860063949));
        arrayList.add(new Product("tuong vy1","bi dien",2,R.drawable.a5e29f648334716a28251));
        arrayList.add(new Product("tuong vy2","xau tinh",2,R.drawable.e31202661e36ec68b5276));
        arrayList.add(new Product("tuong vy3","do hoi",2,R.drawable.ff8c8e089258600639493));
        arrayList.add(new Product("tuong vy4","khung dien",2,R.drawable.ff8c8e08925860063949));


        recyclerView = findViewById(R.id.revPro);
        productAdapter = new ProductAdapter(this,arrayList);
        recyclerView.setAdapter(productAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

    }}