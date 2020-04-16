package com.example.retrofittutorialpart1.screen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.retrofittutorialpart1.R;

public class StaticFragmentActivity extends AppCompatActivity implements FirstFragment.OnFirstFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_fragment);
    }

    @Override
    public void onItemPressed(String content) {

    }
}
