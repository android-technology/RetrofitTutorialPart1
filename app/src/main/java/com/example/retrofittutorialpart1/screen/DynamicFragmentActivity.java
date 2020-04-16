package com.example.retrofittutorialpart1.screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.retrofittutorialpart1.R;

public class DynamicFragmentActivity extends AppCompatActivity implements FirstFragment.OnFirstFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_fragment);

        //
        FirstFragment firstFragment = new FirstFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.firstFrame, firstFragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onItemPressed(String content) {
        SecondFragment secondFragment = SecondFragment.newInstance(content);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.secondFrame, secondFragment);
        fragmentTransaction.commit();
    }
}
