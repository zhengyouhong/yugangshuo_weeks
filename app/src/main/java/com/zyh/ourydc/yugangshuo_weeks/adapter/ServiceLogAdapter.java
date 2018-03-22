package com.zyh.ourydc.yugangshuo_weeks.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zyh.ourydc.yugangshuo_weeks.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengyouhong on 2018/3/22.
 */

public class ServiceLogAdapter extends RecyclerView.Adapter<ServiceLogAdapter.LogViewHolder> {

    public List<String> mLogs;
    private Context mContext;

    public ServiceLogAdapter(List<String> mLogs, Context mContext) {
        this.mLogs = mLogs;
        this.mContext = mContext;
    }

    @Override
    public LogViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext)
                .inflate(R.layout.item_service_log, null, true);
        return new LogViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(LogViewHolder holder, int position) {
        String log = mLogs.get(position);
        holder.mTvLog.setText(log);
    }

    @Override
    public int getItemCount() {
        return mLogs == null ? 0 : mLogs.size();
    }

    static class LogViewHolder extends RecyclerView.ViewHolder {
        public TextView mTvLog;

        public LogViewHolder(View itemView) {
            super(itemView);
            mTvLog = itemView.findViewById(R.id.tv_log);
        }
    }
}
