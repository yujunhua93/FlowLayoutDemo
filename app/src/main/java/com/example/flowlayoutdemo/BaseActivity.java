package com.example.flowlayoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class BaseActivity extends AppCompatActivity {

    protected List<String> tags = new ArrayList<>(); //这个数据可以自己造啊


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        loadData();
    }

    protected void loadData(){
        tags.add("奥迪A4L");
        tags.add("宝马3系");
        tags.add("秦PLUS");
        tags.add("奔驰GLC");
        tags.add("本田CR-V");
        tags.add("卡罗拉");
        tags.add("坦克300");
        tags.add("长安UNI-K");
        tags.add("沃尔沃S60");
        tags.add("凌渡");

    }



}