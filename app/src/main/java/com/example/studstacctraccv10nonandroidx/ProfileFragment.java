package com.example.studstacctraccv10nonandroidx;

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

public class ProfileFragment extends Fragment{


    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //Karty przedmiotów hopefully pobierane z serwera...
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


        View view = inflater.inflate(R.layout.fragment_profile,container,false);

        buildRecyclerView(view,exampleList);




        return view;

    }

    public void buildRecyclerView(View view, ArrayList<ExampleItem> list){
        //BUILD RECYCLERVIEW
        mRecyclerView=view.findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager=new LinearLayoutManager(view.getContext(),LinearLayoutManager.VERTICAL,false);
        mAdapter= new ExampleAdapter(list);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }
}
