package com.example.retrofittutorialpart1.screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;

import com.example.retrofittutorialpart1.R;
import com.example.retrofittutorialpart1.progress.CustomProgress;
import com.example.retrofittutorialpart1.textview.TextViewExpandableAnimation;

public class ProgressBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        Resources res = getResources();
        CustomProgress customProgressRoundedRectangle = (CustomProgress) findViewById(R.id.customProgressRoundedRectangle);
        customProgressRoundedRectangle.setMaximumPercentage(0.75f);
        customProgressRoundedRectangle.useRoundedRectangleShape(70.0f);
        customProgressRoundedRectangle.setProgressColor(res.getColor(R.color.blue_001));
        customProgressRoundedRectangle.setProgressBackgroundColor(res.getColor(R.color.blue_002));

        String text = getString(R.string.tips);

        TextViewExpandableAnimation tvExpand = findViewById(R.id.tv_expand);
        tvExpand.setText(text + text + text + text);
    }
}
