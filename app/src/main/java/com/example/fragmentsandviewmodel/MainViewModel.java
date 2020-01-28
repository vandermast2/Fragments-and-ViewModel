package com.example.fragmentsandviewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    public MutableLiveData<Integer> count = new MutableLiveData<>();
    public void getCount(String s){
        count.postValue(s.length());
    }
}
