package com.example.studstacctraccv10nonandroidx;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ArrayList<ExampleItem> exampleList= new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.ic_card1,"Nazwa Przedmiotu"));
        exampleList.add(new ExampleItem(R.drawable.ic_card2,"Nazwa Przedmiotu2"));
        exampleList.add(new ExampleItem(R.drawable.ic_card3,"Nazwa Przedmiotu3"));
        exampleList.add(new ExampleItem(R.drawable.ic_card1,"Nazwa Przedmiotu"));
        exampleList.add(new ExampleItem(R.drawable.ic_card2,"Nazwa Przedmiotu2"));
        exampleList.add(new ExampleItem(R.drawable.ic_card3,"Nazwa Przedmiotu3"));
        exampleList.add(new ExampleItem(R.drawable.ic_card1,"Nazwa Przedmiotu"));
        exampleList.add(new ExampleItem(R.drawable.ic_card2,"Nazwa Przedmiotu2"));
        exampleList.add(new ExampleItem(R.drawable.ic_card3,"Nazwa Przedmiotu3"));

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        mRecyclerView=view.findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager=new LinearLayoutManager(view.getContext(),LinearLayoutManager.HORIZONTAL,false);
        mAdapter= new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);


        //return inflater.inflate(R.layout.fragment_home, container, false);
        // Inflate the layout for this fragment

        /*
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager= new LinearLayoutManager.(HomeFragment.this);
        mAdapter= new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
*/


        return view;


    }
}































