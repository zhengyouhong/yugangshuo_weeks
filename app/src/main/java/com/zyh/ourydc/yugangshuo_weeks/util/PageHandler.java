package com.zyh.ourydc.yugangshuo_weeks.util;

/**
 * Created by zhengyouhong on 2018/4/23.
 */

public class PageHandler {

    private static PageHandler mInstance;

    private PageHandler(){}

    public static PageHandler get(){
        if(mInstance == null){
            mInstance = new PageHandler();
        }
        return mInstance;
    }

//    public
}
