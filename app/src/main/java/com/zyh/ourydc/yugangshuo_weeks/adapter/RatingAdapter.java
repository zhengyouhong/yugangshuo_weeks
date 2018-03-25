package com.zyh.ourydc.yugangshuo_weeks.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.zyh.ourydc.yugangshuo_weeks.R;
import com.zyh.ourydc.yugangshuo_weeks.bean.RatingItemBean;

import java.util.List;

/**
 * Created by zheng on 2018/3/25.
 */

public class RatingAdapter extends RecyclerView.Adapter<RatingAdapter.RatingViewHolder> {


    private List<RatingItemBean> mDatas;
    private Context mContext;


    @Override
    public RatingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RatingViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.size() ;
    }

    static class RatingViewHolder extends RecyclerView.ViewHolder{

        public  TextView mTvRating;
        public EditText mEtRating;
//        public Double mTv

        public RatingViewHolder(View itemView) {
            super(itemView);
             mTvRating = itemView.findViewById(R.id.tv_rating);
        }
    }
}
