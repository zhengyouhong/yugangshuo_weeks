package com.zyh.ourydc.yugangshuo_weeks.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.zyh.ourydc.yugangshuo_weeks.R;

public class MainActivity extends AppCompatActivity {

    private Button mBtn01;
    private Button mBtn02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtn01 = findViewById(R.id.btn_1);
        mBtn02 = findViewById(R.id.btn_2);

        initEvent();
    }

    private void initEvent() {
        mBtn01.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ServiceActivity.class));
        });

        mBtn02.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ConstrainLayoutActivity.class));
        });

    }
}
