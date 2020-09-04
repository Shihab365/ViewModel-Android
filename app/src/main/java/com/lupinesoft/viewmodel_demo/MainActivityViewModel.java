package com.lupinesoft.viewmodel_demo;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

import java.util.Random;

public class MainActivityViewModel extends ViewModel {

    String randomNumber;

    public String getRandomNumber(){
        Log.d("TAG", "getRandomNumber");
        if(randomNumber == null){
            createRandomNumber();
        }
        return randomNumber;
    }

    public void createRandomNumber(){
        Log.d("TAG", "createRandomNumber");
        Random random = new Random();
        randomNumber = "Number: "+(random.nextInt(10-1)+1);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.d("TAG", "ViewModel Destroy");
    }
}
