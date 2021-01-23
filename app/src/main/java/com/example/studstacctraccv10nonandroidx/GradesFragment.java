package com.example.studstacctraccv10nonandroidx;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class GradesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //oceny i przedmioty hopefully pobierane z serwera...
        ArrayList<ClassStat> classStats= new ArrayList<>();
        classStats.add(new ClassStat("PPSM2", "Projekt",3.0));
        classStats.add(new ClassStat("TOIK", "Kolokwium",3.0));
        classStats.add(new ClassStat("PPSM2", "Projekt",3.0));
        classStats.add(new ClassStat("TOIK", "Kolokwium",3.0));
        classStats.add(new ClassStat("PPSM2", "Projekt",3.0));
        classStats.add(new ClassStat("TOIK", "Kolokwium",3.0));












        return inflater.inflate(R.layout.fragment_grades,container,false);
    }
}
