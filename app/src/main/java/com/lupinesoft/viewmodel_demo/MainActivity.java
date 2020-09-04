package com.lupinesoft.viewmodel_demo;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textRandom_ID);
        MainActivityViewModel mvModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);
        String randomNumber = mvModel.getRandomNumber();
        textView.setText(randomNumber);
        Log.d("TAG", "Random Number Set");
    }
}
