package com.example.fragmentsandviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtText;
    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize MainViewModel
        mainViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainViewModel.class);
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        txtText =findViewById(R.id.txtText);
        mainViewModel.getCount("Some Text");
        mainViewModel.count.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer count) {
                setText(count);
            }
        });
        Log.d("Lifecycle", "onCreate");
    }

    private void setText(int count){
        txtText.setText("Some Text: count" + count);
    }



}
