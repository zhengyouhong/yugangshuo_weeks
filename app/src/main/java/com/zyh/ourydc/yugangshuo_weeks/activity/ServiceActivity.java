package com.zyh.ourydc.yugangshuo_weeks.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import com.zyh.ourydc.yugangshuo_weeks.R;

/**
 * Created by zhengyouhong on 2018/3/22.
 */

public class ServiceActivity extends AppCompatActivity{

    private Button mBtnStart;
    private Button mBtnStop;
    private Button mBtnBind;
    private Button mBtnUnbind;
    private Button mBtnClear;
    private RecyclerView mRcv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        mBtnStart = findViewById(R.id.btn_start);
        mBtnStop = findViewById(R.id.btn_stop);
        mBtnBind = findViewById(R.id.btn_bind);
        mBtnUnbind = findViewById(R.id.btn_unbind);

        mBtnClear = findViewById(R.id.btn_clear);
        mRcv = findViewById(R.id.rcv);

        initEvent();
    }

    private void initEvent() {
        LinearLayoutManager lm = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRcv.setLayoutManager(lm);



    }
}
