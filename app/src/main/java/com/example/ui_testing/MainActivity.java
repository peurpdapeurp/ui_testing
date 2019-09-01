package com.example.ui_testing;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

    Button pattern1Button;
    Button pattern2Button;
    private CustomSeekBar seekbar;
    private EditText txtSeekProgress;

    private float totalSpan = 1500;
    private float redSpan1 = 200;
    private float blueSpan1 = 300;
    private float greenSpan1 = 400;
    private float yellowSpan1 = 150;
    private float darkGreySpan1 = 0;
    private float redSpan2 = 400;
    private float blueSpan2 = 600;
    private float greenSpan2 = 240;
    private float yellowSpan2 = 160;
    private float darkGreySpan2 = 0;

    private ArrayList<ProgressItem> progressItemList;
    private ProgressItem mProgressItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekbar = ((CustomSeekBar) findViewById(R.id.seekBar0));
        seekbar.setEnabled(false);

        initDataToSeekbar1();

        pattern1Button = (Button) findViewById(R.id.set_pattern_1_button);
        pattern1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initDataToSeekbar1();
            }
        });

        pattern2Button = (Button) findViewById(R.id.set_pattern_2_button);
        pattern2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initDataToSeekbar2();
            }
        });
    }

    private void initDataToSeekbar1() {
        progressItemList = new ArrayList<ProgressItem>();
        // red span
        mProgressItem = new ProgressItem();
        mProgressItem.progressItemPercentage = ((redSpan1 / totalSpan) * 100);
        Log.i("Mainactivity", mProgressItem.progressItemPercentage + "");
        mProgressItem.color = R.color.red;
        progressItemList.add(mProgressItem);
        // blue span
        mProgressItem = new ProgressItem();
        mProgressItem.progressItemPercentage = (blueSpan1 / totalSpan) * 100;
        mProgressItem.color = R.color.blue;
        progressItemList.add(mProgressItem);
        // green span
        mProgressItem = new ProgressItem();
        mProgressItem.progressItemPercentage = (greenSpan1 / totalSpan) * 100;
        mProgressItem.color = R.color.green;
        progressItemList.add(mProgressItem);
        // yellow span
        mProgressItem = new ProgressItem();
        mProgressItem.progressItemPercentage = (yellowSpan1 / totalSpan) * 100;
        mProgressItem.color = R.color.yellow;
        progressItemList.add(mProgressItem);
        // greyspan
        mProgressItem = new ProgressItem();
        mProgressItem.progressItemPercentage = (darkGreySpan1 / totalSpan) * 100;
        mProgressItem.color = R.color.grey;
        progressItemList.add(mProgressItem);

        seekbar.initData(progressItemList);
        seekbar.invalidate();
    }

    private void initDataToSeekbar2() {
        progressItemList = new ArrayList<ProgressItem>();
        // red span
        mProgressItem = new ProgressItem();
        mProgressItem.progressItemPercentage = ((redSpan2 / totalSpan) * 100);
        Log.i("Mainactivity", mProgressItem.progressItemPercentage + "");
        mProgressItem.color = R.color.red;
        progressItemList.add(mProgressItem);
        // blue span
        mProgressItem = new ProgressItem();
        mProgressItem.progressItemPercentage = (blueSpan2 / totalSpan) * 100;
        mProgressItem.color = R.color.blue;
        progressItemList.add(mProgressItem);
        // green span
        mProgressItem = new ProgressItem();
        mProgressItem.progressItemPercentage = (greenSpan2 / totalSpan) * 100;
        mProgressItem.color = R.color.green;
        progressItemList.add(mProgressItem);
        // yellow span
        mProgressItem = new ProgressItem();
        mProgressItem.progressItemPercentage = (yellowSpan2 / totalSpan) * 100;
        mProgressItem.color = R.color.yellow;
        progressItemList.add(mProgressItem);
        // greyspan
        mProgressItem = new ProgressItem();
        mProgressItem.progressItemPercentage = (darkGreySpan2 / totalSpan) * 100;
        mProgressItem.color = R.color.grey;
        progressItemList.add(mProgressItem);

        seekbar.initData(progressItemList);
        seekbar.invalidate();
    }
}

