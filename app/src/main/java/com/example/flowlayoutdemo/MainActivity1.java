package com.example.flowlayoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.flowlayout.FlowLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 普通的展示标签
 */
public class MainActivity1 extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        FlowLayout flowLayout = findViewById(R.id.flow_layout);
        MainActivity1Adapter mainActivity1Adapter = new MainActivity1Adapter(this,tags);
        flowLayout.setTagAdapter(mainActivity1Adapter);
    }


    @Override
    protected void loadData() {
        super.loadData();
    }

}