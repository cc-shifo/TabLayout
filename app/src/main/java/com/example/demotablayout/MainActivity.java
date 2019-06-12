package com.example.demotablayout;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mTabLayout = findViewById(R.id.tab_layout2);

        mTabLayout.addTab(mTabLayout.newTab().setText("个性推荐"));
        mTabLayout.addTab(mTabLayout.newTab().setText("歌单"));
        mTabLayout.addTab(mTabLayout.newTab().setText("主播电台"));
        mTabLayout.addTab(mTabLayout.newTab().setText("排行榜"));
    }
}
