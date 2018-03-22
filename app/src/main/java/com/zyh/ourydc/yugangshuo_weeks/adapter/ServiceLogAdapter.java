package com.zyh.ourydc.yugangshuo_weeks.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengyouhong on 2018/3/22.
 */

public class ServiceLogAdapter extends RecyclerView.Adapter<ServiceLogAdapter.LogViewHolder> {

    public List<String> mLogs = new ArrayList<>();


    @Override
    public LogViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(LogViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class LogViewHolder extends RecyclerView.ViewHolder{

        public LogViewHolder(View itemView) {
            super(itemView);

        }
    }
}
