package com.ozzyozdil.tabbedjavafragment.ui.main;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

// Fragment içinde gözükecek veriler burada tutuluyor
public class PageViewModel extends ViewModel {

    private MutableLiveData<String> name = new MutableLiveData<>();

    public void setName(String name){
        this.name.setValue(name);
    }

    public LiveData<String> getName(){
        return name;
    }
}