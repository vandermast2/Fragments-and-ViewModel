package com.example.fragmentsandviewmodel.ui.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.fragmentsandviewmodel.R;
import com.example.fragmentsandviewmodel.ui.adapters.ViewPagerAdapter;
import com.example.fragmentsandviewmodel.ui.fragments.MainFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TextView txtText;
    private MainViewModel mainViewModel;

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize MainViewModel
        mainViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainViewModel.class);
//        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
        txtText = findViewById(R.id.txtText);
    }

    private void addFragment() {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//        MainFragment mainFragment = new MainFragment();
//         fragmentTransaction.add(R.id.mainContainer, mainFragment,"MAIN_FRAGMENT");
//         fragmentTransaction.commit();
    }

    private void setText(int count) {
        txtText.setText("Some Text: count" + count);
    }


}
