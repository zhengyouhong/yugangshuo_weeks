package com.zyh.ourydc.yugangshuo_weeks.activity;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.gson.Gson;
import com.zyh.ourydc.yugangshuo_weeks.R;
import com.zyh.ourydc.yugangshuo_weeks.bean.RatingBean;
import com.zyh.ourydc.yugangshuo_weeks.bean.RatingItemBean;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zheng on 2018/3/25.
 */

public class RatingActivity extends AppCompatActivity {

    private RecyclerView mRcv;

    private Runnable mRunnable = new Runnable() {
        @Override
        public void run() {
            if(mRatingBean != null){

            }
        }
    };
    private RatingBean mRatingBean;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        mRcv = findViewById(R.id.rcv);
        initView();

        try {
            loadRatingData();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void initView() {
        LinearLayoutManager lm = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRcv.setLayoutManager(lm);
        mRcv.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.bottom = 8;
            }
        });


    }

    private void loadRatingData() throws IOException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String path = "http://api.fixer.io/latest";
                    URL url = new URL(path);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    int respCode = conn.getResponseCode();
                    if (respCode == 200) {
                        //得到输入流
                        InputStream is = conn.getInputStream();
                        ByteArrayOutputStream baos = new ByteArrayOutputStream();
                        byte[] buffer = new byte[1024];
                        int len = 0;
                        while (-1 != (len = is.read(buffer))) {
                            baos.write(buffer, 0, len);
                            baos.flush();
                        }
                        String json = baos.toString("utf-8");
                        mRatingBean = new Gson().fromJson(json, RatingBean.class);
                        List<RatingItemBean> list =  setupData(mRatingBean);


                        runOnUiThread(mRunnable);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    private List<RatingItemBean> setupData(RatingBean ratingBean) {
        List<RatingItemBean> list = new ArrayList<>();
        Field[] fields = ratingBean.getClass().getFields();
        for (Field field : fields) {
            RatingItemBean itemBean = new RatingItemBean();
            if (field.getType().toString().equals("double")) {
                String name = field.getName().toString();
                itemBean.money = name;
                itemBean.value = getFieldValueByName(name, itemBean);
                list.add(itemBean);
            }
        }

        return list;
    }


    private double getFieldValueByName(String fieldName, Object o) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(getter, new Class[] {});
            double value = (double) method.invoke(o, new Object[] {});
            return value;
        } catch (Exception e) {
            return 0;
        }
    }


}
