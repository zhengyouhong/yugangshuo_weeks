package com.zyh.ourydc.yugangshuo_weeks.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.zyh.ourydc.yugangshuo_weeks.R;

public class MainActivity extends AppCompatActivity {

    private Button mBtn01;
    private Button mBtn02;
    private Button mBtn03;
    private Button mBtn05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtn01 = findViewById(R.id.btn_1);
        mBtn02 = findViewById(R.id.btn_2);
        mBtn03 = findViewById(R.id.btn_3);
        mBtn05 = findViewById(R.id.btn_5);

        initEvent();
    }

    private void initEvent() {
        mBtn01.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ServiceActivity.class));
        });

        mBtn02.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ConstrainLayoutActivity.class));
        });

        mBtn03.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, RatingActivity.class));
        });

        mBtn05.setOnClickListener(v -> {
            startActivity(new Intent(this, CanvasActivity.class) );
        });

    }
}
