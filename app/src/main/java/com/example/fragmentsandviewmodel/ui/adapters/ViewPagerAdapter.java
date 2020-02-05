package com.example.fragmentsandviewmodel.ui.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.fragmentsandviewmodel.ui.fragments.BaseFragment;
import com.example.fragmentsandviewmodel.ui.fragments.GreenFragment;
import com.example.fragmentsandviewmodel.ui.fragments.MainFragment;
import com.example.fragmentsandviewmodel.ui.fragments.RedFragment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private List<BaseFragment> fragments;
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
        fragments = Arrays.asList(new RedFragment(),new MainFragment(),new GreenFragment());
    }

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragments.get(position).getTitle();
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
