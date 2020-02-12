package com.example.fragmentsandviewmodel.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragmentsandviewmodel.R;
import com.example.fragmentsandviewmodel.models.Reciepe;
import com.example.fragmentsandviewmodel.ui.adapters.ReciepeAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainFragment extends BaseFragment {
    private RecyclerView rvReceipe;
    private MainViewModel viewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        rvReceipe = view.findViewById(R.id.rvReceipe);
        rvReceipe.setLayoutManager(new LinearLayoutManager(getContext()));
        List<Reciepe> receipes = Arrays.asList(
                new Reciepe("slkgfv", "skjldavc"),
                new Reciepe("sKLJDBV", "lSAIVdj"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("lskjvdh", "lakjsbvhd"),
                new Reciepe("laskjdnc", ";lkasjvdn")
                );
        ReciepeAdapter adapter = new ReciepeAdapter(receipes);
        rvReceipe.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }


    @Override
    public String getTitle() {
        return "BlueFragment";
    }
}
