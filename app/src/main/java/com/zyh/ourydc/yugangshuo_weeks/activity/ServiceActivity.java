package com.zyh.ourydc.yugangshuo_weeks.activity;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.zyh.ourydc.yugangshuo_weeks.R;
import com.zyh.ourydc.yugangshuo_weeks.adapter.ServiceLogAdapter;
import com.zyh.ourydc.yugangshuo_weeks.event.EventFreshLog;
import com.zyh.ourydc.yugangshuo_weeks.service.ZyhService;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengyouhong on 2018/3/22.
 */

public class ServiceActivity extends AppCompatActivity {

    private Button mBtnStart;
    private Button mBtnStop;
    private Button mBtnBind;
    private Button mBtnUnbind;
    private Button mBtnClear;
    private RecyclerView mRcv;
    private List<String> mLogDatas;
    private ServiceLogAdapter mAdapter;

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
        initData();
        initEvent();

    }

    private void initData() {
        EventBus.getDefault().register(this);
        mLogDatas = new ArrayList<>();
        mLogDatas.add("onStart");
    }

    @Subscribe
    public void onEventMainThread(EventFreshLog event) {
        String log = event.log;
        boolean isAdd = mLogDatas.add(log);
        if (isAdd) {
            mAdapter.notifyDataSetChanged();
            mRcv.scrollToPosition(mLogDatas.size() - 1);
        }
    }

    private void initEvent() {
        LinearLayoutManager lm = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRcv.setLayoutManager(lm);
        mRcv.setHasFixedSize(true);

        mAdapter = new ServiceLogAdapter(mLogDatas, this);
        mRcv.setAdapter(mAdapter);

        mBtnStart.setOnClickListener(v -> {
            startService(new Intent(ServiceActivity.this, ZyhService.class));
        });

        mBtnStop.setOnClickListener(v -> {

        });

        mBtnBind.setOnClickListener(v -> {

        });

        mBtnUnbind.setOnClickListener(v -> {

        });

        mBtnClear.setOnClickListener(v -> {
            mLogDatas.clear();
            mAdapter.notifyDataSetChanged();
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
