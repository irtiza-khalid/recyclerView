package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<contactModel> array1=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recycle=findViewById(R.id.recyclerid);
        recycle.setLayoutManager(new LinearLayoutManager(this));
array1.add(new contactModel(R.drawable.m,"03125102836","malik"));
        array1.add(new contactModel(R.drawable.m,"03005183542","malik333"));
        array1.add(new contactModel(R.drawable.m,"03112865436","malik tahir"));
        array1.add(new contactModel(R.drawable.a,"03116542341","ali"));
        array1.add(new contactModel(R.drawable.s,"03007652431","sajeel"));
        array1.add(new contactModel(R.drawable.h,"03367777363","hamza hk"));
        array1.add(new contactModel(R.drawable.h,"03003367722","hamza ds"));
        array1.add(new contactModel(R.drawable.m,"03125104325","mirza"));
        array1.add(new contactModel(R.drawable.m,"03171232412","malik khiayam"));
        array1.add(new contactModel(R.drawable.a,"03425167242","ahmedyar bro"));
        array1.add(new contactModel(R.drawable.s,"03455552555","shah g"));
        array1.add(new contactModel(R.drawable.a,"03116527853","amer "));
        array1.add(new contactModel(R.drawable.u,"03120072157","usama"));
        array1.add(new contactModel(R.drawable.f,"03216753422","fadi 1"));
        array1.add(new contactModel(R.drawable.s,"03125187652","shah g the great"));
        array1.add(new contactModel(R.drawable.m,"03005462753","malik2"));
        Recycleradapter adt=new Recycleradapter(this,array1);
        recycle.setAdapter(adt);
    }
}