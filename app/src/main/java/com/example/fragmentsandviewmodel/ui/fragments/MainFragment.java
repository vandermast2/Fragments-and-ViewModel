package com.example.fragmentsandviewmodel.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragmentsandviewmodel.R;
import com.example.fragmentsandviewmodel.models.Reciepe;
import com.example.fragmentsandviewmodel.models.Result;
import com.example.fragmentsandviewmodel.services.NetworkService;
import com.example.fragmentsandviewmodel.ui.adapters.ReciepeAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
        Call<Reciepe> call = NetworkService
                .getInstance()
                .getApi()
                .getRecipe();
        call.enqueue(new Callback<Reciepe>() {
            @Override
            public void onResponse(Call<Reciepe> call, Response<Reciepe> response) {
                List<Result> results = response.body().getResults();
                createRV(results);
            }

            @Override
            public void onFailure(Call<Reciepe> call, Throwable t) {
                Toast.makeText(getContext(),t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void createRV(List<Result> receipes) {
        rvReceipe.setLayoutManager(new LinearLayoutManager(getContext()));
        ReciepeAdapter adapter = new ReciepeAdapter(receipes);
        rvReceipe.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }


    @Override
    public String getTitle() {
        return "BlueFragment";
    }
}
